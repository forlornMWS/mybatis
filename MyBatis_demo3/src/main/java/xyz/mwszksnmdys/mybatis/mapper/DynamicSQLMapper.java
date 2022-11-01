package xyz.mwszksnmdys.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    // 多条件查询
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    // 通过数组实现批量删除
    int batchDeleteByArray(@Param("eids") Integer[] edis);

    // 通过list集合实现批量添加
    int batchInsertByArray(@Param("emps") List<Emp> emps);

}
