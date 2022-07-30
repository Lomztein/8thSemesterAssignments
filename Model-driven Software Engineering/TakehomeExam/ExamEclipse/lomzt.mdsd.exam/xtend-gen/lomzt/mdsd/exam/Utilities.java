package lomzt.mdsd.exam;

import java.util.ArrayList;
import java.util.List;
import lomzt.mdsd.exam.iF22.And;
import lomzt.mdsd.exam.iF22.Binding;
import lomzt.mdsd.exam.iF22.BooleanFalse;
import lomzt.mdsd.exam.iF22.BooleanTrue;
import lomzt.mdsd.exam.iF22.Concat;
import lomzt.mdsd.exam.iF22.Div;
import lomzt.mdsd.exam.iF22.Equals;
import lomzt.mdsd.exam.iF22.Expression;
import lomzt.mdsd.exam.iF22.ExternalCall;
import lomzt.mdsd.exam.iF22.Greater;
import lomzt.mdsd.exam.iF22.GreaterOrEquals;
import lomzt.mdsd.exam.iF22.Lesser;
import lomzt.mdsd.exam.iF22.LesserOrEquals;
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
import lomzt.mdsd.exam.iF22.StringValue;
import lomzt.mdsd.exam.iF22.Text;
import lomzt.mdsd.exam.iF22.This;
import lomzt.mdsd.exam.iF22.Type;
import lomzt.mdsd.exam.iF22.TypeValue;
import lomzt.mdsd.exam.iF22.VarBinding;
import lomzt.mdsd.exam.iF22.VariableUse;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class Utilities {
  public static <T extends Object> T getParentOfType(final EObject obj, final Class<T> clazz) {
    EObject cur = obj;
    while ((cur.eContainer() != null)) {
      {
        cur = cur.eContainer();
        boolean _isInstance = clazz.isInstance(cur);
        if (_isInstance) {
          return ((T) cur);
        }
      }
    }
    return null;
  }
  
  public static <T extends Object> ArrayList<T> getChildrenOfType(final EObject obj, final Class<T> clazz) {
    final ArrayList<T> list = new ArrayList<T>();
    boolean _isInstance = clazz.isInstance(obj);
    if (_isInstance) {
      list.add(((T) obj));
    }
    Utilities.<T>getChildrenOfTypeRecursive(obj, clazz, list);
    return list;
  }
  
  public static <T extends Object> void getChildrenOfTypeRecursive(final EObject obj, final Class<T> clazz, final List<T> list) {
    EList<EObject> _eContents = obj.eContents();
    for (final EObject child : _eContents) {
      {
        boolean _isInstance = clazz.isInstance(child);
        if (_isInstance) {
          list.add(((T) child));
        }
        Utilities.<T>getChildrenOfTypeRecursive(child, clazz, list);
      }
    }
  }
  
  public static CharSequence getExpressionOutputType(final Expression exp) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (exp instanceof And) {
      _matched=true;
      _switchResult = "boolean";
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof Equals) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof NotEquals) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof Greater) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof Lesser) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof GreaterOrEquals) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof LesserOrEquals) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof Concat) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (exp instanceof Plus) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (exp instanceof TypeValue) {
        _matched=true;
        _switchResult = Utilities.typeToJavaType(((TypeValue)exp).getType());
      }
    }
    if (!_matched) {
      if (exp instanceof This) {
        _matched=true;
        _switchResult = Utilities.inputType(Utilities.<Question>getParentOfType(exp, Question.class));
      }
    }
    if (!_matched) {
      if (exp instanceof BooleanTrue) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof BooleanFalse) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (exp instanceof StringValue) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (exp instanceof NumberValue) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (exp instanceof VariableUse) {
        _matched=true;
        String _switchResult_1 = null;
        Binding _ref = ((VariableUse)exp).getRef();
        boolean _matched_1 = false;
        if (_ref instanceof VarBinding) {
          _matched_1=true;
          Binding _ref_1 = ((VariableUse)exp).getRef();
          _switchResult_1 = Utilities.typeToJavaType(((VarBinding) _ref_1).getType());
        }
        if (!_matched_1) {
          if (_ref instanceof Parameter) {
            _matched_1=true;
            Binding _ref_1 = ((VariableUse)exp).getRef();
            _switchResult_1 = Utilities.typeToJavaType(((Parameter) _ref_1).getType());
          }
        }
        _switchResult = _switchResult_1;
      }
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        _switchResult = Utilities.getExpressionOutputType(((Parenthesis)exp).getExp());
      }
    }
    if (!_matched) {
      if (exp instanceof ExternalCall) {
        _matched=true;
        _switchResult = Utilities.typeToJavaType(((ExternalCall)exp).getFunc().getReturnType());
      }
    }
    if (!_matched) {
      if (exp instanceof Not) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    return _switchResult;
  }
  
  public static String typeToJavaType(final Type type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof lomzt.mdsd.exam.iF22.Number) {
      _matched=true;
      _switchResult = "int";
    }
    if (!_matched) {
      if (type instanceof lomzt.mdsd.exam.iF22.Boolean) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (type instanceof Text) {
        _matched=true;
        _switchResult = "String";
      }
    }
    return _switchResult;
  }
  
  public static String inputType(final Question question) {
    String _xblockexpression = null;
    {
      final Type child = Utilities.<Type>getChildrenOfType(question.getValidate(), Type.class).get(0);
      String _switchResult = null;
      boolean _matched = false;
      if (child instanceof lomzt.mdsd.exam.iF22.Number) {
        _matched=true;
        _switchResult = "int";
      }
      if (!_matched) {
        if (child instanceof lomzt.mdsd.exam.iF22.Boolean) {
          _matched=true;
          _switchResult = "boolean";
        }
      }
      if (!_matched) {
        if (child instanceof Text) {
          _matched=true;
          _switchResult = "String";
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
