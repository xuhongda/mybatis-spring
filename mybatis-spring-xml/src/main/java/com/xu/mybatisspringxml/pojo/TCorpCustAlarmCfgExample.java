package com.xu.mybatisspringxml.pojo;

import java.util.ArrayList;
import java.util.List;

public class TCorpCustAlarmCfgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCorpCustAlarmCfgExample() {
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

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(String value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(String value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(String value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(String value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(String value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLike(String value) {
            addCriterion("rec_id like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotLike(String value) {
            addCriterion("rec_id not like", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<String> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<String> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(String value1, String value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(String value1, String value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNull() {
            addCriterion("corp_id is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("corp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(String value) {
            addCriterion("corp_id =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(String value) {
            addCriterion("corp_id <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(String value) {
            addCriterion("corp_id >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("corp_id >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(String value) {
            addCriterion("corp_id <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(String value) {
            addCriterion("corp_id <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLike(String value) {
            addCriterion("corp_id like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotLike(String value) {
            addCriterion("corp_id not like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<String> values) {
            addCriterion("corp_id in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<String> values) {
            addCriterion("corp_id not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(String value1, String value2) {
            addCriterion("corp_id between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(String value1, String value2) {
            addCriterion("corp_id not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageIsNull() {
            addCriterion("castrol_vehicle_usage is null");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageIsNotNull() {
            addCriterion("castrol_vehicle_usage is not null");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageEqualTo(Integer value) {
            addCriterion("castrol_vehicle_usage =", value, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageNotEqualTo(Integer value) {
            addCriterion("castrol_vehicle_usage <>", value, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageGreaterThan(Integer value) {
            addCriterion("castrol_vehicle_usage >", value, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageGreaterThanOrEqualTo(Integer value) {
            addCriterion("castrol_vehicle_usage >=", value, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageLessThan(Integer value) {
            addCriterion("castrol_vehicle_usage <", value, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageLessThanOrEqualTo(Integer value) {
            addCriterion("castrol_vehicle_usage <=", value, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageIn(List<Integer> values) {
            addCriterion("castrol_vehicle_usage in", values, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageNotIn(List<Integer> values) {
            addCriterion("castrol_vehicle_usage not in", values, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageBetween(Integer value1, Integer value2) {
            addCriterion("castrol_vehicle_usage between", value1, value2, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andCastrolVehicleUsageNotBetween(Integer value1, Integer value2) {
            addCriterion("castrol_vehicle_usage not between", value1, value2, "castrolVehicleUsage");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyIsNull() {
            addCriterion("alarm_prop_key is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyIsNotNull() {
            addCriterion("alarm_prop_key is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyEqualTo(String value) {
            addCriterion("alarm_prop_key =", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyNotEqualTo(String value) {
            addCriterion("alarm_prop_key <>", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyGreaterThan(String value) {
            addCriterion("alarm_prop_key >", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_prop_key >=", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyLessThan(String value) {
            addCriterion("alarm_prop_key <", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyLessThanOrEqualTo(String value) {
            addCriterion("alarm_prop_key <=", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyLike(String value) {
            addCriterion("alarm_prop_key like", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyNotLike(String value) {
            addCriterion("alarm_prop_key not like", value, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyIn(List<String> values) {
            addCriterion("alarm_prop_key in", values, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyNotIn(List<String> values) {
            addCriterion("alarm_prop_key not in", values, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyBetween(String value1, String value2) {
            addCriterion("alarm_prop_key between", value1, value2, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropKeyNotBetween(String value1, String value2) {
            addCriterion("alarm_prop_key not between", value1, value2, "alarmPropKey");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueIsNull() {
            addCriterion("alarm_prop_value is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueIsNotNull() {
            addCriterion("alarm_prop_value is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueEqualTo(String value) {
            addCriterion("alarm_prop_value =", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueNotEqualTo(String value) {
            addCriterion("alarm_prop_value <>", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueGreaterThan(String value) {
            addCriterion("alarm_prop_value >", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_prop_value >=", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueLessThan(String value) {
            addCriterion("alarm_prop_value <", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueLessThanOrEqualTo(String value) {
            addCriterion("alarm_prop_value <=", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueLike(String value) {
            addCriterion("alarm_prop_value like", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueNotLike(String value) {
            addCriterion("alarm_prop_value not like", value, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueIn(List<String> values) {
            addCriterion("alarm_prop_value in", values, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueNotIn(List<String> values) {
            addCriterion("alarm_prop_value not in", values, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueBetween(String value1, String value2) {
            addCriterion("alarm_prop_value between", value1, value2, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andAlarmPropValueNotBetween(String value1, String value2) {
            addCriterion("alarm_prop_value not between", value1, value2, "alarmPropValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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