package com.winter.service;

import com.winter.model.User;

import java.util.List;
import java.util.Map;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午12:08 2018/7/22
 **/

public interface GirlService {

    public User findUser();

    public List<User> findALl();

    public List<Map<String,Object>> findUserALl();

    public int saveUser();

}
