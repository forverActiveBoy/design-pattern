package com.yunkan.test;

import com.yunkan.pattern.factory.AppleFactory;
import com.yunkan.pattern.factory.Fruit;
import com.yunkan.pattern.factory.FruitFactory;
import com.yunkan.pattern.factory.PearFactory;

/**
 * @author foreverActiveBoy
 * @date 2020/12/26 16:15
 * @apiNote
 */
public class FactoryTest {
    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getInstance();
        FruitFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.getInstance();
    }
}
