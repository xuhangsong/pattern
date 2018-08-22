package com.xhs.www.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xuhan  build  2018/8/22
 */
public class JDKBikeProxy implements InvocationHandler {

    private Vehicle v = null;


    public Object getInstance(Vehicle v){
        this.v = v;
        return Proxy.newProxyInstance(v.getClass().getClassLoader(),v.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("跑跑跑");
        System.out.println("runrunrun");
        method.invoke(this.v,args);
        return null;
    }
}
