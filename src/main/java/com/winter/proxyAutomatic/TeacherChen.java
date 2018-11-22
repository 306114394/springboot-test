package com.winter.proxyAutomatic;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午5:19 2018/11/22
 **/
public class TeacherChen implements Boy{

    @Override
    public boolean dating(char cup) {
        if(cup >= 'E'){
            System.out.println("这个女老板品德正好，可以约！");
            return  true;
        }
        System.out.println("这个女老板品德不行，不可以约！");
        return false;
    }

    @Override
    public void show() {
        System.out.println("开始进入拍摄模式。。。。。。。。");

    }
}
