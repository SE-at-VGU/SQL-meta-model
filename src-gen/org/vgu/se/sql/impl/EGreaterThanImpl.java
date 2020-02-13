/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.vgu.se.sql.EGreaterThan;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EGreater Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EGreaterThanImpl extends EComparisonOperatorImpl
    implements EGreaterThan {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EGreaterThanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EGREATER_THAN;
    }

} //EGreaterThanImpl
