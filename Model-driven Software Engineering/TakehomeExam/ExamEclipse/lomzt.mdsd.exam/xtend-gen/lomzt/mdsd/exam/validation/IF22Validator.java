/**
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.function.Predicate;
import lomzt.mdsd.exam.Utilities;
import lomzt.mdsd.exam.iF22.End;
import lomzt.mdsd.exam.iF22.EndingTarget;
import lomzt.mdsd.exam.iF22.Expression;
import lomzt.mdsd.exam.iF22.ExternalCall;
import lomzt.mdsd.exam.iF22.ExternalImport;
import lomzt.mdsd.exam.iF22.IF22Package;
import lomzt.mdsd.exam.iF22.Location;
import lomzt.mdsd.exam.iF22.Question;
import lomzt.mdsd.exam.iF22.Scenario;
import lomzt.mdsd.exam.iF22.Story;
import lomzt.mdsd.exam.iF22.Target;
import lomzt.mdsd.exam.iF22.Targetable;
import lomzt.mdsd.exam.iF22.This;
import lomzt.mdsd.exam.iF22.TypeValue;
import lomzt.mdsd.exam.iF22.VarBinding;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class IF22Validator extends AbstractIF22Validator {
  @Check
  public void checkScenarioNameUnique(final Scenario scenario) {
    final Story parent = Utilities.<Story>getParentOfType(scenario, Story.class);
    EList<Scenario> _scenarios = parent.getScenarios();
    for (final Scenario os : _scenarios) {
      if (((!Objects.equal(os, scenario)) && Objects.equal(os.getName(), scenario.getName()))) {
        this.error("Two scenarios may not have the same name.", IF22Package.Literals.TARGETABLE__NAME);
      }
    }
  }
  
  @Check
  public void checkFunctionNameUnique(final ExternalImport ei) {
    final Story parent = Utilities.<Story>getParentOfType(ei, Story.class);
    EList<ExternalImport> _imports = parent.getImports();
    for (final ExternalImport oi : _imports) {
      if (((!Objects.equal(oi, ei)) && Objects.equal(oi.getName(), ei.getName()))) {
        this.error("Two imports may not have the same name.", IF22Package.Literals.EXTERNAL_IMPORT__NAME);
      }
    }
  }
  
  @Check
  public void checkLocationNameUnique(final Location location) {
    final Scenario parent = Utilities.<Scenario>getParentOfType(location, Scenario.class);
    EList<Location> _locations = parent.getLocations();
    for (final Location otherLocation : _locations) {
      if (((!Objects.equal(otherLocation, location)) && Objects.equal(otherLocation.getName(), location.getName()))) {
        this.error("Two locations may not have the same name.", IF22Package.Literals.TARGETABLE__NAME);
      }
    }
  }
  
  @Check
  public void ensureAtLeastOneEndStatement(final Scenario scenario) {
    final Predicate<Location> _function = (Location x) -> {
      return (x instanceof End);
    };
    final long count = scenario.getLocations().stream().filter(_function).count();
    if ((count < 1)) {
      this.error("Must have at least one end statement.", IF22Package.Literals.SCENARIO__LOCATIONS);
    }
  }
  
  @Check
  public void ensureTypeComparisonOnlyInInputValidation(final TypeValue exp) {
    final Question question = Utilities.<Question>getParentOfType(exp, Question.class);
    final ArrayList<TypeValue> children = Utilities.<TypeValue>getChildrenOfType(question.getValidate(), TypeValue.class);
    boolean _contains = children.contains(exp);
    boolean _not = (!_contains);
    if (_not) {
      this.error("Type decleration is only valid within the context of input validation", IF22Package.Literals.TYPE_VALUE__TYPE);
    }
  }
  
  @Check
  public void ensureOnlyOneTypeInInputValidation(final Question question) {
    final int children = Utilities.<TypeValue>getChildrenOfType(question.getValidate(), TypeValue.class).size();
    if ((children != 1)) {
      this.error("Must have only a single type declaration in input validation.", IF22Package.Literals.QUESTION__VALIDATE);
    }
  }
  
  @Check
  public void ensureThisOnlyInTargetExpressions(final This obj) {
    final Target hasTargetParent = Utilities.<Target>getParentOfType(obj, Target.class);
    boolean _equals = Objects.equal(hasTargetParent, Boolean.valueOf(false));
    if (_equals) {
      this.error("\'this\' keyword can only be used within the context of a target.", IF22Package.Literals.TARGET__CONDITION);
    }
  }
  
  @Check
  public void ensureOnKeywordsOnlyWithExternalScenario(final EndingTarget endingTarget) {
    final Target target = Utilities.<Target>getParentOfType(endingTarget, Target.class);
    Targetable _target = target.getTarget();
    boolean _not = (!(_target instanceof Scenario));
    if (_not) {
      this.error("\'on\' keyword only applicable when moving to another scenario.", IF22Package.Literals.ENDING_TARGET__FROM);
    }
  }
  
  @Check
  public void ensureFunctionArgsMatchSignature(final ExternalCall call) {
    final ExternalImport ip = call.getFunc();
    int _size = call.getFunc().getParams().size();
    int _size_1 = call.getArgs().size();
    boolean _notEquals = (_size != _size_1);
    if (_notEquals) {
      this.error("Number of arguments does not match number of parameters.", IF22Package.Literals.TARGET__ARGS);
    }
    for (int i = 0; (i < ip.getParams().size()); i++) {
      {
        final CharSequence expType = Utilities.getExpressionOutputType(call.getArgs().get(i));
        final String paramType = Utilities.typeToJavaType(ip.getParams().get(i));
        boolean _equals = expType.equals(paramType);
        boolean _not = (!_equals);
        if (_not) {
          this.error("Arguments does not match function signature.", IF22Package.Literals.EXTERNAL_CALL__ARGS);
        }
      }
    }
  }
  
  @Check
  public void ensureScenarioArgsMatchSignature(final Target target) {
    Targetable _target = target.getTarget();
    if ((_target instanceof Scenario)) {
      Targetable _target_1 = target.getTarget();
      final Scenario scenario = ((Scenario) _target_1);
      int _size = scenario.getParams().size();
      int _size_1 = target.getArgs().size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        this.error("Number of arguments does not match number of parameters.", IF22Package.Literals.TARGET__ARGS);
      }
      for (int i = 0; (i < scenario.getParams().size()); i++) {
        {
          final CharSequence expType = Utilities.getExpressionOutputType(target.getArgs().get(i));
          final String paramType = Utilities.typeToJavaType(scenario.getParams().get(i).getType());
          boolean _equals = expType.equals(paramType);
          boolean _not = (!_equals);
          if (_not) {
            this.error("Arguments does not match scenario signature.", IF22Package.Literals.TARGET__ARGS);
          }
        }
      }
    }
  }
  
  @Check
  public void ensureQuestionInputMatchVariableType(final Question question) {
    VarBinding _binding = question.getBinding();
    boolean _notEquals = (!Objects.equal(_binding, null));
    if (_notEquals) {
      final String questionInputType = Utilities.inputType(question);
      final String bindingType = Utilities.typeToJavaType(question.getBinding().getType());
      if ((questionInputType != bindingType)) {
        this.error((((("Cannot assign input of type " + questionInputType) + " to binding of type ") + bindingType) + "."), IF22Package.Literals.QUESTION__BINDING);
      }
    }
  }
  
  @Check
  public void ensureValidationExpressionReturnBoolean(final Question question) {
    Expression _validate = question.getValidate();
    boolean _not = (!(_validate instanceof TypeValue));
    if (_not) {
      CharSequence _expressionOutputType = Utilities.getExpressionOutputType(question.getValidate());
      boolean _notEquals = (!Objects.equal(_expressionOutputType, "boolean"));
      if (_notEquals) {
        this.error("Only boolean expressions are valid in input validation.", IF22Package.Literals.QUESTION__VALIDATE);
      }
    }
  }
  
  @Check
  public void ensureTargetConditionReturnBoolean(final Target target) {
    Expression _condition = target.getCondition();
    boolean _tripleNotEquals = (_condition != null);
    if (_tripleNotEquals) {
      CharSequence _expressionOutputType = Utilities.getExpressionOutputType(target.getCondition());
      boolean _notEquals = (!Objects.equal(_expressionOutputType, "boolean"));
      if (_notEquals) {
        this.error("Only boolean expressions are valid in the transition condition.", IF22Package.Literals.TARGET__CONDITION);
      }
    }
  }
}