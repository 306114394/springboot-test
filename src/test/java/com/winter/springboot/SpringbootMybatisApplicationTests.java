package com.winter.springboot;

import com.winter.service.GirlService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	protected Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private GirlService girlService;

	private static final String TICKET_SEQ = "Z204";

	private static final int TreadNum = 2000;

	private CountDownLatch cdl = new CountDownLatch(TreadNum);

	long time=0L;

	@Before
	public void run() {
		System.out.println("开始测试");
		time = System.currentTimeMillis();
		log.info("log="+time);
	}

	@After
	public void end(){
		System.out.println("结束测试,测试时长:"+(System.currentTimeMillis()-time));
	}

	@Test
	public void benchmark()throws Exception{
		Thread [] threads = new Thread[TreadNum];
		for(int i=0;i<TreadNum;i++){
			Thread thread = new Thread(new QueryRequest());
			threads[i] = thread;
			thread.start();
			cdl.countDown();
		}
		for (Thread thread : threads) {
			thread.join();
		}
	}


	public class QueryRequest implements Runnable{

		@Override
		public void run() {
			try {
				cdl.await();

				//girlService.saveUser();
			}catch (InterruptedException e){
				e.getStackTrace();
			}
			List<Map<String,Object>> list =  girlService.findUserALl();
		}
	}

}
