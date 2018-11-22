package com.winter.proxyTest;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午1:40 2018/11/22
 **/
public class TuHao {
    private float length;

    public TuHao(float length){
        this.length=length;
    }

    public void dating(Girl g){
        g.dating(length);
    }
}
