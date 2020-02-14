/**
 */
package org.vgu.se.sql.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.vgu.se.sql.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.sql.SqlPackage
 * @generated
 */
public class SqlAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SqlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SqlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SqlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SqlSwitch<Adapter> modelSwitch = new SqlSwitch<Adapter>() {
        @Override
        public Adapter caseEStatement(EStatement object) {
            return createEStatementAdapter();
        }

        @Override
        public Adapter caseESelect(ESelect object) {
            return createESelectAdapter();
        }

        @Override
        public Adapter caseESelectBody(ESelectBody object) {
            return createESelectBodyAdapter();
        }

        @Override
        public Adapter caseEPlainSelect(EPlainSelect object) {
            return createEPlainSelectAdapter();
        }

        @Override
        public Adapter caseEDistinct(EDistinct object) {
            return createEDistinctAdapter();
        }

        @Override
        public Adapter caseEGroupByElement(EGroupByElement object) {
            return createEGroupByElementAdapter();
        }

        @Override
        public Adapter caseEJoin(EJoin object) {
            return createEJoinAdapter();
        }

        @Override
        public Adapter caseEAlias(EAlias object) {
            return createEAliasAdapter();
        }

        @Override
        public Adapter caseEExpression(EExpression object) {
            return createEExpressionAdapter();
        }

        @Override
        public Adapter caseEBinaryExpression(EBinaryExpression object) {
            return createEBinaryExpressionAdapter();
        }

        @Override
        public Adapter caseEAndExpression(EAndExpression object) {
            return createEAndExpressionAdapter();
        }

        @Override
        public Adapter caseEOrExpression(EOrExpression object) {
            return createEOrExpressionAdapter();
        }

        @Override
        public Adapter caseEComparisonOperator(EComparisonOperator object) {
            return createEComparisonOperatorAdapter();
        }

        @Override
        public Adapter caseEEqualsTo(EEqualsTo object) {
            return createEEqualsToAdapter();
        }

        @Override
        public Adapter caseEGreaterThan(EGreaterThan object) {
            return createEGreaterThanAdapter();
        }

        @Override
        public Adapter caseEGreaterThanEquals(EGreaterThanEquals object) {
            return createEGreaterThanEqualsAdapter();
        }

        @Override
        public Adapter caseEMinorThan(EMinorThan object) {
            return createEMinorThanAdapter();
        }

        @Override
        public Adapter caseEMinorThanEquals(EMinorThanEquals object) {
            return createEMinorThanEqualsAdapter();
        }

        @Override
        public Adapter caseENotEqualsTo(ENotEqualsTo object) {
            return createENotEqualsToAdapter();
        }

        @Override
        public Adapter caseESelectItem(ESelectItem object) {
            return createESelectItemAdapter();
        }

        @Override
        public Adapter caseEAllColumns(EAllColumns object) {
            return createEAllColumnsAdapter();
        }

        @Override
        public Adapter caseESelectExpressionItem(ESelectExpressionItem object) {
            return createESelectExpressionItemAdapter();
        }

        @Override
        public Adapter caseEFromItem(EFromItem object) {
            return createEFromItemAdapter();
        }

        @Override
        public Adapter caseETable(ETable object) {
            return createETableAdapter();
        }

        @Override
        public Adapter caseESubSelect(ESubSelect object) {
            return createESubSelectAdapter();
        }

        @Override
        public Adapter caseENotExpression(ENotExpression object) {
            return createENotExpressionAdapter();
        }

        @Override
        public Adapter caseELongValue(ELongValue object) {
            return createELongValueAdapter();
        }

        @Override
        public Adapter caseENullValue(ENullValue object) {
            return createENullValueAdapter();
        }

        @Override
        public Adapter caseEIsNullExpression(EIsNullExpression object) {
            return createEIsNullExpressionAdapter();
        }

        @Override
        public Adapter caseEFunction(EFunction object) {
            return createEFunctionAdapter();
        }

        @Override
        public Adapter caseEColumn(EColumn object) {
            return createEColumnAdapter();
        }

        @Override
        public Adapter caseECaseExpression(ECaseExpression object) {
            return createECaseExpressionAdapter();
        }

        @Override
        public Adapter caseEWhenClause(EWhenClause object) {
            return createEWhenClauseAdapter();
        }

