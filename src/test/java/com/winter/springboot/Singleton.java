package com.winter.springboot;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午5:24 2019/3/28
 **/
public class Singleton {
    private final static Singleton ss = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return ss;
    }
}
