/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.sql.EAlias;
import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.ESelectExpressionItem;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESelect Expression Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.ESelectExpressionItemImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.ESelectExpressionItemImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESelectExpressionItemImpl extends MinimalEObjectImpl.Container
    implements ESelectExpressionItem {
    /**
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected EAlias alias;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected EExpression expression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ESelectExpressionItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.ESELECT_EXPRESSION_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAlias getAlias() {
        if (alias != null && alias.eIsProxy()) {
            InternalEObject oldAlias = (InternalEObject) alias;
            alias = (EAlias) eResolveProxy(oldAlias);
            if (alias != oldAlias) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS, oldAlias,
                        alias));
            }
        }
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAlias basicGetAlias() {
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlias(EAlias newAlias) {
        EAlias oldAlias = alias;
        alias = newAlias;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS, oldAlias, alias));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getExpression() {
        if (expression != null && expression.eIsProxy()) {
            InternalEObject oldExpression = (InternalEObject) expression;
            expression = (EExpression) eResolveProxy(oldExpression);
            if (expression != oldExpression) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION,
                        oldExpression, expression));
            }
        }
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EExpression basicGetExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpression(EExpression newExpression) {
        EExpression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION, oldExpression,
                expression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS:
            if (resolve)
                return getAlias();
            return basicGetAlias();
        case SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION:
            if (resolve)
                return getExpression();
            return basicGetExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS:
            setAlias((EAlias) newValue);
            return;
        case SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION:
            setExpression((EExpression) newValue);
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
        case SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS:
            setAlias((EAlias) null);
            return;
        case SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION:
            setExpression((EExpression) null);
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
        case SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS:
            return alias != null;
        case SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION:
            return expression != null;
        }
        return super.eIsSet(featureID);
    }

} //ESelectExpressionItemImpl
