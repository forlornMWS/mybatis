package xyz.mwszksnmdys.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.EmpMapper;
import xyz.mwszksnmdys.mybatis.pojo.Emp;
import xyz.mwszksnmdys.mybatis.pojo.EmpExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MBGTest {

    @Test
    public void testMBG(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            // 查询所有数据
//            List<Emp> list = mapper.selectByExample(null);
//            list.forEach(System.out::println);
            // 根据条件查询
//            EmpExample example = new EmpExample();
//            example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
//            example.or().andDidIsNotNull();
//            List<Emp> list = mapper.selectByExample(example);
//            list.forEach(System.out::println);
            mapper.updateByPrimaryKeySelective(new Emp(1, "admin", 22, null, "345@qq.com", 3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
