/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: ngpbh
***************************************************************************/

package org.vgu.se.sql.parser;

import java.util.ArrayList;
import java.util.List;

import org.vgu.se.sql.EAlias;
import org.vgu.se.sql.EAllColumns;
import org.vgu.se.sql.EAndExpression;
import org.vgu.se.sql.EBinaryExpression;
import org.vgu.se.sql.ECaseExpression;
import org.vgu.se.sql.EColumn;
import org.vgu.se.sql.EComparisonOperator;
import org.vgu.se.sql.EDistinct;
import org.vgu.se.sql.EEqualsTo;
import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.EExpressionList;
import org.vgu.se.sql.EFromItem;
import org.vgu.se.sql.EFunction;
import org.vgu.se.sql.EGreaterThan;
import org.vgu.se.sql.EGreaterThanEquals;
import org.vgu.se.sql.EGroupByElement;
import org.vgu.se.sql.EIsNullExpression;
import org.vgu.se.sql.EJoin;
import org.vgu.se.sql.ELongValue;
import org.vgu.se.sql.EMinorThan;
import org.vgu.se.sql.EMinorThanEquals;
import org.vgu.se.sql.ENotEqualsTo;
import org.vgu.se.sql.ENullValue;
import org.vgu.se.sql.EOrExpression;
import org.vgu.se.sql.EPlainSelect;
import org.vgu.se.sql.ESelect;
import org.vgu.se.sql.ESelectBody;
import org.vgu.se.sql.ESelectExpressionItem;
import org.vgu.se.sql.ESelectItem;
import org.vgu.se.sql.EStatement;
import org.vgu.se.sql.EStringValue;
import org.vgu.se.sql.ESubSelect;
import org.vgu.se.sql.ETable;
import org.vgu.se.sql.EWhenClause;

import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.CaseExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.Function;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.NullValue;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.WhenClause;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.ComparisonOperator;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.GreaterThan;
import net.sf.jsqlparser.expression.operators.relational.GreaterThanEquals;
import net.sf.jsqlparser.expression.operators.relational.IsNullExpression;
import net.sf.jsqlparser.expression.operators.relational.MinorThan;
import net.sf.jsqlparser.expression.operators.relational.MinorThanEquals;
import net.sf.jsqlparser.expression.operators.relational.NotEqualsTo;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.AllColumns;
import net.sf.jsqlparser.statement.select.Distinct;
import net.sf.jsqlparser.statement.select.FromItem;
import net.sf.jsqlparser.statement.select.GroupByElement;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SubSelect;

public class J2XMI {

    public static Statement transform(EStatement statementXMI) {
        if (statementXMI == null)
            return null;
        Select select = transformSelect((ESelect) statementXMI);
        return select;
    }

    private static Select transformSelect(ESelect selectXMI) {
        if (selectXMI == null)
            return null;
        Select select = new Select();
        select.setSelectBody(transformSelectBody(selectXMI.getSelectBody()));
        return select;
    }

    private static SelectBody transformSelectBody(ESelectBody selectBodyXMI) {
        if (selectBodyXMI == null)
            return null;
        PlainSelect plainSelect = transformPlainSelect(
            (EPlainSelect) selectBodyXMI);
        return plainSelect;
    }

    private static PlainSelect transformPlainSelect(
        EPlainSelect plainSelectXMI) {
        if (plainSelectXMI == null)
            return null;
        PlainSelect plainSelect = new PlainSelect();
        plainSelect
            .setDistinct(transformDistinct(plainSelectXMI.getDistinct()));
        plainSelect.setSelectItems(transformSelectItems(plainSelectXMI.getSelectItems()));
        plainSelect.setJoins(transformJoins(plainSelectXMI.getJoins()));
        plainSelect
            .setFromItem(transformFromItem(plainSelectXMI.getFromItem()));
        plainSelect.setWhere(transformExpression(plainSelectXMI.getWhere()));
        plainSelect.setGroupByElement(
            transformGroupByElement(plainSelectXMI.getGroupBy()));
        plainSelect.setHaving(transformExpression(plainSelectXMI.getHaving()));
        return plainSelect;
    }

    private static GroupByElement transformGroupByElement(
        EGroupByElement groupByXMI) {
        if (groupByXMI == null)
            return null;
        GroupByElement groupByElement = new GroupByElement();
        groupByElement.setGroupByExpressions(transformExpressions(groupByXMI.getGroupByExpressions()));
        return groupByElement;
    }

