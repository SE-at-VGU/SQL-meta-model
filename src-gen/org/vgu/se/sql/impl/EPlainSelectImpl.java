/**
 */
package org.vgu.se.sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.vgu.se.sql.EDistinct;
import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.EFromItem;
import org.vgu.se.sql.EGroupByElement;
import org.vgu.se.sql.EJoin;
import org.vgu.se.sql.EPlainSelect;
import org.vgu.se.sql.ESelectItem;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPlain Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getSelectItems <em>Select Items</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getFromItem <em>From Item</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EPlainSelectImpl#getHaving <em>Having</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPlainSelectImpl extends MinimalEObjectImpl.Container
    implements EPlainSelect {
    /**
     * The cached value of the '{@link #getDistinct() <em>Distinct</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistinct()
     * @generated
     * @ordered
     */
    protected EDistinct distinct;

    /**
     * The cached value of the '{@link #getSelectItems() <em>Select Items</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectItems()
     * @generated
     * @ordered
     */
    protected EList<ESelectItem> selectItems;

    /**
     * The cached value of the '{@link #getFromItem() <em>From Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromItem()
     * @generated
     * @ordered
     */
    protected EFromItem fromItem;

    /**
     * The cached value of the '{@link #getJoins() <em>Joins</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoins()
     * @generated
     * @ordered
     */
    protected EJoin joins;

    /**
     * The cached value of the '{@link #getWhere() <em>Where</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhere()
     * @generated
     * @ordered
     */
    protected EExpression where;

    /**
     * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupBy()
     * @generated
     * @ordered
     */
    protected EGroupByElement groupBy;

    /**
     * The cached value of the '{@link #getHaving() <em>Having</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHaving()
     * @generated
     * @ordered
     */
    protected EExpression having;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EPlainSelectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EPLAIN_SELECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDistinct getDistinct() {
        if (distinct != null && distinct.eIsProxy()) {
            InternalEObject oldDistinct = (InternalEObject) distinct;
            distinct = (EDistinct) eResolveProxy(oldDistinct);
            if (distinct != oldDistinct) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EPLAIN_SELECT__DISTINCT, oldDistinct,
                        distinct));
            }
        }
        return distinct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDistinct basicGetDistinct() {
        return distinct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistinct(EDistinct newDistinct) {
        EDistinct oldDistinct = distinct;
        distinct = newDistinct;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__DISTINCT, oldDistinct, distinct));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ESelectItem> getSelectItems() {
        if (selectItems == null) {
            selectItems = new EObjectResolvingEList<ESelectItem>(
                ESelectItem.class, this,
                SqlPackage.EPLAIN_SELECT__SELECT_ITEMS);
        }
        return selectItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EFromItem getFromItem() {
        if (fromItem != null && fromItem.eIsProxy()) {
            InternalEObject oldFromItem = (InternalEObject) fromItem;
            fromItem = (EFromItem) eResolveProxy(oldFromItem);
            if (fromItem != oldFromItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EPLAIN_SELECT__FROM_ITEM, oldFromItem,
                        fromItem));
            }
        }
        return fromItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EFromItem basicGetFromItem() {
        return fromItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromItem(EFromItem newFromItem) {
        EFromItem oldFromItem = fromItem;
        fromItem = newFromItem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__FROM_ITEM, oldFromItem, fromItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EJoin getJoins() {
        if (joins != null && joins.eIsProxy()) {
            InternalEObject oldJoins = (InternalEObject) joins;
            joins = (EJoin) eResolveProxy(oldJoins);
            if (joins != oldJoins) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EPLAIN_SELECT__JOINS, oldJoins, joins));
            }
        }
        return joins;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EJoin basicGetJoins() {
        return joins;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setJoins(EJoin newJoins) {
        EJoin oldJoins = joins;
        joins = newJoins;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__JOINS, oldJoins, joins));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getWhere() {
        if (where != null && where.eIsProxy()) {
            InternalEObject oldWhere = (InternalEObject) where;
            where = (EExpression) eResolveProxy(oldWhere);
            if (where != oldWhere) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EPLAIN_SELECT__WHERE, oldWhere, where));
            }
        }
        return where;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EExpression basicGetWhere() {
        return where;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWhere(EExpression newWhere) {
        EExpression oldWhere = where;
        where = newWhere;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__WHERE, oldWhere, where));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EGroupByElement getGroupBy() {
        if (groupBy != null && groupBy.eIsProxy()) {
            InternalEObject oldGroupBy = (InternalEObject) groupBy;
            groupBy = (EGroupByElement) eResolveProxy(oldGroupBy);
            if (groupBy != oldGroupBy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EPLAIN_SELECT__GROUP_BY, oldGroupBy,
                        groupBy));
            }
        }
        return groupBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EGroupByElement basicGetGroupBy() {
        return groupBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGroupBy(EGroupByElement newGroupBy) {
        EGroupByElement oldGroupBy = groupBy;
        groupBy = newGroupBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__GROUP_BY, oldGroupBy, groupBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getHaving() {
        if (having != null && having.eIsProxy()) {
            InternalEObject oldHaving = (InternalEObject) having;
            having = (EExpression) eResolveProxy(oldHaving);
            if (having != oldHaving) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                        SqlPackage.EPLAIN_SELECT__HAVING, oldHaving, having));
            }
        }
        return having;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EExpression basicGetHaving() {
        return having;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHaving(EExpression newHaving) {
        EExpression oldHaving = having;
        having = newHaving;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__HAVING, oldHaving, having));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SqlPackage.EPLAIN_SELECT__DISTINCT:
            if (resolve)
                return getDistinct();
            return basicGetDistinct();
        case SqlPackage.EPLAIN_SELECT__SELECT_ITEMS:
            return getSelectItems();
        case SqlPackage.EPLAIN_SELECT__FROM_ITEM:
            if (resolve)
                return getFromItem();
            return basicGetFromItem();
        case SqlPackage.EPLAIN_SELECT__JOINS:
            if (resolve)
                return getJoins();
            return basicGetJoins();
        case SqlPackage.EPLAIN_SELECT__WHERE:
            if (resolve)
                return getWhere();
            return basicGetWhere();
        case SqlPackage.EPLAIN_SELECT__GROUP_BY:
            if (resolve)
                return getGroupBy();
            return basicGetGroupBy();
        case SqlPackage.EPLAIN_SELECT__HAVING:
            if (resolve)
                return getHaving();
            return basicGetHaving();
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
        case SqlPackage.EPLAIN_SELECT__DISTINCT:
            setDistinct((EDistinct) newValue);
            return;
        case SqlPackage.EPLAIN_SELECT__SELECT_ITEMS:
            getSelectItems().clear();
            getSelectItems()
                .addAll((Collection<? extends ESelectItem>) newValue);
            return;
        case SqlPackage.EPLAIN_SELECT__FROM_ITEM:
            setFromItem((EFromItem) newValue);
            return;
        case SqlPackage.EPLAIN_SELECT__JOINS:
            setJoins((EJoin) newValue);
            return;
        case SqlPackage.EPLAIN_SELECT__WHERE:
            setWhere((EExpression) newValue);
            return;
        case SqlPackage.EPLAIN_SELECT__GROUP_BY:
            setGroupBy((EGroupByElement) newValue);
            return;
        case SqlPackage.EPLAIN_SELECT__HAVING:
            setHaving((EExpression) newValue);
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
        case SqlPackage.EPLAIN_SELECT__DISTINCT:
            setDistinct((EDistinct) null);
            return;
        case SqlPackage.EPLAIN_SELECT__SELECT_ITEMS:
            getSelectItems().clear();
            return;
        case SqlPackage.EPLAIN_SELECT__FROM_ITEM:
            setFromItem((EFromItem) null);
            return;
        case SqlPackage.EPLAIN_SELECT__JOINS:
            setJoins((EJoin) null);
            return;
        case SqlPackage.EPLAIN_SELECT__WHERE:
            setWhere((EExpression) null);
            return;
        case SqlPackage.EPLAIN_SELECT__GROUP_BY:
            setGroupBy((EGroupByElement) null);
            return;
        case SqlPackage.EPLAIN_SELECT__HAVING:
            setHaving((EExpression) null);
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
        case SqlPackage.EPLAIN_SELECT__DISTINCT:
            return distinct != null;
        case SqlPackage.EPLAIN_SELECT__SELECT_ITEMS:
            return selectItems != null && !selectItems.isEmpty();
        case SqlPackage.EPLAIN_SELECT__FROM_ITEM:
            return fromItem != null;
        case SqlPackage.EPLAIN_SELECT__JOINS:
            return joins != null;
        case SqlPackage.EPLAIN_SELECT__WHERE:
            return where != null;
        case SqlPackage.EPLAIN_SELECT__GROUP_BY:
            return groupBy != null;
        case SqlPackage.EPLAIN_SELECT__HAVING:
            return having != null;
        }
        return super.eIsSet(featureID);
    }

} //EPlainSelectImpl
