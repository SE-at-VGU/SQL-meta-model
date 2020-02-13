/**
 */
package org.vgu.se.sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.EGroupByElement;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EGroup By Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EGroupByElementImpl#getGroupByExpressions <em>Group By Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EGroupByElementImpl extends MinimalEObjectImpl.Container
    implements EGroupByElement {
    /**
     * The cached value of the '{@link #getGroupByExpressions() <em>Group By Expressions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupByExpressions()
     * @generated
     * @ordered
     */
    protected EList<EExpression> groupByExpressions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EGroupByElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EGROUP_BY_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EExpression> getGroupByExpressions() {
        if (groupByExpressions == null) {
            groupByExpressions = new EObjectResolvingEList<EExpression>(
                EExpression.class, this,
                SqlPackage.EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS);
        }
        return groupByExpressions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SqlPackage.EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
            return getGroupByExpressions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case SqlPackage.EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
            getGroupByExpressions().clear();
            getGroupByExpressions()
                .addAll((Collection<? extends EExpression>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case SqlPackage.EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
            getGroupByExpressions().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case SqlPackage.EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
            return groupByExpressions != null && !groupByExpressions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EGroupByElementImpl
