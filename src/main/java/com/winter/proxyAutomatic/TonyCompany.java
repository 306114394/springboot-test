package com.winter.proxyAutomatic;

import java.lang.reflect.Proxy;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午4:56 2018/11/22
 **/
public class TonyCompany {
    public static Object proxy(Object target){
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            new MyInvationHandler(target));
    }
}
