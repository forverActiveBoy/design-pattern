package com.yunkan.pattern.factory;

/**
 * @author foreverActiveBoy
 * @date 2020/12/26 16:11
 * @apiNote 苹果工厂
 */
public class AppleFactory implements FruitFactory {

    /**
     * 生产苹果
     * @return
     */
    @Override
    public Fruit getInstance() {
        System.out.println("生产苹果");
        return new Apple();
    }
}
