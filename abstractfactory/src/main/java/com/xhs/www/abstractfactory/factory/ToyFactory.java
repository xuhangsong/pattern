package com.xhs.www.abstractfactory.factory;

import com.xhs.www.abstractfactory.toy.BearToy;
import com.xhs.www.abstractfactory.toy.CatToy;
import com.xhs.www.abstractfactory.toy.DogToy;
import com.xhs.www.abstractfactory.toy.Toy;

/**
 * @author xuhan  build  2018/8/21
 */
public class ToyFactory extends ToyAbstractFactory {
    @Override
    public Toy getCatToy() {
        return new CatToy();
    }

    @Override
    public Toy getBearToy() {
        return new BearToy();
    }

    @Override
    public Toy getDogToy() {
        return new DogToy();
    }
}
