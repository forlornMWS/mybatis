package xyz.mwszksnmdys.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import xyz.mwszksnmdys.mybatis.mapper.EmpMapper;
import xyz.mwszksnmdys.mybatis.pojo.Emp;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {

    @Test
    public void testPageHelper(){

        /**
         * limit index, pageSize
         * index: 当前页的起始索引（从0开始）
         * pageSize: 每页显示的条数
         * pageNum: 当前页的页码
         * index = (pageNum - 1) * pageSize
         *
         * 使用MyBatis的分页插件实现分页功能：
         * 1. 查询之前开启分页
         * PageHelper.startPage(int pageNum, int pageSize);
         * 2. 查询之后获取分页相关信息
         * PageInfo<T> page =  new PageInfo<>()(list, num);
         * list表示分页数据
         * num表示当前当行分页的数量
         */
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//            Page<Object> page = PageHelper.startPage(2, 4);
            PageHelper.startPage(2, 4);
            List<Emp> list = mapper.selectByExample(null);
            list.forEach(System.out::println);
            PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
            System.out.println(pageInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
