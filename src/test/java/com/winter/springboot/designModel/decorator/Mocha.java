package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午2:45 2019/4/9
 **/
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .1 + beverage.cost();
    }
}
