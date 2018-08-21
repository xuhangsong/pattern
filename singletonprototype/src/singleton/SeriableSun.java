package singleton;

import java.io.Serializable;

/**
 * @author xuhangsong 2018/8/21
 */
public class SeriableSun implements Serializable {
    public  final static SeriableSun INSTANCE = new SeriableSun();
    private SeriableSun(){}

    public static SeriableSun getInstance(){
        return INSTANCE;
    }

    private  Object readResolve(){
        return  INSTANCE;
    }

}
