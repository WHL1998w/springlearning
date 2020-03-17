package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName PhoneTest
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/12
 **/
public class PhoneTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Phone phone = (Phone) ac.getBean("phone");
        System.out.println(phone);
    }
}