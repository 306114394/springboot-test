package com.winter.service;


import com.basoft.service.entity.Girl;

import java.util.List;
import java.util.Map;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午12:08 2018/7/22
 **/

public interface GirlService {

    public Girl findUser();

    public List<Girl> findALl();

    public List<Map<String,Object>> findUserALl();

    public int saveUser();

}
