/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.sql.EFunction#isAllColumns <em>All Columns</em>}</li>
 *   <li>{@link org.vgu.se.sql.EFunction#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.vgu.se.sql.EFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEFunction()
 * @model
 * @generated
 */
public interface EFunction extends EExpression {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.vgu.se.sql.SqlPackage#getEFunction_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EFunction#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>All Columns</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>All Columns</em>' attribute.
     * @see #setAllColumns(boolean)
     * @see org.vgu.se.sql.SqlPackage#getEFunction_AllColumns()
     * @model
     * @generated
     */
    boolean isAllColumns();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EFunction#isAllColumns <em>All Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>All Columns</em>' attribute.
     * @see #isAllColumns()
     * @generated
     */
    void setAllColumns(boolean value);

    /**
     * Returns the value of the '<em><b>Distinct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct</em>' attribute.
     * @see #setDistinct(boolean)
     * @see org.vgu.se.sql.SqlPackage#getEFunction_Distinct()
     * @model
     * @generated
     */
    boolean isDistinct();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EFunction#isDistinct <em>Distinct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct</em>' attribute.
     * @see #isDistinct()
     * @generated
     */
    void setDistinct(boolean value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference.
     * @see #setParameters(EExpressionList)
     * @see org.vgu.se.sql.SqlPackage#getEFunction_Parameters()
     * @model containment="true"
     * @generated
     */
    EExpressionList getParameters();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EFunction#getParameters <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameters</em>' containment reference.
     * @see #getParameters()
     * @generated
     */
    void setParameters(EExpressionList value);

} // EFunction
