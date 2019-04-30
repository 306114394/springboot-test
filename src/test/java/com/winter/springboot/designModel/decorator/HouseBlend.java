package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午2:26 2019/4/9
 **/
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .1;
    }
}
