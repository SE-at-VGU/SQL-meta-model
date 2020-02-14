/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPlain Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getSelectItems <em>Select Items</em>}</li>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getFromItem <em>From Item</em>}</li>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getJoins <em>Joins</em>}</li>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getWhere <em>Where</em>}</li>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.vgu.se.sql.EPlainSelect#getHaving <em>Having</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEPlainSelect()
 * @model
 * @generated
 */
public interface EPlainSelect extends ESelectBody {
    /**
     * Returns the value of the '<em><b>Distinct</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distinct</em>' containment reference.
     * @see #setDistinct(EDistinct)
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_Distinct()
     * @model containment="true"
     * @generated
     */
    EDistinct getDistinct();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EPlainSelect#getDistinct <em>Distinct</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Distinct</em>' containment reference.
     * @see #getDistinct()
     * @generated
     */
    void setDistinct(EDistinct value);

    /**
     * Returns the value of the '<em><b>Select Items</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.sql.ESelectItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select Items</em>' containment reference list.
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_SelectItems()
     * @model containment="true"
     * @generated
     */
    EList<ESelectItem> getSelectItems();

    /**
     * Returns the value of the '<em><b>From Item</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From Item</em>' containment reference.
     * @see #setFromItem(EFromItem)
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_FromItem()
     * @model containment="true"
     * @generated
     */
    EFromItem getFromItem();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EPlainSelect#getFromItem <em>From Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From Item</em>' containment reference.
     * @see #getFromItem()
     * @generated
     */
    void setFromItem(EFromItem value);

    /**
     * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.sql.EJoin}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Joins</em>' containment reference list.
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_Joins()
     * @model containment="true"
     * @generated
     */
    EList<EJoin> getJoins();

    /**
     * Returns the value of the '<em><b>Where</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Where</em>' containment reference.
     * @see #setWhere(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_Where()
     * @model containment="true"
     * @generated
     */
    EExpression getWhere();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EPlainSelect#getWhere <em>Where</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Where</em>' containment reference.
     * @see #getWhere()
     * @generated
     */
    void setWhere(EExpression value);

    /**
     * Returns the value of the '<em><b>Group By</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group By</em>' containment reference.
     * @see #setGroupBy(EGroupByElement)
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_GroupBy()
     * @model containment="true"
     * @generated
     */
    EGroupByElement getGroupBy();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EPlainSelect#getGroupBy <em>Group By</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group By</em>' containment reference.
     * @see #getGroupBy()
     * @generated
     */
    void setGroupBy(EGroupByElement value);

    /**
     * Returns the value of the '<em><b>Having</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Having</em>' containment reference.
     * @see #setHaving(EExpression)
     * @see org.vgu.se.sql.SqlPackage#getEPlainSelect_Having()
     * @model containment="true"
     * @generated
     */
    EExpression getHaving();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EPlainSelect#getHaving <em>Having</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Having</em>' containment reference.
     * @see #getHaving()
     * @generated
     */
    void setHaving(EExpression value);

} // EPlainSelect
