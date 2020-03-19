package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName StudentConfig
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/19
 **/
@Configuration
public class StudentConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}