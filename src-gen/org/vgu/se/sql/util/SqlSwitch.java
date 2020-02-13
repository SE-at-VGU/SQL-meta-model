/**
 */
package org.vgu.se.sql.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.vgu.se.sql.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.vgu.se.sql.SqlPackage
 * @generated
 */
public class SqlSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SqlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SqlSwitch() {
        if (modelPackage == null) {
            modelPackage = SqlPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case SqlPackage.ESTATEMENT: {
            EStatement eStatement = (EStatement) theEObject;
            T result = caseEStatement(eStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ESELECT: {
            ESelect eSelect = (ESelect) theEObject;
            T result = caseESelect(eSelect);
            if (result == null)
                result = caseEStatement(eSelect);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ESELECT_BODY: {
            ESelectBody eSelectBody = (ESelectBody) theEObject;
            T result = caseESelectBody(eSelectBody);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EPLAIN_SELECT: {
            EPlainSelect ePlainSelect = (EPlainSelect) theEObject;
            T result = caseEPlainSelect(ePlainSelect);
            if (result == null)
                result = caseESelectBody(ePlainSelect);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EDISTINCT: {
            EDistinct eDistinct = (EDistinct) theEObject;
            T result = caseEDistinct(eDistinct);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EGROUP_BY_ELEMENT: {
            EGroupByElement eGroupByElement = (EGroupByElement) theEObject;
            T result = caseEGroupByElement(eGroupByElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EJOIN: {
            EJoin eJoin = (EJoin) theEObject;
            T result = caseEJoin(eJoin);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EALIAS: {
            EAlias eAlias = (EAlias) theEObject;
            T result = caseEAlias(eAlias);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EEXPRESSION: {
            EExpression eExpression = (EExpression) theEObject;
            T result = caseEExpression(eExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EBINARY_EXPRESSION: {
            EBinaryExpression eBinaryExpression = (EBinaryExpression) theEObject;
            T result = caseEBinaryExpression(eBinaryExpression);
            if (result == null)
                result = caseEExpression(eBinaryExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EAND_EXPRESSION: {
            EAndExpression eAndExpression = (EAndExpression) theEObject;
            T result = caseEAndExpression(eAndExpression);
            if (result == null)
                result = caseEBinaryExpression(eAndExpression);
            if (result == null)
                result = caseEExpression(eAndExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EOR_EXPRESSION: {
            EOrExpression eOrExpression = (EOrExpression) theEObject;
            T result = caseEOrExpression(eOrExpression);
            if (result == null)
                result = caseEBinaryExpression(eOrExpression);
            if (result == null)
                result = caseEExpression(eOrExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ECOMPARISON_OPERATOR: {
            EComparisonOperator eComparisonOperator = (EComparisonOperator) theEObject;
            T result = caseEComparisonOperator(eComparisonOperator);
            if (result == null)
                result = caseEBinaryExpression(eComparisonOperator);
            if (result == null)
                result = caseEExpression(eComparisonOperator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EEQUALS_TO: {
            EEqualsTo eEqualsTo = (EEqualsTo) theEObject;
            T result = caseEEqualsTo(eEqualsTo);
            if (result == null)
                result = caseEComparisonOperator(eEqualsTo);
            if (result == null)
                result = caseEBinaryExpression(eEqualsTo);
            if (result == null)
                result = caseEExpression(eEqualsTo);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EGREATER_THAN: {
            EGreaterThan eGreaterThan = (EGreaterThan) theEObject;
            T result = caseEGreaterThan(eGreaterThan);
            if (result == null)
                result = caseEComparisonOperator(eGreaterThan);
            if (result == null)
                result = caseEBinaryExpression(eGreaterThan);
            if (result == null)
                result = caseEExpression(eGreaterThan);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EGREATER_THAN_EQUALS: {
            EGreaterThanEquals eGreaterThanEquals = (EGreaterThanEquals) theEObject;
            T result = caseEGreaterThanEquals(eGreaterThanEquals);
            if (result == null)
                result = caseEComparisonOperator(eGreaterThanEquals);
            if (result == null)
                result = caseEBinaryExpression(eGreaterThanEquals);
            if (result == null)
                result = caseEExpression(eGreaterThanEquals);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EMINOR_THAN: {
            EMinorThan eMinorThan = (EMinorThan) theEObject;
            T result = caseEMinorThan(eMinorThan);
            if (result == null)
                result = caseEComparisonOperator(eMinorThan);
            if (result == null)
                result = caseEBinaryExpression(eMinorThan);
            if (result == null)
                result = caseEExpression(eMinorThan);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EMINOR_THAN_EQUALS: {
            EMinorThanEquals eMinorThanEquals = (EMinorThanEquals) theEObject;
            T result = caseEMinorThanEquals(eMinorThanEquals);
            if (result == null)
                result = caseEComparisonOperator(eMinorThanEquals);
            if (result == null)
                result = caseEBinaryExpression(eMinorThanEquals);
            if (result == null)
                result = caseEExpression(eMinorThanEquals);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ENOT_EQUALS_TO: {
            ENotEqualsTo eNotEqualsTo = (ENotEqualsTo) theEObject;
            T result = caseENotEqualsTo(eNotEqualsTo);
            if (result == null)
                result = caseEComparisonOperator(eNotEqualsTo);
            if (result == null)
                result = caseEBinaryExpression(eNotEqualsTo);
            if (result == null)
                result = caseEExpression(eNotEqualsTo);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ESELECT_ITEM: {
            ESelectItem eSelectItem = (ESelectItem) theEObject;
            T result = caseESelectItem(eSelectItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EALL_COLUMNS: {
            EAllColumns eAllColumns = (EAllColumns) theEObject;
            T result = caseEAllColumns(eAllColumns);
            if (result == null)
                result = caseESelectItem(eAllColumns);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ESELECT_EXPRESSION_ITEM: {
            ESelectExpressionItem eSelectExpressionItem = (ESelectExpressionItem) theEObject;
            T result = caseESelectExpressionItem(eSelectExpressionItem);
            if (result == null)
                result = caseESelectItem(eSelectExpressionItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.EFROM_ITEM: {
            EFromItem eFromItem = (EFromItem) theEObject;
            T result = caseEFromItem(eFromItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ETABLE: {
            ETable eTable = (ETable) theEObject;
            T result = caseETable(eTable);
            if (result == null)
                result = caseEFromItem(eTable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ESUB_SELECT: {
            ESubSelect eSubSelect = (ESubSelect) theEObject;
            T result = caseESubSelect(eSubSelect);
            if (result == null)
                result = caseEFromItem(eSubSelect);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SqlPackage.ENOT_EXPRESSION: {
            ENotExpression eNotExpression = (ENotExpression) theEObject;
            T result = caseENotExpression(eNotExpression);
            if (result == null)
                result = caseEExpression(eNotExpression);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EStatement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EStatement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEStatement(EStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESelect</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESelect</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESelect(ESelect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESelect Body</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESelect Body</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESelectBody(ESelectBody object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EPlain Select</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EPlain Select</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPlainSelect(EPlainSelect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EDistinct</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EDistinct</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEDistinct(EDistinct object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EGroup By Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EGroup By Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEGroupByElement(EGroupByElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EJoin</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EJoin</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEJoin(EJoin object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EAlias</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EAlias</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEAlias(EAlias object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EExpression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EExpression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEExpression(EExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EBinary Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EBinary Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEBinaryExpression(EBinaryExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EAnd Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EAnd Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEAndExpression(EAndExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EOr Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EOr Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEOrExpression(EOrExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EComparison Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EComparison Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEComparisonOperator(EComparisonOperator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EEquals To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EEquals To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEEqualsTo(EEqualsTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EGreater Than</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EGreater Than</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEGreaterThan(EGreaterThan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EGreater Than Equals</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EGreater Than Equals</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEGreaterThanEquals(EGreaterThanEquals object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EMinor Than</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EMinor Than</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEMinorThan(EMinorThan object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EMinor Than Equals</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EMinor Than Equals</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEMinorThanEquals(EMinorThanEquals object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ENot Equals To</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ENot Equals To</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseENotEqualsTo(ENotEqualsTo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESelect Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESelect Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESelectItem(ESelectItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EAll Columns</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EAll Columns</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEAllColumns(EAllColumns object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESelect Expression Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESelect Expression Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESelectExpressionItem(ESelectExpressionItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EFrom Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EFrom Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEFromItem(EFromItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ETable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ETable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseETable(ETable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ESub Select</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ESub Select</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseESubSelect(ESubSelect object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ENot Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ENot Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseENotExpression(ENotExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SqlSwitch
