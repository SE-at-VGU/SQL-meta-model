/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENot Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ENotExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getENotExpression()
 * @model
 * @generated
 */
public interface ENotExpression extends EExpression {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' reference.
     * @see #setExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getENotExpression_Expression()
     * @model required="true"
     * @generated
     */
    EExpression getExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ENotExpression#getExpression <em>Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(EExpression value);

} // ENotExpression
