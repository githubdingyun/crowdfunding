package com.dingyun.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserExample() {
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

        public Criteria andUsIdIsNull() {
            addCriterion("us_id is null");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNotNull() {
            addCriterion("us_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdEqualTo(Integer value) {
            addCriterion("us_id =", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotEqualTo(Integer value) {
            addCriterion("us_id <>", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThan(Integer value) {
            addCriterion("us_id >", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_id >=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThan(Integer value) {
            addCriterion("us_id <", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("us_id <=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdIn(List<Integer> values) {
            addCriterion("us_id in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotIn(List<Integer> values) {
            addCriterion("us_id not in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdBetween(Integer value1, Integer value2) {
            addCriterion("us_id between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us_id not between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsEmailIsNull() {
            addCriterion("us_email is null");
            return (Criteria) this;
        }

        public Criteria andUsEmailIsNotNull() {
            addCriterion("us_email is not null");
            return (Criteria) this;
        }

        public Criteria andUsEmailEqualTo(String value) {
            addCriterion("us_email =", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotEqualTo(String value) {
            addCriterion("us_email <>", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailGreaterThan(String value) {
            addCriterion("us_email >", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("us_email >=", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailLessThan(String value) {
            addCriterion("us_email <", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailLessThanOrEqualTo(String value) {
            addCriterion("us_email <=", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailLike(String value) {
            addCriterion("us_email like", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotLike(String value) {
            addCriterion("us_email not like", value, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailIn(List<String> values) {
            addCriterion("us_email in", values, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotIn(List<String> values) {
            addCriterion("us_email not in", values, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailBetween(String value1, String value2) {
            addCriterion("us_email between", value1, value2, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsEmailNotBetween(String value1, String value2) {
            addCriterion("us_email not between", value1, value2, "usEmail");
            return (Criteria) this;
        }

        public Criteria andUsNameIsNull() {
            addCriterion("us_name is null");
            return (Criteria) this;
        }

        public Criteria andUsNameIsNotNull() {
            addCriterion("us_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsNameEqualTo(String value) {
            addCriterion("us_name =", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotEqualTo(String value) {
            addCriterion("us_name <>", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameGreaterThan(String value) {
            addCriterion("us_name >", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameGreaterThanOrEqualTo(String value) {
            addCriterion("us_name >=", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameLessThan(String value) {
            addCriterion("us_name <", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameLessThanOrEqualTo(String value) {
            addCriterion("us_name <=", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameLike(String value) {
            addCriterion("us_name like", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotLike(String value) {
            addCriterion("us_name not like", value, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameIn(List<String> values) {
            addCriterion("us_name in", values, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotIn(List<String> values) {
            addCriterion("us_name not in", values, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameBetween(String value1, String value2) {
            addCriterion("us_name between", value1, value2, "usName");
            return (Criteria) this;
        }

        public Criteria andUsNameNotBetween(String value1, String value2) {
            addCriterion("us_name not between", value1, value2, "usName");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNull() {
            addCriterion("us_password is null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNotNull() {
            addCriterion("us_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordEqualTo(String value) {
            addCriterion("us_password =", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotEqualTo(String value) {
            addCriterion("us_password <>", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThan(String value) {
            addCriterion("us_password >", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("us_password >=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThan(String value) {
            addCriterion("us_password <", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThanOrEqualTo(String value) {
            addCriterion("us_password <=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLike(String value) {
            addCriterion("us_password like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotLike(String value) {
            addCriterion("us_password not like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIn(List<String> values) {
            addCriterion("us_password in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotIn(List<String> values) {
            addCriterion("us_password not in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordBetween(String value1, String value2) {
            addCriterion("us_password between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotBetween(String value1, String value2) {
            addCriterion("us_password not between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsMoneyIsNull() {
            addCriterion("us_money is null");
            return (Criteria) this;
        }

        public Criteria andUsMoneyIsNotNull() {
            addCriterion("us_money is not null");
            return (Criteria) this;
        }

        public Criteria andUsMoneyEqualTo(Double value) {
            addCriterion("us_money =", value, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyNotEqualTo(Double value) {
            addCriterion("us_money <>", value, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyGreaterThan(Double value) {
            addCriterion("us_money >", value, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("us_money >=", value, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyLessThan(Double value) {
            addCriterion("us_money <", value, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("us_money <=", value, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyIn(List<Double> values) {
            addCriterion("us_money in", values, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyNotIn(List<Double> values) {
            addCriterion("us_money not in", values, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyBetween(Double value1, Double value2) {
            addCriterion("us_money between", value1, value2, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("us_money not between", value1, value2, "usMoney");
            return (Criteria) this;
        }

        public Criteria andUsIdcardIsNull() {
            addCriterion("us_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUsIdcardIsNotNull() {
            addCriterion("us_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdcardEqualTo(String value) {
            addCriterion("us_idcard =", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotEqualTo(String value) {
            addCriterion("us_idcard <>", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardGreaterThan(String value) {
            addCriterion("us_idcard >", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("us_idcard >=", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardLessThan(String value) {
            addCriterion("us_idcard <", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardLessThanOrEqualTo(String value) {
            addCriterion("us_idcard <=", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardLike(String value) {
            addCriterion("us_idcard like", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotLike(String value) {
            addCriterion("us_idcard not like", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardIn(List<String> values) {
            addCriterion("us_idcard in", values, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotIn(List<String> values) {
            addCriterion("us_idcard not in", values, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardBetween(String value1, String value2) {
            addCriterion("us_idcard between", value1, value2, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotBetween(String value1, String value2) {
            addCriterion("us_idcard not between", value1, value2, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsPhoneIsNull() {
            addCriterion("us_phone is null");
            return (Criteria) this;
        }

        public Criteria andUsPhoneIsNotNull() {
            addCriterion("us_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUsPhoneEqualTo(String value) {
            addCriterion("us_phone =", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotEqualTo(String value) {
            addCriterion("us_phone <>", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneGreaterThan(String value) {
            addCriterion("us_phone >", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("us_phone >=", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneLessThan(String value) {
            addCriterion("us_phone <", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneLessThanOrEqualTo(String value) {
            addCriterion("us_phone <=", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneLike(String value) {
            addCriterion("us_phone like", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotLike(String value) {
            addCriterion("us_phone not like", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneIn(List<String> values) {
            addCriterion("us_phone in", values, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotIn(List<String> values) {
            addCriterion("us_phone not in", values, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneBetween(String value1, String value2) {
            addCriterion("us_phone between", value1, value2, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotBetween(String value1, String value2) {
            addCriterion("us_phone not between", value1, value2, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsAddressIsNull() {
            addCriterion("us_address is null");
            return (Criteria) this;
        }

        public Criteria andUsAddressIsNotNull() {
            addCriterion("us_address is not null");
            return (Criteria) this;
        }

        public Criteria andUsAddressEqualTo(String value) {
            addCriterion("us_address =", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotEqualTo(String value) {
            addCriterion("us_address <>", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressGreaterThan(String value) {
            addCriterion("us_address >", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("us_address >=", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressLessThan(String value) {
            addCriterion("us_address <", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressLessThanOrEqualTo(String value) {
            addCriterion("us_address <=", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressLike(String value) {
            addCriterion("us_address like", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotLike(String value) {
            addCriterion("us_address not like", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressIn(List<String> values) {
            addCriterion("us_address in", values, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotIn(List<String> values) {
            addCriterion("us_address not in", values, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressBetween(String value1, String value2) {
            addCriterion("us_address between", value1, value2, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotBetween(String value1, String value2) {
            addCriterion("us_address not between", value1, value2, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsRoleIsNull() {
            addCriterion("us_role is null");
            return (Criteria) this;
        }

        public Criteria andUsRoleIsNotNull() {
            addCriterion("us_role is not null");
            return (Criteria) this;
        }

        public Criteria andUsRoleEqualTo(Integer value) {
            addCriterion("us_role =", value, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleNotEqualTo(Integer value) {
            addCriterion("us_role <>", value, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleGreaterThan(Integer value) {
            addCriterion("us_role >", value, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_role >=", value, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleLessThan(Integer value) {
            addCriterion("us_role <", value, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleLessThanOrEqualTo(Integer value) {
            addCriterion("us_role <=", value, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleIn(List<Integer> values) {
            addCriterion("us_role in", values, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleNotIn(List<Integer> values) {
            addCriterion("us_role not in", values, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleBetween(Integer value1, Integer value2) {
            addCriterion("us_role between", value1, value2, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("us_role not between", value1, value2, "usRole");
            return (Criteria) this;
        }

        public Criteria andUsSexIsNull() {
            addCriterion("us_sex is null");
            return (Criteria) this;
        }

        public Criteria andUsSexIsNotNull() {
            addCriterion("us_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUsSexEqualTo(String value) {
            addCriterion("us_sex =", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotEqualTo(String value) {
            addCriterion("us_sex <>", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexGreaterThan(String value) {
            addCriterion("us_sex >", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexGreaterThanOrEqualTo(String value) {
            addCriterion("us_sex >=", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexLessThan(String value) {
            addCriterion("us_sex <", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexLessThanOrEqualTo(String value) {
            addCriterion("us_sex <=", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexLike(String value) {
            addCriterion("us_sex like", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotLike(String value) {
            addCriterion("us_sex not like", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexIn(List<String> values) {
            addCriterion("us_sex in", values, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotIn(List<String> values) {
            addCriterion("us_sex not in", values, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexBetween(String value1, String value2) {
            addCriterion("us_sex between", value1, value2, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotBetween(String value1, String value2) {
            addCriterion("us_sex not between", value1, value2, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsCodeIsNull() {
            addCriterion("us_code is null");
            return (Criteria) this;
        }

        public Criteria andUsCodeIsNotNull() {
            addCriterion("us_code is not null");
            return (Criteria) this;
        }

        public Criteria andUsCodeEqualTo(String value) {
            addCriterion("us_code =", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotEqualTo(String value) {
            addCriterion("us_code <>", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeGreaterThan(String value) {
            addCriterion("us_code >", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("us_code >=", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeLessThan(String value) {
            addCriterion("us_code <", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeLessThanOrEqualTo(String value) {
            addCriterion("us_code <=", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeLike(String value) {
            addCriterion("us_code like", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotLike(String value) {
            addCriterion("us_code not like", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeIn(List<String> values) {
            addCriterion("us_code in", values, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotIn(List<String> values) {
            addCriterion("us_code not in", values, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeBetween(String value1, String value2) {
            addCriterion("us_code between", value1, value2, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotBetween(String value1, String value2) {
            addCriterion("us_code not between", value1, value2, "usCode");
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