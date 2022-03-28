/*
 * generated by Xtext 2.25.0
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
		(
			{ before(grammarAccess.getMathExpAccess().getAssignmentsAssignment()); }
			(rule__MathExp__AssignmentsAssignment)
			{ after(grammarAccess.getMathExpAccess().getAssignmentsAssignment()); }
		)
		(
			{ before(grammarAccess.getMathExpAccess().getAssignmentsAssignment()); }
			(rule__MathExp__AssignmentsAssignment)*
			{ after(grammarAccess.getMathExpAccess().getAssignmentsAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignment
entryRuleAssignment
:
{ before(grammarAccess.getAssignmentRule()); }
	 ruleAssignment
{ after(grammarAccess.getAssignmentRule()); } 
	 EOF 
;

// Rule Assignment
ruleAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignmentAccess().getGroup()); }
		(rule__Assignment__Group__0)
		{ after(grammarAccess.getAssignmentAccess().getGroup()); }
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

// Entry rule entryRuleLitteral
entryRuleLitteral
:
{ before(grammarAccess.getLitteralRule()); }
	 ruleLitteral
{ after(grammarAccess.getLitteralRule()); } 
	 EOF 
;

// Rule Litteral
ruleLitteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLitteralAccess().getValueAssignment()); }
		(rule__Litteral__ValueAssignment)
		{ after(grammarAccess.getLitteralAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesis
entryRuleParenthesis
:
{ before(grammarAccess.getParenthesisRule()); }
	 ruleParenthesis
{ after(grammarAccess.getParenthesisRule()); } 
	 EOF 
;

// Rule Parenthesis
ruleParenthesis 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesisAccess().getGroup()); }
		(rule__Parenthesis__Group__0)
		{ after(grammarAccess.getParenthesisAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariableUse
entryRuleVariableUse
:
{ before(grammarAccess.getVariableUseRule()); }
	 ruleVariableUse
{ after(grammarAccess.getVariableUseRule()); } 
	 EOF 
;

// Rule VariableUse
ruleVariableUse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableUseAccess().getRefAssignment()); }
		(rule__VariableUse__RefAssignment)
		{ after(grammarAccess.getVariableUseAccess().getRefAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLetEnd
entryRuleLetEnd
:
{ before(grammarAccess.getLetEndRule()); }
	 ruleLetEnd
{ after(grammarAccess.getLetEndRule()); } 
	 EOF 
;

// Rule LetEnd
ruleLetEnd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLetEndAccess().getGroup()); }
		(rule__LetEnd__Group__0)
		{ after(grammarAccess.getLetEndAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIn
entryRuleIn
:
{ before(grammarAccess.getInRule()); }
	 ruleIn
{ after(grammarAccess.getInRule()); } 
	 EOF 
;

// Rule In
ruleIn 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInAccess().getGroup()); }
		(rule__In__Group__0)
		{ after(grammarAccess.getInAccess().getGroup()); }
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
		{ before(grammarAccess.getPrimaryAccess().getLitteralParserRuleCall_0()); }
		ruleLitteral
		{ after(grammarAccess.getPrimaryAccess().getLitteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
		ruleParenthesis
		{ after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); }
		ruleVariableUse
		{ after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getLetEndParserRuleCall_3()); }
		ruleLetEnd
		{ after(grammarAccess.getPrimaryAccess().getLetEndParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__0__Impl
	rule__Assignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getAssignmentAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__1__Impl
	rule__Assignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getNameAssignment_1()); }
	(rule__Assignment__NameAssignment_1)
	{ after(grammarAccess.getAssignmentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__2__Impl
	rule__Assignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getExpAssignment_3()); }
	(rule__Assignment__ExpAssignment_3)
	{ after(grammarAccess.getAssignmentAccess().getExpAssignment_3()); }
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


rule__Parenthesis__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__0__Impl
	rule__Parenthesis__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__1__Impl
	rule__Parenthesis__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); }
	(rule__Parenthesis__ExpAssignment_1)
	{ after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LetEnd__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetEnd__Group__0__Impl
	rule__LetEnd__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetEndAccess().getLetKeyword_0()); }
	'let'
	{ after(grammarAccess.getLetEndAccess().getLetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetEnd__Group__1__Impl
	rule__LetEnd__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetEndAccess().getNameAssignment_1()); }
	(rule__LetEnd__NameAssignment_1)
	{ after(grammarAccess.getLetEndAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetEnd__Group__2__Impl
	rule__LetEnd__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetEndAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getLetEndAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetEnd__Group__3__Impl
	rule__LetEnd__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetEndAccess().getExpAssignment_3()); }
	(rule__LetEnd__ExpAssignment_3)
	{ after(grammarAccess.getLetEndAccess().getExpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetEnd__Group__4__Impl
	rule__LetEnd__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetEndAccess().getInAssignment_4()); }
	(rule__LetEnd__InAssignment_4)
	{ after(grammarAccess.getLetEndAccess().getInAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetEnd__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetEndAccess().getEndKeyword_5()); }
	'end'
	{ after(grammarAccess.getLetEndAccess().getEndKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__In__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__In__Group__0__Impl
	rule__In__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__In__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInAccess().getInKeyword_0()); }
	'in'
	{ after(grammarAccess.getInAccess().getInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__In__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__In__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__In__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInAccess().getExpAssignment_1()); }
	(rule__In__ExpAssignment_1)
	{ after(grammarAccess.getInAccess().getExpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__AssignmentsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getAssignmentsAssignmentParserRuleCall_0()); }
		ruleAssignment
		{ after(grammarAccess.getMathExpAccess().getAssignmentsAssignmentParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__ExpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_3_0()); }
		ruleExp
		{ after(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_3_0()); }
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

rule__Litteral__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLitteralAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getLitteralAccess().getValueINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__ExpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); }
		ruleExp
		{ after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__RefAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableUseAccess().getRefAssignmentCrossReference_0()); }
		(
			{ before(grammarAccess.getVariableUseAccess().getRefAssignmentIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVariableUseAccess().getRefAssignmentIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getVariableUseAccess().getRefAssignmentCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetEndAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLetEndAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__ExpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetEndAccess().getExpExpParserRuleCall_3_0()); }
		ruleExp
		{ after(grammarAccess.getLetEndAccess().getExpExpParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetEnd__InAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetEndAccess().getInInParserRuleCall_4_0()); }
		ruleIn
		{ after(grammarAccess.getLetEndAccess().getInInParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__In__ExpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInAccess().getExpExpParserRuleCall_1_0()); }
		ruleExp
		{ after(grammarAccess.getInAccess().getExpExpParserRuleCall_1_0()); }
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