    private static List<Join> transformJoins(
        List<EJoin> joinsXMI) {
        List<Join> joins = new ArrayList<Join>();
        for (EJoin joinXMI : joinsXMI) {
            Join join = transformJoin(joinXMI);
            joins.add(join);
        }
        return joins;
    }

    private static Join transformJoin(EJoin joinXMI) {
        if (joinXMI == null)
            return null;
        Join join = new Join();
        join.setOuter(joinXMI.isOuter());
        join.setRight(joinXMI.isRight());
        join.setLeft(joinXMI.isLeft());
        join.setNatural(joinXMI.isNatural());
        join.setFull(joinXMI.isFull());
        join.setInner(joinXMI.isInner());
        join.setSimple(joinXMI.isSimple());
        join.setCross(joinXMI.isCross());
        join.setSemi(joinXMI.isSemi());
        join.setRightItem(transformFromItem(joinXMI.getRightItem()));
        join.setOnExpression(transformExpression(joinXMI.getOnExpression()));
        return join;
    }

    private static FromItem transformFromItem(EFromItem fromItemXMI) {
        if (fromItemXMI == null)
            return null;
        if (fromItemXMI instanceof ETable) {
            return transformTable((ETable) fromItemXMI);
        } else {
            return transformSubSelect((ESubSelect) fromItemXMI);
        }
    }

    private static List<SelectItem> transformSelectItems(
        List<ESelectItem> selectItemsXMI) {
        List<SelectItem> selectItems = new ArrayList<SelectItem>();
        for (ESelectItem selectItemXMI : selectItemsXMI) {
            SelectItem selectItem = transformSelectItem(selectItemXMI);
            selectItems.add(selectItem);
        }
        return selectItems;
    }

    private static SelectItem transformSelectItem(ESelectItem selectItemXMI) {
        if (selectItemXMI == null)
            return null;
        if (selectItemXMI instanceof EAllColumns) {
            return transformAllColumns((EAllColumns) selectItemXMI);
        } else {
            return transformSelectExpressionItem(
                (ESelectExpressionItem) selectItemXMI);
        }
    }

    private static AllColumns transformAllColumns(EAllColumns allColumnsXMI) {
        if (allColumnsXMI == null)
            return null;
        return new AllColumns();
    }

    private static SelectItem transformSelectExpressionItem(
        ESelectExpressionItem selectExpressionItemXMI) {
        if (selectExpressionItemXMI == null)
            return null;
        SelectExpressionItem selectExpressionItem = new SelectExpressionItem();
        selectExpressionItem
            .setAlias(transformAlias(selectExpressionItemXMI.getAlias()));
        selectExpressionItem.setExpression(
            transformExpression(selectExpressionItemXMI.getExpression()));
        return selectExpressionItem;
    }

    private static Expression transformExpression(EExpression expressionXMI) {
        if (expressionXMI == null)
            return null;
        if (expressionXMI instanceof EStringValue) {
            return transformStringValue((EStringValue) expressionXMI);
        } else if (expressionXMI instanceof ELongValue) {
            return transformLongValue((ELongValue) expressionXMI);
        } else if (expressionXMI instanceof EBinaryExpression) {
            return transformBinaryExpression((EBinaryExpression) expressionXMI);
        } else if (expressionXMI instanceof ESubSelect) {
            return transformSubSelect((ESubSelect) expressionXMI);
        } else if (expressionXMI instanceof ENullValue) {
            return transformNullValue((ENullValue) expressionXMI);
        } else if (expressionXMI instanceof EIsNullExpression) {
            return transformIsNullExpression((EIsNullExpression) expressionXMI);
        } else if (expressionXMI instanceof EFunction) {
            return transformFunction((EFunction) expressionXMI);
        } else if (expressionXMI instanceof EColumn) {
            return transformColumn((EColumn) expressionXMI);
        } else if (expressionXMI instanceof ECaseExpression) {
            return transformCaseExpression((ECaseExpression) expressionXMI);
        } else {
            return transformWhenClause((EWhenClause) expressionXMI);
        }
    }

    private static CaseExpression transformCaseExpression(
        ECaseExpression caseExpressionXMI) {
        if (caseExpressionXMI == null)
            return null;
        CaseExpression caseExpression = new CaseExpression();
        caseExpression.setSwitchExpression(
            transformExpression(caseExpressionXMI.getSwitchExpression()));
        caseExpression.setElseExpression(
            transformExpression(caseExpressionXMI.getElseExpression()));
        caseExpression.setWhenClauses(transformWhenClauses(caseExpressionXMI.getWhenClauses()));
        return caseExpression;
    }

