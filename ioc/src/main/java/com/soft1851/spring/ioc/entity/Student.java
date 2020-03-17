package com.soft1851.spring.ioc.entity;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/12
 **/
public class Student {
    private String name;
    private Integer age;
    private List<Phone> phones;


    public Student() {
    }

    public Student(String name, Integer age, List<Phone> phones) {
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phones=" + phones +
                '}';
    }
}