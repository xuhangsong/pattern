package com.xhs.www.proxy.jdk;

import java.io.Serializable;

/**
 * @author xuhan  build  2018/8/22
 */
public class Train implements Vehicle,Serializable {


    @Override
    public void run() {
        System.out.println("train run by many wheels");
    }
}
