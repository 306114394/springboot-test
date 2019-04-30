package com.winter.springboot.designModel.decorator;

/**
 * @Author:DongXifu
 * @Description:装饰者模式
 * @Date Created in 上午11:28 2019/4/9
 **/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
