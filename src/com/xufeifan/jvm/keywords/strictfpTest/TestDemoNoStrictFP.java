package com.xufeifan.jvm.keywords.strictfpTest;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.keywords.strictfpTest
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/12 10:34
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class TestDemoNoStrictFP {
    public static void main(String[] args) {
        float f = 0.12365f;
        double d = 0.03496421d;
        double sum = f + d;
        System.out.println(sum);
    }
}
