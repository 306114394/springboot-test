package com.winter.springboot;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午5:03 2018/10/9
 **/
public class ThreadTest implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("自定线程运行了。。。");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        while (true){
            System.out.println("主线程运行了。。。");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
