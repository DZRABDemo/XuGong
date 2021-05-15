package com.xufeifan.jvm.InnerClass;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.InnerClass
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/13 9:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建对象

        //1  创建普通内部类的对象
        BootClass bootClass = new BootClass();
        BootClass.CommonInnerClass commonInnerClass =
                bootClass.new CommonInnerClass();

        //2.创建静态内部类的对象
        BootClass.StaticInnerClass staticInnerClass =
                new BootClass.StaticInnerClass();
    }
}
