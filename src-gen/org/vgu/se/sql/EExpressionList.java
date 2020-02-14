/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EExpression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EExpressionList#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEExpressionList()
 * @model
 * @generated
 */
public interface EExpressionList extends EObject {
    /**
     * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.sql.EExpression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expressions</em>' containment reference list.
     * @see org.vgu.se.sql.SqlPackage#getEExpressionList_Expressions()
     * @model containment="true"
     * @generated
     */
    EList<EExpression> getExpressions();

} // EExpressionList
