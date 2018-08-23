package com.xhs.www.proxy.custom;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.xhs.www.proxy.custom.XHSInvocationHandler;
import com.xhs.www.proxy.jdk.Vehicle;
import java.io.Serializable;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy999 implements Vehicle, Serializable {
    public XHSInvocationHandler h;

    public $Proxy999(XHSInvocationHandler var1) {
        this.h = var1;
    }

    public final void run() {
        try {
            this.h.invoke(this, Class.forName("com.xhs.www.proxy.jdk.Vehicle").getMethod("run"), (Object[])null);
        } catch (Error | RuntimeException var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
}
