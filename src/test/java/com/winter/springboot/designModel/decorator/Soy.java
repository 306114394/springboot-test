package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:调料
 * @Date Created in 上午10:07 2019/4/10
 **/
public class Soy extends Beverage {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ",Soy";
    }
    @Override
    public double cost() {
        return .1;
    }
}
