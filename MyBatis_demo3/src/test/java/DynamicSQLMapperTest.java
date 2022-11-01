import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.DynamicSQLMapper;
import xyz.mwszksnmdys.mybatis.pojo.Emp;
import xyz.mwszksnmdys.mybatis.utils.SQLSessionUtils;

import java.util.Arrays;
import java.util.List;

public class DynamicSQLMapperTest {
    
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "", null, "", null));
        System.out.println(list);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "张三", 23, "男", "1234@qq.com"));
        System.out.println(list);
    }

    @Test
    public void testBatchDeleteByArray(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.batchDeleteByArray(new Integer[]{6, 7, 8, 9});
        System.out.println(result);
    }

    @Test
    public void testBatchInsertByArray(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "123@qq.com");
        Emp emp2 = new Emp(null, "a2", 23, "男", "123@qq.com");
        Emp emp3 = new Emp(null, "a3", 23, "男", "123@qq.com");
        Emp emp4 = new Emp(null, "a4", 23, "男", "123@qq.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);
        int result = mapper.batchInsertByArray(emps);
        System.out.println(result);
    }
}
