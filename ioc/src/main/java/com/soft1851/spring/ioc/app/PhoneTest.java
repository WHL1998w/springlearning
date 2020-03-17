package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.entity.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * @ClassName PhoneTest
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/12
 **/
public class PhoneTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //手动开启扫包
        ctx.scan("com.soft1851.spring.ioc.config");
        //ctx.refresh();
        Phone phone = (Phone) ctx.getBean("phone");
        phone.setBrand("iphone 11");
        phone.setPrice(88.8);
        System.out.println(phone);
    }
}