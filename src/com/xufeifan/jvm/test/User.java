package com.xufeifan.jvm.test;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.test
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 9:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
