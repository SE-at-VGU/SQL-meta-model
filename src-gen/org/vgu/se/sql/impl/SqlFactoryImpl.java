/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.vgu.se.sql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlFactoryImpl extends EFactoryImpl implements SqlFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SqlFactory init() {
        try {
            SqlFactory theSqlFactory = (SqlFactory) EPackage.Registry.INSTANCE
                .getEFactory(SqlPackage.eNS_URI);
            if (theSqlFactory != null) {
                return theSqlFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SqlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SqlFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SqlPackage.ESELECT:
            return createESelect();
        case SqlPackage.EPLAIN_SELECT:
            return createEPlainSelect();
        case SqlPackage.EDISTINCT:
            return createEDistinct();
        case SqlPackage.EGROUP_BY_ELEMENT:
            return createEGroupByElement();
        case SqlPackage.EJOIN:
            return createEJoin();
        case SqlPackage.EALIAS:
            return createEAlias();
        case SqlPackage.EAND_EXPRESSION:
            return createEAndExpression();
        case SqlPackage.EOR_EXPRESSION:
            return createEOrExpression();
        case SqlPackage.EEQUALS_TO:
            return createEEqualsTo();
        case SqlPackage.EGREATER_THAN:
            return createEGreaterThan();
        case SqlPackage.EGREATER_THAN_EQUALS:
            return createEGreaterThanEquals();
        case SqlPackage.EMINOR_THAN:
            return createEMinorThan();
        case SqlPackage.EMINOR_THAN_EQUALS:
            return createEMinorThanEquals();
        case SqlPackage.ENOT_EQUALS_TO:
            return createENotEqualsTo();
        case SqlPackage.EALL_COLUMNS:
            return createEAllColumns();
        case SqlPackage.ESELECT_EXPRESSION_ITEM:
            return createESelectExpressionItem();
        case SqlPackage.ETABLE:
            return createETable();
        case SqlPackage.ESUB_SELECT:
            return createESubSelect();
        case SqlPackage.ENOT_EXPRESSION:
            return createENotExpression();
        case SqlPackage.ELONG_VALUE:
            return createELongValue();
        case SqlPackage.ENULL_VALUE:
            return createENullValue();
        case SqlPackage.EIS_NULL_EXPRESSION:
            return createEIsNullExpression();
        case SqlPackage.EFUNCTION:
            return createEFunction();
        case SqlPackage.ECOLUMN:
            return createEColumn();
        case SqlPackage.ECASE_EXPRESSION:
            return createECaseExpression();
        case SqlPackage.EWHEN_CLAUSE:
            return createEWhenClause();
        case SqlPackage.ESTRING_VALUE:
            return createEStringValue();
        case SqlPackage.EEXPRESSION_LIST:
            return createEExpressionList();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName()
                + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESelect createESelect() {
        ESelectImpl eSelect = new ESelectImpl();
        return eSelect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EPlainSelect createEPlainSelect() {
        EPlainSelectImpl ePlainSelect = new EPlainSelectImpl();
        return ePlainSelect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDistinct createEDistinct() {
        EDistinctImpl eDistinct = new EDistinctImpl();
        return eDistinct;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EGroupByElement createEGroupByElement() {
        EGroupByElementImpl eGroupByElement = new EGroupByElementImpl();
        return eGroupByElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EJoin createEJoin() {
        EJoinImpl eJoin = new EJoinImpl();
        return eJoin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAlias createEAlias() {
        EAliasImpl eAlias = new EAliasImpl();
        return eAlias;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAndExpression createEAndExpression() {
        EAndExpressionImpl eAndExpression = new EAndExpressionImpl();
        return eAndExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOrExpression createEOrExpression() {
        EOrExpressionImpl eOrExpression = new EOrExpressionImpl();
        return eOrExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEqualsTo createEEqualsTo() {
        EEqualsToImpl eEqualsTo = new EEqualsToImpl();
        return eEqualsTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EGreaterThan createEGreaterThan() {
        EGreaterThanImpl eGreaterThan = new EGreaterThanImpl();
        return eGreaterThan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EGreaterThanEquals createEGreaterThanEquals() {
        EGreaterThanEqualsImpl eGreaterThanEquals = new EGreaterThanEqualsImpl();
        return eGreaterThanEquals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMinorThan createEMinorThan() {
        EMinorThanImpl eMinorThan = new EMinorThanImpl();
        return eMinorThan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMinorThanEquals createEMinorThanEquals() {
        EMinorThanEqualsImpl eMinorThanEquals = new EMinorThanEqualsImpl();
        return eMinorThanEquals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ENotEqualsTo createENotEqualsTo() {
        ENotEqualsToImpl eNotEqualsTo = new ENotEqualsToImpl();
        return eNotEqualsTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAllColumns createEAllColumns() {
        EAllColumnsImpl eAllColumns = new EAllColumnsImpl();
        return eAllColumns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESelectExpressionItem createESelectExpressionItem() {
        ESelectExpressionItemImpl eSelectExpressionItem = new ESelectExpressionItemImpl();
        return eSelectExpressionItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ETable createETable() {
        ETableImpl eTable = new ETableImpl();
        return eTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESubSelect createESubSelect() {
        ESubSelectImpl eSubSelect = new ESubSelectImpl();
        return eSubSelect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ENotExpression createENotExpression() {
        ENotExpressionImpl eNotExpression = new ENotExpressionImpl();
        return eNotExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ELongValue createELongValue() {
        ELongValueImpl eLongValue = new ELongValueImpl();
        return eLongValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ENullValue createENullValue() {
        ENullValueImpl eNullValue = new ENullValueImpl();
        return eNullValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EIsNullExpression createEIsNullExpression() {
        EIsNullExpressionImpl eIsNullExpression = new EIsNullExpressionImpl();
        return eIsNullExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EFunction createEFunction() {
        EFunctionImpl eFunction = new EFunctionImpl();
        return eFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EColumn createEColumn() {
        EColumnImpl eColumn = new EColumnImpl();
        return eColumn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ECaseExpression createECaseExpression() {
        ECaseExpressionImpl eCaseExpression = new ECaseExpressionImpl();
        return eCaseExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EWhenClause createEWhenClause() {
        EWhenClauseImpl eWhenClause = new EWhenClauseImpl();
        return eWhenClause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EStringValue createEStringValue() {
        EStringValueImpl eStringValue = new EStringValueImpl();
        return eStringValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EExpressionList createEExpressionList() {
        EExpressionListImpl eExpressionList = new EExpressionListImpl();
        return eExpressionList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SqlPackage getSqlPackage() {
        return (SqlPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SqlPackage getPackage() {
        return SqlPackage.eINSTANCE;
    }

} //SqlFactoryImpl
