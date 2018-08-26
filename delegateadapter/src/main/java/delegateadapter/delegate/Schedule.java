package delegateadapter.delegate;

import java.util.HashMap;

/**
 * @author xuhangsong 2018/8/26
 */
public class Schedule implements Teach{
    private HashMap<String,Teach> map = new HashMap<String, Teach>();
    public Schedule() {
        map.put("数学",new MathTeach());
        map.put("英语",new EnglishTeach());
        map.put("语文",new ChineseTeach());
    }

    @Override
    public void teaching(String schedule) {
        if (map.get(schedule) != null) {
            map.get(schedule).teaching(schedule);
        } else {
            System.out.println("没有对应课程");
        }
    }
}
