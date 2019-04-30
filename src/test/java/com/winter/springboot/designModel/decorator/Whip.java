package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:调料 奶泡
 * @Date Created in 下午5:30 2019/4/9
 **/
public class Whip extends Beverage{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ",Whip";
    }
    @Override
    public double cost() {

        return 0.2+ beverage.cost();
    }
}
