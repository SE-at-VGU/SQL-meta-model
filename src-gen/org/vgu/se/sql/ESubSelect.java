/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESub Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ESubSelect#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.vgu.se.sql.ESubSelect#getSelectBody <em>Select Body</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getESubSelect()
 * @model
 * @generated
 */
public interface ESubSelect extends EFromItem {
    /**
     * Returns the value of the '<em><b>Alias</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' reference.
     * @see #setAlias(EAlias)
     * @see org.vgu.se.sql.SqlPackage#getESubSelect_Alias()
     * @model
     * @generated
     */
    EAlias getAlias();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ESubSelect#getAlias <em>Alias</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' reference.
     * @see #getAlias()
     * @generated
     */
    void setAlias(EAlias value);

    /**
     * Returns the value of the '<em><b>Select Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select Body</em>' reference.
     * @see #setSelectBody(ESelectBody)
     * @see org.vgu.se.sql.SqlPackage#getESubSelect_SelectBody()
     * @model required="true"
     * @generated
     */
    ESelectBody getSelectBody();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ESubSelect#getSelectBody <em>Select Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Select Body</em>' reference.
     * @see #getSelectBody()
     * @generated
     */
    void setSelectBody(ESelectBody value);

} // ESubSelect
