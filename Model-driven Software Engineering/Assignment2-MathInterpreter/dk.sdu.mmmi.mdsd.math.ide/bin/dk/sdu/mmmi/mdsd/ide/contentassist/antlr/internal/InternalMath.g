/*
 * generated by Xtext 2.26.0
 */
grammar InternalMath;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;

}
@parser::members {
	private MathGrammarAccess grammarAccess;

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getGroup()); }
		(rule__Exp__Group__0)
		{ after(grammarAccess.getExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpOp
entryRuleExpOp
:
{ before(grammarAccess.getExpOpRule()); }
	 ruleExpOp
{ after(grammarAccess.getExpOpRule()); } 
	 EOF 
;

// Rule ExpOp
ruleExpOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpOpAccess().getAlternatives()); }
		(rule__ExpOp__Alternatives)
		{ after(grammarAccess.getExpOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_0()); }
		(rule__ExpOp__Group_0__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_1()); }
		(rule__ExpOp__Group_1__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_2()); }
		(rule__ExpOp__Group_2__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_3()); }
		(rule__ExpOp__Group_3__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_0()); }
		(rule__Primary__Group_0__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_1()); }
		(rule__Primary__Group_1__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_2()); }
		(rule__Primary__Group_2__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getMathExpAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getNameAssignment_1()); }
	(rule__MathExp__NameAssignment_1)
	{ after(grammarAccess.getMathExpAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
	rule__MathExp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
	(rule__MathExp__ExpAssignment_3)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__0__Impl
	rule__Exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getLeftAssignment_0()); }
	(rule__Exp__LeftAssignment_0)
	{ after(grammarAccess.getExpAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getGroup_1()); }
	(rule__Exp__Group_1__0)?
	{ after(grammarAccess.getExpAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1__0__Impl
	rule__Exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); }
	(rule__Exp__OperatorAssignment_1_0)
	{ after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getRightAssignment_1_1()); }
	(rule__Exp__RightAssignment_1_1)
	{ after(grammarAccess.getExpAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_0__0__Impl
	rule__ExpOp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getPlusAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); }
	'+'
	{ after(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_1__0__Impl
	rule__ExpOp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getMinusAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); }
	'-'
	{ after(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_2__0__Impl
	rule__ExpOp__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getMultAction_2_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getMultAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); }
	'*'
	{ after(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_3__0__Impl
	rule__ExpOp__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getDivAction_3_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getDivAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); }
	'/'
	{ after(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__0__Impl
	rule__Primary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getParenthesisAction_0_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getParenthesisAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__1__Impl
	rule__Primary__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__2__Impl
	rule__Primary__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpAssignment_0_2()); }
	(rule__Primary__ExpAssignment_0_2)
	{ after(grammarAccess.getPrimaryAccess().getExpAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__0__Impl
	rule__Primary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getNumberAction_1_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getNumberAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); }
	(rule__Primary__ValueAssignment_1_1)
	{ after(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__0__Impl
	rule__Primary__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getVariableUseAction_2_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getVariableUseAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRefAssignment_2_1()); }
	(rule__Primary__RefAssignment_2_1)
	{ after(grammarAccess.getPrimaryAccess().getRefAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__ExpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); }
		rulePrimary
		{ after(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__OperatorAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); }
		ruleExpOp
		{ after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); }
		ruleExp
		{ after(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ExpAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_0_2_0()); }
		ruleExp
		{ after(grammarAccess.getPrimaryAccess().getExpExpParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__RefAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getRefMathExpCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getPrimaryAccess().getRefMathExpIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPrimaryAccess().getRefMathExpIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getPrimaryAccess().getRefMathExpCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
