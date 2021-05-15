package com.xufeifan.jvm.classload;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.classload
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/13 8:54
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ClassLoadOne {
    public static void main(String[] args) {
        /*
        子类的字节码对象加载  会默认首先找父类的加载器去加载字节码对象
        在什么情况下  父类的加载无法完成加载？

        每个加载器都有自己的管辖范围

        这个方式有什么优点？

        为什么要有三种类的加载器？
        为了执行不同的功能

        这种方式可以避免类的重复加载 防止核心api被加载了



         */



        //1.获得系统类加载器的第一种方式
        ClassLoader systemClassLoader =
                ClassLoader.getSystemClassLoader();

        ClassLoader classLoader = new ClassLoadOne().getClass().getClassLoader();
        System.out.println(classLoader);


    }
}
