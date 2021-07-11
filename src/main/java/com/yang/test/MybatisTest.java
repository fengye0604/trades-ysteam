package com.yang.test;

import com.github.pagehelper.PageHelper;
import com.yang.bean.User;
import com.yang.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description:
 * @projectName:trades-ysteam
 * @see:com.yang.test
 * @author:yanggaoli
 * @createTime:2021/4/27 14:03
 * @version:1.0
 */
public class MybatisTest extends BaseTest{


    public static void main(String[] args) throws Exception {
//        testTraditionalWork();
        testMapperWork();
    }

    /**
     * 传统的工作模式
     * @throws IOException
     */
    public static void testTraditionalWork() throws IOException {

        SqlSession sqlSession = getSqlSession();
        String name = "wangxiaoxiao";
        int ni = 19;
//        User user = sqlSession.selectOne("com.yang.dao.UserMapper.selectByPrimaryKey",ni);
//        User user = sqlSession.select("com.yang.dao.selectByPrimaryKey",ni);
        List<User> userList = sqlSession.selectList("com.yang.dao.UserMapper.getUserByName",name);
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }

    /**
     * Mapper的工作模式
     * @throws IOException
     */
    public static void testMapperWork() throws IOException {

        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        MappedStatement ms ;
        BoundSql boundSql ;


        String name = "wangxiaoxiao";
        List<User> userList = null ;//mapper.getUserByName(name);
        PageHelper.startPage(2,3);
        userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }


}
