/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

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
     * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected EAlias alias;

    /**
     * The cached value of the '{@link #getSelectBody() <em>Select Body</em>}' reference.
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
        if (alias != null && alias.eIsProxy()) {
            InternalEObject oldAlias = (InternalEObject) alias;
            alias = (EAlias) eResolveProxy(oldAlias);
            if (alias != oldAlias) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.ESUB_SELECT__ALIAS, oldAlias, alias));
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
                SqlPackage.ESUB_SELECT__ALIAS, oldAlias, alias));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESelectBody getSelectBody() {
        if (selectBody != null && selectBody.eIsProxy()) {
            InternalEObject oldSelectBody = (InternalEObject) selectBody;
            selectBody = (ESelectBody) eResolveProxy(oldSelectBody);
            if (selectBody != oldSelectBody) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.ESUB_SELECT__SELECT_BODY, oldSelectBody,
                        selectBody));
            }
        }
        return selectBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ESelectBody basicGetSelectBody() {
        return selectBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSelectBody(ESelectBody newSelectBody) {
        ESelectBody oldSelectBody = selectBody;
        selectBody = newSelectBody;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ESUB_SELECT__SELECT_BODY, oldSelectBody,
                selectBody));
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
            if (resolve)
                return getAlias();
            return basicGetAlias();
        case SqlPackage.ESUB_SELECT__SELECT_BODY:
            if (resolve)
                return getSelectBody();
            return basicGetSelectBody();
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
