package com.soft1851.spring.ioc.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans.xml"})
public class PhoneTest {
    @Test
    public void testToString() {
        Phone phone = new Phone();
        phone.setBrand("iphone 11");
        phone.setPrice(8888.8);
        System.out.println(phone);
    }
}