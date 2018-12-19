package com.winter.controller;

import com.winter.service.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午4:54 2018/11/23
 **/
@RestController
public class sendController {
    @Autowired
    private WebSocket webSocket;

    @RequestMapping(value = "/sendMessage",method = RequestMethod.GET)
    public void sendMessage(){
         webSocket.sendMessage("11111111");
        //return user;
    }
}
