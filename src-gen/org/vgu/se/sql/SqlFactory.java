/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.sql.SqlPackage
 * @generated
 */
public interface SqlFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SqlFactory eINSTANCE = org.vgu.se.sql.impl.SqlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>ESelect</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ESelect</em>'.
     * @generated
     */
    ESelect createESelect();

    /**
     * Returns a new object of class '<em>EPlain Select</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EPlain Select</em>'.
     * @generated
     */
    EPlainSelect createEPlainSelect();

    /**
     * Returns a new object of class '<em>EDistinct</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EDistinct</em>'.
     * @generated
     */
    EDistinct createEDistinct();

    /**
     * Returns a new object of class '<em>EGroup By Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EGroup By Element</em>'.
     * @generated
     */
    EGroupByElement createEGroupByElement();

    /**
     * Returns a new object of class '<em>EJoin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EJoin</em>'.
     * @generated
     */
    EJoin createEJoin();

    /**
     * Returns a new object of class '<em>EAlias</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAlias</em>'.
     * @generated
     */
    EAlias createEAlias();

    /**
     * Returns a new object of class '<em>EAnd Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAnd Expression</em>'.
     * @generated
     */
    EAndExpression createEAndExpression();

    /**
     * Returns a new object of class '<em>EOr Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EOr Expression</em>'.
     * @generated
     */
    EOrExpression createEOrExpression();

    /**
     * Returns a new object of class '<em>EEquals To</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EEquals To</em>'.
     * @generated
     */
    EEqualsTo createEEqualsTo();

    /**
     * Returns a new object of class '<em>EGreater Than</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EGreater Than</em>'.
     * @generated
     */
    EGreaterThan createEGreaterThan();

    /**
     * Returns a new object of class '<em>EGreater Than Equals</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EGreater Than Equals</em>'.
     * @generated
     */
    EGreaterThanEquals createEGreaterThanEquals();

    /**
     * Returns a new object of class '<em>EMinor Than</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EMinor Than</em>'.
     * @generated
     */
    EMinorThan createEMinorThan();

    /**
     * Returns a new object of class '<em>EMinor Than Equals</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EMinor Than Equals</em>'.
     * @generated
     */
    EMinorThanEquals createEMinorThanEquals();

    /**
     * Returns a new object of class '<em>ENot Equals To</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ENot Equals To</em>'.
     * @generated
     */
    ENotEqualsTo createENotEqualsTo();

    /**
     * Returns a new object of class '<em>EAll Columns</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAll Columns</em>'.
     * @generated
     */
    EAllColumns createEAllColumns();

    /**
     * Returns a new object of class '<em>ESelect Expression Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ESelect Expression Item</em>'.
     * @generated
     */
    ESelectExpressionItem createESelectExpressionItem();

    /**
     * Returns a new object of class '<em>ETable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ETable</em>'.
     * @generated
     */
    ETable createETable();

    /**
     * Returns a new object of class '<em>ESub Select</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ESub Select</em>'.
     * @generated
     */
    ESubSelect createESubSelect();

    /**
     * Returns a new object of class '<em>ENot Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ENot Expression</em>'.
     * @generated
     */
    ENotExpression createENotExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SqlPackage getSqlPackage();

} //SqlFactory
