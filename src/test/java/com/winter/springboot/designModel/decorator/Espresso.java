package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:浓缩咖啡
 * @Date Created in 下午1:17 2019/4/9
 **/
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
