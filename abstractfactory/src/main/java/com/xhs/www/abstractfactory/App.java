package com.xhs.www.abstractfactory;

import com.xhs.www.abstractfactory.factory.ToyFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        ToyFactory factory = new ToyFactory();
        System.out.println(factory.getBearToy().getName());
        System.out.println(factory.getCatToy().getName());
        System.out.println(factory.getDogToy().getName());

    }
}
