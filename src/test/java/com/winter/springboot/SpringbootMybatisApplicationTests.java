package com.winter.springboot;

import com.basoft.service.entity.Girl;
import com.winter.enumerate.BusinessTypeEnum;
import com.winter.service.GirlService;
import com.winter.service.base.IdService;
import com.winter.util.UidGenerator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.CountDownLatch;

/**
 * 高并发测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
	protected Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private GirlService girlService;
	@Autowired
	private IdService idService;

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
		System.out.println("结束测试,测试时长:"+(System.currentTimeMillis()-time)/60+"秒");
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


			}catch (InterruptedException e){
				e.getStackTrace();
			}
			Girl girl = new Girl();
			Random random = new Random();
			int rm = random.nextInt(1000000000);
			Long id = idService.generateGirl()+rm+1553225734076L;

			girl.setId(id);
			girl.setAge(18);
			girl.setCup("c");
			girl.setName("小红");
			girl.setTimestamp(System.currentTimeMillis());

			synchronized(this){
				for (int i=0;i<1000;i++) {
					int result =  girlService.saveGirl(girl);
					System.out.println(id+"--------"+ System.currentTimeMillis()+"——————————"+rm);
				}
			}
			//List<Girl> list =  girlService.findUserALl();
		}
	}

}
