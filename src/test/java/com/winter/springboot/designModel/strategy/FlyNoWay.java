package com.winter.springboot.designModel.strategy;

import com.winter.springboot.designModel.strategy.interfaces.FlyBehavior;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午1:45 2019/3/26
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
