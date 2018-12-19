package com.basoft.service.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EorderCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EorderCategoryExample() {
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

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeId is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Long value) {
            addCriterion("storeId =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Long value) {
            addCriterion("storeId <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Long value) {
            addCriterion("storeId >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Long value) {
            addCriterion("storeId >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Long value) {
            addCriterion("storeId <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Long value) {
            addCriterion("storeId <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Long> values) {
            addCriterion("storeId in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Long> values) {
            addCriterion("storeId not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Long value1, Long value2) {
            addCriterion("storeId between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Long value1, Long value2) {
            addCriterion("storeId not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andCtgnameIsNull() {
            addCriterion("ctgName is null");
            return (Criteria) this;
        }

        public Criteria andCtgnameIsNotNull() {
            addCriterion("ctgName is not null");
            return (Criteria) this;
        }

        public Criteria andCtgnameEqualTo(String value) {
            addCriterion("ctgName =", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameNotEqualTo(String value) {
            addCriterion("ctgName <>", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameGreaterThan(String value) {
            addCriterion("ctgName >", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ctgName >=", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameLessThan(String value) {
            addCriterion("ctgName <", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameLessThanOrEqualTo(String value) {
            addCriterion("ctgName <=", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameLike(String value) {
            addCriterion("ctgName like", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameNotLike(String value) {
            addCriterion("ctgName not like", value, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameIn(List<String> values) {
            addCriterion("ctgName in", values, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameNotIn(List<String> values) {
            addCriterion("ctgName not in", values, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameBetween(String value1, String value2) {
            addCriterion("ctgName between", value1, value2, "ctgname");
            return (Criteria) this;
        }

        public Criteria andCtgnameNotBetween(String value1, String value2) {
            addCriterion("ctgName not between", value1, value2, "ctgname");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Byte value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Byte value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Byte value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Byte value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Byte value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Byte> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Byte> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Byte value1, Byte value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCreatedidIsNull() {
            addCriterion("createdId is null");
            return (Criteria) this;
        }

        public Criteria andCreatedidIsNotNull() {
            addCriterion("createdId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedidEqualTo(Long value) {
            addCriterion("createdId =", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotEqualTo(Long value) {
            addCriterion("createdId <>", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThan(Long value) {
            addCriterion("createdId >", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThanOrEqualTo(Long value) {
            addCriterion("createdId >=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThan(Long value) {
            addCriterion("createdId <", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThanOrEqualTo(Long value) {
            addCriterion("createdId <=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidIn(List<Long> values) {
            addCriterion("createdId in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotIn(List<Long> values) {
            addCriterion("createdId not in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidBetween(Long value1, Long value2) {
            addCriterion("createdId between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotBetween(Long value1, Long value2) {
            addCriterion("createdId not between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreateddtIsNull() {
            addCriterion("createdDt is null");
            return (Criteria) this;
        }

        public Criteria andCreateddtIsNotNull() {
            addCriterion("createdDt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddtEqualTo(Date value) {
            addCriterion("createdDt =", value, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtNotEqualTo(Date value) {
            addCriterion("createdDt <>", value, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtGreaterThan(Date value) {
            addCriterion("createdDt >", value, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtGreaterThanOrEqualTo(Date value) {
            addCriterion("createdDt >=", value, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtLessThan(Date value) {
            addCriterion("createdDt <", value, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtLessThanOrEqualTo(Date value) {
            addCriterion("createdDt <=", value, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtIn(List<Date> values) {
            addCriterion("createdDt in", values, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtNotIn(List<Date> values) {
            addCriterion("createdDt not in", values, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtBetween(Date value1, Date value2) {
            addCriterion("createdDt between", value1, value2, "createddt");
            return (Criteria) this;
        }

        public Criteria andCreateddtNotBetween(Date value1, Date value2) {
            addCriterion("createdDt not between", value1, value2, "createddt");
            return (Criteria) this;
        }

        public Criteria andModifiedidIsNull() {
            addCriterion("modifiedId is null");
            return (Criteria) this;
        }

        public Criteria andModifiedidIsNotNull() {
            addCriterion("modifiedId is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedidEqualTo(Long value) {
            addCriterion("modifiedId =", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotEqualTo(Long value) {
            addCriterion("modifiedId <>", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidGreaterThan(Long value) {
            addCriterion("modifiedId >", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidGreaterThanOrEqualTo(Long value) {
            addCriterion("modifiedId >=", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidLessThan(Long value) {
            addCriterion("modifiedId <", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidLessThanOrEqualTo(Long value) {
            addCriterion("modifiedId <=", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidIn(List<Long> values) {
            addCriterion("modifiedId in", values, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotIn(List<Long> values) {
            addCriterion("modifiedId not in", values, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidBetween(Long value1, Long value2) {
            addCriterion("modifiedId between", value1, value2, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotBetween(Long value1, Long value2) {
            addCriterion("modifiedId not between", value1, value2, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifieddtIsNull() {
            addCriterion("modifiedDt is null");
            return (Criteria) this;
        }

        public Criteria andModifieddtIsNotNull() {
            addCriterion("modifiedDt is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddtEqualTo(Date value) {
            addCriterion("modifiedDt =", value, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtNotEqualTo(Date value) {
            addCriterion("modifiedDt <>", value, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtGreaterThan(Date value) {
            addCriterion("modifiedDt >", value, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedDt >=", value, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtLessThan(Date value) {
            addCriterion("modifiedDt <", value, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtLessThanOrEqualTo(Date value) {
            addCriterion("modifiedDt <=", value, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtIn(List<Date> values) {
            addCriterion("modifiedDt in", values, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtNotIn(List<Date> values) {
            addCriterion("modifiedDt not in", values, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtBetween(Date value1, Date value2) {
            addCriterion("modifiedDt between", value1, value2, "modifieddt");
            return (Criteria) this;
        }

        public Criteria andModifieddtNotBetween(Date value1, Date value2) {
            addCriterion("modifiedDt not between", value1, value2, "modifieddt");
            return (Criteria) this;
        }
    }

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