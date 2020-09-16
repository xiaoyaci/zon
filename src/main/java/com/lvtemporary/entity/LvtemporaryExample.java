package com.lvtemporary.entity;

import java.util.ArrayList;
import java.util.List;

public class LvtemporaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LvtemporaryExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIIsNull() {
            addCriterion("discharge_curve_i is null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIIsNotNull() {
            addCriterion("discharge_curve_i is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIEqualTo(String value) {
            addCriterion("discharge_curve_i =", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveINotEqualTo(String value) {
            addCriterion("discharge_curve_i <>", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIGreaterThan(String value) {
            addCriterion("discharge_curve_i >", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIGreaterThanOrEqualTo(String value) {
            addCriterion("discharge_curve_i >=", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveILessThan(String value) {
            addCriterion("discharge_curve_i <", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveILessThanOrEqualTo(String value) {
            addCriterion("discharge_curve_i <=", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveILike(String value) {
            addCriterion("discharge_curve_i like", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveINotLike(String value) {
            addCriterion("discharge_curve_i not like", value, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIIn(List<String> values) {
            addCriterion("discharge_curve_i in", values, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveINotIn(List<String> values) {
            addCriterion("discharge_curve_i not in", values, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveIBetween(String value1, String value2) {
            addCriterion("discharge_curve_i between", value1, value2, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveINotBetween(String value1, String value2) {
            addCriterion("discharge_curve_i not between", value1, value2, "dischargeCurveI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2IsNull() {
            addCriterion("discharge_curve_p2 is null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2IsNotNull() {
            addCriterion("discharge_curve_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2EqualTo(String value) {
            addCriterion("discharge_curve_p2 =", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2NotEqualTo(String value) {
            addCriterion("discharge_curve_p2 <>", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2GreaterThan(String value) {
            addCriterion("discharge_curve_p2 >", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2GreaterThanOrEqualTo(String value) {
            addCriterion("discharge_curve_p2 >=", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2LessThan(String value) {
            addCriterion("discharge_curve_p2 <", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2LessThanOrEqualTo(String value) {
            addCriterion("discharge_curve_p2 <=", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2Like(String value) {
            addCriterion("discharge_curve_p2 like", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2NotLike(String value) {
            addCriterion("discharge_curve_p2 not like", value, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2In(List<String> values) {
            addCriterion("discharge_curve_p2 in", values, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2NotIn(List<String> values) {
            addCriterion("discharge_curve_p2 not in", values, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2Between(String value1, String value2) {
            addCriterion("discharge_curve_p2 between", value1, value2, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveP2NotBetween(String value1, String value2) {
            addCriterion("discharge_curve_p2 not between", value1, value2, "dischargeCurveP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIIsNull() {
            addCriterion("discharge_curve_med_i is null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIIsNotNull() {
            addCriterion("discharge_curve_med_i is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIEqualTo(String value) {
            addCriterion("discharge_curve_med_i =", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedINotEqualTo(String value) {
            addCriterion("discharge_curve_med_i <>", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIGreaterThan(String value) {
            addCriterion("discharge_curve_med_i >", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIGreaterThanOrEqualTo(String value) {
            addCriterion("discharge_curve_med_i >=", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedILessThan(String value) {
            addCriterion("discharge_curve_med_i <", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedILessThanOrEqualTo(String value) {
            addCriterion("discharge_curve_med_i <=", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedILike(String value) {
            addCriterion("discharge_curve_med_i like", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedINotLike(String value) {
            addCriterion("discharge_curve_med_i not like", value, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIIn(List<String> values) {
            addCriterion("discharge_curve_med_i in", values, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedINotIn(List<String> values) {
            addCriterion("discharge_curve_med_i not in", values, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedIBetween(String value1, String value2) {
            addCriterion("discharge_curve_med_i between", value1, value2, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedINotBetween(String value1, String value2) {
            addCriterion("discharge_curve_med_i not between", value1, value2, "dischargeCurveMedI");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2IsNull() {
            addCriterion("discharge_curve_med_p2 is null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2IsNotNull() {
            addCriterion("discharge_curve_med_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2EqualTo(String value) {
            addCriterion("discharge_curve_med_p2 =", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2NotEqualTo(String value) {
            addCriterion("discharge_curve_med_p2 <>", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2GreaterThan(String value) {
            addCriterion("discharge_curve_med_p2 >", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2GreaterThanOrEqualTo(String value) {
            addCriterion("discharge_curve_med_p2 >=", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2LessThan(String value) {
            addCriterion("discharge_curve_med_p2 <", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2LessThanOrEqualTo(String value) {
            addCriterion("discharge_curve_med_p2 <=", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2Like(String value) {
            addCriterion("discharge_curve_med_p2 like", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2NotLike(String value) {
            addCriterion("discharge_curve_med_p2 not like", value, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2In(List<String> values) {
            addCriterion("discharge_curve_med_p2 in", values, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2NotIn(List<String> values) {
            addCriterion("discharge_curve_med_p2 not in", values, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2Between(String value1, String value2) {
            addCriterion("discharge_curve_med_p2 between", value1, value2, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andDischargeCurveMedP2NotBetween(String value1, String value2) {
            addCriterion("discharge_curve_med_p2 not between", value1, value2, "dischargeCurveMedP2");
            return (Criteria) this;
        }

        public Criteria andLLineP1IsNull() {
            addCriterion("l_line_p1 is null");
            return (Criteria) this;
        }

        public Criteria andLLineP1IsNotNull() {
            addCriterion("l_line_p1 is not null");
            return (Criteria) this;
        }

        public Criteria andLLineP1EqualTo(String value) {
            addCriterion("l_line_p1 =", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1NotEqualTo(String value) {
            addCriterion("l_line_p1 <>", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1GreaterThan(String value) {
            addCriterion("l_line_p1 >", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1GreaterThanOrEqualTo(String value) {
            addCriterion("l_line_p1 >=", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1LessThan(String value) {
            addCriterion("l_line_p1 <", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1LessThanOrEqualTo(String value) {
            addCriterion("l_line_p1 <=", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1Like(String value) {
            addCriterion("l_line_p1 like", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1NotLike(String value) {
            addCriterion("l_line_p1 not like", value, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1In(List<String> values) {
            addCriterion("l_line_p1 in", values, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1NotIn(List<String> values) {
            addCriterion("l_line_p1 not in", values, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1Between(String value1, String value2) {
            addCriterion("l_line_p1 between", value1, value2, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP1NotBetween(String value1, String value2) {
            addCriterion("l_line_p1 not between", value1, value2, "lLineP1");
            return (Criteria) this;
        }

        public Criteria andLLineP2IsNull() {
            addCriterion("l_line_p2 is null");
            return (Criteria) this;
        }

        public Criteria andLLineP2IsNotNull() {
            addCriterion("l_line_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andLLineP2EqualTo(String value) {
            addCriterion("l_line_p2 =", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2NotEqualTo(String value) {
            addCriterion("l_line_p2 <>", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2GreaterThan(String value) {
            addCriterion("l_line_p2 >", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2GreaterThanOrEqualTo(String value) {
            addCriterion("l_line_p2 >=", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2LessThan(String value) {
            addCriterion("l_line_p2 <", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2LessThanOrEqualTo(String value) {
            addCriterion("l_line_p2 <=", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2Like(String value) {
            addCriterion("l_line_p2 like", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2NotLike(String value) {
            addCriterion("l_line_p2 not like", value, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2In(List<String> values) {
            addCriterion("l_line_p2 in", values, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2NotIn(List<String> values) {
            addCriterion("l_line_p2 not in", values, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2Between(String value1, String value2) {
            addCriterion("l_line_p2 between", value1, value2, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andLLineP2NotBetween(String value1, String value2) {
            addCriterion("l_line_p2 not between", value1, value2, "lLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP1IsNull() {
            addCriterion("m_line_p1 is null");
            return (Criteria) this;
        }

        public Criteria andMLineP1IsNotNull() {
            addCriterion("m_line_p1 is not null");
            return (Criteria) this;
        }

        public Criteria andMLineP1EqualTo(String value) {
            addCriterion("m_line_p1 =", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1NotEqualTo(String value) {
            addCriterion("m_line_p1 <>", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1GreaterThan(String value) {
            addCriterion("m_line_p1 >", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1GreaterThanOrEqualTo(String value) {
            addCriterion("m_line_p1 >=", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1LessThan(String value) {
            addCriterion("m_line_p1 <", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1LessThanOrEqualTo(String value) {
            addCriterion("m_line_p1 <=", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1Like(String value) {
            addCriterion("m_line_p1 like", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1NotLike(String value) {
            addCriterion("m_line_p1 not like", value, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1In(List<String> values) {
            addCriterion("m_line_p1 in", values, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1NotIn(List<String> values) {
            addCriterion("m_line_p1 not in", values, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1Between(String value1, String value2) {
            addCriterion("m_line_p1 between", value1, value2, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP1NotBetween(String value1, String value2) {
            addCriterion("m_line_p1 not between", value1, value2, "mLineP1");
            return (Criteria) this;
        }

        public Criteria andMLineP2IsNull() {
            addCriterion("m_line_p2 is null");
            return (Criteria) this;
        }

        public Criteria andMLineP2IsNotNull() {
            addCriterion("m_line_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andMLineP2EqualTo(String value) {
            addCriterion("m_line_p2 =", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2NotEqualTo(String value) {
            addCriterion("m_line_p2 <>", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2GreaterThan(String value) {
            addCriterion("m_line_p2 >", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2GreaterThanOrEqualTo(String value) {
            addCriterion("m_line_p2 >=", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2LessThan(String value) {
            addCriterion("m_line_p2 <", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2LessThanOrEqualTo(String value) {
            addCriterion("m_line_p2 <=", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2Like(String value) {
            addCriterion("m_line_p2 like", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2NotLike(String value) {
            addCriterion("m_line_p2 not like", value, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2In(List<String> values) {
            addCriterion("m_line_p2 in", values, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2NotIn(List<String> values) {
            addCriterion("m_line_p2 not in", values, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2Between(String value1, String value2) {
            addCriterion("m_line_p2 between", value1, value2, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andMLineP2NotBetween(String value1, String value2) {
            addCriterion("m_line_p2 not between", value1, value2, "mLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP1IsNull() {
            addCriterion("h_line_p1 is null");
            return (Criteria) this;
        }

        public Criteria andHLineP1IsNotNull() {
            addCriterion("h_line_p1 is not null");
            return (Criteria) this;
        }

        public Criteria andHLineP1EqualTo(String value) {
            addCriterion("h_line_p1 =", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1NotEqualTo(String value) {
            addCriterion("h_line_p1 <>", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1GreaterThan(String value) {
            addCriterion("h_line_p1 >", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1GreaterThanOrEqualTo(String value) {
            addCriterion("h_line_p1 >=", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1LessThan(String value) {
            addCriterion("h_line_p1 <", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1LessThanOrEqualTo(String value) {
            addCriterion("h_line_p1 <=", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1Like(String value) {
            addCriterion("h_line_p1 like", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1NotLike(String value) {
            addCriterion("h_line_p1 not like", value, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1In(List<String> values) {
            addCriterion("h_line_p1 in", values, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1NotIn(List<String> values) {
            addCriterion("h_line_p1 not in", values, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1Between(String value1, String value2) {
            addCriterion("h_line_p1 between", value1, value2, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP1NotBetween(String value1, String value2) {
            addCriterion("h_line_p1 not between", value1, value2, "hLineP1");
            return (Criteria) this;
        }

        public Criteria andHLineP2IsNull() {
            addCriterion("h_line_p2 is null");
            return (Criteria) this;
        }

        public Criteria andHLineP2IsNotNull() {
            addCriterion("h_line_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andHLineP2EqualTo(String value) {
            addCriterion("h_line_p2 =", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2NotEqualTo(String value) {
            addCriterion("h_line_p2 <>", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2GreaterThan(String value) {
            addCriterion("h_line_p2 >", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2GreaterThanOrEqualTo(String value) {
            addCriterion("h_line_p2 >=", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2LessThan(String value) {
            addCriterion("h_line_p2 <", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2LessThanOrEqualTo(String value) {
            addCriterion("h_line_p2 <=", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2Like(String value) {
            addCriterion("h_line_p2 like", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2NotLike(String value) {
            addCriterion("h_line_p2 not like", value, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2In(List<String> values) {
            addCriterion("h_line_p2 in", values, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2NotIn(List<String> values) {
            addCriterion("h_line_p2 not in", values, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2Between(String value1, String value2) {
            addCriterion("h_line_p2 between", value1, value2, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andHLineP2NotBetween(String value1, String value2) {
            addCriterion("h_line_p2 not between", value1, value2, "hLineP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1IsNull() {
            addCriterion("pressure_curve_p1 is null");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1IsNotNull() {
            addCriterion("pressure_curve_p1 is not null");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1EqualTo(String value) {
            addCriterion("pressure_curve_p1 =", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1NotEqualTo(String value) {
            addCriterion("pressure_curve_p1 <>", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1GreaterThan(String value) {
            addCriterion("pressure_curve_p1 >", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1GreaterThanOrEqualTo(String value) {
            addCriterion("pressure_curve_p1 >=", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1LessThan(String value) {
            addCriterion("pressure_curve_p1 <", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1LessThanOrEqualTo(String value) {
            addCriterion("pressure_curve_p1 <=", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1Like(String value) {
            addCriterion("pressure_curve_p1 like", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1NotLike(String value) {
            addCriterion("pressure_curve_p1 not like", value, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1In(List<String> values) {
            addCriterion("pressure_curve_p1 in", values, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1NotIn(List<String> values) {
            addCriterion("pressure_curve_p1 not in", values, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1Between(String value1, String value2) {
            addCriterion("pressure_curve_p1 between", value1, value2, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP1NotBetween(String value1, String value2) {
            addCriterion("pressure_curve_p1 not between", value1, value2, "pressureCurveP1");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2IsNull() {
            addCriterion("pressure_curve_p2 is null");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2IsNotNull() {
            addCriterion("pressure_curve_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2EqualTo(String value) {
            addCriterion("pressure_curve_p2 =", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2NotEqualTo(String value) {
            addCriterion("pressure_curve_p2 <>", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2GreaterThan(String value) {
            addCriterion("pressure_curve_p2 >", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2GreaterThanOrEqualTo(String value) {
            addCriterion("pressure_curve_p2 >=", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2LessThan(String value) {
            addCriterion("pressure_curve_p2 <", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2LessThanOrEqualTo(String value) {
            addCriterion("pressure_curve_p2 <=", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2Like(String value) {
            addCriterion("pressure_curve_p2 like", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2NotLike(String value) {
            addCriterion("pressure_curve_p2 not like", value, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2In(List<String> values) {
            addCriterion("pressure_curve_p2 in", values, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2NotIn(List<String> values) {
            addCriterion("pressure_curve_p2 not in", values, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2Between(String value1, String value2) {
            addCriterion("pressure_curve_p2 between", value1, value2, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andPressureCurveP2NotBetween(String value1, String value2) {
            addCriterion("pressure_curve_p2 not between", value1, value2, "pressureCurveP2");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(String value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(String value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(String value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(String value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(String value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(String value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLike(String value) {
            addCriterion("com_id like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotLike(String value) {
            addCriterion("com_id not like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<String> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<String> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(String value1, String value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(String value1, String value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andProLineIsNull() {
            addCriterion("pro_line is null");
            return (Criteria) this;
        }

        public Criteria andProLineIsNotNull() {
            addCriterion("pro_line is not null");
            return (Criteria) this;
        }

        public Criteria andProLineEqualTo(String value) {
            addCriterion("pro_line =", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineNotEqualTo(String value) {
            addCriterion("pro_line <>", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineGreaterThan(String value) {
            addCriterion("pro_line >", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineGreaterThanOrEqualTo(String value) {
            addCriterion("pro_line >=", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineLessThan(String value) {
            addCriterion("pro_line <", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineLessThanOrEqualTo(String value) {
            addCriterion("pro_line <=", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineLike(String value) {
            addCriterion("pro_line like", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineNotLike(String value) {
            addCriterion("pro_line not like", value, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineIn(List<String> values) {
            addCriterion("pro_line in", values, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineNotIn(List<String> values) {
            addCriterion("pro_line not in", values, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineBetween(String value1, String value2) {
            addCriterion("pro_line between", value1, value2, "proLine");
            return (Criteria) this;
        }

        public Criteria andProLineNotBetween(String value1, String value2) {
            addCriterion("pro_line not between", value1, value2, "proLine");
            return (Criteria) this;
        }

        public Criteria andLineWorkIsNull() {
            addCriterion("line_work is null");
            return (Criteria) this;
        }

        public Criteria andLineWorkIsNotNull() {
            addCriterion("line_work is not null");
            return (Criteria) this;
        }

        public Criteria andLineWorkEqualTo(String value) {
            addCriterion("line_work =", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkNotEqualTo(String value) {
            addCriterion("line_work <>", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkGreaterThan(String value) {
            addCriterion("line_work >", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkGreaterThanOrEqualTo(String value) {
            addCriterion("line_work >=", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkLessThan(String value) {
            addCriterion("line_work <", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkLessThanOrEqualTo(String value) {
            addCriterion("line_work <=", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkLike(String value) {
            addCriterion("line_work like", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkNotLike(String value) {
            addCriterion("line_work not like", value, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkIn(List<String> values) {
            addCriterion("line_work in", values, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkNotIn(List<String> values) {
            addCriterion("line_work not in", values, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkBetween(String value1, String value2) {
            addCriterion("line_work between", value1, value2, "lineWork");
            return (Criteria) this;
        }

        public Criteria andLineWorkNotBetween(String value1, String value2) {
            addCriterion("line_work not between", value1, value2, "lineWork");
            return (Criteria) this;
        }

        public Criteria andDevicePositionIsNull() {
            addCriterion("device_position is null");
            return (Criteria) this;
        }

        public Criteria andDevicePositionIsNotNull() {
            addCriterion("device_position is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePositionEqualTo(String value) {
            addCriterion("device_position =", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionNotEqualTo(String value) {
            addCriterion("device_position <>", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionGreaterThan(String value) {
            addCriterion("device_position >", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionGreaterThanOrEqualTo(String value) {
            addCriterion("device_position >=", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionLessThan(String value) {
            addCriterion("device_position <", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionLessThanOrEqualTo(String value) {
            addCriterion("device_position <=", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionLike(String value) {
            addCriterion("device_position like", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionNotLike(String value) {
            addCriterion("device_position not like", value, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionIn(List<String> values) {
            addCriterion("device_position in", values, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionNotIn(List<String> values) {
            addCriterion("device_position not in", values, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionBetween(String value1, String value2) {
            addCriterion("device_position between", value1, value2, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andDevicePositionNotBetween(String value1, String value2) {
            addCriterion("device_position not between", value1, value2, "devicePosition");
            return (Criteria) this;
        }

        public Criteria andBarCordIsNull() {
            addCriterion("bar_cord is null");
            return (Criteria) this;
        }

        public Criteria andBarCordIsNotNull() {
            addCriterion("bar_cord is not null");
            return (Criteria) this;
        }

        public Criteria andBarCordEqualTo(String value) {
            addCriterion("bar_cord =", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordNotEqualTo(String value) {
            addCriterion("bar_cord <>", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordGreaterThan(String value) {
            addCriterion("bar_cord >", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordGreaterThanOrEqualTo(String value) {
            addCriterion("bar_cord >=", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordLessThan(String value) {
            addCriterion("bar_cord <", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordLessThanOrEqualTo(String value) {
            addCriterion("bar_cord <=", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordLike(String value) {
            addCriterion("bar_cord like", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordNotLike(String value) {
            addCriterion("bar_cord not like", value, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordIn(List<String> values) {
            addCriterion("bar_cord in", values, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordNotIn(List<String> values) {
            addCriterion("bar_cord not in", values, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordBetween(String value1, String value2) {
            addCriterion("bar_cord between", value1, value2, "barCord");
            return (Criteria) this;
        }

        public Criteria andBarCordNotBetween(String value1, String value2) {
            addCriterion("bar_cord not between", value1, value2, "barCord");
            return (Criteria) this;
        }

        public Criteria andDataP2lIsNull() {
            addCriterion("data_p2l is null");
            return (Criteria) this;
        }

        public Criteria andDataP2lIsNotNull() {
            addCriterion("data_p2l is not null");
            return (Criteria) this;
        }

        public Criteria andDataP2lEqualTo(String value) {
            addCriterion("data_p2l =", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lNotEqualTo(String value) {
            addCriterion("data_p2l <>", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lGreaterThan(String value) {
            addCriterion("data_p2l >", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lGreaterThanOrEqualTo(String value) {
            addCriterion("data_p2l >=", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lLessThan(String value) {
            addCriterion("data_p2l <", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lLessThanOrEqualTo(String value) {
            addCriterion("data_p2l <=", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lLike(String value) {
            addCriterion("data_p2l like", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lNotLike(String value) {
            addCriterion("data_p2l not like", value, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lIn(List<String> values) {
            addCriterion("data_p2l in", values, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lNotIn(List<String> values) {
            addCriterion("data_p2l not in", values, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lBetween(String value1, String value2) {
            addCriterion("data_p2l between", value1, value2, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andDataP2lNotBetween(String value1, String value2) {
            addCriterion("data_p2l not between", value1, value2, "dataP2l");
            return (Criteria) this;
        }

        public Criteria andData12IsNull() {
            addCriterion("data_1_2 is null");
            return (Criteria) this;
        }

        public Criteria andData12IsNotNull() {
            addCriterion("data_1_2 is not null");
            return (Criteria) this;
        }

        public Criteria andData12EqualTo(String value) {
            addCriterion("data_1_2 =", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotEqualTo(String value) {
            addCriterion("data_1_2 <>", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12GreaterThan(String value) {
            addCriterion("data_1_2 >", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12GreaterThanOrEqualTo(String value) {
            addCriterion("data_1_2 >=", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12LessThan(String value) {
            addCriterion("data_1_2 <", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12LessThanOrEqualTo(String value) {
            addCriterion("data_1_2 <=", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12Like(String value) {
            addCriterion("data_1_2 like", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotLike(String value) {
            addCriterion("data_1_2 not like", value, "data12");
            return (Criteria) this;
        }

        public Criteria andData12In(List<String> values) {
            addCriterion("data_1_2 in", values, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotIn(List<String> values) {
            addCriterion("data_1_2 not in", values, "data12");
            return (Criteria) this;
        }

        public Criteria andData12Between(String value1, String value2) {
            addCriterion("data_1_2 between", value1, value2, "data12");
            return (Criteria) this;
        }

        public Criteria andData12NotBetween(String value1, String value2) {
            addCriterion("data_1_2 not between", value1, value2, "data12");
            return (Criteria) this;
        }

        public Criteria andData23IsNull() {
            addCriterion("data_2_3 is null");
            return (Criteria) this;
        }

        public Criteria andData23IsNotNull() {
            addCriterion("data_2_3 is not null");
            return (Criteria) this;
        }

        public Criteria andData23EqualTo(String value) {
            addCriterion("data_2_3 =", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotEqualTo(String value) {
            addCriterion("data_2_3 <>", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23GreaterThan(String value) {
            addCriterion("data_2_3 >", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23GreaterThanOrEqualTo(String value) {
            addCriterion("data_2_3 >=", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23LessThan(String value) {
            addCriterion("data_2_3 <", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23LessThanOrEqualTo(String value) {
            addCriterion("data_2_3 <=", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23Like(String value) {
            addCriterion("data_2_3 like", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotLike(String value) {
            addCriterion("data_2_3 not like", value, "data23");
            return (Criteria) this;
        }

        public Criteria andData23In(List<String> values) {
            addCriterion("data_2_3 in", values, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotIn(List<String> values) {
            addCriterion("data_2_3 not in", values, "data23");
            return (Criteria) this;
        }

        public Criteria andData23Between(String value1, String value2) {
            addCriterion("data_2_3 between", value1, value2, "data23");
            return (Criteria) this;
        }

        public Criteria andData23NotBetween(String value1, String value2) {
            addCriterion("data_2_3 not between", value1, value2, "data23");
            return (Criteria) this;
        }

        public Criteria andData24IsNull() {
            addCriterion("data_2_4 is null");
            return (Criteria) this;
        }

        public Criteria andData24IsNotNull() {
            addCriterion("data_2_4 is not null");
            return (Criteria) this;
        }

        public Criteria andData24EqualTo(String value) {
            addCriterion("data_2_4 =", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotEqualTo(String value) {
            addCriterion("data_2_4 <>", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24GreaterThan(String value) {
            addCriterion("data_2_4 >", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24GreaterThanOrEqualTo(String value) {
            addCriterion("data_2_4 >=", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24LessThan(String value) {
            addCriterion("data_2_4 <", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24LessThanOrEqualTo(String value) {
            addCriterion("data_2_4 <=", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24Like(String value) {
            addCriterion("data_2_4 like", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotLike(String value) {
            addCriterion("data_2_4 not like", value, "data24");
            return (Criteria) this;
        }

        public Criteria andData24In(List<String> values) {
            addCriterion("data_2_4 in", values, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotIn(List<String> values) {
            addCriterion("data_2_4 not in", values, "data24");
            return (Criteria) this;
        }

        public Criteria andData24Between(String value1, String value2) {
            addCriterion("data_2_4 between", value1, value2, "data24");
            return (Criteria) this;
        }

        public Criteria andData24NotBetween(String value1, String value2) {
            addCriterion("data_2_4 not between", value1, value2, "data24");
            return (Criteria) this;
        }

        public Criteria andDataP2hIsNull() {
            addCriterion("data_p2h is null");
            return (Criteria) this;
        }

        public Criteria andDataP2hIsNotNull() {
            addCriterion("data_p2h is not null");
            return (Criteria) this;
        }

        public Criteria andDataP2hEqualTo(String value) {
            addCriterion("data_p2h =", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hNotEqualTo(String value) {
            addCriterion("data_p2h <>", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hGreaterThan(String value) {
            addCriterion("data_p2h >", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hGreaterThanOrEqualTo(String value) {
            addCriterion("data_p2h >=", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hLessThan(String value) {
            addCriterion("data_p2h <", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hLessThanOrEqualTo(String value) {
            addCriterion("data_p2h <=", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hLike(String value) {
            addCriterion("data_p2h like", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hNotLike(String value) {
            addCriterion("data_p2h not like", value, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hIn(List<String> values) {
            addCriterion("data_p2h in", values, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hNotIn(List<String> values) {
            addCriterion("data_p2h not in", values, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hBetween(String value1, String value2) {
            addCriterion("data_p2h between", value1, value2, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andDataP2hNotBetween(String value1, String value2) {
            addCriterion("data_p2h not between", value1, value2, "dataP2h");
            return (Criteria) this;
        }

        public Criteria andData56IsNull() {
            addCriterion("data_5_6 is null");
            return (Criteria) this;
        }

        public Criteria andData56IsNotNull() {
            addCriterion("data_5_6 is not null");
            return (Criteria) this;
        }

        public Criteria andData56EqualTo(String value) {
            addCriterion("data_5_6 =", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotEqualTo(String value) {
            addCriterion("data_5_6 <>", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56GreaterThan(String value) {
            addCriterion("data_5_6 >", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56GreaterThanOrEqualTo(String value) {
            addCriterion("data_5_6 >=", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56LessThan(String value) {
            addCriterion("data_5_6 <", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56LessThanOrEqualTo(String value) {
            addCriterion("data_5_6 <=", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56Like(String value) {
            addCriterion("data_5_6 like", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotLike(String value) {
            addCriterion("data_5_6 not like", value, "data56");
            return (Criteria) this;
        }

        public Criteria andData56In(List<String> values) {
            addCriterion("data_5_6 in", values, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotIn(List<String> values) {
            addCriterion("data_5_6 not in", values, "data56");
            return (Criteria) this;
        }

        public Criteria andData56Between(String value1, String value2) {
            addCriterion("data_5_6 between", value1, value2, "data56");
            return (Criteria) this;
        }

        public Criteria andData56NotBetween(String value1, String value2) {
            addCriterion("data_5_6 not between", value1, value2, "data56");
            return (Criteria) this;
        }

        public Criteria andData67IsNull() {
            addCriterion("data_6_7 is null");
            return (Criteria) this;
        }

        public Criteria andData67IsNotNull() {
            addCriterion("data_6_7 is not null");
            return (Criteria) this;
        }

        public Criteria andData67EqualTo(String value) {
            addCriterion("data_6_7 =", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotEqualTo(String value) {
            addCriterion("data_6_7 <>", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67GreaterThan(String value) {
            addCriterion("data_6_7 >", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67GreaterThanOrEqualTo(String value) {
            addCriterion("data_6_7 >=", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67LessThan(String value) {
            addCriterion("data_6_7 <", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67LessThanOrEqualTo(String value) {
            addCriterion("data_6_7 <=", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67Like(String value) {
            addCriterion("data_6_7 like", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotLike(String value) {
            addCriterion("data_6_7 not like", value, "data67");
            return (Criteria) this;
        }

        public Criteria andData67In(List<String> values) {
            addCriterion("data_6_7 in", values, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotIn(List<String> values) {
            addCriterion("data_6_7 not in", values, "data67");
            return (Criteria) this;
        }

        public Criteria andData67Between(String value1, String value2) {
            addCriterion("data_6_7 between", value1, value2, "data67");
            return (Criteria) this;
        }

        public Criteria andData67NotBetween(String value1, String value2) {
            addCriterion("data_6_7 not between", value1, value2, "data67");
            return (Criteria) this;
        }

        public Criteria andData68IsNull() {
            addCriterion("data_6_8 is null");
            return (Criteria) this;
        }

        public Criteria andData68IsNotNull() {
            addCriterion("data_6_8 is not null");
            return (Criteria) this;
        }

        public Criteria andData68EqualTo(String value) {
            addCriterion("data_6_8 =", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotEqualTo(String value) {
            addCriterion("data_6_8 <>", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68GreaterThan(String value) {
            addCriterion("data_6_8 >", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68GreaterThanOrEqualTo(String value) {
            addCriterion("data_6_8 >=", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68LessThan(String value) {
            addCriterion("data_6_8 <", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68LessThanOrEqualTo(String value) {
            addCriterion("data_6_8 <=", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68Like(String value) {
            addCriterion("data_6_8 like", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotLike(String value) {
            addCriterion("data_6_8 not like", value, "data68");
            return (Criteria) this;
        }

        public Criteria andData68In(List<String> values) {
            addCriterion("data_6_8 in", values, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotIn(List<String> values) {
            addCriterion("data_6_8 not in", values, "data68");
            return (Criteria) this;
        }

        public Criteria andData68Between(String value1, String value2) {
            addCriterion("data_6_8 between", value1, value2, "data68");
            return (Criteria) this;
        }

        public Criteria andData68NotBetween(String value1, String value2) {
            addCriterion("data_6_8 not between", value1, value2, "data68");
            return (Criteria) this;
        }

        public Criteria andDataImaxIsNull() {
            addCriterion("data_imax is null");
            return (Criteria) this;
        }

        public Criteria andDataImaxIsNotNull() {
            addCriterion("data_imax is not null");
            return (Criteria) this;
        }

        public Criteria andDataImaxEqualTo(String value) {
            addCriterion("data_imax =", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxNotEqualTo(String value) {
            addCriterion("data_imax <>", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxGreaterThan(String value) {
            addCriterion("data_imax >", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxGreaterThanOrEqualTo(String value) {
            addCriterion("data_imax >=", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxLessThan(String value) {
            addCriterion("data_imax <", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxLessThanOrEqualTo(String value) {
            addCriterion("data_imax <=", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxLike(String value) {
            addCriterion("data_imax like", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxNotLike(String value) {
            addCriterion("data_imax not like", value, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxIn(List<String> values) {
            addCriterion("data_imax in", values, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxNotIn(List<String> values) {
            addCriterion("data_imax not in", values, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxBetween(String value1, String value2) {
            addCriterion("data_imax between", value1, value2, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataImaxNotBetween(String value1, String value2) {
            addCriterion("data_imax not between", value1, value2, "dataImax");
            return (Criteria) this;
        }

        public Criteria andDataQ10IsNull() {
            addCriterion("data_q10 is null");
            return (Criteria) this;
        }

        public Criteria andDataQ10IsNotNull() {
            addCriterion("data_q10 is not null");
            return (Criteria) this;
        }

        public Criteria andDataQ10EqualTo(String value) {
            addCriterion("data_q10 =", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10NotEqualTo(String value) {
            addCriterion("data_q10 <>", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10GreaterThan(String value) {
            addCriterion("data_q10 >", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10GreaterThanOrEqualTo(String value) {
            addCriterion("data_q10 >=", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10LessThan(String value) {
            addCriterion("data_q10 <", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10LessThanOrEqualTo(String value) {
            addCriterion("data_q10 <=", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10Like(String value) {
            addCriterion("data_q10 like", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10NotLike(String value) {
            addCriterion("data_q10 not like", value, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10In(List<String> values) {
            addCriterion("data_q10 in", values, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10NotIn(List<String> values) {
            addCriterion("data_q10 not in", values, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10Between(String value1, String value2) {
            addCriterion("data_q10 between", value1, value2, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ10NotBetween(String value1, String value2) {
            addCriterion("data_q10 not between", value1, value2, "dataQ10");
            return (Criteria) this;
        }

        public Criteria andDataQ11IsNull() {
            addCriterion("data_q11 is null");
            return (Criteria) this;
        }

        public Criteria andDataQ11IsNotNull() {
            addCriterion("data_q11 is not null");
            return (Criteria) this;
        }

        public Criteria andDataQ11EqualTo(String value) {
            addCriterion("data_q11 =", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11NotEqualTo(String value) {
            addCriterion("data_q11 <>", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11GreaterThan(String value) {
            addCriterion("data_q11 >", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11GreaterThanOrEqualTo(String value) {
            addCriterion("data_q11 >=", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11LessThan(String value) {
            addCriterion("data_q11 <", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11LessThanOrEqualTo(String value) {
            addCriterion("data_q11 <=", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11Like(String value) {
            addCriterion("data_q11 like", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11NotLike(String value) {
            addCriterion("data_q11 not like", value, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11In(List<String> values) {
            addCriterion("data_q11 in", values, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11NotIn(List<String> values) {
            addCriterion("data_q11 not in", values, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11Between(String value1, String value2) {
            addCriterion("data_q11 between", value1, value2, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andDataQ11NotBetween(String value1, String value2) {
            addCriterion("data_q11 not between", value1, value2, "dataQ11");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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