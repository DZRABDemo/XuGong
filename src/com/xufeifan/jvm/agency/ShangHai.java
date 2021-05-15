package com.xufeifan.jvm.agency;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.agency
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/14 17:38
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ShangHai implements BeiJing {
    @Override
    public void sale(String brandCom) {
        System.out.println("上海经销商卖出了电脑"+brandCom);
    }
}
