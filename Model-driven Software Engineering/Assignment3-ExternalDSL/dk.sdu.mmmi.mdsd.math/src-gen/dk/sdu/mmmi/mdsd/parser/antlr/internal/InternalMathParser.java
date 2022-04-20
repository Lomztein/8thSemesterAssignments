package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "','", "')'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:65:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:65:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:66:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:72:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:78:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( (lv_variables_3_0= ruleVarBinding ) )* ) )
            // InternalMath.g:79:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:79:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( (lv_variables_3_0= ruleVarBinding ) )* )
            // InternalMath.g:80:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( (lv_variables_3_0= ruleVarBinding ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getProgramKeyword_0());
            		
            // InternalMath.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:102:3: ( (lv_externals_2_0= ruleExternalDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:103:4: (lv_externals_2_0= ruleExternalDefinition )
            	    {
            	    // InternalMath.g:103:4: (lv_externals_2_0= ruleExternalDefinition )
            	    // InternalMath.g:104:5: lv_externals_2_0= ruleExternalDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getExternalsExternalDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternalDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.ExternalDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:121:3: ( (lv_variables_3_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:122:4: (lv_variables_3_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:122:4: (lv_variables_3_0= ruleVarBinding )
            	    // InternalMath.g:123:5: lv_variables_3_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExternalDefinition"
    // InternalMath.g:144:1: entryRuleExternalDefinition returns [EObject current=null] : iv_ruleExternalDefinition= ruleExternalDefinition EOF ;
    public final EObject entryRuleExternalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDefinition = null;


        try {
            // InternalMath.g:144:59: (iv_ruleExternalDefinition= ruleExternalDefinition EOF )
            // InternalMath.g:145:2: iv_ruleExternalDefinition= ruleExternalDefinition EOF
            {
             newCompositeNode(grammarAccess.getExternalDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDefinition=ruleExternalDefinition();

            state._fsp--;

             current =iv_ruleExternalDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalDefinition"


    // $ANTLR start "ruleExternalDefinition"
    // InternalMath.g:151:1: ruleExternalDefinition returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleMathNumberType ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_params_3_0 = null;

        Enumerator lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:157:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleMathNumberType ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) ) )* otherlv_6= ')' ) )
            // InternalMath.g:158:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleMathNumberType ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) ) )* otherlv_6= ')' )
            {
            // InternalMath.g:158:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleMathNumberType ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) ) )* otherlv_6= ')' )
            // InternalMath.g:159:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleMathNumberType ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDefinitionAccess().getExternalKeyword_0());
            		
            // InternalMath.g:163:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:164:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:164:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:165:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:185:3: ( (lv_params_3_0= ruleMathNumberType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=30)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:186:4: (lv_params_3_0= ruleMathNumberType )
                    {
                    // InternalMath.g:186:4: (lv_params_3_0= ruleMathNumberType )
                    // InternalMath.g:187:5: lv_params_3_0= ruleMathNumberType
                    {

                    					newCompositeNode(grammarAccess.getExternalDefinitionAccess().getParamsMathNumberTypeEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_params_3_0=ruleMathNumberType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalDefinitionRule());
                    					}
                    					add(
                    						current,
                    						"params",
                    						lv_params_3_0,
                    						"dk.sdu.mmmi.mdsd.Math.MathNumberType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:204:3: (otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:205:4: otherlv_4= ',' ( (lv_params_5_0= ruleMathNumberType ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalDefinitionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMath.g:209:4: ( (lv_params_5_0= ruleMathNumberType ) )
            	    // InternalMath.g:210:5: (lv_params_5_0= ruleMathNumberType )
            	    {
            	    // InternalMath.g:210:5: (lv_params_5_0= ruleMathNumberType )
            	    // InternalMath.g:211:6: lv_params_5_0= ruleMathNumberType
            	    {

            	    						newCompositeNode(grammarAccess.getExternalDefinitionAccess().getParamsMathNumberTypeEnumRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_params_5_0=ruleMathNumberType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.MathNumberType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalDefinitionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDefinition"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:237:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:237:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:238:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:244:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:250:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:251:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:251:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:252:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:278:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:279:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:279:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:280:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:301:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:301:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:302:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:308:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:314:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:315:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:315:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:316:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:324:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:325:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:325:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==19) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:326:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:326:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:327:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:327:6: ()
            	            // InternalMath.g:328:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:340:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:340:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:341:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:341:6: ()
            	            // InternalMath.g:342:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:354:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:355:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:355:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:356:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:378:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:378:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:379:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:385:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:391:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:392:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:392:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:393:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:401:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:402:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:402:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==20) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==21) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:403:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:403:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:404:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:404:6: ()
            	            // InternalMath.g:405:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:417:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:417:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:418:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:418:6: ()
            	            // InternalMath.g:419:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:431:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:432:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:432:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:433:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:455:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:455:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:456:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:462:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalCall_5= ruleExternalCall ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesis_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_LetBinding_4 = null;

        EObject this_ExternalCall_5 = null;



        	enterRule();

        try {
            // InternalMath.g:468:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalCall_5= ruleExternalCall ) )
            // InternalMath.g:469:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalCall_5= ruleExternalCall )
            {
            // InternalMath.g:469:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalCall_5= ruleExternalCall )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==EOF||(LA9_3>=14 && LA9_3<=16)||(LA9_3>=18 && LA9_3<=21)||(LA9_3>=23 && LA9_3<=24)) ) {
                    alt9=3;
                }
                else if ( (LA9_3==13) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:470:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:470:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:471:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:471:4: ()
                    // InternalMath.g:472:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:478:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:479:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:479:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:480:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:498:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:507:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:516:3: this_LetBinding_4= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_4=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:525:3: this_ExternalCall_5= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_5=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleExternalCall"
    // InternalMath.g:537:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalMath.g:537:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalMath.g:538:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalMath.g:544:1: ruleExternalCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:550:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )* otherlv_5= ')' ) )
            // InternalMath.g:551:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )* otherlv_5= ')' )
            {
            // InternalMath.g:551:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )* otherlv_5= ')' )
            // InternalMath.g:552:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleExp ) )? (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )* otherlv_5= ')'
            {
            // InternalMath.g:552:3: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:553:4: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:553:4: (otherlv_0= RULE_ID )
            // InternalMath.g:554:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getExternalCallAccess().getFuncExternalDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:569:3: ( (lv_args_2_0= ruleExp ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==13||LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMath.g:570:4: (lv_args_2_0= ruleExp )
                    {
                    // InternalMath.g:570:4: (lv_args_2_0= ruleExp )
                    // InternalMath.g:571:5: lv_args_2_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_args_2_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalCallRule());
                    					}
                    					add(
                    						current,
                    						"args",
                    						lv_args_2_0,
                    						"dk.sdu.mmmi.mdsd.Math.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:588:3: (otherlv_3= ',' ( (lv_args_4_0= ruleExp ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMath.g:589:4: otherlv_3= ',' ( (lv_args_4_0= ruleExp ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalCallAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMath.g:593:4: ( (lv_args_4_0= ruleExp ) )
            	    // InternalMath.g:594:5: (lv_args_4_0= ruleExp )
            	    {
            	    // InternalMath.g:594:5: (lv_args_4_0= ruleExp )
            	    // InternalMath.g:595:6: lv_args_4_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalCallAccess().getArgsExpParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_args_4_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_4_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalCallAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:621:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:621:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:622:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:628:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:634:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:635:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:635:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:636:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:640:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:641:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:641:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:642:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:667:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:667:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:668:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:674:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:680:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:681:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:681:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:682:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:687:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:708:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:709:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:709:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:710:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:731:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:732:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:732:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:733:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:758:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:758:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:759:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:765:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:771:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:772:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:772:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:773:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:773:3: (otherlv_0= RULE_ID )
            // InternalMath.g:774:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "ruleMathNumberType"
    // InternalMath.g:788:1: ruleMathNumberType returns [Enumerator current=null] : ( (enumLiteral_0= 'byte' ) | (enumLiteral_1= 'short' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) ) ;
    public final Enumerator ruleMathNumberType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMath.g:794:2: ( ( (enumLiteral_0= 'byte' ) | (enumLiteral_1= 'short' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) ) )
            // InternalMath.g:795:2: ( (enumLiteral_0= 'byte' ) | (enumLiteral_1= 'short' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) )
            {
            // InternalMath.g:795:2: ( (enumLiteral_0= 'byte' ) | (enumLiteral_1= 'short' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMath.g:796:3: (enumLiteral_0= 'byte' )
                    {
                    // InternalMath.g:796:3: (enumLiteral_0= 'byte' )
                    // InternalMath.g:797:4: enumLiteral_0= 'byte'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getMathNumberTypeAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathNumberTypeAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:804:3: (enumLiteral_1= 'short' )
                    {
                    // InternalMath.g:804:3: (enumLiteral_1= 'short' )
                    // InternalMath.g:805:4: enumLiteral_1= 'short'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMathNumberTypeAccess().getShortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathNumberTypeAccess().getShortEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:812:3: (enumLiteral_2= 'int' )
                    {
                    // InternalMath.g:812:3: (enumLiteral_2= 'int' )
                    // InternalMath.g:813:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMathNumberTypeAccess().getIntEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathNumberTypeAccess().getIntEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:820:3: (enumLiteral_3= 'long' )
                    {
                    // InternalMath.g:820:3: (enumLiteral_3= 'long' )
                    // InternalMath.g:821:4: enumLiteral_3= 'long'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMathNumberTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMathNumberTypeAccess().getLongEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMath.g:828:3: (enumLiteral_4= 'float' )
                    {
                    // InternalMath.g:828:3: (enumLiteral_4= 'float' )
                    // InternalMath.g:829:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getMathNumberTypeAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMathNumberTypeAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMath.g:836:3: (enumLiteral_5= 'double' )
                    {
                    // InternalMath.g:836:3: (enumLiteral_5= 'double' )
                    // InternalMath.g:837:4: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getMathNumberTypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMathNumberTypeAccess().getDoubleEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathNumberType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007E00C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000402030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000040E030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}