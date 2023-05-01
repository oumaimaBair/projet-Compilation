package fr.unice.cotedazur.l3ia.chart.ide.contentassist.antlr.internal;

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
import fr.unice.cotedazur.l3ia.chart.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'float'", "'Date'", "'BarChart'", "'AreaChart'", "'BubbleChart'", "'LineChart'", "'ScatterChart'", "'RadarChart'", "'MixedChartTypes'", "'PolarAreaChart'", "'Pie'", "'Doughnut'", "'<'", "'>'", "'=='", "'Programme'", "'{'", "'}'", "'where('", "')'", "'&&'", "'keep('", "'path='", "'delimiter='", "','", "'colName='", "':'", "'index='", "'-'", "'xAxis ='", "'type ='", "'title ='", "'yAxis = ('", "'Const'", "'='", "'('"
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
    public static final int T__48=48;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:53:1: entryRuleProgramme : ruleProgramme EOF ;
    public final void entryRuleProgramme() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgramme EOF )
            // InternalMyDsl.g:55:1: ruleProgramme EOF
            {
             before(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramme();

            state._fsp--;

             after(grammarAccess.getProgrammeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:62:1: ruleProgramme : ( ( rule__Programme__Group__0 ) ) ;
    public final void ruleProgramme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Programme__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Programme__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Programme__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Programme__Group__0 )
            {
             before(grammarAccess.getProgrammeAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Programme__Group__0 )
            // InternalMyDsl.g:69:4: rule__Programme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRulefilterCondition"
    // InternalMyDsl.g:78:1: entryRulefilterCondition : rulefilterCondition EOF ;
    public final void entryRulefilterCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( rulefilterCondition EOF )
            // InternalMyDsl.g:80:1: rulefilterCondition EOF
            {
             before(grammarAccess.getFilterConditionRule()); 
            pushFollow(FOLLOW_1);
            rulefilterCondition();

            state._fsp--;

             after(grammarAccess.getFilterConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefilterCondition"


    // $ANTLR start "rulefilterCondition"
    // InternalMyDsl.g:87:1: rulefilterCondition : ( ( rule__FilterCondition__Alternatives ) ) ;
    public final void rulefilterCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__FilterCondition__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__FilterCondition__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__FilterCondition__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__FilterCondition__Alternatives )
            {
             before(grammarAccess.getFilterConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__FilterCondition__Alternatives )
            // InternalMyDsl.g:94:4: rule__FilterCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefilterCondition"


    // $ANTLR start "entryRuleFile"
    // InternalMyDsl.g:103:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleFile EOF )
            // InternalMyDsl.g:105:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalMyDsl.g:112:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__File__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__File__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__File__Group__0 )
            // InternalMyDsl.g:119:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleHTMLFile"
    // InternalMyDsl.g:128:1: entryRuleHTMLFile : ruleHTMLFile EOF ;
    public final void entryRuleHTMLFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleHTMLFile EOF )
            // InternalMyDsl.g:130:1: ruleHTMLFile EOF
            {
             before(grammarAccess.getHTMLFileRule()); 
            pushFollow(FOLLOW_1);
            ruleHTMLFile();

            state._fsp--;

             after(grammarAccess.getHTMLFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHTMLFile"


    // $ANTLR start "ruleHTMLFile"
    // InternalMyDsl.g:137:1: ruleHTMLFile : ( ( rule__HTMLFile__Group__0 ) ) ;
    public final void ruleHTMLFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__HTMLFile__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__HTMLFile__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__HTMLFile__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__HTMLFile__Group__0 )
            {
             before(grammarAccess.getHTMLFileAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__HTMLFile__Group__0 )
            // InternalMyDsl.g:144:4: rule__HTMLFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HTMLFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHTMLFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTMLFile"


    // $ANTLR start "entryRuleextractedData"
    // InternalMyDsl.g:153:1: entryRuleextractedData : ruleextractedData EOF ;
    public final void entryRuleextractedData() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleextractedData EOF )
            // InternalMyDsl.g:155:1: ruleextractedData EOF
            {
             before(grammarAccess.getExtractedDataRule()); 
            pushFollow(FOLLOW_1);
            ruleextractedData();

            state._fsp--;

             after(grammarAccess.getExtractedDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleextractedData"


    // $ANTLR start "ruleextractedData"
    // InternalMyDsl.g:162:1: ruleextractedData : ( ( rule__ExtractedData__Group__0 ) ) ;
    public final void ruleextractedData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ExtractedData__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ExtractedData__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ExtractedData__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ExtractedData__Group__0 )
            {
             before(grammarAccess.getExtractedDataAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__ExtractedData__Group__0 )
            // InternalMyDsl.g:169:4: rule__ExtractedData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractedDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleextractedData"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEString EOF )
            // InternalMyDsl.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEInt EOF )
            // InternalMyDsl.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGraph"
    // InternalMyDsl.g:228:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleGraph EOF )
            // InternalMyDsl.g:230:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalMyDsl.g:237:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Graph__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Graph__Group__0 )
            // InternalMyDsl.g:244:4: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleConstant"
    // InternalMyDsl.g:253:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleConstant EOF )
            // InternalMyDsl.g:255:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMyDsl.g:262:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Constant__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Constant__Group__0 )
            // InternalMyDsl.g:269:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleBinaryBooleanExp"
    // InternalMyDsl.g:278:1: entryRuleBinaryBooleanExp : ruleBinaryBooleanExp EOF ;
    public final void entryRuleBinaryBooleanExp() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleBinaryBooleanExp EOF )
            // InternalMyDsl.g:280:1: ruleBinaryBooleanExp EOF
            {
             before(grammarAccess.getBinaryBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryBooleanExp();

            state._fsp--;

             after(grammarAccess.getBinaryBooleanExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryBooleanExp"


    // $ANTLR start "ruleBinaryBooleanExp"
    // InternalMyDsl.g:287:1: ruleBinaryBooleanExp : ( ( rule__BinaryBooleanExp__Group__0 ) ) ;
    public final void ruleBinaryBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__BinaryBooleanExp__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__BinaryBooleanExp__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__BinaryBooleanExp__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__BinaryBooleanExp__Group__0 )
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__BinaryBooleanExp__Group__0 )
            // InternalMyDsl.g:294:4: rule__BinaryBooleanExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBooleanExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryBooleanExp"


    // $ANTLR start "entryRulecolRef"
    // InternalMyDsl.g:303:1: entryRulecolRef : rulecolRef EOF ;
    public final void entryRulecolRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( rulecolRef EOF )
            // InternalMyDsl.g:305:1: rulecolRef EOF
            {
             before(grammarAccess.getColRefRule()); 
            pushFollow(FOLLOW_1);
            rulecolRef();

            state._fsp--;

             after(grammarAccess.getColRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecolRef"


    // $ANTLR start "rulecolRef"
    // InternalMyDsl.g:312:1: rulecolRef : ( ( rule__ColRef__Group__0 ) ) ;
    public final void rulecolRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ColRef__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ColRef__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ColRef__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ColRef__Group__0 )
            {
             before(grammarAccess.getColRefAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ColRef__Group__0 )
            // InternalMyDsl.g:319:4: rule__ColRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecolRef"


    // $ANTLR start "ruletypeDonnees"
    // InternalMyDsl.g:328:1: ruletypeDonnees : ( ( rule__TypeDonnees__Alternatives ) ) ;
    public final void ruletypeDonnees() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( ( rule__TypeDonnees__Alternatives ) ) )
            // InternalMyDsl.g:333:2: ( ( rule__TypeDonnees__Alternatives ) )
            {
            // InternalMyDsl.g:333:2: ( ( rule__TypeDonnees__Alternatives ) )
            // InternalMyDsl.g:334:3: ( rule__TypeDonnees__Alternatives )
            {
             before(grammarAccess.getTypeDonneesAccess().getAlternatives()); 
            // InternalMyDsl.g:335:3: ( rule__TypeDonnees__Alternatives )
            // InternalMyDsl.g:335:4: rule__TypeDonnees__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnees__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeDonneesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypeDonnees"


    // $ANTLR start "ruletypeGraph"
    // InternalMyDsl.g:344:1: ruletypeGraph : ( ( rule__TypeGraph__Alternatives ) ) ;
    public final void ruletypeGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( ( ( rule__TypeGraph__Alternatives ) ) )
            // InternalMyDsl.g:349:2: ( ( rule__TypeGraph__Alternatives ) )
            {
            // InternalMyDsl.g:349:2: ( ( rule__TypeGraph__Alternatives ) )
            // InternalMyDsl.g:350:3: ( rule__TypeGraph__Alternatives )
            {
             before(grammarAccess.getTypeGraphAccess().getAlternatives()); 
            // InternalMyDsl.g:351:3: ( rule__TypeGraph__Alternatives )
            // InternalMyDsl.g:351:4: rule__TypeGraph__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeGraph__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeGraphAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypeGraph"


    // $ANTLR start "rulecomOperator"
    // InternalMyDsl.g:360:1: rulecomOperator : ( ( rule__ComOperator__Alternatives ) ) ;
    public final void rulecomOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( ( ( rule__ComOperator__Alternatives ) ) )
            // InternalMyDsl.g:365:2: ( ( rule__ComOperator__Alternatives ) )
            {
            // InternalMyDsl.g:365:2: ( ( rule__ComOperator__Alternatives ) )
            // InternalMyDsl.g:366:3: ( rule__ComOperator__Alternatives )
            {
             before(grammarAccess.getComOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:367:3: ( rule__ComOperator__Alternatives )
            // InternalMyDsl.g:367:4: rule__ComOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecomOperator"


    // $ANTLR start "rule__FilterCondition__Alternatives"
    // InternalMyDsl.g:375:1: rule__FilterCondition__Alternatives : ( ( ruleConstant ) | ( ruleBinaryBooleanExp ) | ( rulecolRef ) );
    public final void rule__FilterCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( ( ruleConstant ) | ( ruleBinaryBooleanExp ) | ( rulecolRef ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt1=1;
                }
                break;
            case 48:
                {
                alt1=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case RULE_ID:
            case 25:
            case 26:
            case 27:
            case 32:
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:380:2: ( ruleConstant )
                    {
                    // InternalMyDsl.g:380:2: ( ruleConstant )
                    // InternalMyDsl.g:381:3: ruleConstant
                    {
                     before(grammarAccess.getFilterConditionAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getFilterConditionAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:386:2: ( ruleBinaryBooleanExp )
                    {
                    // InternalMyDsl.g:386:2: ( ruleBinaryBooleanExp )
                    // InternalMyDsl.g:387:3: ruleBinaryBooleanExp
                    {
                     before(grammarAccess.getFilterConditionAccess().getBinaryBooleanExpParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryBooleanExp();

                    state._fsp--;

                     after(grammarAccess.getFilterConditionAccess().getBinaryBooleanExpParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:392:2: ( rulecolRef )
                    {
                    // InternalMyDsl.g:392:2: ( rulecolRef )
                    // InternalMyDsl.g:393:3: rulecolRef
                    {
                     before(grammarAccess.getFilterConditionAccess().getColRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulecolRef();

                    state._fsp--;

                     after(grammarAccess.getFilterConditionAccess().getColRefParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterCondition__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:402:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:407:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:407:2: ( RULE_STRING )
                    // InternalMyDsl.g:408:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:413:2: ( RULE_ID )
                    // InternalMyDsl.g:414:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TypeDonnees__Alternatives"
    // InternalMyDsl.g:423:1: rule__TypeDonnees__Alternatives : ( ( ( 'int' ) ) | ( ( 'string' ) ) | ( ( 'float' ) ) | ( ( 'Date' ) ) );
    public final void rule__TypeDonnees__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( ( ( 'int' ) ) | ( ( 'string' ) ) | ( ( 'float' ) ) | ( ( 'Date' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:428:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:428:2: ( ( 'int' ) )
                    // InternalMyDsl.g:429:3: ( 'int' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:430:3: ( 'int' )
                    // InternalMyDsl.g:430:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:434:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:434:2: ( ( 'string' ) )
                    // InternalMyDsl.g:435:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getStringEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:436:3: ( 'string' )
                    // InternalMyDsl.g:436:4: 'string'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:440:2: ( ( 'float' ) )
                    {
                    // InternalMyDsl.g:440:2: ( ( 'float' ) )
                    // InternalMyDsl.g:441:3: ( 'float' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:442:3: ( 'float' )
                    // InternalMyDsl.g:442:4: 'float'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:446:2: ( ( 'Date' ) )
                    {
                    // InternalMyDsl.g:446:2: ( ( 'Date' ) )
                    // InternalMyDsl.g:447:3: ( 'Date' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:448:3: ( 'Date' )
                    // InternalMyDsl.g:448:4: 'Date'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnees__Alternatives"


    // $ANTLR start "rule__TypeGraph__Alternatives"
    // InternalMyDsl.g:456:1: rule__TypeGraph__Alternatives : ( ( ( 'BarChart' ) ) | ( ( 'AreaChart' ) ) | ( ( 'BubbleChart' ) ) | ( ( 'LineChart' ) ) | ( ( 'ScatterChart' ) ) | ( ( 'RadarChart' ) ) | ( ( 'MixedChartTypes' ) ) | ( ( 'PolarAreaChart' ) ) | ( ( 'Pie' ) ) | ( ( 'Doughnut' ) ) );
    public final void rule__TypeGraph__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( ( ( 'BarChart' ) ) | ( ( 'AreaChart' ) ) | ( ( 'BubbleChart' ) ) | ( ( 'LineChart' ) ) | ( ( 'ScatterChart' ) ) | ( ( 'RadarChart' ) ) | ( ( 'MixedChartTypes' ) ) | ( ( 'PolarAreaChart' ) ) | ( ( 'Pie' ) ) | ( ( 'Doughnut' ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            case 22:
                {
                alt4=8;
                }
                break;
            case 23:
                {
                alt4=9;
                }
                break;
            case 24:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:461:2: ( ( 'BarChart' ) )
                    {
                    // InternalMyDsl.g:461:2: ( ( 'BarChart' ) )
                    // InternalMyDsl.g:462:3: ( 'BarChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getBarChartEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:463:3: ( 'BarChart' )
                    // InternalMyDsl.g:463:4: 'BarChart'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getBarChartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:467:2: ( ( 'AreaChart' ) )
                    {
                    // InternalMyDsl.g:467:2: ( ( 'AreaChart' ) )
                    // InternalMyDsl.g:468:3: ( 'AreaChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getAreaChartEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:469:3: ( 'AreaChart' )
                    // InternalMyDsl.g:469:4: 'AreaChart'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getAreaChartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:473:2: ( ( 'BubbleChart' ) )
                    {
                    // InternalMyDsl.g:473:2: ( ( 'BubbleChart' ) )
                    // InternalMyDsl.g:474:3: ( 'BubbleChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getBubbleChartEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:475:3: ( 'BubbleChart' )
                    // InternalMyDsl.g:475:4: 'BubbleChart'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getBubbleChartEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:479:2: ( ( 'LineChart' ) )
                    {
                    // InternalMyDsl.g:479:2: ( ( 'LineChart' ) )
                    // InternalMyDsl.g:480:3: ( 'LineChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getLineChartEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:481:3: ( 'LineChart' )
                    // InternalMyDsl.g:481:4: 'LineChart'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getLineChartEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:485:2: ( ( 'ScatterChart' ) )
                    {
                    // InternalMyDsl.g:485:2: ( ( 'ScatterChart' ) )
                    // InternalMyDsl.g:486:3: ( 'ScatterChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getScatterChartEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:487:3: ( 'ScatterChart' )
                    // InternalMyDsl.g:487:4: 'ScatterChart'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getScatterChartEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:491:2: ( ( 'RadarChart' ) )
                    {
                    // InternalMyDsl.g:491:2: ( ( 'RadarChart' ) )
                    // InternalMyDsl.g:492:3: ( 'RadarChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getRadarChartEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:493:3: ( 'RadarChart' )
                    // InternalMyDsl.g:493:4: 'RadarChart'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getRadarChartEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:497:2: ( ( 'MixedChartTypes' ) )
                    {
                    // InternalMyDsl.g:497:2: ( ( 'MixedChartTypes' ) )
                    // InternalMyDsl.g:498:3: ( 'MixedChartTypes' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getMixedChartTypesEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:499:3: ( 'MixedChartTypes' )
                    // InternalMyDsl.g:499:4: 'MixedChartTypes'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getMixedChartTypesEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:503:2: ( ( 'PolarAreaChart' ) )
                    {
                    // InternalMyDsl.g:503:2: ( ( 'PolarAreaChart' ) )
                    // InternalMyDsl.g:504:3: ( 'PolarAreaChart' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getPolarAreaChartEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:505:3: ( 'PolarAreaChart' )
                    // InternalMyDsl.g:505:4: 'PolarAreaChart'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getPolarAreaChartEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:509:2: ( ( 'Pie' ) )
                    {
                    // InternalMyDsl.g:509:2: ( ( 'Pie' ) )
                    // InternalMyDsl.g:510:3: ( 'Pie' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getPieEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:511:3: ( 'Pie' )
                    // InternalMyDsl.g:511:4: 'Pie'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getPieEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:515:2: ( ( 'Doughnut' ) )
                    {
                    // InternalMyDsl.g:515:2: ( ( 'Doughnut' ) )
                    // InternalMyDsl.g:516:3: ( 'Doughnut' )
                    {
                     before(grammarAccess.getTypeGraphAccess().getDoughnutEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:517:3: ( 'Doughnut' )
                    // InternalMyDsl.g:517:4: 'Doughnut'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGraphAccess().getDoughnutEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeGraph__Alternatives"


    // $ANTLR start "rule__ComOperator__Alternatives"
    // InternalMyDsl.g:525:1: rule__ComOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) );
    public final void rule__ComOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:530:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:530:2: ( ( '<' ) )
                    // InternalMyDsl.g:531:3: ( '<' )
                    {
                     before(grammarAccess.getComOperatorAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:532:3: ( '<' )
                    // InternalMyDsl.g:532:4: '<'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getComOperatorAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:536:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:536:2: ( ( '>' ) )
                    // InternalMyDsl.g:537:3: ( '>' )
                    {
                     before(grammarAccess.getComOperatorAccess().getSupEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:538:3: ( '>' )
                    // InternalMyDsl.g:538:4: '>'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getComOperatorAccess().getSupEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:542:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:542:2: ( ( '==' ) )
                    // InternalMyDsl.g:543:3: ( '==' )
                    {
                     before(grammarAccess.getComOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:544:3: ( '==' )
                    // InternalMyDsl.g:544:4: '=='
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getComOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComOperator__Alternatives"


    // $ANTLR start "rule__Programme__Group__0"
    // InternalMyDsl.g:552:1: rule__Programme__Group__0 : rule__Programme__Group__0__Impl rule__Programme__Group__1 ;
    public final void rule__Programme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( rule__Programme__Group__0__Impl rule__Programme__Group__1 )
            // InternalMyDsl.g:557:2: rule__Programme__Group__0__Impl rule__Programme__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Programme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__0"


    // $ANTLR start "rule__Programme__Group__0__Impl"
    // InternalMyDsl.g:564:1: rule__Programme__Group__0__Impl : ( 'Programme' ) ;
    public final void rule__Programme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( 'Programme' ) )
            // InternalMyDsl.g:569:1: ( 'Programme' )
            {
            // InternalMyDsl.g:569:1: ( 'Programme' )
            // InternalMyDsl.g:570:2: 'Programme'
            {
             before(grammarAccess.getProgrammeAccess().getProgrammeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getProgrammeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__0__Impl"


    // $ANTLR start "rule__Programme__Group__1"
    // InternalMyDsl.g:579:1: rule__Programme__Group__1 : rule__Programme__Group__1__Impl rule__Programme__Group__2 ;
    public final void rule__Programme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( rule__Programme__Group__1__Impl rule__Programme__Group__2 )
            // InternalMyDsl.g:584:2: rule__Programme__Group__1__Impl rule__Programme__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Programme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__1"


    // $ANTLR start "rule__Programme__Group__1__Impl"
    // InternalMyDsl.g:591:1: rule__Programme__Group__1__Impl : ( '{' ) ;
    public final void rule__Programme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( '{' ) )
            // InternalMyDsl.g:596:1: ( '{' )
            {
            // InternalMyDsl.g:596:1: ( '{' )
            // InternalMyDsl.g:597:2: '{'
            {
             before(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__1__Impl"


    // $ANTLR start "rule__Programme__Group__2"
    // InternalMyDsl.g:606:1: rule__Programme__Group__2 : rule__Programme__Group__2__Impl rule__Programme__Group__3 ;
    public final void rule__Programme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( rule__Programme__Group__2__Impl rule__Programme__Group__3 )
            // InternalMyDsl.g:611:2: rule__Programme__Group__2__Impl rule__Programme__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__2"


    // $ANTLR start "rule__Programme__Group__2__Impl"
    // InternalMyDsl.g:618:1: rule__Programme__Group__2__Impl : ( ( rule__Programme__InputAssignment_2 ) ) ;
    public final void rule__Programme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( ( ( rule__Programme__InputAssignment_2 ) ) )
            // InternalMyDsl.g:623:1: ( ( rule__Programme__InputAssignment_2 ) )
            {
            // InternalMyDsl.g:623:1: ( ( rule__Programme__InputAssignment_2 ) )
            // InternalMyDsl.g:624:2: ( rule__Programme__InputAssignment_2 )
            {
             before(grammarAccess.getProgrammeAccess().getInputAssignment_2()); 
            // InternalMyDsl.g:625:2: ( rule__Programme__InputAssignment_2 )
            // InternalMyDsl.g:625:3: rule__Programme__InputAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Programme__InputAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getInputAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__2__Impl"


    // $ANTLR start "rule__Programme__Group__3"
    // InternalMyDsl.g:633:1: rule__Programme__Group__3 : rule__Programme__Group__3__Impl rule__Programme__Group__4 ;
    public final void rule__Programme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__Programme__Group__3__Impl rule__Programme__Group__4 )
            // InternalMyDsl.g:638:2: rule__Programme__Group__3__Impl rule__Programme__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__3"


    // $ANTLR start "rule__Programme__Group__3__Impl"
    // InternalMyDsl.g:645:1: rule__Programme__Group__3__Impl : ( ( rule__Programme__Group_3__0 )? ) ;
    public final void rule__Programme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( ( rule__Programme__Group_3__0 )? ) )
            // InternalMyDsl.g:650:1: ( ( rule__Programme__Group_3__0 )? )
            {
            // InternalMyDsl.g:650:1: ( ( rule__Programme__Group_3__0 )? )
            // InternalMyDsl.g:651:2: ( rule__Programme__Group_3__0 )?
            {
             before(grammarAccess.getProgrammeAccess().getGroup_3()); 
            // InternalMyDsl.g:652:2: ( rule__Programme__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:652:3: rule__Programme__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Programme__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgrammeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__3__Impl"


    // $ANTLR start "rule__Programme__Group__4"
    // InternalMyDsl.g:660:1: rule__Programme__Group__4 : rule__Programme__Group__4__Impl rule__Programme__Group__5 ;
    public final void rule__Programme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__Programme__Group__4__Impl rule__Programme__Group__5 )
            // InternalMyDsl.g:665:2: rule__Programme__Group__4__Impl rule__Programme__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Programme__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__4"


    // $ANTLR start "rule__Programme__Group__4__Impl"
    // InternalMyDsl.g:672:1: rule__Programme__Group__4__Impl : ( ( rule__Programme__OutputAssignment_4 ) ) ;
    public final void rule__Programme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( ( rule__Programme__OutputAssignment_4 ) ) )
            // InternalMyDsl.g:677:1: ( ( rule__Programme__OutputAssignment_4 ) )
            {
            // InternalMyDsl.g:677:1: ( ( rule__Programme__OutputAssignment_4 ) )
            // InternalMyDsl.g:678:2: ( rule__Programme__OutputAssignment_4 )
            {
             before(grammarAccess.getProgrammeAccess().getOutputAssignment_4()); 
            // InternalMyDsl.g:679:2: ( rule__Programme__OutputAssignment_4 )
            // InternalMyDsl.g:679:3: rule__Programme__OutputAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Programme__OutputAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getOutputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__4__Impl"


    // $ANTLR start "rule__Programme__Group__5"
    // InternalMyDsl.g:687:1: rule__Programme__Group__5 : rule__Programme__Group__5__Impl ;
    public final void rule__Programme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__Programme__Group__5__Impl )
            // InternalMyDsl.g:692:2: rule__Programme__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__5"


    // $ANTLR start "rule__Programme__Group__5__Impl"
    // InternalMyDsl.g:698:1: rule__Programme__Group__5__Impl : ( '}' ) ;
    public final void rule__Programme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( '}' ) )
            // InternalMyDsl.g:703:1: ( '}' )
            {
            // InternalMyDsl.g:703:1: ( '}' )
            // InternalMyDsl.g:704:2: '}'
            {
             before(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__5__Impl"


    // $ANTLR start "rule__Programme__Group_3__0"
    // InternalMyDsl.g:714:1: rule__Programme__Group_3__0 : rule__Programme__Group_3__0__Impl rule__Programme__Group_3__1 ;
    public final void rule__Programme__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__Programme__Group_3__0__Impl rule__Programme__Group_3__1 )
            // InternalMyDsl.g:719:2: rule__Programme__Group_3__0__Impl rule__Programme__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Programme__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__0"


    // $ANTLR start "rule__Programme__Group_3__0__Impl"
    // InternalMyDsl.g:726:1: rule__Programme__Group_3__0__Impl : ( 'where(' ) ;
    public final void rule__Programme__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( 'where(' ) )
            // InternalMyDsl.g:731:1: ( 'where(' )
            {
            // InternalMyDsl.g:731:1: ( 'where(' )
            // InternalMyDsl.g:732:2: 'where('
            {
             before(grammarAccess.getProgrammeAccess().getWhereKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getWhereKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__0__Impl"


    // $ANTLR start "rule__Programme__Group_3__1"
    // InternalMyDsl.g:741:1: rule__Programme__Group_3__1 : rule__Programme__Group_3__1__Impl rule__Programme__Group_3__2 ;
    public final void rule__Programme__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__Programme__Group_3__1__Impl rule__Programme__Group_3__2 )
            // InternalMyDsl.g:746:2: rule__Programme__Group_3__1__Impl rule__Programme__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__1"


    // $ANTLR start "rule__Programme__Group_3__1__Impl"
    // InternalMyDsl.g:753:1: rule__Programme__Group_3__1__Impl : ( ( rule__Programme__FilterconditionAssignment_3_1 ) ) ;
    public final void rule__Programme__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( ( rule__Programme__FilterconditionAssignment_3_1 ) ) )
            // InternalMyDsl.g:758:1: ( ( rule__Programme__FilterconditionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:758:1: ( ( rule__Programme__FilterconditionAssignment_3_1 ) )
            // InternalMyDsl.g:759:2: ( rule__Programme__FilterconditionAssignment_3_1 )
            {
             before(grammarAccess.getProgrammeAccess().getFilterconditionAssignment_3_1()); 
            // InternalMyDsl.g:760:2: ( rule__Programme__FilterconditionAssignment_3_1 )
            // InternalMyDsl.g:760:3: rule__Programme__FilterconditionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Programme__FilterconditionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getFilterconditionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__1__Impl"


    // $ANTLR start "rule__Programme__Group_3__2"
    // InternalMyDsl.g:768:1: rule__Programme__Group_3__2 : rule__Programme__Group_3__2__Impl rule__Programme__Group_3__3 ;
    public final void rule__Programme__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__Programme__Group_3__2__Impl rule__Programme__Group_3__3 )
            // InternalMyDsl.g:773:2: rule__Programme__Group_3__2__Impl rule__Programme__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__2"


    // $ANTLR start "rule__Programme__Group_3__2__Impl"
    // InternalMyDsl.g:780:1: rule__Programme__Group_3__2__Impl : ( ( rule__Programme__Group_3_2__0 )* ) ;
    public final void rule__Programme__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__Programme__Group_3_2__0 )* ) )
            // InternalMyDsl.g:785:1: ( ( rule__Programme__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:785:1: ( ( rule__Programme__Group_3_2__0 )* )
            // InternalMyDsl.g:786:2: ( rule__Programme__Group_3_2__0 )*
            {
             before(grammarAccess.getProgrammeAccess().getGroup_3_2()); 
            // InternalMyDsl.g:787:2: ( rule__Programme__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:787:3: rule__Programme__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Programme__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__2__Impl"


    // $ANTLR start "rule__Programme__Group_3__3"
    // InternalMyDsl.g:795:1: rule__Programme__Group_3__3 : rule__Programme__Group_3__3__Impl ;
    public final void rule__Programme__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__Programme__Group_3__3__Impl )
            // InternalMyDsl.g:800:2: rule__Programme__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__3"


    // $ANTLR start "rule__Programme__Group_3__3__Impl"
    // InternalMyDsl.g:806:1: rule__Programme__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Programme__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( ')' ) )
            // InternalMyDsl.g:811:1: ( ')' )
            {
            // InternalMyDsl.g:811:1: ( ')' )
            // InternalMyDsl.g:812:2: ')'
            {
             before(grammarAccess.getProgrammeAccess().getRightParenthesisKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3__3__Impl"


    // $ANTLR start "rule__Programme__Group_3_2__0"
    // InternalMyDsl.g:822:1: rule__Programme__Group_3_2__0 : rule__Programme__Group_3_2__0__Impl rule__Programme__Group_3_2__1 ;
    public final void rule__Programme__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__Programme__Group_3_2__0__Impl rule__Programme__Group_3_2__1 )
            // InternalMyDsl.g:827:2: rule__Programme__Group_3_2__0__Impl rule__Programme__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Programme__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3_2__0"


    // $ANTLR start "rule__Programme__Group_3_2__0__Impl"
    // InternalMyDsl.g:834:1: rule__Programme__Group_3_2__0__Impl : ( '&&' ) ;
    public final void rule__Programme__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( ( '&&' ) )
            // InternalMyDsl.g:839:1: ( '&&' )
            {
            // InternalMyDsl.g:839:1: ( '&&' )
            // InternalMyDsl.g:840:2: '&&'
            {
             before(grammarAccess.getProgrammeAccess().getAmpersandAmpersandKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getAmpersandAmpersandKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3_2__0__Impl"


    // $ANTLR start "rule__Programme__Group_3_2__1"
    // InternalMyDsl.g:849:1: rule__Programme__Group_3_2__1 : rule__Programme__Group_3_2__1__Impl ;
    public final void rule__Programme__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( rule__Programme__Group_3_2__1__Impl )
            // InternalMyDsl.g:854:2: rule__Programme__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3_2__1"


    // $ANTLR start "rule__Programme__Group_3_2__1__Impl"
    // InternalMyDsl.g:860:1: rule__Programme__Group_3_2__1__Impl : ( ( rule__Programme__FilterconditionAssignment_3_2_1 ) ) ;
    public final void rule__Programme__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( ( rule__Programme__FilterconditionAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:865:1: ( ( rule__Programme__FilterconditionAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:865:1: ( ( rule__Programme__FilterconditionAssignment_3_2_1 ) )
            // InternalMyDsl.g:866:2: ( rule__Programme__FilterconditionAssignment_3_2_1 )
            {
             before(grammarAccess.getProgrammeAccess().getFilterconditionAssignment_3_2_1()); 
            // InternalMyDsl.g:867:2: ( rule__Programme__FilterconditionAssignment_3_2_1 )
            // InternalMyDsl.g:867:3: rule__Programme__FilterconditionAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Programme__FilterconditionAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getFilterconditionAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_3_2__1__Impl"


    // $ANTLR start "rule__File__Group__0"
    // InternalMyDsl.g:876:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:881:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalMyDsl.g:888:1: rule__File__Group__0__Impl : ( ( rule__File__Group_0__0 )? ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( ( ( rule__File__Group_0__0 )? ) )
            // InternalMyDsl.g:893:1: ( ( rule__File__Group_0__0 )? )
            {
            // InternalMyDsl.g:893:1: ( ( rule__File__Group_0__0 )? )
            // InternalMyDsl.g:894:2: ( rule__File__Group_0__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_0()); 
            // InternalMyDsl.g:895:2: ( rule__File__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:895:3: rule__File__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__File__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalMyDsl.g:903:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalMyDsl.g:908:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalMyDsl.g:915:1: rule__File__Group__1__Impl : ( ( rule__File__Group_1__0 )? ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( ( rule__File__Group_1__0 )? ) )
            // InternalMyDsl.g:920:1: ( ( rule__File__Group_1__0 )? )
            {
            // InternalMyDsl.g:920:1: ( ( rule__File__Group_1__0 )? )
            // InternalMyDsl.g:921:2: ( rule__File__Group_1__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_1()); 
            // InternalMyDsl.g:922:2: ( rule__File__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:922:3: rule__File__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__File__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalMyDsl.g:930:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalMyDsl.g:935:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalMyDsl.g:942:1: rule__File__Group__2__Impl : ( 'keep(' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( 'keep(' ) )
            // InternalMyDsl.g:947:1: ( 'keep(' )
            {
            // InternalMyDsl.g:947:1: ( 'keep(' )
            // InternalMyDsl.g:948:2: 'keep('
            {
             before(grammarAccess.getFileAccess().getKeepKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getKeepKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalMyDsl.g:957:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // InternalMyDsl.g:962:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // InternalMyDsl.g:969:1: rule__File__Group__3__Impl : ( ( rule__File__KeepAssignment_3 ) ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ( rule__File__KeepAssignment_3 ) ) )
            // InternalMyDsl.g:974:1: ( ( rule__File__KeepAssignment_3 ) )
            {
            // InternalMyDsl.g:974:1: ( ( rule__File__KeepAssignment_3 ) )
            // InternalMyDsl.g:975:2: ( rule__File__KeepAssignment_3 )
            {
             before(grammarAccess.getFileAccess().getKeepAssignment_3()); 
            // InternalMyDsl.g:976:2: ( rule__File__KeepAssignment_3 )
            // InternalMyDsl.g:976:3: rule__File__KeepAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__File__KeepAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getKeepAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group__4"
    // InternalMyDsl.g:984:1: rule__File__Group__4 : rule__File__Group__4__Impl rule__File__Group__5 ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( rule__File__Group__4__Impl rule__File__Group__5 )
            // InternalMyDsl.g:989:2: rule__File__Group__4__Impl rule__File__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__File__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4"


    // $ANTLR start "rule__File__Group__4__Impl"
    // InternalMyDsl.g:996:1: rule__File__Group__4__Impl : ( ( rule__File__Group_4__0 )* ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__File__Group_4__0 )* ) )
            // InternalMyDsl.g:1001:1: ( ( rule__File__Group_4__0 )* )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__File__Group_4__0 )* )
            // InternalMyDsl.g:1002:2: ( rule__File__Group_4__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_4()); 
            // InternalMyDsl.g:1003:2: ( rule__File__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1003:3: rule__File__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__File__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4__Impl"


    // $ANTLR start "rule__File__Group__5"
    // InternalMyDsl.g:1011:1: rule__File__Group__5 : rule__File__Group__5__Impl ;
    public final void rule__File__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( rule__File__Group__5__Impl )
            // InternalMyDsl.g:1016:2: rule__File__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__5"


    // $ANTLR start "rule__File__Group__5__Impl"
    // InternalMyDsl.g:1022:1: rule__File__Group__5__Impl : ( ')' ) ;
    public final void rule__File__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ')' ) )
            // InternalMyDsl.g:1027:1: ( ')' )
            {
            // InternalMyDsl.g:1027:1: ( ')' )
            // InternalMyDsl.g:1028:2: ')'
            {
             before(grammarAccess.getFileAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__5__Impl"


    // $ANTLR start "rule__File__Group_0__0"
    // InternalMyDsl.g:1038:1: rule__File__Group_0__0 : rule__File__Group_0__0__Impl rule__File__Group_0__1 ;
    public final void rule__File__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( rule__File__Group_0__0__Impl rule__File__Group_0__1 )
            // InternalMyDsl.g:1043:2: rule__File__Group_0__0__Impl rule__File__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__File__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_0__0"


    // $ANTLR start "rule__File__Group_0__0__Impl"
    // InternalMyDsl.g:1050:1: rule__File__Group_0__0__Impl : ( 'path=' ) ;
    public final void rule__File__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( 'path=' ) )
            // InternalMyDsl.g:1055:1: ( 'path=' )
            {
            // InternalMyDsl.g:1055:1: ( 'path=' )
            // InternalMyDsl.g:1056:2: 'path='
            {
             before(grammarAccess.getFileAccess().getPathKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getPathKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_0__0__Impl"


    // $ANTLR start "rule__File__Group_0__1"
    // InternalMyDsl.g:1065:1: rule__File__Group_0__1 : rule__File__Group_0__1__Impl ;
    public final void rule__File__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( rule__File__Group_0__1__Impl )
            // InternalMyDsl.g:1070:2: rule__File__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_0__1"


    // $ANTLR start "rule__File__Group_0__1__Impl"
    // InternalMyDsl.g:1076:1: rule__File__Group_0__1__Impl : ( ( rule__File__PathAssignment_0_1 ) ) ;
    public final void rule__File__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__File__PathAssignment_0_1 ) ) )
            // InternalMyDsl.g:1081:1: ( ( rule__File__PathAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1081:1: ( ( rule__File__PathAssignment_0_1 ) )
            // InternalMyDsl.g:1082:2: ( rule__File__PathAssignment_0_1 )
            {
             before(grammarAccess.getFileAccess().getPathAssignment_0_1()); 
            // InternalMyDsl.g:1083:2: ( rule__File__PathAssignment_0_1 )
            // InternalMyDsl.g:1083:3: rule__File__PathAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__File__PathAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getPathAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_0__1__Impl"


    // $ANTLR start "rule__File__Group_1__0"
    // InternalMyDsl.g:1092:1: rule__File__Group_1__0 : rule__File__Group_1__0__Impl rule__File__Group_1__1 ;
    public final void rule__File__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( rule__File__Group_1__0__Impl rule__File__Group_1__1 )
            // InternalMyDsl.g:1097:2: rule__File__Group_1__0__Impl rule__File__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__File__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_1__0"


    // $ANTLR start "rule__File__Group_1__0__Impl"
    // InternalMyDsl.g:1104:1: rule__File__Group_1__0__Impl : ( 'delimiter=' ) ;
    public final void rule__File__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( 'delimiter=' ) )
            // InternalMyDsl.g:1109:1: ( 'delimiter=' )
            {
            // InternalMyDsl.g:1109:1: ( 'delimiter=' )
            // InternalMyDsl.g:1110:2: 'delimiter='
            {
             before(grammarAccess.getFileAccess().getDelimiterKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getDelimiterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_1__0__Impl"


    // $ANTLR start "rule__File__Group_1__1"
    // InternalMyDsl.g:1119:1: rule__File__Group_1__1 : rule__File__Group_1__1__Impl ;
    public final void rule__File__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( rule__File__Group_1__1__Impl )
            // InternalMyDsl.g:1124:2: rule__File__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_1__1"


    // $ANTLR start "rule__File__Group_1__1__Impl"
    // InternalMyDsl.g:1130:1: rule__File__Group_1__1__Impl : ( ( rule__File__DelimiterAssignment_1_1 ) ) ;
    public final void rule__File__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( ( rule__File__DelimiterAssignment_1_1 ) ) )
            // InternalMyDsl.g:1135:1: ( ( rule__File__DelimiterAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1135:1: ( ( rule__File__DelimiterAssignment_1_1 ) )
            // InternalMyDsl.g:1136:2: ( rule__File__DelimiterAssignment_1_1 )
            {
             before(grammarAccess.getFileAccess().getDelimiterAssignment_1_1()); 
            // InternalMyDsl.g:1137:2: ( rule__File__DelimiterAssignment_1_1 )
            // InternalMyDsl.g:1137:3: rule__File__DelimiterAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__File__DelimiterAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getDelimiterAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_1__1__Impl"


    // $ANTLR start "rule__File__Group_4__0"
    // InternalMyDsl.g:1146:1: rule__File__Group_4__0 : rule__File__Group_4__0__Impl rule__File__Group_4__1 ;
    public final void rule__File__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( rule__File__Group_4__0__Impl rule__File__Group_4__1 )
            // InternalMyDsl.g:1151:2: rule__File__Group_4__0__Impl rule__File__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__File__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__0"


    // $ANTLR start "rule__File__Group_4__0__Impl"
    // InternalMyDsl.g:1158:1: rule__File__Group_4__0__Impl : ( ',' ) ;
    public final void rule__File__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ',' ) )
            // InternalMyDsl.g:1163:1: ( ',' )
            {
            // InternalMyDsl.g:1163:1: ( ',' )
            // InternalMyDsl.g:1164:2: ','
            {
             before(grammarAccess.getFileAccess().getCommaKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__0__Impl"


    // $ANTLR start "rule__File__Group_4__1"
    // InternalMyDsl.g:1173:1: rule__File__Group_4__1 : rule__File__Group_4__1__Impl ;
    public final void rule__File__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( rule__File__Group_4__1__Impl )
            // InternalMyDsl.g:1178:2: rule__File__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__1"


    // $ANTLR start "rule__File__Group_4__1__Impl"
    // InternalMyDsl.g:1184:1: rule__File__Group_4__1__Impl : ( ( rule__File__KeepAssignment_4_1 ) ) ;
    public final void rule__File__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( ( rule__File__KeepAssignment_4_1 ) ) )
            // InternalMyDsl.g:1189:1: ( ( rule__File__KeepAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1189:1: ( ( rule__File__KeepAssignment_4_1 ) )
            // InternalMyDsl.g:1190:2: ( rule__File__KeepAssignment_4_1 )
            {
             before(grammarAccess.getFileAccess().getKeepAssignment_4_1()); 
            // InternalMyDsl.g:1191:2: ( rule__File__KeepAssignment_4_1 )
            // InternalMyDsl.g:1191:3: rule__File__KeepAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__File__KeepAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getKeepAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__1__Impl"


    // $ANTLR start "rule__HTMLFile__Group__0"
    // InternalMyDsl.g:1200:1: rule__HTMLFile__Group__0 : rule__HTMLFile__Group__0__Impl rule__HTMLFile__Group__1 ;
    public final void rule__HTMLFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( rule__HTMLFile__Group__0__Impl rule__HTMLFile__Group__1 )
            // InternalMyDsl.g:1205:2: rule__HTMLFile__Group__0__Impl rule__HTMLFile__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__HTMLFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTMLFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group__0"


    // $ANTLR start "rule__HTMLFile__Group__0__Impl"
    // InternalMyDsl.g:1212:1: rule__HTMLFile__Group__0__Impl : ( ( rule__HTMLFile__GraphAssignment_0 ) ) ;
    public final void rule__HTMLFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( ( rule__HTMLFile__GraphAssignment_0 ) ) )
            // InternalMyDsl.g:1217:1: ( ( rule__HTMLFile__GraphAssignment_0 ) )
            {
            // InternalMyDsl.g:1217:1: ( ( rule__HTMLFile__GraphAssignment_0 ) )
            // InternalMyDsl.g:1218:2: ( rule__HTMLFile__GraphAssignment_0 )
            {
             before(grammarAccess.getHTMLFileAccess().getGraphAssignment_0()); 
            // InternalMyDsl.g:1219:2: ( rule__HTMLFile__GraphAssignment_0 )
            // InternalMyDsl.g:1219:3: rule__HTMLFile__GraphAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HTMLFile__GraphAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHTMLFileAccess().getGraphAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group__0__Impl"


    // $ANTLR start "rule__HTMLFile__Group__1"
    // InternalMyDsl.g:1227:1: rule__HTMLFile__Group__1 : rule__HTMLFile__Group__1__Impl ;
    public final void rule__HTMLFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__HTMLFile__Group__1__Impl )
            // InternalMyDsl.g:1232:2: rule__HTMLFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HTMLFile__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group__1"


    // $ANTLR start "rule__HTMLFile__Group__1__Impl"
    // InternalMyDsl.g:1238:1: rule__HTMLFile__Group__1__Impl : ( ( rule__HTMLFile__Group_1__0 )* ) ;
    public final void rule__HTMLFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__HTMLFile__Group_1__0 )* ) )
            // InternalMyDsl.g:1243:1: ( ( rule__HTMLFile__Group_1__0 )* )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__HTMLFile__Group_1__0 )* )
            // InternalMyDsl.g:1244:2: ( rule__HTMLFile__Group_1__0 )*
            {
             before(grammarAccess.getHTMLFileAccess().getGroup_1()); 
            // InternalMyDsl.g:1245:2: ( rule__HTMLFile__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1245:3: rule__HTMLFile__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HTMLFile__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getHTMLFileAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group__1__Impl"


    // $ANTLR start "rule__HTMLFile__Group_1__0"
    // InternalMyDsl.g:1254:1: rule__HTMLFile__Group_1__0 : rule__HTMLFile__Group_1__0__Impl rule__HTMLFile__Group_1__1 ;
    public final void rule__HTMLFile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( rule__HTMLFile__Group_1__0__Impl rule__HTMLFile__Group_1__1 )
            // InternalMyDsl.g:1259:2: rule__HTMLFile__Group_1__0__Impl rule__HTMLFile__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__HTMLFile__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTMLFile__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group_1__0"


    // $ANTLR start "rule__HTMLFile__Group_1__0__Impl"
    // InternalMyDsl.g:1266:1: rule__HTMLFile__Group_1__0__Impl : ( ',' ) ;
    public final void rule__HTMLFile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ',' ) )
            // InternalMyDsl.g:1271:1: ( ',' )
            {
            // InternalMyDsl.g:1271:1: ( ',' )
            // InternalMyDsl.g:1272:2: ','
            {
             before(grammarAccess.getHTMLFileAccess().getCommaKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHTMLFileAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group_1__0__Impl"


    // $ANTLR start "rule__HTMLFile__Group_1__1"
    // InternalMyDsl.g:1281:1: rule__HTMLFile__Group_1__1 : rule__HTMLFile__Group_1__1__Impl ;
    public final void rule__HTMLFile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( rule__HTMLFile__Group_1__1__Impl )
            // InternalMyDsl.g:1286:2: rule__HTMLFile__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HTMLFile__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group_1__1"


    // $ANTLR start "rule__HTMLFile__Group_1__1__Impl"
    // InternalMyDsl.g:1292:1: rule__HTMLFile__Group_1__1__Impl : ( ( rule__HTMLFile__GraphAssignment_1_1 ) ) ;
    public final void rule__HTMLFile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( ( rule__HTMLFile__GraphAssignment_1_1 ) ) )
            // InternalMyDsl.g:1297:1: ( ( rule__HTMLFile__GraphAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1297:1: ( ( rule__HTMLFile__GraphAssignment_1_1 ) )
            // InternalMyDsl.g:1298:2: ( rule__HTMLFile__GraphAssignment_1_1 )
            {
             before(grammarAccess.getHTMLFileAccess().getGraphAssignment_1_1()); 
            // InternalMyDsl.g:1299:2: ( rule__HTMLFile__GraphAssignment_1_1 )
            // InternalMyDsl.g:1299:3: rule__HTMLFile__GraphAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HTMLFile__GraphAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHTMLFileAccess().getGraphAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__Group_1__1__Impl"


    // $ANTLR start "rule__ExtractedData__Group__0"
    // InternalMyDsl.g:1308:1: rule__ExtractedData__Group__0 : rule__ExtractedData__Group__0__Impl rule__ExtractedData__Group__1 ;
    public final void rule__ExtractedData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( rule__ExtractedData__Group__0__Impl rule__ExtractedData__Group__1 )
            // InternalMyDsl.g:1313:2: rule__ExtractedData__Group__0__Impl rule__ExtractedData__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExtractedData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__0"


    // $ANTLR start "rule__ExtractedData__Group__0__Impl"
    // InternalMyDsl.g:1320:1: rule__ExtractedData__Group__0__Impl : ( () ) ;
    public final void rule__ExtractedData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( () ) )
            // InternalMyDsl.g:1325:1: ( () )
            {
            // InternalMyDsl.g:1325:1: ( () )
            // InternalMyDsl.g:1326:2: ()
            {
             before(grammarAccess.getExtractedDataAccess().getExtractedDataAction_0()); 
            // InternalMyDsl.g:1327:2: ()
            // InternalMyDsl.g:1327:3: 
            {
            }

             after(grammarAccess.getExtractedDataAccess().getExtractedDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__0__Impl"


    // $ANTLR start "rule__ExtractedData__Group__1"
    // InternalMyDsl.g:1335:1: rule__ExtractedData__Group__1 : rule__ExtractedData__Group__1__Impl rule__ExtractedData__Group__2 ;
    public final void rule__ExtractedData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( rule__ExtractedData__Group__1__Impl rule__ExtractedData__Group__2 )
            // InternalMyDsl.g:1340:2: rule__ExtractedData__Group__1__Impl rule__ExtractedData__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExtractedData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__1"


    // $ANTLR start "rule__ExtractedData__Group__1__Impl"
    // InternalMyDsl.g:1347:1: rule__ExtractedData__Group__1__Impl : ( 'colName=' ) ;
    public final void rule__ExtractedData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( 'colName=' ) )
            // InternalMyDsl.g:1352:1: ( 'colName=' )
            {
            // InternalMyDsl.g:1352:1: ( 'colName=' )
            // InternalMyDsl.g:1353:2: 'colName='
            {
             before(grammarAccess.getExtractedDataAccess().getColNameKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExtractedDataAccess().getColNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__1__Impl"


    // $ANTLR start "rule__ExtractedData__Group__2"
    // InternalMyDsl.g:1362:1: rule__ExtractedData__Group__2 : rule__ExtractedData__Group__2__Impl rule__ExtractedData__Group__3 ;
    public final void rule__ExtractedData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( rule__ExtractedData__Group__2__Impl rule__ExtractedData__Group__3 )
            // InternalMyDsl.g:1367:2: rule__ExtractedData__Group__2__Impl rule__ExtractedData__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ExtractedData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__2"


    // $ANTLR start "rule__ExtractedData__Group__2__Impl"
    // InternalMyDsl.g:1374:1: rule__ExtractedData__Group__2__Impl : ( ( rule__ExtractedData__NameAssignment_2 ) ) ;
    public final void rule__ExtractedData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ( rule__ExtractedData__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1379:1: ( ( rule__ExtractedData__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1379:1: ( ( rule__ExtractedData__NameAssignment_2 ) )
            // InternalMyDsl.g:1380:2: ( rule__ExtractedData__NameAssignment_2 )
            {
             before(grammarAccess.getExtractedDataAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1381:2: ( rule__ExtractedData__NameAssignment_2 )
            // InternalMyDsl.g:1381:3: rule__ExtractedData__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractedDataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__2__Impl"


    // $ANTLR start "rule__ExtractedData__Group__3"
    // InternalMyDsl.g:1389:1: rule__ExtractedData__Group__3 : rule__ExtractedData__Group__3__Impl rule__ExtractedData__Group__4 ;
    public final void rule__ExtractedData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( rule__ExtractedData__Group__3__Impl rule__ExtractedData__Group__4 )
            // InternalMyDsl.g:1394:2: rule__ExtractedData__Group__3__Impl rule__ExtractedData__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ExtractedData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__3"


    // $ANTLR start "rule__ExtractedData__Group__3__Impl"
    // InternalMyDsl.g:1401:1: rule__ExtractedData__Group__3__Impl : ( ( rule__ExtractedData__Group_3__0 )? ) ;
    public final void rule__ExtractedData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( ( ( rule__ExtractedData__Group_3__0 )? ) )
            // InternalMyDsl.g:1406:1: ( ( rule__ExtractedData__Group_3__0 )? )
            {
            // InternalMyDsl.g:1406:1: ( ( rule__ExtractedData__Group_3__0 )? )
            // InternalMyDsl.g:1407:2: ( rule__ExtractedData__Group_3__0 )?
            {
             before(grammarAccess.getExtractedDataAccess().getGroup_3()); 
            // InternalMyDsl.g:1408:2: ( rule__ExtractedData__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1408:3: rule__ExtractedData__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtractedData__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractedDataAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__3__Impl"


    // $ANTLR start "rule__ExtractedData__Group__4"
    // InternalMyDsl.g:1416:1: rule__ExtractedData__Group__4 : rule__ExtractedData__Group__4__Impl ;
    public final void rule__ExtractedData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( rule__ExtractedData__Group__4__Impl )
            // InternalMyDsl.g:1421:2: rule__ExtractedData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__4"


    // $ANTLR start "rule__ExtractedData__Group__4__Impl"
    // InternalMyDsl.g:1427:1: rule__ExtractedData__Group__4__Impl : ( ( rule__ExtractedData__Group_4__0 )? ) ;
    public final void rule__ExtractedData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( ( rule__ExtractedData__Group_4__0 )? ) )
            // InternalMyDsl.g:1432:1: ( ( rule__ExtractedData__Group_4__0 )? )
            {
            // InternalMyDsl.g:1432:1: ( ( rule__ExtractedData__Group_4__0 )? )
            // InternalMyDsl.g:1433:2: ( rule__ExtractedData__Group_4__0 )?
            {
             before(grammarAccess.getExtractedDataAccess().getGroup_4()); 
            // InternalMyDsl.g:1434:2: ( rule__ExtractedData__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1434:3: rule__ExtractedData__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtractedData__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtractedDataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group__4__Impl"


    // $ANTLR start "rule__ExtractedData__Group_3__0"
    // InternalMyDsl.g:1443:1: rule__ExtractedData__Group_3__0 : rule__ExtractedData__Group_3__0__Impl rule__ExtractedData__Group_3__1 ;
    public final void rule__ExtractedData__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( rule__ExtractedData__Group_3__0__Impl rule__ExtractedData__Group_3__1 )
            // InternalMyDsl.g:1448:2: rule__ExtractedData__Group_3__0__Impl rule__ExtractedData__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ExtractedData__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_3__0"


    // $ANTLR start "rule__ExtractedData__Group_3__0__Impl"
    // InternalMyDsl.g:1455:1: rule__ExtractedData__Group_3__0__Impl : ( ':' ) ;
    public final void rule__ExtractedData__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( ( ':' ) )
            // InternalMyDsl.g:1460:1: ( ':' )
            {
            // InternalMyDsl.g:1460:1: ( ':' )
            // InternalMyDsl.g:1461:2: ':'
            {
             before(grammarAccess.getExtractedDataAccess().getColonKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExtractedDataAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_3__0__Impl"


    // $ANTLR start "rule__ExtractedData__Group_3__1"
    // InternalMyDsl.g:1470:1: rule__ExtractedData__Group_3__1 : rule__ExtractedData__Group_3__1__Impl ;
    public final void rule__ExtractedData__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( rule__ExtractedData__Group_3__1__Impl )
            // InternalMyDsl.g:1475:2: rule__ExtractedData__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_3__1"


    // $ANTLR start "rule__ExtractedData__Group_3__1__Impl"
    // InternalMyDsl.g:1481:1: rule__ExtractedData__Group_3__1__Impl : ( ( rule__ExtractedData__TypeDataAssignment_3_1 ) ) ;
    public final void rule__ExtractedData__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( ( rule__ExtractedData__TypeDataAssignment_3_1 ) ) )
            // InternalMyDsl.g:1486:1: ( ( rule__ExtractedData__TypeDataAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1486:1: ( ( rule__ExtractedData__TypeDataAssignment_3_1 ) )
            // InternalMyDsl.g:1487:2: ( rule__ExtractedData__TypeDataAssignment_3_1 )
            {
             before(grammarAccess.getExtractedDataAccess().getTypeDataAssignment_3_1()); 
            // InternalMyDsl.g:1488:2: ( rule__ExtractedData__TypeDataAssignment_3_1 )
            // InternalMyDsl.g:1488:3: rule__ExtractedData__TypeDataAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__TypeDataAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractedDataAccess().getTypeDataAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_3__1__Impl"


    // $ANTLR start "rule__ExtractedData__Group_4__0"
    // InternalMyDsl.g:1497:1: rule__ExtractedData__Group_4__0 : rule__ExtractedData__Group_4__0__Impl rule__ExtractedData__Group_4__1 ;
    public final void rule__ExtractedData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( rule__ExtractedData__Group_4__0__Impl rule__ExtractedData__Group_4__1 )
            // InternalMyDsl.g:1502:2: rule__ExtractedData__Group_4__0__Impl rule__ExtractedData__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__ExtractedData__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_4__0"


    // $ANTLR start "rule__ExtractedData__Group_4__0__Impl"
    // InternalMyDsl.g:1509:1: rule__ExtractedData__Group_4__0__Impl : ( 'index=' ) ;
    public final void rule__ExtractedData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( ( 'index=' ) )
            // InternalMyDsl.g:1514:1: ( 'index=' )
            {
            // InternalMyDsl.g:1514:1: ( 'index=' )
            // InternalMyDsl.g:1515:2: 'index='
            {
             before(grammarAccess.getExtractedDataAccess().getIndexKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getExtractedDataAccess().getIndexKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_4__0__Impl"


    // $ANTLR start "rule__ExtractedData__Group_4__1"
    // InternalMyDsl.g:1524:1: rule__ExtractedData__Group_4__1 : rule__ExtractedData__Group_4__1__Impl ;
    public final void rule__ExtractedData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( rule__ExtractedData__Group_4__1__Impl )
            // InternalMyDsl.g:1529:2: rule__ExtractedData__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_4__1"


    // $ANTLR start "rule__ExtractedData__Group_4__1__Impl"
    // InternalMyDsl.g:1535:1: rule__ExtractedData__Group_4__1__Impl : ( ( rule__ExtractedData__IndexAssignment_4_1 ) ) ;
    public final void rule__ExtractedData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ( rule__ExtractedData__IndexAssignment_4_1 ) ) )
            // InternalMyDsl.g:1540:1: ( ( rule__ExtractedData__IndexAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1540:1: ( ( rule__ExtractedData__IndexAssignment_4_1 ) )
            // InternalMyDsl.g:1541:2: ( rule__ExtractedData__IndexAssignment_4_1 )
            {
             before(grammarAccess.getExtractedDataAccess().getIndexAssignment_4_1()); 
            // InternalMyDsl.g:1542:2: ( rule__ExtractedData__IndexAssignment_4_1 )
            // InternalMyDsl.g:1542:3: rule__ExtractedData__IndexAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtractedData__IndexAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractedDataAccess().getIndexAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1551:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1556:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:1563:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1568:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1568:1: ( ( '-' )? )
            // InternalMyDsl.g:1569:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1570:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1570:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:1578:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1583:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:1589:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1594:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1594:1: ( RULE_INT )
            // InternalMyDsl.g:1595:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalMyDsl.g:1605:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalMyDsl.g:1610:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalMyDsl.g:1617:1: rule__Graph__Group__0__Impl : ( ( rule__Graph__Group_0__0 )? ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( ( rule__Graph__Group_0__0 )? ) )
            // InternalMyDsl.g:1622:1: ( ( rule__Graph__Group_0__0 )? )
            {
            // InternalMyDsl.g:1622:1: ( ( rule__Graph__Group_0__0 )? )
            // InternalMyDsl.g:1623:2: ( rule__Graph__Group_0__0 )?
            {
             before(grammarAccess.getGraphAccess().getGroup_0()); 
            // InternalMyDsl.g:1624:2: ( rule__Graph__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1624:3: rule__Graph__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Graph__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalMyDsl.g:1632:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalMyDsl.g:1637:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalMyDsl.g:1644:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__Group_1__0 )? ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( ( rule__Graph__Group_1__0 )? ) )
            // InternalMyDsl.g:1649:1: ( ( rule__Graph__Group_1__0 )? )
            {
            // InternalMyDsl.g:1649:1: ( ( rule__Graph__Group_1__0 )? )
            // InternalMyDsl.g:1650:2: ( rule__Graph__Group_1__0 )?
            {
             before(grammarAccess.getGraphAccess().getGroup_1()); 
            // InternalMyDsl.g:1651:2: ( rule__Graph__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1651:3: rule__Graph__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Graph__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__2"
    // InternalMyDsl.g:1659:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // InternalMyDsl.g:1664:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Graph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // InternalMyDsl.g:1671:1: rule__Graph__Group__2__Impl : ( 'xAxis =' ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( 'xAxis =' ) )
            // InternalMyDsl.g:1676:1: ( 'xAxis =' )
            {
            // InternalMyDsl.g:1676:1: ( 'xAxis =' )
            // InternalMyDsl.g:1677:2: 'xAxis ='
            {
             before(grammarAccess.getGraphAccess().getXAxisKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getXAxisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Graph__Group__3"
    // InternalMyDsl.g:1686:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // InternalMyDsl.g:1691:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Graph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3"


    // $ANTLR start "rule__Graph__Group__3__Impl"
    // InternalMyDsl.g:1698:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__XAxisAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( ( rule__Graph__XAxisAssignment_3 ) ) )
            // InternalMyDsl.g:1703:1: ( ( rule__Graph__XAxisAssignment_3 ) )
            {
            // InternalMyDsl.g:1703:1: ( ( rule__Graph__XAxisAssignment_3 ) )
            // InternalMyDsl.g:1704:2: ( rule__Graph__XAxisAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getXAxisAssignment_3()); 
            // InternalMyDsl.g:1705:2: ( rule__Graph__XAxisAssignment_3 )
            // InternalMyDsl.g:1705:3: rule__Graph__XAxisAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Graph__XAxisAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getXAxisAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3__Impl"


    // $ANTLR start "rule__Graph__Group__4"
    // InternalMyDsl.g:1713:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( rule__Graph__Group__4__Impl )
            // InternalMyDsl.g:1718:2: rule__Graph__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4"


    // $ANTLR start "rule__Graph__Group__4__Impl"
    // InternalMyDsl.g:1724:1: rule__Graph__Group__4__Impl : ( ( rule__Graph__Group_4__0 )? ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( ( rule__Graph__Group_4__0 )? ) )
            // InternalMyDsl.g:1729:1: ( ( rule__Graph__Group_4__0 )? )
            {
            // InternalMyDsl.g:1729:1: ( ( rule__Graph__Group_4__0 )? )
            // InternalMyDsl.g:1730:2: ( rule__Graph__Group_4__0 )?
            {
             before(grammarAccess.getGraphAccess().getGroup_4()); 
            // InternalMyDsl.g:1731:2: ( rule__Graph__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1731:3: rule__Graph__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Graph__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4__Impl"


    // $ANTLR start "rule__Graph__Group_0__0"
    // InternalMyDsl.g:1740:1: rule__Graph__Group_0__0 : rule__Graph__Group_0__0__Impl rule__Graph__Group_0__1 ;
    public final void rule__Graph__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__Graph__Group_0__0__Impl rule__Graph__Group_0__1 )
            // InternalMyDsl.g:1745:2: rule__Graph__Group_0__0__Impl rule__Graph__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Graph__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_0__0"


    // $ANTLR start "rule__Graph__Group_0__0__Impl"
    // InternalMyDsl.g:1752:1: rule__Graph__Group_0__0__Impl : ( 'type =' ) ;
    public final void rule__Graph__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( 'type =' ) )
            // InternalMyDsl.g:1757:1: ( 'type =' )
            {
            // InternalMyDsl.g:1757:1: ( 'type =' )
            // InternalMyDsl.g:1758:2: 'type ='
            {
             before(grammarAccess.getGraphAccess().getTypeKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_0__0__Impl"


    // $ANTLR start "rule__Graph__Group_0__1"
    // InternalMyDsl.g:1767:1: rule__Graph__Group_0__1 : rule__Graph__Group_0__1__Impl ;
    public final void rule__Graph__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( rule__Graph__Group_0__1__Impl )
            // InternalMyDsl.g:1772:2: rule__Graph__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_0__1"


    // $ANTLR start "rule__Graph__Group_0__1__Impl"
    // InternalMyDsl.g:1778:1: rule__Graph__Group_0__1__Impl : ( ( rule__Graph__TypeAssignment_0_1 ) ) ;
    public final void rule__Graph__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( ( rule__Graph__TypeAssignment_0_1 ) ) )
            // InternalMyDsl.g:1783:1: ( ( rule__Graph__TypeAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1783:1: ( ( rule__Graph__TypeAssignment_0_1 ) )
            // InternalMyDsl.g:1784:2: ( rule__Graph__TypeAssignment_0_1 )
            {
             before(grammarAccess.getGraphAccess().getTypeAssignment_0_1()); 
            // InternalMyDsl.g:1785:2: ( rule__Graph__TypeAssignment_0_1 )
            // InternalMyDsl.g:1785:3: rule__Graph__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_0__1__Impl"


    // $ANTLR start "rule__Graph__Group_1__0"
    // InternalMyDsl.g:1794:1: rule__Graph__Group_1__0 : rule__Graph__Group_1__0__Impl rule__Graph__Group_1__1 ;
    public final void rule__Graph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( rule__Graph__Group_1__0__Impl rule__Graph__Group_1__1 )
            // InternalMyDsl.g:1799:2: rule__Graph__Group_1__0__Impl rule__Graph__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Graph__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_1__0"


    // $ANTLR start "rule__Graph__Group_1__0__Impl"
    // InternalMyDsl.g:1806:1: rule__Graph__Group_1__0__Impl : ( 'title =' ) ;
    public final void rule__Graph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( ( 'title =' ) )
            // InternalMyDsl.g:1811:1: ( 'title =' )
            {
            // InternalMyDsl.g:1811:1: ( 'title =' )
            // InternalMyDsl.g:1812:2: 'title ='
            {
             before(grammarAccess.getGraphAccess().getTitleKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getTitleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_1__0__Impl"


    // $ANTLR start "rule__Graph__Group_1__1"
    // InternalMyDsl.g:1821:1: rule__Graph__Group_1__1 : rule__Graph__Group_1__1__Impl ;
    public final void rule__Graph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__Graph__Group_1__1__Impl )
            // InternalMyDsl.g:1826:2: rule__Graph__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_1__1"


    // $ANTLR start "rule__Graph__Group_1__1__Impl"
    // InternalMyDsl.g:1832:1: rule__Graph__Group_1__1__Impl : ( ( rule__Graph__TitleAssignment_1_1 ) ) ;
    public final void rule__Graph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( ( rule__Graph__TitleAssignment_1_1 ) ) )
            // InternalMyDsl.g:1837:1: ( ( rule__Graph__TitleAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1837:1: ( ( rule__Graph__TitleAssignment_1_1 ) )
            // InternalMyDsl.g:1838:2: ( rule__Graph__TitleAssignment_1_1 )
            {
             before(grammarAccess.getGraphAccess().getTitleAssignment_1_1()); 
            // InternalMyDsl.g:1839:2: ( rule__Graph__TitleAssignment_1_1 )
            // InternalMyDsl.g:1839:3: rule__Graph__TitleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__TitleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getTitleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_1__1__Impl"


    // $ANTLR start "rule__Graph__Group_4__0"
    // InternalMyDsl.g:1848:1: rule__Graph__Group_4__0 : rule__Graph__Group_4__0__Impl rule__Graph__Group_4__1 ;
    public final void rule__Graph__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( rule__Graph__Group_4__0__Impl rule__Graph__Group_4__1 )
            // InternalMyDsl.g:1853:2: rule__Graph__Group_4__0__Impl rule__Graph__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Graph__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__0"


    // $ANTLR start "rule__Graph__Group_4__0__Impl"
    // InternalMyDsl.g:1860:1: rule__Graph__Group_4__0__Impl : ( 'yAxis = (' ) ;
    public final void rule__Graph__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( 'yAxis = (' ) )
            // InternalMyDsl.g:1865:1: ( 'yAxis = (' )
            {
            // InternalMyDsl.g:1865:1: ( 'yAxis = (' )
            // InternalMyDsl.g:1866:2: 'yAxis = ('
            {
             before(grammarAccess.getGraphAccess().getYAxisKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getYAxisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__0__Impl"


    // $ANTLR start "rule__Graph__Group_4__1"
    // InternalMyDsl.g:1875:1: rule__Graph__Group_4__1 : rule__Graph__Group_4__1__Impl rule__Graph__Group_4__2 ;
    public final void rule__Graph__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( rule__Graph__Group_4__1__Impl rule__Graph__Group_4__2 )
            // InternalMyDsl.g:1880:2: rule__Graph__Group_4__1__Impl rule__Graph__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__1"


    // $ANTLR start "rule__Graph__Group_4__1__Impl"
    // InternalMyDsl.g:1887:1: rule__Graph__Group_4__1__Impl : ( ( rule__Graph__YAxisAssignment_4_1 ) ) ;
    public final void rule__Graph__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( ( ( rule__Graph__YAxisAssignment_4_1 ) ) )
            // InternalMyDsl.g:1892:1: ( ( rule__Graph__YAxisAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1892:1: ( ( rule__Graph__YAxisAssignment_4_1 ) )
            // InternalMyDsl.g:1893:2: ( rule__Graph__YAxisAssignment_4_1 )
            {
             before(grammarAccess.getGraphAccess().getYAxisAssignment_4_1()); 
            // InternalMyDsl.g:1894:2: ( rule__Graph__YAxisAssignment_4_1 )
            // InternalMyDsl.g:1894:3: rule__Graph__YAxisAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__YAxisAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getYAxisAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__1__Impl"


    // $ANTLR start "rule__Graph__Group_4__2"
    // InternalMyDsl.g:1902:1: rule__Graph__Group_4__2 : rule__Graph__Group_4__2__Impl rule__Graph__Group_4__3 ;
    public final void rule__Graph__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( rule__Graph__Group_4__2__Impl rule__Graph__Group_4__3 )
            // InternalMyDsl.g:1907:2: rule__Graph__Group_4__2__Impl rule__Graph__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Graph__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__2"


    // $ANTLR start "rule__Graph__Group_4__2__Impl"
    // InternalMyDsl.g:1914:1: rule__Graph__Group_4__2__Impl : ( ( rule__Graph__Group_4_2__0 )* ) ;
    public final void rule__Graph__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( ( rule__Graph__Group_4_2__0 )* ) )
            // InternalMyDsl.g:1919:1: ( ( rule__Graph__Group_4_2__0 )* )
            {
            // InternalMyDsl.g:1919:1: ( ( rule__Graph__Group_4_2__0 )* )
            // InternalMyDsl.g:1920:2: ( rule__Graph__Group_4_2__0 )*
            {
             before(grammarAccess.getGraphAccess().getGroup_4_2()); 
            // InternalMyDsl.g:1921:2: ( rule__Graph__Group_4_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1921:3: rule__Graph__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Graph__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__2__Impl"


    // $ANTLR start "rule__Graph__Group_4__3"
    // InternalMyDsl.g:1929:1: rule__Graph__Group_4__3 : rule__Graph__Group_4__3__Impl ;
    public final void rule__Graph__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( rule__Graph__Group_4__3__Impl )
            // InternalMyDsl.g:1934:2: rule__Graph__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__3"


    // $ANTLR start "rule__Graph__Group_4__3__Impl"
    // InternalMyDsl.g:1940:1: rule__Graph__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Graph__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( ')' ) )
            // InternalMyDsl.g:1945:1: ( ')' )
            {
            // InternalMyDsl.g:1945:1: ( ')' )
            // InternalMyDsl.g:1946:2: ')'
            {
             before(grammarAccess.getGraphAccess().getRightParenthesisKeyword_4_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4__3__Impl"


    // $ANTLR start "rule__Graph__Group_4_2__0"
    // InternalMyDsl.g:1956:1: rule__Graph__Group_4_2__0 : rule__Graph__Group_4_2__0__Impl rule__Graph__Group_4_2__1 ;
    public final void rule__Graph__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( rule__Graph__Group_4_2__0__Impl rule__Graph__Group_4_2__1 )
            // InternalMyDsl.g:1961:2: rule__Graph__Group_4_2__0__Impl rule__Graph__Group_4_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Graph__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4_2__0"


    // $ANTLR start "rule__Graph__Group_4_2__0__Impl"
    // InternalMyDsl.g:1968:1: rule__Graph__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Graph__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( ( ',' ) )
            // InternalMyDsl.g:1973:1: ( ',' )
            {
            // InternalMyDsl.g:1973:1: ( ',' )
            // InternalMyDsl.g:1974:2: ','
            {
             before(grammarAccess.getGraphAccess().getCommaKeyword_4_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4_2__0__Impl"


    // $ANTLR start "rule__Graph__Group_4_2__1"
    // InternalMyDsl.g:1983:1: rule__Graph__Group_4_2__1 : rule__Graph__Group_4_2__1__Impl ;
    public final void rule__Graph__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( rule__Graph__Group_4_2__1__Impl )
            // InternalMyDsl.g:1988:2: rule__Graph__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4_2__1"


    // $ANTLR start "rule__Graph__Group_4_2__1__Impl"
    // InternalMyDsl.g:1994:1: rule__Graph__Group_4_2__1__Impl : ( ( rule__Graph__YAxisAssignment_4_2_1 ) ) ;
    public final void rule__Graph__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( ( rule__Graph__YAxisAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:1999:1: ( ( rule__Graph__YAxisAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:1999:1: ( ( rule__Graph__YAxisAssignment_4_2_1 ) )
            // InternalMyDsl.g:2000:2: ( rule__Graph__YAxisAssignment_4_2_1 )
            {
             before(grammarAccess.getGraphAccess().getYAxisAssignment_4_2_1()); 
            // InternalMyDsl.g:2001:2: ( rule__Graph__YAxisAssignment_4_2_1 )
            // InternalMyDsl.g:2001:3: rule__Graph__YAxisAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__YAxisAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getYAxisAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group_4_2__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalMyDsl.g:2010:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalMyDsl.g:2015:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalMyDsl.g:2022:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( ( () ) )
            // InternalMyDsl.g:2027:1: ( () )
            {
            // InternalMyDsl.g:2027:1: ( () )
            // InternalMyDsl.g:2028:2: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            // InternalMyDsl.g:2029:2: ()
            // InternalMyDsl.g:2029:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalMyDsl.g:2037:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalMyDsl.g:2042:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalMyDsl.g:2049:1: rule__Constant__Group__1__Impl : ( 'Const' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( ( 'Const' ) )
            // InternalMyDsl.g:2054:1: ( 'Const' )
            {
            // InternalMyDsl.g:2054:1: ( 'Const' )
            // InternalMyDsl.g:2055:2: 'Const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalMyDsl.g:2064:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalMyDsl.g:2069:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalMyDsl.g:2076:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__TypeAssignment_2 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( ( ( rule__Constant__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:2081:1: ( ( rule__Constant__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:2081:1: ( ( rule__Constant__TypeAssignment_2 )? )
            // InternalMyDsl.g:2082:2: ( rule__Constant__TypeAssignment_2 )?
            {
             before(grammarAccess.getConstantAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:2083:2: ( rule__Constant__TypeAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=11 && LA19_0<=14)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2083:3: rule__Constant__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalMyDsl.g:2091:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( rule__Constant__Group__3__Impl )
            // InternalMyDsl.g:2096:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalMyDsl.g:2102:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__Group_3__0 )? ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( ( rule__Constant__Group_3__0 )? ) )
            // InternalMyDsl.g:2107:1: ( ( rule__Constant__Group_3__0 )? )
            {
            // InternalMyDsl.g:2107:1: ( ( rule__Constant__Group_3__0 )? )
            // InternalMyDsl.g:2108:2: ( rule__Constant__Group_3__0 )?
            {
             before(grammarAccess.getConstantAccess().getGroup_3()); 
            // InternalMyDsl.g:2109:2: ( rule__Constant__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2109:3: rule__Constant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group_3__0"
    // InternalMyDsl.g:2118:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalMyDsl.g:2123:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Constant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0"


    // $ANTLR start "rule__Constant__Group_3__0__Impl"
    // InternalMyDsl.g:2130:1: rule__Constant__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( ( '=' ) )
            // InternalMyDsl.g:2135:1: ( '=' )
            {
            // InternalMyDsl.g:2135:1: ( '=' )
            // InternalMyDsl.g:2136:2: '='
            {
             before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0__Impl"


    // $ANTLR start "rule__Constant__Group_3__1"
    // InternalMyDsl.g:2145:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( rule__Constant__Group_3__1__Impl )
            // InternalMyDsl.g:2150:2: rule__Constant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__1"


    // $ANTLR start "rule__Constant__Group_3__1__Impl"
    // InternalMyDsl.g:2156:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:2161:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2161:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:2162:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:2163:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalMyDsl.g:2163:3: rule__Constant__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__1__Impl"


    // $ANTLR start "rule__BinaryBooleanExp__Group__0"
    // InternalMyDsl.g:2172:1: rule__BinaryBooleanExp__Group__0 : rule__BinaryBooleanExp__Group__0__Impl rule__BinaryBooleanExp__Group__1 ;
    public final void rule__BinaryBooleanExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( rule__BinaryBooleanExp__Group__0__Impl rule__BinaryBooleanExp__Group__1 )
            // InternalMyDsl.g:2177:2: rule__BinaryBooleanExp__Group__0__Impl rule__BinaryBooleanExp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BinaryBooleanExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__0"


    // $ANTLR start "rule__BinaryBooleanExp__Group__0__Impl"
    // InternalMyDsl.g:2184:1: rule__BinaryBooleanExp__Group__0__Impl : ( '(' ) ;
    public final void rule__BinaryBooleanExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( '(' ) )
            // InternalMyDsl.g:2189:1: ( '(' )
            {
            // InternalMyDsl.g:2189:1: ( '(' )
            // InternalMyDsl.g:2190:2: '('
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBinaryBooleanExpAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__0__Impl"


    // $ANTLR start "rule__BinaryBooleanExp__Group__1"
    // InternalMyDsl.g:2199:1: rule__BinaryBooleanExp__Group__1 : rule__BinaryBooleanExp__Group__1__Impl rule__BinaryBooleanExp__Group__2 ;
    public final void rule__BinaryBooleanExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( rule__BinaryBooleanExp__Group__1__Impl rule__BinaryBooleanExp__Group__2 )
            // InternalMyDsl.g:2204:2: rule__BinaryBooleanExp__Group__1__Impl rule__BinaryBooleanExp__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__BinaryBooleanExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__1"


    // $ANTLR start "rule__BinaryBooleanExp__Group__1__Impl"
    // InternalMyDsl.g:2211:1: rule__BinaryBooleanExp__Group__1__Impl : ( ( rule__BinaryBooleanExp__LhsAssignment_1 ) ) ;
    public final void rule__BinaryBooleanExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( ( rule__BinaryBooleanExp__LhsAssignment_1 ) ) )
            // InternalMyDsl.g:2216:1: ( ( rule__BinaryBooleanExp__LhsAssignment_1 ) )
            {
            // InternalMyDsl.g:2216:1: ( ( rule__BinaryBooleanExp__LhsAssignment_1 ) )
            // InternalMyDsl.g:2217:2: ( rule__BinaryBooleanExp__LhsAssignment_1 )
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getLhsAssignment_1()); 
            // InternalMyDsl.g:2218:2: ( rule__BinaryBooleanExp__LhsAssignment_1 )
            // InternalMyDsl.g:2218:3: rule__BinaryBooleanExp__LhsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBooleanExpAccess().getLhsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__1__Impl"


    // $ANTLR start "rule__BinaryBooleanExp__Group__2"
    // InternalMyDsl.g:2226:1: rule__BinaryBooleanExp__Group__2 : rule__BinaryBooleanExp__Group__2__Impl rule__BinaryBooleanExp__Group__3 ;
    public final void rule__BinaryBooleanExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( rule__BinaryBooleanExp__Group__2__Impl rule__BinaryBooleanExp__Group__3 )
            // InternalMyDsl.g:2231:2: rule__BinaryBooleanExp__Group__2__Impl rule__BinaryBooleanExp__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__BinaryBooleanExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__2"


    // $ANTLR start "rule__BinaryBooleanExp__Group__2__Impl"
    // InternalMyDsl.g:2238:1: rule__BinaryBooleanExp__Group__2__Impl : ( ( rule__BinaryBooleanExp__OperatorAssignment_2 ) ) ;
    public final void rule__BinaryBooleanExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( ( rule__BinaryBooleanExp__OperatorAssignment_2 ) ) )
            // InternalMyDsl.g:2243:1: ( ( rule__BinaryBooleanExp__OperatorAssignment_2 ) )
            {
            // InternalMyDsl.g:2243:1: ( ( rule__BinaryBooleanExp__OperatorAssignment_2 ) )
            // InternalMyDsl.g:2244:2: ( rule__BinaryBooleanExp__OperatorAssignment_2 )
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getOperatorAssignment_2()); 
            // InternalMyDsl.g:2245:2: ( rule__BinaryBooleanExp__OperatorAssignment_2 )
            // InternalMyDsl.g:2245:3: rule__BinaryBooleanExp__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBooleanExpAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__2__Impl"


    // $ANTLR start "rule__BinaryBooleanExp__Group__3"
    // InternalMyDsl.g:2253:1: rule__BinaryBooleanExp__Group__3 : rule__BinaryBooleanExp__Group__3__Impl rule__BinaryBooleanExp__Group__4 ;
    public final void rule__BinaryBooleanExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( rule__BinaryBooleanExp__Group__3__Impl rule__BinaryBooleanExp__Group__4 )
            // InternalMyDsl.g:2258:2: rule__BinaryBooleanExp__Group__3__Impl rule__BinaryBooleanExp__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__BinaryBooleanExp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__3"


    // $ANTLR start "rule__BinaryBooleanExp__Group__3__Impl"
    // InternalMyDsl.g:2265:1: rule__BinaryBooleanExp__Group__3__Impl : ( ( rule__BinaryBooleanExp__RhsAssignment_3 ) ) ;
    public final void rule__BinaryBooleanExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( ( ( rule__BinaryBooleanExp__RhsAssignment_3 ) ) )
            // InternalMyDsl.g:2270:1: ( ( rule__BinaryBooleanExp__RhsAssignment_3 ) )
            {
            // InternalMyDsl.g:2270:1: ( ( rule__BinaryBooleanExp__RhsAssignment_3 ) )
            // InternalMyDsl.g:2271:2: ( rule__BinaryBooleanExp__RhsAssignment_3 )
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getRhsAssignment_3()); 
            // InternalMyDsl.g:2272:2: ( rule__BinaryBooleanExp__RhsAssignment_3 )
            // InternalMyDsl.g:2272:3: rule__BinaryBooleanExp__RhsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBooleanExpAccess().getRhsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__3__Impl"


    // $ANTLR start "rule__BinaryBooleanExp__Group__4"
    // InternalMyDsl.g:2280:1: rule__BinaryBooleanExp__Group__4 : rule__BinaryBooleanExp__Group__4__Impl ;
    public final void rule__BinaryBooleanExp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( rule__BinaryBooleanExp__Group__4__Impl )
            // InternalMyDsl.g:2285:2: rule__BinaryBooleanExp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanExp__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__4"


    // $ANTLR start "rule__BinaryBooleanExp__Group__4__Impl"
    // InternalMyDsl.g:2291:1: rule__BinaryBooleanExp__Group__4__Impl : ( ')' ) ;
    public final void rule__BinaryBooleanExp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ')' ) )
            // InternalMyDsl.g:2296:1: ( ')' )
            {
            // InternalMyDsl.g:2296:1: ( ')' )
            // InternalMyDsl.g:2297:2: ')'
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getRightParenthesisKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBinaryBooleanExpAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__Group__4__Impl"


    // $ANTLR start "rule__ColRef__Group__0"
    // InternalMyDsl.g:2307:1: rule__ColRef__Group__0 : rule__ColRef__Group__0__Impl rule__ColRef__Group__1 ;
    public final void rule__ColRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( rule__ColRef__Group__0__Impl rule__ColRef__Group__1 )
            // InternalMyDsl.g:2312:2: rule__ColRef__Group__0__Impl rule__ColRef__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ColRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColRef__Group__0"


    // $ANTLR start "rule__ColRef__Group__0__Impl"
    // InternalMyDsl.g:2319:1: rule__ColRef__Group__0__Impl : ( () ) ;
    public final void rule__ColRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( ( () ) )
            // InternalMyDsl.g:2324:1: ( () )
            {
            // InternalMyDsl.g:2324:1: ( () )
            // InternalMyDsl.g:2325:2: ()
            {
             before(grammarAccess.getColRefAccess().getColRefAction_0()); 
            // InternalMyDsl.g:2326:2: ()
            // InternalMyDsl.g:2326:3: 
            {
            }

             after(grammarAccess.getColRefAccess().getColRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColRef__Group__0__Impl"


    // $ANTLR start "rule__ColRef__Group__1"
    // InternalMyDsl.g:2334:1: rule__ColRef__Group__1 : rule__ColRef__Group__1__Impl ;
    public final void rule__ColRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( rule__ColRef__Group__1__Impl )
            // InternalMyDsl.g:2339:2: rule__ColRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColRef__Group__1"


    // $ANTLR start "rule__ColRef__Group__1__Impl"
    // InternalMyDsl.g:2345:1: rule__ColRef__Group__1__Impl : ( ( rule__ColRef__ExtracteddataAssignment_1 )? ) ;
    public final void rule__ColRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( ( ( rule__ColRef__ExtracteddataAssignment_1 )? ) )
            // InternalMyDsl.g:2350:1: ( ( rule__ColRef__ExtracteddataAssignment_1 )? )
            {
            // InternalMyDsl.g:2350:1: ( ( rule__ColRef__ExtracteddataAssignment_1 )? )
            // InternalMyDsl.g:2351:2: ( rule__ColRef__ExtracteddataAssignment_1 )?
            {
             before(grammarAccess.getColRefAccess().getExtracteddataAssignment_1()); 
            // InternalMyDsl.g:2352:2: ( rule__ColRef__ExtracteddataAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2352:3: rule__ColRef__ExtracteddataAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColRef__ExtracteddataAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColRefAccess().getExtracteddataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColRef__Group__1__Impl"


    // $ANTLR start "rule__Programme__InputAssignment_2"
    // InternalMyDsl.g:2361:1: rule__Programme__InputAssignment_2 : ( ruleFile ) ;
    public final void rule__Programme__InputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ruleFile ) )
            // InternalMyDsl.g:2366:2: ( ruleFile )
            {
            // InternalMyDsl.g:2366:2: ( ruleFile )
            // InternalMyDsl.g:2367:3: ruleFile
            {
             before(grammarAccess.getProgrammeAccess().getInputFileParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getInputFileParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__InputAssignment_2"


    // $ANTLR start "rule__Programme__FilterconditionAssignment_3_1"
    // InternalMyDsl.g:2376:1: rule__Programme__FilterconditionAssignment_3_1 : ( rulefilterCondition ) ;
    public final void rule__Programme__FilterconditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( ( rulefilterCondition ) )
            // InternalMyDsl.g:2381:2: ( rulefilterCondition )
            {
            // InternalMyDsl.g:2381:2: ( rulefilterCondition )
            // InternalMyDsl.g:2382:3: rulefilterCondition
            {
             before(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulefilterCondition();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__FilterconditionAssignment_3_1"


    // $ANTLR start "rule__Programme__FilterconditionAssignment_3_2_1"
    // InternalMyDsl.g:2391:1: rule__Programme__FilterconditionAssignment_3_2_1 : ( rulefilterCondition ) ;
    public final void rule__Programme__FilterconditionAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2395:1: ( ( rulefilterCondition ) )
            // InternalMyDsl.g:2396:2: ( rulefilterCondition )
            {
            // InternalMyDsl.g:2396:2: ( rulefilterCondition )
            // InternalMyDsl.g:2397:3: rulefilterCondition
            {
             before(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulefilterCondition();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getFilterconditionFilterConditionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__FilterconditionAssignment_3_2_1"


    // $ANTLR start "rule__Programme__OutputAssignment_4"
    // InternalMyDsl.g:2406:1: rule__Programme__OutputAssignment_4 : ( ruleHTMLFile ) ;
    public final void rule__Programme__OutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2410:1: ( ( ruleHTMLFile ) )
            // InternalMyDsl.g:2411:2: ( ruleHTMLFile )
            {
            // InternalMyDsl.g:2411:2: ( ruleHTMLFile )
            // InternalMyDsl.g:2412:3: ruleHTMLFile
            {
             before(grammarAccess.getProgrammeAccess().getOutputHTMLFileParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHTMLFile();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getOutputHTMLFileParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__OutputAssignment_4"


    // $ANTLR start "rule__File__PathAssignment_0_1"
    // InternalMyDsl.g:2421:1: rule__File__PathAssignment_0_1 : ( ruleEString ) ;
    public final void rule__File__PathAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2426:2: ( ruleEString )
            {
            // InternalMyDsl.g:2426:2: ( ruleEString )
            // InternalMyDsl.g:2427:3: ruleEString
            {
             before(grammarAccess.getFileAccess().getPathEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileAccess().getPathEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__PathAssignment_0_1"


    // $ANTLR start "rule__File__DelimiterAssignment_1_1"
    // InternalMyDsl.g:2436:1: rule__File__DelimiterAssignment_1_1 : ( ruleEString ) ;
    public final void rule__File__DelimiterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2441:2: ( ruleEString )
            {
            // InternalMyDsl.g:2441:2: ( ruleEString )
            // InternalMyDsl.g:2442:3: ruleEString
            {
             before(grammarAccess.getFileAccess().getDelimiterEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileAccess().getDelimiterEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__DelimiterAssignment_1_1"


    // $ANTLR start "rule__File__KeepAssignment_3"
    // InternalMyDsl.g:2451:1: rule__File__KeepAssignment_3 : ( ruleextractedData ) ;
    public final void rule__File__KeepAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( ( ruleextractedData ) )
            // InternalMyDsl.g:2456:2: ( ruleextractedData )
            {
            // InternalMyDsl.g:2456:2: ( ruleextractedData )
            // InternalMyDsl.g:2457:3: ruleextractedData
            {
             before(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleextractedData();

            state._fsp--;

             after(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__KeepAssignment_3"


    // $ANTLR start "rule__File__KeepAssignment_4_1"
    // InternalMyDsl.g:2466:1: rule__File__KeepAssignment_4_1 : ( ruleextractedData ) ;
    public final void rule__File__KeepAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( ( ruleextractedData ) )
            // InternalMyDsl.g:2471:2: ( ruleextractedData )
            {
            // InternalMyDsl.g:2471:2: ( ruleextractedData )
            // InternalMyDsl.g:2472:3: ruleextractedData
            {
             before(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleextractedData();

            state._fsp--;

             after(grammarAccess.getFileAccess().getKeepExtractedDataParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__KeepAssignment_4_1"


    // $ANTLR start "rule__HTMLFile__GraphAssignment_0"
    // InternalMyDsl.g:2481:1: rule__HTMLFile__GraphAssignment_0 : ( ruleGraph ) ;
    public final void rule__HTMLFile__GraphAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( ( ruleGraph ) )
            // InternalMyDsl.g:2486:2: ( ruleGraph )
            {
            // InternalMyDsl.g:2486:2: ( ruleGraph )
            // InternalMyDsl.g:2487:3: ruleGraph
            {
             before(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__GraphAssignment_0"


    // $ANTLR start "rule__HTMLFile__GraphAssignment_1_1"
    // InternalMyDsl.g:2496:1: rule__HTMLFile__GraphAssignment_1_1 : ( ruleGraph ) ;
    public final void rule__HTMLFile__GraphAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( ( ruleGraph ) )
            // InternalMyDsl.g:2501:2: ( ruleGraph )
            {
            // InternalMyDsl.g:2501:2: ( ruleGraph )
            // InternalMyDsl.g:2502:3: ruleGraph
            {
             before(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getHTMLFileAccess().getGraphGraphParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLFile__GraphAssignment_1_1"


    // $ANTLR start "rule__ExtractedData__NameAssignment_2"
    // InternalMyDsl.g:2511:1: rule__ExtractedData__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExtractedData__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2516:2: ( ruleEString )
            {
            // InternalMyDsl.g:2516:2: ( ruleEString )
            // InternalMyDsl.g:2517:3: ruleEString
            {
             before(grammarAccess.getExtractedDataAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExtractedDataAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__NameAssignment_2"


    // $ANTLR start "rule__ExtractedData__TypeDataAssignment_3_1"
    // InternalMyDsl.g:2526:1: rule__ExtractedData__TypeDataAssignment_3_1 : ( ruletypeDonnees ) ;
    public final void rule__ExtractedData__TypeDataAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2530:1: ( ( ruletypeDonnees ) )
            // InternalMyDsl.g:2531:2: ( ruletypeDonnees )
            {
            // InternalMyDsl.g:2531:2: ( ruletypeDonnees )
            // InternalMyDsl.g:2532:3: ruletypeDonnees
            {
             before(grammarAccess.getExtractedDataAccess().getTypeDataTypeDonneesEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruletypeDonnees();

            state._fsp--;

             after(grammarAccess.getExtractedDataAccess().getTypeDataTypeDonneesEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__TypeDataAssignment_3_1"


    // $ANTLR start "rule__ExtractedData__IndexAssignment_4_1"
    // InternalMyDsl.g:2541:1: rule__ExtractedData__IndexAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ExtractedData__IndexAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2546:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2546:2: ( ruleEInt )
            // InternalMyDsl.g:2547:3: ruleEInt
            {
             before(grammarAccess.getExtractedDataAccess().getIndexEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExtractedDataAccess().getIndexEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractedData__IndexAssignment_4_1"


    // $ANTLR start "rule__Graph__TypeAssignment_0_1"
    // InternalMyDsl.g:2556:1: rule__Graph__TypeAssignment_0_1 : ( ruletypeGraph ) ;
    public final void rule__Graph__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( ( ruletypeGraph ) )
            // InternalMyDsl.g:2561:2: ( ruletypeGraph )
            {
            // InternalMyDsl.g:2561:2: ( ruletypeGraph )
            // InternalMyDsl.g:2562:3: ruletypeGraph
            {
             before(grammarAccess.getGraphAccess().getTypeTypeGraphEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruletypeGraph();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getTypeTypeGraphEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__TypeAssignment_0_1"


    // $ANTLR start "rule__Graph__TitleAssignment_1_1"
    // InternalMyDsl.g:2571:1: rule__Graph__TitleAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Graph__TitleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2576:2: ( ruleEString )
            {
            // InternalMyDsl.g:2576:2: ( ruleEString )
            // InternalMyDsl.g:2577:3: ruleEString
            {
             before(grammarAccess.getGraphAccess().getTitleEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getTitleEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__TitleAssignment_1_1"


    // $ANTLR start "rule__Graph__XAxisAssignment_3"
    // InternalMyDsl.g:2586:1: rule__Graph__XAxisAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Graph__XAxisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2591:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2591:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2592:3: ( ruleEString )
            {
             before(grammarAccess.getGraphAccess().getXAxisExtractedDataCrossReference_3_0()); 
            // InternalMyDsl.g:2593:3: ( ruleEString )
            // InternalMyDsl.g:2594:4: ruleEString
            {
             before(grammarAccess.getGraphAccess().getXAxisExtractedDataEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getXAxisExtractedDataEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGraphAccess().getXAxisExtractedDataCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__XAxisAssignment_3"


    // $ANTLR start "rule__Graph__YAxisAssignment_4_1"
    // InternalMyDsl.g:2605:1: rule__Graph__YAxisAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Graph__YAxisAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2610:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2610:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2611:3: ( ruleEString )
            {
             before(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_1_0()); 
            // InternalMyDsl.g:2612:3: ( ruleEString )
            // InternalMyDsl.g:2613:4: ruleEString
            {
             before(grammarAccess.getGraphAccess().getYAxisExtractedDataEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getYAxisExtractedDataEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__YAxisAssignment_4_1"


    // $ANTLR start "rule__Graph__YAxisAssignment_4_2_1"
    // InternalMyDsl.g:2624:1: rule__Graph__YAxisAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Graph__YAxisAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2629:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2629:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2630:3: ( ruleEString )
            {
             before(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_2_1_0()); 
            // InternalMyDsl.g:2631:3: ( ruleEString )
            // InternalMyDsl.g:2632:4: ruleEString
            {
             before(grammarAccess.getGraphAccess().getYAxisExtractedDataEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getYAxisExtractedDataEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getGraphAccess().getYAxisExtractedDataCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__YAxisAssignment_4_2_1"


    // $ANTLR start "rule__Constant__TypeAssignment_2"
    // InternalMyDsl.g:2643:1: rule__Constant__TypeAssignment_2 : ( ruletypeDonnees ) ;
    public final void rule__Constant__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( ( ruletypeDonnees ) )
            // InternalMyDsl.g:2648:2: ( ruletypeDonnees )
            {
            // InternalMyDsl.g:2648:2: ( ruletypeDonnees )
            // InternalMyDsl.g:2649:3: ruletypeDonnees
            {
             before(grammarAccess.getConstantAccess().getTypeTypeDonneesEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletypeDonnees();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getTypeTypeDonneesEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__TypeAssignment_2"


    // $ANTLR start "rule__Constant__ValueAssignment_3_1"
    // InternalMyDsl.g:2658:1: rule__Constant__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2663:2: ( ruleEString )
            {
            // InternalMyDsl.g:2663:2: ( ruleEString )
            // InternalMyDsl.g:2664:3: ruleEString
            {
             before(grammarAccess.getConstantAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_3_1"


    // $ANTLR start "rule__BinaryBooleanExp__LhsAssignment_1"
    // InternalMyDsl.g:2673:1: rule__BinaryBooleanExp__LhsAssignment_1 : ( rulefilterCondition ) ;
    public final void rule__BinaryBooleanExp__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2677:1: ( ( rulefilterCondition ) )
            // InternalMyDsl.g:2678:2: ( rulefilterCondition )
            {
            // InternalMyDsl.g:2678:2: ( rulefilterCondition )
            // InternalMyDsl.g:2679:3: rulefilterCondition
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getLhsFilterConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefilterCondition();

            state._fsp--;

             after(grammarAccess.getBinaryBooleanExpAccess().getLhsFilterConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__LhsAssignment_1"


    // $ANTLR start "rule__BinaryBooleanExp__OperatorAssignment_2"
    // InternalMyDsl.g:2688:1: rule__BinaryBooleanExp__OperatorAssignment_2 : ( rulecomOperator ) ;
    public final void rule__BinaryBooleanExp__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2692:1: ( ( rulecomOperator ) )
            // InternalMyDsl.g:2693:2: ( rulecomOperator )
            {
            // InternalMyDsl.g:2693:2: ( rulecomOperator )
            // InternalMyDsl.g:2694:3: rulecomOperator
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getOperatorComOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulecomOperator();

            state._fsp--;

             after(grammarAccess.getBinaryBooleanExpAccess().getOperatorComOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__OperatorAssignment_2"


    // $ANTLR start "rule__BinaryBooleanExp__RhsAssignment_3"
    // InternalMyDsl.g:2703:1: rule__BinaryBooleanExp__RhsAssignment_3 : ( rulefilterCondition ) ;
    public final void rule__BinaryBooleanExp__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2707:1: ( ( rulefilterCondition ) )
            // InternalMyDsl.g:2708:2: ( rulefilterCondition )
            {
            // InternalMyDsl.g:2708:2: ( rulefilterCondition )
            // InternalMyDsl.g:2709:3: rulefilterCondition
            {
             before(grammarAccess.getBinaryBooleanExpAccess().getRhsFilterConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulefilterCondition();

            state._fsp--;

             after(grammarAccess.getBinaryBooleanExpAccess().getRhsFilterConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBooleanExp__RhsAssignment_3"


    // $ANTLR start "rule__ColRef__ExtracteddataAssignment_1"
    // InternalMyDsl.g:2718:1: rule__ColRef__ExtracteddataAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__ColRef__ExtracteddataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2723:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2723:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2724:3: ( ruleEString )
            {
             before(grammarAccess.getColRefAccess().getExtracteddataExtractedDataCrossReference_1_0()); 
            // InternalMyDsl.g:2725:3: ( ruleEString )
            // InternalMyDsl.g:2726:4: ruleEString
            {
             before(grammarAccess.getColRefAccess().getExtracteddataExtractedDataEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColRefAccess().getExtracteddataExtractedDataEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getColRefAccess().getExtracteddataExtractedDataCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColRef__ExtracteddataAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00001C0080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001400000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001FF8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000007800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}