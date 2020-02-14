/**
 */
package org.vgu.se.sql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EColumn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EColumn#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.vgu.se.sql.EColumn#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEColumn()
 * @model
 * @generated
 */
public interface EColumn extends EExpression {
    /**
     * Returns the value of the '<em><b>Column Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column Name</em>' attribute.
     * @see #setColumnName(String)
     * @see org.vgu.se.sql.SqlPackage#getEColumn_ColumnName()
     * @model
     * @generated
     */
    String getColumnName();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EColumn#getColumnName <em>Column Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Column Name</em>' attribute.
     * @see #getColumnName()
     * @generated
     */
    void setColumnName(String value);

    /**
     * Returns the value of the '<em><b>Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' containment reference.
     * @see #setTable(ETable)
     * @see org.vgu.se.sql.SqlPackage#getEColumn_Table()
     * @model containment="true"
     * @generated
     */
    ETable getTable();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EColumn#getTable <em>Table</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table</em>' containment reference.
     * @see #getTable()
     * @generated
     */
    void setTable(ETable value);

} // EColumn
