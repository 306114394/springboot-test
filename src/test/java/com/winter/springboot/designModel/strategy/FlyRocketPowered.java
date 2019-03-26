package com.winter.springboot.designModel.strategy;

import com.winter.springboot.designModel.strategy.interfaces.FlyBehavior;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午3:57 2019/3/26
 **/
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
