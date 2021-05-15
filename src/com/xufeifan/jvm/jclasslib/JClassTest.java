package com.xufeifan.jvm.jclasslib;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.jclasslib
 * @Description: 在这个类里面  我们可以对jclass进行基础的研究
 * @Author: 徐非凡
 * @CreateDate: 2021/5/14 11:50
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class JClassTest extends Person{
    private String name;
    private String stuNO;

    public static void main(String[] args) {
        int  a=1;
        //首先是general information
        //1. minor version 这代表的次版本号  用于升级的区别
        //2.major version  这代表的是主版本号  用于产品之间的区别
        //3.constant pool count 这代表的是常量池
        //4 access flags 这代表的是访问标识
        //5.this class 这里说明了这类的全限定名
        //6.super class 这里书名了这个类的父类名
        //7.field count 这里是指这个类有几个属性
        //8.interface count 这是说这个类实现类几个接口
        //method count    attribute count

        //ConStant Pool 这是常量池的信息
        //interface fields methods attribute

    }
}
