package com.winter.proxyTest;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午1:33 2018/11/22
 **/
public class TeacherCang implements Girl {
    @Override
    public boolean dating(float length) {
        if(length>=1.7){
            System.out.println("身高可以，可以约");
            return true;
        }
        System.out.println("身高不可以，不可以约");
        return false;
    }
}
