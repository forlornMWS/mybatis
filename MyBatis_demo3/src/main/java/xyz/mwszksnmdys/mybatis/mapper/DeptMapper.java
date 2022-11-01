package xyz.mwszksnmdys.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.mybatis.pojo.Dept;

public interface DeptMapper {
    // 通过分步查询，查询员工及其对应的部门信息，第二步：通过did查询员工对应的部门
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    // 获取部门及部门中所有员工的信息
    Dept getDeptAndEmp(@Param("did") Integer did);

    // 通过分布查询部门及部门中所有员工信息
    // 第一步：查询部门信息
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
