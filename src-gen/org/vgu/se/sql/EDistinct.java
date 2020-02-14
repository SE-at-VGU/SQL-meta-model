/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDistinct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EDistinct#isUseUnique <em>Use Unique</em>}</li>
 *   <li>{@link org.vgu.se.sql.EDistinct#getOnSelectItems <em>On Select Items</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEDistinct()
 * @model
 * @generated
 */
public interface EDistinct extends EObject {
    /**
     * Returns the value of the '<em><b>Use Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Unique</em>' attribute.
     * @see #setUseUnique(boolean)
     * @see org.vgu.se.sql.SqlPackage#getEDistinct_UseUnique()
     * @model
     * @generated
     */
    boolean isUseUnique();

    /**
     * Sets the value of the '{@link org.vgu.se.sql.EDistinct#isUseUnique <em>Use Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Unique</em>' attribute.
     * @see #isUseUnique()
     * @generated
     */
    void setUseUnique(boolean value);

    /**
     * Returns the value of the '<em><b>On Select Items</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.sql.ESelectItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>On Select Items</em>' containment reference list.
     * @see org.vgu.se.sql.SqlPackage#getEDistinct_OnSelectItems()
     * @model containment="true"
     * @generated
     */
    EList<ESelectItem> getOnSelectItems();

} // EDistinct
