package com.example.pump.model;

import java.util.ArrayList;
import java.util.List;

public class PredictFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PredictFlowExample() {
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

        public Criteria andPumpnoIsNull() {
            addCriterion("pumpNo is null");
            return (Criteria) this;
        }

        public Criteria andPumpnoIsNotNull() {
            addCriterion("pumpNo is not null");
            return (Criteria) this;
        }

        public Criteria andPumpnoEqualTo(Integer value) {
            addCriterion("pumpNo =", value, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoNotEqualTo(Integer value) {
            addCriterion("pumpNo <>", value, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoGreaterThan(Integer value) {
            addCriterion("pumpNo >", value, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pumpNo >=", value, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoLessThan(Integer value) {
            addCriterion("pumpNo <", value, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoLessThanOrEqualTo(Integer value) {
            addCriterion("pumpNo <=", value, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoIn(List<Integer> values) {
            addCriterion("pumpNo in", values, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoNotIn(List<Integer> values) {
            addCriterion("pumpNo not in", values, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoBetween(Integer value1, Integer value2) {
            addCriterion("pumpNo between", value1, value2, "pumpno");
            return (Criteria) this;
        }

        public Criteria andPumpnoNotBetween(Integer value1, Integer value2) {
            addCriterion("pumpNo not between", value1, value2, "pumpno");
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

        public Criteria andFlowIsNull() {
            addCriterion("flow is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("flow is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(Double value) {
            addCriterion("flow =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(Double value) {
            addCriterion("flow <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(Double value) {
            addCriterion("flow >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("flow >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(Double value) {
            addCriterion("flow <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(Double value) {
            addCriterion("flow <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<Double> values) {
            addCriterion("flow in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<Double> values) {
            addCriterion("flow not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(Double value1, Double value2) {
            addCriterion("flow between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(Double value1, Double value2) {
            addCriterion("flow not between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andPredictIsNull() {
            addCriterion("predict is null");
            return (Criteria) this;
        }

        public Criteria andPredictIsNotNull() {
            addCriterion("predict is not null");
            return (Criteria) this;
        }

        public Criteria andPredictEqualTo(Double value) {
            addCriterion("predict =", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictNotEqualTo(Double value) {
            addCriterion("predict <>", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictGreaterThan(Double value) {
            addCriterion("predict >", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictGreaterThanOrEqualTo(Double value) {
            addCriterion("predict >=", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictLessThan(Double value) {
            addCriterion("predict <", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictLessThanOrEqualTo(Double value) {
            addCriterion("predict <=", value, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictIn(List<Double> values) {
            addCriterion("predict in", values, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictNotIn(List<Double> values) {
            addCriterion("predict not in", values, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictBetween(Double value1, Double value2) {
            addCriterion("predict between", value1, value2, "predict");
            return (Criteria) this;
        }

        public Criteria andPredictNotBetween(Double value1, Double value2) {
            addCriterion("predict not between", value1, value2, "predict");
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