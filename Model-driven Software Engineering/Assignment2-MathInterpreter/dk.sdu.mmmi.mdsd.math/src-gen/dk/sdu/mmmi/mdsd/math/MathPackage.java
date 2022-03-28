/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.mdsd.math.MathFactory
 * @model kind="package"
 * @generated
 */
public interface MathPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "math";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/mdsd/Math";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "math";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathPackage eINSTANCE = dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
   * @generated
   */
  int MATH_EXP = 0;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__ASSIGNMENTS = 0;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.AssignmentImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXP = 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ExpImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExp()
   * @generated
   */
  int EXP = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpOpImpl <em>Exp Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ExpOpImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpOp()
   * @generated
   */
  int EXP_OP = 3;

  /**
   * The number of structural features of the '<em>Exp Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.PrimaryImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 4;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.LitteralImpl <em>Litteral</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.LitteralImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLitteral()
   * @generated
   */
  int LITTERAL = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITTERAL__VALUE = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Litteral</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITTERAL_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getParenthesis()
   * @generated
   */
  int PARENTHESIS = 6;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS__EXP = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
   * @generated
   */
  int VARIABLE_USE = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE__REF = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_USE_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetEndImpl <em>Let End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.LetEndImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetEnd()
   * @generated
   */
  int LET_END = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_END__NAME = PRIMARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_END__EXP = PRIMARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_END__IN = PRIMARY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Let End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_END_FEATURE_COUNT = PRIMARY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.InImpl <em>In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.InImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getIn()
   * @generated
   */
  int IN = 9;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN__EXP = 0;

  /**
   * The number of structural features of the '<em>In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.PlusImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 10;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXP_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MinusImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 11;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXP_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.MultImpl <em>Mult</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.MultImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMult()
   * @generated
   */
  int MULT = 12;

  /**
   * The number of structural features of the '<em>Mult</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_FEATURE_COUNT = EXP_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.math.impl.DivImpl
   * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDiv()
   * @generated
   */
  int DIV = 13;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXP_OP_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.MathExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp
   * @generated
   */
  EClass getMathExp();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.math.MathExp#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see dk.sdu.mmmi.mdsd.math.MathExp#getAssignments()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_Assignments();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Assignment#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Assignment#getExp()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Exp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Exp#getLeft()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Exp#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Exp#getOperator()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Operator();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Exp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Exp#getRight()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.ExpOp <em>Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Op</em>'.
   * @see dk.sdu.mmmi.mdsd.math.ExpOp
   * @generated
   */
  EClass getExpOp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Litteral <em>Litteral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Litteral</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Litteral
   * @generated
   */
  EClass getLitteral();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.Litteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Litteral#getValue()
   * @see #getLitteral()
   * @generated
   */
  EAttribute getLitteral_Value();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Parenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Parenthesis
   * @generated
   */
  EClass getParenthesis();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.Parenthesis#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Parenthesis#getExp()
   * @see #getParenthesis()
   * @generated
   */
  EReference getParenthesis_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.VariableUse <em>Variable Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Use</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse
   * @generated
   */
  EClass getVariableUse();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.mdsd.math.VariableUse#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see dk.sdu.mmmi.mdsd.math.VariableUse#getRef()
   * @see #getVariableUse()
   * @generated
   */
  EReference getVariableUse_Ref();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.LetEnd <em>Let End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Let End</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetEnd
   * @generated
   */
  EClass getLetEnd();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.math.LetEnd#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetEnd#getName()
   * @see #getLetEnd()
   * @generated
   */
  EAttribute getLetEnd_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.LetEnd#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetEnd#getExp()
   * @see #getLetEnd()
   * @generated
   */
  EReference getLetEnd_Exp();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.LetEnd#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see dk.sdu.mmmi.mdsd.math.LetEnd#getIn()
   * @see #getLetEnd()
   * @generated
   */
  EReference getLetEnd_In();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.In <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In</em>'.
   * @see dk.sdu.mmmi.mdsd.math.In
   * @generated
   */
  EClass getIn();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.math.In#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.math.In#getExp()
   * @see #getIn()
   * @generated
   */
  EReference getIn_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Mult
   * @generated
   */
  EClass getMult();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.math.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see dk.sdu.mmmi.mdsd.math.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MathFactory getMathFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MathExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MathExpImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMathExp()
     * @generated
     */
    EClass MATH_EXP = eINSTANCE.getMathExp();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__ASSIGNMENTS = eINSTANCE.getMathExp_Assignments();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.AssignmentImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXP = eINSTANCE.getAssignment_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ExpImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__LEFT = eINSTANCE.getExp_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__OPERATOR = eINSTANCE.getExp_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__RIGHT = eINSTANCE.getExp_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ExpOpImpl <em>Exp Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ExpOpImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getExpOp()
     * @generated
     */
    EClass EXP_OP = eINSTANCE.getExpOp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.PrimaryImpl <em>Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.PrimaryImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPrimary()
     * @generated
     */
    EClass PRIMARY = eINSTANCE.getPrimary();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.LitteralImpl <em>Litteral</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.LitteralImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLitteral()
     * @generated
     */
    EClass LITTERAL = eINSTANCE.getLitteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITTERAL__VALUE = eINSTANCE.getLitteral_Value();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.ParenthesisImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getParenthesis()
     * @generated
     */
    EClass PARENTHESIS = eINSTANCE.getParenthesis();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS__EXP = eINSTANCE.getParenthesis_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl <em>Variable Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.VariableUseImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getVariableUse()
     * @generated
     */
    EClass VARIABLE_USE = eINSTANCE.getVariableUse();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_USE__REF = eINSTANCE.getVariableUse_Ref();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.LetEndImpl <em>Let End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.LetEndImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getLetEnd()
     * @generated
     */
    EClass LET_END = eINSTANCE.getLetEnd();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LET_END__NAME = eINSTANCE.getLetEnd_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_END__EXP = eINSTANCE.getLetEnd_Exp();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LET_END__IN = eINSTANCE.getLetEnd_In();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.InImpl <em>In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.InImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getIn()
     * @generated
     */
    EClass IN = eINSTANCE.getIn();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN__EXP = eINSTANCE.getIn_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.PlusImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MinusImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.MultImpl <em>Mult</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.MultImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getMult()
     * @generated
     */
    EClass MULT = eINSTANCE.getMult();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.math.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.math.impl.DivImpl
     * @see dk.sdu.mmmi.mdsd.math.impl.MathPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

  }

} //MathPackage
