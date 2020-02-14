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
import org.vgu.se.sql.EIsNullExpression;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIs Null Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EIsNullExpressionImpl#isNot <em>Not</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EIsNullExpressionImpl#getLeftExpression <em>Left Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIsNullExpressionImpl extends MinimalEObjectImpl.Container
    implements EIsNullExpression {
    /**
     * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNot()
     * @generated
     * @ordered
     */
    protected static final boolean NOT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNot()
     * @generated
     * @ordered
     */
    protected boolean not = NOT_EDEFAULT;

    /**
     * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeftExpression()
     * @generated
     * @ordered
     */
    protected EExpression leftExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EIsNullExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EIS_NULL_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isNot() {
        return not;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNot(boolean newNot) {
        boolean oldNot = not;
        not = newNot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EIS_NULL_EXPRESSION__NOT, oldNot, not));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getLeftExpression() {
        return leftExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLeftExpression(
        EExpression newLeftExpression, NotificationChain msgs) {
        EExpression oldLeftExpression = leftExpression;
        leftExpression = newLeftExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET,
                SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION,
                oldLeftExpression, newLeftExpression);
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
    public void setLeftExpression(EExpression newLeftExpression) {
        if (newLeftExpression != leftExpression) {
            NotificationChain msgs = null;
            if (leftExpression != null)
                msgs = ((InternalEObject) leftExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION,
                    null, msgs);
            if (newLeftExpression != null)
                msgs = ((InternalEObject) newLeftExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION,
                    null, msgs);
            msgs = basicSetLeftExpression(newLeftExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION,
                newLeftExpression, newLeftExpression));
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
        case SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION:
            return basicSetLeftExpression(null, msgs);
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
        case SqlPackage.EIS_NULL_EXPRESSION__NOT:
            return isNot();
        case SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION:
            return getLeftExpression();
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
        case SqlPackage.EIS_NULL_EXPRESSION__NOT:
            setNot((Boolean) newValue);
            return;
        case SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION:
            setLeftExpression((EExpression) newValue);
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
        case SqlPackage.EIS_NULL_EXPRESSION__NOT:
            setNot(NOT_EDEFAULT);
            return;
        case SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION:
            setLeftExpression((EExpression) null);
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
        case SqlPackage.EIS_NULL_EXPRESSION__NOT:
            return not != NOT_EDEFAULT;
        case SqlPackage.EIS_NULL_EXPRESSION__LEFT_EXPRESSION:
            return leftExpression != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (not: ");
        result.append(not);
        result.append(')');
        return result.toString();
    }

} //EIsNullExpressionImpl
