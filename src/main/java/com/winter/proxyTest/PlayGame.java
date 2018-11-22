package com.winter.proxyTest;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午1:44 2018/11/22
 **/
public class PlayGame {
    public static void main(String[] args) {
        TuHao th = new TuHao(2);
        Girl tc = new TeacherCang();
        Tony tony = new Tony();
        tony.setGirl(tc);
        th.dating(tony);
    }
}
