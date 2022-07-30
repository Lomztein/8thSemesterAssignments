
package lomzt.mdsd.exam

import java.util.ArrayList
import java.util.List
import lomzt.mdsd.exam.iF22.And
import lomzt.mdsd.exam.iF22.BooleanFalse
import lomzt.mdsd.exam.iF22.BooleanTrue
import lomzt.mdsd.exam.iF22.Concat
import lomzt.mdsd.exam.iF22.Div
import lomzt.mdsd.exam.iF22.Equals
import lomzt.mdsd.exam.iF22.Expression
import lomzt.mdsd.exam.iF22.ExternalCall
import lomzt.mdsd.exam.iF22.Greater
import lomzt.mdsd.exam.iF22.GreaterOrEquals
import lomzt.mdsd.exam.iF22.Lesser
import lomzt.mdsd.exam.iF22.LesserOrEquals
import lomzt.mdsd.exam.iF22.Minus
import lomzt.mdsd.exam.iF22.Mult
import lomzt.mdsd.exam.iF22.Not
import lomzt.mdsd.exam.iF22.NotEquals
import lomzt.mdsd.exam.iF22.NumberValue
import lomzt.mdsd.exam.iF22.Or
import lomzt.mdsd.exam.iF22.Parameter
import lomzt.mdsd.exam.iF22.Parenthesis
import lomzt.mdsd.exam.iF22.Plus
import lomzt.mdsd.exam.iF22.Question
import lomzt.mdsd.exam.iF22.StringValue
import lomzt.mdsd.exam.iF22.This
import lomzt.mdsd.exam.iF22.Type
import lomzt.mdsd.exam.iF22.VarBinding
import lomzt.mdsd.exam.iF22.VariableUse
import org.eclipse.emf.ecore.EObject
import lomzt.mdsd.exam.iF22.Text
import lomzt.mdsd.exam.iF22.TypeValue

class Utilities {
	
	// Adapted from semester project
	def static <T> getParentOfType (EObject obj, Class<T> clazz) {
		var cur = obj;
		while (cur.eContainer !== null) {
			cur = cur.eContainer;
			if (clazz.isInstance(cur)) {
				return cur as T;
			}
		}
		return null
	}
	
	def static <T> getChildrenOfType (EObject obj, Class<T> clazz) {
		val list = new ArrayList<T>()
		if (clazz.isInstance(obj)) {
			list.add(obj as T);
		}
		getChildrenOfTypeRecursive(obj, clazz, list)
		return list
	}
	
	def static <T> void getChildrenOfTypeRecursive(EObject obj, Class<T> clazz, List<T> list) {
		for (child : obj.eContents) {
			if (clazz.isInstance(child)) {
				list.add(child as T)
			}
			getChildrenOfTypeRecursive(child, clazz, list)
		}
	}

	def static CharSequence getExpressionOutputType(Expression exp) {
		switch (exp) {
			And: 'boolean'
			Or: 'boolean'
			Equals: 'boolean'
			NotEquals: 'boolean'
			Greater: 'boolean'
			Lesser: 'boolean'
			GreaterOrEquals: 'boolean'
			LesserOrEquals: 'boolean'
			Concat: 'String'
			Plus: 'int'
			Minus: 'int'
			Mult: 'int'
			Div: 'int'
			TypeValue: exp.type.typeToJavaType
			This: getParentOfType(exp, typeof(Question)).inputType
			BooleanTrue: 'boolean'
			BooleanFalse: 'boolean'
			StringValue: 'String'
			NumberValue: 'int'
			VariableUse: switch (exp.ref) {
				VarBinding: (exp.ref as VarBinding).type.typeToJavaType
				Parameter: (exp.ref as Parameter).type.typeToJavaType
			}
			Parenthesis: exp.exp.getExpressionOutputType
			ExternalCall: exp.func.returnType.typeToJavaType
			Not: 'boolean'
		}
	}
	
	static def typeToJavaType(Type type) {
		switch (type) {
			lomzt.mdsd.exam.iF22.Number: 'int'
			lomzt.mdsd.exam.iF22.Boolean: 'boolean'
			Text: 'String'
		}
	}
	
	static def inputType (Question question) {
		val child = getChildrenOfType(question.validate, typeof(Type)).get(0);
		switch (child) {
			lomzt.mdsd.exam.iF22.Number: 'int'
			lomzt.mdsd.exam.iF22.Boolean: 'boolean'
			Text: 'String'
		}
	}
}