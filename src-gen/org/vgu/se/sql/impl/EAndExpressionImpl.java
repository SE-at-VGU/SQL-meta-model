/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.vgu.se.sql.EAndExpression;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnd Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EAndExpressionImpl extends EBinaryExpressionImpl
    implements EAndExpression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EAndExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EAND_EXPRESSION;
    }

} //EAndExpressionImpl
