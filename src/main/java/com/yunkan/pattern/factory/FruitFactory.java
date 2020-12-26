package com.yunkan.pattern.factory;

/**
 * @author foreverActiveBoy
 * @date 2020/12/26 16:08
 * @apiNote 水果工厂
 */
public interface FruitFactory {
    /**
     * 生产水果接口
     * @return
     */
    Fruit getInstance();
}
