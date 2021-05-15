package com.xufeifan.jvm.keywords;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.keywords
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 10:04
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class TestBreak {
    public static void main(String[] args) {
        int a =1;
        switch (a){
            case 1:
                System.out.println("这里1的层次");
            case 2:
                System.out.println("这里是2的层次");
            case 3:
                System.out.println("这是3的层次");
                break;
                default:
                    System.out.println("这里进行了默认");
                    break;
        }
        //这里需要注意的是break造成的击穿
        //准确的来说   这里是本来需要跳出 的时候 没有进行跳出
    }
}
