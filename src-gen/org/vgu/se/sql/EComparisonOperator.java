/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComparison Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EComparisonOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEComparisonOperator()
 * @model abstract="true"
 * @generated
 */
public interface EComparisonOperator extends EBinaryExpression {
    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see #setOperator(String)
     * @see org.vgu.se.sql.SqlPackage#getEComparisonOperator_Operator()
     * @model
     * @generated
     */
    String getOperator();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EComparisonOperator#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see #getOperator()
     * @generated
     */
    void setOperator(String value);

} // EComparisonOperator
