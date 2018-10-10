package com.winter.springboot;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午5:43 2018/10/9
 **/
public class ThreadBreak extends Thread{

    public ThreadBreak(String className){
        super(className);
    }
    @Override
    public void run() {
        System.out.println(getName()+"线程执行了。。。");
    }

    public static void main(String[] args) {
        ThreadBreak threadBreak = new ThreadBreak("first-thread");
        ThreadBreak threadBreak1 = new ThreadBreak("first-thread");
        threadBreak.run();
        threadBreak1.run();

    }
}