    private static List<WhenClause> transformWhenClauses(
        List<EWhenClause> whenClausesXMI) {
        List<WhenClause> whenClauses = new ArrayList<WhenClause>();
        for (EWhenClause whenClauseXMI : whenClausesXMI) {
            WhenClause whenClause = transformWhenClause(whenClauseXMI);
            whenClauses.add(whenClause);
        }
        return whenClauses;
    }

    private static WhenClause transformWhenClause(EWhenClause whenClauseXMI) {
        if (whenClauseXMI == null)
            return null;
        WhenClause whenClause = new WhenClause();
        whenClause.setWhenExpression(
            transformExpression(whenClauseXMI.getWhenExpression()));
        whenClause.setThenExpression(
            transformExpression(whenClauseXMI.getThenExpression()));
        return whenClause;
    }

    private static Column transformColumn(EColumn columnXMI) {
        if (columnXMI == null)
            return null;
        Column column = new Column();
        column.setColumnName(columnXMI.getColumnName());
        column.setTable(transformTable(columnXMI.getTable()));
        return column;
    }

    private static Table transformTable(ETable tableXMI) {
        if (tableXMI == null)
            return null;
        Table table = new Table();
        table.setAlias(transformAlias(tableXMI.getAlias()));
        table.setName(tableXMI.getName());
        return table;
    }

    private static Function transformFunction(EFunction functionXMI) {
        if (functionXMI == null)
            return null;
        Function function = new Function();
        function.setAllColumns(functionXMI.isAllColumns());
        function.setDistinct(functionXMI.isDistinct());
        function.setName(functionXMI.getName());
        function.setParameters(
            transformExpressionList(functionXMI.getParameters()));
        return function;
    }

    private static ExpressionList transformExpressionList(
        EExpressionList expressionListXMI) {
        if (expressionListXMI == null)
            return null;
        ExpressionList expressionList = new ExpressionList();
        expressionList.setExpressions(transformExpressions(expressionListXMI.getExpressions()));
        return expressionList;
    }

    private static List<Expression> transformExpressions(
        List<EExpression> expressionsXMI) {
        List<Expression> expressions = new ArrayList<Expression>();
        for (EExpression expressionXMI : expressionsXMI) {
            Expression expression = transformExpression(expressionXMI);
            expressions.add(expression);
        }
        return expressions;
    }

    private static IsNullExpression transformIsNullExpression(
        EIsNullExpression isNullExpressionXMI) {
        if (isNullExpressionXMI == null)
            return null;
        IsNullExpression isNullExpression = new IsNullExpression();
        isNullExpression.setLeftExpression(
            transformExpression(isNullExpressionXMI.getLeftExpression()));
        isNullExpression.setNot(isNullExpressionXMI.isNot());
        return isNullExpression;
    }

    private static NullValue transformNullValue(ENullValue nullValueXMI) {
        if (nullValueXMI == null)
            return null;
        return new NullValue();
    }

    private static SubSelect transformSubSelect(ESubSelect subSelectXMI) {
        if (subSelectXMI == null)
            return null;
        SubSelect subSelect = new SubSelect();
        subSelect.setAlias(transformAlias(subSelectXMI.getAlias()));
        subSelect
            .setSelectBody(transformSelectBody(subSelectXMI.getSelectBody()));
        return subSelect;
    }

