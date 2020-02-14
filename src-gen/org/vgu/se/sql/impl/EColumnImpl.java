/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.vgu.se.sql.EColumn;
import org.vgu.se.sql.ETable;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EColumn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EColumnImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EColumnImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EColumnImpl extends MinimalEObjectImpl.Container
    implements EColumn {
    /**
     * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnName()
     * @generated
     * @ordered
     */
    protected static final String COLUMN_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnName()
     * @generated
     * @ordered
     */
    protected String columnName = COLUMN_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTable()
     * @generated
     * @ordered
     */
    protected ETable table;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EColumnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.ECOLUMN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getColumnName() {
        return columnName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColumnName(String newColumnName) {
        String oldColumnName = columnName;
        columnName = newColumnName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ECOLUMN__COLUMN_NAME, oldColumnName, columnName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ETable getTable() {
        return table;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTable(ETable newTable,
        NotificationChain msgs) {
        ETable oldTable = table;
        table = newTable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.ECOLUMN__TABLE, oldTable,
                newTable);
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
    public void setTable(ETable newTable) {
        if (newTable != table) {
            NotificationChain msgs = null;
            if (table != null)
                msgs = ((InternalEObject) table).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.ECOLUMN__TABLE, null,
                    msgs);
            if (newTable != null)
                msgs = ((InternalEObject) newTable).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.ECOLUMN__TABLE, null,
                    msgs);
            msgs = basicSetTable(newTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.ECOLUMN__TABLE, newTable, newTable));
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
        case SqlPackage.ECOLUMN__TABLE:
            return basicSetTable(null, msgs);
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
        case SqlPackage.ECOLUMN__COLUMN_NAME:
            return getColumnName();
        case SqlPackage.ECOLUMN__TABLE:
            return getTable();
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
        case SqlPackage.ECOLUMN__COLUMN_NAME:
            setColumnName((String) newValue);
            return;
        case SqlPackage.ECOLUMN__TABLE:
            setTable((ETable) newValue);
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
        case SqlPackage.ECOLUMN__COLUMN_NAME:
            setColumnName(COLUMN_NAME_EDEFAULT);
            return;
        case SqlPackage.ECOLUMN__TABLE:
            setTable((ETable) null);
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
        case SqlPackage.ECOLUMN__COLUMN_NAME:
            return COLUMN_NAME_EDEFAULT == null ? columnName != null
                : !COLUMN_NAME_EDEFAULT.equals(columnName);
        case SqlPackage.ECOLUMN__TABLE:
            return table != null;
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
        result.append(" (columnName: ");
        result.append(columnName);
        result.append(')');
        return result.toString();
    }

} //EColumnImpl
