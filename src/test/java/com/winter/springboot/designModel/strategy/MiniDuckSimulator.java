package com.winter.springboot.designModel.strategy;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午2:48 2019/3/26
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        /*Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();*/
    }
}
