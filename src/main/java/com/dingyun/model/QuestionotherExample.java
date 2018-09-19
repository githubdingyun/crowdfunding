package com.dingyun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionotherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QuestionotherExample() {
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

        public Criteria andQuestionotheridIsNull() {
            addCriterion("questionotherid is null");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridIsNotNull() {
            addCriterion("questionotherid is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridEqualTo(Integer value) {
            addCriterion("questionotherid =", value, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridNotEqualTo(Integer value) {
            addCriterion("questionotherid <>", value, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridGreaterThan(Integer value) {
            addCriterion("questionotherid >", value, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionotherid >=", value, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridLessThan(Integer value) {
            addCriterion("questionotherid <", value, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridLessThanOrEqualTo(Integer value) {
            addCriterion("questionotherid <=", value, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridIn(List<Integer> values) {
            addCriterion("questionotherid in", values, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridNotIn(List<Integer> values) {
            addCriterion("questionotherid not in", values, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridBetween(Integer value1, Integer value2) {
            addCriterion("questionotherid between", value1, value2, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionotheridNotBetween(Integer value1, Integer value2) {
            addCriterion("questionotherid not between", value1, value2, "questionotherid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNull() {
            addCriterion("questionid is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("questionid is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Integer value) {
            addCriterion("questionid =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Integer value) {
            addCriterion("questionid <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Integer value) {
            addCriterion("questionid >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionid >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Integer value) {
            addCriterion("questionid <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("questionid <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Integer> values) {
            addCriterion("questionid in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Integer> values) {
            addCriterion("questionid not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("questionid between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionid not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameIsNull() {
            addCriterion("questionothername is null");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameIsNotNull() {
            addCriterion("questionothername is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameEqualTo(String value) {
            addCriterion("questionothername =", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameNotEqualTo(String value) {
            addCriterion("questionothername <>", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameGreaterThan(String value) {
            addCriterion("questionothername >", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameGreaterThanOrEqualTo(String value) {
            addCriterion("questionothername >=", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameLessThan(String value) {
            addCriterion("questionothername <", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameLessThanOrEqualTo(String value) {
            addCriterion("questionothername <=", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameLike(String value) {
            addCriterion("questionothername like", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameNotLike(String value) {
            addCriterion("questionothername not like", value, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameIn(List<String> values) {
            addCriterion("questionothername in", values, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameNotIn(List<String> values) {
            addCriterion("questionothername not in", values, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameBetween(String value1, String value2) {
            addCriterion("questionothername between", value1, value2, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionothernameNotBetween(String value1, String value2) {
            addCriterion("questionothername not between", value1, value2, "questionothername");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIsNull() {
            addCriterion("questionanswer is null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIsNotNull() {
            addCriterion("questionanswer is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerEqualTo(String value) {
            addCriterion("questionanswer =", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotEqualTo(String value) {
            addCriterion("questionanswer <>", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerGreaterThan(String value) {
            addCriterion("questionanswer >", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerGreaterThanOrEqualTo(String value) {
            addCriterion("questionanswer >=", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLessThan(String value) {
            addCriterion("questionanswer <", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLessThanOrEqualTo(String value) {
            addCriterion("questionanswer <=", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLike(String value) {
            addCriterion("questionanswer like", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotLike(String value) {
            addCriterion("questionanswer not like", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIn(List<String> values) {
            addCriterion("questionanswer in", values, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotIn(List<String> values) {
            addCriterion("questionanswer not in", values, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerBetween(String value1, String value2) {
            addCriterion("questionanswer between", value1, value2, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotBetween(String value1, String value2) {
            addCriterion("questionanswer not between", value1, value2, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestiondateIsNull() {
            addCriterion("questiondate is null");
            return (Criteria) this;
        }

        public Criteria andQuestiondateIsNotNull() {
            addCriterion("questiondate is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiondateEqualTo(Date value) {
            addCriterion("questiondate =", value, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateNotEqualTo(Date value) {
            addCriterion("questiondate <>", value, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateGreaterThan(Date value) {
            addCriterion("questiondate >", value, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("questiondate >=", value, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateLessThan(Date value) {
            addCriterion("questiondate <", value, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateLessThanOrEqualTo(Date value) {
            addCriterion("questiondate <=", value, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateIn(List<Date> values) {
            addCriterion("questiondate in", values, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateNotIn(List<Date> values) {
            addCriterion("questiondate not in", values, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateBetween(Date value1, Date value2) {
            addCriterion("questiondate between", value1, value2, "questiondate");
            return (Criteria) this;
        }

        public Criteria andQuestiondateNotBetween(Date value1, Date value2) {
            addCriterion("questiondate not between", value1, value2, "questiondate");
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