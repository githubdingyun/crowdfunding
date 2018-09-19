package com.dingyun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProjectstypeExample() {
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

        public Criteria andPstIdIsNull() {
            addCriterion("pst_id is null");
            return (Criteria) this;
        }

        public Criteria andPstIdIsNotNull() {
            addCriterion("pst_id is not null");
            return (Criteria) this;
        }

        public Criteria andPstIdEqualTo(Integer value) {
            addCriterion("pst_id =", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotEqualTo(Integer value) {
            addCriterion("pst_id <>", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdGreaterThan(Integer value) {
            addCriterion("pst_id >", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pst_id >=", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLessThan(Integer value) {
            addCriterion("pst_id <", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLessThanOrEqualTo(Integer value) {
            addCriterion("pst_id <=", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdIn(List<Integer> values) {
            addCriterion("pst_id in", values, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotIn(List<Integer> values) {
            addCriterion("pst_id not in", values, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdBetween(Integer value1, Integer value2) {
            addCriterion("pst_id between", value1, value2, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pst_id not between", value1, value2, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstNameIsNull() {
            addCriterion("pst_name is null");
            return (Criteria) this;
        }

        public Criteria andPstNameIsNotNull() {
            addCriterion("pst_name is not null");
            return (Criteria) this;
        }

        public Criteria andPstNameEqualTo(String value) {
            addCriterion("pst_name =", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotEqualTo(String value) {
            addCriterion("pst_name <>", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameGreaterThan(String value) {
            addCriterion("pst_name >", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameGreaterThanOrEqualTo(String value) {
            addCriterion("pst_name >=", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameLessThan(String value) {
            addCriterion("pst_name <", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameLessThanOrEqualTo(String value) {
            addCriterion("pst_name <=", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameLike(String value) {
            addCriterion("pst_name like", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotLike(String value) {
            addCriterion("pst_name not like", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameIn(List<String> values) {
            addCriterion("pst_name in", values, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotIn(List<String> values) {
            addCriterion("pst_name not in", values, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameBetween(String value1, String value2) {
            addCriterion("pst_name between", value1, value2, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotBetween(String value1, String value2) {
            addCriterion("pst_name not between", value1, value2, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstDescIsNull() {
            addCriterion("pst_desc is null");
            return (Criteria) this;
        }

        public Criteria andPstDescIsNotNull() {
            addCriterion("pst_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPstDescEqualTo(String value) {
            addCriterion("pst_desc =", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescNotEqualTo(String value) {
            addCriterion("pst_desc <>", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescGreaterThan(String value) {
            addCriterion("pst_desc >", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescGreaterThanOrEqualTo(String value) {
            addCriterion("pst_desc >=", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescLessThan(String value) {
            addCriterion("pst_desc <", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescLessThanOrEqualTo(String value) {
            addCriterion("pst_desc <=", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescLike(String value) {
            addCriterion("pst_desc like", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescNotLike(String value) {
            addCriterion("pst_desc not like", value, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescIn(List<String> values) {
            addCriterion("pst_desc in", values, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescNotIn(List<String> values) {
            addCriterion("pst_desc not in", values, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescBetween(String value1, String value2) {
            addCriterion("pst_desc between", value1, value2, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstDescNotBetween(String value1, String value2) {
            addCriterion("pst_desc not between", value1, value2, "pstDesc");
            return (Criteria) this;
        }

        public Criteria andPstStardateIsNull() {
            addCriterion("pst_stardate is null");
            return (Criteria) this;
        }

        public Criteria andPstStardateIsNotNull() {
            addCriterion("pst_stardate is not null");
            return (Criteria) this;
        }

        public Criteria andPstStardateEqualTo(Date value) {
            addCriterion("pst_stardate =", value, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateNotEqualTo(Date value) {
            addCriterion("pst_stardate <>", value, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateGreaterThan(Date value) {
            addCriterion("pst_stardate >", value, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateGreaterThanOrEqualTo(Date value) {
            addCriterion("pst_stardate >=", value, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateLessThan(Date value) {
            addCriterion("pst_stardate <", value, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateLessThanOrEqualTo(Date value) {
            addCriterion("pst_stardate <=", value, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateIn(List<Date> values) {
            addCriterion("pst_stardate in", values, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateNotIn(List<Date> values) {
            addCriterion("pst_stardate not in", values, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateBetween(Date value1, Date value2) {
            addCriterion("pst_stardate between", value1, value2, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstStardateNotBetween(Date value1, Date value2) {
            addCriterion("pst_stardate not between", value1, value2, "pstStardate");
            return (Criteria) this;
        }

        public Criteria andPstTypeIsNull() {
            addCriterion("pst_type is null");
            return (Criteria) this;
        }

        public Criteria andPstTypeIsNotNull() {
            addCriterion("pst_type is not null");
            return (Criteria) this;
        }

        public Criteria andPstTypeEqualTo(Integer value) {
            addCriterion("pst_type =", value, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeNotEqualTo(Integer value) {
            addCriterion("pst_type <>", value, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeGreaterThan(Integer value) {
            addCriterion("pst_type >", value, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pst_type >=", value, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeLessThan(Integer value) {
            addCriterion("pst_type <", value, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pst_type <=", value, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeIn(List<Integer> values) {
            addCriterion("pst_type in", values, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeNotIn(List<Integer> values) {
            addCriterion("pst_type not in", values, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeBetween(Integer value1, Integer value2) {
            addCriterion("pst_type between", value1, value2, "pstType");
            return (Criteria) this;
        }

        public Criteria andPstTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pst_type not between", value1, value2, "pstType");
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