package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/17
 **/
@Configuration
public class AppConfig {
    @Bean
    public Phone phone(){
        return new Phone();
    }
}