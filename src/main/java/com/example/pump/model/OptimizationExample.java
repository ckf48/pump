package com.example.pump.model;

import java.util.ArrayList;
import java.util.List;

public class OptimizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OptimizationExample() {
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

        public Criteria andPump1IsNull() {
            addCriterion("pump1 is null");
            return (Criteria) this;
        }

        public Criteria andPump1IsNotNull() {
            addCriterion("pump1 is not null");
            return (Criteria) this;
        }

        public Criteria andPump1EqualTo(Integer value) {
            addCriterion("pump1 =", value, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1NotEqualTo(Integer value) {
            addCriterion("pump1 <>", value, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1GreaterThan(Integer value) {
            addCriterion("pump1 >", value, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1GreaterThanOrEqualTo(Integer value) {
            addCriterion("pump1 >=", value, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1LessThan(Integer value) {
            addCriterion("pump1 <", value, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1LessThanOrEqualTo(Integer value) {
            addCriterion("pump1 <=", value, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1In(List<Integer> values) {
            addCriterion("pump1 in", values, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1NotIn(List<Integer> values) {
            addCriterion("pump1 not in", values, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1Between(Integer value1, Integer value2) {
            addCriterion("pump1 between", value1, value2, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump1NotBetween(Integer value1, Integer value2) {
            addCriterion("pump1 not between", value1, value2, "pump1");
            return (Criteria) this;
        }

        public Criteria andPump2IsNull() {
            addCriterion("pump2 is null");
            return (Criteria) this;
        }

        public Criteria andPump2IsNotNull() {
            addCriterion("pump2 is not null");
            return (Criteria) this;
        }

        public Criteria andPump2EqualTo(Integer value) {
            addCriterion("pump2 =", value, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2NotEqualTo(Integer value) {
            addCriterion("pump2 <>", value, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2GreaterThan(Integer value) {
            addCriterion("pump2 >", value, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2GreaterThanOrEqualTo(Integer value) {
            addCriterion("pump2 >=", value, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2LessThan(Integer value) {
            addCriterion("pump2 <", value, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2LessThanOrEqualTo(Integer value) {
            addCriterion("pump2 <=", value, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2In(List<Integer> values) {
            addCriterion("pump2 in", values, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2NotIn(List<Integer> values) {
            addCriterion("pump2 not in", values, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2Between(Integer value1, Integer value2) {
            addCriterion("pump2 between", value1, value2, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump2NotBetween(Integer value1, Integer value2) {
            addCriterion("pump2 not between", value1, value2, "pump2");
            return (Criteria) this;
        }

        public Criteria andPump3IsNull() {
            addCriterion("pump3 is null");
            return (Criteria) this;
        }

        public Criteria andPump3IsNotNull() {
            addCriterion("pump3 is not null");
            return (Criteria) this;
        }

        public Criteria andPump3EqualTo(Integer value) {
            addCriterion("pump3 =", value, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3NotEqualTo(Integer value) {
            addCriterion("pump3 <>", value, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3GreaterThan(Integer value) {
            addCriterion("pump3 >", value, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3GreaterThanOrEqualTo(Integer value) {
            addCriterion("pump3 >=", value, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3LessThan(Integer value) {
            addCriterion("pump3 <", value, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3LessThanOrEqualTo(Integer value) {
            addCriterion("pump3 <=", value, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3In(List<Integer> values) {
            addCriterion("pump3 in", values, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3NotIn(List<Integer> values) {
            addCriterion("pump3 not in", values, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3Between(Integer value1, Integer value2) {
            addCriterion("pump3 between", value1, value2, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump3NotBetween(Integer value1, Integer value2) {
            addCriterion("pump3 not between", value1, value2, "pump3");
            return (Criteria) this;
        }

        public Criteria andPump4IsNull() {
            addCriterion("pump4 is null");
            return (Criteria) this;
        }

        public Criteria andPump4IsNotNull() {
            addCriterion("pump4 is not null");
            return (Criteria) this;
        }

        public Criteria andPump4EqualTo(Integer value) {
            addCriterion("pump4 =", value, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4NotEqualTo(Integer value) {
            addCriterion("pump4 <>", value, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4GreaterThan(Integer value) {
            addCriterion("pump4 >", value, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4GreaterThanOrEqualTo(Integer value) {
            addCriterion("pump4 >=", value, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4LessThan(Integer value) {
            addCriterion("pump4 <", value, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4LessThanOrEqualTo(Integer value) {
            addCriterion("pump4 <=", value, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4In(List<Integer> values) {
            addCriterion("pump4 in", values, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4NotIn(List<Integer> values) {
            addCriterion("pump4 not in", values, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4Between(Integer value1, Integer value2) {
            addCriterion("pump4 between", value1, value2, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump4NotBetween(Integer value1, Integer value2) {
            addCriterion("pump4 not between", value1, value2, "pump4");
            return (Criteria) this;
        }

        public Criteria andPump5IsNull() {
            addCriterion("pump5 is null");
            return (Criteria) this;
        }

        public Criteria andPump5IsNotNull() {
            addCriterion("pump5 is not null");
            return (Criteria) this;
        }

        public Criteria andPump5EqualTo(Integer value) {
            addCriterion("pump5 =", value, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5NotEqualTo(Integer value) {
            addCriterion("pump5 <>", value, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5GreaterThan(Integer value) {
            addCriterion("pump5 >", value, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5GreaterThanOrEqualTo(Integer value) {
            addCriterion("pump5 >=", value, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5LessThan(Integer value) {
            addCriterion("pump5 <", value, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5LessThanOrEqualTo(Integer value) {
            addCriterion("pump5 <=", value, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5In(List<Integer> values) {
            addCriterion("pump5 in", values, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5NotIn(List<Integer> values) {
            addCriterion("pump5 not in", values, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5Between(Integer value1, Integer value2) {
            addCriterion("pump5 between", value1, value2, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump5NotBetween(Integer value1, Integer value2) {
            addCriterion("pump5 not between", value1, value2, "pump5");
            return (Criteria) this;
        }

        public Criteria andPump6IsNull() {
            addCriterion("pump6 is null");
            return (Criteria) this;
        }

        public Criteria andPump6IsNotNull() {
            addCriterion("pump6 is not null");
            return (Criteria) this;
        }

        public Criteria andPump6EqualTo(Integer value) {
            addCriterion("pump6 =", value, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6NotEqualTo(Integer value) {
            addCriterion("pump6 <>", value, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6GreaterThan(Integer value) {
            addCriterion("pump6 >", value, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6GreaterThanOrEqualTo(Integer value) {
            addCriterion("pump6 >=", value, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6LessThan(Integer value) {
            addCriterion("pump6 <", value, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6LessThanOrEqualTo(Integer value) {
            addCriterion("pump6 <=", value, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6In(List<Integer> values) {
            addCriterion("pump6 in", values, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6NotIn(List<Integer> values) {
            addCriterion("pump6 not in", values, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6Between(Integer value1, Integer value2) {
            addCriterion("pump6 between", value1, value2, "pump6");
            return (Criteria) this;
        }

        public Criteria andPump6NotBetween(Integer value1, Integer value2) {
            addCriterion("pump6 not between", value1, value2, "pump6");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("`time` like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("`time` not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("`time` not between", value1, value2, "time");
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