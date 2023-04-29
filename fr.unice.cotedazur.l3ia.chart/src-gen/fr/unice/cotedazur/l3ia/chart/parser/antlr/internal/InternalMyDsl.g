/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.unice.cotedazur.l3ia.chart.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgramme
entryRuleProgramme returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgrammeRule()); }
	iv_ruleProgramme=ruleProgramme
	{ $current=$iv_ruleProgramme.current; }
	EOF;

// Rule Programme
ruleProgramme returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Programme'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgrammeAccess().getProgrammeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgrammeAccess().getInputFileParserRuleCall_2_0());
				}
				lv_input_2_0=ruleFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgrammeRule());
					}
					set(
						$current,
						"input",
						lv_input_2_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.File");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='where'
			{
				newLeafNode(otherlv_3, grammarAccess.getProgrammeAccess().getWhereKeyword_3_0());
			}
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getProgrammeAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_2_0());
					}
					lv_filtercondition_5_0=rulefilterCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgrammeRule());
						}
						add(
							$current,
							"filtercondition",
							lv_filtercondition_5_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getProgrammeAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_3_1_0());
						}
						lv_filtercondition_7_0=rulefilterCondition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getProgrammeRule());
							}
							add(
								$current,
								"filtercondition",
								lv_filtercondition_7_0,
								"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getProgrammeAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getProgrammeAccess().getOutputHTMLFileParserRuleCall_4_0());
				}
				lv_output_9_0=ruleHTMLFile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgrammeRule());
					}
					set(
						$current,
						"output",
						lv_output_9_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.HTMLFile");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulefilterCondition
entryRulefilterCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterConditionRule()); }
	iv_rulefilterCondition=rulefilterCondition
	{ $current=$iv_rulefilterCondition.current; }
	EOF;

// Rule filterCondition
rulefilterCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFilterConditionAccess().getConstantParserRuleCall_0());
		}
		this_Constant_0=ruleConstant
		{
			$current = $this_Constant_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterConditionAccess().getBinaryBooleanExpParserRuleCall_1());
		}
		this_BinaryBooleanExp_1=ruleBinaryBooleanExp
		{
			$current = $this_BinaryBooleanExp_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFilterConditionAccess().getColRefParserRuleCall_2());
		}
		this_colRef_2=rulecolRef
		{
			$current = $this_colRef_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='path='
			{
				newLeafNode(otherlv_0, grammarAccess.getFileAccess().getPathKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFileAccess().getPathEStringParserRuleCall_0_1_0());
					}
					lv_path_1_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFileRule());
						}
						set(
							$current,
							"path",
							lv_path_1_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_2='delimiter='
			{
				newLeafNode(otherlv_2, grammarAccess.getFileAccess().getDelimiterKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFileAccess().getDelimiterEStringParserRuleCall_1_1_0());
					}
					lv_delimiter_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFileRule());
						}
						set(
							$current,
							"delimiter",
							lv_delimiter_3_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='keep('
		{
			newLeafNode(otherlv_4, grammarAccess.getFileAccess().getKeepKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_3_0());
				}
				lv_keep_5_0=ruleextractedData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFileRule());
					}
					add(
						$current,
						"keep",
						lv_keep_5_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.extractedData");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getFileAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_4_1_0());
					}
					lv_keep_7_0=ruleextractedData
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFileRule());
						}
						add(
							$current,
							"keep",
							lv_keep_7_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.extractedData");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getFileAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleHTMLFile
entryRuleHTMLFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHTMLFileRule()); }
	iv_ruleHTMLFile=ruleHTMLFile
	{ $current=$iv_ruleHTMLFile.current; }
	EOF;

// Rule HTMLFile
ruleHTMLFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_0_0());
				}
				lv_graph_0_0=ruleGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHTMLFileRule());
					}
					add(
						$current,
						"graph",
						lv_graph_0_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.Graph");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getHTMLFileAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_1_1_0());
					}
					lv_graph_2_0=ruleGraph
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getHTMLFileRule());
						}
						add(
							$current,
							"graph",
							lv_graph_2_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.Graph");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleextractedData
entryRuleextractedData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtractedDataRule()); }
	iv_ruleextractedData=ruleextractedData
	{ $current=$iv_ruleextractedData.current; }
	EOF;

// Rule extractedData
ruleextractedData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExtractedDataAccess().getExtractedDataAction_0(),
					$current);
			}
		)
		otherlv_1='colName='
		{
			newLeafNode(otherlv_1, grammarAccess.getExtractedDataAccess().getColNameKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExtractedDataAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtractedDataRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getExtractedDataAccess().getColonKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExtractedDataAccess().getTypeDataTypeDonneesEnumRuleCall_3_1_0());
					}
					lv_typeData_4_0=ruletypeDonnees
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtractedDataRule());
						}
						set(
							$current,
							"typeData",
							lv_typeData_4_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.typeDonnees");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='index='
			{
				newLeafNode(otherlv_5, grammarAccess.getExtractedDataAccess().getIndexKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExtractedDataAccess().getIndexEIntParserRuleCall_4_1_0());
					}
					lv_index_6_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtractedDataRule());
						}
						set(
							$current,
							"index",
							lv_index_6_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleGraph
entryRuleGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphRule()); }
	iv_ruleGraph=ruleGraph
	{ $current=$iv_ruleGraph.current; }
	EOF;

