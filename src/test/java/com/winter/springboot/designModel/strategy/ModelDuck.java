package com.winter.springboot.designModel.strategy;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午3:52 2019/3/26
 **/
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
