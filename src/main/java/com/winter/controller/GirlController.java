package com.winter.controller;

import com.winter.proxyTest.Girl;
import com.winter.service.GirlService;
import com.winter.model.User;
import com.winter.service.WebSocket;
import com.winter.util.RedisUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午12:07 2018/7/22
 **/
@Controller
public class GirlController {
    protected Logger log = LogManager.getLogger(this.getClass());


    @Autowired
    private GirlService girlService;

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private WebSocket webSocket;


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Girl findGirl(){
        Girl girl =  girlService.findUser();
        return girl;
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String Query(){
        return "index";
    }

    @GetMapping("/list")
    public ModelAndView list(Map<String, Object> map) {
        return new ModelAndView("order/list", map);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Girl> findAll(){
        List<Girl> list =  girlService.findALl();
        redisUtil.lSet("list",list);
        redisUtil.get("list");
        return  list;
    }

    @RequestMapping(value = "/findUserALl",method = RequestMethod.GET)
    public List<Map<String,Object>> findUserALl(){
        List<Map<String,Object>> list =  girlService.findUserALl();
        redisUtil.set("ww",list);
        Object ob = redisUtil.get("ww");
        log.info("ob="+ob);
        return  list;
    }


}
