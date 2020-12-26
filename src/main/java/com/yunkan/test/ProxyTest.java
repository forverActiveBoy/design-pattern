package com.yunkan.test;

import com.yunkan.pattern.proxy.DynamicProxy;
import com.yunkan.pattern.proxy.User;
import com.yunkan.pattern.proxy.UserImpl;

import java.lang.reflect.Proxy;

/**
 * @author foreverActiveBoy
 * @date 2020/12/7 20:00
 * @apiNote
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        DynamicProxy proxy = new DynamicProxy(user);
        User o = (User)Proxy.newProxyInstance(User.class.getClassLoader(), new Class[]{User.class}, proxy);
        o.eat();
    }
}
