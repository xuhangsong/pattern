package delegateadapter.delegate;

/**
 * @author xuhangsong 2018/8/26
 */
public class Student {
    public static void main(String[] args) {
        Schedule s = new Schedule();
        s.teaching("语文");
        s.teaching("英语");
        s.teaching("数学");
    }
}
