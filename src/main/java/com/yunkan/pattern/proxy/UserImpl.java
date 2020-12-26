package com.yunkan.pattern.proxy;

/**
 * @author foreverActiveBoy
 * @date 2020/12/7 19:58
 * @apiNote
 */
public class UserImpl implements User {

    @Override
    public void eat() {
        System.out.println("干饭！");
    }
}
