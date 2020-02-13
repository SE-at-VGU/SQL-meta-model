/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.vgu.se.sql.EOrExpression;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOr Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EOrExpressionImpl extends EBinaryExpressionImpl
    implements EOrExpression {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EOrExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EOR_EXPRESSION;
    }

} //EOrExpressionImpl