// Rule Graph
ruleGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='type ='
			{
				newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getTypeKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGraphAccess().getTypeTypeGraphEnumRuleCall_0_1_0());
					}
					lv_type_1_0=ruletypeGraph
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGraphRule());
						}
						set(
							$current,
							"type",
							lv_type_1_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.typeGraph");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_2='title ='
			{
				newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getTitleKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGraphAccess().getTitleEStringParserRuleCall_1_1_0());
					}
					lv_title_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGraphRule());
						}
						set(
							$current,
							"title",
							lv_title_3_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='xAxis ='
		{
			newLeafNode(otherlv_4, grammarAccess.getGraphAccess().getXAxisKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGraphAccess().getXAxisExtractedDataCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='yAxis ='
			{
				newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getYAxisKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGraphRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8='yAxis ='
				{
					newLeafNode(otherlv_8, grammarAccess.getGraphAccess().getYAxisKeyword_4_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getGraphRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_2_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConstantAccess().getConstantAction_0(),
					$current);
			}
		)
		otherlv_1='Const'
		{
			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstantAccess().getTypeTypeDonneesEnumRuleCall_2_0());
				}
				lv_type_2_0=ruletypeDonnees
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstantRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.typeDonnees");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConstantAccess().getValueEStringParserRuleCall_3_1_0());
					}
					lv_value_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstantRule());
						}
						set(
							$current,
							"value",
							lv_value_4_0,
							"fr.unice.cotedazur.l3ia.chart.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBinaryBooleanExp
entryRuleBinaryBooleanExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryBooleanExpRule()); }
	iv_ruleBinaryBooleanExp=ruleBinaryBooleanExp
	{ $current=$iv_ruleBinaryBooleanExp.current; }
	EOF;

// Rule BinaryBooleanExp
ruleBinaryBooleanExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getBinaryBooleanExpAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryBooleanExpAccess().getLhsFilterConditionParserRuleCall_1_0());
				}
				lv_lhs_1_0=rulefilterCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryBooleanExpRule());
					}
					set(
						$current,
						"lhs",
						lv_lhs_1_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryBooleanExpAccess().getOperatorComOperatorEnumRuleCall_2_0());
				}
				lv_operator_2_0=rulecomOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryBooleanExpRule());
					}
					set(
						$current,
						"operator",
						lv_operator_2_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.comOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryBooleanExpAccess().getRhsFilterConditionParserRuleCall_3_0());
				}
				lv_rhs_3_0=rulefilterCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryBooleanExpRule());
					}
					set(
						$current,
						"rhs",
						lv_rhs_3_0,
						"fr.unice.cotedazur.l3ia.chart.MyDsl.filterCondition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getBinaryBooleanExpAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRulecolRef
entryRulecolRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColRefRule()); }
	iv_rulecolRef=rulecolRef
	{ $current=$iv_rulecolRef.current; }
	EOF;

// Rule colRef
rulecolRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getColRefAccess().getColRefAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getColRefAccess().getExtracteddataExtractedDataCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Rule typeDonnees
ruletypeDonnees returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='int'
			{
				$current = grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='string'
			{
				$current = grammarAccess.getTypeDonneesAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeDonneesAccess().getStringEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='float'
			{
				$current = grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Date'
			{
				$current = grammarAccess.getTypeDonneesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeDonneesAccess().getDateEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule typeGraph
ruletypeGraph returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BarChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getBarChartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeGraphAccess().getBarChartEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='AreaChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getAreaChartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeGraphAccess().getAreaChartEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='BubbleChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getBubbleChartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeGraphAccess().getBubbleChartEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='LineChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getLineChartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeGraphAccess().getLineChartEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ScatterChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getScatterChartEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTypeGraphAccess().getScatterChartEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='RadarChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getRadarChartEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTypeGraphAccess().getRadarChartEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='MixedChartTypes'
			{
				$current = grammarAccess.getTypeGraphAccess().getMixedChartTypesEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTypeGraphAccess().getMixedChartTypesEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='PolarAreaChart'
			{
				$current = grammarAccess.getTypeGraphAccess().getPolarAreaChartEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTypeGraphAccess().getPolarAreaChartEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='Pie'
			{
				$current = grammarAccess.getTypeGraphAccess().getPieEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getTypeGraphAccess().getPieEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='Doughnut'
			{
				$current = grammarAccess.getTypeGraphAccess().getDoughnutEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getTypeGraphAccess().getDoughnutEnumLiteralDeclaration_9());
			}
		)
	)
;

// Rule comOperator
rulecomOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='<'
			{
				$current = grammarAccess.getComOperatorAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getComOperatorAccess().getInfEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='>'
			{
				$current = grammarAccess.getComOperatorAccess().getSupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getComOperatorAccess().getSupEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='=='
			{
				$current = grammarAccess.getComOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getComOperatorAccess().getEqualEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;