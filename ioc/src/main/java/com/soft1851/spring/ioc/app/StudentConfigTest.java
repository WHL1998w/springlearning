package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.config.StudentConfig;
import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @ClassName StudentConfigTest
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/19
 **/
public class StudentConfigTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
        //手动开启扫包
        ctx.scan("com.soft1851.spring.ioc.config");
        //ctx.refresh();
        Student student = (Student) ctx.getBean("student");
        student.setName("Tom");
        student.setAge(20);
        System.out.println(student);
    }
}