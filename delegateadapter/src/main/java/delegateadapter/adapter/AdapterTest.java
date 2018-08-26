package delegateadapter.adapter;

/**
 * @author xuhangsong 2018/8/26
 */
public class AdapterTest {
    public static void main(String[] args) {
        SanJiao sj = new SanJiao("三角火线","三角零线","三角接地线");
        ErJiao ej = new ErJiao("二角火线","二角零线");
        ThressHoleSocketAdapter sjAdapter = new ThressHoleSocketAdapter();
        TwoHoleSocketAdapter ejAdapter = new TwoHoleSocketAdapter();
        sjAdapter.useSocket(sj);
        sjAdapter.useSocket(ej);
        ejAdapter.useSocket(sj);
        ejAdapter.useSocket(ej);

    }
}
