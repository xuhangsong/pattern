package singleton;

/**
 * @author xuhangsong 2018/8/21
 */
public class HungarySun {
    private HungarySun(){}
    private static final HungarySun hungarySun = new HungarySun();
    public static final HungarySun getInstance(){
        return hungarySun;
    }
}
