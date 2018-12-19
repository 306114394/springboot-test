package com.winter.service.impl;

import com.winter.mapper.GirlMapper;
import com.winter.model.User;
import com.winter.proxyTest.Girl;
import com.winter.service.GirlService;
import com.winter.util.RedisUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午12:25 2018/7/22
 **/
@Service
public class GirlServiceImpl implements GirlService {
    protected Logger log = LogManager.getLogger(this.getClass());

    AtomicInteger counter =  new AtomicInteger(0);
    @Autowired
    private GirlMapper girlMapper;

    @Autowired
    private RedisUtil redisUtil;

    Lock lock = new ReentrantLock();
    @Override
    public Girl findUser(){
        return girlMapper.selectByPrimaryKey(1L);
    }

    @Override
    public List<Girl> findALl() {
        //return girlMapper.findALl();
        return null;
    }

    /** 
     * @param  []
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     * @describe test
     * @author Dong Xifu
     * @date 2018/12/19 下午7:03
     */
    @Override
    public List<Map<String, Object>> findUserALl() {
        List<Map<String,Object>> list = new ArrayList<>();
        //list = girlMapper.findUserALl();
        return list;
    }

    @Override
    public int saveUser() {
        //Girl girl = new Girl();
       /* girl.setAge(1);
        girl.setCupSize("c");*/

        return girlMapper.insert(null);
    }
}
