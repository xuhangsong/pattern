package delegateadapter.delegate;

/**
 * @author xuhangsong 2018/8/26
 */
public class EnglishTeach implements Teach {
    @Override
    public void teaching(String schedule ) {
        System.out.println("英语老师教"+schedule+"！！！");
    }
}
