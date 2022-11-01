package xyz.mwszksnmdys.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.mybatis.pojo.Emp;

public interface CacheMapper {
    // 缓存只对查询有效
    Emp getEmpById(@Param("id") Integer id);

    void insertEmp(Emp emp);

}
