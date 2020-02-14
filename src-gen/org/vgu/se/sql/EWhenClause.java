/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EWhen Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EWhenClause#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.EWhenClause#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEWhenClause()
 * @model
 * @generated
 */
public interface EWhenClause extends EExpression {
    /**
     * Returns the value of the '<em><b>When Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>When Expression</em>' containment reference.
     * @see #setWhenExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEWhenClause_WhenExpression()
     * @model containment="true" required="true"
     * @generated
     */
    EExpression getWhenExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EWhenClause#getWhenExpression <em>When Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>When Expression</em>' containment reference.
     * @see #getWhenExpression()
     * @generated
     */
    void setWhenExpression(EExpression value);

    /**
     * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Then Expression</em>' containment reference.
     * @see #setThenExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEWhenClause_ThenExpression()
     * @model containment="true" required="true"
     * @generated
     */
    EExpression getThenExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EWhenClause#getThenExpression <em>Then Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Then Expression</em>' containment reference.
     * @see #getThenExpression()
     * @generated
     */
    void setThenExpression(EExpression value);

} // EWhenClause
