import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.DeptMapper;
import xyz.mwszksnmdys.mybatis.mapper.EmpMapper;
import xyz.mwszksnmdys.mybatis.pojo.Dept;
import xyz.mwszksnmdys.mybatis.pojo.Emp;
import xyz.mwszksnmdys.mybatis.utils.SQLSessionUtils;

import java.util.List;

public class ResultMapTest {
    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmp();
        list.forEach(System.out::println);
    }
    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        System.out.println(mapper.getEmpAndDept(1));
    }

    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(3);
        System.out.println(emp.getEmpName());
    }

    @Test
    public void testGetDeptAndEmp(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        System.out.println(dept);
    }
    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession = SQLSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept.getDeptName());
    }
}
