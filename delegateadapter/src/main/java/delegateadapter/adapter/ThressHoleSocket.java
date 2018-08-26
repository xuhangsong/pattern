package delegateadapter.adapter;

/**
 * @author xuhangsong 2018/8/26
 */
public class ThressHoleSocket {
    public void useSocket(SanJiao sj){

        System.out.println("三孔插座连接了"+sj.getFireLine()+"、"+sj.getEarthLine()+"、"+sj.getZeroLine());
    }
}
