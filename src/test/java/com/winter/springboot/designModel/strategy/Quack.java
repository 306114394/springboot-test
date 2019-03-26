package com.winter.springboot.designModel.strategy;

import com.winter.springboot.designModel.strategy.interfaces.QuackBehavior;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午1:45 2019/3/26
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
