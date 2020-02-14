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
     * The cached value of the '{@link #getDistinct() <em>Distinct</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistinct()
     * @generated
     * @ordered
     */
    protected EDistinct distinct;

    /**
     * The cached value of the '{@link #getSelectItems() <em>Select Items</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectItems()
     * @generated
     * @ordered
     */
    protected EList<ESelectItem> selectItems;

    /**
     * The cached value of the '{@link #getFromItem() <em>From Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromItem()
     * @generated
     * @ordered
     */
    protected EFromItem fromItem;

    /**
     * The cached value of the '{@link #getJoins() <em>Joins</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoins()
     * @generated
     * @ordered
     */
    protected EList<EJoin> joins;

    /**
     * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWhere()
     * @generated
     * @ordered
     */
    protected EExpression where;

    /**
     * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupBy()
     * @generated
     * @ordered
     */
    protected EGroupByElement groupBy;

    /**
     * The cached value of the '{@link #getHaving() <em>Having</em>}' containment reference.
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
        return distinct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDistinct(EDistinct newDistinct,
        NotificationChain msgs) {
        EDistinct oldDistinct = distinct;
        distinct = newDistinct;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EPLAIN_SELECT__DISTINCT,
                oldDistinct, newDistinct);
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
    public void setDistinct(EDistinct newDistinct) {
        if (newDistinct != distinct) {
            NotificationChain msgs = null;
            if (distinct != null)
                msgs = ((InternalEObject) distinct).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__DISTINCT,
                    null, msgs);
            if (newDistinct != null)
                msgs = ((InternalEObject) newDistinct).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__DISTINCT,
                    null, msgs);
            msgs = basicSetDistinct(newDistinct, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__DISTINCT, newDistinct, newDistinct));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ESelectItem> getSelectItems() {
        if (selectItems == null) {
            selectItems = new EObjectContainmentEList<ESelectItem>(
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
        return fromItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFromItem(EFromItem newFromItem,
        NotificationChain msgs) {
        EFromItem oldFromItem = fromItem;
        fromItem = newFromItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EPLAIN_SELECT__FROM_ITEM,
                oldFromItem, newFromItem);
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
    public void setFromItem(EFromItem newFromItem) {
        if (newFromItem != fromItem) {
            NotificationChain msgs = null;
            if (fromItem != null)
                msgs = ((InternalEObject) fromItem).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EPLAIN_SELECT__FROM_ITEM,
                    null, msgs);
            if (newFromItem != null)
                msgs = ((InternalEObject) newFromItem).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE
                        - SqlPackage.EPLAIN_SELECT__FROM_ITEM,
                    null, msgs);
            msgs = basicSetFromItem(newFromItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__FROM_ITEM, newFromItem, newFromItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EJoin> getJoins() {
        if (joins == null) {
            joins = new EObjectContainmentEList<EJoin>(EJoin.class, this,
                SqlPackage.EPLAIN_SELECT__JOINS);
        }
        return joins;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getWhere() {
        return where;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWhere(EExpression newWhere,
        NotificationChain msgs) {
        EExpression oldWhere = where;
        where = newWhere;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EPLAIN_SELECT__WHERE, oldWhere,
                newWhere);
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
    public void setWhere(EExpression newWhere) {
        if (newWhere != where) {
            NotificationChain msgs = null;
            if (where != null)
                msgs = ((InternalEObject) where).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__WHERE,
                    null, msgs);
            if (newWhere != null)
                msgs = ((InternalEObject) newWhere).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__WHERE,
                    null, msgs);
            msgs = basicSetWhere(newWhere, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__WHERE, newWhere, newWhere));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EGroupByElement getGroupBy() {
        return groupBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroupBy(EGroupByElement newGroupBy,
        NotificationChain msgs) {
        EGroupByElement oldGroupBy = groupBy;
        groupBy = newGroupBy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EPLAIN_SELECT__GROUP_BY,
                oldGroupBy, newGroupBy);
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
    public void setGroupBy(EGroupByElement newGroupBy) {
        if (newGroupBy != groupBy) {
            NotificationChain msgs = null;
            if (groupBy != null)
                msgs = ((InternalEObject) groupBy).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__GROUP_BY,
                    null, msgs);
            if (newGroupBy != null)
                msgs = ((InternalEObject) newGroupBy).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__GROUP_BY,
                    null, msgs);
            msgs = basicSetGroupBy(newGroupBy, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__GROUP_BY, newGroupBy, newGroupBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getHaving() {
        return having;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHaving(EExpression newHaving,
        NotificationChain msgs) {
        EExpression oldHaving = having;
        having = newHaving;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EPLAIN_SELECT__HAVING, oldHaving,
                newHaving);
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
    public void setHaving(EExpression newHaving) {
        if (newHaving != having) {
            NotificationChain msgs = null;
            if (having != null)
                msgs = ((InternalEObject) having).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__HAVING,
                    null, msgs);
            if (newHaving != null)
                msgs = ((InternalEObject) newHaving).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EPLAIN_SELECT__HAVING,
                    null, msgs);
            msgs = basicSetHaving(newHaving, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EPLAIN_SELECT__HAVING, newHaving, newHaving));
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
        case SqlPackage.EPLAIN_SELECT__DISTINCT:
            return basicSetDistinct(null, msgs);
        case SqlPackage.EPLAIN_SELECT__SELECT_ITEMS:
            return ((InternalEList<?>) getSelectItems()).basicRemove(otherEnd,
                msgs);
        case SqlPackage.EPLAIN_SELECT__FROM_ITEM:
            return basicSetFromItem(null, msgs);
        case SqlPackage.EPLAIN_SELECT__JOINS:
            return ((InternalEList<?>) getJoins()).basicRemove(otherEnd, msgs);
        case SqlPackage.EPLAIN_SELECT__WHERE:
            return basicSetWhere(null, msgs);
        case SqlPackage.EPLAIN_SELECT__GROUP_BY:
            return basicSetGroupBy(null, msgs);
        case SqlPackage.EPLAIN_SELECT__HAVING:
            return basicSetHaving(null, msgs);
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
        case SqlPackage.EPLAIN_SELECT__DISTINCT:
            return getDistinct();
        case SqlPackage.EPLAIN_SELECT__SELECT_ITEMS:
            return getSelectItems();
        case SqlPackage.EPLAIN_SELECT__FROM_ITEM:
            return getFromItem();
        case SqlPackage.EPLAIN_SELECT__JOINS:
            return getJoins();
        case SqlPackage.EPLAIN_SELECT__WHERE:
            return getWhere();
        case SqlPackage.EPLAIN_SELECT__GROUP_BY:
            return getGroupBy();
        case SqlPackage.EPLAIN_SELECT__HAVING:
            return getHaving();
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
            getJoins().clear();
            getJoins().addAll((Collection<? extends EJoin>) newValue);
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
            getJoins().clear();
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
            return joins != null && !joins.isEmpty();
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
