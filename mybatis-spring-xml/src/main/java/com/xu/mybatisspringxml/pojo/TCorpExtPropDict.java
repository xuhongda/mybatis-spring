package pojo;

public class TCorpExtPropDict {
    private String corpId;

    private Integer hasCustAlarm;

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public Integer getHasCustAlarm() {
        return hasCustAlarm;
    }

    public void setHasCustAlarm(Integer hasCustAlarm) {
        this.hasCustAlarm = hasCustAlarm;
    }
}