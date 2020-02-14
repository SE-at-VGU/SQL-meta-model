/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.sql.EExpressionList;
import org.vgu.se.sql.EFunction;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EFunctionImpl#isAllColumns <em>All Columns</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EFunctionImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EFunctionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFunctionImpl extends MinimalEObjectImpl.Container
    implements EFunction {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isAllColumns() <em>All Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllColumns()
     * @generated
     * @ordered
     */
    protected static final boolean ALL_COLUMNS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAllColumns() <em>All Columns</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAllColumns()
     * @generated
     * @ordered
     */
    protected boolean allColumns = ALL_COLUMNS_EDEFAULT;

    /**
     * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDistinct()
     * @generated
     * @ordered
     */
    protected static final boolean DISTINCT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDistinct()
     * @generated
     * @ordered
     */
    protected boolean distinct = DISTINCT_EDEFAULT;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EExpressionList parameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EFUNCTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EFUNCTION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isAllColumns() {
        return allColumns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAllColumns(boolean newAllColumns) {
        boolean oldAllColumns = allColumns;
        allColumns = newAllColumns;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EFUNCTION__ALL_COLUMNS, oldAllColumns, allColumns));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistinct(boolean newDistinct) {
        boolean oldDistinct = distinct;
        distinct = newDistinct;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EFUNCTION__DISTINCT, oldDistinct, distinct));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpressionList getParameters() {
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(EExpressionList newParameters,
        NotificationChain msgs) {
        EExpressionList oldParameters = parameters;
        parameters = newParameters;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EFUNCTION__PARAMETERS,
                oldParameters, newParameters);
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
    public void setParameters(EExpressionList newParameters) {
        if (newParameters != parameters) {
            NotificationChain msgs = null;
            if (parameters != null)
                msgs = ((InternalEObject) parameters).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EFUNCTION__PARAMETERS,
                    null, msgs);
            if (newParameters != null)
                msgs = ((InternalEObject) newParameters).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EFUNCTION__PARAMETERS,
                    null, msgs);
            msgs = basicSetParameters(newParameters, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EFUNCTION__PARAMETERS, newParameters,
                newParameters));
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
        case SqlPackage.EFUNCTION__PARAMETERS:
            return basicSetParameters(null, msgs);
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
        case SqlPackage.EFUNCTION__NAME:
            return getName();
        case SqlPackage.EFUNCTION__ALL_COLUMNS:
            return isAllColumns();
        case SqlPackage.EFUNCTION__DISTINCT:
            return isDistinct();
        case SqlPackage.EFUNCTION__PARAMETERS:
            return getParameters();
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
        case SqlPackage.EFUNCTION__NAME:
            setName((String) newValue);
            return;
        case SqlPackage.EFUNCTION__ALL_COLUMNS:
            setAllColumns((Boolean) newValue);
            return;
        case SqlPackage.EFUNCTION__DISTINCT:
            setDistinct((Boolean) newValue);
            return;
        case SqlPackage.EFUNCTION__PARAMETERS:
            setParameters((EExpressionList) newValue);
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
        case SqlPackage.EFUNCTION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SqlPackage.EFUNCTION__ALL_COLUMNS:
            setAllColumns(ALL_COLUMNS_EDEFAULT);
            return;
        case SqlPackage.EFUNCTION__DISTINCT:
            setDistinct(DISTINCT_EDEFAULT);
            return;
        case SqlPackage.EFUNCTION__PARAMETERS:
            setParameters((EExpressionList) null);
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
        case SqlPackage.EFUNCTION__NAME:
            return NAME_EDEFAULT == null ? name != null
                : !NAME_EDEFAULT.equals(name);
        case SqlPackage.EFUNCTION__ALL_COLUMNS:
            return allColumns != ALL_COLUMNS_EDEFAULT;
        case SqlPackage.EFUNCTION__DISTINCT:
            return distinct != DISTINCT_EDEFAULT;
        case SqlPackage.EFUNCTION__PARAMETERS:
            return parameters != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", allColumns: ");
        result.append(allColumns);
        result.append(", distinct: ");
        result.append(distinct);
        result.append(')');
        return result.toString();
    }

} //EFunctionImpl
