/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EGroup By Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.EGroupByElement#getGroupByExpressions <em>Group By Expressions</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.sql.SqlPackage#getEGroupByElement()
 * @model
 * @generated
 */
public interface EGroupByElement extends EObject {
    /**
     * Returns the value of the '<em><b>Group By Expressions</b></em>' reference list.
     * The list contents are of type {@link org.vgu.se.sql.EExpression}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group By Expressions</em>' reference list.
     * @see org.vgu.se.sql.SqlPackage#getEGroupByElement_GroupByExpressions()
     * @model
     * @generated
     */
    EList<EExpression> getGroupByExpressions();

} // EGroupByElement
