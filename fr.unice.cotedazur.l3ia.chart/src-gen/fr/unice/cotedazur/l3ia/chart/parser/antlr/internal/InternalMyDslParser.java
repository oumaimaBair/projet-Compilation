package fr.unice.cotedazur.l3ia.chart.parser.antlr.internal;

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
import fr.unice.cotedazur.l3ia.chart.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Programme'", "'{'", "'where'", "'('", "','", "')'", "'}'", "'path='", "'delimiter='", "'keep('", "'colName='", "':'", "'index='", "'-'", "'type ='", "'title ='", "'xAxis ='", "'yAxis ='", "'Const'", "'='", "'int'", "'string'", "'float'", "'Date'", "'BarChart'", "'AreaChart'", "'BubbleChart'", "'LineChart'", "'ScatterChart'", "'RadarChart'", "'MixedChartTypes'", "'PolarAreaChart'", "'Pie'", "'Doughnut'", "'<'", "'>'", "'=='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programme";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:65:1: entryRuleProgramme returns [EObject current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final EObject entryRuleProgramme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramme = null;


        try {
            // InternalMyDsl.g:65:50: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgramme= ruleProgramme EOF
            {
             newCompositeNode(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;

             current =iv_ruleProgramme; 
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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:72:1: ruleProgramme returns [EObject current=null] : (otherlv_0= 'Programme' otherlv_1= '{' ( (lv_input_2_0= ruleFile ) ) (otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')' )? ( (lv_output_9_0= ruleHTMLFile ) ) otherlv_10= '}' ) ;
    public final EObject ruleProgramme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_input_2_0 = null;

        EObject lv_filtercondition_5_0 = null;

        EObject lv_filtercondition_7_0 = null;

        EObject lv_output_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Programme' otherlv_1= '{' ( (lv_input_2_0= ruleFile ) ) (otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')' )? ( (lv_output_9_0= ruleHTMLFile ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Programme' otherlv_1= '{' ( (lv_input_2_0= ruleFile ) ) (otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')' )? ( (lv_output_9_0= ruleHTMLFile ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Programme' otherlv_1= '{' ( (lv_input_2_0= ruleFile ) ) (otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')' )? ( (lv_output_9_0= ruleHTMLFile ) ) otherlv_10= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Programme' otherlv_1= '{' ( (lv_input_2_0= ruleFile ) ) (otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')' )? ( (lv_output_9_0= ruleHTMLFile ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgrammeAccess().getProgrammeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:88:3: ( (lv_input_2_0= ruleFile ) )
            // InternalMyDsl.g:89:4: (lv_input_2_0= ruleFile )
            {
            // InternalMyDsl.g:89:4: (lv_input_2_0= ruleFile )
            // InternalMyDsl.g:90:5: lv_input_2_0= ruleFile
            {

            					newCompositeNode(grammarAccess.getProgrammeAccess().getInputFileParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_input_2_0=ruleFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgrammeRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_2_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.File");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:107:3: (otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:108:4: otherlv_3= 'where' otherlv_4= '(' ( (lv_filtercondition_5_0= rulefilterCondition ) ) (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getProgrammeAccess().getWhereKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgrammeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDsl.g:116:4: ( (lv_filtercondition_5_0= rulefilterCondition ) )
                    // InternalMyDsl.g:117:5: (lv_filtercondition_5_0= rulefilterCondition )
                    {
                    // InternalMyDsl.g:117:5: (lv_filtercondition_5_0= rulefilterCondition )
                    // InternalMyDsl.g:118:6: lv_filtercondition_5_0= rulefilterCondition
                    {

                    						newCompositeNode(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_filtercondition_5_0=rulefilterCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgrammeRule());
                    						}
                    						add(
                    							current,
                    							"filtercondition",
                    							lv_filtercondition_5_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:135:4: (otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:136:5: otherlv_6= ',' ( (lv_filtercondition_7_0= rulefilterCondition ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProgrammeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:140:5: ( (lv_filtercondition_7_0= rulefilterCondition ) )
                    	    // InternalMyDsl.g:141:6: (lv_filtercondition_7_0= rulefilterCondition )
                    	    {
                    	    // InternalMyDsl.g:141:6: (lv_filtercondition_7_0= rulefilterCondition )
                    	    // InternalMyDsl.g:142:7: lv_filtercondition_7_0= rulefilterCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_filtercondition_7_0=rulefilterCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgrammeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"filtercondition",
                    	    								lv_filtercondition_7_0,
                    	    								"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgrammeAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:165:3: ( (lv_output_9_0= ruleHTMLFile ) )
            // InternalMyDsl.g:166:4: (lv_output_9_0= ruleHTMLFile )
            {
            // InternalMyDsl.g:166:4: (lv_output_9_0= ruleHTMLFile )
            // InternalMyDsl.g:167:5: lv_output_9_0= ruleHTMLFile
            {

            					newCompositeNode(grammarAccess.getProgrammeAccess().getOutputHTMLFileParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_output_9_0=ruleHTMLFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgrammeRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_9_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.HTMLFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRulefilterCondition"
    // InternalMyDsl.g:192:1: entryRulefilterCondition returns [EObject current=null] : iv_rulefilterCondition= rulefilterCondition EOF ;
    public final EObject entryRulefilterCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefilterCondition = null;


        try {
            // InternalMyDsl.g:192:56: (iv_rulefilterCondition= rulefilterCondition EOF )
            // InternalMyDsl.g:193:2: iv_rulefilterCondition= rulefilterCondition EOF
            {
             newCompositeNode(grammarAccess.getFilterConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefilterCondition=rulefilterCondition();

            state._fsp--;

             current =iv_rulefilterCondition; 
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
    // $ANTLR end "entryRulefilterCondition"


    // $ANTLR start "rulefilterCondition"
    // InternalMyDsl.g:199:1: rulefilterCondition returns [EObject current=null] : (this_Constant_0= ruleConstant | this_BinaryBooleanExp_1= ruleBinaryBooleanExp | this_colRef_2= rulecolRef ) ;
    public final EObject rulefilterCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_BinaryBooleanExp_1 = null;

        EObject this_colRef_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:205:2: ( (this_Constant_0= ruleConstant | this_BinaryBooleanExp_1= ruleBinaryBooleanExp | this_colRef_2= rulecolRef ) )
            // InternalMyDsl.g:206:2: (this_Constant_0= ruleConstant | this_BinaryBooleanExp_1= ruleBinaryBooleanExp | this_colRef_2= rulecolRef )
            {
            // InternalMyDsl.g:206:2: (this_Constant_0= ruleConstant | this_BinaryBooleanExp_1= ruleBinaryBooleanExp | this_colRef_2= rulecolRef )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case RULE_ID:
            case 15:
            case 16:
            case 45:
            case 46:
            case 47:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:207:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getFilterConditionAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:216:3: this_BinaryBooleanExp_1= ruleBinaryBooleanExp
                    {

                    			newCompositeNode(grammarAccess.getFilterConditionAccess().getBinaryBooleanExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryBooleanExp_1=ruleBinaryBooleanExp();

                    state._fsp--;


                    			current = this_BinaryBooleanExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:225:3: this_colRef_2= rulecolRef
                    {

                    			newCompositeNode(grammarAccess.getFilterConditionAccess().getColRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_colRef_2=rulecolRef();

                    state._fsp--;


                    			current = this_colRef_2;
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
    // $ANTLR end "rulefilterCondition"


    // $ANTLR start "entryRuleFile"
    // InternalMyDsl.g:237:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalMyDsl.g:237:45: (iv_ruleFile= ruleFile EOF )
            // InternalMyDsl.g:238:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalMyDsl.g:244:1: ruleFile returns [EObject current=null] : ( (otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) ) )? (otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) ) )? otherlv_4= 'keep(' ( (lv_keep_5_0= ruleextractedData ) ) (otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_path_1_0 = null;

        AntlrDatatypeRuleToken lv_delimiter_3_0 = null;

        EObject lv_keep_5_0 = null;

        EObject lv_keep_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( ( (otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) ) )? (otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) ) )? otherlv_4= 'keep(' ( (lv_keep_5_0= ruleextractedData ) ) (otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) ) )* otherlv_8= ')' ) )
            // InternalMyDsl.g:251:2: ( (otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) ) )? (otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) ) )? otherlv_4= 'keep(' ( (lv_keep_5_0= ruleextractedData ) ) (otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) ) )* otherlv_8= ')' )
            {
            // InternalMyDsl.g:251:2: ( (otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) ) )? (otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) ) )? otherlv_4= 'keep(' ( (lv_keep_5_0= ruleextractedData ) ) (otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) ) )* otherlv_8= ')' )
            // InternalMyDsl.g:252:3: (otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) ) )? (otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) ) )? otherlv_4= 'keep(' ( (lv_keep_5_0= ruleextractedData ) ) (otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) ) )* otherlv_8= ')'
            {
            // InternalMyDsl.g:252:3: (otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:253:4: otherlv_0= 'path=' ( (lv_path_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getFileAccess().getPathKeyword_0_0());
                    			
                    // InternalMyDsl.g:257:4: ( (lv_path_1_0= ruleEString ) )
                    // InternalMyDsl.g:258:5: (lv_path_1_0= ruleEString )
                    {
                    // InternalMyDsl.g:258:5: (lv_path_1_0= ruleEString )
                    // InternalMyDsl.g:259:6: lv_path_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileAccess().getPathEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_path_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_1_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:277:3: (otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:278:4: otherlv_2= 'delimiter=' ( (lv_delimiter_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getFileAccess().getDelimiterKeyword_1_0());
                    			
                    // InternalMyDsl.g:282:4: ( (lv_delimiter_3_0= ruleEString ) )
                    // InternalMyDsl.g:283:5: (lv_delimiter_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:283:5: (lv_delimiter_3_0= ruleEString )
                    // InternalMyDsl.g:284:6: lv_delimiter_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileAccess().getDelimiterEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_delimiter_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileRule());
                    						}
                    						set(
                    							current,
                    							"delimiter",
                    							lv_delimiter_3_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFileAccess().getKeepKeyword_2());
            		
            // InternalMyDsl.g:306:3: ( (lv_keep_5_0= ruleextractedData ) )
            // InternalMyDsl.g:307:4: (lv_keep_5_0= ruleextractedData )
            {
            // InternalMyDsl.g:307:4: (lv_keep_5_0= ruleextractedData )
            // InternalMyDsl.g:308:5: lv_keep_5_0= ruleextractedData
            {

            					newCompositeNode(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_keep_5_0=ruleextractedData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					add(
            						current,
            						"keep",
            						lv_keep_5_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.extractedData");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:325:3: (otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:326:4: otherlv_6= ',' ( (lv_keep_7_0= ruleextractedData ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFileAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:330:4: ( (lv_keep_7_0= ruleextractedData ) )
            	    // InternalMyDsl.g:331:5: (lv_keep_7_0= ruleextractedData )
            	    {
            	    // InternalMyDsl.g:331:5: (lv_keep_7_0= ruleextractedData )
            	    // InternalMyDsl.g:332:6: lv_keep_7_0= ruleextractedData
            	    {

            	    						newCompositeNode(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_keep_7_0=ruleextractedData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"keep",
            	    							lv_keep_7_0,
            	    							"fr.unice.cotedazur.l3ia.chart.MyDsl.extractedData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFileAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleHTMLFile"
    // InternalMyDsl.g:358:1: entryRuleHTMLFile returns [EObject current=null] : iv_ruleHTMLFile= ruleHTMLFile EOF ;
    public final EObject entryRuleHTMLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTMLFile = null;


        try {
            // InternalMyDsl.g:358:49: (iv_ruleHTMLFile= ruleHTMLFile EOF )
            // InternalMyDsl.g:359:2: iv_ruleHTMLFile= ruleHTMLFile EOF
            {
             newCompositeNode(grammarAccess.getHTMLFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHTMLFile=ruleHTMLFile();

            state._fsp--;

             current =iv_ruleHTMLFile; 
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
    // $ANTLR end "entryRuleHTMLFile"


    // $ANTLR start "ruleHTMLFile"
    // InternalMyDsl.g:365:1: ruleHTMLFile returns [EObject current=null] : ( ( (lv_graph_0_0= ruleGraph ) ) (otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) ) )* ) ;
    public final EObject ruleHTMLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_graph_0_0 = null;

        EObject lv_graph_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:371:2: ( ( ( (lv_graph_0_0= ruleGraph ) ) (otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) ) )* ) )
            // InternalMyDsl.g:372:2: ( ( (lv_graph_0_0= ruleGraph ) ) (otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) ) )* )
            {
            // InternalMyDsl.g:372:2: ( ( (lv_graph_0_0= ruleGraph ) ) (otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) ) )* )
            // InternalMyDsl.g:373:3: ( (lv_graph_0_0= ruleGraph ) ) (otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) ) )*
            {
            // InternalMyDsl.g:373:3: ( (lv_graph_0_0= ruleGraph ) )
            // InternalMyDsl.g:374:4: (lv_graph_0_0= ruleGraph )
            {
            // InternalMyDsl.g:374:4: (lv_graph_0_0= ruleGraph )
            // InternalMyDsl.g:375:5: lv_graph_0_0= ruleGraph
            {

            					newCompositeNode(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_graph_0_0=ruleGraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHTMLFileRule());
            					}
            					add(
            						current,
            						"graph",
            						lv_graph_0_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.Graph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:392:3: (otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:393:4: otherlv_1= ',' ( (lv_graph_2_0= ruleGraph ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getHTMLFileAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:397:4: ( (lv_graph_2_0= ruleGraph ) )
            	    // InternalMyDsl.g:398:5: (lv_graph_2_0= ruleGraph )
            	    {
            	    // InternalMyDsl.g:398:5: (lv_graph_2_0= ruleGraph )
            	    // InternalMyDsl.g:399:6: lv_graph_2_0= ruleGraph
            	    {

            	    						newCompositeNode(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_graph_2_0=ruleGraph();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHTMLFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"graph",
            	    							lv_graph_2_0,
            	    							"fr.unice.cotedazur.l3ia.chart.MyDsl.Graph");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleHTMLFile"


    // $ANTLR start "entryRuleextractedData"
    // InternalMyDsl.g:421:1: entryRuleextractedData returns [EObject current=null] : iv_ruleextractedData= ruleextractedData EOF ;
    public final EObject entryRuleextractedData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleextractedData = null;


        try {
            // InternalMyDsl.g:421:54: (iv_ruleextractedData= ruleextractedData EOF )
            // InternalMyDsl.g:422:2: iv_ruleextractedData= ruleextractedData EOF
            {
             newCompositeNode(grammarAccess.getExtractedDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleextractedData=ruleextractedData();

            state._fsp--;

             current =iv_ruleextractedData; 
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
    // $ANTLR end "entryRuleextractedData"


    // $ANTLR start "ruleextractedData"
    // InternalMyDsl.g:428:1: ruleextractedData returns [EObject current=null] : ( () otherlv_1= 'colName=' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) ) )? (otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) ) )? ) ;
    public final EObject ruleextractedData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_typeData_4_0 = null;

        AntlrDatatypeRuleToken lv_index_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:434:2: ( ( () otherlv_1= 'colName=' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) ) )? (otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:435:2: ( () otherlv_1= 'colName=' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) ) )? (otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:435:2: ( () otherlv_1= 'colName=' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) ) )? (otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:436:3: () otherlv_1= 'colName=' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) ) )? (otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:436:3: ()
            // InternalMyDsl.g:437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExtractedDataAccess().getExtractedDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getExtractedDataAccess().getColNameKeyword_1());
            		
            // InternalMyDsl.g:447:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:448:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:448:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:449:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExtractedDataAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtractedDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:466:3: (otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:467:4: otherlv_3= ':' ( (lv_typeData_4_0= ruletypeDonnees ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtractedDataAccess().getColonKeyword_3_0());
                    			
                    // InternalMyDsl.g:471:4: ( (lv_typeData_4_0= ruletypeDonnees ) )
                    // InternalMyDsl.g:472:5: (lv_typeData_4_0= ruletypeDonnees )
                    {
                    // InternalMyDsl.g:472:5: (lv_typeData_4_0= ruletypeDonnees )
                    // InternalMyDsl.g:473:6: lv_typeData_4_0= ruletypeDonnees
                    {

                    						newCompositeNode(grammarAccess.getExtractedDataAccess().getTypeDataTypeDonneesEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_typeData_4_0=ruletypeDonnees();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtractedDataRule());
                    						}
                    						set(
                    							current,
                    							"typeData",
                    							lv_typeData_4_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.typeDonnees");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:491:3: (otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:492:4: otherlv_5= 'index=' ( (lv_index_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getExtractedDataAccess().getIndexKeyword_4_0());
                    			
                    // InternalMyDsl.g:496:4: ( (lv_index_6_0= ruleEInt ) )
                    // InternalMyDsl.g:497:5: (lv_index_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:497:5: (lv_index_6_0= ruleEInt )
                    // InternalMyDsl.g:498:6: lv_index_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExtractedDataAccess().getIndexEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_index_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtractedDataRule());
                    						}
                    						set(
                    							current,
                    							"index",
                    							lv_index_6_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleextractedData"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:520:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:520:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:521:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:527:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:533:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:534:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:534:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:535:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:543:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:554:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:554:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:555:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:561:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:567:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:568:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:568:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:569:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:569:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:570:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGraph"
    // InternalMyDsl.g:587:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalMyDsl.g:587:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalMyDsl.g:588:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalMyDsl.g:594:1: ruleGraph returns [EObject current=null] : ( (otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) ) )? (otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'xAxis =' ( ( ruleEString ) ) (otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_title_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:600:2: ( ( (otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) ) )? (otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'xAxis =' ( ( ruleEString ) ) (otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )* )? ) )
            // InternalMyDsl.g:601:2: ( (otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) ) )? (otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'xAxis =' ( ( ruleEString ) ) (otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )* )? )
            {
            // InternalMyDsl.g:601:2: ( (otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) ) )? (otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'xAxis =' ( ( ruleEString ) ) (otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )* )? )
            // InternalMyDsl.g:602:3: (otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) ) )? (otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'xAxis =' ( ( ruleEString ) ) (otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )* )?
            {
            // InternalMyDsl.g:602:3: (otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:603:4: otherlv_0= 'type =' ( (lv_type_1_0= ruletypeGraph ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getTypeKeyword_0_0());
                    			
                    // InternalMyDsl.g:607:4: ( (lv_type_1_0= ruletypeGraph ) )
                    // InternalMyDsl.g:608:5: (lv_type_1_0= ruletypeGraph )
                    {
                    // InternalMyDsl.g:608:5: (lv_type_1_0= ruletypeGraph )
                    // InternalMyDsl.g:609:6: lv_type_1_0= ruletypeGraph
                    {

                    						newCompositeNode(grammarAccess.getGraphAccess().getTypeTypeGraphEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_type_1_0=ruletypeGraph();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.typeGraph");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:627:3: (otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:628:4: otherlv_2= 'title =' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getTitleKeyword_1_0());
                    			
                    // InternalMyDsl.g:632:4: ( (lv_title_3_0= ruleEString ) )
                    // InternalMyDsl.g:633:5: (lv_title_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:633:5: (lv_title_3_0= ruleEString )
                    // InternalMyDsl.g:634:6: lv_title_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGraphAccess().getTitleEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_title_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraphRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_3_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getXAxisKeyword_2());
            		
            // InternalMyDsl.g:656:3: ( ( ruleEString ) )
            // InternalMyDsl.g:657:4: ( ruleEString )
            {
            // InternalMyDsl.g:657:4: ( ruleEString )
            // InternalMyDsl.g:658:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGraphAccess().getXAxisExtractedDataCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:672:3: (otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:673:4: otherlv_6= 'yAxis =' ( ( ruleEString ) ) (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getYAxisKeyword_4_0());
                    			
                    // InternalMyDsl.g:677:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:678:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:678:5: ( ruleEString )
                    // InternalMyDsl.g:679:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:693:4: (otherlv_8= 'yAxis =' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:694:5: otherlv_8= 'yAxis =' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,28,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getYAxisKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:698:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:699:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:699:6: ( ruleEString )
                    	    // InternalMyDsl.g:700:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGraphRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleConstant"
    // InternalMyDsl.g:720:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalMyDsl.g:720:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalMyDsl.g:721:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMyDsl.g:727:1: ruleConstant returns [EObject current=null] : ( () otherlv_1= 'Const' ( (lv_type_2_0= ruletypeDonnees ) )? (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:733:2: ( ( () otherlv_1= 'Const' ( (lv_type_2_0= ruletypeDonnees ) )? (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? ) )
            // InternalMyDsl.g:734:2: ( () otherlv_1= 'Const' ( (lv_type_2_0= ruletypeDonnees ) )? (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? )
            {
            // InternalMyDsl.g:734:2: ( () otherlv_1= 'Const' ( (lv_type_2_0= ruletypeDonnees ) )? (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )? )
            // InternalMyDsl.g:735:3: () otherlv_1= 'Const' ( (lv_type_2_0= ruletypeDonnees ) )? (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )?
            {
            // InternalMyDsl.g:735:3: ()
            // InternalMyDsl.g:736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantAccess().getConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstKeyword_1());
            		
            // InternalMyDsl.g:746:3: ( (lv_type_2_0= ruletypeDonnees ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=31 && LA16_0<=34)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:747:4: (lv_type_2_0= ruletypeDonnees )
                    {
                    // InternalMyDsl.g:747:4: (lv_type_2_0= ruletypeDonnees )
                    // InternalMyDsl.g:748:5: lv_type_2_0= ruletypeDonnees
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeDonneesEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_type_2_0=ruletypeDonnees();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"fr.unice.cotedazur.l3ia.chart.MyDsl.typeDonnees");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:765:3: (otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:766:4: otherlv_3= '=' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalMyDsl.g:770:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalMyDsl.g:771:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:771:5: (lv_value_4_0= ruleEString )
                    // InternalMyDsl.g:772:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleBinaryBooleanExp"
    // InternalMyDsl.g:794:1: entryRuleBinaryBooleanExp returns [EObject current=null] : iv_ruleBinaryBooleanExp= ruleBinaryBooleanExp EOF ;
    public final EObject entryRuleBinaryBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryBooleanExp = null;


        try {
            // InternalMyDsl.g:794:57: (iv_ruleBinaryBooleanExp= ruleBinaryBooleanExp EOF )
            // InternalMyDsl.g:795:2: iv_ruleBinaryBooleanExp= ruleBinaryBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBinaryBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryBooleanExp=ruleBinaryBooleanExp();

            state._fsp--;

             current =iv_ruleBinaryBooleanExp; 
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
    // $ANTLR end "entryRuleBinaryBooleanExp"


    // $ANTLR start "ruleBinaryBooleanExp"
    // InternalMyDsl.g:801:1: ruleBinaryBooleanExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_lhs_1_0= rulefilterCondition ) ) ( (lv_operator_2_0= rulecomOperator ) ) ( (lv_rhs_3_0= rulefilterCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleBinaryBooleanExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_lhs_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:807:2: ( (otherlv_0= '(' ( (lv_lhs_1_0= rulefilterCondition ) ) ( (lv_operator_2_0= rulecomOperator ) ) ( (lv_rhs_3_0= rulefilterCondition ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:808:2: (otherlv_0= '(' ( (lv_lhs_1_0= rulefilterCondition ) ) ( (lv_operator_2_0= rulecomOperator ) ) ( (lv_rhs_3_0= rulefilterCondition ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:808:2: (otherlv_0= '(' ( (lv_lhs_1_0= rulefilterCondition ) ) ( (lv_operator_2_0= rulecomOperator ) ) ( (lv_rhs_3_0= rulefilterCondition ) ) otherlv_4= ')' )
            // InternalMyDsl.g:809:3: otherlv_0= '(' ( (lv_lhs_1_0= rulefilterCondition ) ) ( (lv_operator_2_0= rulecomOperator ) ) ( (lv_rhs_3_0= rulefilterCondition ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryBooleanExpAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:813:3: ( (lv_lhs_1_0= rulefilterCondition ) )
            // InternalMyDsl.g:814:4: (lv_lhs_1_0= rulefilterCondition )
            {
            // InternalMyDsl.g:814:4: (lv_lhs_1_0= rulefilterCondition )
            // InternalMyDsl.g:815:5: lv_lhs_1_0= rulefilterCondition
            {

            					newCompositeNode(grammarAccess.getBinaryBooleanExpAccess().getLhsFilterConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_lhs_1_0=rulefilterCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryBooleanExpRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_1_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:832:3: ( (lv_operator_2_0= rulecomOperator ) )
            // InternalMyDsl.g:833:4: (lv_operator_2_0= rulecomOperator )
            {
            // InternalMyDsl.g:833:4: (lv_operator_2_0= rulecomOperator )
            // InternalMyDsl.g:834:5: lv_operator_2_0= rulecomOperator
            {

            					newCompositeNode(grammarAccess.getBinaryBooleanExpAccess().getOperatorComOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_operator_2_0=rulecomOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryBooleanExpRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.comOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:851:3: ( (lv_rhs_3_0= rulefilterCondition ) )
            // InternalMyDsl.g:852:4: (lv_rhs_3_0= rulefilterCondition )
            {
            // InternalMyDsl.g:852:4: (lv_rhs_3_0= rulefilterCondition )
            // InternalMyDsl.g:853:5: lv_rhs_3_0= rulefilterCondition
            {

            					newCompositeNode(grammarAccess.getBinaryBooleanExpAccess().getRhsFilterConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_rhs_3_0=rulefilterCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryBooleanExpRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_3_0,
            						"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBinaryBooleanExpAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleBinaryBooleanExp"


    // $ANTLR start "entryRulecolRef"
    // InternalMyDsl.g:878:1: entryRulecolRef returns [EObject current=null] : iv_rulecolRef= rulecolRef EOF ;
    public final EObject entryRulecolRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecolRef = null;


        try {
            // InternalMyDsl.g:878:47: (iv_rulecolRef= rulecolRef EOF )
            // InternalMyDsl.g:879:2: iv_rulecolRef= rulecolRef EOF
            {
             newCompositeNode(grammarAccess.getColRefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecolRef=rulecolRef();

            state._fsp--;

             current =iv_rulecolRef; 
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
    // $ANTLR end "entryRulecolRef"


    // $ANTLR start "rulecolRef"
    // InternalMyDsl.g:885:1: rulecolRef returns [EObject current=null] : ( () ( ( ruleEString ) )? ) ;
    public final EObject rulecolRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMyDsl.g:891:2: ( ( () ( ( ruleEString ) )? ) )
            // InternalMyDsl.g:892:2: ( () ( ( ruleEString ) )? )
            {
            // InternalMyDsl.g:892:2: ( () ( ( ruleEString ) )? )
            // InternalMyDsl.g:893:3: () ( ( ruleEString ) )?
            {
            // InternalMyDsl.g:893:3: ()
            // InternalMyDsl.g:894:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColRefAccess().getColRefAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:900:3: ( ( ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:901:4: ( ruleEString )
                    {
                    // InternalMyDsl.g:901:4: ( ruleEString )
                    // InternalMyDsl.g:902:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColRefRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getColRefAccess().getExtracteddataExtractedDataCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulecolRef"


    // $ANTLR start "ruletypeDonnees"
    // InternalMyDsl.g:920:1: ruletypeDonnees returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'Date' ) ) ;
    public final Enumerator ruletypeDonnees() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:926:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'Date' ) ) )
            // InternalMyDsl.g:927:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'Date' ) )
            {
            // InternalMyDsl.g:927:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'Date' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:928:3: (enumLiteral_0= 'int' )
                    {
                    // InternalMyDsl.g:928:3: (enumLiteral_0= 'int' )
                    // InternalMyDsl.g:929:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:936:3: (enumLiteral_1= 'string' )
                    {
                    // InternalMyDsl.g:936:3: (enumLiteral_1= 'string' )
                    // InternalMyDsl.g:937:4: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeDonneesAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:944:3: (enumLiteral_2= 'float' )
                    {
                    // InternalMyDsl.g:944:3: (enumLiteral_2= 'float' )
                    // InternalMyDsl.g:945:4: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:952:3: (enumLiteral_3= 'Date' )
                    {
                    // InternalMyDsl.g:952:3: (enumLiteral_3= 'Date' )
                    // InternalMyDsl.g:953:4: enumLiteral_3= 'Date'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeDonneesAccess().getDateEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruletypeDonnees"


    // $ANTLR start "ruletypeGraph"
    // InternalMyDsl.g:963:1: ruletypeGraph returns [Enumerator current=null] : ( (enumLiteral_0= 'BarChart' ) | (enumLiteral_1= 'AreaChart' ) | (enumLiteral_2= 'BubbleChart' ) | (enumLiteral_3= 'LineChart' ) | (enumLiteral_4= 'ScatterChart' ) | (enumLiteral_5= 'RadarChart' ) | (enumLiteral_6= 'MixedChartTypes' ) | (enumLiteral_7= 'PolarAreaChart' ) | (enumLiteral_8= 'Pie' ) | (enumLiteral_9= 'Doughnut' ) ) ;
    public final Enumerator ruletypeGraph() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:969:2: ( ( (enumLiteral_0= 'BarChart' ) | (enumLiteral_1= 'AreaChart' ) | (enumLiteral_2= 'BubbleChart' ) | (enumLiteral_3= 'LineChart' ) | (enumLiteral_4= 'ScatterChart' ) | (enumLiteral_5= 'RadarChart' ) | (enumLiteral_6= 'MixedChartTypes' ) | (enumLiteral_7= 'PolarAreaChart' ) | (enumLiteral_8= 'Pie' ) | (enumLiteral_9= 'Doughnut' ) ) )
            // InternalMyDsl.g:970:2: ( (enumLiteral_0= 'BarChart' ) | (enumLiteral_1= 'AreaChart' ) | (enumLiteral_2= 'BubbleChart' ) | (enumLiteral_3= 'LineChart' ) | (enumLiteral_4= 'ScatterChart' ) | (enumLiteral_5= 'RadarChart' ) | (enumLiteral_6= 'MixedChartTypes' ) | (enumLiteral_7= 'PolarAreaChart' ) | (enumLiteral_8= 'Pie' ) | (enumLiteral_9= 'Doughnut' ) )
            {
            // InternalMyDsl.g:970:2: ( (enumLiteral_0= 'BarChart' ) | (enumLiteral_1= 'AreaChart' ) | (enumLiteral_2= 'BubbleChart' ) | (enumLiteral_3= 'LineChart' ) | (enumLiteral_4= 'ScatterChart' ) | (enumLiteral_5= 'RadarChart' ) | (enumLiteral_6= 'MixedChartTypes' ) | (enumLiteral_7= 'PolarAreaChart' ) | (enumLiteral_8= 'Pie' ) | (enumLiteral_9= 'Doughnut' ) )
            int alt20=10;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt20=1;
                }
                break;
            case 36:
                {
                alt20=2;
                }
                break;
            case 37:
                {
                alt20=3;
                }
                break;
            case 38:
                {
                alt20=4;
                }
                break;
            case 39:
                {
                alt20=5;
                }
                break;
            case 40:
                {
                alt20=6;
                }
                break;
            case 41:
                {
                alt20=7;
                }
                break;
            case 42:
                {
                alt20=8;
                }
                break;
            case 43:
                {
                alt20=9;
                }
                break;
            case 44:
                {
                alt20=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:971:3: (enumLiteral_0= 'BarChart' )
                    {
                    // InternalMyDsl.g:971:3: (enumLiteral_0= 'BarChart' )
                    // InternalMyDsl.g:972:4: enumLiteral_0= 'BarChart'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getBarChartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeGraphAccess().getBarChartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:979:3: (enumLiteral_1= 'AreaChart' )
                    {
                    // InternalMyDsl.g:979:3: (enumLiteral_1= 'AreaChart' )
                    // InternalMyDsl.g:980:4: enumLiteral_1= 'AreaChart'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getAreaChartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeGraphAccess().getAreaChartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:987:3: (enumLiteral_2= 'BubbleChart' )
                    {
                    // InternalMyDsl.g:987:3: (enumLiteral_2= 'BubbleChart' )
                    // InternalMyDsl.g:988:4: enumLiteral_2= 'BubbleChart'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getBubbleChartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeGraphAccess().getBubbleChartEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:995:3: (enumLiteral_3= 'LineChart' )
                    {
                    // InternalMyDsl.g:995:3: (enumLiteral_3= 'LineChart' )
                    // InternalMyDsl.g:996:4: enumLiteral_3= 'LineChart'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getLineChartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeGraphAccess().getLineChartEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1003:3: (enumLiteral_4= 'ScatterChart' )
                    {
                    // InternalMyDsl.g:1003:3: (enumLiteral_4= 'ScatterChart' )
                    // InternalMyDsl.g:1004:4: enumLiteral_4= 'ScatterChart'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getScatterChartEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeGraphAccess().getScatterChartEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1011:3: (enumLiteral_5= 'RadarChart' )
                    {
                    // InternalMyDsl.g:1011:3: (enumLiteral_5= 'RadarChart' )
                    // InternalMyDsl.g:1012:4: enumLiteral_5= 'RadarChart'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getRadarChartEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeGraphAccess().getRadarChartEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1019:3: (enumLiteral_6= 'MixedChartTypes' )
                    {
                    // InternalMyDsl.g:1019:3: (enumLiteral_6= 'MixedChartTypes' )
                    // InternalMyDsl.g:1020:4: enumLiteral_6= 'MixedChartTypes'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getMixedChartTypesEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeGraphAccess().getMixedChartTypesEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1027:3: (enumLiteral_7= 'PolarAreaChart' )
                    {
                    // InternalMyDsl.g:1027:3: (enumLiteral_7= 'PolarAreaChart' )
                    // InternalMyDsl.g:1028:4: enumLiteral_7= 'PolarAreaChart'
                    {
                    enumLiteral_7=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getPolarAreaChartEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeGraphAccess().getPolarAreaChartEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1035:3: (enumLiteral_8= 'Pie' )
                    {
                    // InternalMyDsl.g:1035:3: (enumLiteral_8= 'Pie' )
                    // InternalMyDsl.g:1036:4: enumLiteral_8= 'Pie'
                    {
                    enumLiteral_8=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getPieEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeGraphAccess().getPieEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1043:3: (enumLiteral_9= 'Doughnut' )
                    {
                    // InternalMyDsl.g:1043:3: (enumLiteral_9= 'Doughnut' )
                    // InternalMyDsl.g:1044:4: enumLiteral_9= 'Doughnut'
                    {
                    enumLiteral_9=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeGraphAccess().getDoughnutEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTypeGraphAccess().getDoughnutEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruletypeGraph"


    // $ANTLR start "rulecomOperator"
    // InternalMyDsl.g:1054:1: rulecomOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) ) ;
    public final Enumerator rulecomOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1060:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) ) )
            // InternalMyDsl.g:1061:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) )
            {
            // InternalMyDsl.g:1061:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '==' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 47:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1062:3: (enumLiteral_0= '<' )
                    {
                    // InternalMyDsl.g:1062:3: (enumLiteral_0= '<' )
                    // InternalMyDsl.g:1063:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getComOperatorAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComOperatorAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1070:3: (enumLiteral_1= '>' )
                    {
                    // InternalMyDsl.g:1070:3: (enumLiteral_1= '>' )
                    // InternalMyDsl.g:1071:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getComOperatorAccess().getSupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComOperatorAccess().getSupEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1078:3: (enumLiteral_2= '==' )
                    {
                    // InternalMyDsl.g:1078:3: (enumLiteral_2= '==' )
                    // InternalMyDsl.g:1079:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getComOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "rulecomOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000E002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020004030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010000L});

}