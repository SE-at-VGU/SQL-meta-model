/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.sql.EBinaryExpression;
import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBinary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EBinaryExpressionImpl#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EBinaryExpressionImpl#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EBinaryExpressionImpl extends MinimalEObjectImpl.Container
    implements EBinaryExpression {
    /**
     * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeftExpression()
     * @generated
     * @ordered
     */
    protected EExpression leftExpression;

    /**
     * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRightExpression()
     * @generated
     * @ordered
     */
    protected EExpression rightExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EBinaryExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EBINARY_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getLeftExpression() {
        if (leftExpression != null && leftExpression.eIsProxy()) {
            InternalEObject oldLeftExpression = (InternalEObject) leftExpression;
            leftExpression = (EExpression) eResolveProxy(oldLeftExpression);
            if (leftExpression != oldLeftExpression) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION,
                        oldLeftExpression, leftExpression));
            }
        }
        return leftExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EExpression basicGetLeftExpression() {
        return leftExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLeftExpression(EExpression newLeftExpression) {
        EExpression oldLeftExpression = leftExpression;
        leftExpression = newLeftExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION,
                oldLeftExpression, leftExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getRightExpression() {
        if (rightExpression != null && rightExpression.eIsProxy()) {
            InternalEObject oldRightExpression = (InternalEObject) rightExpression;
            rightExpression = (EExpression) eResolveProxy(oldRightExpression);
            if (rightExpression != oldRightExpression) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION,
                        oldRightExpression, rightExpression));
            }
        }
        return rightExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EExpression basicGetRightExpression() {
        return rightExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRightExpression(EExpression newRightExpression) {
        EExpression oldRightExpression = rightExpression;
        rightExpression = newRightExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION,
                oldRightExpression, rightExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION:
            if (resolve)
                return getLeftExpression();
            return basicGetLeftExpression();
        case SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION:
            if (resolve)
                return getRightExpression();
            return basicGetRightExpression();
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
        case SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION:
            setLeftExpression((EExpression) newValue);
            return;
        case SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION:
            setRightExpression((EExpression) newValue);
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
        case SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION:
            setLeftExpression((EExpression) null);
            return;
        case SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION:
            setRightExpression((EExpression) null);
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
        case SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION:
            return leftExpression != null;
        case SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION:
            return rightExpression != null;
        }
        return super.eIsSet(featureID);
    }

} //EBinaryExpressionImpl
