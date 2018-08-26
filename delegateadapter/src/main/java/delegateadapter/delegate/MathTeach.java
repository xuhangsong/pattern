package delegateadapter.delegate;

/**
 * @author xuhangsong 2018/8/26
 */
public class MathTeach implements Teach {
    @Override
    public void teaching(String schedule ) {
        System.out.println("数学老师教"+schedule+"!!!");
    }
}
