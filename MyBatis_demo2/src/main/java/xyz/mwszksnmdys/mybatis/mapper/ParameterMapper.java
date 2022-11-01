package xyz.mwszksnmdys.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.mwszksnmdys.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();

    User getUserByUsername(String username);

    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    int insertUser(User user);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
