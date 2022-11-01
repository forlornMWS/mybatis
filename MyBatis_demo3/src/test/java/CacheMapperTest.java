import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.CacheMapper;
import xyz.mwszksnmdys.mybatis.pojo.Emp;
import xyz.mwszksnmdys.mybatis.utils.SQLSessionUtils;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {
    @Test
    public void testFirstLevelCache(){
        SqlSession sqlSession1 = SQLSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
//        mapper1.insertEmp(new Emp(null, "abc", 23, "女", "123@yahoo.com"));
        sqlSession1.clearCache();// 手动清空一级缓存
        Emp emp2 = mapper1.getEmpById(1);
        System.out.println(emp2);
//        SqlSession sqlSession2 = SQLSessionUtils.getSqlSession();
//        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
//        Emp emp2 = mapper2.getEmpById(1);
//        System.out.println(emp2);
    }

    @Test
    public void testSecondLevelCache(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            Emp emp1 = mapper1.getEmpById(1);
            System.out.println(emp1);
            sqlSession1.close();
            SqlSession sqlSession2= sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            Emp emp2 = mapper2.getEmpById(1);
            System.out.println(emp2);
            sqlSession2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
