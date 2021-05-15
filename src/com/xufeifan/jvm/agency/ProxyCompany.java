package com.xufeifan.jvm.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: JVMDemoStart
 * @Package: com.xufeifan.jvm.agency
 * @Description: java类作用描述
 * @Author: 徐非凡
 * @CreateDate: 2021/5/14 17:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ProxyCompany implements InvocationHandler {
    private Object target;

    public ProxyCompany() {
    }

    public ProxyCompany(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Security.mySafe();
        //通过反射调用原类的方法
        //对象的地址  方法的名字  以及方法的参数
        Object result = method.invoke(target, args);
        Security.mySafe();
        return result;
    }
}
