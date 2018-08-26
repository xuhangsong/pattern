package delegateadapter.adapter;

/**
 * @author xuhangsong 2018/8/26
 */
public class TwoHoleSocketAdapter extends TwoHoleSocket{

    public void useSocket(SanJiao sj){
        ErJiao ej = new ErJiao(null,null);
        ej.setFireLine(sj.getFireLine());
        ej.setZeroLine(sj.getZeroLine());
        this.useSocket(ej);
    }
}
