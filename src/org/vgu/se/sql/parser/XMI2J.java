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
import java.util.Collection;
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
import org.vgu.se.sql.SqlFactory;

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

public class XMI2J {
    private static SqlFactory factory = SqlFactory.eINSTANCE;
    
    private static ESelect transformSelect(Select select) {
        if (select == null)
            return null;
        ESelect selectXMI = factory.createESelect();
        selectXMI.setSelectBody(transformSelectBody(select.getSelectBody()));
        return selectXMI;
    }

    private static ESelectBody transformSelectBody(SelectBody selectBody) {
        if (selectBody == null)
            return null;
        EPlainSelect plainSelectXMI = transformPlainSelect(
            (PlainSelect) selectBody);
        return plainSelectXMI;
    }

    private static EPlainSelect transformPlainSelect(PlainSelect plainSelect) {
        if (plainSelect == null)
            return null;
        EPlainSelect plainSelectXMI = factory.createEPlainSelect();
        plainSelectXMI
            .setDistinct(transformDistinct(plainSelect.getDistinct()));
        plainSelectXMI.getSelectItems()
            .addAll(transformSelectItems(plainSelect.getSelectItems()));
        plainSelectXMI.getJoins()
            .addAll(transformJoins(plainSelect.getJoins()));
        plainSelectXMI
            .setFromItem(transformFromItem(plainSelect.getFromItem()));
        plainSelectXMI.setWhere(transformExpression(plainSelect.getWhere()));
        plainSelectXMI
            .setGroupBy(transformGroupByElement(plainSelect.getGroupBy()));
        plainSelectXMI.setHaving(transformExpression(plainSelect.getHaving()));
        return plainSelectXMI;
    }

    private static EGroupByElement transformGroupByElement(
        GroupByElement groupBy) {
        if (groupBy == null)
            return null;
        EGroupByElement groupByElementXMI = factory.createEGroupByElement();
        groupByElementXMI.getGroupByExpressions()
            .addAll(transformExpressions(groupBy.getGroupByExpressions()));
        return groupByElementXMI;
    }

    private static Collection<? extends EJoin> transformJoins(
        List<Join> joins) {
        List<EJoin> joinsXMI = new ArrayList<EJoin>();
        if(joins != null) {
            for (Join join : joins) {
                EJoin joinXMI = transformJoin(join);
                joinsXMI.add(joinXMI);
            }
        }
        return joinsXMI;
    }

    private static EJoin transformJoin(Join join) {
        if (join == null)
            return null;
        EJoin joinXMI = factory.createEJoin();
        joinXMI.setOuter(join.isOuter());
        joinXMI.setRight(join.isRight());
        joinXMI.setLeft(join.isLeft());
        joinXMI.setNatural(join.isNatural());
        joinXMI.setFull(join.isFull());
        joinXMI.setInner(join.isInner());
        joinXMI.setSimple(join.isSimple());
        joinXMI.setCross(join.isCross());
        joinXMI.setSemi(join.isSemi());
        joinXMI.setRightItem(transformFromItem(join.getRightItem()));
        joinXMI.setOnExpression(transformExpression(join.getOnExpression()));
        return joinXMI;
    }

    private static EFromItem transformFromItem(FromItem fromItem) {
        if (fromItem == null)
            return null;
        if (fromItem instanceof Table) {
            return transformTable((Table) fromItem);
        } else {
            return transformSubSelect((SubSelect) fromItem);
        }
    }

    private static Collection<? extends ESelectItem> transformSelectItems(
        List<SelectItem> selectItems) {
        List<ESelectItem> selectItemsXMI = new ArrayList<ESelectItem>();
        if(selectItems != null) { 
            for (SelectItem selectItem : selectItems) {
                ESelectItem selectItemXMI = transformSelectItem(selectItem);
                selectItemsXMI.add(selectItemXMI);
            }
        }
        return selectItemsXMI;
    }

    private static ESelectItem transformSelectItem(SelectItem selectItem) {
        if (selectItem == null)
            return null;
        if (selectItem instanceof AllColumns) {
            return transformAllColumns((AllColumns) selectItem);
        } else {
            return transformSelectExpressionItem(
                (SelectExpressionItem) selectItem);
        }
    }

