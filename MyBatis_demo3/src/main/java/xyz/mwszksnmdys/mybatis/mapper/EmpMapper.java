package xyz.mwszksnmdys.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    // 查询所有员工信息
    List<Emp> getAllEmp();

    // 查询员工及其对应的部门信息
    Emp getEmpAndDept(@Param("eid") Integer id);

    // 通过分步查询，查询员工及其对应的部门信息，第一步查询员工信息
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    // 通过分布查询部门及部门中所有的员工信息
    // 第二步：根据did查询员工信息
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
