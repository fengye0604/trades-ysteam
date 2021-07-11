package com.yang.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @projectName:trades-ysteam
 * @see:com.yang.test
 * @author:yanggaoli
 * @createTime:2021/4/27 23:21
 * @version:1.0
 */
public class BaseTest {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;
    }
}

