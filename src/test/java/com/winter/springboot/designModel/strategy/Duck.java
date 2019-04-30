package com.winter.springboot.designModel.strategy;

import com.winter.springboot.designModel.strategy.interfaces.FlyBehavior;
import com.winter.springboot.designModel.strategy.interfaces.QuackBehavior;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午1:53 2019/3/26
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }
    public abstract void display();

    public void  performFly(){
        flyBehavior.fly();
    }

    public void  performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("ALL ducks float,even decoys");
    }

}
