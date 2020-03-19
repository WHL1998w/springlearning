package com.soft1851.spring.orm.app;

import com.soft1851.spring.orm.config.JdbcConfig;
import com.soft1851.spring.orm.dao.ForumDao;
import com.soft1851.spring.orm.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @ClassName JDBCConfigTest
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/19
 **/
public class JdbcConfigTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        //手动开启扫包
        ctx.scan("com.soft1851.spring.orm.config");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
        ForumDao forumDao = (ForumDao) ctx.getBean("froumDao");
        List<Forum> forumList = forumDao.selectAll();
        System.out.println(forumList);
    }
}