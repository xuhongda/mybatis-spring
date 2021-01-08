package com.xu.mybatisspringxml.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleAlarmMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleAlarmMsgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRecUidIsNull() {
            addCriterion("REC_UID is null");
            return (Criteria) this;
        }

        public Criteria andRecUidIsNotNull() {
            addCriterion("REC_UID is not null");
            return (Criteria) this;
        }

        public Criteria andRecUidEqualTo(String value) {
            addCriterion("REC_UID =", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotEqualTo(String value) {
            addCriterion("REC_UID <>", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidGreaterThan(String value) {
            addCriterion("REC_UID >", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidGreaterThanOrEqualTo(String value) {
            addCriterion("REC_UID >=", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLessThan(String value) {
            addCriterion("REC_UID <", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLessThanOrEqualTo(String value) {
            addCriterion("REC_UID <=", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLike(String value) {
            addCriterion("REC_UID like", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotLike(String value) {
            addCriterion("REC_UID not like", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidIn(List<String> values) {
            addCriterion("REC_UID in", values, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotIn(List<String> values) {
            addCriterion("REC_UID not in", values, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidBetween(String value1, String value2) {
            addCriterion("REC_UID between", value1, value2, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotBetween(String value1, String value2) {
            addCriterion("REC_UID not between", value1, value2, "recUid");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNull() {
            addCriterion("OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(String value) {
            addCriterion("OBJ_ID =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(String value) {
            addCriterion("OBJ_ID <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(String value) {
            addCriterion("OBJ_ID >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_ID >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(String value) {
            addCriterion("OBJ_ID <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(String value) {
            addCriterion("OBJ_ID <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLike(String value) {
            addCriterion("OBJ_ID like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotLike(String value) {
            addCriterion("OBJ_ID not like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<String> values) {
            addCriterion("OBJ_ID in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<String> values) {
            addCriterion("OBJ_ID not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(String value1, String value2) {
            addCriterion("OBJ_ID between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(String value1, String value2) {
            addCriterion("OBJ_ID not between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("DEVICE_ID like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("DEVICE_ID not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(Integer value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(Integer value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(Integer value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(Integer value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<Integer> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<Integer> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("ALARM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("ALARM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("ALARM_TIME =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("ALARM_TIME <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("ALARM_TIME >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ALARM_TIME >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("ALARM_TIME <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("ALARM_TIME <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("ALARM_TIME in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("ALARM_TIME not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("ALARM_TIME between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("ALARM_TIME not between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIsSmsIsNull() {
            addCriterion("IS_SMS is null");
            return (Criteria) this;
        }

        public Criteria andIsSmsIsNotNull() {
            addCriterion("IS_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSmsEqualTo(Integer value) {
            addCriterion("IS_SMS =", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotEqualTo(Integer value) {
            addCriterion("IS_SMS <>", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsGreaterThan(Integer value) {
            addCriterion("IS_SMS >", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SMS >=", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsLessThan(Integer value) {
            addCriterion("IS_SMS <", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SMS <=", value, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsIn(List<Integer> values) {
            addCriterion("IS_SMS in", values, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotIn(List<Integer> values) {
            addCriterion("IS_SMS not in", values, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsBetween(Integer value1, Integer value2) {
            addCriterion("IS_SMS between", value1, value2, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SMS not between", value1, value2, "isSms");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNull() {
            addCriterion("IS_PUSH is null");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNotNull() {
            addCriterion("IS_PUSH is not null");
            return (Criteria) this;
        }

        public Criteria andIsPushEqualTo(Integer value) {
            addCriterion("IS_PUSH =", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotEqualTo(Integer value) {
            addCriterion("IS_PUSH <>", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThan(Integer value) {
            addCriterion("IS_PUSH >", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_PUSH >=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThan(Integer value) {
            addCriterion("IS_PUSH <", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThanOrEqualTo(Integer value) {
            addCriterion("IS_PUSH <=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushIn(List<Integer> values) {
            addCriterion("IS_PUSH in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotIn(List<Integer> values) {
            addCriterion("IS_PUSH not in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushBetween(Integer value1, Integer value2) {
            addCriterion("IS_PUSH between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_PUSH not between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPageIsNull() {
            addCriterion("IS_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andIsPageIsNotNull() {
            addCriterion("IS_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsPageEqualTo(Integer value) {
            addCriterion("IS_PAGE =", value, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageNotEqualTo(Integer value) {
            addCriterion("IS_PAGE <>", value, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageGreaterThan(Integer value) {
            addCriterion("IS_PAGE >", value, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_PAGE >=", value, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageLessThan(Integer value) {
            addCriterion("IS_PAGE <", value, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageLessThanOrEqualTo(Integer value) {
            addCriterion("IS_PAGE <=", value, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageIn(List<Integer> values) {
            addCriterion("IS_PAGE in", values, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageNotIn(List<Integer> values) {
            addCriterion("IS_PAGE not in", values, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageBetween(Integer value1, Integer value2) {
            addCriterion("IS_PAGE between", value1, value2, "isPage");
            return (Criteria) this;
        }

        public Criteria andIsPageNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_PAGE not between", value1, value2, "isPage");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsInOrderIsNull() {
            addCriterion("IS_IN_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andIsInOrderIsNotNull() {
            addCriterion("IS_IN_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andIsInOrderEqualTo(Integer value) {
            addCriterion("IS_IN_ORDER =", value, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderNotEqualTo(Integer value) {
            addCriterion("IS_IN_ORDER <>", value, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderGreaterThan(Integer value) {
            addCriterion("IS_IN_ORDER >", value, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_IN_ORDER >=", value, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderLessThan(Integer value) {
            addCriterion("IS_IN_ORDER <", value, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderLessThanOrEqualTo(Integer value) {
            addCriterion("IS_IN_ORDER <=", value, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderIn(List<Integer> values) {
            addCriterion("IS_IN_ORDER in", values, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderNotIn(List<Integer> values) {
            addCriterion("IS_IN_ORDER not in", values, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderBetween(Integer value1, Integer value2) {
            addCriterion("IS_IN_ORDER between", value1, value2, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andIsInOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_IN_ORDER not between", value1, value2, "isInOrder");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andVendorIdIsNull() {
            addCriterion("VENDOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andVendorIdIsNotNull() {
            addCriterion("VENDOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVendorIdEqualTo(String value) {
            addCriterion("VENDOR_ID =", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotEqualTo(String value) {
            addCriterion("VENDOR_ID <>", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThan(String value) {
            addCriterion("VENDOR_ID >", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_ID >=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThan(String value) {
            addCriterion("VENDOR_ID <", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_ID <=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLike(String value) {
            addCriterion("VENDOR_ID like", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotLike(String value) {
            addCriterion("VENDOR_ID not like", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdIn(List<String> values) {
            addCriterion("VENDOR_ID in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotIn(List<String> values) {
            addCriterion("VENDOR_ID not in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdBetween(String value1, String value2) {
            addCriterion("VENDOR_ID between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotBetween(String value1, String value2) {
            addCriterion("VENDOR_ID not between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNull() {
            addCriterion("READ_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNotNull() {
            addCriterion("READ_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReadStatusEqualTo(Integer value) {
            addCriterion("READ_STATUS =", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotEqualTo(Integer value) {
            addCriterion("READ_STATUS <>", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThan(Integer value) {
            addCriterion("READ_STATUS >", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_STATUS >=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThan(Integer value) {
            addCriterion("READ_STATUS <", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThanOrEqualTo(Integer value) {
            addCriterion("READ_STATUS <=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusIn(List<Integer> values) {
            addCriterion("READ_STATUS in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotIn(List<Integer> values) {
            addCriterion("READ_STATUS not in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusBetween(Integer value1, Integer value2) {
            addCriterion("READ_STATUS between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_STATUS not between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andPosSpeedIsNull() {
            addCriterion("POS_SPEED is null");
            return (Criteria) this;
        }

        public Criteria andPosSpeedIsNotNull() {
            addCriterion("POS_SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andPosSpeedEqualTo(Long value) {
            addCriterion("POS_SPEED =", value, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedNotEqualTo(Long value) {
            addCriterion("POS_SPEED <>", value, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedGreaterThan(Long value) {
            addCriterion("POS_SPEED >", value, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedGreaterThanOrEqualTo(Long value) {
            addCriterion("POS_SPEED >=", value, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedLessThan(Long value) {
            addCriterion("POS_SPEED <", value, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedLessThanOrEqualTo(Long value) {
            addCriterion("POS_SPEED <=", value, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedIn(List<Long> values) {
            addCriterion("POS_SPEED in", values, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedNotIn(List<Long> values) {
            addCriterion("POS_SPEED not in", values, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedBetween(Long value1, Long value2) {
            addCriterion("POS_SPEED between", value1, value2, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andPosSpeedNotBetween(Long value1, Long value2) {
            addCriterion("POS_SPEED not between", value1, value2, "posSpeed");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("DRIVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("DRIVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("DRIVER_ID =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("DRIVER_ID <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("DRIVER_ID >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVER_ID >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("DRIVER_ID <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("DRIVER_ID <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("DRIVER_ID like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("DRIVER_ID not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("DRIVER_ID in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("DRIVER_ID not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("DRIVER_ID between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("DRIVER_ID not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageIsNull() {
            addCriterion("POWER_VOLTAGE is null");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageIsNotNull() {
            addCriterion("POWER_VOLTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageEqualTo(BigDecimal value) {
            addCriterion("POWER_VOLTAGE =", value, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageNotEqualTo(BigDecimal value) {
            addCriterion("POWER_VOLTAGE <>", value, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageGreaterThan(BigDecimal value) {
            addCriterion("POWER_VOLTAGE >", value, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER_VOLTAGE >=", value, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageLessThan(BigDecimal value) {
            addCriterion("POWER_VOLTAGE <", value, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER_VOLTAGE <=", value, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageIn(List<BigDecimal> values) {
            addCriterion("POWER_VOLTAGE in", values, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageNotIn(List<BigDecimal> values) {
            addCriterion("POWER_VOLTAGE not in", values, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER_VOLTAGE between", value1, value2, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andPowerVoltageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER_VOLTAGE not between", value1, value2, "powerVoltage");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationIsNull() {
            addCriterion("Idle_speed_duration is null");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationIsNotNull() {
            addCriterion("Idle_speed_duration is not null");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationEqualTo(Integer value) {
            addCriterion("Idle_speed_duration =", value, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationNotEqualTo(Integer value) {
            addCriterion("Idle_speed_duration <>", value, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationGreaterThan(Integer value) {
            addCriterion("Idle_speed_duration >", value, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Idle_speed_duration >=", value, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationLessThan(Integer value) {
            addCriterion("Idle_speed_duration <", value, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationLessThanOrEqualTo(Integer value) {
            addCriterion("Idle_speed_duration <=", value, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationIn(List<Integer> values) {
            addCriterion("Idle_speed_duration in", values, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationNotIn(List<Integer> values) {
            addCriterion("Idle_speed_duration not in", values, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationBetween(Integer value1, Integer value2) {
            addCriterion("Idle_speed_duration between", value1, value2, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andIdleSpeedDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("Idle_speed_duration not between", value1, value2, "idleSpeedDuration");
            return (Criteria) this;
        }

        public Criteria andVideoKeyIsNull() {
            addCriterion("VIDEO_KEY is null");
            return (Criteria) this;
        }

        public Criteria andVideoKeyIsNotNull() {
            addCriterion("VIDEO_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andVideoKeyEqualTo(String value) {
            addCriterion("VIDEO_KEY =", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyNotEqualTo(String value) {
            addCriterion("VIDEO_KEY <>", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyGreaterThan(String value) {
            addCriterion("VIDEO_KEY >", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_KEY >=", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyLessThan(String value) {
            addCriterion("VIDEO_KEY <", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_KEY <=", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyLike(String value) {
            addCriterion("VIDEO_KEY like", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyNotLike(String value) {
            addCriterion("VIDEO_KEY not like", value, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyIn(List<String> values) {
            addCriterion("VIDEO_KEY in", values, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyNotIn(List<String> values) {
            addCriterion("VIDEO_KEY not in", values, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyBetween(String value1, String value2) {
            addCriterion("VIDEO_KEY between", value1, value2, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoKeyNotBetween(String value1, String value2) {
            addCriterion("VIDEO_KEY not between", value1, value2, "videoKey");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("VIDEO_URL is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("VIDEO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("VIDEO_URL =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("VIDEO_URL <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("VIDEO_URL >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("VIDEO_URL <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("VIDEO_URL like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("VIDEO_URL not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("VIDEO_URL in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("VIDEO_URL not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("VIDEO_URL between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("VIDEO_URL not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNull() {
            addCriterion("VIDEO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("VIDEO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(Date value) {
            addCriterion("VIDEO_TIME =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(Date value) {
            addCriterion("VIDEO_TIME <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(Date value) {
            addCriterion("VIDEO_TIME >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VIDEO_TIME >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(Date value) {
            addCriterion("VIDEO_TIME <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(Date value) {
            addCriterion("VIDEO_TIME <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<Date> values) {
            addCriterion("VIDEO_TIME in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<Date> values) {
            addCriterion("VIDEO_TIME not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(Date value1, Date value2) {
            addCriterion("VIDEO_TIME between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(Date value1, Date value2) {
            addCriterion("VIDEO_TIME not between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdIsNull() {
            addCriterion("MULTIMEDIA_ID is null");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdIsNotNull() {
            addCriterion("MULTIMEDIA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdEqualTo(String value) {
            addCriterion("MULTIMEDIA_ID =", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdNotEqualTo(String value) {
            addCriterion("MULTIMEDIA_ID <>", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdGreaterThan(String value) {
            addCriterion("MULTIMEDIA_ID >", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("MULTIMEDIA_ID >=", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdLessThan(String value) {
            addCriterion("MULTIMEDIA_ID <", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdLessThanOrEqualTo(String value) {
            addCriterion("MULTIMEDIA_ID <=", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdLike(String value) {
            addCriterion("MULTIMEDIA_ID like", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdNotLike(String value) {
            addCriterion("MULTIMEDIA_ID not like", value, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdIn(List<String> values) {
            addCriterion("MULTIMEDIA_ID in", values, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdNotIn(List<String> values) {
            addCriterion("MULTIMEDIA_ID not in", values, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdBetween(String value1, String value2) {
            addCriterion("MULTIMEDIA_ID between", value1, value2, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andMultimediaIdNotBetween(String value1, String value2) {
            addCriterion("MULTIMEDIA_ID not between", value1, value2, "multimediaId");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusIsNull() {
            addCriterion("REMOVE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusIsNotNull() {
            addCriterion("REMOVE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusEqualTo(Integer value) {
            addCriterion("REMOVE_STATUS =", value, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusNotEqualTo(Integer value) {
            addCriterion("REMOVE_STATUS <>", value, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusGreaterThan(Integer value) {
            addCriterion("REMOVE_STATUS >", value, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMOVE_STATUS >=", value, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusLessThan(Integer value) {
            addCriterion("REMOVE_STATUS <", value, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("REMOVE_STATUS <=", value, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusIn(List<Integer> values) {
            addCriterion("REMOVE_STATUS in", values, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusNotIn(List<Integer> values) {
            addCriterion("REMOVE_STATUS not in", values, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusBetween(Integer value1, Integer value2) {
            addCriterion("REMOVE_STATUS between", value1, value2, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REMOVE_STATUS not between", value1, value2, "removeStatus");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIsNull() {
            addCriterion("REMOVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIsNotNull() {
            addCriterion("REMOVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeEqualTo(Date value) {
            addCriterion("REMOVE_TIME =", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotEqualTo(Date value) {
            addCriterion("REMOVE_TIME <>", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeGreaterThan(Date value) {
            addCriterion("REMOVE_TIME >", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REMOVE_TIME >=", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLessThan(Date value) {
            addCriterion("REMOVE_TIME <", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLessThanOrEqualTo(Date value) {
            addCriterion("REMOVE_TIME <=", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIn(List<Date> values) {
            addCriterion("REMOVE_TIME in", values, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotIn(List<Date> values) {
            addCriterion("REMOVE_TIME not in", values, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeBetween(Date value1, Date value2) {
            addCriterion("REMOVE_TIME between", value1, value2, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotBetween(Date value1, Date value2) {
            addCriterion("REMOVE_TIME not between", value1, value2, "removeTime");
            return (Criteria) this;
        }

        public Criteria andAlarmDataIsNull() {
            addCriterion("ALARM_DATA is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDataIsNotNull() {
            addCriterion("ALARM_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDataEqualTo(String value) {
            addCriterion("ALARM_DATA =", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataNotEqualTo(String value) {
            addCriterion("ALARM_DATA <>", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataGreaterThan(String value) {
            addCriterion("ALARM_DATA >", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_DATA >=", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataLessThan(String value) {
            addCriterion("ALARM_DATA <", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataLessThanOrEqualTo(String value) {
            addCriterion("ALARM_DATA <=", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataLike(String value) {
            addCriterion("ALARM_DATA like", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataNotLike(String value) {
            addCriterion("ALARM_DATA not like", value, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataIn(List<String> values) {
            addCriterion("ALARM_DATA in", values, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataNotIn(List<String> values) {
            addCriterion("ALARM_DATA not in", values, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataBetween(String value1, String value2) {
            addCriterion("ALARM_DATA between", value1, value2, "alarmData");
            return (Criteria) this;
        }

        public Criteria andAlarmDataNotBetween(String value1, String value2) {
            addCriterion("ALARM_DATA not between", value1, value2, "alarmData");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}