    private static EAllColumns transformAllColumns(AllColumns allColumns) {
        if (allColumns == null)
            return null;
        return factory.createEAllColumns();
    }

    private static ESelectItem transformSelectExpressionItem(
        SelectExpressionItem selectExpressionItem) {
        if (selectExpressionItem == null)
            return null;
        ESelectExpressionItem selectExpressionItemXMI = factory
            .createESelectExpressionItem();
        selectExpressionItemXMI
            .setAlias(transformAlias(selectExpressionItem.getAlias()));
        selectExpressionItemXMI.setExpression(
            transformExpression(selectExpressionItem.getExpression()));
        return selectExpressionItemXMI;
    }

    private static EExpression transformExpression(Expression expression) {
        if (expression == null)
            return null;
        if (expression instanceof StringValue) {
            return transformStringValue((StringValue) expression);
        } else if (expression instanceof LongValue) {
            return transformLongValue((LongValue) expression);
        } else if (expression instanceof BinaryExpression) {
            return transformBinaryExpression((BinaryExpression) expression);
        } else if (expression instanceof SubSelect) {
            return transformSubSelect((SubSelect) expression);
        } else if (expression instanceof NullValue) {
            return transformNullValue((NullValue) expression);
        } else if (expression instanceof IsNullExpression) {
            return transformIsNullExpression((IsNullExpression) expression);
        } else if (expression instanceof Function) {
            return transformFunction((Function) expression);
        } else if (expression instanceof Column) {
            return transformColumn((Column) expression);
        } else if (expression instanceof CaseExpression) {
            return transformCaseExpression((CaseExpression) expression);
        } else {
            return transformWhenClause((WhenClause) expression);
        }
    }

    private static ECaseExpression transformCaseExpression(
        CaseExpression caseExpression) {
        if (caseExpression == null)
            return null;
        ECaseExpression caseExpressionXMI = factory.createECaseExpression();
        caseExpressionXMI.setSwitchExpression(
            transformExpression(caseExpression.getSwitchExpression()));
        caseExpressionXMI.setElseExpression(
            transformExpression(caseExpression.getElseExpression()));
        caseExpressionXMI.getWhenClauses()
            .addAll(transformWhenClauses(caseExpression.getWhenClauses()));
        return caseExpressionXMI;
    }

    private static Collection<? extends EWhenClause> transformWhenClauses(
        List<WhenClause> whenClauses) {
        List<EWhenClause> whenClausesXMI = new ArrayList<EWhenClause>();
        if(whenClauses != null) {
            for (WhenClause whenClause : whenClauses) {
                EWhenClause whenClauseXMI = transformWhenClause(whenClause);
                whenClausesXMI.add(whenClauseXMI);
            }
        }
        return whenClausesXMI;
    }

    private static EWhenClause transformWhenClause(WhenClause whenClause) {
        if (whenClause == null)
            return null;
        EWhenClause whenClauseXMI = factory.createEWhenClause();
        whenClauseXMI.setWhenExpression(
            transformExpression(whenClause.getWhenExpression()));
        whenClauseXMI.setThenExpression(
            transformExpression(whenClause.getThenExpression()));
        return whenClauseXMI;
    }

    private static EColumn transformColumn(Column column) {
        if (column == null)
            return null;
        EColumn columnXMI = factory.createEColumn();
        columnXMI.setColumnName(column.getColumnName());
        columnXMI.setTable(transformTable(column.getTable()));
        return columnXMI;
    }

    private static ETable transformTable(Table table) {
        if (table == null)
            return null;
        ETable tableXMI = factory.createETable();
        tableXMI.setAlias(transformAlias(table.getAlias()));
        tableXMI.setName(table.getName());
        return tableXMI;
    }

    private static EFunction transformFunction(Function function) {
        if (function == null)
            return null;
        EFunction functionXMI = factory.createEFunction();
        functionXMI.setAllColumns(function.isAllColumns());
        functionXMI.setDistinct(function.isDistinct());
        functionXMI.setName(function.getName());
        functionXMI
            .setParameters(transformExpressionList(function.getParameters()));
        return functionXMI;
    }

