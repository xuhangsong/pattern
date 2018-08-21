package singleton;

/**
 * @author  xuhangsong
 */
public class LazySun {

    static{
        System.out.println("sun");
    }
    private LazySun(){
        if(SunHolder.LAZY_SUN !=null){
            throw new RuntimeException("单例已经存在");
        }
    }
    public static final LazySun getInstance(){
        return SunHolder.LAZY_SUN;
    }

    private static class SunHolder{
        static{
            System.out.println("sunHolder");
        }
        private static final LazySun LAZY_SUN = new LazySun();
    }
}
