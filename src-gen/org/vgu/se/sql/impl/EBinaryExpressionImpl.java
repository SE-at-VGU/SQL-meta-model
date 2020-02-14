/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
     * The cached value of the '{@link #getLeftExpression() <em>Left Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeftExpression()
     * @generated
     * @ordered
     */
    protected EExpression leftExpression;

    /**
     * The cached value of the '{@link #getRightExpression() <em>Right Expression</em>}' containment reference.
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
                SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION,
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
                        - SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION,
                    null, msgs);
            if (newLeftExpression != null)
                msgs = ((InternalEObject) newLeftExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION,
                    null, msgs);
            msgs = basicSetLeftExpression(newLeftExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION,
                newLeftExpression, newLeftExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getRightExpression() {
        return rightExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRightExpression(
        EExpression newRightExpression, NotificationChain msgs) {
        EExpression oldRightExpression = rightExpression;
        rightExpression = newRightExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET,
                SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION,
                oldRightExpression, newRightExpression);
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
    public void setRightExpression(EExpression newRightExpression) {
        if (newRightExpression != rightExpression) {
            NotificationChain msgs = null;
            if (rightExpression != null)
                msgs = ((InternalEObject) rightExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION,
                    null, msgs);
            if (newRightExpression != null)
                msgs = ((InternalEObject) newRightExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION,
                    null, msgs);
            msgs = basicSetRightExpression(newRightExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION,
                newRightExpression, newRightExpression));
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
        case SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION:
            return basicSetLeftExpression(null, msgs);
        case SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION:
            return basicSetRightExpression(null, msgs);
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
        case SqlPackage.EBINARY_EXPRESSION__LEFT_EXPRESSION:
            return getLeftExpression();
        case SqlPackage.EBINARY_EXPRESSION__RIGHT_EXPRESSION:
            return getRightExpression();
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
