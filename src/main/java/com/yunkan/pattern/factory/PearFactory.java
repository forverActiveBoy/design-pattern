package com.yunkan.pattern.factory;

/**
 * @author foreverActiveBoy
 * @date 2020/12/26 16:14
 * @apiNote 梨工厂
 */
public class PearFactory implements FruitFactory {

    /**
     * 生产梨
     * @return
     */
    @Override
    public Fruit getInstance() {
        System.out.println("生产梨");
        return new Pear();
    }
}
