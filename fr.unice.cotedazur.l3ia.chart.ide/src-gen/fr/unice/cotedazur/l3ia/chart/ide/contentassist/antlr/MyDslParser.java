/*
 * generated by Xtext 2.25.0
 */
package fr.unice.cotedazur.l3ia.chart.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.cotedazur.l3ia.chart.ide.contentassist.antlr.internal.InternalMyDslParser;
import fr.unice.cotedazur.l3ia.chart.services.MyDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFilterConditionAccess().getAlternatives(), "rule__FilterCondition__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getTypeDonneesAccess().getAlternatives(), "rule__TypeDonnees__Alternatives");
			builder.put(grammarAccess.getTypeGraphAccess().getAlternatives(), "rule__TypeGraph__Alternatives");
			builder.put(grammarAccess.getComOperatorAccess().getAlternatives(), "rule__ComOperator__Alternatives");
			builder.put(grammarAccess.getProgrammeAccess().getGroup(), "rule__Programme__Group__0");
			builder.put(grammarAccess.getProgrammeAccess().getGroup_3(), "rule__Programme__Group_3__0");
			builder.put(grammarAccess.getProgrammeAccess().getGroup_3_3(), "rule__Programme__Group_3_3__0");
			builder.put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
			builder.put(grammarAccess.getFileAccess().getGroup_0(), "rule__File__Group_0__0");
			builder.put(grammarAccess.getFileAccess().getGroup_1(), "rule__File__Group_1__0");
			builder.put(grammarAccess.getFileAccess().getGroup_4(), "rule__File__Group_4__0");
			builder.put(grammarAccess.getHTMLFileAccess().getGroup(), "rule__HTMLFile__Group__0");
			builder.put(grammarAccess.getHTMLFileAccess().getGroup_1(), "rule__HTMLFile__Group_1__0");
			builder.put(grammarAccess.getExtractedDataAccess().getGroup(), "rule__ExtractedData__Group__0");
			builder.put(grammarAccess.getExtractedDataAccess().getGroup_3(), "rule__ExtractedData__Group_3__0");
			builder.put(grammarAccess.getExtractedDataAccess().getGroup_4(), "rule__ExtractedData__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
			builder.put(grammarAccess.getGraphAccess().getGroup_0(), "rule__Graph__Group_0__0");
			builder.put(grammarAccess.getGraphAccess().getGroup_1(), "rule__Graph__Group_1__0");
			builder.put(grammarAccess.getGraphAccess().getGroup_4(), "rule__Graph__Group_4__0");
			builder.put(grammarAccess.getGraphAccess().getGroup_4_2(), "rule__Graph__Group_4_2__0");
			builder.put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
			builder.put(grammarAccess.getConstantAccess().getGroup_3(), "rule__Constant__Group_3__0");
			builder.put(grammarAccess.getBinaryBooleanExpAccess().getGroup(), "rule__BinaryBooleanExp__Group__0");
			builder.put(grammarAccess.getColRefAccess().getGroup(), "rule__ColRef__Group__0");
			builder.put(grammarAccess.getProgrammeAccess().getInputAssignment_2(), "rule__Programme__InputAssignment_2");
			builder.put(grammarAccess.getProgrammeAccess().getFilterconditionAssignment_3_2(), "rule__Programme__FilterconditionAssignment_3_2");
			builder.put(grammarAccess.getProgrammeAccess().getFilterconditionAssignment_3_3_1(), "rule__Programme__FilterconditionAssignment_3_3_1");
			builder.put(grammarAccess.getProgrammeAccess().getOutputAssignment_4(), "rule__Programme__OutputAssignment_4");
			builder.put(grammarAccess.getFileAccess().getPathAssignment_0_1(), "rule__File__PathAssignment_0_1");
			builder.put(grammarAccess.getFileAccess().getDelimiterAssignment_1_1(), "rule__File__DelimiterAssignment_1_1");
			builder.put(grammarAccess.getFileAccess().getKeepAssignment_3(), "rule__File__KeepAssignment_3");
			builder.put(grammarAccess.getFileAccess().getKeepAssignment_4_1(), "rule__File__KeepAssignment_4_1");
			builder.put(grammarAccess.getHTMLFileAccess().getGraphAssignment_0(), "rule__HTMLFile__GraphAssignment_0");
			builder.put(grammarAccess.getHTMLFileAccess().getGraphAssignment_1_1(), "rule__HTMLFile__GraphAssignment_1_1");
			builder.put(grammarAccess.getExtractedDataAccess().getNameAssignment_2(), "rule__ExtractedData__NameAssignment_2");
			builder.put(grammarAccess.getExtractedDataAccess().getTypeDataAssignment_3_1(), "rule__ExtractedData__TypeDataAssignment_3_1");
			builder.put(grammarAccess.getExtractedDataAccess().getIndexAssignment_4_1(), "rule__ExtractedData__IndexAssignment_4_1");
			builder.put(grammarAccess.getGraphAccess().getTypeAssignment_0_1(), "rule__Graph__TypeAssignment_0_1");
			builder.put(grammarAccess.getGraphAccess().getTitleAssignment_1_1(), "rule__Graph__TitleAssignment_1_1");
			builder.put(grammarAccess.getGraphAccess().getXAxisAssignment_3(), "rule__Graph__XAxisAssignment_3");
			builder.put(grammarAccess.getGraphAccess().getYAxisAssignment_4_1(), "rule__Graph__YAxisAssignment_4_1");
			builder.put(grammarAccess.getGraphAccess().getYAxisAssignment_4_2_1(), "rule__Graph__YAxisAssignment_4_2_1");
			builder.put(grammarAccess.getConstantAccess().getTypeAssignment_2(), "rule__Constant__TypeAssignment_2");
			builder.put(grammarAccess.getConstantAccess().getValueAssignment_3_1(), "rule__Constant__ValueAssignment_3_1");
			builder.put(grammarAccess.getBinaryBooleanExpAccess().getLhsAssignment_1(), "rule__BinaryBooleanExp__LhsAssignment_1");
			builder.put(grammarAccess.getBinaryBooleanExpAccess().getOperatorAssignment_2(), "rule__BinaryBooleanExp__OperatorAssignment_2");
			builder.put(grammarAccess.getBinaryBooleanExpAccess().getRhsAssignment_3(), "rule__BinaryBooleanExp__RhsAssignment_3");
			builder.put(grammarAccess.getColRefAccess().getExtracteddataAssignment_1(), "rule__ColRef__ExtracteddataAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}