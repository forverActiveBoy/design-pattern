package com.yunkan.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author foreverActiveBoy
 * @date 2020/12/7 19:47
 * @apiNote jdk动态代理类
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    /**
     * 构造方法
     * @param object
     */
    public DynamicProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强");
        Object invoke = method.invoke(object, args);
        System.out.println("后置增强");
        return invoke;
    }
}