        @Override
        public Adapter caseEStringValue(EStringValue object) {
            return createEStringValueAdapter();
        }

        @Override
        public Adapter caseEExpressionList(EExpressionList object) {
            return createEExpressionListAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EStatement <em>EStatement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EStatement
     * @generated
     */
    public Adapter createEStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ESelect <em>ESelect</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ESelect
     * @generated
     */
    public Adapter createESelectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ESelectBody <em>ESelect Body</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ESelectBody
     * @generated
     */
    public Adapter createESelectBodyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EPlainSelect <em>EPlain Select</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EPlainSelect
     * @generated
     */
    public Adapter createEPlainSelectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EDistinct <em>EDistinct</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EDistinct
     * @generated
     */
    public Adapter createEDistinctAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EGroupByElement <em>EGroup By Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EGroupByElement
     * @generated
     */
    public Adapter createEGroupByElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EJoin <em>EJoin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EJoin
     * @generated
     */
    public Adapter createEJoinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EAlias <em>EAlias</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EAlias
     * @generated
     */
    public Adapter createEAliasAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EExpression <em>EExpression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EExpression
     * @generated
     */
    public Adapter createEExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EBinaryExpression <em>EBinary Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EBinaryExpression
     * @generated
     */
    public Adapter createEBinaryExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EAndExpression <em>EAnd Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EAndExpression
     * @generated
     */
    public Adapter createEAndExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EOrExpression <em>EOr Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EOrExpression
     * @generated
     */
    public Adapter createEOrExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EComparisonOperator <em>EComparison Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EComparisonOperator
     * @generated
     */
    public Adapter createEComparisonOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EEqualsTo <em>EEquals To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EEqualsTo
     * @generated
     */
    public Adapter createEEqualsToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EGreaterThan <em>EGreater Than</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EGreaterThan
     * @generated
     */
    public Adapter createEGreaterThanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EGreaterThanEquals <em>EGreater Than Equals</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EGreaterThanEquals
     * @generated
     */
    public Adapter createEGreaterThanEqualsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EMinorThan <em>EMinor Than</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EMinorThan
     * @generated
     */
    public Adapter createEMinorThanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EMinorThanEquals <em>EMinor Than Equals</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EMinorThanEquals
     * @generated
     */
    public Adapter createEMinorThanEqualsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ENotEqualsTo <em>ENot Equals To</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ENotEqualsTo
     * @generated
     */
    public Adapter createENotEqualsToAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ESelectItem <em>ESelect Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ESelectItem
     * @generated
     */
    public Adapter createESelectItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EAllColumns <em>EAll Columns</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EAllColumns
     * @generated
     */
    public Adapter createEAllColumnsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ESelectExpressionItem <em>ESelect Expression Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ESelectExpressionItem
     * @generated
     */
    public Adapter createESelectExpressionItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EFromItem <em>EFrom Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EFromItem
     * @generated
     */
    public Adapter createEFromItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ETable <em>ETable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ETable
     * @generated
     */
    public Adapter createETableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ESubSelect <em>ESub Select</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ESubSelect
     * @generated
     */
    public Adapter createESubSelectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ENotExpression <em>ENot Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ENotExpression
     * @generated
     */
    public Adapter createENotExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ELongValue <em>ELong Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ELongValue
     * @generated
     */
    public Adapter createELongValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ENullValue <em>ENull Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ENullValue
     * @generated
     */
    public Adapter createENullValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EIsNullExpression <em>EIs Null Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EIsNullExpression
     * @generated
     */
    public Adapter createEIsNullExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EFunction <em>EFunction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EFunction
     * @generated
     */
    public Adapter createEFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EColumn <em>EColumn</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EColumn
     * @generated
     */
    public Adapter createEColumnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.ECaseExpression <em>ECase Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.ECaseExpression
     * @generated
     */
    public Adapter createECaseExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EWhenClause <em>EWhen Clause</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EWhenClause
     * @generated
     */
    public Adapter createEWhenClauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EStringValue <em>EString Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EStringValue
     * @generated
     */
    public Adapter createEStringValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.vgu.se.sql.EExpressionList <em>EExpression List</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.vgu.se.sql.EExpressionList
     * @generated
     */
    public Adapter createEExpressionListAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SqlAdapterFactory
