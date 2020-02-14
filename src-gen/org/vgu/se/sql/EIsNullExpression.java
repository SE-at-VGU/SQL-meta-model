/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIs Null Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EIsNullExpression#isNot <em>Not</em>}</li>
 *   <li>{@link org.vgu.se.sql.EIsNullExpression#getLeftExpression <em>Left Expression</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEIsNullExpression()
 * @model
 * @generated
 */
public interface EIsNullExpression extends EExpression {
    /**
     * Returns the value of the '<em><b>Not</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not</em>' attribute.
     * @see #setNot(boolean)
     * @see org.vgu.se.sql.SqlPackage#getEIsNullExpression_Not()
     * @model
     * @generated
     */
    boolean isNot();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EIsNullExpression#isNot <em>Not</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not</em>' attribute.
     * @see #isNot()
     * @generated
     */
    void setNot(boolean value);

    /**
     * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left Expression</em>' containment reference.
     * @see #setLeftExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEIsNullExpression_LeftExpression()
     * @model containment="true" required="true"
     * @generated
     */
    EExpression getLeftExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EIsNullExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left Expression</em>' containment reference.
     * @see #getLeftExpression()
     * @generated
     */
    void setLeftExpression(EExpression value);

} // EIsNullExpression
