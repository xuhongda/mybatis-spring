package com.xu.mybatisspringxml.pojo;

public class TCorpCustAlarmCfg {
    private String recId;

    private String corpId;

    private Integer castrolVehicleUsage;

    private String alarmPropKey;

    private String alarmPropValue;

    private String remark;

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId == null ? null : recId.trim();
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId == null ? null : corpId.trim();
    }

    public Integer getCastrolVehicleUsage() {
        return castrolVehicleUsage;
    }

    public void setCastrolVehicleUsage(Integer castrolVehicleUsage) {
        this.castrolVehicleUsage = castrolVehicleUsage;
    }

    public String getAlarmPropKey() {
        return alarmPropKey;
    }

    public void setAlarmPropKey(String alarmPropKey) {
        this.alarmPropKey = alarmPropKey == null ? null : alarmPropKey.trim();
    }

    public String getAlarmPropValue() {
        return alarmPropValue;
    }

    public void setAlarmPropValue(String alarmPropValue) {
        this.alarmPropValue = alarmPropValue == null ? null : alarmPropValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}