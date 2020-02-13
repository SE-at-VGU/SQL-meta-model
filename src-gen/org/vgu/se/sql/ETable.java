/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.ETable#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.vgu.se.sql.ETable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getETable()
 * @model
 * @generated
 */
public interface ETable extends EFromItem {
    /**
     * Returns the value of the '<em><b>Alias</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' reference.
     * @see #setAlias(EAlias)
     * @see org.vgu.se.sql.SqlPackage#getETable_Alias()
     * @model
     * @generated
     */
    EAlias getAlias();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ETable#getAlias <em>Alias</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' reference.
     * @see #getAlias()
     * @generated
     */
    void setAlias(EAlias value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.vgu.se.sql.SqlPackage#getETable_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.ETable#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ETable
