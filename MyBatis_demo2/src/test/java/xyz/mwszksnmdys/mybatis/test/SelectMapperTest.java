package xyz.mwszksnmdys.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.SelectMapper;
import xyz.mwszksnmdys.mybatis.pojo.User;
import xyz.mwszksnmdys.mybatis.utils.SqlSessionUtils;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {
    /**
     * Mybatis的各种查询功能<br/>
     * 1. 若查询出的数据只有一条<br/>
     *      a> 可以通过实体对象接收<br/>
     *      b> 可以通过list集合接收<br/>
     *      c> 可以通过map集合接收<br/>
     * 2, 若查询出的数据有多条<br/>
     *      a> 可以通过实体类类型的list集合接收<br/>
     *      b> 可以通过map类型的list集合接收<br/>
     *      c> 可以在mapper接口的方法上添加@MapKey注解，此时就可以将每条数据转换的map集合作为值，以某个字段(注解的value)作为键<br/>
     */

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(1));
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetUserCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserCount());
    }


    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(1);
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUserToMap());
    }


}
