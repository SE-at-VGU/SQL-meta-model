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
import org.vgu.se.sql.EFromItem;
import org.vgu.se.sql.EJoin;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EJoin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isOuter <em>Outer</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isRight <em>Right</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isLeft <em>Left</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isNatural <em>Natural</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isFull <em>Full</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isInner <em>Inner</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isSimple <em>Simple</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isCross <em>Cross</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isSemi <em>Semi</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isStraight <em>Straight</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#isApply <em>Apply</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#getRightItem <em>Right Item</em>}</li>
 *   <li>{@link org.vgu.se.sql.impl.EJoinImpl#getOnExpression <em>On Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJoinImpl extends MinimalEObjectImpl.Container implements EJoin {
    /**
     * The default value of the '{@link #isOuter() <em>Outer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOuter()
     * @generated
     * @ordered
     */
    protected static final boolean OUTER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOuter() <em>Outer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOuter()
     * @generated
     * @ordered
     */
    protected boolean outer = OUTER_EDEFAULT;

    /**
     * The default value of the '{@link #isRight() <em>Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRight()
     * @generated
     * @ordered
     */
    protected static final boolean RIGHT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRight() <em>Right</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRight()
     * @generated
     * @ordered
     */
    protected boolean right = RIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #isLeft() <em>Left</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLeft()
     * @generated
     * @ordered
     */
    protected static final boolean LEFT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLeft() <em>Left</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLeft()
     * @generated
     * @ordered
     */
    protected boolean left = LEFT_EDEFAULT;

    /**
     * The default value of the '{@link #isNatural() <em>Natural</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNatural()
     * @generated
     * @ordered
     */
    protected static final boolean NATURAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNatural() <em>Natural</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNatural()
     * @generated
     * @ordered
     */
    protected boolean natural = NATURAL_EDEFAULT;

    /**
     * The default value of the '{@link #isFull() <em>Full</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFull()
     * @generated
     * @ordered
     */
    protected static final boolean FULL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFull() <em>Full</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFull()
     * @generated
     * @ordered
     */
    protected boolean full = FULL_EDEFAULT;

    /**
     * The default value of the '{@link #isInner() <em>Inner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInner()
     * @generated
     * @ordered
     */
    protected static final boolean INNER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInner() <em>Inner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInner()
     * @generated
     * @ordered
     */
    protected boolean inner = INNER_EDEFAULT;

    /**
     * The default value of the '{@link #isSimple() <em>Simple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSimple()
     * @generated
     * @ordered
     */
    protected static final boolean SIMPLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSimple() <em>Simple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSimple()
     * @generated
     * @ordered
     */
    protected boolean simple = SIMPLE_EDEFAULT;

    /**
     * The default value of the '{@link #isCross() <em>Cross</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCross()
     * @generated
     * @ordered
     */
    protected static final boolean CROSS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCross() <em>Cross</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCross()
     * @generated
     * @ordered
     */
    protected boolean cross = CROSS_EDEFAULT;

    /**
     * The default value of the '{@link #isSemi() <em>Semi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemi()
     * @generated
     * @ordered
     */
    protected static final boolean SEMI_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSemi() <em>Semi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemi()
     * @generated
     * @ordered
     */
    protected boolean semi = SEMI_EDEFAULT;

    /**
     * The default value of the '{@link #isStraight() <em>Straight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStraight()
     * @generated
     * @ordered
     */
    protected static final boolean STRAIGHT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStraight() <em>Straight</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStraight()
     * @generated
     * @ordered
     */
    protected boolean straight = STRAIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #isApply() <em>Apply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isApply()
     * @generated
     * @ordered
     */
    protected static final boolean APPLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isApply() <em>Apply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isApply()
     * @generated
     * @ordered
     */
    protected boolean apply = APPLY_EDEFAULT;

    /**
     * The cached value of the '{@link #getRightItem() <em>Right Item</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRightItem()
     * @generated
     * @ordered
     */
    protected EFromItem rightItem;

    /**
     * The cached value of the '{@link #getOnExpression() <em>On Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnExpression()
     * @generated
     * @ordered
     */
    protected EExpression onExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EJoinImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SqlPackage.Literals.EJOIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isOuter() {
        return outer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOuter(boolean newOuter) {
        boolean oldOuter = outer;
        outer = newOuter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__OUTER, oldOuter, outer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isRight() {
        return right;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRight(boolean newRight) {
        boolean oldRight = right;
        right = newRight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__RIGHT, oldRight, right));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isLeft() {
        return left;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLeft(boolean newLeft) {
        boolean oldLeft = left;
        left = newLeft;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__LEFT, oldLeft, left));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isNatural() {
        return natural;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNatural(boolean newNatural) {
        boolean oldNatural = natural;
        natural = newNatural;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__NATURAL, oldNatural, natural));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFull() {
        return full;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFull(boolean newFull) {
        boolean oldFull = full;
        full = newFull;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__FULL, oldFull, full));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isInner() {
        return inner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInner(boolean newInner) {
        boolean oldInner = inner;
        inner = newInner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__INNER, oldInner, inner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSimple() {
        return simple;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSimple(boolean newSimple) {
        boolean oldSimple = simple;
        simple = newSimple;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__SIMPLE, oldSimple, simple));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isCross() {
        return cross;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCross(boolean newCross) {
        boolean oldCross = cross;
        cross = newCross;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__CROSS, oldCross, cross));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSemi() {
        return semi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSemi(boolean newSemi) {
        boolean oldSemi = semi;
        semi = newSemi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__SEMI, oldSemi, semi));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isStraight() {
        return straight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStraight(boolean newStraight) {
        boolean oldStraight = straight;
        straight = newStraight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__STRAIGHT, oldStraight, straight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isApply() {
        return apply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApply(boolean newApply) {
        boolean oldApply = apply;
        apply = newApply;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__APPLY, oldApply, apply));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EFromItem getRightItem() {
        return rightItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRightItem(EFromItem newRightItem,
        NotificationChain msgs) {
        EFromItem oldRightItem = rightItem;
        rightItem = newRightItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EJOIN__RIGHT_ITEM, oldRightItem,
                newRightItem);
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
    public void setRightItem(EFromItem newRightItem) {
        if (newRightItem != rightItem) {
            NotificationChain msgs = null;
            if (rightItem != null)
                msgs = ((InternalEObject) rightItem).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EJOIN__RIGHT_ITEM, null,
                    msgs);
            if (newRightItem != null)
                msgs = ((InternalEObject) newRightItem).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EJOIN__RIGHT_ITEM, null,
                    msgs);
            msgs = basicSetRightItem(newRightItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__RIGHT_ITEM, newRightItem, newRightItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpression getOnExpression() {
        return onExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOnExpression(EExpression newOnExpression,
        NotificationChain msgs) {
        EExpression oldOnExpression = onExpression;
        onExpression = newOnExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                Notification.SET, SqlPackage.EJOIN__ON_EXPRESSION,
                oldOnExpression, newOnExpression);
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
    public void setOnExpression(EExpression newOnExpression) {
        if (newOnExpression != onExpression) {
            NotificationChain msgs = null;
            if (onExpression != null)
                msgs = ((InternalEObject) onExpression).eInverseRemove(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EJOIN__ON_EXPRESSION,
                    null, msgs);
            if (newOnExpression != null)
                msgs = ((InternalEObject) newOnExpression).eInverseAdd(this,
                    EOPPOSITE_FEATURE_BASE - SqlPackage.EJOIN__ON_EXPRESSION,
                    null, msgs);
            msgs = basicSetOnExpression(newOnExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                SqlPackage.EJOIN__ON_EXPRESSION, newOnExpression,
                newOnExpression));
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
        case SqlPackage.EJOIN__RIGHT_ITEM:
            return basicSetRightItem(null, msgs);
        case SqlPackage.EJOIN__ON_EXPRESSION:
            return basicSetOnExpression(null, msgs);
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
        case SqlPackage.EJOIN__OUTER:
            return isOuter();
        case SqlPackage.EJOIN__RIGHT:
            return isRight();
        case SqlPackage.EJOIN__LEFT:
            return isLeft();
        case SqlPackage.EJOIN__NATURAL:
            return isNatural();
        case SqlPackage.EJOIN__FULL:
            return isFull();
        case SqlPackage.EJOIN__INNER:
            return isInner();
        case SqlPackage.EJOIN__SIMPLE:
            return isSimple();
        case SqlPackage.EJOIN__CROSS:
            return isCross();
        case SqlPackage.EJOIN__SEMI:
            return isSemi();
        case SqlPackage.EJOIN__STRAIGHT:
            return isStraight();
        case SqlPackage.EJOIN__APPLY:
            return isApply();
        case SqlPackage.EJOIN__RIGHT_ITEM:
            return getRightItem();
        case SqlPackage.EJOIN__ON_EXPRESSION:
            return getOnExpression();
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
        case SqlPackage.EJOIN__OUTER:
            setOuter((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__RIGHT:
            setRight((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__LEFT:
            setLeft((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__NATURAL:
            setNatural((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__FULL:
            setFull((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__INNER:
            setInner((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__SIMPLE:
            setSimple((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__CROSS:
            setCross((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__SEMI:
            setSemi((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__STRAIGHT:
            setStraight((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__APPLY:
            setApply((Boolean) newValue);
            return;
        case SqlPackage.EJOIN__RIGHT_ITEM:
            setRightItem((EFromItem) newValue);
            return;
        case SqlPackage.EJOIN__ON_EXPRESSION:
            setOnExpression((EExpression) newValue);
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
        case SqlPackage.EJOIN__OUTER:
            setOuter(OUTER_EDEFAULT);
            return;
        case SqlPackage.EJOIN__RIGHT:
            setRight(RIGHT_EDEFAULT);
            return;
        case SqlPackage.EJOIN__LEFT:
            setLeft(LEFT_EDEFAULT);
            return;
        case SqlPackage.EJOIN__NATURAL:
            setNatural(NATURAL_EDEFAULT);
            return;
        case SqlPackage.EJOIN__FULL:
            setFull(FULL_EDEFAULT);
            return;
        case SqlPackage.EJOIN__INNER:
            setInner(INNER_EDEFAULT);
            return;
        case SqlPackage.EJOIN__SIMPLE:
            setSimple(SIMPLE_EDEFAULT);
            return;
        case SqlPackage.EJOIN__CROSS:
            setCross(CROSS_EDEFAULT);
            return;
        case SqlPackage.EJOIN__SEMI:
            setSemi(SEMI_EDEFAULT);
            return;
        case SqlPackage.EJOIN__STRAIGHT:
            setStraight(STRAIGHT_EDEFAULT);
            return;
        case SqlPackage.EJOIN__APPLY:
            setApply(APPLY_EDEFAULT);
            return;
        case SqlPackage.EJOIN__RIGHT_ITEM:
            setRightItem((EFromItem) null);
            return;
        case SqlPackage.EJOIN__ON_EXPRESSION:
            setOnExpression((EExpression) null);
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
        case SqlPackage.EJOIN__OUTER:
            return outer != OUTER_EDEFAULT;
        case SqlPackage.EJOIN__RIGHT:
            return right != RIGHT_EDEFAULT;
        case SqlPackage.EJOIN__LEFT:
            return left != LEFT_EDEFAULT;
        case SqlPackage.EJOIN__NATURAL:
            return natural != NATURAL_EDEFAULT;
        case SqlPackage.EJOIN__FULL:
            return full != FULL_EDEFAULT;
        case SqlPackage.EJOIN__INNER:
            return inner != INNER_EDEFAULT;
        case SqlPackage.EJOIN__SIMPLE:
            return simple != SIMPLE_EDEFAULT;
        case SqlPackage.EJOIN__CROSS:
            return cross != CROSS_EDEFAULT;
        case SqlPackage.EJOIN__SEMI:
            return semi != SEMI_EDEFAULT;
        case SqlPackage.EJOIN__STRAIGHT:
            return straight != STRAIGHT_EDEFAULT;
        case SqlPackage.EJOIN__APPLY:
            return apply != APPLY_EDEFAULT;
        case SqlPackage.EJOIN__RIGHT_ITEM:
            return rightItem != null;
        case SqlPackage.EJOIN__ON_EXPRESSION:
            return onExpression != null;
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
        result.append(" (outer: ");
        result.append(outer);
        result.append(", right: ");
        result.append(right);
        result.append(", left: ");
        result.append(left);
        result.append(", natural: ");
        result.append(natural);
        result.append(", full: ");
        result.append(full);
        result.append(", inner: ");
        result.append(inner);
        result.append(", simple: ");
        result.append(simple);
        result.append(", cross: ");
        result.append(cross);
        result.append(", semi: ");
        result.append(semi);
        result.append(", straight: ");
        result.append(straight);
        result.append(", apply: ");
        result.append(apply);
        result.append(')');
        return result.toString();
    }

} //EJoinImpl
