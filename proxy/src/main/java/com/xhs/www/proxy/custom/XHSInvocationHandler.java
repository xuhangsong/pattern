package com.xhs.www.proxy.custom;

import java.lang.reflect.Method;

/**
 * @author xuhan  build  2018/8/23
 */
public interface XHSInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable ;


}
