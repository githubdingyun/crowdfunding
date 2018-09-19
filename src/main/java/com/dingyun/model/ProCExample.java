package com.dingyun.model;

import java.util.ArrayList;
import java.util.List;

public class ProCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProCExample() {
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

        public Criteria andProCIdIsNull() {
            addCriterion("pro_c_id is null");
            return (Criteria) this;
        }

        public Criteria andProCIdIsNotNull() {
            addCriterion("pro_c_id is not null");
            return (Criteria) this;
        }

        public Criteria andProCIdEqualTo(Integer value) {
            addCriterion("pro_c_id =", value, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdNotEqualTo(Integer value) {
            addCriterion("pro_c_id <>", value, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdGreaterThan(Integer value) {
            addCriterion("pro_c_id >", value, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_c_id >=", value, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdLessThan(Integer value) {
            addCriterion("pro_c_id <", value, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_c_id <=", value, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdIn(List<Integer> values) {
            addCriterion("pro_c_id in", values, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdNotIn(List<Integer> values) {
            addCriterion("pro_c_id not in", values, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_c_id between", value1, value2, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_c_id not between", value1, value2, "proCId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdIsNull() {
            addCriterion("pro_c_us_id is null");
            return (Criteria) this;
        }

        public Criteria andProCUsIdIsNotNull() {
            addCriterion("pro_c_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andProCUsIdEqualTo(Integer value) {
            addCriterion("pro_c_us_id =", value, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdNotEqualTo(Integer value) {
            addCriterion("pro_c_us_id <>", value, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdGreaterThan(Integer value) {
            addCriterion("pro_c_us_id >", value, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_c_us_id >=", value, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdLessThan(Integer value) {
            addCriterion("pro_c_us_id <", value, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_c_us_id <=", value, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdIn(List<Integer> values) {
            addCriterion("pro_c_us_id in", values, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdNotIn(List<Integer> values) {
            addCriterion("pro_c_us_id not in", values, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_c_us_id between", value1, value2, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_c_us_id not between", value1, value2, "proCUsId");
            return (Criteria) this;
        }

        public Criteria andProCVedioIsNull() {
            addCriterion("pro_c_vedio is null");
            return (Criteria) this;
        }

        public Criteria andProCVedioIsNotNull() {
            addCriterion("pro_c_vedio is not null");
            return (Criteria) this;
        }

        public Criteria andProCVedioEqualTo(String value) {
            addCriterion("pro_c_vedio =", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioNotEqualTo(String value) {
            addCriterion("pro_c_vedio <>", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioGreaterThan(String value) {
            addCriterion("pro_c_vedio >", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioGreaterThanOrEqualTo(String value) {
            addCriterion("pro_c_vedio >=", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioLessThan(String value) {
            addCriterion("pro_c_vedio <", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioLessThanOrEqualTo(String value) {
            addCriterion("pro_c_vedio <=", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioLike(String value) {
            addCriterion("pro_c_vedio like", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioNotLike(String value) {
            addCriterion("pro_c_vedio not like", value, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioIn(List<String> values) {
            addCriterion("pro_c_vedio in", values, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioNotIn(List<String> values) {
            addCriterion("pro_c_vedio not in", values, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioBetween(String value1, String value2) {
            addCriterion("pro_c_vedio between", value1, value2, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCVedioNotBetween(String value1, String value2) {
            addCriterion("pro_c_vedio not between", value1, value2, "proCVedio");
            return (Criteria) this;
        }

        public Criteria andProCStoryIsNull() {
            addCriterion("pro_c_story is null");
            return (Criteria) this;
        }

        public Criteria andProCStoryIsNotNull() {
            addCriterion("pro_c_story is not null");
            return (Criteria) this;
        }

        public Criteria andProCStoryEqualTo(String value) {
            addCriterion("pro_c_story =", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryNotEqualTo(String value) {
            addCriterion("pro_c_story <>", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryGreaterThan(String value) {
            addCriterion("pro_c_story >", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryGreaterThanOrEqualTo(String value) {
            addCriterion("pro_c_story >=", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryLessThan(String value) {
            addCriterion("pro_c_story <", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryLessThanOrEqualTo(String value) {
            addCriterion("pro_c_story <=", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryLike(String value) {
            addCriterion("pro_c_story like", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryNotLike(String value) {
            addCriterion("pro_c_story not like", value, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryIn(List<String> values) {
            addCriterion("pro_c_story in", values, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryNotIn(List<String> values) {
            addCriterion("pro_c_story not in", values, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryBetween(String value1, String value2) {
            addCriterion("pro_c_story between", value1, value2, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCStoryNotBetween(String value1, String value2) {
            addCriterion("pro_c_story not between", value1, value2, "proCStory");
            return (Criteria) this;
        }

        public Criteria andProCSupportIsNull() {
            addCriterion("pro_c_support is null");
            return (Criteria) this;
        }

        public Criteria andProCSupportIsNotNull() {
            addCriterion("pro_c_support is not null");
            return (Criteria) this;
        }

        public Criteria andProCSupportEqualTo(String value) {
            addCriterion("pro_c_support =", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportNotEqualTo(String value) {
            addCriterion("pro_c_support <>", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportGreaterThan(String value) {
            addCriterion("pro_c_support >", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportGreaterThanOrEqualTo(String value) {
            addCriterion("pro_c_support >=", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportLessThan(String value) {
            addCriterion("pro_c_support <", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportLessThanOrEqualTo(String value) {
            addCriterion("pro_c_support <=", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportLike(String value) {
            addCriterion("pro_c_support like", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportNotLike(String value) {
            addCriterion("pro_c_support not like", value, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportIn(List<String> values) {
            addCriterion("pro_c_support in", values, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportNotIn(List<String> values) {
            addCriterion("pro_c_support not in", values, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportBetween(String value1, String value2) {
            addCriterion("pro_c_support between", value1, value2, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCSupportNotBetween(String value1, String value2) {
            addCriterion("pro_c_support not between", value1, value2, "proCSupport");
            return (Criteria) this;
        }

        public Criteria andProCRepayIsNull() {
            addCriterion("pro_c_repay is null");
            return (Criteria) this;
        }

        public Criteria andProCRepayIsNotNull() {
            addCriterion("pro_c_repay is not null");
            return (Criteria) this;
        }

        public Criteria andProCRepayEqualTo(String value) {
            addCriterion("pro_c_repay =", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayNotEqualTo(String value) {
            addCriterion("pro_c_repay <>", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayGreaterThan(String value) {
            addCriterion("pro_c_repay >", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayGreaterThanOrEqualTo(String value) {
            addCriterion("pro_c_repay >=", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayLessThan(String value) {
            addCriterion("pro_c_repay <", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayLessThanOrEqualTo(String value) {
            addCriterion("pro_c_repay <=", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayLike(String value) {
            addCriterion("pro_c_repay like", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayNotLike(String value) {
            addCriterion("pro_c_repay not like", value, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayIn(List<String> values) {
            addCriterion("pro_c_repay in", values, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayNotIn(List<String> values) {
            addCriterion("pro_c_repay not in", values, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayBetween(String value1, String value2) {
            addCriterion("pro_c_repay between", value1, value2, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCRepayNotBetween(String value1, String value2) {
            addCriterion("pro_c_repay not between", value1, value2, "proCRepay");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeIsNull() {
            addCriterion("pro_c_aboutme is null");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeIsNotNull() {
            addCriterion("pro_c_aboutme is not null");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeEqualTo(String value) {
            addCriterion("pro_c_aboutme =", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeNotEqualTo(String value) {
            addCriterion("pro_c_aboutme <>", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeGreaterThan(String value) {
            addCriterion("pro_c_aboutme >", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_c_aboutme >=", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeLessThan(String value) {
            addCriterion("pro_c_aboutme <", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeLessThanOrEqualTo(String value) {
            addCriterion("pro_c_aboutme <=", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeLike(String value) {
            addCriterion("pro_c_aboutme like", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeNotLike(String value) {
            addCriterion("pro_c_aboutme not like", value, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeIn(List<String> values) {
            addCriterion("pro_c_aboutme in", values, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeNotIn(List<String> values) {
            addCriterion("pro_c_aboutme not in", values, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeBetween(String value1, String value2) {
            addCriterion("pro_c_aboutme between", value1, value2, "proCAboutme");
            return (Criteria) this;
        }

        public Criteria andProCAboutmeNotBetween(String value1, String value2) {
            addCriterion("pro_c_aboutme not between", value1, value2, "proCAboutme");
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