/**
 */
package org.vgu.se.sql.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.vgu.se.sql.EAlias;
import org.vgu.se.sql.EAllColumns;
import org.vgu.se.sql.EAndExpression;
import org.vgu.se.sql.EBinaryExpression;
import org.vgu.se.sql.ECaseExpression;
import org.vgu.se.sql.EColumn;
import org.vgu.se.sql.EComparisonOperator;
import org.vgu.se.sql.EDistinct;
import org.vgu.se.sql.EEqualsTo;
import org.vgu.se.sql.EExpression;
import org.vgu.se.sql.EExpressionList;
import org.vgu.se.sql.EFromItem;
import org.vgu.se.sql.EFunction;
import org.vgu.se.sql.EGreaterThan;
import org.vgu.se.sql.EGreaterThanEquals;
import org.vgu.se.sql.EGroupByElement;
import org.vgu.se.sql.EIsNullExpression;
import org.vgu.se.sql.EJoin;
import org.vgu.se.sql.ELongValue;
import org.vgu.se.sql.EMinorThan;
import org.vgu.se.sql.EMinorThanEquals;
import org.vgu.se.sql.ENotEqualsTo;
import org.vgu.se.sql.ENotExpression;
import org.vgu.se.sql.ENullValue;
import org.vgu.se.sql.EOrExpression;
import org.vgu.se.sql.EPlainSelect;
import org.vgu.se.sql.ESelect;
import org.vgu.se.sql.ESelectBody;
import org.vgu.se.sql.ESelectExpressionItem;
import org.vgu.se.sql.ESelectItem;
import org.vgu.se.sql.EStatement;
import org.vgu.se.sql.EStringValue;
import org.vgu.se.sql.ESubSelect;
import org.vgu.se.sql.ETable;
import org.vgu.se.sql.EWhenClause;
import org.vgu.se.sql.SqlFactory;
import org.vgu.se.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlPackageImpl extends EPackageImpl implements SqlPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSelectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSelectBodyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ePlainSelectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eDistinctEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eGroupByElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eJoinEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAliasEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eBinaryExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAndExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eOrExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eComparisonOperatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eEqualsToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eGreaterThanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eGreaterThanEqualsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eMinorThanEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eMinorThanEqualsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eNotEqualsToEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSelectItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAllColumnsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSelectExpressionItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eFromItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eTableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSubSelectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eNotExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eLongValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eNullValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eIsNullExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eFunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eColumnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eCaseExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eWhenClauseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eStringValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eExpressionListEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.vgu.se.sql.SqlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SqlPackageImpl() {
        super(eNS_URI, SqlFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link SqlPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SqlPackage init() {
        if (isInited)
            return (SqlPackage) EPackage.Registry.INSTANCE
                .getEPackage(SqlPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSqlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SqlPackageImpl theSqlPackage = registeredSqlPackage instanceof SqlPackageImpl
            ? (SqlPackageImpl) registeredSqlPackage
            : new SqlPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theSqlPackage.createPackageContents();

        // Initialize created meta-data
        theSqlPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSqlPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SqlPackage.eNS_URI, theSqlPackage);
        return theSqlPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEStatement() {
        return eStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESelect() {
        return eSelectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getESelect_SelectBody() {
        return (EReference) eSelectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESelectBody() {
        return eSelectBodyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEPlainSelect() {
        return ePlainSelectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_Distinct() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_SelectItems() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_FromItem() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_Joins() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_Where() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_GroupBy() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPlainSelect_Having() {
        return (EReference) ePlainSelectEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEDistinct() {
        return eDistinctEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEDistinct_UseUnique() {
        return (EAttribute) eDistinctEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEDistinct_OnSelectItems() {
        return (EReference) eDistinctEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEGroupByElement() {
        return eGroupByElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEGroupByElement_GroupByExpressions() {
        return (EReference) eGroupByElementEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEJoin() {
        return eJoinEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Outer() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Right() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Left() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Natural() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Full() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Inner() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Simple() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Cross() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Semi() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Straight() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEJoin_Apply() {
        return (EAttribute) eJoinEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEJoin_RightItem() {
        return (EReference) eJoinEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEJoin_OnExpression() {
        return (EReference) eJoinEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAlias() {
        return eAliasEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEAlias_Name() {
        return (EAttribute) eAliasEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEExpression() {
        return eExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEBinaryExpression() {
        return eBinaryExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEBinaryExpression_LeftExpression() {
        return (EReference) eBinaryExpressionEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEBinaryExpression_RightExpression() {
        return (EReference) eBinaryExpressionEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAndExpression() {
        return eAndExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEOrExpression() {
        return eOrExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEComparisonOperator() {
        return eComparisonOperatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEComparisonOperator_Operator() {
        return (EAttribute) eComparisonOperatorEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEEqualsTo() {
        return eEqualsToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEGreaterThan() {
        return eGreaterThanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEGreaterThanEquals() {
        return eGreaterThanEqualsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEMinorThan() {
        return eMinorThanEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEMinorThanEquals() {
        return eMinorThanEqualsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getENotEqualsTo() {
        return eNotEqualsToEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESelectItem() {
        return eSelectItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAllColumns() {
        return eAllColumnsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESelectExpressionItem() {
        return eSelectExpressionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getESelectExpressionItem_Alias() {
        return (EReference) eSelectExpressionItemEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getESelectExpressionItem_Expression() {
        return (EReference) eSelectExpressionItemEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEFromItem() {
        return eFromItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getETable() {
        return eTableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getETable_Alias() {
        return (EReference) eTableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getETable_Name() {
        return (EAttribute) eTableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESubSelect() {
        return eSubSelectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getESubSelect_Alias() {
        return (EReference) eSubSelectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getESubSelect_SelectBody() {
        return (EReference) eSubSelectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getENotExpression() {
        return eNotExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getENotExpression_Expression() {
        return (EReference) eNotExpressionEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getELongValue() {
        return eLongValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getELongValue_Value() {
        return (EAttribute) eLongValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getENullValue() {
        return eNullValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEIsNullExpression() {
        return eIsNullExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEIsNullExpression_Not() {
        return (EAttribute) eIsNullExpressionEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEIsNullExpression_LeftExpression() {
        return (EReference) eIsNullExpressionEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEFunction() {
        return eFunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEFunction_Name() {
        return (EAttribute) eFunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEFunction_AllColumns() {
        return (EAttribute) eFunctionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEFunction_Distinct() {
        return (EAttribute) eFunctionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEFunction_Parameters() {
        return (EReference) eFunctionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEColumn() {
        return eColumnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEColumn_ColumnName() {
        return (EAttribute) eColumnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEColumn_Table() {
        return (EReference) eColumnEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getECaseExpression() {
        return eCaseExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getECaseExpression_SwitchExpression() {
        return (EReference) eCaseExpressionEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getECaseExpression_ElseExpression() {
        return (EReference) eCaseExpressionEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getECaseExpression_WhenClauses() {
        return (EReference) eCaseExpressionEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEWhenClause() {
        return eWhenClauseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEWhenClause_WhenExpression() {
        return (EReference) eWhenClauseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEWhenClause_ThenExpression() {
        return (EReference) eWhenClauseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEStringValue() {
        return eStringValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEStringValue_Value() {
        return (EAttribute) eStringValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEExpressionList() {
        return eExpressionListEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEExpressionList_Expressions() {
        return (EReference) eExpressionListEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SqlFactory getSqlFactory() {
        return (SqlFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        eStatementEClass = createEClass(ESTATEMENT);

        eSelectEClass = createEClass(ESELECT);
        createEReference(eSelectEClass, ESELECT__SELECT_BODY);

        eSelectBodyEClass = createEClass(ESELECT_BODY);

        ePlainSelectEClass = createEClass(EPLAIN_SELECT);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__DISTINCT);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__SELECT_ITEMS);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__FROM_ITEM);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__JOINS);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__WHERE);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__GROUP_BY);
        createEReference(ePlainSelectEClass, EPLAIN_SELECT__HAVING);

        eDistinctEClass = createEClass(EDISTINCT);
        createEAttribute(eDistinctEClass, EDISTINCT__USE_UNIQUE);
        createEReference(eDistinctEClass, EDISTINCT__ON_SELECT_ITEMS);

        eGroupByElementEClass = createEClass(EGROUP_BY_ELEMENT);
        createEReference(eGroupByElementEClass,
            EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS);

        eJoinEClass = createEClass(EJOIN);
        createEAttribute(eJoinEClass, EJOIN__OUTER);
        createEAttribute(eJoinEClass, EJOIN__RIGHT);
        createEAttribute(eJoinEClass, EJOIN__LEFT);
        createEAttribute(eJoinEClass, EJOIN__NATURAL);
        createEAttribute(eJoinEClass, EJOIN__FULL);
        createEAttribute(eJoinEClass, EJOIN__INNER);
        createEAttribute(eJoinEClass, EJOIN__SIMPLE);
        createEAttribute(eJoinEClass, EJOIN__CROSS);
        createEAttribute(eJoinEClass, EJOIN__SEMI);
        createEAttribute(eJoinEClass, EJOIN__STRAIGHT);
        createEAttribute(eJoinEClass, EJOIN__APPLY);
        createEReference(eJoinEClass, EJOIN__RIGHT_ITEM);
        createEReference(eJoinEClass, EJOIN__ON_EXPRESSION);

        eAliasEClass = createEClass(EALIAS);
        createEAttribute(eAliasEClass, EALIAS__NAME);

        eExpressionEClass = createEClass(EEXPRESSION);

        eBinaryExpressionEClass = createEClass(EBINARY_EXPRESSION);
        createEReference(eBinaryExpressionEClass,
            EBINARY_EXPRESSION__LEFT_EXPRESSION);
        createEReference(eBinaryExpressionEClass,
            EBINARY_EXPRESSION__RIGHT_EXPRESSION);

        eAndExpressionEClass = createEClass(EAND_EXPRESSION);

        eOrExpressionEClass = createEClass(EOR_EXPRESSION);

        eComparisonOperatorEClass = createEClass(ECOMPARISON_OPERATOR);
        createEAttribute(eComparisonOperatorEClass,
            ECOMPARISON_OPERATOR__OPERATOR);

        eEqualsToEClass = createEClass(EEQUALS_TO);

        eGreaterThanEClass = createEClass(EGREATER_THAN);

        eGreaterThanEqualsEClass = createEClass(EGREATER_THAN_EQUALS);

        eMinorThanEClass = createEClass(EMINOR_THAN);

        eMinorThanEqualsEClass = createEClass(EMINOR_THAN_EQUALS);

        eNotEqualsToEClass = createEClass(ENOT_EQUALS_TO);

        eSelectItemEClass = createEClass(ESELECT_ITEM);

        eAllColumnsEClass = createEClass(EALL_COLUMNS);

        eSelectExpressionItemEClass = createEClass(ESELECT_EXPRESSION_ITEM);
        createEReference(eSelectExpressionItemEClass,
            ESELECT_EXPRESSION_ITEM__ALIAS);
        createEReference(eSelectExpressionItemEClass,
            ESELECT_EXPRESSION_ITEM__EXPRESSION);

        eFromItemEClass = createEClass(EFROM_ITEM);

        eTableEClass = createEClass(ETABLE);
        createEReference(eTableEClass, ETABLE__ALIAS);
        createEAttribute(eTableEClass, ETABLE__NAME);

        eSubSelectEClass = createEClass(ESUB_SELECT);
        createEReference(eSubSelectEClass, ESUB_SELECT__ALIAS);
        createEReference(eSubSelectEClass, ESUB_SELECT__SELECT_BODY);

        eNotExpressionEClass = createEClass(ENOT_EXPRESSION);
        createEReference(eNotExpressionEClass, ENOT_EXPRESSION__EXPRESSION);

        eLongValueEClass = createEClass(ELONG_VALUE);
        createEAttribute(eLongValueEClass, ELONG_VALUE__VALUE);

        eNullValueEClass = createEClass(ENULL_VALUE);

        eIsNullExpressionEClass = createEClass(EIS_NULL_EXPRESSION);
        createEAttribute(eIsNullExpressionEClass, EIS_NULL_EXPRESSION__NOT);
        createEReference(eIsNullExpressionEClass,
            EIS_NULL_EXPRESSION__LEFT_EXPRESSION);

        eFunctionEClass = createEClass(EFUNCTION);
        createEAttribute(eFunctionEClass, EFUNCTION__NAME);
        createEAttribute(eFunctionEClass, EFUNCTION__ALL_COLUMNS);
        createEAttribute(eFunctionEClass, EFUNCTION__DISTINCT);
        createEReference(eFunctionEClass, EFUNCTION__PARAMETERS);

        eColumnEClass = createEClass(ECOLUMN);
        createEAttribute(eColumnEClass, ECOLUMN__COLUMN_NAME);
        createEReference(eColumnEClass, ECOLUMN__TABLE);

        eCaseExpressionEClass = createEClass(ECASE_EXPRESSION);
        createEReference(eCaseExpressionEClass,
            ECASE_EXPRESSION__SWITCH_EXPRESSION);
        createEReference(eCaseExpressionEClass,
            ECASE_EXPRESSION__ELSE_EXPRESSION);
        createEReference(eCaseExpressionEClass, ECASE_EXPRESSION__WHEN_CLAUSES);

        eWhenClauseEClass = createEClass(EWHEN_CLAUSE);
        createEReference(eWhenClauseEClass, EWHEN_CLAUSE__WHEN_EXPRESSION);
        createEReference(eWhenClauseEClass, EWHEN_CLAUSE__THEN_EXPRESSION);

        eStringValueEClass = createEClass(ESTRING_VALUE);
        createEAttribute(eStringValueEClass, ESTRING_VALUE__VALUE);

        eExpressionListEClass = createEClass(EEXPRESSION_LIST);
        createEReference(eExpressionListEClass, EEXPRESSION_LIST__EXPRESSIONS);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        eSelectEClass.getESuperTypes().add(this.getEStatement());
        ePlainSelectEClass.getESuperTypes().add(this.getESelectBody());
        eBinaryExpressionEClass.getESuperTypes().add(this.getEExpression());
        eAndExpressionEClass.getESuperTypes().add(this.getEBinaryExpression());
        eOrExpressionEClass.getESuperTypes().add(this.getEBinaryExpression());
        eComparisonOperatorEClass.getESuperTypes()
            .add(this.getEBinaryExpression());
        eEqualsToEClass.getESuperTypes().add(this.getEComparisonOperator());
        eGreaterThanEClass.getESuperTypes().add(this.getEComparisonOperator());
        eGreaterThanEqualsEClass.getESuperTypes()
            .add(this.getEComparisonOperator());
        eMinorThanEClass.getESuperTypes().add(this.getEComparisonOperator());
        eMinorThanEqualsEClass.getESuperTypes()
            .add(this.getEComparisonOperator());
        eNotEqualsToEClass.getESuperTypes().add(this.getEComparisonOperator());
        eAllColumnsEClass.getESuperTypes().add(this.getESelectItem());
        eSelectExpressionItemEClass.getESuperTypes().add(this.getESelectItem());
        eTableEClass.getESuperTypes().add(this.getEFromItem());
        eSubSelectEClass.getESuperTypes().add(this.getEFromItem());
        eSubSelectEClass.getESuperTypes().add(this.getEExpression());
        eNotExpressionEClass.getESuperTypes().add(this.getEExpression());
        eLongValueEClass.getESuperTypes().add(this.getEExpression());
        eNullValueEClass.getESuperTypes().add(this.getEExpression());
        eIsNullExpressionEClass.getESuperTypes().add(this.getEExpression());
        eFunctionEClass.getESuperTypes().add(this.getEExpression());
        eColumnEClass.getESuperTypes().add(this.getEExpression());
        eCaseExpressionEClass.getESuperTypes().add(this.getEExpression());
        eWhenClauseEClass.getESuperTypes().add(this.getEExpression());
        eStringValueEClass.getESuperTypes().add(this.getEExpression());

        // Initialize classes, features, and operations; add parameters
        initEClass(eStatementEClass, EStatement.class, "EStatement",
            IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eSelectEClass, ESelect.class, "ESelect", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getESelect_SelectBody(), this.getESelectBody(), null,
            "selectBody", null, 1, 1, ESelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eSelectBodyEClass, ESelectBody.class, "ESelectBody",
            IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ePlainSelectEClass, EPlainSelect.class, "EPlainSelect",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEPlainSelect_Distinct(), this.getEDistinct(), null,
            "distinct", null, 0, 1, EPlainSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEPlainSelect_SelectItems(), this.getESelectItem(),
            null, "selectItems", null, 0, -1, EPlainSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEPlainSelect_FromItem(), this.getEFromItem(), null,
            "fromItem", null, 0, 1, EPlainSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEPlainSelect_Joins(), this.getEJoin(), null, "joins",
            null, 0, -1, EPlainSelect.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEPlainSelect_Where(), this.getEExpression(), null,
            "where", null, 0, 1, EPlainSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEPlainSelect_GroupBy(), this.getEGroupByElement(),
            null, "groupBy", null, 0, 1, EPlainSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEPlainSelect_Having(), this.getEExpression(), null,
            "having", null, 0, 1, EPlainSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eDistinctEClass, EDistinct.class, "EDistinct", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEDistinct_UseUnique(), ecorePackage.getEBoolean(),
            "useUnique", null, 0, 1, EDistinct.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEDistinct_OnSelectItems(), this.getESelectItem(),
            null, "onSelectItems", null, 0, -1, EDistinct.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eGroupByElementEClass, EGroupByElement.class,
            "EGroupByElement", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEGroupByElement_GroupByExpressions(),
            this.getEExpression(), null, "groupByExpressions", null, 0, -1,
            EGroupByElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eJoinEClass, EJoin.class, "EJoin", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEJoin_Outer(), ecorePackage.getEBoolean(), "outer",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Right(), ecorePackage.getEBoolean(), "right",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Left(), ecorePackage.getEBoolean(), "left",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Natural(), ecorePackage.getEBoolean(),
            "natural", null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEAttribute(getEJoin_Full(), ecorePackage.getEBoolean(), "full",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Inner(), ecorePackage.getEBoolean(), "inner",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Simple(), ecorePackage.getEBoolean(), "simple",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Cross(), ecorePackage.getEBoolean(), "cross",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Semi(), ecorePackage.getEBoolean(), "semi",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEJoin_Straight(), ecorePackage.getEBoolean(),
            "straight", null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEAttribute(getEJoin_Apply(), ecorePackage.getEBoolean(), "apply",
            null, 0, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEJoin_RightItem(), this.getEFromItem(), null,
            "rightItem", null, 1, 1, EJoin.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEJoin_OnExpression(), this.getEExpression(), null,
            "onExpression", null, 0, 1, EJoin.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eAliasEClass, EAlias.class, "EAlias", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEAlias_Name(), ecorePackage.getEString(), "name",
            null, 1, 1, EAlias.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eExpressionEClass, EExpression.class, "EExpression",
            IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eBinaryExpressionEClass, EBinaryExpression.class,
            "EBinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEBinaryExpression_LeftExpression(),
            this.getEExpression(), null, "leftExpression", null, 1, 1,
            EBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEBinaryExpression_RightExpression(),
            this.getEExpression(), null, "rightExpression", null, 1, 1,
            EBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eAndExpressionEClass, EAndExpression.class, "EAndExpression",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eOrExpressionEClass, EOrExpression.class, "EOrExpression",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eComparisonOperatorEClass, EComparisonOperator.class,
            "EComparisonOperator", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEComparisonOperator_Operator(),
            ecorePackage.getEString(), "operator", null, 0, 1,
            EComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eEqualsToEClass, EEqualsTo.class, "EEqualsTo", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eGreaterThanEClass, EGreaterThan.class, "EGreaterThan",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eGreaterThanEqualsEClass, EGreaterThanEquals.class,
            "EGreaterThanEquals", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

        initEClass(eMinorThanEClass, EMinorThan.class, "EMinorThan",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eMinorThanEqualsEClass, EMinorThanEquals.class,
            "EMinorThanEquals", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

        initEClass(eNotEqualsToEClass, ENotEqualsTo.class, "ENotEqualsTo",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eSelectItemEClass, ESelectItem.class, "ESelectItem",
            IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eAllColumnsEClass, EAllColumns.class, "EAllColumns",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eSelectExpressionItemEClass, ESelectExpressionItem.class,
            "ESelectExpressionItem", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getESelectExpressionItem_Alias(), this.getEAlias(), null,
            "alias", null, 0, 1, ESelectExpressionItem.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getESelectExpressionItem_Expression(),
            this.getEExpression(), null, "expression", null, 1, 1,
            ESelectExpressionItem.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eFromItemEClass, EFromItem.class, "EFromItem", IS_ABSTRACT,
            IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eTableEClass, ETable.class, "ETable", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getETable_Alias(), this.getEAlias(), null, "alias", null,
            0, 1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEAttribute(getETable_Name(), ecorePackage.getEString(), "name",
            null, 1, 1, ETable.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eSubSelectEClass, ESubSelect.class, "ESubSelect",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getESubSelect_Alias(), this.getEAlias(), null, "alias",
            null, 0, 1, ESubSelect.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getESubSelect_SelectBody(), this.getESelectBody(), null,
            "selectBody", null, 1, 1, ESubSelect.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eNotExpressionEClass, ENotExpression.class, "ENotExpression",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getENotExpression_Expression(), this.getEExpression(),
            null, "expression", null, 1, 1, ENotExpression.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eLongValueEClass, ELongValue.class, "ELongValue",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getELongValue_Value(), ecorePackage.getELongObject(),
            "value", null, 0, 1, ELongValue.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eNullValueEClass, ENullValue.class, "ENullValue",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eIsNullExpressionEClass, EIsNullExpression.class,
            "EIsNullExpression", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEIsNullExpression_Not(), ecorePackage.getEBoolean(),
            "not", null, 0, 1, EIsNullExpression.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEIsNullExpression_LeftExpression(),
            this.getEExpression(), null, "leftExpression", null, 1, 1,
            EIsNullExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eFunctionEClass, EFunction.class, "EFunction", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEFunction_Name(), ecorePackage.getEString(), "name",
            null, 0, 1, EFunction.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEAttribute(getEFunction_AllColumns(), ecorePackage.getEBoolean(),
            "allColumns", null, 0, 1, EFunction.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEFunction_Distinct(), ecorePackage.getEBoolean(),
            "distinct", null, 0, 1, EFunction.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEFunction_Parameters(), this.getEExpressionList(),
            null, "parameters", null, 0, 1, EFunction.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eColumnEClass, EColumn.class, "EColumn", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEColumn_ColumnName(), ecorePackage.getEString(),
            "columnName", null, 0, 1, EColumn.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEColumn_Table(), this.getETable(), null, "table",
            null, 0, 1, EColumn.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eCaseExpressionEClass, ECaseExpression.class,
            "ECaseExpression", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getECaseExpression_SwitchExpression(),
            this.getEExpression(), null, "switchExpression", null, 0, 1,
            ECaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getECaseExpression_ElseExpression(),
            this.getEExpression(), null, "elseExpression", null, 0, 1,
            ECaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getECaseExpression_WhenClauses(), this.getEWhenClause(),
            null, "whenClauses", null, 0, -1, ECaseExpression.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eWhenClauseEClass, EWhenClause.class, "EWhenClause",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEWhenClause_WhenExpression(), this.getEExpression(),
            null, "whenExpression", null, 1, 1, EWhenClause.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getEWhenClause_ThenExpression(), this.getEExpression(),
            null, "thenExpression", null, 1, 1, EWhenClause.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eStringValueEClass, EStringValue.class, "EStringValue",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEStringValue_Value(), ecorePackage.getEString(),
            "value", null, 0, 1, EStringValue.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eExpressionListEClass, EExpressionList.class,
            "EExpressionList", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEExpressionList_Expressions(), this.getEExpression(),
            null, "expressions", null, 0, -1, EExpressionList.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //SqlPackageImpl
