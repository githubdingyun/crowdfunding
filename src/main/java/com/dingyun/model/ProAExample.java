package com.dingyun.model;

import java.util.ArrayList;
import java.util.List;

public class ProAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProAExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andProAIdIsNull() {
            addCriterion("pro_a_id is null");
            return (Criteria) this;
        }

        public Criteria andProAIdIsNotNull() {
            addCriterion("pro_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andProAIdEqualTo(Integer value) {
            addCriterion("pro_a_id =", value, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdNotEqualTo(Integer value) {
            addCriterion("pro_a_id <>", value, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdGreaterThan(Integer value) {
            addCriterion("pro_a_id >", value, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_a_id >=", value, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdLessThan(Integer value) {
            addCriterion("pro_a_id <", value, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_a_id <=", value, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdIn(List<Integer> values) {
            addCriterion("pro_a_id in", values, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdNotIn(List<Integer> values) {
            addCriterion("pro_a_id not in", values, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_a_id between", value1, value2, "proAId");
            return (Criteria) this;
        }

        public Criteria andProAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_a_id not between", value1, value2, "proAId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdIsNull() {
            addCriterion("pr_a_us_id is null");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdIsNotNull() {
            addCriterion("pr_a_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdEqualTo(Integer value) {
            addCriterion("pr_a_us_id =", value, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdNotEqualTo(Integer value) {
            addCriterion("pr_a_us_id <>", value, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdGreaterThan(Integer value) {
            addCriterion("pr_a_us_id >", value, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_a_us_id >=", value, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdLessThan(Integer value) {
            addCriterion("pr_a_us_id <", value, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("pr_a_us_id <=", value, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdIn(List<Integer> values) {
            addCriterion("pr_a_us_id in", values, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdNotIn(List<Integer> values) {
            addCriterion("pr_a_us_id not in", values, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdBetween(Integer value1, Integer value2) {
            addCriterion("pr_a_us_id between", value1, value2, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andPrAUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_a_us_id not between", value1, value2, "prAUsId");
            return (Criteria) this;
        }

        public Criteria andProACustNameIsNull() {
            addCriterion("pro_a_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andProACustNameIsNotNull() {
            addCriterion("pro_a_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andProACustNameEqualTo(String value) {
            addCriterion("pro_a_cust_name =", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameNotEqualTo(String value) {
            addCriterion("pro_a_cust_name <>", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameGreaterThan(String value) {
            addCriterion("pro_a_cust_name >", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_a_cust_name >=", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameLessThan(String value) {
            addCriterion("pro_a_cust_name <", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameLessThanOrEqualTo(String value) {
            addCriterion("pro_a_cust_name <=", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameLike(String value) {
            addCriterion("pro_a_cust_name like", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameNotLike(String value) {
            addCriterion("pro_a_cust_name not like", value, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameIn(List<String> values) {
            addCriterion("pro_a_cust_name in", values, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameNotIn(List<String> values) {
            addCriterion("pro_a_cust_name not in", values, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameBetween(String value1, String value2) {
            addCriterion("pro_a_cust_name between", value1, value2, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustNameNotBetween(String value1, String value2) {
            addCriterion("pro_a_cust_name not between", value1, value2, "proACustName");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneIsNull() {
            addCriterion("pro_a_cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneIsNotNull() {
            addCriterion("pro_a_cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneEqualTo(String value) {
            addCriterion("pro_a_cust_phone =", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneNotEqualTo(String value) {
            addCriterion("pro_a_cust_phone <>", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneGreaterThan(String value) {
            addCriterion("pro_a_cust_phone >", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pro_a_cust_phone >=", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneLessThan(String value) {
            addCriterion("pro_a_cust_phone <", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneLessThanOrEqualTo(String value) {
            addCriterion("pro_a_cust_phone <=", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneLike(String value) {
            addCriterion("pro_a_cust_phone like", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneNotLike(String value) {
            addCriterion("pro_a_cust_phone not like", value, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneIn(List<String> values) {
            addCriterion("pro_a_cust_phone in", values, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneNotIn(List<String> values) {
            addCriterion("pro_a_cust_phone not in", values, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneBetween(String value1, String value2) {
            addCriterion("pro_a_cust_phone between", value1, value2, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProACustPhoneNotBetween(String value1, String value2) {
            addCriterion("pro_a_cust_phone not between", value1, value2, "proACustPhone");
            return (Criteria) this;
        }

        public Criteria andProAPstIdIsNull() {
            addCriterion("pro_a_pst_id is null");
            return (Criteria) this;
        }

        public Criteria andProAPstIdIsNotNull() {
            addCriterion("pro_a_pst_id is not null");
            return (Criteria) this;
        }

        public Criteria andProAPstIdEqualTo(Integer value) {
            addCriterion("pro_a_pst_id =", value, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdNotEqualTo(Integer value) {
            addCriterion("pro_a_pst_id <>", value, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdGreaterThan(Integer value) {
            addCriterion("pro_a_pst_id >", value, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_a_pst_id >=", value, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdLessThan(Integer value) {
            addCriterion("pro_a_pst_id <", value, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_a_pst_id <=", value, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdIn(List<Integer> values) {
            addCriterion("pro_a_pst_id in", values, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdNotIn(List<Integer> values) {
            addCriterion("pro_a_pst_id not in", values, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_a_pst_id between", value1, value2, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProAPstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_a_pst_id not between", value1, value2, "proAPstId");
            return (Criteria) this;
        }

        public Criteria andProACustAddressIsNull() {
            addCriterion("pro_a_cust_address is null");
            return (Criteria) this;
        }

        public Criteria andProACustAddressIsNotNull() {
            addCriterion("pro_a_cust_address is not null");
            return (Criteria) this;
        }

        public Criteria andProACustAddressEqualTo(String value) {
            addCriterion("pro_a_cust_address =", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressNotEqualTo(String value) {
            addCriterion("pro_a_cust_address <>", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressGreaterThan(String value) {
            addCriterion("pro_a_cust_address >", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pro_a_cust_address >=", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressLessThan(String value) {
            addCriterion("pro_a_cust_address <", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressLessThanOrEqualTo(String value) {
            addCriterion("pro_a_cust_address <=", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressLike(String value) {
            addCriterion("pro_a_cust_address like", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressNotLike(String value) {
            addCriterion("pro_a_cust_address not like", value, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressIn(List<String> values) {
            addCriterion("pro_a_cust_address in", values, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressNotIn(List<String> values) {
            addCriterion("pro_a_cust_address not in", values, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressBetween(String value1, String value2) {
            addCriterion("pro_a_cust_address between", value1, value2, "proACustAddress");
            return (Criteria) this;
        }

        public Criteria andProACustAddressNotBetween(String value1, String value2) {
            addCriterion("pro_a_cust_address not between", value1, value2, "proACustAddress");
            return (Criteria) this;
        }
    }

    /**
     */
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