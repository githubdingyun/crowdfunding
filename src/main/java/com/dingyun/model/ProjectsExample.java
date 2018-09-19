package com.dingyun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProjectsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(Integer value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(Integer value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(Integer value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(Integer value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<Integer> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<Integer> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdIsNull() {
            addCriterion("ps_us_id is null");
            return (Criteria) this;
        }

        public Criteria andPsUsIdIsNotNull() {
            addCriterion("ps_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsUsIdEqualTo(Integer value) {
            addCriterion("ps_us_id =", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotEqualTo(Integer value) {
            addCriterion("ps_us_id <>", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdGreaterThan(Integer value) {
            addCriterion("ps_us_id >", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_us_id >=", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdLessThan(Integer value) {
            addCriterion("ps_us_id <", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_us_id <=", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdIn(List<Integer> values) {
            addCriterion("ps_us_id in", values, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotIn(List<Integer> values) {
            addCriterion("ps_us_id not in", values, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_us_id between", value1, value2, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_us_id not between", value1, value2, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsCustNameIsNull() {
            addCriterion("ps_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andPsCustNameIsNotNull() {
            addCriterion("ps_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustNameEqualTo(String value) {
            addCriterion("ps_cust_name =", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameNotEqualTo(String value) {
            addCriterion("ps_cust_name <>", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameGreaterThan(String value) {
            addCriterion("ps_cust_name >", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_cust_name >=", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameLessThan(String value) {
            addCriterion("ps_cust_name <", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameLessThanOrEqualTo(String value) {
            addCriterion("ps_cust_name <=", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameLike(String value) {
            addCriterion("ps_cust_name like", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameNotLike(String value) {
            addCriterion("ps_cust_name not like", value, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameIn(List<String> values) {
            addCriterion("ps_cust_name in", values, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameNotIn(List<String> values) {
            addCriterion("ps_cust_name not in", values, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameBetween(String value1, String value2) {
            addCriterion("ps_cust_name between", value1, value2, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustNameNotBetween(String value1, String value2) {
            addCriterion("ps_cust_name not between", value1, value2, "psCustName");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneIsNull() {
            addCriterion("ps_cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneIsNotNull() {
            addCriterion("ps_cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneEqualTo(String value) {
            addCriterion("ps_cust_phone =", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneNotEqualTo(String value) {
            addCriterion("ps_cust_phone <>", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneGreaterThan(String value) {
            addCriterion("ps_cust_phone >", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ps_cust_phone >=", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneLessThan(String value) {
            addCriterion("ps_cust_phone <", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneLessThanOrEqualTo(String value) {
            addCriterion("ps_cust_phone <=", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneLike(String value) {
            addCriterion("ps_cust_phone like", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneNotLike(String value) {
            addCriterion("ps_cust_phone not like", value, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneIn(List<String> values) {
            addCriterion("ps_cust_phone in", values, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneNotIn(List<String> values) {
            addCriterion("ps_cust_phone not in", values, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneBetween(String value1, String value2) {
            addCriterion("ps_cust_phone between", value1, value2, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustPhoneNotBetween(String value1, String value2) {
            addCriterion("ps_cust_phone not between", value1, value2, "psCustPhone");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressIsNull() {
            addCriterion("ps_cust_address is null");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressIsNotNull() {
            addCriterion("ps_cust_address is not null");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressEqualTo(String value) {
            addCriterion("ps_cust_address =", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressNotEqualTo(String value) {
            addCriterion("ps_cust_address <>", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressGreaterThan(String value) {
            addCriterion("ps_cust_address >", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ps_cust_address >=", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressLessThan(String value) {
            addCriterion("ps_cust_address <", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressLessThanOrEqualTo(String value) {
            addCriterion("ps_cust_address <=", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressLike(String value) {
            addCriterion("ps_cust_address like", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressNotLike(String value) {
            addCriterion("ps_cust_address not like", value, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressIn(List<String> values) {
            addCriterion("ps_cust_address in", values, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressNotIn(List<String> values) {
            addCriterion("ps_cust_address not in", values, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressBetween(String value1, String value2) {
            addCriterion("ps_cust_address between", value1, value2, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsCustAddressNotBetween(String value1, String value2) {
            addCriterion("ps_cust_address not between", value1, value2, "psCustAddress");
            return (Criteria) this;
        }

        public Criteria andPsPstIdIsNull() {
            addCriterion("ps_pst_id is null");
            return (Criteria) this;
        }

        public Criteria andPsPstIdIsNotNull() {
            addCriterion("ps_pst_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsPstIdEqualTo(Integer value) {
            addCriterion("ps_pst_id =", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdNotEqualTo(Integer value) {
            addCriterion("ps_pst_id <>", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdGreaterThan(Integer value) {
            addCriterion("ps_pst_id >", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_pst_id >=", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdLessThan(Integer value) {
            addCriterion("ps_pst_id <", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_pst_id <=", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdIn(List<Integer> values) {
            addCriterion("ps_pst_id in", values, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdNotIn(List<Integer> values) {
            addCriterion("ps_pst_id not in", values, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_pst_id between", value1, value2, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_pst_id not between", value1, value2, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsFileIsNull() {
            addCriterion("ps_file is null");
            return (Criteria) this;
        }

        public Criteria andPsFileIsNotNull() {
            addCriterion("ps_file is not null");
            return (Criteria) this;
        }

        public Criteria andPsFileEqualTo(String value) {
            addCriterion("ps_file =", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileNotEqualTo(String value) {
            addCriterion("ps_file <>", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileGreaterThan(String value) {
            addCriterion("ps_file >", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileGreaterThanOrEqualTo(String value) {
            addCriterion("ps_file >=", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileLessThan(String value) {
            addCriterion("ps_file <", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileLessThanOrEqualTo(String value) {
            addCriterion("ps_file <=", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileLike(String value) {
            addCriterion("ps_file like", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileNotLike(String value) {
            addCriterion("ps_file not like", value, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileIn(List<String> values) {
            addCriterion("ps_file in", values, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileNotIn(List<String> values) {
            addCriterion("ps_file not in", values, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileBetween(String value1, String value2) {
            addCriterion("ps_file between", value1, value2, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsFileNotBetween(String value1, String value2) {
            addCriterion("ps_file not between", value1, value2, "psFile");
            return (Criteria) this;
        }

        public Criteria andPsNameIsNull() {
            addCriterion("ps_name is null");
            return (Criteria) this;
        }

        public Criteria andPsNameIsNotNull() {
            addCriterion("ps_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsNameEqualTo(String value) {
            addCriterion("ps_name =", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotEqualTo(String value) {
            addCriterion("ps_name <>", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameGreaterThan(String value) {
            addCriterion("ps_name >", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_name >=", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLessThan(String value) {
            addCriterion("ps_name <", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLessThanOrEqualTo(String value) {
            addCriterion("ps_name <=", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLike(String value) {
            addCriterion("ps_name like", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotLike(String value) {
            addCriterion("ps_name not like", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameIn(List<String> values) {
            addCriterion("ps_name in", values, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotIn(List<String> values) {
            addCriterion("ps_name not in", values, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameBetween(String value1, String value2) {
            addCriterion("ps_name between", value1, value2, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotBetween(String value1, String value2) {
            addCriterion("ps_name not between", value1, value2, "psName");
            return (Criteria) this;
        }

        public Criteria andPsGoalIsNull() {
            addCriterion("ps_goal is null");
            return (Criteria) this;
        }

        public Criteria andPsGoalIsNotNull() {
            addCriterion("ps_goal is not null");
            return (Criteria) this;
        }

        public Criteria andPsGoalEqualTo(String value) {
            addCriterion("ps_goal =", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalNotEqualTo(String value) {
            addCriterion("ps_goal <>", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalGreaterThan(String value) {
            addCriterion("ps_goal >", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalGreaterThanOrEqualTo(String value) {
            addCriterion("ps_goal >=", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalLessThan(String value) {
            addCriterion("ps_goal <", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalLessThanOrEqualTo(String value) {
            addCriterion("ps_goal <=", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalLike(String value) {
            addCriterion("ps_goal like", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalNotLike(String value) {
            addCriterion("ps_goal not like", value, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalIn(List<String> values) {
            addCriterion("ps_goal in", values, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalNotIn(List<String> values) {
            addCriterion("ps_goal not in", values, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalBetween(String value1, String value2) {
            addCriterion("ps_goal between", value1, value2, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsGoalNotBetween(String value1, String value2) {
            addCriterion("ps_goal not between", value1, value2, "psGoal");
            return (Criteria) this;
        }

        public Criteria andPsAddressIsNull() {
            addCriterion("ps_address is null");
            return (Criteria) this;
        }

        public Criteria andPsAddressIsNotNull() {
            addCriterion("ps_address is not null");
            return (Criteria) this;
        }

        public Criteria andPsAddressEqualTo(String value) {
            addCriterion("ps_address =", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressNotEqualTo(String value) {
            addCriterion("ps_address <>", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressGreaterThan(String value) {
            addCriterion("ps_address >", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ps_address >=", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressLessThan(String value) {
            addCriterion("ps_address <", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressLessThanOrEqualTo(String value) {
            addCriterion("ps_address <=", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressLike(String value) {
            addCriterion("ps_address like", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressNotLike(String value) {
            addCriterion("ps_address not like", value, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressIn(List<String> values) {
            addCriterion("ps_address in", values, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressNotIn(List<String> values) {
            addCriterion("ps_address not in", values, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressBetween(String value1, String value2) {
            addCriterion("ps_address between", value1, value2, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsAddressNotBetween(String value1, String value2) {
            addCriterion("ps_address not between", value1, value2, "psAddress");
            return (Criteria) this;
        }

        public Criteria andPsMoneyIsNull() {
            addCriterion("ps_money is null");
            return (Criteria) this;
        }

        public Criteria andPsMoneyIsNotNull() {
            addCriterion("ps_money is not null");
            return (Criteria) this;
        }

        public Criteria andPsMoneyEqualTo(Double value) {
            addCriterion("ps_money =", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyNotEqualTo(Double value) {
            addCriterion("ps_money <>", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyGreaterThan(Double value) {
            addCriterion("ps_money >", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ps_money >=", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyLessThan(Double value) {
            addCriterion("ps_money <", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ps_money <=", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyIn(List<Double> values) {
            addCriterion("ps_money in", values, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyNotIn(List<Double> values) {
            addCriterion("ps_money not in", values, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyBetween(Double value1, Double value2) {
            addCriterion("ps_money between", value1, value2, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ps_money not between", value1, value2, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsDaysIsNull() {
            addCriterion("ps_days is null");
            return (Criteria) this;
        }

        public Criteria andPsDaysIsNotNull() {
            addCriterion("ps_days is not null");
            return (Criteria) this;
        }

        public Criteria andPsDaysEqualTo(Integer value) {
            addCriterion("ps_days =", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysNotEqualTo(Integer value) {
            addCriterion("ps_days <>", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysGreaterThan(Integer value) {
            addCriterion("ps_days >", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_days >=", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysLessThan(Integer value) {
            addCriterion("ps_days <", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysLessThanOrEqualTo(Integer value) {
            addCriterion("ps_days <=", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysIn(List<Integer> values) {
            addCriterion("ps_days in", values, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysNotIn(List<Integer> values) {
            addCriterion("ps_days not in", values, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysBetween(Integer value1, Integer value2) {
            addCriterion("ps_days between", value1, value2, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_days not between", value1, value2, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsVideoIsNull() {
            addCriterion("ps_video is null");
            return (Criteria) this;
        }

        public Criteria andPsVideoIsNotNull() {
            addCriterion("ps_video is not null");
            return (Criteria) this;
        }

        public Criteria andPsVideoEqualTo(String value) {
            addCriterion("ps_video =", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoNotEqualTo(String value) {
            addCriterion("ps_video <>", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoGreaterThan(String value) {
            addCriterion("ps_video >", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoGreaterThanOrEqualTo(String value) {
            addCriterion("ps_video >=", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoLessThan(String value) {
            addCriterion("ps_video <", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoLessThanOrEqualTo(String value) {
            addCriterion("ps_video <=", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoLike(String value) {
            addCriterion("ps_video like", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoNotLike(String value) {
            addCriterion("ps_video not like", value, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoIn(List<String> values) {
            addCriterion("ps_video in", values, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoNotIn(List<String> values) {
            addCriterion("ps_video not in", values, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoBetween(String value1, String value2) {
            addCriterion("ps_video between", value1, value2, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsVideoNotBetween(String value1, String value2) {
            addCriterion("ps_video not between", value1, value2, "psVideo");
            return (Criteria) this;
        }

        public Criteria andPsStoryIsNull() {
            addCriterion("ps_story is null");
            return (Criteria) this;
        }

        public Criteria andPsStoryIsNotNull() {
            addCriterion("ps_story is not null");
            return (Criteria) this;
        }

        public Criteria andPsStoryEqualTo(String value) {
            addCriterion("ps_story =", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotEqualTo(String value) {
            addCriterion("ps_story <>", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryGreaterThan(String value) {
            addCriterion("ps_story >", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryGreaterThanOrEqualTo(String value) {
            addCriterion("ps_story >=", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryLessThan(String value) {
            addCriterion("ps_story <", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryLessThanOrEqualTo(String value) {
            addCriterion("ps_story <=", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryLike(String value) {
            addCriterion("ps_story like", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotLike(String value) {
            addCriterion("ps_story not like", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryIn(List<String> values) {
            addCriterion("ps_story in", values, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotIn(List<String> values) {
            addCriterion("ps_story not in", values, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryBetween(String value1, String value2) {
            addCriterion("ps_story between", value1, value2, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotBetween(String value1, String value2) {
            addCriterion("ps_story not between", value1, value2, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsSupportIsNull() {
            addCriterion("ps_support is null");
            return (Criteria) this;
        }

        public Criteria andPsSupportIsNotNull() {
            addCriterion("ps_support is not null");
            return (Criteria) this;
        }

        public Criteria andPsSupportEqualTo(String value) {
            addCriterion("ps_support =", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportNotEqualTo(String value) {
            addCriterion("ps_support <>", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportGreaterThan(String value) {
            addCriterion("ps_support >", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportGreaterThanOrEqualTo(String value) {
            addCriterion("ps_support >=", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportLessThan(String value) {
            addCriterion("ps_support <", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportLessThanOrEqualTo(String value) {
            addCriterion("ps_support <=", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportLike(String value) {
            addCriterion("ps_support like", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportNotLike(String value) {
            addCriterion("ps_support not like", value, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportIn(List<String> values) {
            addCriterion("ps_support in", values, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportNotIn(List<String> values) {
            addCriterion("ps_support not in", values, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportBetween(String value1, String value2) {
            addCriterion("ps_support between", value1, value2, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsSupportNotBetween(String value1, String value2) {
            addCriterion("ps_support not between", value1, value2, "psSupport");
            return (Criteria) this;
        }

        public Criteria andPsRepayIsNull() {
            addCriterion("ps_repay is null");
            return (Criteria) this;
        }

        public Criteria andPsRepayIsNotNull() {
            addCriterion("ps_repay is not null");
            return (Criteria) this;
        }

        public Criteria andPsRepayEqualTo(String value) {
            addCriterion("ps_repay =", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayNotEqualTo(String value) {
            addCriterion("ps_repay <>", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayGreaterThan(String value) {
            addCriterion("ps_repay >", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayGreaterThanOrEqualTo(String value) {
            addCriterion("ps_repay >=", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayLessThan(String value) {
            addCriterion("ps_repay <", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayLessThanOrEqualTo(String value) {
            addCriterion("ps_repay <=", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayLike(String value) {
            addCriterion("ps_repay like", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayNotLike(String value) {
            addCriterion("ps_repay not like", value, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayIn(List<String> values) {
            addCriterion("ps_repay in", values, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayNotIn(List<String> values) {
            addCriterion("ps_repay not in", values, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayBetween(String value1, String value2) {
            addCriterion("ps_repay between", value1, value2, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsRepayNotBetween(String value1, String value2) {
            addCriterion("ps_repay not between", value1, value2, "psRepay");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeIsNull() {
            addCriterion("ps_aboutme is null");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeIsNotNull() {
            addCriterion("ps_aboutme is not null");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeEqualTo(String value) {
            addCriterion("ps_aboutme =", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeNotEqualTo(String value) {
            addCriterion("ps_aboutme <>", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeGreaterThan(String value) {
            addCriterion("ps_aboutme >", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeGreaterThanOrEqualTo(String value) {
            addCriterion("ps_aboutme >=", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeLessThan(String value) {
            addCriterion("ps_aboutme <", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeLessThanOrEqualTo(String value) {
            addCriterion("ps_aboutme <=", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeLike(String value) {
            addCriterion("ps_aboutme like", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeNotLike(String value) {
            addCriterion("ps_aboutme not like", value, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeIn(List<String> values) {
            addCriterion("ps_aboutme in", values, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeNotIn(List<String> values) {
            addCriterion("ps_aboutme not in", values, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeBetween(String value1, String value2) {
            addCriterion("ps_aboutme between", value1, value2, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsAboutmeNotBetween(String value1, String value2) {
            addCriterion("ps_aboutme not between", value1, value2, "psAboutme");
            return (Criteria) this;
        }

        public Criteria andPsTypeIsNull() {
            addCriterion("ps_type is null");
            return (Criteria) this;
        }

        public Criteria andPsTypeIsNotNull() {
            addCriterion("ps_type is not null");
            return (Criteria) this;
        }

        public Criteria andPsTypeEqualTo(Integer value) {
            addCriterion("ps_type =", value, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeNotEqualTo(Integer value) {
            addCriterion("ps_type <>", value, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeGreaterThan(Integer value) {
            addCriterion("ps_type >", value, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_type >=", value, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeLessThan(Integer value) {
            addCriterion("ps_type <", value, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ps_type <=", value, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeIn(List<Integer> values) {
            addCriterion("ps_type in", values, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeNotIn(List<Integer> values) {
            addCriterion("ps_type not in", values, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeBetween(Integer value1, Integer value2) {
            addCriterion("ps_type between", value1, value2, "psType");
            return (Criteria) this;
        }

        public Criteria andPsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_type not between", value1, value2, "psType");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeIsNull() {
            addCriterion("ps_starttime is null");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeIsNotNull() {
            addCriterion("ps_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("ps_starttime =", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ps_starttime <>", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ps_starttime >", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_starttime >=", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("ps_starttime <", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_starttime <=", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("ps_starttime in", values, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ps_starttime not in", values, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_starttime between", value1, value2, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_starttime not between", value1, value2, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeIsNull() {
            addCriterion("ps_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeIsNotNull() {
            addCriterion("ps_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime =", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime <>", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ps_endtime >", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime >=", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("ps_endtime <", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime <=", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ps_endtime in", values, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ps_endtime not in", values, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_endtime between", value1, value2, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_endtime not between", value1, value2, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyIsNull() {
            addCriterion("ps_getmoney is null");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyIsNotNull() {
            addCriterion("ps_getmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyEqualTo(Double value) {
            addCriterion("ps_getmoney =", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyNotEqualTo(Double value) {
            addCriterion("ps_getmoney <>", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyGreaterThan(Double value) {
            addCriterion("ps_getmoney >", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ps_getmoney >=", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyLessThan(Double value) {
            addCriterion("ps_getmoney <", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ps_getmoney <=", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyIn(List<Double> values) {
            addCriterion("ps_getmoney in", values, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyNotIn(List<Double> values) {
            addCriterion("ps_getmoney not in", values, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyBetween(Double value1, Double value2) {
            addCriterion("ps_getmoney between", value1, value2, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ps_getmoney not between", value1, value2, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleIsNull() {
            addCriterion("ps_getpeople is null");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleIsNotNull() {
            addCriterion("ps_getpeople is not null");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleEqualTo(Integer value) {
            addCriterion("ps_getpeople =", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleNotEqualTo(Integer value) {
            addCriterion("ps_getpeople <>", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleGreaterThan(Integer value) {
            addCriterion("ps_getpeople >", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_getpeople >=", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleLessThan(Integer value) {
            addCriterion("ps_getpeople <", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("ps_getpeople <=", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleIn(List<Integer> values) {
            addCriterion("ps_getpeople in", values, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleNotIn(List<Integer> values) {
            addCriterion("ps_getpeople not in", values, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleBetween(Integer value1, Integer value2) {
            addCriterion("ps_getpeople between", value1, value2, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_getpeople not between", value1, value2, "psGetpeople");
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