/**
 */
package org.vgu.se.sql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.vgu.se.sql.SqlFactory
 * @model kind="package"
 * @generated
 */
public interface SqlPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sql";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/sql";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sql";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SqlPackage eINSTANCE = org.vgu.se.sql.impl.SqlPackageImpl.init();

    /**
     * The meta object id for the '{@link org.vgu.se.sql.EStatement <em>EStatement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.EStatement
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEStatement()
     * @generated
     */
    int ESTATEMENT = 0;

    /**
     * The number of structural features of the '<em>EStatement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATEMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>EStatement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.ESelectImpl <em>ESelect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.ESelectImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelect()
     * @generated
     */
    int ESELECT = 1;

    /**
     * The feature id for the '<em><b>Select Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT__SELECT_BODY = ESTATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>ESelect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_FEATURE_COUNT = ESTATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>ESelect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_OPERATION_COUNT = ESTATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.ESelectBody <em>ESelect Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.ESelectBody
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelectBody()
     * @generated
     */
    int ESELECT_BODY = 2;

    /**
     * The number of structural features of the '<em>ESelect Body</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_BODY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ESelect Body</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_BODY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EPlainSelectImpl <em>EPlain Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EPlainSelectImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEPlainSelect()
     * @generated
     */
    int EPLAIN_SELECT = 3;

    /**
     * The feature id for the '<em><b>Distinct</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__DISTINCT = ESELECT_BODY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select Items</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__SELECT_ITEMS = ESELECT_BODY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>From Item</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__FROM_ITEM = ESELECT_BODY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Joins</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__JOINS = ESELECT_BODY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Where</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__WHERE = ESELECT_BODY_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Group By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__GROUP_BY = ESELECT_BODY_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Having</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT__HAVING = ESELECT_BODY_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>EPlain Select</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT_FEATURE_COUNT = ESELECT_BODY_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>EPlain Select</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPLAIN_SELECT_OPERATION_COUNT = ESELECT_BODY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EDistinctImpl <em>EDistinct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EDistinctImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEDistinct()
     * @generated
     */
    int EDISTINCT = 4;

    /**
     * The feature id for the '<em><b>Use Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDISTINCT__USE_UNIQUE = 0;

    /**
     * The feature id for the '<em><b>On Select Items</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDISTINCT__ON_SELECT_ITEMS = 1;

    /**
     * The number of structural features of the '<em>EDistinct</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDISTINCT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>EDistinct</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDISTINCT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EGroupByElementImpl <em>EGroup By Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EGroupByElementImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEGroupByElement()
     * @generated
     */
    int EGROUP_BY_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Group By Expressions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS = 0;

    /**
     * The number of structural features of the '<em>EGroup By Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGROUP_BY_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>EGroup By Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGROUP_BY_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EJoinImpl <em>EJoin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EJoinImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEJoin()
     * @generated
     */
    int EJOIN = 6;

    /**
     * The feature id for the '<em><b>Outer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__OUTER = 0;

    /**
     * The feature id for the '<em><b>Right</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__RIGHT = 1;

    /**
     * The feature id for the '<em><b>Left</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__LEFT = 2;

    /**
     * The feature id for the '<em><b>Natural</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__NATURAL = 3;

    /**
     * The feature id for the '<em><b>Full</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__FULL = 4;

    /**
     * The feature id for the '<em><b>Inner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__INNER = 5;

    /**
     * The feature id for the '<em><b>Simple</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__SIMPLE = 6;

    /**
     * The feature id for the '<em><b>Cross</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__CROSS = 7;

    /**
     * The feature id for the '<em><b>Semi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__SEMI = 8;

    /**
     * The feature id for the '<em><b>Straight</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__STRAIGHT = 9;

    /**
     * The feature id for the '<em><b>Apply</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__APPLY = 10;

    /**
     * The feature id for the '<em><b>Right Item</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__RIGHT_ITEM = 11;

    /**
     * The feature id for the '<em><b>On Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN__ON_EXPRESSION = 12;

    /**
     * The number of structural features of the '<em>EJoin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN_FEATURE_COUNT = 13;

    /**
     * The number of operations of the '<em>EJoin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EJOIN_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EAliasImpl <em>EAlias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EAliasImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEAlias()
     * @generated
     */
    int EALIAS = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EALIAS__NAME = 0;

    /**
     * The number of structural features of the '<em>EAlias</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EALIAS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>EAlias</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EALIAS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.EExpression <em>EExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.EExpression
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEExpression()
     * @generated
     */
    int EEXPRESSION = 8;

    /**
     * The number of structural features of the '<em>EExpression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEXPRESSION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>EExpression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEXPRESSION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EBinaryExpressionImpl <em>EBinary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EBinaryExpressionImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEBinaryExpression()
     * @generated
     */
    int EBINARY_EXPRESSION = 9;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBINARY_EXPRESSION__LEFT_EXPRESSION = EEXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBINARY_EXPRESSION__RIGHT_EXPRESSION = EEXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>EBinary Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBINARY_EXPRESSION_FEATURE_COUNT = EEXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>EBinary Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBINARY_EXPRESSION_OPERATION_COUNT = EEXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EAndExpressionImpl <em>EAnd Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EAndExpressionImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEAndExpression()
     * @generated
     */
    int EAND_EXPRESSION = 10;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EAND_EXPRESSION__LEFT_EXPRESSION = EBINARY_EXPRESSION__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EAND_EXPRESSION__RIGHT_EXPRESSION = EBINARY_EXPRESSION__RIGHT_EXPRESSION;

    /**
     * The number of structural features of the '<em>EAnd Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EAND_EXPRESSION_FEATURE_COUNT = EBINARY_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EAnd Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EAND_EXPRESSION_OPERATION_COUNT = EBINARY_EXPRESSION_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EOrExpressionImpl <em>EOr Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EOrExpressionImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEOrExpression()
     * @generated
     */
    int EOR_EXPRESSION = 11;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOR_EXPRESSION__LEFT_EXPRESSION = EBINARY_EXPRESSION__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOR_EXPRESSION__RIGHT_EXPRESSION = EBINARY_EXPRESSION__RIGHT_EXPRESSION;

    /**
     * The number of structural features of the '<em>EOr Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOR_EXPRESSION_FEATURE_COUNT = EBINARY_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EOr Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOR_EXPRESSION_OPERATION_COUNT = EBINARY_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EComparisonOperatorImpl <em>EComparison Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EComparisonOperatorImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEComparisonOperator()
     * @generated
     */
    int ECOMPARISON_OPERATOR = 12;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOMPARISON_OPERATOR__LEFT_EXPRESSION = EBINARY_EXPRESSION__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOMPARISON_OPERATOR__RIGHT_EXPRESSION = EBINARY_EXPRESSION__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOMPARISON_OPERATOR__OPERATOR = EBINARY_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EComparison Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOMPARISON_OPERATOR_FEATURE_COUNT = EBINARY_EXPRESSION_FEATURE_COUNT
        + 1;

    /**
     * The number of operations of the '<em>EComparison Operator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOMPARISON_OPERATOR_OPERATION_COUNT = EBINARY_EXPRESSION_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EEqualsToImpl <em>EEquals To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EEqualsToImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEEqualsTo()
     * @generated
     */
    int EEQUALS_TO = 13;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEQUALS_TO__LEFT_EXPRESSION = ECOMPARISON_OPERATOR__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEQUALS_TO__RIGHT_EXPRESSION = ECOMPARISON_OPERATOR__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEQUALS_TO__OPERATOR = ECOMPARISON_OPERATOR__OPERATOR;

    /**
     * The number of structural features of the '<em>EEquals To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEQUALS_TO_FEATURE_COUNT = ECOMPARISON_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EEquals To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EEQUALS_TO_OPERATION_COUNT = ECOMPARISON_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EGreaterThanImpl <em>EGreater Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EGreaterThanImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEGreaterThan()
     * @generated
     */
    int EGREATER_THAN = 14;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN__LEFT_EXPRESSION = ECOMPARISON_OPERATOR__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN__RIGHT_EXPRESSION = ECOMPARISON_OPERATOR__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN__OPERATOR = ECOMPARISON_OPERATOR__OPERATOR;

    /**
     * The number of structural features of the '<em>EGreater Than</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_FEATURE_COUNT = ECOMPARISON_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EGreater Than</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_OPERATION_COUNT = ECOMPARISON_OPERATOR_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EGreaterThanEqualsImpl <em>EGreater Than Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EGreaterThanEqualsImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEGreaterThanEquals()
     * @generated
     */
    int EGREATER_THAN_EQUALS = 15;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_EQUALS__LEFT_EXPRESSION = ECOMPARISON_OPERATOR__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_EQUALS__RIGHT_EXPRESSION = ECOMPARISON_OPERATOR__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_EQUALS__OPERATOR = ECOMPARISON_OPERATOR__OPERATOR;

    /**
     * The number of structural features of the '<em>EGreater Than Equals</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_EQUALS_FEATURE_COUNT = ECOMPARISON_OPERATOR_FEATURE_COUNT
        + 0;

    /**
     * The number of operations of the '<em>EGreater Than Equals</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EGREATER_THAN_EQUALS_OPERATION_COUNT = ECOMPARISON_OPERATOR_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EMinorThanImpl <em>EMinor Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EMinorThanImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEMinorThan()
     * @generated
     */
    int EMINOR_THAN = 16;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN__LEFT_EXPRESSION = ECOMPARISON_OPERATOR__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN__RIGHT_EXPRESSION = ECOMPARISON_OPERATOR__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN__OPERATOR = ECOMPARISON_OPERATOR__OPERATOR;

    /**
     * The number of structural features of the '<em>EMinor Than</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_FEATURE_COUNT = ECOMPARISON_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EMinor Than</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_OPERATION_COUNT = ECOMPARISON_OPERATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EMinorThanEqualsImpl <em>EMinor Than Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EMinorThanEqualsImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEMinorThanEquals()
     * @generated
     */
    int EMINOR_THAN_EQUALS = 17;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_EQUALS__LEFT_EXPRESSION = ECOMPARISON_OPERATOR__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_EQUALS__RIGHT_EXPRESSION = ECOMPARISON_OPERATOR__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_EQUALS__OPERATOR = ECOMPARISON_OPERATOR__OPERATOR;

    /**
     * The number of structural features of the '<em>EMinor Than Equals</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_EQUALS_FEATURE_COUNT = ECOMPARISON_OPERATOR_FEATURE_COUNT
        + 0;

    /**
     * The number of operations of the '<em>EMinor Than Equals</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMINOR_THAN_EQUALS_OPERATION_COUNT = ECOMPARISON_OPERATOR_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.ENotEqualsToImpl <em>ENot Equals To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.ENotEqualsToImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getENotEqualsTo()
     * @generated
     */
    int ENOT_EQUALS_TO = 18;

    /**
     * The feature id for the '<em><b>Left Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EQUALS_TO__LEFT_EXPRESSION = ECOMPARISON_OPERATOR__LEFT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Right Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EQUALS_TO__RIGHT_EXPRESSION = ECOMPARISON_OPERATOR__RIGHT_EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EQUALS_TO__OPERATOR = ECOMPARISON_OPERATOR__OPERATOR;

    /**
     * The number of structural features of the '<em>ENot Equals To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EQUALS_TO_FEATURE_COUNT = ECOMPARISON_OPERATOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ENot Equals To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EQUALS_TO_OPERATION_COUNT = ECOMPARISON_OPERATOR_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.ESelectItem <em>ESelect Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.ESelectItem
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelectItem()
     * @generated
     */
    int ESELECT_ITEM = 19;

    /**
     * The number of structural features of the '<em>ESelect Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_ITEM_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ESelect Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_ITEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.EAllColumnsImpl <em>EAll Columns</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.EAllColumnsImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEAllColumns()
     * @generated
     */
    int EALL_COLUMNS = 20;

    /**
     * The number of structural features of the '<em>EAll Columns</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EALL_COLUMNS_FEATURE_COUNT = ESELECT_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EAll Columns</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EALL_COLUMNS_OPERATION_COUNT = ESELECT_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.ESelectExpressionItemImpl <em>ESelect Expression Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.ESelectExpressionItemImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelectExpressionItem()
     * @generated
     */
    int ESELECT_EXPRESSION_ITEM = 21;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_EXPRESSION_ITEM__ALIAS = ESELECT_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_EXPRESSION_ITEM__EXPRESSION = ESELECT_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>ESelect Expression Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_EXPRESSION_ITEM_FEATURE_COUNT = ESELECT_ITEM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>ESelect Expression Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESELECT_EXPRESSION_ITEM_OPERATION_COUNT = ESELECT_ITEM_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.EFromItem <em>EFrom Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.EFromItem
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getEFromItem()
     * @generated
     */
    int EFROM_ITEM = 22;

    /**
     * The number of structural features of the '<em>EFrom Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFROM_ITEM_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>EFrom Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFROM_ITEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.ETableImpl <em>ETable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.ETableImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getETable()
     * @generated
     */
    int ETABLE = 23;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETABLE__ALIAS = EFROM_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETABLE__NAME = EFROM_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>ETable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETABLE_FEATURE_COUNT = EFROM_ITEM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>ETable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETABLE_OPERATION_COUNT = EFROM_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.ESubSelectImpl <em>ESub Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.ESubSelectImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getESubSelect()
     * @generated
     */
    int ESUB_SELECT = 24;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESUB_SELECT__ALIAS = EFROM_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select Body</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESUB_SELECT__SELECT_BODY = EFROM_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>ESub Select</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESUB_SELECT_FEATURE_COUNT = EFROM_ITEM_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>ESub Select</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESUB_SELECT_OPERATION_COUNT = EFROM_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.sql.impl.ENotExpressionImpl <em>ENot Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.sql.impl.ENotExpressionImpl
     * @see org.vgu.se.sql.impl.SqlPackageImpl#getENotExpression()
     * @generated
     */
    int ENOT_EXPRESSION = 25;

    /**
     * The feature id for the '<em><b>Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EXPRESSION__EXPRESSION = EEXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>ENot Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EXPRESSION_FEATURE_COUNT = EEXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>ENot Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENOT_EXPRESSION_OPERATION_COUNT = EEXPRESSION_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EStatement <em>EStatement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EStatement</em>'.
     * @see org.vgu.se.sql.EStatement
     * @generated
     */
    EClass getEStatement();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ESelect <em>ESelect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESelect</em>'.
     * @see org.vgu.se.sql.ESelect
     * @generated
     */
    EClass getESelect();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ESelect#getSelectBody <em>Select Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Select Body</em>'.
     * @see org.vgu.se.sql.ESelect#getSelectBody()
     * @see #getESelect()
     * @generated
     */
    EReference getESelect_SelectBody();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ESelectBody <em>ESelect Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESelect Body</em>'.
     * @see org.vgu.se.sql.ESelectBody
     * @generated
     */
    EClass getESelectBody();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EPlainSelect <em>EPlain Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EPlain Select</em>'.
     * @see org.vgu.se.sql.EPlainSelect
     * @generated
     */
    EClass getEPlainSelect();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EPlainSelect#getDistinct <em>Distinct</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Distinct</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getDistinct()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_Distinct();

    /**
     * Returns the meta object for the reference list '{@link org.vgu.se.sql.EPlainSelect#getSelectItems <em>Select Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Select Items</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getSelectItems()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_SelectItems();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EPlainSelect#getFromItem <em>From Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From Item</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getFromItem()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_FromItem();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EPlainSelect#getJoins <em>Joins</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Joins</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getJoins()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_Joins();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EPlainSelect#getWhere <em>Where</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Where</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getWhere()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_Where();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EPlainSelect#getGroupBy <em>Group By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Group By</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getGroupBy()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_GroupBy();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EPlainSelect#getHaving <em>Having</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Having</em>'.
     * @see org.vgu.se.sql.EPlainSelect#getHaving()
     * @see #getEPlainSelect()
     * @generated
     */
    EReference getEPlainSelect_Having();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EDistinct <em>EDistinct</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EDistinct</em>'.
     * @see org.vgu.se.sql.EDistinct
     * @generated
     */
    EClass getEDistinct();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EDistinct#isUseUnique <em>Use Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Use Unique</em>'.
     * @see org.vgu.se.sql.EDistinct#isUseUnique()
     * @see #getEDistinct()
     * @generated
     */
    EAttribute getEDistinct_UseUnique();

    /**
     * Returns the meta object for the reference list '{@link org.vgu.se.sql.EDistinct#getOnSelectItems <em>On Select Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>On Select Items</em>'.
     * @see org.vgu.se.sql.EDistinct#getOnSelectItems()
     * @see #getEDistinct()
     * @generated
     */
    EReference getEDistinct_OnSelectItems();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EGroupByElement <em>EGroup By Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EGroup By Element</em>'.
     * @see org.vgu.se.sql.EGroupByElement
     * @generated
     */
    EClass getEGroupByElement();

    /**
     * Returns the meta object for the reference list '{@link org.vgu.se.sql.EGroupByElement#getGroupByExpressions <em>Group By Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Group By Expressions</em>'.
     * @see org.vgu.se.sql.EGroupByElement#getGroupByExpressions()
     * @see #getEGroupByElement()
     * @generated
     */
    EReference getEGroupByElement_GroupByExpressions();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EJoin <em>EJoin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EJoin</em>'.
     * @see org.vgu.se.sql.EJoin
     * @generated
     */
    EClass getEJoin();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isOuter <em>Outer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Outer</em>'.
     * @see org.vgu.se.sql.EJoin#isOuter()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Outer();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isRight <em>Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Right</em>'.
     * @see org.vgu.se.sql.EJoin#isRight()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Right();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isLeft <em>Left</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Left</em>'.
     * @see org.vgu.se.sql.EJoin#isLeft()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Left();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isNatural <em>Natural</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Natural</em>'.
     * @see org.vgu.se.sql.EJoin#isNatural()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Natural();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isFull <em>Full</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Full</em>'.
     * @see org.vgu.se.sql.EJoin#isFull()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Full();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isInner <em>Inner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inner</em>'.
     * @see org.vgu.se.sql.EJoin#isInner()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Inner();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isSimple <em>Simple</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Simple</em>'.
     * @see org.vgu.se.sql.EJoin#isSimple()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Simple();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isCross <em>Cross</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cross</em>'.
     * @see org.vgu.se.sql.EJoin#isCross()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Cross();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isSemi <em>Semi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Semi</em>'.
     * @see org.vgu.se.sql.EJoin#isSemi()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Semi();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isStraight <em>Straight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Straight</em>'.
     * @see org.vgu.se.sql.EJoin#isStraight()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Straight();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EJoin#isApply <em>Apply</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Apply</em>'.
     * @see org.vgu.se.sql.EJoin#isApply()
     * @see #getEJoin()
     * @generated
     */
    EAttribute getEJoin_Apply();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EJoin#getRightItem <em>Right Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Right Item</em>'.
     * @see org.vgu.se.sql.EJoin#getRightItem()
     * @see #getEJoin()
     * @generated
     */
    EReference getEJoin_RightItem();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EJoin#getOnExpression <em>On Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>On Expression</em>'.
     * @see org.vgu.se.sql.EJoin#getOnExpression()
     * @see #getEJoin()
     * @generated
     */
    EReference getEJoin_OnExpression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EAlias <em>EAlias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAlias</em>'.
     * @see org.vgu.se.sql.EAlias
     * @generated
     */
    EClass getEAlias();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EAlias#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.vgu.se.sql.EAlias#getName()
     * @see #getEAlias()
     * @generated
     */
    EAttribute getEAlias_Name();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EExpression <em>EExpression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EExpression</em>'.
     * @see org.vgu.se.sql.EExpression
     * @generated
     */
    EClass getEExpression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EBinaryExpression <em>EBinary Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EBinary Expression</em>'.
     * @see org.vgu.se.sql.EBinaryExpression
     * @generated
     */
    EClass getEBinaryExpression();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EBinaryExpression#getLeftExpression <em>Left Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Left Expression</em>'.
     * @see org.vgu.se.sql.EBinaryExpression#getLeftExpression()
     * @see #getEBinaryExpression()
     * @generated
     */
    EReference getEBinaryExpression_LeftExpression();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.EBinaryExpression#getRightExpression <em>Right Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Right Expression</em>'.
     * @see org.vgu.se.sql.EBinaryExpression#getRightExpression()
     * @see #getEBinaryExpression()
     * @generated
     */
    EReference getEBinaryExpression_RightExpression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EAndExpression <em>EAnd Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAnd Expression</em>'.
     * @see org.vgu.se.sql.EAndExpression
     * @generated
     */
    EClass getEAndExpression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EOrExpression <em>EOr Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EOr Expression</em>'.
     * @see org.vgu.se.sql.EOrExpression
     * @generated
     */
    EClass getEOrExpression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EComparisonOperator <em>EComparison Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EComparison Operator</em>'.
     * @see org.vgu.se.sql.EComparisonOperator
     * @generated
     */
    EClass getEComparisonOperator();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.EComparisonOperator#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see org.vgu.se.sql.EComparisonOperator#getOperator()
     * @see #getEComparisonOperator()
     * @generated
     */
    EAttribute getEComparisonOperator_Operator();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EEqualsTo <em>EEquals To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EEquals To</em>'.
     * @see org.vgu.se.sql.EEqualsTo
     * @generated
     */
    EClass getEEqualsTo();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EGreaterThan <em>EGreater Than</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EGreater Than</em>'.
     * @see org.vgu.se.sql.EGreaterThan
     * @generated
     */
    EClass getEGreaterThan();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EGreaterThanEquals <em>EGreater Than Equals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EGreater Than Equals</em>'.
     * @see org.vgu.se.sql.EGreaterThanEquals
     * @generated
     */
    EClass getEGreaterThanEquals();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EMinorThan <em>EMinor Than</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMinor Than</em>'.
     * @see org.vgu.se.sql.EMinorThan
     * @generated
     */
    EClass getEMinorThan();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EMinorThanEquals <em>EMinor Than Equals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMinor Than Equals</em>'.
     * @see org.vgu.se.sql.EMinorThanEquals
     * @generated
     */
    EClass getEMinorThanEquals();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ENotEqualsTo <em>ENot Equals To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ENot Equals To</em>'.
     * @see org.vgu.se.sql.ENotEqualsTo
     * @generated
     */
    EClass getENotEqualsTo();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ESelectItem <em>ESelect Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESelect Item</em>'.
     * @see org.vgu.se.sql.ESelectItem
     * @generated
     */
    EClass getESelectItem();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EAllColumns <em>EAll Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAll Columns</em>'.
     * @see org.vgu.se.sql.EAllColumns
     * @generated
     */
    EClass getEAllColumns();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ESelectExpressionItem <em>ESelect Expression Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESelect Expression Item</em>'.
     * @see org.vgu.se.sql.ESelectExpressionItem
     * @generated
     */
    EClass getESelectExpressionItem();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ESelectExpressionItem#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Alias</em>'.
     * @see org.vgu.se.sql.ESelectExpressionItem#getAlias()
     * @see #getESelectExpressionItem()
     * @generated
     */
    EReference getESelectExpressionItem_Alias();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ESelectExpressionItem#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Expression</em>'.
     * @see org.vgu.se.sql.ESelectExpressionItem#getExpression()
     * @see #getESelectExpressionItem()
     * @generated
     */
    EReference getESelectExpressionItem_Expression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.EFromItem <em>EFrom Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EFrom Item</em>'.
     * @see org.vgu.se.sql.EFromItem
     * @generated
     */
    EClass getEFromItem();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ETable <em>ETable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ETable</em>'.
     * @see org.vgu.se.sql.ETable
     * @generated
     */
    EClass getETable();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ETable#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Alias</em>'.
     * @see org.vgu.se.sql.ETable#getAlias()
     * @see #getETable()
     * @generated
     */
    EReference getETable_Alias();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.sql.ETable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.vgu.se.sql.ETable#getName()
     * @see #getETable()
     * @generated
     */
    EAttribute getETable_Name();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ESubSelect <em>ESub Select</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESub Select</em>'.
     * @see org.vgu.se.sql.ESubSelect
     * @generated
     */
    EClass getESubSelect();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ESubSelect#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Alias</em>'.
     * @see org.vgu.se.sql.ESubSelect#getAlias()
     * @see #getESubSelect()
     * @generated
     */
    EReference getESubSelect_Alias();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ESubSelect#getSelectBody <em>Select Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Select Body</em>'.
     * @see org.vgu.se.sql.ESubSelect#getSelectBody()
     * @see #getESubSelect()
     * @generated
     */
    EReference getESubSelect_SelectBody();

    /**
     * Returns the meta object for class '{@link org.vgu.se.sql.ENotExpression <em>ENot Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ENot Expression</em>'.
     * @see org.vgu.se.sql.ENotExpression
     * @generated
     */
    EClass getENotExpression();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.sql.ENotExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Expression</em>'.
     * @see org.vgu.se.sql.ENotExpression#getExpression()
     * @see #getENotExpression()
     * @generated
     */
    EReference getENotExpression_Expression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SqlFactory getSqlFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.vgu.se.sql.EStatement <em>EStatement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.EStatement
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEStatement()
         * @generated
         */
        EClass ESTATEMENT = eINSTANCE.getEStatement();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.ESelectImpl <em>ESelect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.ESelectImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelect()
         * @generated
         */
        EClass ESELECT = eINSTANCE.getESelect();

        /**
         * The meta object literal for the '<em><b>Select Body</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESELECT__SELECT_BODY = eINSTANCE.getESelect_SelectBody();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.ESelectBody <em>ESelect Body</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.ESelectBody
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelectBody()
         * @generated
         */
        EClass ESELECT_BODY = eINSTANCE.getESelectBody();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EPlainSelectImpl <em>EPlain Select</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EPlainSelectImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEPlainSelect()
         * @generated
         */
        EClass EPLAIN_SELECT = eINSTANCE.getEPlainSelect();

        /**
         * The meta object literal for the '<em><b>Distinct</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__DISTINCT = eINSTANCE
            .getEPlainSelect_Distinct();

        /**
         * The meta object literal for the '<em><b>Select Items</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__SELECT_ITEMS = eINSTANCE
            .getEPlainSelect_SelectItems();

        /**
         * The meta object literal for the '<em><b>From Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__FROM_ITEM = eINSTANCE
            .getEPlainSelect_FromItem();

        /**
         * The meta object literal for the '<em><b>Joins</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__JOINS = eINSTANCE.getEPlainSelect_Joins();

        /**
         * The meta object literal for the '<em><b>Where</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__WHERE = eINSTANCE.getEPlainSelect_Where();

        /**
         * The meta object literal for the '<em><b>Group By</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__GROUP_BY = eINSTANCE
            .getEPlainSelect_GroupBy();

        /**
         * The meta object literal for the '<em><b>Having</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPLAIN_SELECT__HAVING = eINSTANCE.getEPlainSelect_Having();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EDistinctImpl <em>EDistinct</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EDistinctImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEDistinct()
         * @generated
         */
        EClass EDISTINCT = eINSTANCE.getEDistinct();

        /**
         * The meta object literal for the '<em><b>Use Unique</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EDISTINCT__USE_UNIQUE = eINSTANCE.getEDistinct_UseUnique();

        /**
         * The meta object literal for the '<em><b>On Select Items</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EDISTINCT__ON_SELECT_ITEMS = eINSTANCE
            .getEDistinct_OnSelectItems();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EGroupByElementImpl <em>EGroup By Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EGroupByElementImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEGroupByElement()
         * @generated
         */
        EClass EGROUP_BY_ELEMENT = eINSTANCE.getEGroupByElement();

        /**
         * The meta object literal for the '<em><b>Group By Expressions</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EGROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS = eINSTANCE
            .getEGroupByElement_GroupByExpressions();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EJoinImpl <em>EJoin</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EJoinImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEJoin()
         * @generated
         */
        EClass EJOIN = eINSTANCE.getEJoin();

        /**
         * The meta object literal for the '<em><b>Outer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__OUTER = eINSTANCE.getEJoin_Outer();

        /**
         * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__RIGHT = eINSTANCE.getEJoin_Right();

        /**
         * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__LEFT = eINSTANCE.getEJoin_Left();

        /**
         * The meta object literal for the '<em><b>Natural</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__NATURAL = eINSTANCE.getEJoin_Natural();

        /**
         * The meta object literal for the '<em><b>Full</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__FULL = eINSTANCE.getEJoin_Full();

        /**
         * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__INNER = eINSTANCE.getEJoin_Inner();

        /**
         * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__SIMPLE = eINSTANCE.getEJoin_Simple();

        /**
         * The meta object literal for the '<em><b>Cross</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__CROSS = eINSTANCE.getEJoin_Cross();

        /**
         * The meta object literal for the '<em><b>Semi</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__SEMI = eINSTANCE.getEJoin_Semi();

        /**
         * The meta object literal for the '<em><b>Straight</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__STRAIGHT = eINSTANCE.getEJoin_Straight();

        /**
         * The meta object literal for the '<em><b>Apply</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EJOIN__APPLY = eINSTANCE.getEJoin_Apply();

        /**
         * The meta object literal for the '<em><b>Right Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EJOIN__RIGHT_ITEM = eINSTANCE.getEJoin_RightItem();

        /**
         * The meta object literal for the '<em><b>On Expression</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EJOIN__ON_EXPRESSION = eINSTANCE.getEJoin_OnExpression();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EAliasImpl <em>EAlias</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EAliasImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEAlias()
         * @generated
         */
        EClass EALIAS = eINSTANCE.getEAlias();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EALIAS__NAME = eINSTANCE.getEAlias_Name();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.EExpression <em>EExpression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.EExpression
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEExpression()
         * @generated
         */
        EClass EEXPRESSION = eINSTANCE.getEExpression();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EBinaryExpressionImpl <em>EBinary Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EBinaryExpressionImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEBinaryExpression()
         * @generated
         */
        EClass EBINARY_EXPRESSION = eINSTANCE.getEBinaryExpression();

        /**
         * The meta object literal for the '<em><b>Left Expression</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EBINARY_EXPRESSION__LEFT_EXPRESSION = eINSTANCE
            .getEBinaryExpression_LeftExpression();

        /**
         * The meta object literal for the '<em><b>Right Expression</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EBINARY_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE
            .getEBinaryExpression_RightExpression();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EAndExpressionImpl <em>EAnd Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EAndExpressionImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEAndExpression()
         * @generated
         */
        EClass EAND_EXPRESSION = eINSTANCE.getEAndExpression();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EOrExpressionImpl <em>EOr Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EOrExpressionImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEOrExpression()
         * @generated
         */
        EClass EOR_EXPRESSION = eINSTANCE.getEOrExpression();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EComparisonOperatorImpl <em>EComparison Operator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EComparisonOperatorImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEComparisonOperator()
         * @generated
         */
        EClass ECOMPARISON_OPERATOR = eINSTANCE.getEComparisonOperator();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ECOMPARISON_OPERATOR__OPERATOR = eINSTANCE
            .getEComparisonOperator_Operator();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EEqualsToImpl <em>EEquals To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EEqualsToImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEEqualsTo()
         * @generated
         */
        EClass EEQUALS_TO = eINSTANCE.getEEqualsTo();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EGreaterThanImpl <em>EGreater Than</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EGreaterThanImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEGreaterThan()
         * @generated
         */
        EClass EGREATER_THAN = eINSTANCE.getEGreaterThan();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EGreaterThanEqualsImpl <em>EGreater Than Equals</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EGreaterThanEqualsImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEGreaterThanEquals()
         * @generated
         */
        EClass EGREATER_THAN_EQUALS = eINSTANCE.getEGreaterThanEquals();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EMinorThanImpl <em>EMinor Than</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EMinorThanImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEMinorThan()
         * @generated
         */
        EClass EMINOR_THAN = eINSTANCE.getEMinorThan();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EMinorThanEqualsImpl <em>EMinor Than Equals</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EMinorThanEqualsImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEMinorThanEquals()
         * @generated
         */
        EClass EMINOR_THAN_EQUALS = eINSTANCE.getEMinorThanEquals();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.ENotEqualsToImpl <em>ENot Equals To</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.ENotEqualsToImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getENotEqualsTo()
         * @generated
         */
        EClass ENOT_EQUALS_TO = eINSTANCE.getENotEqualsTo();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.ESelectItem <em>ESelect Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.ESelectItem
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelectItem()
         * @generated
         */
        EClass ESELECT_ITEM = eINSTANCE.getESelectItem();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.EAllColumnsImpl <em>EAll Columns</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.EAllColumnsImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEAllColumns()
         * @generated
         */
        EClass EALL_COLUMNS = eINSTANCE.getEAllColumns();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.ESelectExpressionItemImpl <em>ESelect Expression Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.ESelectExpressionItemImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getESelectExpressionItem()
         * @generated
         */
        EClass ESELECT_EXPRESSION_ITEM = eINSTANCE.getESelectExpressionItem();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESELECT_EXPRESSION_ITEM__ALIAS = eINSTANCE
            .getESelectExpressionItem_Alias();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESELECT_EXPRESSION_ITEM__EXPRESSION = eINSTANCE
            .getESelectExpressionItem_Expression();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.EFromItem <em>EFrom Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.EFromItem
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getEFromItem()
         * @generated
         */
        EClass EFROM_ITEM = eINSTANCE.getEFromItem();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.ETableImpl <em>ETable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.ETableImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getETable()
         * @generated
         */
        EClass ETABLE = eINSTANCE.getETable();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ETABLE__ALIAS = eINSTANCE.getETable_Alias();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ETABLE__NAME = eINSTANCE.getETable_Name();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.ESubSelectImpl <em>ESub Select</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.ESubSelectImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getESubSelect()
         * @generated
         */
        EClass ESUB_SELECT = eINSTANCE.getESubSelect();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESUB_SELECT__ALIAS = eINSTANCE.getESubSelect_Alias();

        /**
         * The meta object literal for the '<em><b>Select Body</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESUB_SELECT__SELECT_BODY = eINSTANCE
            .getESubSelect_SelectBody();

        /**
         * The meta object literal for the '{@link org.vgu.se.sql.impl.ENotExpressionImpl <em>ENot Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.sql.impl.ENotExpressionImpl
         * @see org.vgu.se.sql.impl.SqlPackageImpl#getENotExpression()
         * @generated
         */
        EClass ENOT_EXPRESSION = eINSTANCE.getENotExpression();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENOT_EXPRESSION__EXPRESSION = eINSTANCE
            .getENotExpression_Expression();

    }

} //SqlPackage
