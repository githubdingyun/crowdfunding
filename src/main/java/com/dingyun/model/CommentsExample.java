package com.dingyun.model;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CommentsExample() {
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

        public Criteria andCmIdIsNull() {
            addCriterion("cm_id is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("cm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_id >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdIsNull() {
            addCriterion("cm_us_id is null");
            return (Criteria) this;
        }

        public Criteria andCmUsIdIsNotNull() {
            addCriterion("cm_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmUsIdEqualTo(Integer value) {
            addCriterion("cm_us_id =", value, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdNotEqualTo(Integer value) {
            addCriterion("cm_us_id <>", value, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdGreaterThan(Integer value) {
            addCriterion("cm_us_id >", value, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_us_id >=", value, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdLessThan(Integer value) {
            addCriterion("cm_us_id <", value, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_us_id <=", value, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdIn(List<Integer> values) {
            addCriterion("cm_us_id in", values, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdNotIn(List<Integer> values) {
            addCriterion("cm_us_id not in", values, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_us_id between", value1, value2, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_us_id not between", value1, value2, "cmUsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdIsNull() {
            addCriterion("cm_ps_id is null");
            return (Criteria) this;
        }

        public Criteria andCmPsIdIsNotNull() {
            addCriterion("cm_ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmPsIdEqualTo(Integer value) {
            addCriterion("cm_ps_id =", value, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdNotEqualTo(Integer value) {
            addCriterion("cm_ps_id <>", value, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdGreaterThan(Integer value) {
            addCriterion("cm_ps_id >", value, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_ps_id >=", value, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdLessThan(Integer value) {
            addCriterion("cm_ps_id <", value, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_ps_id <=", value, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdIn(List<Integer> values) {
            addCriterion("cm_ps_id in", values, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdNotIn(List<Integer> values) {
            addCriterion("cm_ps_id not in", values, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_ps_id between", value1, value2, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmPsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_ps_id not between", value1, value2, "cmPsId");
            return (Criteria) this;
        }

        public Criteria andCmContentIsNull() {
            addCriterion("cm_content is null");
            return (Criteria) this;
        }

        public Criteria andCmContentIsNotNull() {
            addCriterion("cm_content is not null");
            return (Criteria) this;
        }

        public Criteria andCmContentEqualTo(String value) {
            addCriterion("cm_content =", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotEqualTo(String value) {
            addCriterion("cm_content <>", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentGreaterThan(String value) {
            addCriterion("cm_content >", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentGreaterThanOrEqualTo(String value) {
            addCriterion("cm_content >=", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentLessThan(String value) {
            addCriterion("cm_content <", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentLessThanOrEqualTo(String value) {
            addCriterion("cm_content <=", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentLike(String value) {
            addCriterion("cm_content like", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotLike(String value) {
            addCriterion("cm_content not like", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentIn(List<String> values) {
            addCriterion("cm_content in", values, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotIn(List<String> values) {
            addCriterion("cm_content not in", values, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentBetween(String value1, String value2) {
            addCriterion("cm_content between", value1, value2, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotBetween(String value1, String value2) {
            addCriterion("cm_content not between", value1, value2, "cmContent");
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