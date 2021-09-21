package com.rem.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {
    //SqlSessionFactory 会话工厂对象
    private static SqlSessionFactory factory;
    //类加载到JVM中就立马执行static代码块,并且只会执行一次
    static {
//资源文件
        String resource = "mybatis.xml";
//try(){}catch(Exception e){} try的圆括号内部能够自动释放/关闭资源
        try(InputStream inputStream = Resources.getResourceAsStream(resource)) {
//创建SqlSessionFactory 对象
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 创建SqlSession对象
     * @return SqlSession对
     */
    public static SqlSession openSession() {
//创建Session对象
        SqlSession session = factory.openSession();
        return session;
    }
}
