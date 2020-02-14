/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBinary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EBinaryExpression#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.EBinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface EBinaryExpression extends EExpression {
    /**
     * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left Expression</em>' containment reference.
     * @see #setLeftExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEBinaryExpression_LeftExpression()
     * @model containment="true" required="true"
     * @generated
     */
    EExpression getLeftExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EBinaryExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left Expression</em>' containment reference.
     * @see #getLeftExpression()
     * @generated
     */
    void setLeftExpression(EExpression value);

    /**
     * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right Expression</em>' containment reference.
     * @see #setRightExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEBinaryExpression_RightExpression()
     * @model containment="true" required="true"
     * @generated
     */
    EExpression getRightExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EBinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right Expression</em>' containment reference.
     * @see #getRightExpression()
     * @generated
     */
    void setRightExpression(EExpression value);

} // EBinaryExpression
