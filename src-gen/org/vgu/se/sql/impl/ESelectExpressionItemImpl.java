/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected EAlias alias;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
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
        return alias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAlias(EAlias newAlias,
        NotificationChain msgs) {
        EAlias oldAlias = alias;
        alias = newAlias;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS,
                oldAlias, newAlias);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlias(EAlias newAlias) {
        if (newAlias != alias) {
            NotificationChain msgs = null;
            if (alias != null)
                msgs = ((InternalEObject) alias).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS,
                    null, msgs);
            if (newAlias != null)
                msgs = ((InternalEObject) newAlias).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS,
                    null, msgs);
            msgs = basicSetAlias(newAlias, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS, newAlias, newAlias));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(EExpression newExpression,
        NotificationChain msgs) {
        EExpression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET,
                SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION, oldExpression,
                newExpression);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpression(EExpression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject) expression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION,
                    null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject) newExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION,
                    null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION, newExpression,
                newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SqlPackage.ESELECT_EXPRESSION_ITEM__ALIAS:
            return basicSetAlias(null, msgs);
        case SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION:
            return basicSetExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            return getAlias();
        case SqlPackage.ESELECT_EXPRESSION_ITEM__EXPRESSION:
            return getExpression();
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
