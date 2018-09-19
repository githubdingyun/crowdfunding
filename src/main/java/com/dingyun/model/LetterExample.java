package com.dingyun.model;

import java.util.ArrayList;
import java.util.List;

public class LetterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LetterExample() {
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

        public Criteria andLeIdIsNull() {
            addCriterion("le_id is null");
            return (Criteria) this;
        }

        public Criteria andLeIdIsNotNull() {
            addCriterion("le_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeIdEqualTo(Integer value) {
            addCriterion("le_id =", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotEqualTo(Integer value) {
            addCriterion("le_id <>", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdGreaterThan(Integer value) {
            addCriterion("le_id >", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_id >=", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdLessThan(Integer value) {
            addCriterion("le_id <", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdLessThanOrEqualTo(Integer value) {
            addCriterion("le_id <=", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdIn(List<Integer> values) {
            addCriterion("le_id in", values, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotIn(List<Integer> values) {
            addCriterion("le_id not in", values, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdBetween(Integer value1, Integer value2) {
            addCriterion("le_id between", value1, value2, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("le_id not between", value1, value2, "leId");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridIsNull() {
            addCriterion("le_us_addresserid is null");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridIsNotNull() {
            addCriterion("le_us_addresserid is not null");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridEqualTo(Integer value) {
            addCriterion("le_us_addresserid =", value, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridNotEqualTo(Integer value) {
            addCriterion("le_us_addresserid <>", value, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridGreaterThan(Integer value) {
            addCriterion("le_us_addresserid >", value, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_us_addresserid >=", value, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridLessThan(Integer value) {
            addCriterion("le_us_addresserid <", value, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridLessThanOrEqualTo(Integer value) {
            addCriterion("le_us_addresserid <=", value, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridIn(List<Integer> values) {
            addCriterion("le_us_addresserid in", values, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridNotIn(List<Integer> values) {
            addCriterion("le_us_addresserid not in", values, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridBetween(Integer value1, Integer value2) {
            addCriterion("le_us_addresserid between", value1, value2, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsAddresseridNotBetween(Integer value1, Integer value2) {
            addCriterion("le_us_addresserid not between", value1, value2, "leUsAddresserid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidIsNull() {
            addCriterion("le_us_recipientsid is null");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidIsNotNull() {
            addCriterion("le_us_recipientsid is not null");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidEqualTo(Integer value) {
            addCriterion("le_us_recipientsid =", value, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidNotEqualTo(Integer value) {
            addCriterion("le_us_recipientsid <>", value, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidGreaterThan(Integer value) {
            addCriterion("le_us_recipientsid >", value, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_us_recipientsid >=", value, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidLessThan(Integer value) {
            addCriterion("le_us_recipientsid <", value, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidLessThanOrEqualTo(Integer value) {
            addCriterion("le_us_recipientsid <=", value, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidIn(List<Integer> values) {
            addCriterion("le_us_recipientsid in", values, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidNotIn(List<Integer> values) {
            addCriterion("le_us_recipientsid not in", values, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidBetween(Integer value1, Integer value2) {
            addCriterion("le_us_recipientsid between", value1, value2, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeUsRecipientsidNotBetween(Integer value1, Integer value2) {
            addCriterion("le_us_recipientsid not between", value1, value2, "leUsRecipientsid");
            return (Criteria) this;
        }

        public Criteria andLeContentIsNull() {
            addCriterion("le_content is null");
            return (Criteria) this;
        }

        public Criteria andLeContentIsNotNull() {
            addCriterion("le_content is not null");
            return (Criteria) this;
        }

        public Criteria andLeContentEqualTo(String value) {
            addCriterion("le_content =", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentNotEqualTo(String value) {
            addCriterion("le_content <>", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentGreaterThan(String value) {
            addCriterion("le_content >", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentGreaterThanOrEqualTo(String value) {
            addCriterion("le_content >=", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentLessThan(String value) {
            addCriterion("le_content <", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentLessThanOrEqualTo(String value) {
            addCriterion("le_content <=", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentLike(String value) {
            addCriterion("le_content like", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentNotLike(String value) {
            addCriterion("le_content not like", value, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentIn(List<String> values) {
            addCriterion("le_content in", values, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentNotIn(List<String> values) {
            addCriterion("le_content not in", values, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentBetween(String value1, String value2) {
            addCriterion("le_content between", value1, value2, "leContent");
            return (Criteria) this;
        }

        public Criteria andLeContentNotBetween(String value1, String value2) {
            addCriterion("le_content not between", value1, value2, "leContent");
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