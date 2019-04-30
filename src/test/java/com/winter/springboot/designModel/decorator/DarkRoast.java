package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:深焙咖啡
 * @Date Created in 下午3:25 2019/4/9
 **/
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast  Coffee";
    }
    @Override
    public double cost() {
        return .1;
    }
}
