package com.xhs.www.proxy.custom;

import com.xhs.www.proxy.jdk.Vehicle;

import java.lang.reflect.Method;

/**
 * @author xuhan  build  2018/8/23
 */
public class XHSVehicleProxy implements XHSInvocationHandler{

    private Vehicle target;

    public Object getInstance(Vehicle target) throws Exception {
        this.target = target;
        return XHSProxy.newProxyInstance(new XHSClassLoader(),target.getClass().getInterfaces(),this);
    }

        @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("运行前执行");
        method.invoke(this.target,args);
        System.out.println("运行后结束");
        return null;
    }
}
