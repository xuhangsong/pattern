package com.xhs.www.proxy.custom;

import com.xhs.www.proxy.jdk.Train;
import com.xhs.www.proxy.jdk.Vehicle;

/**
 * @author xuhan  build  2018/8/23
 */
public class XHSProxyTest {
    public static void main(String[] args) throws Exception {
        XHSVehicleProxy vp = new XHSVehicleProxy();
        Train t = new Train();
        Vehicle v = (Vehicle) vp.getInstance(t);
        v.run();
    }
}
