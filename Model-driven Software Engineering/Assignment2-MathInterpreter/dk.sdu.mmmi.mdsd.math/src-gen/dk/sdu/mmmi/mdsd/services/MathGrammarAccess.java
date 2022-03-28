/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Assignment cAssignmentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAssignmentsAssignmentParserRuleCall_0 = (RuleCall)cAssignmentsAssignment.eContents().get(0);
		
		//MathExp:
		//    (assignments += Assignment)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(assignments += Assignment)+
		public Assignment getAssignmentsAssignment() { return cAssignmentsAssignment; }
		
		//Assignment
		public RuleCall getAssignmentsAssignmentParserRuleCall_0() { return cAssignmentsAssignmentParserRuleCall_0; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		
		//Assignment:
		//    'var' name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftPrimaryParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorExpOpParserRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightExpParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp: // Illegal due to left recursion
		//    left=Primary (operator=ExpOp right=Exp)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//// Illegal due to left recursion
		//   left=Primary (operator=ExpOp right=Exp)?
		public Group getGroup() { return cGroup; }
		
		//// Illegal due to left recursion
		//   left=Primary
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//Primary
		public RuleCall getLeftPrimaryParserRuleCall_0_0() { return cLeftPrimaryParserRuleCall_0_0; }
		
		//(operator=ExpOp right=Exp)?
		public Group getGroup_1() { return cGroup_1; }
		
		//operator=ExpOp
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }
		
		//ExpOp
		public RuleCall getOperatorExpOpParserRuleCall_1_0_0() { return cOperatorExpOpParserRuleCall_1_0_0; }
		
		//right=Exp
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Exp
		public RuleCall getRightExpParserRuleCall_1_1_0() { return cRightExpParserRuleCall_1_1_0; }
	}
	public class ExpOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.ExpOp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cPlusAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cMinusAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cMultAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cAsteriskKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cDivAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cSolidusKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		
		//ExpOp:
		//    {Plus} '+' | {Minus} '-' | {Mult} '*' | {Div} '/'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Plus} '+' | {Minus} '-' | {Mult} '*' | {Div} '/'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Plus} '+'
		public Group getGroup_0() { return cGroup_0; }
		
		//{Plus}
		public Action getPlusAction_0_0() { return cPlusAction_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_0_1() { return cPlusSignKeyword_0_1; }
		
		//{Minus} '-'
		public Group getGroup_1() { return cGroup_1; }
		
		//{Minus}
		public Action getMinusAction_1_0() { return cMinusAction_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1() { return cHyphenMinusKeyword_1_1; }
		
		//{Mult} '*'
		public Group getGroup_2() { return cGroup_2; }
		
		//{Mult}
		public Action getMultAction_2_0() { return cMultAction_2_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_2_1() { return cAsteriskKeyword_2_1; }
		
		//{Div} '/'
		public Group getGroup_3() { return cGroup_3; }
		
		//{Div}
		public Action getDivAction_3_0() { return cDivAction_3_0; }
		
		//'/'
		public Keyword getSolidusKeyword_3_1() { return cSolidusKeyword_3_1; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLitteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetEndParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary:
		//    Litteral | Parenthesis | VariableUse | LetEnd
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Litteral | Parenthesis | VariableUse | LetEnd
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Litteral
		public RuleCall getLitteralParserRuleCall_0() { return cLitteralParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LetEnd
		public RuleCall getLetEndParserRuleCall_3() { return cLetEndParserRuleCall_3; }
	}
	public class LitteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Litteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Litteral:
		//    value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_0 = (RuleCall)cExpAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis:
		//    '(' exp=Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' exp=Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1() { return cExpAssignment_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_0() { return cExpExpParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefAssignmentCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefAssignmentIDTerminalRuleCall_0_1 = (RuleCall)cRefAssignmentCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [Assignment]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [Assignment]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Assignment]
		public CrossReference getRefAssignmentCrossReference_0() { return cRefAssignmentCrossReference_0; }
		
		//ID
		public RuleCall getRefAssignmentIDTerminalRuleCall_0_1() { return cRefAssignmentIDTerminalRuleCall_0_1; }
	}
	public class LetEndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetEnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		private final Assignment cInAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInInParserRuleCall_4_0 = (RuleCall)cInAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//LetEnd:
		//    'let' name=ID '=' exp=Exp in=In 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' exp=Exp in=In 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
		
		//in=In
		public Assignment getInAssignment_4() { return cInAssignment_4; }
		
		//In
		public RuleCall getInInParserRuleCall_4_0() { return cInInParserRuleCall_4_0; }
		
		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}
	public class InElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.In");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_0 = (RuleCall)cExpAssignment_1.eContents().get(0);
		
		//In:
		//    'in' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'in' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'in'
		public Keyword getInKeyword_0() { return cInKeyword_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1() { return cExpAssignment_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_0() { return cExpExpParserRuleCall_1_0; }
	}
	
	
	private final MathExpElements pMathExp;
	private final AssignmentElements pAssignment;
	private final ExpElements pExp;
	private final ExpOpElements pExpOp;
	private final PrimaryElements pPrimary;
	private final LitteralElements pLitteral;
	private final ParenthesisElements pParenthesis;
	private final VariableUseElements pVariableUse;
	private final LetEndElements pLetEnd;
	private final InElements pIn;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pAssignment = new AssignmentElements();
		this.pExp = new ExpElements();
		this.pExpOp = new ExpOpElements();
		this.pPrimary = new PrimaryElements();
		this.pLitteral = new LitteralElements();
		this.pParenthesis = new ParenthesisElements();
		this.pVariableUse = new VariableUseElements();
		this.pLetEnd = new LetEndElements();
		this.pIn = new InElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MathExp:
	//    (assignments += Assignment)+
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Assignment:
	//    'var' name=ID '=' exp=Exp
	//;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//Exp: // Illegal due to left recursion
	//    left=Primary (operator=ExpOp right=Exp)?
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//ExpOp:
	//    {Plus} '+' | {Minus} '-' | {Mult} '*' | {Div} '/'
	//;
	public ExpOpElements getExpOpAccess() {
		return pExpOp;
	}
	
	public ParserRule getExpOpRule() {
		return getExpOpAccess().getRule();
	}
	
	//Primary:
	//    Litteral | Parenthesis | VariableUse | LetEnd
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Litteral:
	//    value=INT
	//;
	public LitteralElements getLitteralAccess() {
		return pLitteral;
	}
	
	public ParserRule getLitteralRule() {
		return getLitteralAccess().getRule();
	}
	
	//Parenthesis:
	//    '(' exp=Exp ')'
	//;
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [Assignment]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//LetEnd:
	//    'let' name=ID '=' exp=Exp in=In 'end'
	//;
	public LetEndElements getLetEndAccess() {
		return pLetEnd;
	}
	
	public ParserRule getLetEndRule() {
		return getLetEndAccess().getRule();
	}
	
	//In:
	//    'in' exp=Exp
	//;
	public InElements getInAccess() {
		return pIn;
	}
	
	public ParserRule getInRule() {
		return getInAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}