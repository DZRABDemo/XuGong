package com.xufeifan.jvm.stack;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.stack
 * @Description: 在这里测试栈的溢出
 * @Author: 徐非凡
 * @CreateDate: 2021/5/14 11:29
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class OomException {
    public static void main(String[] args) {
        new OomException().show1();
        //这个程序会发生栈区溢出异常
    }

    void show1(){
        show2();
    }

    void show2(){
        show1();
    }
}
