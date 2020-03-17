package com.soft1851.spring.ioc.entity;

/**
 * @ClassName Student
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/12
 **/
public class Student {
    private String name;
    private Phone phone;

    public Student() {
    }

    public Student(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}