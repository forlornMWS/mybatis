package xyz.mwszksnmdys.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.ParameterMapper;
import xyz.mwszksnmdys.mybatis.pojo.User;
import xyz.mwszksnmdys.mybatis.utils.SqlSessionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterMapperTest {
    /**
     * MyBatis获取参数值的两种方式${}和#{} <br/>
     * ${}本质是字符串拼接 <br/>
     * #{}本质是占位符赋值 <br/>
     * MyBatis获取参数值的各种情况: <br/>
     * 1. mapper接口的参数为单个的字面量类型 <br/>
     *   可以通过${}和#{}以任意的名称获取参数值，但需注意${}的单引号问题，因其实质为字符串拼接 <br/>
     * 2. mapper接口方法的参数为多个时<br/>
     *   MyBatis会将这些参数放在一个Map集合中，以两种方式进行存储 <br/>
     *     a> 以arg0, arg1,...为键，参数为值<br/>
     *     b> 以param1, param2,...为键，参数为值 <br/>
     *   因此只需要通过#{}和${}以键的方式访问值即可，仍需注意${}访问时添加单引号 <br/>
     * 3. 若mapper接口方法的参数有多个的时候，可以手动将这些参数放在一个Map中存储
     *   只需要通过#{}和${}以键的方式访问值即可<br/>
     * 4. 若mapper接口方法的参数是实体类类型的参数<br/>
     *   只需要通过#{}和${}以属性的方式访问值即可<br/>
     * 5. 使用@param注解命名参数
     *    MyBatis会将这些参数放在一个Map集合中，以两种方式进行存储 <br/>
     *    a> 以@param注解的值为键，以参数为值
     *    b> 以param1, param2, ...为键，以参数为值。
     */

    @Test
    public void getUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("李四");
        System.out.println(user);
    }

    @Test
    public void checkLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("李四", "lisi");
        System.out.println(user);
    }
    @Test
    public void checkLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "李四");
        map.put("password", "lisi");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }
    @Test
    public void checkLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("王五", "123");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int result = mapper.insertUser(new User(null, "王五", "123", 22, "男", "1234@yahoo.com"));
        System.out.println(result);
    }

    @Test
    public void getAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.getAllUser();
        users.forEach(System.out::println);
    }

}
