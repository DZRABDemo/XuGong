package com.xufeifan.jvm.keywords;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.keywords
 * @Description: 这里 对两个数据类型进行基础的研究
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 10:36
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class FloatAndDouble {
    public static void main(String[] args) {
        new FloatAndDouble().test1();
        //运行结果 这连个数据是不同的
        //为什么会出现这样的现象


    }

     void test1(){
        float a=1.0f-0.9f;
        float b=0.9f-0.8f;
         System.out.println(a);
         System.out.println(b);
        if(a==b){
            System.out.println("这两个数据是相同的");
        }else{
            System.out.println("这连个数据是不同的");
        }
     }
}
