package com.dingyun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RepayExample() {
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

        public Criteria andRyIdIsNull() {
            addCriterion("ry_id is null");
            return (Criteria) this;
        }

        public Criteria andRyIdIsNotNull() {
            addCriterion("ry_id is not null");
            return (Criteria) this;
        }

        public Criteria andRyIdEqualTo(Integer value) {
            addCriterion("ry_id =", value, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdNotEqualTo(Integer value) {
            addCriterion("ry_id <>", value, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdGreaterThan(Integer value) {
            addCriterion("ry_id >", value, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ry_id >=", value, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdLessThan(Integer value) {
            addCriterion("ry_id <", value, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ry_id <=", value, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdIn(List<Integer> values) {
            addCriterion("ry_id in", values, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdNotIn(List<Integer> values) {
            addCriterion("ry_id not in", values, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdBetween(Integer value1, Integer value2) {
            addCriterion("ry_id between", value1, value2, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ry_id not between", value1, value2, "ryId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdIsNull() {
            addCriterion("ry_us_id is null");
            return (Criteria) this;
        }

        public Criteria andRyUsIdIsNotNull() {
            addCriterion("ry_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andRyUsIdEqualTo(Integer value) {
            addCriterion("ry_us_id =", value, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdNotEqualTo(Integer value) {
            addCriterion("ry_us_id <>", value, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdGreaterThan(Integer value) {
            addCriterion("ry_us_id >", value, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ry_us_id >=", value, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdLessThan(Integer value) {
            addCriterion("ry_us_id <", value, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ry_us_id <=", value, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdIn(List<Integer> values) {
            addCriterion("ry_us_id in", values, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdNotIn(List<Integer> values) {
            addCriterion("ry_us_id not in", values, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdBetween(Integer value1, Integer value2) {
            addCriterion("ry_us_id between", value1, value2, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ry_us_id not between", value1, value2, "ryUsId");
            return (Criteria) this;
        }

        public Criteria andRyTypeIsNull() {
            addCriterion("ry_type is null");
            return (Criteria) this;
        }

        public Criteria andRyTypeIsNotNull() {
            addCriterion("ry_type is not null");
            return (Criteria) this;
        }

        public Criteria andRyTypeEqualTo(Integer value) {
            addCriterion("ry_type =", value, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeNotEqualTo(Integer value) {
            addCriterion("ry_type <>", value, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeGreaterThan(Integer value) {
            addCriterion("ry_type >", value, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ry_type >=", value, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeLessThan(Integer value) {
            addCriterion("ry_type <", value, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ry_type <=", value, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeIn(List<Integer> values) {
            addCriterion("ry_type in", values, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeNotIn(List<Integer> values) {
            addCriterion("ry_type not in", values, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeBetween(Integer value1, Integer value2) {
            addCriterion("ry_type between", value1, value2, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ry_type not between", value1, value2, "ryType");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyIsNull() {
            addCriterion("ry_paymoney is null");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyIsNotNull() {
            addCriterion("ry_paymoney is not null");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyEqualTo(Double value) {
            addCriterion("ry_paymoney =", value, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyNotEqualTo(Double value) {
            addCriterion("ry_paymoney <>", value, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyGreaterThan(Double value) {
            addCriterion("ry_paymoney >", value, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ry_paymoney >=", value, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyLessThan(Double value) {
            addCriterion("ry_paymoney <", value, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyLessThanOrEqualTo(Double value) {
            addCriterion("ry_paymoney <=", value, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyIn(List<Double> values) {
            addCriterion("ry_paymoney in", values, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyNotIn(List<Double> values) {
            addCriterion("ry_paymoney not in", values, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyBetween(Double value1, Double value2) {
            addCriterion("ry_paymoney between", value1, value2, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyPaymoneyNotBetween(Double value1, Double value2) {
            addCriterion("ry_paymoney not between", value1, value2, "ryPaymoney");
            return (Criteria) this;
        }

        public Criteria andRyRuleIsNull() {
            addCriterion("ry_rule is null");
            return (Criteria) this;
        }

        public Criteria andRyRuleIsNotNull() {
            addCriterion("ry_rule is not null");
            return (Criteria) this;
        }

        public Criteria andRyRuleEqualTo(String value) {
            addCriterion("ry_rule =", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleNotEqualTo(String value) {
            addCriterion("ry_rule <>", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleGreaterThan(String value) {
            addCriterion("ry_rule >", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleGreaterThanOrEqualTo(String value) {
            addCriterion("ry_rule >=", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleLessThan(String value) {
            addCriterion("ry_rule <", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleLessThanOrEqualTo(String value) {
            addCriterion("ry_rule <=", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleLike(String value) {
            addCriterion("ry_rule like", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleNotLike(String value) {
            addCriterion("ry_rule not like", value, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleIn(List<String> values) {
            addCriterion("ry_rule in", values, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleNotIn(List<String> values) {
            addCriterion("ry_rule not in", values, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleBetween(String value1, String value2) {
            addCriterion("ry_rule between", value1, value2, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyRuleNotBetween(String value1, String value2) {
            addCriterion("ry_rule not between", value1, value2, "ryRule");
            return (Criteria) this;
        }

        public Criteria andRyContentIsNull() {
            addCriterion("ry_content is null");
            return (Criteria) this;
        }

        public Criteria andRyContentIsNotNull() {
            addCriterion("ry_content is not null");
            return (Criteria) this;
        }

        public Criteria andRyContentEqualTo(String value) {
            addCriterion("ry_content =", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentNotEqualTo(String value) {
            addCriterion("ry_content <>", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentGreaterThan(String value) {
            addCriterion("ry_content >", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentGreaterThanOrEqualTo(String value) {
            addCriterion("ry_content >=", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentLessThan(String value) {
            addCriterion("ry_content <", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentLessThanOrEqualTo(String value) {
            addCriterion("ry_content <=", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentLike(String value) {
            addCriterion("ry_content like", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentNotLike(String value) {
            addCriterion("ry_content not like", value, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentIn(List<String> values) {
            addCriterion("ry_content in", values, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentNotIn(List<String> values) {
            addCriterion("ry_content not in", values, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentBetween(String value1, String value2) {
            addCriterion("ry_content between", value1, value2, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyContentNotBetween(String value1, String value2) {
            addCriterion("ry_content not between", value1, value2, "ryContent");
            return (Criteria) this;
        }

        public Criteria andRyNumberIsNull() {
            addCriterion("ry_number is null");
            return (Criteria) this;
        }

        public Criteria andRyNumberIsNotNull() {
            addCriterion("ry_number is not null");
            return (Criteria) this;
        }

        public Criteria andRyNumberEqualTo(Integer value) {
            addCriterion("ry_number =", value, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberNotEqualTo(Integer value) {
            addCriterion("ry_number <>", value, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberGreaterThan(Integer value) {
            addCriterion("ry_number >", value, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ry_number >=", value, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberLessThan(Integer value) {
            addCriterion("ry_number <", value, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ry_number <=", value, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberIn(List<Integer> values) {
            addCriterion("ry_number in", values, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberNotIn(List<Integer> values) {
            addCriterion("ry_number not in", values, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberBetween(Integer value1, Integer value2) {
            addCriterion("ry_number between", value1, value2, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ry_number not between", value1, value2, "ryNumber");
            return (Criteria) this;
        }

        public Criteria andRyTimeIsNull() {
            addCriterion("ry_time is null");
            return (Criteria) this;
        }

        public Criteria andRyTimeIsNotNull() {
            addCriterion("ry_time is not null");
            return (Criteria) this;
        }

        public Criteria andRyTimeEqualTo(Date value) {
            addCriterion("ry_time =", value, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeNotEqualTo(Date value) {
            addCriterion("ry_time <>", value, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeGreaterThan(Date value) {
            addCriterion("ry_time >", value, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ry_time >=", value, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeLessThan(Date value) {
            addCriterion("ry_time <", value, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ry_time <=", value, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeIn(List<Date> values) {
            addCriterion("ry_time in", values, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeNotIn(List<Date> values) {
            addCriterion("ry_time not in", values, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeBetween(Date value1, Date value2) {
            addCriterion("ry_time between", value1, value2, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ry_time not between", value1, value2, "ryTime");
            return (Criteria) this;
        }

        public Criteria andRyPsIdIsNull() {
            addCriterion("ry_ps_id is null");
            return (Criteria) this;
        }

        public Criteria andRyPsIdIsNotNull() {
            addCriterion("ry_ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andRyPsIdEqualTo(Integer value) {
            addCriterion("ry_ps_id =", value, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdNotEqualTo(Integer value) {
            addCriterion("ry_ps_id <>", value, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdGreaterThan(Integer value) {
            addCriterion("ry_ps_id >", value, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ry_ps_id >=", value, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdLessThan(Integer value) {
            addCriterion("ry_ps_id <", value, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ry_ps_id <=", value, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdIn(List<Integer> values) {
            addCriterion("ry_ps_id in", values, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdNotIn(List<Integer> values) {
            addCriterion("ry_ps_id not in", values, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdBetween(Integer value1, Integer value2) {
            addCriterion("ry_ps_id between", value1, value2, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyPsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ry_ps_id not between", value1, value2, "ryPsId");
            return (Criteria) this;
        }

        public Criteria andRyCodeIsNull() {
            addCriterion("ry_code is null");
            return (Criteria) this;
        }

        public Criteria andRyCodeIsNotNull() {
            addCriterion("ry_code is not null");
            return (Criteria) this;
        }

        public Criteria andRyCodeEqualTo(String value) {
            addCriterion("ry_code =", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeNotEqualTo(String value) {
            addCriterion("ry_code <>", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeGreaterThan(String value) {
            addCriterion("ry_code >", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ry_code >=", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeLessThan(String value) {
            addCriterion("ry_code <", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeLessThanOrEqualTo(String value) {
            addCriterion("ry_code <=", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeLike(String value) {
            addCriterion("ry_code like", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeNotLike(String value) {
            addCriterion("ry_code not like", value, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeIn(List<String> values) {
            addCriterion("ry_code in", values, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeNotIn(List<String> values) {
            addCriterion("ry_code not in", values, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeBetween(String value1, String value2) {
            addCriterion("ry_code between", value1, value2, "ryCode");
            return (Criteria) this;
        }

        public Criteria andRyCodeNotBetween(String value1, String value2) {
            addCriterion("ry_code not between", value1, value2, "ryCode");
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