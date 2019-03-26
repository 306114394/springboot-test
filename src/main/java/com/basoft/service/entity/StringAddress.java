package com.basoft.service.entity;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午5:31 2019/3/22
 **/
public class StringAddress {
    private String s;

    public StringAddress(String s){
        this.s = s;
    }

    public String toString(){
        return super.toString()+"  " +s;
    }


}
