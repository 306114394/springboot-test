package com.winter.springboot.designModel.strategy;

import com.winter.springboot.designModel.strategy.interfaces.QuackBehavior;

/**
 * @Author:DongXifu
 * @Description: 吱吱的鸭子
 * @Date Created in 下午1:46 2019/3/26
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}