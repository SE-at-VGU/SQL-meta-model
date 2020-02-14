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
import org.vgu.se.sql.ESelectBody;
import org.vgu.se.sql.ESubSelect;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESub Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.ESubSelectImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.ESubSelectImpl#getSelectBody <em>Select Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESubSelectImpl extends MinimalEObjectImpl.Container
    implements ESubSelect {
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
     * The cached value of the '{@link #getSelectBody() <em>Select Body</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectBody()
     * @generated
     * @ordered
     */
    protected ESelectBody selectBody;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ESubSelectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.ESUB_SELECT;
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
                Notification.SET, SqlPackage.ESUB_SELECT__ALIAS, oldAlias,
                newAlias);
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
                    EOPPOSITE_FEATURE_BASE - SqlPackage.ESUB_SELECT__ALIAS,
                    null, msgs);
            if (newAlias != null)
                msgs = ((InternalEObject) newAlias).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.ESUB_SELECT__ALIAS,
                    null, msgs);
            msgs = basicSetAlias(newAlias, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESUB_SELECT__ALIAS, newAlias, newAlias));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESelectBody getSelectBody() {
        return selectBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelectBody(ESelectBody newSelectBody,
        NotificationChain msgs) {
        ESelectBody oldSelectBody = selectBody;
        selectBody = newSelectBody;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.ESUB_SELECT__SELECT_BODY,
                oldSelectBody, newSelectBody);
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
    public void setSelectBody(ESelectBody newSelectBody) {
        if (newSelectBody != selectBody) {
            NotificationChain msgs = null;
            if (selectBody != null)
                msgs = ((InternalEObject) selectBody).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ESUB_SELECT__SELECT_BODY,
                    null, msgs);
            if (newSelectBody != null)
                msgs = ((InternalEObject) newSelectBody).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.ESUB_SELECT__SELECT_BODY,
                    null, msgs);
            msgs = basicSetSelectBody(newSelectBody, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESUB_SELECT__SELECT_BODY, newSelectBody,
                newSelectBody));
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
        case SqlPackage.ESUB_SELECT__ALIAS:
            return basicSetAlias(null, msgs);
        case SqlPackage.ESUB_SELECT__SELECT_BODY:
            return basicSetSelectBody(null, msgs);
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
        case SqlPackage.ESUB_SELECT__ALIAS:
            return getAlias();
        case SqlPackage.ESUB_SELECT__SELECT_BODY:
            return getSelectBody();
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
        case SqlPackage.ESUB_SELECT__ALIAS:
            setAlias((EAlias) newValue);
            return;
        case SqlPackage.ESUB_SELECT__SELECT_BODY:
            setSelectBody((ESelectBody) newValue);
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
        case SqlPackage.ESUB_SELECT__ALIAS:
            setAlias((EAlias) null);
            return;
        case SqlPackage.ESUB_SELECT__SELECT_BODY:
            setSelectBody((ESelectBody) null);
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
        case SqlPackage.ESUB_SELECT__ALIAS:
            return alias != null;
        case SqlPackage.ESUB_SELECT__SELECT_BODY:
            return selectBody != null;
        }
        return super.eIsSet(featureID);
    }

} //ESubSelectImpl
