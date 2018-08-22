package com.xhs.www.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xuhan  build  2018/8/22
 */
public class JDKProxyTest {
    public static void main(String[] args) throws IOException {
        JDKTrainProxy proxy = new JDKTrainProxy();
        Vehicle v = (Vehicle) proxy.getInstance(new Train());


        JDKBikeProxy proxy2 = new JDKBikeProxy();
        Vehicle v2 = (Vehicle) proxy2.getInstance(new Bike());
        System.out.println(v.getClass());
        System.out.println(v2.getClass());
        //将JVM种的类输出到本地
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Vehicle.class});
        FileOutputStream os = new FileOutputStream("D://V1.class");
        os.write(bytes);
        os.close();

        v.run();
        v2.run();
    }
}
