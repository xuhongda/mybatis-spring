package pojo;

import java.util.ArrayList;
import java.util.List;

public class CityDistrictIdTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityDistrictIdTempExample() {
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

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(Integer value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(Integer value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(Integer value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(Integer value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(Integer value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<Integer> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<Integer> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(Integer value1, Integer value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(Integer value1, Integer value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIsNull() {
            addCriterion("districtcode is null");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIsNotNull() {
            addCriterion("districtcode is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeEqualTo(Integer value) {
            addCriterion("districtcode =", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotEqualTo(Integer value) {
            addCriterion("districtcode <>", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeGreaterThan(Integer value) {
            addCriterion("districtcode >", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("districtcode >=", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLessThan(Integer value) {
            addCriterion("districtcode <", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLessThanOrEqualTo(Integer value) {
            addCriterion("districtcode <=", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIn(List<Integer> values) {
            addCriterion("districtcode in", values, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotIn(List<Integer> values) {
            addCriterion("districtcode not in", values, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeBetween(Integer value1, Integer value2) {
            addCriterion("districtcode between", value1, value2, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("districtcode not between", value1, value2, "districtcode");
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