    private static EExpressionList transformExpressionList(
        ExpressionList expressionList) {
        if (expressionList == null)
            return null;
        EExpressionList expressionListXMI = factory.createEExpressionList();
        expressionListXMI.getExpressions()
            .addAll(transformExpressions(expressionList.getExpressions()));
        return expressionListXMI;
    }

    private static Collection<? extends EExpression> transformExpressions(
        List<Expression> expressions) {
        List<EExpression> expressionsXMI = new ArrayList<EExpression>();
        if(expressions != null) {    
            for (Expression expression : expressions) {
                EExpression expressionXMI = transformExpression(expression);
                expressionsXMI.add(expressionXMI);
            }
        }
        return expressionsXMI;
    }

    private static EIsNullExpression transformIsNullExpression(
        IsNullExpression isNullExpression) {
        if (isNullExpression == null)
            return null;
        EIsNullExpression isNullExpressionXMI = factory
            .createEIsNullExpression();
        isNullExpressionXMI.setLeftExpression(
            transformExpression(isNullExpression.getLeftExpression()));
        isNullExpressionXMI.setNot(isNullExpression.isNot());
        return isNullExpressionXMI;
    }

    private static ENullValue transformNullValue(NullValue nullValue) {
        if (nullValue == null)
            return null;
        return factory.createENullValue();
    }

    private static ESubSelect transformSubSelect(SubSelect subSelect) {
        if (subSelect == null)
            return null;
        ESubSelect subSelectXMI = factory.createESubSelect();
        subSelectXMI.setAlias(transformAlias(subSelect.getAlias()));
        subSelectXMI
            .setSelectBody(transformSelectBody(subSelect.getSelectBody()));
        return subSelectXMI;
    }

    private static EComparisonOperator transformComparisonOperator(
        ComparisonOperator comparisonOperator) {
        if (comparisonOperator == null)
            return null;
        if (comparisonOperator instanceof EqualsTo) {
            return transformEqualsTo((EqualsTo) comparisonOperator);
        } else if (comparisonOperator instanceof GreaterThan) {
            return transformGreaterThan((GreaterThan) comparisonOperator);
        } else if (comparisonOperator instanceof GreaterThanEquals) {
            return transformGreateThanEquals(
                (GreaterThanEquals) comparisonOperator);
        } else if (comparisonOperator instanceof MinorThan) {
            return transformMinorThan((MinorThan) comparisonOperator);
        } else if (comparisonOperator instanceof MinorThanEquals) {
            return transformMinorThanEquals(
                (MinorThanEquals) comparisonOperator);
        } else {
            return transformNotEqualsTo((NotEqualsTo) comparisonOperator);
        }
    }

    private static ENotEqualsTo transformNotEqualsTo(NotEqualsTo notEqualsTo) {
        if (notEqualsTo == null)
            return null;
        ENotEqualsTo notEqualsToXMI = factory.createENotEqualsTo();
        notEqualsToXMI.setLeftExpression(
            transformExpression(notEqualsTo.getLeftExpression()));
        notEqualsToXMI.setRightExpression(
            transformExpression(notEqualsTo.getRightExpression()));
        return notEqualsToXMI;
    }

    private static EMinorThanEquals transformMinorThanEquals(
        MinorThanEquals minorThanEquals) {
        if (minorThanEquals == null)
            return null;
        EMinorThanEquals minorThanEqualsXMI = factory.createEMinorThanEquals();
        minorThanEqualsXMI.setLeftExpression(
            transformExpression(minorThanEquals.getLeftExpression()));
        minorThanEqualsXMI.setRightExpression(
            transformExpression(minorThanEquals.getRightExpression()));
        return minorThanEqualsXMI;
    }

    private static EMinorThan transformMinorThan(MinorThan minorThan) {
        if (minorThan == null)
            return null;
        EMinorThan minorThanXMI = factory.createEMinorThan();
        minorThanXMI.setLeftExpression(
            transformExpression(minorThan.getLeftExpression()));
        minorThanXMI.setRightExpression(
            transformExpression(minorThan.getRightExpression()));
        return minorThanXMI;
    }

