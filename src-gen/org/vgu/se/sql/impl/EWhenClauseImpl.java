/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.EWhenClause;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EWhen Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EWhenClauseImpl#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EWhenClauseImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EWhenClauseImpl extends MinimalEObjectImpl.Container
    implements EWhenClause {
    /**
     * The cached value of the '{@link #getWhenExpression() <em>When Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhenExpression()
     * @generated
     * @ordered
     */
    protected EExpression whenExpression;

    /**
     * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThenExpression()
     * @generated
     * @ordered
     */
    protected EExpression thenExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EWhenClauseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EWHEN_CLAUSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getWhenExpression() {
        return whenExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWhenExpression(
        EExpression newWhenExpression, NotificationChain msgs) {
        EExpression oldWhenExpression = whenExpression;
        whenExpression = newWhenExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION,
                oldWhenExpression, newWhenExpression);
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
    public void setWhenExpression(EExpression newWhenExpression) {
        if (newWhenExpression != whenExpression) {
            NotificationChain msgs = null;
            if (whenExpression != null)
                msgs = ((InternalEObject) whenExpression)
                    .eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                            - SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION,
                        null, msgs);
            if (newWhenExpression != null)
                msgs = ((InternalEObject) newWhenExpression)
                    .eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                            - SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION,
                        null, msgs);
            msgs = basicSetWhenExpression(newWhenExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION, newWhenExpression,
                newWhenExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getThenExpression() {
        return thenExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThenExpression(
        EExpression newThenExpression, NotificationChain msgs) {
        EExpression oldThenExpression = thenExpression;
        thenExpression = newThenExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION,
                oldThenExpression, newThenExpression);
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
    public void setThenExpression(EExpression newThenExpression) {
        if (newThenExpression != thenExpression) {
            NotificationChain msgs = null;
            if (thenExpression != null)
                msgs = ((InternalEObject) thenExpression)
                    .eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                            - SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION,
                        null, msgs);
            if (newThenExpression != null)
                msgs = ((InternalEObject) newThenExpression)
                    .eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                            - SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION,
                        null, msgs);
            msgs = basicSetThenExpression(newThenExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION, newThenExpression,
                newThenExpression));
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
        case SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION:
            return basicSetWhenExpression(null, msgs);
        case SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION:
            return basicSetThenExpression(null, msgs);
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
        case SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION:
            return getWhenExpression();
        case SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION:
            return getThenExpression();
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
        case SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION:
            setWhenExpression((EExpression) newValue);
            return;
        case SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION:
            setThenExpression((EExpression) newValue);
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
        case SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION:
            setWhenExpression((EExpression) null);
            return;
        case SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION:
            setThenExpression((EExpression) null);
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
        case SqlPackage.EWHEN_CLAUSE__WHEN_EXPRESSION:
            return whenExpression != null;
        case SqlPackage.EWHEN_CLAUSE__THEN_EXPRESSION:
            return thenExpression != null;
        }
        return super.eIsSet(featureID);
    }

} //EWhenClauseImpl
