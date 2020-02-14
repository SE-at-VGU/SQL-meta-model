/**
 */
package org.vgu.se.sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.vgu.se.sql.ECaseExpression;
import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.EWhenClause;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECase Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.ECaseExpressionImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.ECaseExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.ECaseExpressionImpl#getWhenClauses <em>When Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECaseExpressionImpl extends MinimalEObjectImpl.Container
    implements ECaseExpression {
    /**
     * The cached value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchExpression()
     * @generated
     * @ordered
     */
    protected EExpression switchExpression;

    /**
     * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElseExpression()
     * @generated
     * @ordered
     */
    protected EExpression elseExpression;

    /**
     * The cached value of the '{@link #getWhenClauses() <em>When Clauses</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhenClauses()
     * @generated
     * @ordered
     */
    protected EList<EWhenClause> whenClauses;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ECaseExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.ECASE_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getSwitchExpression() {
        return switchExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchExpression(
        EExpression newSwitchExpression, NotificationChain msgs) {
        EExpression oldSwitchExpression = switchExpression;
        switchExpression = newSwitchExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET,
                SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION,
                oldSwitchExpression, newSwitchExpression);
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
    public void setSwitchExpression(EExpression newSwitchExpression) {
        if (newSwitchExpression != switchExpression) {
            NotificationChain msgs = null;
            if (switchExpression != null)
                msgs = ((InternalEObject) switchExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION,
                    null, msgs);
            if (newSwitchExpression != null)
                msgs = ((InternalEObject) newSwitchExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION,
                    null, msgs);
            msgs = basicSetSwitchExpression(newSwitchExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION,
                newSwitchExpression, newSwitchExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getElseExpression() {
        return elseExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElseExpression(
        EExpression newElseExpression, NotificationChain msgs) {
        EExpression oldElseExpression = elseExpression;
        elseExpression = newElseExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION,
                oldElseExpression, newElseExpression);
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
    public void setElseExpression(EExpression newElseExpression) {
        if (newElseExpression != elseExpression) {
            NotificationChain msgs = null;
            if (elseExpression != null)
                msgs = ((InternalEObject) elseExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION,
                    null, msgs);
            if (newElseExpression != null)
                msgs = ((InternalEObject) newElseExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION,
                    null, msgs);
            msgs = basicSetElseExpression(newElseExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION, newElseExpression,
                newElseExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EWhenClause> getWhenClauses() {
        if (whenClauses == null) {
            whenClauses = new EObjectContainmentEList<EWhenClause>(
                EWhenClause.class, this,
                SqlPackage.ECASE_EXPRESSION__WHEN_CLAUSES);
        }
        return whenClauses;
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
        case SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION:
            return basicSetSwitchExpression(null, msgs);
        case SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION:
            return basicSetElseExpression(null, msgs);
        case SqlPackage.ECASE_EXPRESSION__WHEN_CLAUSES:
            return ((InternalEList<?>) getWhenClauses()).basicRemove(otherEnd,
                msgs);
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
        case SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION:
            return getSwitchExpression();
        case SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION:
            return getElseExpression();
        case SqlPackage.ECASE_EXPRESSION__WHEN_CLAUSES:
            return getWhenClauses();
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
        case SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION:
            setSwitchExpression((EExpression) newValue);
            return;
        case SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION:
            setElseExpression((EExpression) newValue);
            return;
        case SqlPackage.ECASE_EXPRESSION__WHEN_CLAUSES:
            getWhenClauses().clear();
            getWhenClauses()
                .addAll((Collection<? extends EWhenClause>) newValue);
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
        case SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION:
            setSwitchExpression((EExpression) null);
            return;
        case SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION:
            setElseExpression((EExpression) null);
            return;
        case SqlPackage.ECASE_EXPRESSION__WHEN_CLAUSES:
            getWhenClauses().clear();
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
        case SqlPackage.ECASE_EXPRESSION__SWITCH_EXPRESSION:
            return switchExpression != null;
        case SqlPackage.ECASE_EXPRESSION__ELSE_EXPRESSION:
            return elseExpression != null;
        case SqlPackage.ECASE_EXPRESSION__WHEN_CLAUSES:
            return whenClauses != null && !whenClauses.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ECaseExpressionImpl
