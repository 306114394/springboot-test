package com.winter.springboot.designModel.strategy;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午2:00 2019/3/26
 **/
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println(" I am a real Mallard duck");
    }

}
