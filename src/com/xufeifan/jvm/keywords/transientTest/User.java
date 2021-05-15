package com.xufeifan.jvm.keywords.transientTest;

import java.io.Serializable;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.keywords.transientTest
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 10:20
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class User implements Serializable {
    private String name;
    private int age;
    //private transient int score;
    private int score;

    public User() {
    }

    public User(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
