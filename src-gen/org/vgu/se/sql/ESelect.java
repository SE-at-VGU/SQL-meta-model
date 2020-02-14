/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESelect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ESelect#getSelectBody <em>Select Body</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getESelect()
 * @model
 * @generated
 */
public interface ESelect extends EStatement {
    /**
     * Returns the value of the '<em><b>Select Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select Body</em>' containment reference.
     * @see #setSelectBody(ESelectBody)
     * @see org.vgu.se.sql.SqlPackage#getESelect_SelectBody()
     * @model containment="true" required="true"
     * @generated
     */
    ESelectBody getSelectBody();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ESelect#getSelectBody <em>Select Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select Body</em>' containment reference.
     * @see #getSelectBody()
     * @generated
     */
    void setSelectBody(ESelectBody value);

} // ESelect
