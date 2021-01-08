package com.xu.mybatisspringxml.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class VehicleAlarmMsg {
    private String recUid;

    private String objId;

    private String deviceId;

    private Integer alarmType;

    private Date alarmTime;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String address;

    private Integer isSms;

    private Integer isPush;

    private Integer isPage;

    private Date updateTime;

    private Integer isInOrder;

    private String note;

    private String vendorId;

    private Integer readStatus;

    private Long posSpeed;

    private String driverId;

    private BigDecimal powerVoltage;

    private Integer idleSpeedDuration;

    private String videoKey;

    private String videoUrl;

    private Date videoTime;

    private String multimediaId;

    private Integer removeStatus;

    private Date removeTime;

    private String alarmData;

    private Date recordTime;

    public String getRecUid() {
        return recUid;
    }

    public void setRecUid(String recUid) {
        this.recUid = recUid == null ? null : recUid.trim();
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsSms() {
        return isSms;
    }

    public void setIsSms(Integer isSms) {
        this.isSms = isSms;
    }

    public Integer getIsPush() {
        return isPush;
    }

    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }

    public Integer getIsPage() {
        return isPage;
    }

    public void setIsPage(Integer isPage) {
        this.isPage = isPage;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsInOrder() {
        return isInOrder;
    }

    public void setIsInOrder(Integer isInOrder) {
        this.isInOrder = isInOrder;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public Integer getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Integer readStatus) {
        this.readStatus = readStatus;
    }

    public Long getPosSpeed() {
        return posSpeed;
    }

    public void setPosSpeed(Long posSpeed) {
        this.posSpeed = posSpeed;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public BigDecimal getPowerVoltage() {
        return powerVoltage;
    }

    public void setPowerVoltage(BigDecimal powerVoltage) {
        this.powerVoltage = powerVoltage;
    }

    public Integer getIdleSpeedDuration() {
        return idleSpeedDuration;
    }

    public void setIdleSpeedDuration(Integer idleSpeedDuration) {
        this.idleSpeedDuration = idleSpeedDuration;
    }

    public String getVideoKey() {
        return videoKey;
    }

    public void setVideoKey(String videoKey) {
        this.videoKey = videoKey == null ? null : videoKey.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Date getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Date videoTime) {
        this.videoTime = videoTime;
    }

    public String getMultimediaId() {
        return multimediaId;
    }

    public void setMultimediaId(String multimediaId) {
        this.multimediaId = multimediaId == null ? null : multimediaId.trim();
    }

    public Integer getRemoveStatus() {
        return removeStatus;
    }

    public void setRemoveStatus(Integer removeStatus) {
        this.removeStatus = removeStatus;
    }

    public Date getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(Date removeTime) {
        this.removeTime = removeTime;
    }

    public String getAlarmData() {
        return alarmData;
    }

    public void setAlarmData(String alarmData) {
        this.alarmData = alarmData == null ? null : alarmData.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}