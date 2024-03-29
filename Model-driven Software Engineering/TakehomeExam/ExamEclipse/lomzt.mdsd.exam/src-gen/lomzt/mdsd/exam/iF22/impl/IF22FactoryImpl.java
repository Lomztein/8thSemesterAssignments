/**
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam.iF22.impl;

import lomzt.mdsd.exam.iF22.And;
import lomzt.mdsd.exam.iF22.Announce;
import lomzt.mdsd.exam.iF22.Binding;
import lomzt.mdsd.exam.iF22.BooleanFalse;
import lomzt.mdsd.exam.iF22.BooleanTrue;
import lomzt.mdsd.exam.iF22.Concat;
import lomzt.mdsd.exam.iF22.Div;
import lomzt.mdsd.exam.iF22.End;
import lomzt.mdsd.exam.iF22.EndingTarget;
import lomzt.mdsd.exam.iF22.Equals;
import lomzt.mdsd.exam.iF22.Expression;
import lomzt.mdsd.exam.iF22.ExternalCall;
import lomzt.mdsd.exam.iF22.ExternalImport;
import lomzt.mdsd.exam.iF22.Greater;
import lomzt.mdsd.exam.iF22.GreaterOrEquals;
import lomzt.mdsd.exam.iF22.IF22Factory;
import lomzt.mdsd.exam.iF22.IF22Package;
import lomzt.mdsd.exam.iF22.Lesser;
import lomzt.mdsd.exam.iF22.LesserOrEquals;
import lomzt.mdsd.exam.iF22.Location;
import lomzt.mdsd.exam.iF22.Minus;
import lomzt.mdsd.exam.iF22.Mult;
import lomzt.mdsd.exam.iF22.Not;
import lomzt.mdsd.exam.iF22.NotEquals;
import lomzt.mdsd.exam.iF22.NumberValue;
import lomzt.mdsd.exam.iF22.Or;
import lomzt.mdsd.exam.iF22.Parameter;
import lomzt.mdsd.exam.iF22.Parenthesis;
import lomzt.mdsd.exam.iF22.Plus;
import lomzt.mdsd.exam.iF22.Question;
import lomzt.mdsd.exam.iF22.Scenario;
import lomzt.mdsd.exam.iF22.Story;
import lomzt.mdsd.exam.iF22.StringValue;
import lomzt.mdsd.exam.iF22.Target;
import lomzt.mdsd.exam.iF22.Targetable;
import lomzt.mdsd.exam.iF22.Text;
import lomzt.mdsd.exam.iF22.This;
import lomzt.mdsd.exam.iF22.Type;
import lomzt.mdsd.exam.iF22.TypeValue;
import lomzt.mdsd.exam.iF22.VarBinding;
import lomzt.mdsd.exam.iF22.VariableUse;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IF22FactoryImpl extends EFactoryImpl implements IF22Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IF22Factory init()
  {
    try
    {
      IF22Factory theIF22Factory = (IF22Factory)EPackage.Registry.INSTANCE.getEFactory(IF22Package.eNS_URI);
      if (theIF22Factory != null)
      {
        return theIF22Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IF22FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IF22FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IF22Package.STORY: return createStory();
      case IF22Package.EXTERNAL_IMPORT: return createExternalImport();
      case IF22Package.TYPE: return createType();
      case IF22Package.SCENARIO: return createScenario();
      case IF22Package.PARAMETER: return createParameter();
      case IF22Package.LOCATION: return createLocation();
      case IF22Package.ANNOUNCE: return createAnnounce();
      case IF22Package.QUESTION: return createQuestion();
      case IF22Package.END: return createEnd();
      case IF22Package.TARGET: return createTarget();
      case IF22Package.TARGETABLE: return createTargetable();
      case IF22Package.ENDING_TARGET: return createEndingTarget();
      case IF22Package.EXPRESSION: return createExpression();
      case IF22Package.VAR_BINDING: return createVarBinding();
      case IF22Package.BINDING: return createBinding();
      case IF22Package.NUMBER: return createNumber();
      case IF22Package.BOOLEAN: return createBoolean();
      case IF22Package.TEXT: return createText();
      case IF22Package.AND: return createAnd();
      case IF22Package.OR: return createOr();
      case IF22Package.EQUALS: return createEquals();
      case IF22Package.NOT_EQUALS: return createNotEquals();
      case IF22Package.GREATER: return createGreater();
      case IF22Package.LESSER: return createLesser();
      case IF22Package.GREATER_OR_EQUALS: return createGreaterOrEquals();
      case IF22Package.LESSER_OR_EQUALS: return createLesserOrEquals();
      case IF22Package.CONCAT: return createConcat();
      case IF22Package.PLUS: return createPlus();
      case IF22Package.MINUS: return createMinus();
      case IF22Package.MULT: return createMult();
      case IF22Package.DIV: return createDiv();
      case IF22Package.TYPE_VALUE: return createTypeValue();
      case IF22Package.THIS: return createThis();
      case IF22Package.BOOLEAN_TRUE: return createBooleanTrue();
      case IF22Package.BOOLEAN_FALSE: return createBooleanFalse();
      case IF22Package.STRING_VALUE: return createStringValue();
      case IF22Package.NUMBER_VALUE: return createNumberValue();
      case IF22Package.VARIABLE_USE: return createVariableUse();
      case IF22Package.PARENTHESIS: return createParenthesis();
      case IF22Package.EXTERNAL_CALL: return createExternalCall();
      case IF22Package.NOT: return createNot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Story createStory()
  {
    StoryImpl story = new StoryImpl();
    return story;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalImport createExternalImport()
  {
    ExternalImportImpl externalImport = new ExternalImportImpl();
    return externalImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Announce createAnnounce()
  {
    AnnounceImpl announce = new AnnounceImpl();
    return announce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public End createEnd()
  {
    EndImpl end = new EndImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Targetable createTargetable()
  {
    TargetableImpl targetable = new TargetableImpl();
    return targetable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EndingTarget createEndingTarget()
  {
    EndingTargetImpl endingTarget = new EndingTargetImpl();
    return endingTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarBinding createVarBinding()
  {
    VarBindingImpl varBinding = new VarBindingImpl();
    return varBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public lomzt.mdsd.exam.iF22.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public lomzt.mdsd.exam.iF22.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotEquals createNotEquals()
  {
    NotEqualsImpl notEquals = new NotEqualsImpl();
    return notEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Greater createGreater()
  {
    GreaterImpl greater = new GreaterImpl();
    return greater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lesser createLesser()
  {
    LesserImpl lesser = new LesserImpl();
    return lesser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterOrEquals createGreaterOrEquals()
  {
    GreaterOrEqualsImpl greaterOrEquals = new GreaterOrEqualsImpl();
    return greaterOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LesserOrEquals createLesserOrEquals()
  {
    LesserOrEqualsImpl lesserOrEquals = new LesserOrEqualsImpl();
    return lesserOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Concat createConcat()
  {
    ConcatImpl concat = new ConcatImpl();
    return concat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeValue createTypeValue()
  {
    TypeValueImpl typeValue = new TypeValueImpl();
    return typeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanTrue createBooleanTrue()
  {
    BooleanTrueImpl booleanTrue = new BooleanTrueImpl();
    return booleanTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanFalse createBooleanFalse()
  {
    BooleanFalseImpl booleanFalse = new BooleanFalseImpl();
    return booleanFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberValue createNumberValue()
  {
    NumberValueImpl numberValue = new NumberValueImpl();
    return numberValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableUse createVariableUse()
  {
    VariableUseImpl variableUse = new VariableUseImpl();
    return variableUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalCall createExternalCall()
  {
    ExternalCallImpl externalCall = new ExternalCallImpl();
    return externalCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IF22Package getIF22Package()
  {
    return (IF22Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IF22Package getPackage()
  {
    return IF22Package.eINSTANCE;
  }

} //IF22FactoryImpl
