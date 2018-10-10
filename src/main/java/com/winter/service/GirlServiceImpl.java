package com.winter.service;

import com.winter.mapper.UserMapper;
import com.winter.model.User;
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
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;

    Lock lock = new ReentrantLock();
    @Override
    public User findUser(){
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public List<User> findALl() {
        return userMapper.findALl();
    }

    @Override
    public List<Map<String, Object>> findUserALl() {
        List<Map<String,Object>> list = new ArrayList<>();
        list = userMapper.findUserALl();
        return list;
    }

    @Override
    public int saveUser() {
        User u = new User();
        u.setAge(1);
        u.setCupSize("c");
        u.setCreateTime(new Date());
        u.setCurrentTimeMillis(System.currentTimeMillis());
        return userMapper.insert(u);
    }
}
