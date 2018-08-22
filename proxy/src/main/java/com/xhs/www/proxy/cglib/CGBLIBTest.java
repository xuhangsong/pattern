package com.xhs.www.proxy.cglib;

/**
 * @author xuhan  build  2018/8/22
 */
public class CGBLIBTest {
    public static void main(String[] args) {

        Car c = (Car) new CGLIBProxyCar().getInstance(Car.class);
        c.run();
    }
}
