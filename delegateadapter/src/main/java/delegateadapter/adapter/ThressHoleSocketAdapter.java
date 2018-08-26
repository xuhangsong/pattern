package delegateadapter.adapter;

/**
 * @author xuhangsong 2018/8/26
 */
public class ThressHoleSocketAdapter extends ThressHoleSocket{

    public void useSocket(ErJiao ej){
        SanJiao sj = new SanJiao(null,null,null);
        sj.setFireLine(ej.getFireLine());
        sj.setZeroLine(ej.getZeroLine());
        this.useSocket(sj);
    }
}
