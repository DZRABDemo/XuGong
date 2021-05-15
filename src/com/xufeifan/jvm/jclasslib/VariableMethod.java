package com.xufeifan.jvm.jclasslib;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.jclasslib
 * @Description: 在这里 研究局部变量表和操作数栈
 * @Author: 徐非凡
 * @CreateDate: 2021/5/14 16:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class VariableMethod {
    public static void main(String[] args) {
        new VariableMethod().show();
    }

    public void show(){
        int i=10;
        int k=show1();
        int j=i+k;
    }

    public int show1(){
        int i=10;
        int k=20;
        int j=i+k;
        return j;
    }

}