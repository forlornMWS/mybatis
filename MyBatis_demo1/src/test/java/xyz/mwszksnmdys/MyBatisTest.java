package xyz.mwszksnmdys;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import xyz.mwszksnmdys.mapper.UserMapper;
import xyz.mwszksnmdys.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testMybatis() throws IOException {
        // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);  // 使用了代理模式
        int result = mapper.insertUser();
        // 提交事务
//        sqlSession.commit();
        System.out.println("result: " + result);
    }

    @Test
    public void testCRUD() throws IOException{
        // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.updateUser();
//        mapper.deleteUser();
//        User user = mapper.getUserById();
//        System.out.println(user);
        List<User> users = mapper.getAllUsers();
        users.forEach(System.out::println);
    }
}
