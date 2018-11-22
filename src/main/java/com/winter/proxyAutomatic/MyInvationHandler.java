package com.winter.proxyAutomatic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午4:43 2018/11/22
 **/
public class MyInvationHandler implements InvocationHandler{
    
    private Object target;
    
    public MyInvationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置增强
        doSomethingBefore();
        //调用被代理对象的方法
        Object res = method.invoke(target,args);
        //后置增强
        doSomethingAfter();
        return res;
    }

    private void doSomethingAfter() {
    }

    private void doSomethingBefore() {
    }
}