    private static ComparisonOperator transformComparisonOperator(
        EComparisonOperator comparisonOperatorXMI) {
        if (comparisonOperatorXMI == null)
            return null;
        if (comparisonOperatorXMI instanceof EEqualsTo) {
            return transformEqualsTo((EEqualsTo) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof EGreaterThan) {
            return transformGreaterThan((EGreaterThan) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof EGreaterThanEquals) {
            return transformGreateThanEquals(
                (EGreaterThanEquals) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof EMinorThan) {
            return transformMinorThan((EMinorThan) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof EMinorThanEquals) {
            return transformMinorThanEquals(
                (EMinorThanEquals) comparisonOperatorXMI);
        } else {
            return transformNotEqualsTo((ENotEqualsTo) comparisonOperatorXMI);
        }
    }

    private static NotEqualsTo transformNotEqualsTo(
        ENotEqualsTo notEqualsToXMI) {
        if (notEqualsToXMI == null)
            return null;
        NotEqualsTo notEqualsTo = new NotEqualsTo();
        notEqualsTo.setLeftExpression(
            transformExpression(notEqualsToXMI.getLeftExpression()));
        notEqualsTo.setRightExpression(
            transformExpression(notEqualsToXMI.getRightExpression()));
        return notEqualsTo;
    }

    private static MinorThanEquals transformMinorThanEquals(
        EMinorThanEquals minorThanEqualsXMI) {
        if (minorThanEqualsXMI == null)
            return null;
        MinorThanEquals minorThanEquals = new MinorThanEquals();
        minorThanEquals.setLeftExpression(
            transformExpression(minorThanEqualsXMI.getLeftExpression()));
        minorThanEquals.setRightExpression(
            transformExpression(minorThanEqualsXMI.getRightExpression()));
        return minorThanEquals;
    }

    private static MinorThan transformMinorThan(EMinorThan minorThanXMI) {
        if (minorThanXMI == null)
            return null;
        MinorThan minorThan = new MinorThan();
        minorThan.setLeftExpression(
            transformExpression(minorThanXMI.getLeftExpression()));
        minorThan.setRightExpression(
            transformExpression(minorThanXMI.getRightExpression()));
        return minorThan;
    }

    private static GreaterThanEquals transformGreateThanEquals(
        EGreaterThanEquals greaterThanEqualsXMI) {
        if (greaterThanEqualsXMI == null)
            return null;
        GreaterThanEquals greaterThanEquals = new GreaterThanEquals();
        greaterThanEquals.setLeftExpression(
            transformExpression(greaterThanEqualsXMI.getLeftExpression()));
        greaterThanEquals.setRightExpression(
            transformExpression(greaterThanEqualsXMI.getRightExpression()));
        return greaterThanEquals;
    }

    private static GreaterThan transformGreaterThan(
        EGreaterThan greaterThanXMI) {
        if (greaterThanXMI == null)
            return null;
        GreaterThan greaterThan = new GreaterThan();
        greaterThan.setLeftExpression(
            transformExpression(greaterThanXMI.getLeftExpression()));
        greaterThan.setRightExpression(
            transformExpression(greaterThanXMI.getRightExpression()));
        return greaterThan;
    }

    private static EqualsTo transformEqualsTo(EEqualsTo equalsToXMI) {
        if (equalsToXMI == null)
            return null;
        EqualsTo equalsTo = new EqualsTo();
        equalsTo.setLeftExpression(
            transformExpression(equalsToXMI.getLeftExpression()));
        equalsTo.setRightExpression(
            transformExpression(equalsToXMI.getRightExpression()));
        return equalsTo;
    }

    private static BinaryExpression transformBinaryExpression(
        EBinaryExpression binaryExpressionXMI) {
        if (binaryExpressionXMI == null)
            return null;
        if (binaryExpressionXMI instanceof EAndExpression) {
            return transformAndExpression((EAndExpression) binaryExpressionXMI);
        } else if (binaryExpressionXMI instanceof EComparisonOperator) {
            return transformComparisonOperator(
                (EComparisonOperator) binaryExpressionXMI);
        } else {
            return transformOrExpression((EOrExpression) binaryExpressionXMI);
        }
    }

    private static OrExpression transformOrExpression(
        EOrExpression orExpressionXMI) {
        if (orExpressionXMI == null)
            return null;
        OrExpression orExpression = new OrExpression(null, null);
        orExpression.setLeftExpression(
            transformExpression(orExpressionXMI.getLeftExpression()));
        orExpression.setRightExpression(
            transformExpression(orExpressionXMI.getRightExpression()));
        return orExpression;
    }

    private static AndExpression transformAndExpression(
        EAndExpression andExpressionXMI) {
        if (andExpressionXMI == null)
            return null;
        AndExpression andExpression = new AndExpression(null, null);
        andExpression.setLeftExpression(
            transformExpression(andExpressionXMI.getLeftExpression()));
        andExpression.setRightExpression(
            transformExpression(andExpressionXMI.getRightExpression()));
        return andExpression;
    }

    private static StringValue transformStringValue(
        EStringValue stringValueXMI) {
        if (stringValueXMI == null)
            return null;
        StringValue stringValue = new StringValue(stringValueXMI.getValue());
        return stringValue;
    }

    private static LongValue transformLongValue(ELongValue longValueXMI) {
        if (longValueXMI == null)
            return null;
        LongValue longValue = new LongValue(longValueXMI.getValue());
        return longValue;
    }

    private static Alias transformAlias(EAlias aliasXMI) {
        if (aliasXMI == null)
            return null;
        Alias alias = new Alias(aliasXMI.getName());
        return alias;
    }

    private static Distinct transformDistinct(EDistinct distinctXMI) {
        if (distinctXMI == null)
            return null;
        Distinct distinct = new Distinct();
        distinct.setUseUnique(distinctXMI.isUseUnique());
        distinct.setOnSelectItems(transformSelectItems(distinctXMI.getOnSelectItems()));
        return distinct;
    }

}
