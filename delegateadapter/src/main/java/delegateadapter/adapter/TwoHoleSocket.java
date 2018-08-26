package delegateadapter.adapter;

/**
 * @author xuhangsong 2018/8/26
 */
public class TwoHoleSocket {
    public void useSocket(ErJiao ej){
        System.out.println("二孔插座连接了"+ej.getFireLine()+"、"+ej.getZeroLine());
    }
}
