/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELong Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ELongValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getELongValue()
 * @model
 * @generated
 */
public interface ELongValue extends EExpression {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Long)
     * @see org.vgu.se.sql.SqlPackage#getELongValue_Value()
     * @model
     * @generated
     */
    Long getValue();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ELongValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Long value);

} // ELongValue