    private static EGreaterThanEquals transformGreateThanEquals(
        GreaterThanEquals greaterThanEquals) {
        if (greaterThanEquals == null)
            return null;
        EGreaterThanEquals greaterThanEqualsXMI = factory
            .createEGreaterThanEquals();
        greaterThanEqualsXMI.setLeftExpression(
            transformExpression(greaterThanEquals.getLeftExpression()));
        greaterThanEqualsXMI.setRightExpression(
            transformExpression(greaterThanEquals.getRightExpression()));
        return greaterThanEqualsXMI;
    }

    private static EGreaterThan transformGreaterThan(GreaterThan greaterThan) {
        if (greaterThan == null)
            return null;
        EGreaterThan greaterThanXMI = factory.createEGreaterThan();
        greaterThanXMI.setLeftExpression(
            transformExpression(greaterThan.getLeftExpression()));
        greaterThanXMI.setRightExpression(
            transformExpression(greaterThan.getRightExpression()));
        return greaterThanXMI;
    }

    private static EEqualsTo transformEqualsTo(EqualsTo equalsTo) {
        if (equalsTo == null)
            return null;
        EEqualsTo equalsToXMI = factory.createEEqualsTo();
        equalsToXMI.setLeftExpression(
            transformExpression(equalsTo.getLeftExpression()));
        equalsToXMI.setRightExpression(
            transformExpression(equalsTo.getRightExpression()));
        return equalsToXMI;
    }

    private static EBinaryExpression transformBinaryExpression(
        BinaryExpression binaryExpression) {
        if (binaryExpression == null)
            return null;
        if (binaryExpression instanceof AndExpression) {
            return transformAndExpression((AndExpression) binaryExpression);
        } else if (binaryExpression instanceof ComparisonOperator) {
            return transformComparisonOperator(
                (ComparisonOperator) binaryExpression);
        } else {
            return transformOrExpression((OrExpression) binaryExpression);
        }
    }

    private static EOrExpression transformOrExpression(
        OrExpression orExpression) {
        if (orExpression == null)
            return null;
        EOrExpression orExpressionXMI = factory.createEOrExpression();
        orExpressionXMI.setLeftExpression(
            transformExpression(orExpression.getLeftExpression()));
        orExpressionXMI.setRightExpression(
            transformExpression(orExpression.getRightExpression()));
        return orExpressionXMI;
    }

    private static EAndExpression transformAndExpression(
        AndExpression andExpression) {
        if (andExpression == null)
            return null;
        EAndExpression andExpressionXMI = factory.createEAndExpression();
        andExpressionXMI.setLeftExpression(
            transformExpression(andExpression.getLeftExpression()));
        andExpressionXMI.setRightExpression(
            transformExpression(andExpression.getRightExpression()));
        return andExpressionXMI;
    }

    private static EStringValue transformStringValue(StringValue stringValue) {
        if (stringValue == null)
            return null;
        EStringValue stringValueXMI = factory.createEStringValue();
        stringValueXMI.setValue(stringValue.getValue());
        return stringValueXMI;
    }

    private static ELongValue transformLongValue(LongValue longValue) {
        if (longValue == null)
            return null;
        ELongValue longValueXMI = factory.createELongValue();
        longValueXMI.setValue(longValue.getValue());
        return longValueXMI;
    }

    private static EAlias transformAlias(Alias alias) {
        if (alias == null)
            return null;
        EAlias aliasXMI = factory.createEAlias();
        aliasXMI.setName(alias.getName());
        return aliasXMI;
    }

    private static EDistinct transformDistinct(Distinct distinct) {
        if (distinct == null)
            return null;
        EDistinct distinctXMI = factory.createEDistinct();
        distinctXMI.setUseUnique(distinct.isUseUnique());
        distinctXMI.getOnSelectItems()
            .addAll(transformSelectItems(distinct.getOnSelectItems()));
        return distinctXMI;
    }

    public static EStatement transform(Statement statement) {
        if (statement == null)
            return null;
        ESelect selectXMI = transformSelect((Select) statement);
        return selectXMI;
    }
}
