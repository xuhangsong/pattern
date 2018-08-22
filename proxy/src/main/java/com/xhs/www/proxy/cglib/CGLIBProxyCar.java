package com.xhs.www.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xuhan  build  2018/8/22
 * CGLIB 代理实现，需要使用enhancer 增强类
 */
public class CGLIBProxyCar implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("先给汽车加油");
        System.out.println("驾驶员发动汽车");
        methodProxy.invokeSuper(o,objects);
        System.out.println("驾驶员停车");
        return null;
    }

    public Object getInstance(Class<?> clazz){

        //增强类
        Enhancer enhancer = new Enhancer();
        //设置他的父类
        enhancer.setSuperclass(clazz);
        //设置它的调用类
        enhancer.setCallback(this);

        return enhancer.create();

    }

}
