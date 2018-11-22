package com.winter.springboot;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午2:18 2018/10/10
 **/
public class Demo4 implements Callable<Integer>{

    public static void main(String[] args) throws Exception {
        Demo4 demo4 = new Demo4();
        FutureTask<Integer> task = new FutureTask<>(demo4);
        Thread t = new Thread(task);
        t.start();

        Integer integer =  task.get();
        System.out.println(integer);
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("运行中");
        Thread.sleep(3000);
        return 1;
    }


}
