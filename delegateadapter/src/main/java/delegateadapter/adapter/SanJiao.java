package delegateadapter.adapter;

/**
 * @author xuhangsong 2018/8/26
 * 三脚电源头
 */
public class SanJiao {
    private String fireLine;
    private String zeroLine;
    private String earthLine;

    public SanJiao(String fireLine, String zeroLine, String earthLine) {
        this.fireLine = fireLine;
        this.zeroLine = zeroLine;
        this.earthLine = earthLine;
    }

    public String getFireLine() {
        return fireLine;
    }

    public void setFireLine(String fireLine) {
        this.fireLine = fireLine;
    }

    public String getZeroLine() {
        return zeroLine;
    }

    public void setZeroLine(String zeroLine) {
        this.zeroLine = zeroLine;
    }

    public String getEarthLine() {
        return earthLine;
    }

    public void setEarthLine(String earthLine) {
        this.earthLine = earthLine;
    }
}
