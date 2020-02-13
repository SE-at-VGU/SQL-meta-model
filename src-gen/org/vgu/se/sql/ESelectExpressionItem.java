/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESelect Expression Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ESelectExpressionItem#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.vgu.se.sql.ESelectExpressionItem#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getESelectExpressionItem()
 * @model
 * @generated
 */
public interface ESelectExpressionItem extends ESelectItem {
    /**
     * Returns the value of the '<em><b>Alias</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' reference.
     * @see #setAlias(EAlias)
     * @see org.vgu.se.sql.SqlPackage#getESelectExpressionItem_Alias()
     * @model
     * @generated
     */
    EAlias getAlias();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ESelectExpressionItem#getAlias <em>Alias</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' reference.
     * @see #getAlias()
     * @generated
     */
    void setAlias(EAlias value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' reference.
     * @see #setExpression(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getESelectExpressionItem_Expression()
     * @model required="true"
     * @generated
     */
    EExpression getExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ESelectExpressionItem#getExpression <em>Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(EExpression value);

} // ESelectExpressionItem
