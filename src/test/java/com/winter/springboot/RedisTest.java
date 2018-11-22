package com.winter.springboot;

import com.winter.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 上午11:20 2018/10/10
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void RedisGet(){
        redisUtil.set("ww","2");
        String ke = (String)redisUtil.get("ww");
        System.out.println("log="+ke);
    }
}
