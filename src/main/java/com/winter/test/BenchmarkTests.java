//package com.winter.test;
//
//import com.winter.service.GirlService;
//import javafx.application.Application;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.CountDownLatch;
//
///**
// * @Author:DongXifu
// * @Description:
// * @Date Created in 上午11:52 2018/10/8
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.yml")
//
//
//public class BenchmarkTests {
//
//    protected Logger log = LogManager.getLogger(this.getClass());
//
//    @Autowired
//    private GirlService girlService;
//
//    private static final String TICKET_SEQ = "Z204";
//
//    private static final int TreadNum = 1;
//
//    private CountDownLatch cdl = new CountDownLatch(TreadNum);
//
//    long time=0L;
//
//    @Before
//    public void run() {
//        System.out.println("开始测试");
//        time = System.currentTimeMillis();
//        log.info("log="+time);
//    }
//
//    @After
//    public void end(){
//        System.out.println("结束测试,测试时长:"+(System.currentTimeMillis()-time));
//    }
//
//    @Test
//    public void benchmark()throws Exception{
//        Thread [] threads = new Thread[TreadNum];
//        for(int i=0;i<TreadNum;i++){
//            Thread thread = new Thread(new QueryRequest());
//            threads[i] = thread;
//            thread.start();
//            cdl.countDown();
//        }
//        for (Thread thread : threads) {
//            thread.join();
//        }
//    }
//
//    private class QueryRequest implements Runnable{
//
//        @Override
//        public void run() {
//            try {
//                cdl.await();
//            }catch (InterruptedException e){
//                e.getStackTrace();
//            }
//            List<Map<String,Object>> list =  girlService.findUserALl();
//        }
//    }
//}
