package delegateadapter.delegate;

/**
 * @author xuhangsong 2018/8/26
 */
public class ChineseTeach implements Teach {
    @Override
    public void teaching(String schedule ) {
        System.out.println("语文老师教"+schedule+"！！");
    }
}
