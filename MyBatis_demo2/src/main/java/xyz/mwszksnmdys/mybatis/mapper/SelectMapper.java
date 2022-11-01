package xyz.mwszksnmdys.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    // 根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getUserCount();

    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

//    List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
