package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName SortTest
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/10
 **/
public class SortTest {
    public static void main(String[] args) {
        //读取beans的配置文件，得到上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //取出相应的bean
        Sort sort = (Sort) ac.getBean("sort");
        int[] a = {2,5,1,15,20,0,3};
        sort.insertSort(a);
    }
}