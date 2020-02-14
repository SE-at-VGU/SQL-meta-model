/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECase Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ECaseExpression#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.ECaseExpression#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.ECaseExpression#getWhenClauses <em>When Clauses</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getECaseExpression()
 * @model
 * @generated
 */
public interface ECaseExpression extends EExpression {
    /**
     * Returns the value of the '<em><b>Switch Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch Expression</em>' containment reference.
     * @see #setSwitchExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getECaseExpression_SwitchExpression()
     * @model containment="true"
     * @generated
     */
    EExpression getSwitchExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ECaseExpression#getSwitchExpression <em>Switch Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch Expression</em>' containment reference.
     * @see #getSwitchExpression()
     * @generated
     */
    void setSwitchExpression(EExpression value);

    /**
     * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Else Expression</em>' containment reference.
     * @see #setElseExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getECaseExpression_ElseExpression()
     * @model containment="true"
     * @generated
     */
    EExpression getElseExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ECaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Else Expression</em>' containment reference.
     * @see #getElseExpression()
     * @generated
     */
    void setElseExpression(EExpression value);

    /**
     * Returns the value of the '<em><b>When Clauses</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.sql.EWhenClause}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>When Clauses</em>' containment reference list.
     * @see org.vgu.se.sql.SqlPackage#getECaseExpression_WhenClauses()
     * @model containment="true"
     * @generated
     */
    EList<EWhenClause> getWhenClauses();

} // ECaseExpression
