package com.xhs.www.abstractfactory.factory;

import com.xhs.www.abstractfactory.toy.Toy;

/**
 * @author xuhan
 */
public abstract class ToyAbstractFactory {

    public abstract Toy getCatToy();
    public abstract Toy getBearToy();
    public abstract Toy getDogToy();
}
