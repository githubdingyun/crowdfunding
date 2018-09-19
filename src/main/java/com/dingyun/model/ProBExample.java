package com.dingyun.model;

import java.util.ArrayList;
import java.util.List;

public class ProBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProBExample() {
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

        public Criteria andProBIdIsNull() {
            addCriterion("pro_b_id is null");
            return (Criteria) this;
        }

        public Criteria andProBIdIsNotNull() {
            addCriterion("pro_b_id is not null");
            return (Criteria) this;
        }

        public Criteria andProBIdEqualTo(Integer value) {
            addCriterion("pro_b_id =", value, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdNotEqualTo(Integer value) {
            addCriterion("pro_b_id <>", value, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdGreaterThan(Integer value) {
            addCriterion("pro_b_id >", value, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_b_id >=", value, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdLessThan(Integer value) {
            addCriterion("pro_b_id <", value, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_b_id <=", value, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdIn(List<Integer> values) {
            addCriterion("pro_b_id in", values, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdNotIn(List<Integer> values) {
            addCriterion("pro_b_id not in", values, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_b_id between", value1, value2, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_b_id not between", value1, value2, "proBId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdIsNull() {
            addCriterion("pro_b_us_id is null");
            return (Criteria) this;
        }

        public Criteria andProBUsIdIsNotNull() {
            addCriterion("pro_b_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andProBUsIdEqualTo(Integer value) {
            addCriterion("pro_b_us_id =", value, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdNotEqualTo(Integer value) {
            addCriterion("pro_b_us_id <>", value, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdGreaterThan(Integer value) {
            addCriterion("pro_b_us_id >", value, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_b_us_id >=", value, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdLessThan(Integer value) {
            addCriterion("pro_b_us_id <", value, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_b_us_id <=", value, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdIn(List<Integer> values) {
            addCriterion("pro_b_us_id in", values, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdNotIn(List<Integer> values) {
            addCriterion("pro_b_us_id not in", values, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_b_us_id between", value1, value2, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_b_us_id not between", value1, value2, "proBUsId");
            return (Criteria) this;
        }

        public Criteria andProBFileIsNull() {
            addCriterion("pro_b_file is null");
            return (Criteria) this;
        }

        public Criteria andProBFileIsNotNull() {
            addCriterion("pro_b_file is not null");
            return (Criteria) this;
        }

        public Criteria andProBFileEqualTo(String value) {
            addCriterion("pro_b_file =", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileNotEqualTo(String value) {
            addCriterion("pro_b_file <>", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileGreaterThan(String value) {
            addCriterion("pro_b_file >", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileGreaterThanOrEqualTo(String value) {
            addCriterion("pro_b_file >=", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileLessThan(String value) {
            addCriterion("pro_b_file <", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileLessThanOrEqualTo(String value) {
            addCriterion("pro_b_file <=", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileLike(String value) {
            addCriterion("pro_b_file like", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileNotLike(String value) {
            addCriterion("pro_b_file not like", value, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileIn(List<String> values) {
            addCriterion("pro_b_file in", values, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileNotIn(List<String> values) {
            addCriterion("pro_b_file not in", values, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileBetween(String value1, String value2) {
            addCriterion("pro_b_file between", value1, value2, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBFileNotBetween(String value1, String value2) {
            addCriterion("pro_b_file not between", value1, value2, "proBFile");
            return (Criteria) this;
        }

        public Criteria andProBNameIsNull() {
            addCriterion("pro_b_name is null");
            return (Criteria) this;
        }

        public Criteria andProBNameIsNotNull() {
            addCriterion("pro_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andProBNameEqualTo(String value) {
            addCriterion("pro_b_name =", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameNotEqualTo(String value) {
            addCriterion("pro_b_name <>", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameGreaterThan(String value) {
            addCriterion("pro_b_name >", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_b_name >=", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameLessThan(String value) {
            addCriterion("pro_b_name <", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameLessThanOrEqualTo(String value) {
            addCriterion("pro_b_name <=", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameLike(String value) {
            addCriterion("pro_b_name like", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameNotLike(String value) {
            addCriterion("pro_b_name not like", value, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameIn(List<String> values) {
            addCriterion("pro_b_name in", values, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameNotIn(List<String> values) {
            addCriterion("pro_b_name not in", values, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameBetween(String value1, String value2) {
            addCriterion("pro_b_name between", value1, value2, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBNameNotBetween(String value1, String value2) {
            addCriterion("pro_b_name not between", value1, value2, "proBName");
            return (Criteria) this;
        }

        public Criteria andProBGoalIsNull() {
            addCriterion("pro_b_goal is null");
            return (Criteria) this;
        }

        public Criteria andProBGoalIsNotNull() {
            addCriterion("pro_b_goal is not null");
            return (Criteria) this;
        }

        public Criteria andProBGoalEqualTo(String value) {
            addCriterion("pro_b_goal =", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalNotEqualTo(String value) {
            addCriterion("pro_b_goal <>", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalGreaterThan(String value) {
            addCriterion("pro_b_goal >", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalGreaterThanOrEqualTo(String value) {
            addCriterion("pro_b_goal >=", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalLessThan(String value) {
            addCriterion("pro_b_goal <", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalLessThanOrEqualTo(String value) {
            addCriterion("pro_b_goal <=", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalLike(String value) {
            addCriterion("pro_b_goal like", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalNotLike(String value) {
            addCriterion("pro_b_goal not like", value, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalIn(List<String> values) {
            addCriterion("pro_b_goal in", values, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalNotIn(List<String> values) {
            addCriterion("pro_b_goal not in", values, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalBetween(String value1, String value2) {
            addCriterion("pro_b_goal between", value1, value2, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBGoalNotBetween(String value1, String value2) {
            addCriterion("pro_b_goal not between", value1, value2, "proBGoal");
            return (Criteria) this;
        }

        public Criteria andProBAddressIsNull() {
            addCriterion("pro_b_address is null");
            return (Criteria) this;
        }

        public Criteria andProBAddressIsNotNull() {
            addCriterion("pro_b_address is not null");
            return (Criteria) this;
        }

        public Criteria andProBAddressEqualTo(String value) {
            addCriterion("pro_b_address =", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressNotEqualTo(String value) {
            addCriterion("pro_b_address <>", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressGreaterThan(String value) {
            addCriterion("pro_b_address >", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pro_b_address >=", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressLessThan(String value) {
            addCriterion("pro_b_address <", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressLessThanOrEqualTo(String value) {
            addCriterion("pro_b_address <=", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressLike(String value) {
            addCriterion("pro_b_address like", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressNotLike(String value) {
            addCriterion("pro_b_address not like", value, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressIn(List<String> values) {
            addCriterion("pro_b_address in", values, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressNotIn(List<String> values) {
            addCriterion("pro_b_address not in", values, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressBetween(String value1, String value2) {
            addCriterion("pro_b_address between", value1, value2, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBAddressNotBetween(String value1, String value2) {
            addCriterion("pro_b_address not between", value1, value2, "proBAddress");
            return (Criteria) this;
        }

        public Criteria andProBMoneyIsNull() {
            addCriterion("pro_b_money is null");
            return (Criteria) this;
        }

        public Criteria andProBMoneyIsNotNull() {
            addCriterion("pro_b_money is not null");
            return (Criteria) this;
        }

        public Criteria andProBMoneyEqualTo(String value) {
            addCriterion("pro_b_money =", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyNotEqualTo(String value) {
            addCriterion("pro_b_money <>", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyGreaterThan(String value) {
            addCriterion("pro_b_money >", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("pro_b_money >=", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyLessThan(String value) {
            addCriterion("pro_b_money <", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyLessThanOrEqualTo(String value) {
            addCriterion("pro_b_money <=", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyLike(String value) {
            addCriterion("pro_b_money like", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyNotLike(String value) {
            addCriterion("pro_b_money not like", value, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyIn(List<String> values) {
            addCriterion("pro_b_money in", values, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyNotIn(List<String> values) {
            addCriterion("pro_b_money not in", values, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyBetween(String value1, String value2) {
            addCriterion("pro_b_money between", value1, value2, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBMoneyNotBetween(String value1, String value2) {
            addCriterion("pro_b_money not between", value1, value2, "proBMoney");
            return (Criteria) this;
        }

        public Criteria andProBDatenumIsNull() {
            addCriterion("pro_b_datenum is null");
            return (Criteria) this;
        }

        public Criteria andProBDatenumIsNotNull() {
            addCriterion("pro_b_datenum is not null");
            return (Criteria) this;
        }

        public Criteria andProBDatenumEqualTo(Integer value) {
            addCriterion("pro_b_datenum =", value, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumNotEqualTo(Integer value) {
            addCriterion("pro_b_datenum <>", value, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumGreaterThan(Integer value) {
            addCriterion("pro_b_datenum >", value, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_b_datenum >=", value, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumLessThan(Integer value) {
            addCriterion("pro_b_datenum <", value, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumLessThanOrEqualTo(Integer value) {
            addCriterion("pro_b_datenum <=", value, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumIn(List<Integer> values) {
            addCriterion("pro_b_datenum in", values, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumNotIn(List<Integer> values) {
            addCriterion("pro_b_datenum not in", values, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumBetween(Integer value1, Integer value2) {
            addCriterion("pro_b_datenum between", value1, value2, "proBDatenum");
            return (Criteria) this;
        }

        public Criteria andProBDatenumNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_b_datenum not between", value1, value2, "proBDatenum");
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