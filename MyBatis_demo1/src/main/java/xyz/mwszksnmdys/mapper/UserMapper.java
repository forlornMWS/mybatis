package xyz.mwszksnmdys.mapper;

import xyz.mwszksnmdys.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUsers();
}
