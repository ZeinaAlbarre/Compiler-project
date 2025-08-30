// Generated from D:/java/CompilerProject/src/Antlr/ParserAng.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserAng extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, FROM=2, FUNCTION=3, RETURN=4, EXPORT=5, DEFAULT=6, INTERFACE=7, 
		CONST=8, CLASS=9, EXTENDS=10, IMPLEMENTS=11, VAR=12, LET=13, OF=14, ASYNC=15, 
		AT=16, AS=17, NULL=18, SELECTOR=19, TEMPLATE=20, STYLE_URLS=21, STYLES=22, 
		VIEW_PROVIDERS=23, ANIMATIONS=24, ENCAPSULATION=25, CHANGE_DETECTION=26, 
		PRESERVE_WHITESPACES=27, INTERPOLATION=28, PUBLIC=29, PRIVATE=30, PROTECTED=31, 
		CONSTRUCTOR=32, FOR=33, IF=34, ELSE=35, AND=36, OR=37, EQUALS=38, NOT_EQUALS=39, 
		MULTIPLY=40, DIVIDE=41, PLUS=42, MINUS=43, ASSIGN=44, ROUNDABOUT=45, SPREAD=46, 
		STRICT_EQUALS=47, STRICT_NOT_EQUALS=48, NO=49, HASH=50, NG_FOR=51, NG_IF=52, 
		NG_SWITCH=53, NG_SWITCH_CASE=54, NG_SWITCH_DEFAULT=55, NG_CLASS=56, NG_STYLE=57, 
		NG_CLASS_BINDING=58, NG_STYLE_BINDING=59, NG_MODEL_BINDING=60, LPAREN=61, 
		RPAREN=62, LBRACKET=63, RBRACKET=64, LBRACE=65, RBRACE=66, LESS_THAN=67, 
		GREATER_THAN=68, COLON=69, SEMICOLON=70, DOT=71, COMMA=72, BACKTICK=73, 
		ARROW=74, OPTIONAL_CHAIN=75, HTML_TAG_OPEN=76, HTML_TAG_CLOSE=77, HTML_TAG_OPEN_Q=78, 
		HTML_TAG_CLOSE_Q=79, HTML_TAG_CLOSE_RIGHT=80, DIV=81, IDENTIFIER=82, STRING_LITERAL=83, 
		DECIMAL_LITERAL=84, BOOLEAN_LITERAL=85, NULL_LITERAL=86, WS=87, SINGLE_LINE_COMMENT=88, 
		MULTI_LINE_COMMENT=89, COMPONENT=90, INJECTABLE=91, INPUT=92, OUTPUT=93, 
		HOST_LISTENER=94, HOST_BINDING=95, VIEW_CHILD=96, CONTENT_CHILD=97, PIPE=98, 
		DIRECTIVE=99, NG_MODULE=100, ALLPAREN=101, CSS_UNIT=102, DOUBLE_QUOTE=103, 
		SINGLE_QUOTE=104, ESC=105, ON=106;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_importStatement = 3, 
		RULE_exportStatement = 4, RULE_interfaceDeclaration = 5, RULE_interfaceProperty = 6, 
		RULE_classDeclaration = 7, RULE_classMember = 8, RULE_functionDeclaration = 9, 
		RULE_decorator = 10, RULE_decoratorArguments = 11, RULE_componentDeclaration = 12, 
		RULE_componentMetadata = 13, RULE_componentProperty = 14, RULE_selectorProperty = 15, 
		RULE_templateProperty = 16, RULE_styleProperty = 17, RULE_styleContent = 18, 
		RULE_propertyDeclaration = 19, RULE_methodDeclaration = 20, RULE_constructorDeclaration = 21, 
		RULE_templateString = 22, RULE_templateContent = 23, RULE_templatePart = 24, 
		RULE_expression = 25, RULE_onExpression = 26, RULE_arrowFunction = 27, 
		RULE_arrowParams = 28, RULE_arrowParam = 29, RULE_destructuredObject = 30, 
		RULE_destructuredProperty = 31, RULE_arrowBody = 32, RULE_typeArguments = 33, 
		RULE_primaryExpression = 34, RULE_typeAnnotation = 35, RULE_literal = 36, 
		RULE_arrayLiteral = 37, RULE_objectLiteral = 38, RULE_propertyAssignment = 39, 
		RULE_expressionStatement = 40, RULE_ifStatement = 41, RULE_forStatement = 42, 
		RULE_forInitializer = 43, RULE_returnStatement = 44, RULE_variableStatement = 45, 
		RULE_variableDeclaration = 46, RULE_parameterList = 47, RULE_parameter = 48, 
		RULE_argumentList = 49, RULE_objectType = 50, RULE_objectTypeMember = 51, 
		RULE_ngDirective = 52, RULE_ngForDirective = 53, RULE_ngIfDirective = 54, 
		RULE_ngSwitchDirective = 55, RULE_ngClassDirective = 56, RULE_ngStyleDirective = 57, 
		RULE_ngModelDirective = 58, RULE_htmlTemplate = 59, RULE_htmlElement = 60, 
		RULE_htmlTag = 61, RULE_htmlAttribute = 62, RULE_attributeValue = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "importStatement", "exportStatement", 
			"interfaceDeclaration", "interfaceProperty", "classDeclaration", "classMember", 
			"functionDeclaration", "decorator", "decoratorArguments", "componentDeclaration", 
			"componentMetadata", "componentProperty", "selectorProperty", "templateProperty", 
			"styleProperty", "styleContent", "propertyDeclaration", "methodDeclaration", 
			"constructorDeclaration", "templateString", "templateContent", "templatePart", 
			"expression", "onExpression", "arrowFunction", "arrowParams", "arrowParam", 
			"destructuredObject", "destructuredProperty", "arrowBody", "typeArguments", 
			"primaryExpression", "typeAnnotation", "literal", "arrayLiteral", "objectLiteral", 
			"propertyAssignment", "expressionStatement", "ifStatement", "forStatement", 
			"forInitializer", "returnStatement", "variableStatement", "variableDeclaration", 
			"parameterList", "parameter", "argumentList", "objectType", "objectTypeMember", 
			"ngDirective", "ngForDirective", "ngIfDirective", "ngSwitchDirective", 
			"ngClassDirective", "ngStyleDirective", "ngModelDirective", "htmlTemplate", 
			"htmlElement", "htmlTag", "htmlAttribute", "attributeValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'from'", "'function'", "'return'", "'export'", "'default'", 
			"'interface'", "'const'", "'class'", "'extends'", "'implements'", "'var'", 
			"'let'", "'of'", "'async'", "'@'", "'as'", null, "'selector'", "'template'", 
			"'styleUrls'", "'styles'", "'viewProviders'", "'animations'", "'encapsulation'", 
			"'changeDetection'", "'preserveWhitespaces'", "'interpolation'", "'public'", 
			"'private'", "'protected'", "'constructor'", "'for'", "'if'", "'else'", 
			"'&&'", "'||'", "'=='", "'!='", "'*'", "'/'", "'+'", "'-'", "'='", "'|'", 
			"'...'", "'==='", "'!=='", "'!'", "'#'", "'*ngFor'", "'*ngIf'", "'*ngSwitch'", 
			"'*ngSwitchCase'", "'*ngSwitchDefault'", "'*ngClass'", "'*ngStyle'", 
			"'ngClass'", "'[ngStyle]'", "'ngModel)]'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'>'", "':'", "';'", "'.'", "','", "'`'", "'=>'", 
			"'?'", null, null, null, null, "'/>'", "'div'", null, null, null, null, 
			null, null, null, null, "'@Component'", "'@Injectable'", "'@Input'", 
			"'@Output'", "'@HostListener'", "'@HostBinding'", "'@ViewChild'", "'@ContentChild'", 
			"'@Pipe'", "'@Directive'", "'@NgModule'", "'()'", null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "FROM", "FUNCTION", "RETURN", "EXPORT", "DEFAULT", "INTERFACE", 
			"CONST", "CLASS", "EXTENDS", "IMPLEMENTS", "VAR", "LET", "OF", "ASYNC", 
			"AT", "AS", "NULL", "SELECTOR", "TEMPLATE", "STYLE_URLS", "STYLES", "VIEW_PROVIDERS", 
			"ANIMATIONS", "ENCAPSULATION", "CHANGE_DETECTION", "PRESERVE_WHITESPACES", 
			"INTERPOLATION", "PUBLIC", "PRIVATE", "PROTECTED", "CONSTRUCTOR", "FOR", 
			"IF", "ELSE", "AND", "OR", "EQUALS", "NOT_EQUALS", "MULTIPLY", "DIVIDE", 
			"PLUS", "MINUS", "ASSIGN", "ROUNDABOUT", "SPREAD", "STRICT_EQUALS", "STRICT_NOT_EQUALS", 
			"NO", "HASH", "NG_FOR", "NG_IF", "NG_SWITCH", "NG_SWITCH_CASE", "NG_SWITCH_DEFAULT", 
			"NG_CLASS", "NG_STYLE", "NG_CLASS_BINDING", "NG_STYLE_BINDING", "NG_MODEL_BINDING", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LESS_THAN", 
			"GREATER_THAN", "COLON", "SEMICOLON", "DOT", "COMMA", "BACKTICK", "ARROW", 
			"OPTIONAL_CHAIN", "HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_TAG_OPEN_Q", 
			"HTML_TAG_CLOSE_Q", "HTML_TAG_CLOSE_RIGHT", "DIV", "IDENTIFIER", "STRING_LITERAL", 
			"DECIMAL_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", "WS", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "COMPONENT", "INJECTABLE", "INPUT", "OUTPUT", "HOST_LISTENER", 
			"HOST_BINDING", "VIEW_CHILD", "CONTENT_CHILD", "PIPE", "DIRECTIVE", "NG_MODULE", 
			"ALLPAREN", "CSS_UNIT", "DOUBLE_QUOTE", "SINGLE_QUOTE", "ESC", "ON"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserAng.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserAng(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramDefContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(ParserAng.EOF, 0); }
		public SourceElementContext sourceElement() {
			return getRuleContext(SourceElementContext.class,0);
		}
		public ProgramDefContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterProgramDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitProgramDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitProgramDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(128);
				sourceElement();
				}
				break;
			}
			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementContext extends ParserRuleContext {
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
	 
		public SourceElementContext() { }
		public void copyFrom(SourceElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementDefContext extends SourceElementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceElementDefContext(SourceElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterSourceElementDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitSourceElementDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitSourceElementDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			int _alt;
			_localctx = new SourceElementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					statement();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtVariableContext extends StatementContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public StmtVariableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmImportContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public StmImportContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtClassContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StmtClassContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExpressionContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StmtExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtComponentContext extends StatementContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public StmtComponentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInterfaceContext extends StatementContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public StmtInterfaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExportContext extends StatementContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public StmtExportContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StmImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				importStatement();
				}
				break;
			case 2:
				_localctx = new StmtInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				interfaceDeclaration();
				}
				break;
			case 3:
				_localctx = new StmtClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				classDeclaration();
				}
				break;
			case 4:
				_localctx = new StmtComponentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				componentDeclaration();
				}
				break;
			case 5:
				_localctx = new StmtExportContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				exportStatement();
				}
				break;
			case 6:
				_localctx = new StmtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				expressionStatement();
				}
				break;
			case 7:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				ifStatement();
				}
				break;
			case 8:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				forStatement();
				}
				break;
			case 9:
				_localctx = new StmtVariableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				variableStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportStatementContext extends ImportStatementContext {
		public TerminalNode IMPORT() { return getToken(ParserAng.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAng.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAng.IDENTIFIER, i);
		}
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(ParserAng.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserAng.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public DefaultImportStatementContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDefaultImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDefaultImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDefaultImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		int _la;
		try {
			_localctx = new DefaultImportStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IMPORT);
			setState(151);
			match(LBRACE);
			setState(152);
			match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				match(IDENTIFIER);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RBRACE);
			setState(161);
			match(FROM);
			setState(162);
			match(STRING_LITERAL);
			setState(163);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDeclarationContext extends ExportStatementContext {
		public TerminalNode EXPORT() { return getToken(ParserAng.EXPORT, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ExportDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exportStatement);
		try {
			_localctx = new ExportDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(EXPORT);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(166);
				classDeclaration();
				}
				break;
			case 2:
				{
				setState(167);
				interfaceDeclaration();
				}
				break;
			case 3:
				{
				setState(168);
				functionDeclaration();
				}
				break;
			case 4:
				{
				setState(169);
				methodDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	 
		public InterfaceDeclarationContext() { }
		public void copyFrom(InterfaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDefinitionContext extends InterfaceDeclarationContext {
		public TerminalNode INTERFACE() { return getToken(ParserAng.INTERFACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAng.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAng.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(ParserAng.EXTENDS, 0); }
		public List<InterfacePropertyContext> interfaceProperty() {
			return getRuleContexts(InterfacePropertyContext.class);
		}
		public InterfacePropertyContext interfaceProperty(int i) {
			return getRuleContext(InterfacePropertyContext.class,i);
		}
		public InterfaceDefinitionContext(InterfaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitInterfaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitInterfaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDeclaration);
		int _la;
		try {
			_localctx = new InterfaceDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(INTERFACE);
			setState(173);
			match(IDENTIFIER);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(174);
				match(EXTENDS);
				setState(175);
				match(IDENTIFIER);
				}
			}

			setState(178);
			match(LBRACE);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(179);
				interfaceProperty();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyContext extends ParserRuleContext {
		public InterfacePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceProperty; }
	 
		public InterfacePropertyContext() { }
		public void copyFrom(InterfacePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyDefinitionContext extends InterfacePropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserAng.SEMICOLON, 0); }
		public InterfacePropertyDefinitionContext(InterfacePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterInterfacePropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitInterfacePropertyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitInterfacePropertyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyContext interfaceProperty() throws RecognitionException {
		InterfacePropertyContext _localctx = new InterfacePropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceProperty);
		try {
			_localctx = new InterfacePropertyDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IDENTIFIER);
			setState(188);
			match(COLON);
			setState(189);
			typeAnnotation();
			setState(190);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(ParserAng.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAng.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAng.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(ParserAng.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ParserAng.IMPLEMENTS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ParserAng.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ParserAng.RBRACE, i);
		}
		public ClassDefinitionContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			_localctx = new ClassDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2047L) != 0)) {
				{
				{
				setState(192);
				decorator();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(CLASS);
			setState(199);
			match(IDENTIFIER);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(200);
				match(EXTENDS);
				setState(201);
				match(IDENTIFIER);
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(204);
				match(IMPLEMENTS);
				setState(205);
				match(IDENTIFIER);
				}
			}

			setState(208);
			match(LBRACE);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					classMember();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					match(RBRACE);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodContext extends ClassMemberContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ClassMethodContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterClassMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitClassMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassPropertyContext extends ClassMemberContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ClassPropertyContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterClassProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitClassProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitClassProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassConstructorContext extends ClassMemberContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ClassConstructorContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitClassConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classMember);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ClassPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2047L) != 0)) {
					{
					{
					setState(221);
					decorator();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				propertyDeclaration();
				}
				break;
			case 2:
				_localctx = new ClassConstructorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2047L) != 0)) {
					{
					{
					setState(228);
					decorator();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				constructorDeclaration();
				}
				break;
			case 3:
				_localctx = new ClassMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2047L) != 0)) {
					{
					{
					setState(235);
					decorator();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionDefinitionContext extends FunctionDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ParserAng.ARROW, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ParserAng.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserAng.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ParserAng.PROTECTED, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ArrowFunctionDefinitionContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends FunctionDeclarationContext {
		public TerminalNode FUNCTION() { return getToken(ParserAng.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode PUBLIC() { return getToken(ParserAng.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserAng.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ParserAng.PROTECTED, 0); }
		public FunctionDefinitionContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
					{
					setState(244);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(247);
				match(FUNCTION);
				setState(248);
				match(IDENTIFIER);
				setState(249);
				match(LPAREN);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(250);
					parameterList();
					}
				}

				setState(253);
				match(RPAREN);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(254);
					match(COLON);
					setState(255);
					typeAnnotation();
					}
				}

				setState(258);
				match(LBRACE);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886887080315982L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2336432719105L) != 0)) {
					{
					{
					setState(259);
					statement();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new ArrowFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
					{
					setState(266);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(269);
				match(IDENTIFIER);
				setState(270);
				match(LPAREN);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(271);
					parameterList();
					}
				}

				setState(274);
				match(RPAREN);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(275);
					match(COLON);
					setState(276);
					typeAnnotation();
					}
				}

				setState(279);
				match(ARROW);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(280);
					match(LBRACE);
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886887080315982L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2336432719105L) != 0)) {
						{
						{
						setState(281);
						statement();
						}
						}
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(287);
					match(RBRACE);
					}
					break;
				case 2:
					{
					setState(288);
					expression(0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	 
		public DecoratorContext() { }
		public void copyFrom(DecoratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorDefinition2Context extends DecoratorContext {
		public TerminalNode COMPONENT() { return getToken(ParserAng.COMPONENT, 0); }
		public TerminalNode INJECTABLE() { return getToken(ParserAng.INJECTABLE, 0); }
		public TerminalNode INPUT() { return getToken(ParserAng.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(ParserAng.OUTPUT, 0); }
		public TerminalNode HOST_LISTENER() { return getToken(ParserAng.HOST_LISTENER, 0); }
		public TerminalNode HOST_BINDING() { return getToken(ParserAng.HOST_BINDING, 0); }
		public TerminalNode VIEW_CHILD() { return getToken(ParserAng.VIEW_CHILD, 0); }
		public TerminalNode CONTENT_CHILD() { return getToken(ParserAng.CONTENT_CHILD, 0); }
		public TerminalNode PIPE() { return getToken(ParserAng.PIPE, 0); }
		public TerminalNode DIRECTIVE() { return getToken(ParserAng.DIRECTIVE, 0); }
		public TerminalNode NG_MODULE() { return getToken(ParserAng.NG_MODULE, 0); }
		public DecoratorDefinition2Context(DecoratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDecoratorDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDecoratorDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDecoratorDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorDefinition1Context extends DecoratorContext {
		public TerminalNode AT() { return getToken(ParserAng.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public DecoratorArgumentsContext decoratorArguments() {
			return getRuleContext(DecoratorArgumentsContext.class,0);
		}
		public DecoratorDefinition1Context(DecoratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDecoratorDefinition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDecoratorDefinition1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDecoratorDefinition1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decorator);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPONENT:
			case INJECTABLE:
			case INPUT:
			case OUTPUT:
			case HOST_LISTENER:
			case HOST_BINDING:
			case VIEW_CHILD:
			case CONTENT_CHILD:
			case PIPE:
			case DIRECTIVE:
			case NG_MODULE:
				_localctx = new DecoratorDefinition2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2047L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case AT:
				_localctx = new DecoratorDefinition1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(AT);
				setState(295);
				match(IDENTIFIER);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(296);
					match(LPAREN);
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
						{
						setState(297);
						decoratorArguments();
						}
					}

					setState(300);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorArgumentsContext extends ParserRuleContext {
		public DecoratorArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArguments; }
	 
		public DecoratorArgumentsContext() { }
		public void copyFrom(DecoratorArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorExpressionArgumentContext extends DecoratorArgumentsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecoratorExpressionArgumentContext(DecoratorArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDecoratorExpressionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDecoratorExpressionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDecoratorExpressionArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorObjectArgumentContext extends DecoratorArgumentsContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public DecoratorObjectArgumentContext(DecoratorArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDecoratorObjectArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDecoratorObjectArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDecoratorObjectArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgumentsContext decoratorArguments() throws RecognitionException {
		DecoratorArgumentsContext _localctx = new DecoratorArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decoratorArguments);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new DecoratorObjectArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new DecoratorExpressionArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
	 
		public ComponentDeclarationContext() { }
		public void copyFrom(ComponentDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ComponentDeclarationContext {
		public TerminalNode COMPONENT() { return getToken(ParserAng.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public ComponentDefinitionContext(ComponentDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComponentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComponentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentDeclaration);
		try {
			_localctx = new ComponentDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(COMPONENT);
			setState(310);
			match(LPAREN);
			setState(311);
			componentMetadata();
			setState(312);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
	 
		public ComponentMetadataContext() { }
		public void copyFrom(ComponentMetadataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContentContext extends ComponentMetadataContext {
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public ComponentMetadataContentContext(ComponentMetadataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComponentMetadataContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComponentMetadataContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComponentMetadataContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_componentMetadata);
		int _la;
		try {
			_localctx = new ComponentMetadataContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LBRACE);
			setState(315);
			componentProperty();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				componentProperty();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
	 
		public ComponentPropertyContext() { }
		public void copyFrom(ComponentPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStyleContext extends ComponentPropertyContext {
		public StylePropertyContext styleProperty() {
			return getRuleContext(StylePropertyContext.class,0);
		}
		public ComponentStyleContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComponentStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComponentStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComponentStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExContext extends ComponentPropertyContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentSelectorContext extends ComponentPropertyContext {
		public SelectorPropertyContext selectorProperty() {
			return getRuleContext(SelectorPropertyContext.class,0);
		}
		public ComponentSelectorContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComponentSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComponentSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComponentSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentTemplateContext extends ComponentPropertyContext {
		public TemplatePropertyContext templateProperty() {
			return getRuleContext(TemplatePropertyContext.class,0);
		}
		public ComponentTemplateContext(ComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComponentTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComponentTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComponentTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_componentProperty);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new ComponentSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				selectorProperty();
				}
				break;
			case TEMPLATE:
				_localctx = new ComponentTemplateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				templateProperty();
				}
				break;
			case STYLE_URLS:
			case STYLES:
				_localctx = new ComponentStyleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				styleProperty();
				}
				break;
			case RETURN:
			case CONST:
			case NULL:
			case MINUS:
			case SPREAD:
			case NO:
			case LPAREN:
			case LBRACKET:
			case LBRACE:
			case BACKTICK:
			case OPTIONAL_CHAIN:
			case IDENTIFIER:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case ALLPAREN:
			case ON:
				_localctx = new ExContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPropertyContext extends ParserRuleContext {
		public SelectorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorProperty; }
	 
		public SelectorPropertyContext() { }
		public void copyFrom(SelectorPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDefinitionContext extends SelectorPropertyContext {
		public TerminalNode SELECTOR() { return getToken(ParserAng.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public SelectorDefinitionContext(SelectorPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterSelectorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitSelectorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitSelectorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPropertyContext selectorProperty() throws RecognitionException {
		SelectorPropertyContext _localctx = new SelectorPropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectorProperty);
		try {
			_localctx = new SelectorDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(SELECTOR);
			setState(332);
			match(COLON);
			setState(333);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends ParserRuleContext {
		public TemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateProperty; }
	 
		public TemplatePropertyContext() { }
		public void copyFrom(TemplatePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDefinitionContext extends TemplatePropertyContext {
		public TerminalNode TEMPLATE() { return getToken(ParserAng.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
		}
		public TemplateDefinitionContext(TemplatePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterTemplateDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitTemplateDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitTemplateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePropertyContext templateProperty() throws RecognitionException {
		TemplatePropertyContext _localctx = new TemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_templateProperty);
		try {
			_localctx = new TemplateDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(TEMPLATE);
			setState(336);
			match(COLON);
			setState(337);
			templateString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylePropertyContext extends ParserRuleContext {
		public StylePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleProperty; }
	 
		public StylePropertyContext() { }
		public void copyFrom(StylePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsDefinition2Context extends StylePropertyContext {
		public TerminalNode STYLES() { return getToken(ParserAng.STYLES, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(ParserAng.LBRACKET, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(ParserAng.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(ParserAng.BACKTICK, i);
		}
		public TerminalNode RBRACKET() { return getToken(ParserAng.RBRACKET, 0); }
		public List<StyleContentContext> styleContent() {
			return getRuleContexts(StyleContentContext.class);
		}
		public StyleContentContext styleContent(int i) {
			return getRuleContext(StyleContentContext.class,i);
		}
		public StyleUrlsDefinition2Context(StylePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStyleUrlsDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStyleUrlsDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStyleUrlsDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsDefinitionContext extends StylePropertyContext {
		public TerminalNode STYLE_URLS() { return getToken(ParserAng.STYLE_URLS, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(ParserAng.LBRACKET, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ParserAng.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ParserAng.STRING_LITERAL, i);
		}
		public TerminalNode RBRACKET() { return getToken(ParserAng.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public StyleUrlsDefinitionContext(StylePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStyleUrlsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStyleUrlsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStyleUrlsDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylePropertyContext styleProperty() throws RecognitionException {
		StylePropertyContext _localctx = new StylePropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_styleProperty);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_URLS:
				_localctx = new StyleUrlsDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(STYLE_URLS);
				setState(340);
				match(COLON);
				setState(341);
				match(LBRACKET);
				setState(342);
				match(STRING_LITERAL);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(343);
					match(COMMA);
					setState(344);
					match(STRING_LITERAL);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(RBRACKET);
				}
				break;
			case STYLES:
				_localctx = new StyleUrlsDefinition2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(STYLES);
				setState(352);
				match(COLON);
				setState(353);
				match(LBRACKET);
				setState(354);
				match(BACKTICK);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(355);
					styleContent();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(BACKTICK);
				setState(362);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContentContext extends ParserRuleContext {
		public StyleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContent; }
	 
		public StyleContentContext() { }
		public void copyFrom(StyleContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleContentDefinitionContext extends StyleContentContext {
		public TerminalNode DOT() { return getToken(ParserAng.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAng.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAng.IDENTIFIER, i);
		}
		public TerminalNode MINUS() { return getToken(ParserAng.MINUS, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public StyleContentDefinitionContext(StyleContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStyleContentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStyleContentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStyleContentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentContext styleContent() throws RecognitionException {
		StyleContentContext _localctx = new StyleContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_styleContent);
		int _la;
		try {
			_localctx = new StyleContentDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(DOT);
			setState(366);
			match(IDENTIFIER);
			setState(367);
			match(MINUS);
			setState(368);
			match(IDENTIFIER);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(369);
				match(IDENTIFIER);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(LBRACE);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
				{
				{
				setState(376);
				expressionStatement();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	 
		public PropertyDeclarationContext() { }
		public void copyFrom(PropertyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDefinitionContext extends PropertyDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(ParserAng.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserAng.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ParserAng.PROTECTED, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserAng.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(ParserAng.COMMA, 0); }
		public PropertyDefinitionContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitPropertyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitPropertyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_propertyDeclaration);
		int _la;
		try {
			_localctx = new PropertyDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
				{
				setState(384);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(387);
			match(IDENTIFIER);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(388);
				match(COLON);
				setState(389);
				typeAnnotation();
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(392);
				match(ASSIGN);
				setState(393);
				expression(0);
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON || _la==COMMA) {
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDefinitionContext extends MethodDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode PUBLIC() { return getToken(ParserAng.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserAng.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ParserAng.PROTECTED, 0); }
		public MethodDefinitionContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDefinition2Context extends MethodDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode ALLPAREN() { return getToken(ParserAng.ALLPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDefinition2Context(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterMethodDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitMethodDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitMethodDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new MethodDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) {
					{
					setState(399);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(402);
				match(IDENTIFIER);
				setState(403);
				match(LPAREN);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(404);
					parameterList();
					}
				}

				setState(407);
				match(RPAREN);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(408);
					match(COLON);
					setState(409);
					typeAnnotation();
					}
				}

				setState(412);
				match(LBRACE);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886887080315982L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2336432719105L) != 0)) {
					{
					{
					setState(413);
					statement();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new MethodDefinition2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(IDENTIFIER);
				setState(421);
				match(ALLPAREN);
				setState(422);
				match(LBRACE);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886887080315982L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2336432719105L) != 0)) {
					{
					{
					setState(423);
					statement();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	 
		public ConstructorDeclarationContext() { }
		public void copyFrom(ConstructorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDefinition2Context extends ConstructorDeclarationContext {
		public TerminalNode CONSTRUCTOR() { return getToken(ParserAng.CONSTRUCTOR, 0); }
		public TerminalNode ALLPAREN() { return getToken(ParserAng.ALLPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDefinition2Context(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterConstructorDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitConstructorDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitConstructorDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDefinitionContext extends ConstructorDeclarationContext {
		public TerminalNode CONSTRUCTOR() { return getToken(ParserAng.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDefinitionContext(ConstructorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitConstructorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitConstructorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclaration);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new ConstructorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(CONSTRUCTOR);
				setState(433);
				match(LPAREN);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(434);
					parameterList();
					}
				}

				setState(437);
				match(RPAREN);
				setState(438);
				match(LBRACE);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886887080315982L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2336432719105L) != 0)) {
					{
					{
					setState(439);
					statement();
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new ConstructorDefinition2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(CONSTRUCTOR);
				setState(447);
				match(ALLPAREN);
				setState(448);
				match(LBRACE);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886887080315982L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2336432719105L) != 0)) {
					{
					{
					setState(449);
					statement();
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(455);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringContext extends ParserRuleContext {
		public TemplateStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateString; }
	 
		public TemplateStringContext() { }
		public void copyFrom(TemplateStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringDefinitionContext extends TemplateStringContext {
		public List<TerminalNode> BACKTICK() { return getTokens(ParserAng.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(ParserAng.BACKTICK, i);
		}
		public TemplateContentContext templateContent() {
			return getRuleContext(TemplateContentContext.class,0);
		}
		public HtmlTemplateContext htmlTemplate() {
			return getRuleContext(HtmlTemplateContext.class,0);
		}
		public TemplateStringDefinitionContext(TemplateStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterTemplateStringDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitTemplateStringDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitTemplateStringDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringContext templateString() throws RecognitionException {
		TemplateStringContext _localctx = new TemplateStringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_templateString);
		try {
			_localctx = new TemplateStringDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(BACKTICK);
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(459);
				templateContent();
				}
				break;
			case 2:
				{
				setState(460);
				htmlTemplate();
				}
				break;
			}
			setState(463);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContentContext extends ParserRuleContext {
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
	 
		public TemplateContentContext() { }
		public void copyFrom(TemplateContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContentPartDefinitionContext extends TemplateContentContext {
		public List<TemplatePartContext> templatePart() {
			return getRuleContexts(TemplatePartContext.class);
		}
		public TemplatePartContext templatePart(int i) {
			return getRuleContext(TemplatePartContext.class,i);
		}
		public TemplateContentPartDefinitionContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterTemplateContentPartDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitTemplateContentPartDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitTemplateContentPartDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_templateContent);
		int _la;
		try {
			_localctx = new TemplateContentPartDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH || _la==IDENTIFIER) {
				{
				{
				setState(465);
				templatePart();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePartContext extends ParserRuleContext {
		public TemplatePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatePart; }
	 
		public TemplatePartContext() { }
		public void copyFrom(TemplatePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdePartContext extends TemplatePartContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode HASH() { return getToken(ParserAng.HASH, 0); }
		public IdePartContext(TemplatePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterIdePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitIdePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitIdePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePartContext templatePart() throws RecognitionException {
		TemplatePartContext _localctx = new TemplatePartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_templatePart);
		int _la;
		try {
			_localctx = new IdePartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(471);
				match(HASH);
				}
			}

			setState(474);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public AssignmentExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ParserAng.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public List<TerminalNode> OPTIONAL_CHAIN() { return getTokens(ParserAng.OPTIONAL_CHAIN); }
		public TerminalNode OPTIONAL_CHAIN(int i) {
			return getToken(ParserAng.OPTIONAL_CHAIN, i);
		}
		public List<TerminalNode> ALLPAREN() { return getTokens(ParserAng.ALLPAREN); }
		public TerminalNode ALLPAREN(int i) {
			return getToken(ParserAng.ALLPAREN, i);
		}
		public DotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropExprContext extends ExpressionContext {
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public PropExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterPropExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitPropExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitPropExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public ColonExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterColonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitColonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitColonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ParserAng.AND, 0); }
		public TerminalNode OR() { return getToken(ParserAng.OR, 0); }
		public LogicalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitLogicalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitLogicalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ParserAng.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(ParserAng.NOT_EQUALS, 0); }
		public TerminalNode STRICT_EQUALS() { return getToken(ParserAng.STRICT_EQUALS, 0); }
		public TerminalNode STRICT_NOT_EQUALS() { return getToken(ParserAng.STRICT_NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(ParserAng.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ParserAng.GREATER_THAN, 0); }
		public ComparisonExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ParserAng.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserAng.MINUS, 0); }
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowExprContext extends ExpressionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OnExprContext extends ExpressionContext {
		public OnExpressionContext onExpression() {
			return getRuleContext(OnExpressionContext.class,0);
		}
		public OnExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterOnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitOnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitOnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public FunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(ParserAng.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ParserAng.RBRACKET, 0); }
		public IndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignArrayExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LBRACKET() { return getToken(ParserAng.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ParserAng.RBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public AssignArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterAssignArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitAssignArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitAssignArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(ParserAng.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ParserAng.DIVIDE, 0); }
		public MultiplicativeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtReturnContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StmtReturnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStmtReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStmtReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStmtReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				_localctx = new OnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(477);
				onExpression();
				}
				break;
			case 2:
				{
				_localctx = new ArrowExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(478);
				arrowFunction();
				}
				break;
			case 3:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(479);
				primaryExpression();
				}
				break;
			case 4:
				{
				_localctx = new StmtReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				returnStatement();
				}
				break;
			case 5:
				{
				_localctx = new PropExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481);
				propertyAssignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(552);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(484);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(485);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(486);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(488);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(489);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(491);
						_la = _input.LA(1);
						if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 1610614275L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(492);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AssignmentExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(494);
						match(ASSIGN);
						setState(495);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ColonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(497);
						match(COLON);
						setState(498);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(500);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(501);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new AssignArrayExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(502);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(503);
						match(COLON);
						setState(504);
						match(IDENTIFIER);
						setState(505);
						match(LBRACKET);
						setState(506);
						match(RBRACKET);
						setState(507);
						match(ASSIGN);
						setState(508);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new DotExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(509);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(510);
						match(DOT);
						setState(514);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==OPTIONAL_CHAIN) {
							{
							{
							setState(511);
							match(OPTIONAL_CHAIN);
							}
							}
							setState(516);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(517);
						match(IDENTIFIER);
						setState(521);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(518);
								match(OPTIONAL_CHAIN);
								}
								} 
							}
							setState(523);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
						}
						setState(527);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(524);
								match(ALLPAREN);
								}
								} 
							}
							setState(529);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						}
						}
						break;
					case 9:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(530);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(531);
						match(LBRACKET);
						setState(532);
						expression(0);
						setState(533);
						match(RBRACKET);
						}
						break;
					case 10:
						{
						_localctx = new CallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(535);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(537);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LESS_THAN) {
							{
							setState(536);
							typeArguments();
							}
						}

						setState(539);
						match(LPAREN);
						setState(541);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
							{
							setState(540);
							argumentList();
							}
						}

						setState(543);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new FunctionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(544);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(545);
						match(LPAREN);
						setState(546);
						expression(0);
						setState(547);
						match(RPAREN);
						setState(548);
						match(LBRACE);
						setState(549);
						expression(0);
						setState(550);
						match(RBRACE);
						}
						break;
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnExpressionContext extends ParserRuleContext {
		public OnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onExpression; }
	 
		public OnExpressionContext() { }
		public void copyFrom(OnExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OnCallContext extends OnExpressionContext {
		public TerminalNode ON() { return getToken(ParserAng.ON, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(ParserAng.COMMA, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public OnCallContext(OnExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterOnCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitOnCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitOnCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnExpressionContext onExpression() throws RecognitionException {
		OnExpressionContext _localctx = new OnExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_onExpression);
		try {
			_localctx = new OnCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(ON);
			setState(558);
			match(LPAREN);
			setState(559);
			match(IDENTIFIER);
			setState(560);
			match(COMMA);
			setState(561);
			arrowFunction();
			setState(562);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
	 
		public ArrowFunctionContext() { }
		public void copyFrom(ArrowFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionDefinition2Context extends ArrowFunctionContext {
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ParserAng.ARROW, 0); }
		public ArrowBodyContext arrowBody() {
			return getRuleContext(ArrowBodyContext.class,0);
		}
		public ArrowParamsContext arrowParams() {
			return getRuleContext(ArrowParamsContext.class,0);
		}
		public ArrowFunctionDefinition2Context(ArrowFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowFunctionDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowFunctionDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowFunctionDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrowFunction);
		int _la;
		try {
			_localctx = new ArrowFunctionDefinition2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(LPAREN);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==IDENTIFIER) {
				{
				setState(565);
				arrowParams();
				}
			}

			setState(568);
			match(RPAREN);
			setState(569);
			match(ARROW);
			setState(570);
			arrowBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParamsContext extends ParserRuleContext {
		public ArrowParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParams; }
	 
		public ArrowParamsContext() { }
		public void copyFrom(ArrowParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParamListContext extends ArrowParamsContext {
		public List<ArrowParamContext> arrowParam() {
			return getRuleContexts(ArrowParamContext.class);
		}
		public ArrowParamContext arrowParam(int i) {
			return getRuleContext(ArrowParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public ArrowParamListContext(ArrowParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowParamsContext arrowParams() throws RecognitionException {
		ArrowParamsContext _localctx = new ArrowParamsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrowParams);
		int _la;
		try {
			_localctx = new ArrowParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			arrowParam();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(573);
				match(COMMA);
				setState(574);
				arrowParam();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParamContext extends ParserRuleContext {
		public ArrowParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParam; }
	 
		public ArrowParamContext() { }
		public void copyFrom(ArrowParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowIdentifierParamContext extends ArrowParamContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ArrowIdentifierParamContext(ArrowParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowIdentifierParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowIdentifierParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowIdentifierParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowDestructuredParamContext extends ArrowParamContext {
		public DestructuredObjectContext destructuredObject() {
			return getRuleContext(DestructuredObjectContext.class,0);
		}
		public ArrowDestructuredParamContext(ArrowParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowDestructuredParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowDestructuredParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowDestructuredParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowParamContext arrowParam() throws RecognitionException {
		ArrowParamContext _localctx = new ArrowParamContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrowParam);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ArrowIdentifierParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(IDENTIFIER);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(581);
					match(COLON);
					setState(582);
					typeAnnotation();
					}
				}

				}
				break;
			case LBRACE:
				_localctx = new ArrowDestructuredParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				destructuredObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuredObjectContext extends ParserRuleContext {
		public DestructuredObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuredObject; }
	 
		public DestructuredObjectContext() { }
		public void copyFrom(DestructuredObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DestructuredObjectDefinitionContext extends DestructuredObjectContext {
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public List<DestructuredPropertyContext> destructuredProperty() {
			return getRuleContexts(DestructuredPropertyContext.class);
		}
		public DestructuredPropertyContext destructuredProperty(int i) {
			return getRuleContext(DestructuredPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public DestructuredObjectDefinitionContext(DestructuredObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDestructuredObjectDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDestructuredObjectDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDestructuredObjectDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuredObjectContext destructuredObject() throws RecognitionException {
		DestructuredObjectContext _localctx = new DestructuredObjectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_destructuredObject);
		int _la;
		try {
			_localctx = new DestructuredObjectDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(LBRACE);
			setState(589);
			destructuredProperty();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(590);
				match(COMMA);
				setState(591);
				destructuredProperty();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuredPropertyContext extends ParserRuleContext {
		public DestructuredPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuredProperty; }
	 
		public DestructuredPropertyContext() { }
		public void copyFrom(DestructuredPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DestructuredPropertyDefinitionContext extends DestructuredPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public DestructuredPropertyDefinitionContext(DestructuredPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDestructuredPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDestructuredPropertyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDestructuredPropertyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuredPropertyContext destructuredProperty() throws RecognitionException {
		DestructuredPropertyContext _localctx = new DestructuredPropertyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_destructuredProperty);
		int _la;
		try {
			_localctx = new DestructuredPropertyDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(IDENTIFIER);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(600);
				match(COLON);
				setState(601);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowBodyContext extends ParserRuleContext {
		public ArrowBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowBody; }
	 
		public ArrowBodyContext() { }
		public void copyFrom(ArrowBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowObjectBodyContext extends ArrowBodyContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrowObjectBodyContext(ArrowBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowObjectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowObjectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowExpressionBodyContext extends ArrowBodyContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowExpressionBodyContext(ArrowBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowExpressionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowExpressionBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParenObjectBodyContext extends ArrowBodyContext {
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public ArrowParenObjectBodyContext(ArrowBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrowParenObjectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrowParenObjectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrowParenObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowBodyContext arrowBody() throws RecognitionException {
		ArrowBodyContext _localctx = new ArrowBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrowBody);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new ArrowObjectBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				objectLiteral();
				}
				break;
			case 2:
				_localctx = new ArrowParenObjectBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(LPAREN);
				setState(606);
				objectLiteral();
				setState(607);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new ArrowExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ParserAng.LESS_THAN, 0); }
		public List<TypeAnnotationContext> typeAnnotation() {
			return getRuleContexts(TypeAnnotationContext.class);
		}
		public TypeAnnotationContext typeAnnotation(int i) {
			return getRuleContext(TypeAnnotationContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(ParserAng.GREATER_THAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(LESS_THAN);
			setState(613);
			typeAnnotation();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(614);
				match(COMMA);
				setState(615);
				typeAnnotation();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoContext extends PrimaryExpressionContext {
		public TerminalNode NO() { return getToken(ParserAng.NO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public NoContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateExprContext extends PrimaryExpressionContext {
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
		}
		public TemplateExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterTemplateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitTemplateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitTemplateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends PrimaryExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends PrimaryExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllparenExprContext extends PrimaryExpressionContext {
		public TerminalNode ALLPAREN() { return getToken(ParserAng.ALLPAREN, 0); }
		public AllparenExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterAllparenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitAllparenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitAllparenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryExpressionContext {
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(ParserAng.ARROW, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserAng.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserAng.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public ParenExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PareceExprContext extends PrimaryExpressionContext {
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(ParserAng.ARROW, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserAng.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserAng.SEMICOLON, i);
		}
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public PareceExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterPareceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitPareceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitPareceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(ParserAng.NULL, 0); }
		public NullContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiterial1Context extends PrimaryExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public List<TerminalNode> OPTIONAL_CHAIN() { return getTokens(ParserAng.OPTIONAL_CHAIN); }
		public TerminalNode OPTIONAL_CHAIN(int i) {
			return getToken(ParserAng.OPTIONAL_CHAIN, i);
		}
		public StringLiterial1Context(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStringLiterial1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStringLiterial1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStringLiterial1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundType2Context extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode ROUNDABOUT() { return getToken(ParserAng.ROUNDABOUT, 0); }
		public TerminalNode NULL() { return getToken(ParserAng.NULL, 0); }
		public RoundType2Context(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterRoundType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitRoundType2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitRoundType2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpr2Context extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode HTML_TAG_OPEN() { return getToken(ParserAng.HTML_TAG_OPEN, 0); }
		public TerminalNode COMMA() { return getToken(ParserAng.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ParserAng.GREATER_THAN, 0); }
		public IdentifierExpr2Context(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterIdentifierExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitIdentifierExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitIdentifierExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public List<TerminalNode> OPTIONAL_CHAIN() { return getTokens(ParserAng.OPTIONAL_CHAIN); }
		public TerminalNode OPTIONAL_CHAIN(int i) {
			return getToken(ParserAng.OPTIONAL_CHAIN, i);
		}
		public IdentifierExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstExprContext extends PrimaryExpressionContext {
		public TerminalNode CONST() { return getToken(ParserAng.CONST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPTIONAL_CHAIN) {
					{
					{
					setState(623);
					match(OPTIONAL_CHAIN);
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				literal();
				}
				break;
			case 3:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				arrayLiteral();
				}
				break;
			case 4:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				objectLiteral();
				}
				break;
			case 5:
				_localctx = new TemplateExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				templateString();
				}
				break;
			case 6:
				_localctx = new AllparenExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
				match(ALLPAREN);
				}
				break;
			case 7:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(635);
				match(LPAREN);
				setState(636);
				expression(0);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(637);
					match(ARROW);
					}
					break;
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(640);
						expression(0);
						setState(642);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(641);
							match(SEMICOLON);
							}
							break;
						}
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(649);
					match(SEMICOLON);
					}
					break;
				}
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(652);
					match(RPAREN);
					}
					break;
				}
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(655);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new PareceExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(658);
				match(LBRACE);
				setState(659);
				expression(0);
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(660);
					match(ARROW);
					}
					break;
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(663);
						expression(0);
						setState(665);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(664);
							match(SEMICOLON);
							}
							break;
						}
						}
						} 
					}
					setState(671);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(672);
					match(SEMICOLON);
					}
					break;
				}
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(675);
					match(RBRACE);
					}
					break;
				}
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(678);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new StringLiterial1Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPTIONAL_CHAIN) {
					{
					{
					setState(681);
					match(OPTIONAL_CHAIN);
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(687);
				match(STRING_LITERAL);
				}
				break;
			case 10:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(688);
				match(NULL);
				}
				break;
			case 11:
				_localctx = new NoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(689);
				match(NO);
				setState(690);
				match(IDENTIFIER);
				}
				break;
			case 12:
				_localctx = new RoundType2Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(691);
				match(IDENTIFIER);
				setState(692);
				match(ROUNDABOUT);
				setState(693);
				match(NULL);
				}
				break;
			case 13:
				_localctx = new IdentifierExpr2Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(694);
				match(IDENTIFIER);
				setState(695);
				match(HTML_TAG_OPEN);
				setState(699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(696);
					match(COMMA);
					setState(697);
					match(STRING_LITERAL);
					setState(698);
					match(GREATER_THAN);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new ConstExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(701);
				match(CONST);
				setState(702);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	 
		public TypeAnnotationContext() { }
		public void copyFrom(TypeAnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends TypeAnnotationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public SimpleTypeContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeAnnotationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LBRACKET() { return getToken(ParserAng.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ParserAng.RBRACKET, 0); }
		public ArrayTypeContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeContext extends TypeAnnotationContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ComplexTypeContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoundTypeContext extends TypeAnnotationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode ROUNDABOUT() { return getToken(ParserAng.ROUNDABOUT, 0); }
		public TerminalNode NULL() { return getToken(ParserAng.NULL, 0); }
		public RoundTypeContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterRoundType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitRoundType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitRoundType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeAnnotation);
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(IDENTIFIER);
				setState(707);
				match(LBRACKET);
				setState(708);
				match(RBRACKET);
				}
				break;
			case 3:
				_localctx = new ComplexTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				objectType();
				}
				break;
			case 4:
				_localctx = new RoundTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				match(IDENTIFIER);
				setState(711);
				match(ROUNDABOUT);
				setState(712);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL_LITERAL() { return getToken(ParserAng.NULL_LITERAL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavegateLiteralContext extends LiteralContext {
		public TerminalNode MINUS() { return getToken(ParserAng.MINUS, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NavegateLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNavegateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNavegateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNavegateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ParserAng.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends LiteralContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ParserAng.DECIMAL_LITERAL, 0); }
		public NumberLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				match(STRING_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(DECIMAL_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(718);
				match(NULL_LITERAL);
				}
				break;
			case MINUS:
				_localctx = new NavegateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(719);
				match(MINUS);
				setState(720);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralDefinitionContext extends ArrayLiteralContext {
		public TerminalNode LBRACKET() { return getToken(ParserAng.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ParserAng.RBRACKET, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArrayLiteralDefinitionContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArrayLiteralDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArrayLiteralDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArrayLiteralDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayLiteral);
		int _la;
		try {
			_localctx = new ArrayLiteralDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(LBRACKET);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
				{
				setState(724);
				argumentList();
				}
			}

			setState(727);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	 
		public ObjectLiteralContext() { }
		public void copyFrom(ObjectLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralDefinitionContext extends ObjectLiteralContext {
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public ObjectLiteralDefinitionContext(ObjectLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterObjectLiteralDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitObjectLiteralDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitObjectLiteralDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			_localctx = new ObjectLiteralDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(LBRACE);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPREAD || _la==IDENTIFIER) {
				{
				setState(730);
				propertyAssignment();
				{
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(731);
					match(COMMA);
					setState(732);
					propertyAssignment();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(740);
			match(RBRACE);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(741);
					match(COMMA);
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentDefinitionContext extends PropertyAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyAssignmentDefinitionContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterPropertyAssignmentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitPropertyAssignmentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitPropertyAssignmentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShorthandPropertyAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public ShorthandPropertyAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterShorthandPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitShorthandPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitShorthandPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpreadPropertyContext extends PropertyAssignmentContext {
		public TerminalNode SPREAD() { return getToken(ParserAng.SPREAD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public SpreadPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterSpreadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitSpreadProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitSpreadProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertyAssignment);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new PropertyAssignmentDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(IDENTIFIER);
				setState(748);
				match(COLON);
				setState(749);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ShorthandPropertyAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new SpreadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				match(SPREAD);
				setState(752);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementDefinitionContext extends ExpressionStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserAng.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserAng.SEMICOLON, i);
		}
		public ExpressionStatementDefinitionContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterExpressionStatementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitExpressionStatementDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitExpressionStatementDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		int _la;
		try {
			_localctx = new ExpressionStatementDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			expression(0);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(756);
				match(SEMICOLON);
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementDefinitionContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(ParserAng.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(ParserAng.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ParserAng.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ParserAng.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ParserAng.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ParserAng.ELSE, 0); }
		public IfStatementDefinitionContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterIfStatementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitIfStatementDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitIfStatementDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			_localctx = new IfStatementDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(IF);
			setState(763);
			match(LPAREN);
			setState(764);
			expression(0);
			setState(765);
			match(RPAREN);
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(766);
				match(LBRACE);
				}
				break;
			}
			setState(769);
			statement();
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(770);
				match(RBRACE);
				}
				break;
			}
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(773);
				match(ELSE);
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(774);
					match(LBRACE);
					}
					break;
				}
				setState(777);
				statement();
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(778);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementDefinitionContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(ParserAng.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserAng.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserAng.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitializerContext forInitializer() {
			return getRuleContext(ForInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public SourceElementContext sourceElement() {
			return getRuleContext(SourceElementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public ForStatementDefinitionContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterForStatementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitForStatementDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitForStatementDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			_localctx = new ForStatementDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(FOR);
			setState(784);
			match(LPAREN);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850185968L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
				{
				setState(785);
				forInitializer();
				}
			}

			setState(788);
			match(SEMICOLON);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
				{
				setState(789);
				expression(0);
				}
			}

			setState(792);
			match(SEMICOLON);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
				{
				setState(793);
				expression(0);
				}
			}

			setState(796);
			match(RPAREN);
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(797);
					match(LBRACE);
					}
					break;
				}
				setState(801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(800);
					sourceElement();
					}
					break;
				}
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(803);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(806);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitializerContext extends ParserRuleContext {
		public ForInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitializer; }
	 
		public ForInitializerContext() { }
		public void copyFrom(ForInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionInitializerContext extends ForInitializerContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExpressionInitializerContext(ForInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterForExpressionInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitForExpressionInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitForExpressionInitializer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForVariableInitializerContext extends ForInitializerContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ForVariableInitializerContext(ForInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterForVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitForVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitForVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForAssignInitializerContext extends ForInitializerContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode LET() { return getToken(ParserAng.LET, 0); }
		public TerminalNode VAR() { return getToken(ParserAng.VAR, 0); }
		public TerminalNode CONST() { return getToken(ParserAng.CONST, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForAssignInitializerContext(ForInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterForAssignInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitForAssignInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitForAssignInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializerContext forInitializer() throws RecognitionException {
		ForInitializerContext _localctx = new ForInitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forInitializer);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new ForVariableInitializerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new ForAssignInitializerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12544L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(811);
				match(IDENTIFIER);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(812);
					match(ASSIGN);
					setState(813);
					expression(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new ForExpressionInitializerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementDefinitionContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(ParserAng.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserAng.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementDefinitionContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterReturnStatementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitReturnStatementDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitReturnStatementDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnStatementDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(RETURN);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6916886912850198256L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2267746796801L) != 0)) {
				{
				setState(820);
				expression(0);
				}
			}

			setState(823);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	 
		public VariableStatementContext() { }
		public void copyFrom(VariableStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementDefinition2Context extends VariableStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserAng.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(ParserAng.VAR, 0); }
		public TerminalNode LET() { return getToken(ParserAng.LET, 0); }
		public TerminalNode CONST() { return getToken(ParserAng.CONST, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public VariableStatementDefinition2Context(VariableStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterVariableStatementDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitVariableStatementDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitVariableStatementDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableStatement);
		int _la;
		try {
			_localctx = new VariableStatementDefinition2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12544L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(826);
			match(IDENTIFIER);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(827);
				match(COLON);
				setState(828);
				typeAnnotation();
				}
			}

			setState(831);
			match(ASSIGN);
			setState(832);
			expression(0);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(833);
				match(COMMA);
				setState(834);
				expression(0);
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationDefinitionContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public TerminalNode LESS_THAN() { return getToken(ParserAng.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ParserAng.GREATER_THAN, 0); }
		public VariableDeclarationDefinitionContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterVariableDeclarationDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitVariableDeclarationDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitVariableDeclarationDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDeclarationDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(IDENTIFIER);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(843);
				match(COLON);
				setState(844);
				typeAnnotation();
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 25165825L) != 0)) {
				{
				setState(847);
				_la = _input.LA(1);
				if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 25165825L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(848);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListDefinitionContext extends ParameterListContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ParserAng.COMMA, 0); }
		public ParameterListDefinitionContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterParameterListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitParameterListDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitParameterListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterList);
		int _la;
		try {
			_localctx = new ParameterListDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			parameter();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(852);
				match(COMMA);
				setState(853);
				parameter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDefinitionContext extends ParameterContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParameterDefinitionContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterParameterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitParameterDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitParameterDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameter);
		int _la;
		try {
			_localctx = new ParameterDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(IDENTIFIER);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(857);
				match(COLON);
				setState(858);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListDefinitionContext extends ArgumentListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public ArgumentListDefinitionContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterArgumentListDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitArgumentListDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitArgumentListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_argumentList);
		int _la;
		try {
			_localctx = new ArgumentListDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			expression(0);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(862);
				match(COMMA);
				setState(863);
				expression(0);
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	 
		public ObjectTypeContext() { }
		public void copyFrom(ObjectTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeDefinitionContext extends ObjectTypeContext {
		public TerminalNode LBRACE() { return getToken(ParserAng.LBRACE, 0); }
		public List<ObjectTypeMemberContext> objectTypeMember() {
			return getRuleContexts(ObjectTypeMemberContext.class);
		}
		public ObjectTypeMemberContext objectTypeMember(int i) {
			return getRuleContext(ObjectTypeMemberContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ParserAng.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAng.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAng.COMMA, i);
		}
		public ObjectTypeDefinitionContext(ObjectTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterObjectTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitObjectTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitObjectTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_objectType);
		int _la;
		try {
			_localctx = new ObjectTypeDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(LBRACE);
			setState(870);
			objectTypeMember();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(871);
				match(COMMA);
				setState(872);
				objectTypeMember();
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeMemberContext extends ParserRuleContext {
		public ObjectTypeMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeMember; }
	 
		public ObjectTypeMemberContext() { }
		public void copyFrom(ObjectTypeMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeMemberDefinitionContext extends ObjectTypeMemberContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAng.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ObjectTypeMemberDefinitionContext(ObjectTypeMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterObjectTypeMemberDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitObjectTypeMemberDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitObjectTypeMemberDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeMemberContext objectTypeMember() throws RecognitionException {
		ObjectTypeMemberContext _localctx = new ObjectTypeMemberContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_objectTypeMember);
		try {
			_localctx = new ObjectTypeMemberDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(IDENTIFIER);
			setState(881);
			match(COLON);
			setState(882);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgDirectiveContext extends ParserRuleContext {
		public NgDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngDirective; }
	 
		public NgDirectiveContext() { }
		public void copyFrom(NgDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNgSwitchContext extends NgDirectiveContext {
		public NgSwitchDirectiveContext ngSwitchDirective() {
			return getRuleContext(NgSwitchDirectiveContext.class,0);
		}
		public DirectiveNgSwitchContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDirectiveNgSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDirectiveNgSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDirectiveNgSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNgStyleContext extends NgDirectiveContext {
		public NgStyleDirectiveContext ngStyleDirective() {
			return getRuleContext(NgStyleDirectiveContext.class,0);
		}
		public DirectiveNgStyleContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDirectiveNgStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDirectiveNgStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDirectiveNgStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNgForContext extends NgDirectiveContext {
		public NgForDirectiveContext ngForDirective() {
			return getRuleContext(NgForDirectiveContext.class,0);
		}
		public DirectiveNgForContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDirectiveNgFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDirectiveNgFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDirectiveNgFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNgIfContext extends NgDirectiveContext {
		public NgIfDirectiveContext ngIfDirective() {
			return getRuleContext(NgIfDirectiveContext.class,0);
		}
		public DirectiveNgIfContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDirectiveNgIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDirectiveNgIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDirectiveNgIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNgClassContext extends NgDirectiveContext {
		public NgClassDirectiveContext ngClassDirective() {
			return getRuleContext(NgClassDirectiveContext.class,0);
		}
		public DirectiveNgClassContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDirectiveNgClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDirectiveNgClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDirectiveNgClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveNgModelContext extends NgDirectiveContext {
		public NgModelDirectiveContext ngModelDirective() {
			return getRuleContext(NgModelDirectiveContext.class,0);
		}
		public DirectiveNgModelContext(NgDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterDirectiveNgModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitDirectiveNgModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitDirectiveNgModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgDirectiveContext ngDirective() throws RecognitionException {
		NgDirectiveContext _localctx = new NgDirectiveContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ngDirective);
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				_localctx = new DirectiveNgForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				ngForDirective();
				}
				break;
			case NG_IF:
				_localctx = new DirectiveNgIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				ngIfDirective();
				}
				break;
			case NG_STYLE:
			case NG_STYLE_BINDING:
				_localctx = new DirectiveNgStyleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				ngStyleDirective();
				}
				break;
			case NG_SWITCH:
				_localctx = new DirectiveNgSwitchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(887);
				ngSwitchDirective();
				}
				break;
			case NG_CLASS:
			case NG_CLASS_BINDING:
				_localctx = new DirectiveNgClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(888);
				ngClassDirective();
				}
				break;
			case NG_MODEL_BINDING:
				_localctx = new DirectiveNgModelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				ngModelDirective();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveContext extends ParserRuleContext {
		public NgForDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForDirective; }
	 
		public NgForDirectiveContext() { }
		public void copyFrom(NgForDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveDefinition2Context extends NgForDirectiveContext {
		public TerminalNode NG_FOR() { return getToken(ParserAng.NG_FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public NgForDirectiveDefinition2Context(NgForDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgForDirectiveDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgForDirectiveDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgForDirectiveDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveDefinition1Context extends NgForDirectiveContext {
		public TerminalNode NG_FOR() { return getToken(ParserAng.NG_FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public TerminalNode LET() { return getToken(ParserAng.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode OF() { return getToken(ParserAng.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgForDirectiveDefinition1Context(NgForDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgForDirectiveDefinition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgForDirectiveDefinition1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgForDirectiveDefinition1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForDirectiveContext ngForDirective() throws RecognitionException {
		NgForDirectiveContext _localctx = new NgForDirectiveContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ngForDirective);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new NgForDirectiveDefinition1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(NG_FOR);
				setState(893);
				match(ASSIGN);
				setState(894);
				match(LET);
				setState(895);
				match(IDENTIFIER);
				setState(896);
				match(OF);
				setState(897);
				expression(0);
				}
				break;
			case 2:
				_localctx = new NgForDirectiveDefinition2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(NG_FOR);
				setState(899);
				match(ASSIGN);
				setState(900);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgIfDirectiveContext extends ParserRuleContext {
		public NgIfDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIfDirective; }
	 
		public NgIfDirectiveContext() { }
		public void copyFrom(NgIfDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgIfDirectiveDefinitionContext extends NgIfDirectiveContext {
		public TerminalNode NG_IF() { return getToken(ParserAng.NG_IF, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgIfDirectiveDefinitionContext(NgIfDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgIfDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgIfDirectiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgIfDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfDirectiveContext ngIfDirective() throws RecognitionException {
		NgIfDirectiveContext _localctx = new NgIfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ngIfDirective);
		try {
			_localctx = new NgIfDirectiveDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(NG_IF);
			setState(904);
			match(ASSIGN);
			setState(905);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgSwitchDirectiveContext extends ParserRuleContext {
		public NgSwitchDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngSwitchDirective; }
	 
		public NgSwitchDirectiveContext() { }
		public void copyFrom(NgSwitchDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgSwitchDirectiveDefinitionContext extends NgSwitchDirectiveContext {
		public TerminalNode NG_SWITCH() { return getToken(ParserAng.NG_SWITCH, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgSwitchDirectiveDefinitionContext(NgSwitchDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgSwitchDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgSwitchDirectiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgSwitchDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgSwitchDirectiveContext ngSwitchDirective() throws RecognitionException {
		NgSwitchDirectiveContext _localctx = new NgSwitchDirectiveContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ngSwitchDirective);
		try {
			_localctx = new NgSwitchDirectiveDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(NG_SWITCH);
			setState(908);
			match(ASSIGN);
			setState(909);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgClassDirectiveContext extends ParserRuleContext {
		public NgClassDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngClassDirective; }
	 
		public NgClassDirectiveContext() { }
		public void copyFrom(NgClassDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgClassDirectiveDefinitionContext extends NgClassDirectiveContext {
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_CLASS() { return getToken(ParserAng.NG_CLASS, 0); }
		public TerminalNode NG_CLASS_BINDING() { return getToken(ParserAng.NG_CLASS_BINDING, 0); }
		public NgClassDirectiveDefinitionContext(NgClassDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgClassDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgClassDirectiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgClassDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgClassDirectiveContext ngClassDirective() throws RecognitionException {
		NgClassDirectiveContext _localctx = new NgClassDirectiveContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ngClassDirective);
		int _la;
		try {
			_localctx = new NgClassDirectiveDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_la = _input.LA(1);
			if ( !(_la==NG_CLASS || _la==NG_CLASS_BINDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(912);
			match(ASSIGN);
			setState(913);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgStyleDirectiveContext extends ParserRuleContext {
		public NgStyleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngStyleDirective; }
	 
		public NgStyleDirectiveContext() { }
		public void copyFrom(NgStyleDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgStyleDirectiveDefinitionContext extends NgStyleDirectiveContext {
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NG_STYLE() { return getToken(ParserAng.NG_STYLE, 0); }
		public TerminalNode NG_STYLE_BINDING() { return getToken(ParserAng.NG_STYLE_BINDING, 0); }
		public NgStyleDirectiveDefinitionContext(NgStyleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgStyleDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgStyleDirectiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgStyleDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgStyleDirectiveContext ngStyleDirective() throws RecognitionException {
		NgStyleDirectiveContext _localctx = new NgStyleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ngStyleDirective);
		int _la;
		try {
			_localctx = new NgStyleDirectiveDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_la = _input.LA(1);
			if ( !(_la==NG_STYLE || _la==NG_STYLE_BINDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(916);
			match(ASSIGN);
			setState(917);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgModelDirectiveContext extends ParserRuleContext {
		public NgModelDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModelDirective; }
	 
		public NgModelDirectiveContext() { }
		public void copyFrom(NgModelDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgModelDirectiveDefinitionContext extends NgModelDirectiveContext {
		public TerminalNode NG_MODEL_BINDING() { return getToken(ParserAng.NG_MODEL_BINDING, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgModelDirectiveDefinitionContext(NgModelDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterNgModelDirectiveDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitNgModelDirectiveDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitNgModelDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModelDirectiveContext ngModelDirective() throws RecognitionException {
		NgModelDirectiveContext _localctx = new NgModelDirectiveContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ngModelDirective);
		try {
			_localctx = new NgModelDirectiveDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(NG_MODEL_BINDING);
			setState(920);
			match(ASSIGN);
			setState(921);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContext extends ParserRuleContext {
		public HtmlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplate; }
	 
		public HtmlTemplateContext() { }
		public void copyFrom(HtmlTemplateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContentContext extends HtmlTemplateContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlTemplateContentContext(HtmlTemplateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlTemplateContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateContext htmlTemplate() throws RecognitionException {
		HtmlTemplateContext _localctx = new HtmlTemplateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_htmlTemplate);
		int _la;
		try {
			_localctx = new HtmlTemplateContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(924); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(923);
				htmlElement();
				}
				}
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 4630513615L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateElementContext extends HtmlElementContext {
		public TemplatePartContext templatePart() {
			return getRuleContext(TemplatePartContext.class,0);
		}
		public HtmlTemplateElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlTemplateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlTemplateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlTemplateElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNgDirectiveElementContext extends HtmlElementContext {
		public NgDirectiveContext ngDirective() {
			return getRuleContext(NgDirectiveContext.class,0);
		}
		public HtmlNgDirectiveElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlNgDirectiveElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlNgDirectiveElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlNgDirectiveElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagElementContext extends HtmlElementContext {
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public HtmlTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlTagElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlElement);
		try {
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_OPEN:
			case HTML_TAG_OPEN_Q:
				_localctx = new HtmlTagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				htmlTag();
				}
				break;
			case HASH:
			case IDENTIFIER:
				_localctx = new HtmlTemplateElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				templatePart();
				}
				break;
			case NG_FOR:
			case NG_IF:
			case NG_SWITCH:
			case NG_CLASS:
			case NG_STYLE:
			case NG_CLASS_BINDING:
			case NG_STYLE_BINDING:
			case NG_MODEL_BINDING:
				_localctx = new HtmlNgDirectiveElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				ngDirective();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
	 
		public HtmlTagContext() { }
		public void copyFrom(HtmlTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagDefinitionContext extends HtmlTagContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(ParserAng.HTML_TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_OPEN_Q() { return getToken(ParserAng.HTML_TAG_OPEN_Q, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<NgDirectiveContext> ngDirective() {
			return getRuleContexts(NgDirectiveContext.class);
		}
		public NgDirectiveContext ngDirective(int i) {
			return getRuleContext(NgDirectiveContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(ParserAng.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(ParserAng.GREATER_THAN, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE_RIGHT() { return getTokens(ParserAng.HTML_TAG_CLOSE_RIGHT); }
		public TerminalNode HTML_TAG_CLOSE_RIGHT(int i) {
			return getToken(ParserAng.HTML_TAG_CLOSE_RIGHT, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(ParserAng.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(ParserAng.HTML_TAG_CLOSE, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE_Q() { return getTokens(ParserAng.HTML_TAG_CLOSE_Q); }
		public TerminalNode HTML_TAG_CLOSE_Q(int i) {
			return getToken(ParserAng.HTML_TAG_CLOSE_Q, i);
		}
		public HtmlTagDefinitionContext(HtmlTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlTagDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlTagDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlTagDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_htmlTag);
		int _la;
		try {
			int _alt;
			_localctx = new HtmlTagDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_la = _input.LA(1);
			if ( !(_la==HTML_TAG_OPEN || _la==HTML_TAG_OPEN_Q) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(939);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(937);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(934);
						htmlElement();
						}
						break;
					case 2:
						{
						setState(935);
						htmlAttribute();
						}
						break;
					case 3:
						{
						setState(936);
						ngDirective();
						}
						break;
					}
					} 
				}
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(942);
					match(GREATER_THAN);
					}
					} 
				}
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(948);
						_la = _input.LA(1);
						if ( !(_la==HTML_TAG_CLOSE || _la==HTML_TAG_CLOSE_Q) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(953);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(954);
						htmlElement();
						}
						} 
					}
					setState(959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(960);
						match(HTML_TAG_CLOSE_RIGHT);
						}
						} 
					}
					setState(965);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(966);
						match(HTML_TAG_CLOSE_RIGHT);
						}
						} 
					}
					setState(971);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeDefinition2Context extends HtmlAttributeContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAng.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAng.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ParserAng.DOT, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ParserAng.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ParserAng.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ParserAng.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ParserAng.RBRACE, i);
		}
		public HtmlAttributeDefinition2Context(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlAttributeDefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlAttributeDefinition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlAttributeDefinition2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeDefinition3Context extends HtmlAttributeContext {
		public TerminalNode LPAREN() { return getToken(ParserAng.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAng.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public HtmlAttributeDefinition3Context(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlAttributeDefinition3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlAttributeDefinition3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlAttributeDefinition3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeDefinition1Context extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode CLASS() { return getToken(ParserAng.CLASS, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(ParserAng.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(ParserAng.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(ParserAng.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(ParserAng.RBRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public HtmlAttributeDefinition1Context(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlAttributeDefinition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlAttributeDefinition1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlAttributeDefinition1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeDefinition4Context extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAng.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserAng.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public HtmlAttributeDefinition4Context(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlAttributeDefinition4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlAttributeDefinition4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlAttributeDefinition4(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeDefinition5Context extends HtmlAttributeContext {
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public HtmlAttributeDefinition5Context(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterHtmlAttributeDefinition5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitHtmlAttributeDefinition5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitHtmlAttributeDefinition5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_htmlAttribute);
		int _la;
		try {
			int _alt;
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new HtmlAttributeDefinition1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(974);
					match(LBRACKET);
					}
					}
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(980);
				_la = _input.LA(1);
				if ( !(_la==CLASS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RBRACKET) {
					{
					{
					setState(981);
					match(RBRACKET);
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(987);
					match(ASSIGN);
					setState(988);
					attributeValue();
					}
				}

				}
				break;
			case 2:
				_localctx = new HtmlAttributeDefinition2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(991);
						match(LBRACE);
						}
						} 
					}
					setState(996);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(997);
					match(LBRACE);
					}
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1003);
				match(IDENTIFIER);
				setState(1004);
				match(DOT);
				setState(1005);
				match(IDENTIFIER);
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1006);
						match(RBRACE);
						}
						} 
					}
					setState(1011);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RBRACE) {
					{
					{
					setState(1012);
					match(RBRACE);
					}
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new HtmlAttributeDefinition3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1018);
				match(LPAREN);
				setState(1019);
				match(IDENTIFIER);
				setState(1020);
				match(RPAREN);
				setState(1021);
				match(ASSIGN);
				setState(1022);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				_localctx = new HtmlAttributeDefinition4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1023);
				match(IDENTIFIER);
				setState(1024);
				match(ASSIGN);
				setState(1025);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				_localctx = new HtmlAttributeDefinition5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1026);
				attributeValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
	 
		public AttributeValueContext() { }
		public void copyFrom(AttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAttributeValueContext extends AttributeValueContext {
		public TerminalNode STRING_LITERAL() { return getToken(ParserAng.STRING_LITERAL, 0); }
		public StringAttributeValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterStringAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitStringAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitStringAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAttributeValueContext extends AttributeValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAttributeValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).enterExpressionAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngListener ) ((ParserAngListener)listener).exitExpressionAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngVisitor ) return ((ParserAngVisitor<? extends T>)visitor).visitExpressionAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attributeValue);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new StringAttributeValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				_localctx = new ExpressionAttributeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001j\u040a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0003\u0000"+
		"\u0082\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0087\b"+
		"\u0001\n\u0001\f\u0001\u008a\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0095\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u009c\b\u0003\n\u0003\f\u0003\u009f\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ab\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b1\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00b5\b\u0005\n\u0005\f\u0005\u00b8\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0005\u0007\u00c2\b\u0007\n\u0007\f\u0007\u00c5"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cb"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cf\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00d3\b\u0007\n\u0007\f\u0007\u00d6\t\u0007\u0001"+
		"\u0007\u0005\u0007\u00d9\b\u0007\n\u0007\f\u0007\u00dc\t\u0007\u0001\b"+
		"\u0005\b\u00df\b\b\n\b\f\b\u00e2\t\b\u0001\b\u0001\b\u0005\b\u00e6\b\b"+
		"\n\b\f\b\u00e9\t\b\u0001\b\u0001\b\u0005\b\u00ed\b\b\n\b\f\b\u00f0\t\b"+
		"\u0001\b\u0003\b\u00f3\b\b\u0001\t\u0003\t\u00f6\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00fc\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0101\b\t"+
		"\u0001\t\u0001\t\u0005\t\u0105\b\t\n\t\f\t\u0108\t\t\u0001\t\u0001\t\u0003"+
		"\t\u010c\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0111\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0116\b\t\u0001\t\u0001\t\u0001\t\u0005\t\u011b\b\t\n"+
		"\t\f\t\u011e\t\t\u0001\t\u0001\t\u0003\t\u0122\b\t\u0003\t\u0124\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u012b\b\n\u0001\n\u0003\n\u012e"+
		"\b\n\u0003\n\u0130\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0134\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u013f\b\r\n\r\f\r\u0142\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u014a\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u015a\b\u0011\n\u0011\f\u0011\u015d\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0165\b\u0011\n\u0011\f\u0011\u0168\t\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u016c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0173\b\u0012\n\u0012\f\u0012\u0176\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u017a\b\u0012\n\u0012\f\u0012\u017d\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0182\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0187\b\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u018b\b\u0013\u0001\u0013\u0003\u0013\u018e\b\u0013\u0001\u0014"+
		"\u0003\u0014\u0191\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0196\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u019b\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u019f\b\u0014\n\u0014\f\u0014"+
		"\u01a2\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u01a9\b\u0014\n\u0014\f\u0014\u01ac\t\u0014\u0001\u0014\u0003"+
		"\u0014\u01af\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b4"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01b9\b\u0015"+
		"\n\u0015\f\u0015\u01bc\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u01c3\b\u0015\n\u0015\f\u0015\u01c6\t\u0015"+
		"\u0001\u0015\u0003\u0015\u01c9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01ce\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0005\u0017"+
		"\u01d3\b\u0017\n\u0017\f\u0017\u01d6\t\u0017\u0001\u0018\u0003\u0018\u01d9"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e3\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0201\b\u0019\n\u0019\f\u0019"+
		"\u0204\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0208\b\u0019\n\u0019"+
		"\f\u0019\u020b\t\u0019\u0001\u0019\u0005\u0019\u020e\b\u0019\n\u0019\f"+
		"\u0019\u0211\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u021a\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u021e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0229\b\u0019\n\u0019\f\u0019\u022c\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0237\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0240\b\u001c"+
		"\n\u001c\f\u001c\u0243\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0248\b\u001d\u0001\u001d\u0003\u001d\u024b\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0251\b\u001e\n\u001e"+
		"\f\u001e\u0254\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u025b\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0263\b \u0001!\u0001!\u0001!\u0001!\u0005!\u0269\b!\n"+
		"!\f!\u026c\t!\u0001!\u0001!\u0001\"\u0005\"\u0271\b\"\n\"\f\"\u0274\t"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u027f\b\"\u0001\"\u0001\"\u0003\"\u0283\b\"\u0005\"\u0285\b"+
		"\"\n\"\f\"\u0288\t\"\u0001\"\u0003\"\u028b\b\"\u0001\"\u0003\"\u028e\b"+
		"\"\u0001\"\u0003\"\u0291\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u0296\b\""+
		"\u0001\"\u0001\"\u0003\"\u029a\b\"\u0005\"\u029c\b\"\n\"\f\"\u029f\t\""+
		"\u0001\"\u0003\"\u02a2\b\"\u0001\"\u0003\"\u02a5\b\"\u0001\"\u0003\"\u02a8"+
		"\b\"\u0001\"\u0005\"\u02ab\b\"\n\"\f\"\u02ae\t\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02bc\b\"\u0001\"\u0001\"\u0003\"\u02c0\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02ca\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u02d2\b$\u0001%\u0001%\u0003%\u02d6\b%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u02de\b&\n&\f&\u02e1\t&\u0003"+
		"&\u02e3\b&\u0001&\u0001&\u0005&\u02e7\b&\n&\f&\u02ea\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02f2\b\'\u0001(\u0001(\u0005"+
		"(\u02f6\b(\n(\f(\u02f9\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0300"+
		"\b)\u0001)\u0001)\u0003)\u0304\b)\u0001)\u0001)\u0003)\u0308\b)\u0001"+
		")\u0001)\u0003)\u030c\b)\u0003)\u030e\b)\u0001*\u0001*\u0001*\u0003*\u0313"+
		"\b*\u0001*\u0001*\u0003*\u0317\b*\u0001*\u0001*\u0003*\u031b\b*\u0001"+
		"*\u0001*\u0003*\u031f\b*\u0001*\u0003*\u0322\b*\u0001*\u0003*\u0325\b"+
		"*\u0001*\u0003*\u0328\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u032f"+
		"\b+\u0001+\u0003+\u0332\b+\u0001,\u0001,\u0003,\u0336\b,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0003-\u033e\b-\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u0344\b-\n-\f-\u0347\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003"+
		".\u034e\b.\u0001.\u0001.\u0003.\u0352\b.\u0001/\u0001/\u0001/\u0003/\u0357"+
		"\b/\u00010\u00010\u00010\u00030\u035c\b0\u00011\u00011\u00011\u00051\u0361"+
		"\b1\n1\f1\u0364\t1\u00012\u00012\u00012\u00012\u00052\u036a\b2\n2\f2\u036d"+
		"\t2\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u037b\b4\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u0386\b5\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0004;\u039d\b;\u000b;\f;"+
		"\u039e\u0001<\u0001<\u0001<\u0003<\u03a4\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0005=\u03aa\b=\n=\f=\u03ad\t=\u0001=\u0005=\u03b0\b=\n=\f=\u03b3\t"+
		"=\u0001=\u0005=\u03b6\b=\n=\f=\u03b9\t=\u0001=\u0005=\u03bc\b=\n=\f=\u03bf"+
		"\t=\u0001=\u0005=\u03c2\b=\n=\f=\u03c5\t=\u0001=\u0005=\u03c8\b=\n=\f"+
		"=\u03cb\t=\u0003=\u03cd\b=\u0001>\u0005>\u03d0\b>\n>\f>\u03d3\t>\u0001"+
		">\u0001>\u0005>\u03d7\b>\n>\f>\u03da\t>\u0001>\u0001>\u0003>\u03de\b>"+
		"\u0001>\u0005>\u03e1\b>\n>\f>\u03e4\t>\u0001>\u0005>\u03e7\b>\n>\f>\u03ea"+
		"\t>\u0001>\u0001>\u0001>\u0001>\u0005>\u03f0\b>\n>\f>\u03f3\t>\u0001>"+
		"\u0005>\u03f6\b>\n>\f>\u03f9\t>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0404\b>\u0001?\u0001?\u0003?\u0408\b?\u0001"+
		"?\u0000\u00012@\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0000\u000e\u0001\u0000\u001d\u001f\u0001\u0000Zd\u0002\u0000"+
		"FFHH\u0001\u0000()\u0001\u0000*+\u0003\u0000&\'/0CD\u0001\u0000$%\u0002"+
		"\u0000\b\b\f\r\u0002\u0000,,CD\u0002\u000088::\u0002\u000099;;\u0002\u0000"+
		"LLNN\u0002\u0000MMOO\u0002\u0000\t\tRR\u0488\u0000\u0081\u0001\u0000\u0000"+
		"\u0000\u0002\u0088\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000"+
		"\u0000\u0006\u0096\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000\u0000\u0000"+
		"\n\u00ac\u0001\u0000\u0000\u0000\f\u00bb\u0001\u0000\u0000\u0000\u000e"+
		"\u00c3\u0001\u0000\u0000\u0000\u0010\u00f2\u0001\u0000\u0000\u0000\u0012"+
		"\u0123\u0001\u0000\u0000\u0000\u0014\u012f\u0001\u0000\u0000\u0000\u0016"+
		"\u0133\u0001\u0000\u0000\u0000\u0018\u0135\u0001\u0000\u0000\u0000\u001a"+
		"\u013a\u0001\u0000\u0000\u0000\u001c\u0149\u0001\u0000\u0000\u0000\u001e"+
		"\u014b\u0001\u0000\u0000\u0000 \u014f\u0001\u0000\u0000\u0000\"\u016b"+
		"\u0001\u0000\u0000\u0000$\u016d\u0001\u0000\u0000\u0000&\u0181\u0001\u0000"+
		"\u0000\u0000(\u01ae\u0001\u0000\u0000\u0000*\u01c8\u0001\u0000\u0000\u0000"+
		",\u01ca\u0001\u0000\u0000\u0000.\u01d4\u0001\u0000\u0000\u00000\u01d8"+
		"\u0001\u0000\u0000\u00002\u01e2\u0001\u0000\u0000\u00004\u022d\u0001\u0000"+
		"\u0000\u00006\u0234\u0001\u0000\u0000\u00008\u023c\u0001\u0000\u0000\u0000"+
		":\u024a\u0001\u0000\u0000\u0000<\u024c\u0001\u0000\u0000\u0000>\u0257"+
		"\u0001\u0000\u0000\u0000@\u0262\u0001\u0000\u0000\u0000B\u0264\u0001\u0000"+
		"\u0000\u0000D\u02bf\u0001\u0000\u0000\u0000F\u02c9\u0001\u0000\u0000\u0000"+
		"H\u02d1\u0001\u0000\u0000\u0000J\u02d3\u0001\u0000\u0000\u0000L\u02d9"+
		"\u0001\u0000\u0000\u0000N\u02f1\u0001\u0000\u0000\u0000P\u02f3\u0001\u0000"+
		"\u0000\u0000R\u02fa\u0001\u0000\u0000\u0000T\u030f\u0001\u0000\u0000\u0000"+
		"V\u0331\u0001\u0000\u0000\u0000X\u0333\u0001\u0000\u0000\u0000Z\u0339"+
		"\u0001\u0000\u0000\u0000\\\u034a\u0001\u0000\u0000\u0000^\u0353\u0001"+
		"\u0000\u0000\u0000`\u0358\u0001\u0000\u0000\u0000b\u035d\u0001\u0000\u0000"+
		"\u0000d\u0365\u0001\u0000\u0000\u0000f\u0370\u0001\u0000\u0000\u0000h"+
		"\u037a\u0001\u0000\u0000\u0000j\u0385\u0001\u0000\u0000\u0000l\u0387\u0001"+
		"\u0000\u0000\u0000n\u038b\u0001\u0000\u0000\u0000p\u038f\u0001\u0000\u0000"+
		"\u0000r\u0393\u0001\u0000\u0000\u0000t\u0397\u0001\u0000\u0000\u0000v"+
		"\u039c\u0001\u0000\u0000\u0000x\u03a3\u0001\u0000\u0000\u0000z\u03a5\u0001"+
		"\u0000\u0000\u0000|\u0403\u0001\u0000\u0000\u0000~\u0407\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0000\u0000\u0001\u0084\u0001\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0003\u0004\u0002\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0003\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0095\u0003\u0006\u0003"+
		"\u0000\u008c\u0095\u0003\n\u0005\u0000\u008d\u0095\u0003\u000e\u0007\u0000"+
		"\u008e\u0095\u0003\u0018\f\u0000\u008f\u0095\u0003\b\u0004\u0000\u0090"+
		"\u0095\u0003P(\u0000\u0091\u0095\u0003R)\u0000\u0092\u0095\u0003T*\u0000"+
		"\u0093\u0095\u0003Z-\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008c"+
		"\u0001\u0000\u0000\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0005"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0098"+
		"\u0005A\u0000\u0000\u0098\u009d\u0005R\u0000\u0000\u0099\u009a\u0005H"+
		"\u0000\u0000\u009a\u009c\u0005R\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005B\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3\u0005S\u0000\u0000\u00a3"+
		"\u00a4\u0005F\u0000\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5\u00aa"+
		"\u0005\u0005\u0000\u0000\u00a6\u00ab\u0003\u000e\u0007\u0000\u00a7\u00ab"+
		"\u0003\n\u0005\u0000\u00a8\u00ab\u0003\u0012\t\u0000\u00a9\u00ab\u0003"+
		"(\u0014\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\t\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0007\u0000"+
		"\u0000\u00ad\u00b0\u0005R\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000"+
		"\u00af\u00b1\u0005R\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b6\u0005A\u0000\u0000\u00b3\u00b5\u0003\f\u0006\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005B\u0000\u0000\u00ba\u000b\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"R\u0000\u0000\u00bc\u00bd\u0005E\u0000\u0000\u00bd\u00be\u0003F#\u0000"+
		"\u00be\u00bf\u0005F\u0000\u0000\u00bf\r\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0003\u0014\n\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\t\u0000\u0000\u00c7\u00ca\u0005"+
		"R\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00cb\u0005R\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u000b\u0000"+
		"\u0000\u00cd\u00cf\u0005R\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d4\u0005A\u0000\u0000\u00d1\u00d3\u0003\u0010\b\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00da\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0005B\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u000f\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\u0014\n\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00f3\u0003"+
		"&\u0013\u0000\u00e4\u00e6\u0003\u0014\n\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00f3\u0003*\u0015"+
		"\u0000\u00eb\u00ed\u0003\u0014\n\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003(\u0014\u0000\u00f2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00f2\u00e7\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f3\u0011\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0007\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0003\u0000\u0000\u00f8\u00f9\u0005R\u0000\u0000\u00f9\u00fb"+
		"\u0005=\u0000\u0000\u00fa\u00fc\u0003^/\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0005>\u0000\u0000\u00fe\u00ff\u0005E\u0000\u0000"+
		"\u00ff\u0101\u0003F#\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0106"+
		"\u0005A\u0000\u0000\u0103\u0105\u0003\u0004\u0002\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0124\u0005"+
		"B\u0000\u0000\u010a\u010c\u0007\u0000\u0000\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005R\u0000\u0000\u010e\u0110\u0005=\u0000\u0000"+
		"\u010f\u0111\u0003^/\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0005>\u0000\u0000\u0113\u0114\u0005E\u0000\u0000\u0114\u0116\u0003F"+
		"#\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0121\u0005J\u0000\u0000"+
		"\u0118\u011c\u0005A\u0000\u0000\u0119\u011b\u0003\u0004\u0002\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f"+
		"\u0122\u0005B\u0000\u0000\u0120\u0122\u00032\u0019\u0000\u0121\u0118\u0001"+
		"\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u00f5\u0001\u0000\u0000\u0000\u0123\u010b\u0001"+
		"\u0000\u0000\u0000\u0124\u0013\u0001\u0000\u0000\u0000\u0125\u0130\u0007"+
		"\u0001\u0000\u0000\u0126\u0127\u0005\u0010\u0000\u0000\u0127\u012d\u0005"+
		"R\u0000\u0000\u0128\u012a\u0005=\u0000\u0000\u0129\u012b\u0003\u0016\u000b"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0005>\u0000\u0000"+
		"\u012d\u0128\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0125\u0001\u0000\u0000\u0000"+
		"\u012f\u0126\u0001\u0000\u0000\u0000\u0130\u0015\u0001\u0000\u0000\u0000"+
		"\u0131\u0134\u0003L&\u0000\u0132\u0134\u00032\u0019\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0017"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005Z\u0000\u0000\u0136\u0137\u0005"+
		"=\u0000\u0000\u0137\u0138\u0003\u001a\r\u0000\u0138\u0139\u0005>\u0000"+
		"\u0000\u0139\u0019\u0001\u0000\u0000\u0000\u013a\u013b\u0005A\u0000\u0000"+
		"\u013b\u0140\u0003\u001c\u000e\u0000\u013c\u013d\u0005H\u0000\u0000\u013d"+
		"\u013f\u0003\u001c\u000e\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f"+
		"\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0143\u0144\u0005B\u0000\u0000\u0144\u001b"+
		"\u0001\u0000\u0000\u0000\u0145\u014a\u0003\u001e\u000f\u0000\u0146\u014a"+
		"\u0003 \u0010\u0000\u0147\u014a\u0003\"\u0011\u0000\u0148\u014a\u0003"+
		"2\u0019\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u001d\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0013"+
		"\u0000\u0000\u014c\u014d\u0005E\u0000\u0000\u014d\u014e\u0005S\u0000\u0000"+
		"\u014e\u001f\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0014\u0000\u0000"+
		"\u0150\u0151\u0005E\u0000\u0000\u0151\u0152\u0003,\u0016\u0000\u0152!"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0015\u0000\u0000\u0154\u0155"+
		"\u0005E\u0000\u0000\u0155\u0156\u0005?\u0000\u0000\u0156\u015b\u0005S"+
		"\u0000\u0000\u0157\u0158\u0005H\u0000\u0000\u0158\u015a\u0005S\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u016c\u0005@\u0000\u0000\u015f\u0160\u0005\u0016\u0000\u0000\u0160"+
		"\u0161\u0005E\u0000\u0000\u0161\u0162\u0005?\u0000\u0000\u0162\u0166\u0005"+
		"I\u0000\u0000\u0163\u0165\u0003$\u0012\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005I\u0000\u0000"+
		"\u016a\u016c\u0005@\u0000\u0000\u016b\u0153\u0001\u0000\u0000\u0000\u016b"+
		"\u015f\u0001\u0000\u0000\u0000\u016c#\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0005G\u0000\u0000\u016e\u016f\u0005R\u0000\u0000\u016f\u0170\u0005+"+
		"\u0000\u0000\u0170\u0174\u0005R\u0000\u0000\u0171\u0173\u0005R\u0000\u0000"+
		"\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u017b\u0005A\u0000\u0000\u0178\u017a\u0003P(\u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0005B\u0000\u0000\u017f%\u0001\u0000\u0000\u0000\u0180\u0182\u0007\u0000"+
		"\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0186\u0005R\u0000"+
		"\u0000\u0184\u0185\u0005E\u0000\u0000\u0185\u0187\u0003F#\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187"+
		"\u018a\u0001\u0000\u0000\u0000\u0188\u0189\u0005,\u0000\u0000\u0189\u018b"+
		"\u00032\u0019\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001"+
		"\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0007"+
		"\u0002\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\'\u0001\u0000\u0000\u0000\u018f\u0191\u0007\u0000"+
		"\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005R\u0000"+
		"\u0000\u0193\u0195\u0005=\u0000\u0000\u0194\u0196\u0003^/\u0000\u0195"+
		"\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u019a\u0005>\u0000\u0000\u0198\u0199"+
		"\u0005E\u0000\u0000\u0199\u019b\u0003F#\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u01a0\u0005A\u0000\u0000\u019d\u019f\u0003\u0004\u0002"+
		"\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01af\u0005B\u0000\u0000\u01a4\u01a5\u0005R\u0000\u0000\u01a5"+
		"\u01a6\u0005e\u0000\u0000\u01a6\u01aa\u0005A\u0000\u0000\u01a7\u01a9\u0003"+
		"\u0004\u0002\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ad\u01af\u0005B\u0000\u0000\u01ae\u0190\u0001\u0000"+
		"\u0000\u0000\u01ae\u01a4\u0001\u0000\u0000\u0000\u01af)\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0005 \u0000\u0000\u01b1\u01b3\u0005=\u0000\u0000\u01b2"+
		"\u01b4\u0003^/\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		">\u0000\u0000\u01b6\u01ba\u0005A\u0000\u0000\u01b7\u01b9\u0003\u0004\u0002"+
		"\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c9\u0005B\u0000\u0000\u01be\u01bf\u0005 \u0000\u0000\u01bf"+
		"\u01c0\u0005e\u0000\u0000\u01c0\u01c4\u0005A\u0000\u0000\u01c1\u01c3\u0003"+
		"\u0004\u0002\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c9\u0005B\u0000\u0000\u01c8\u01b0\u0001\u0000"+
		"\u0000\u0000\u01c8\u01be\u0001\u0000\u0000\u0000\u01c9+\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cd\u0005I\u0000\u0000\u01cb\u01ce\u0003.\u0017\u0000\u01cc"+
		"\u01ce\u0003v;\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005"+
		"I\u0000\u0000\u01d0-\u0001\u0000\u0000\u0000\u01d1\u01d3\u00030\u0018"+
		"\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5/\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d9\u00052\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0005R\u0000\u0000\u01db1\u0001\u0000\u0000\u0000\u01dc\u01dd\u0006"+
		"\u0019\uffff\uffff\u0000\u01dd\u01e3\u00034\u001a\u0000\u01de\u01e3\u0003"+
		"6\u001b\u0000\u01df\u01e3\u0003D\"\u0000\u01e0\u01e3\u0003X,\u0000\u01e1"+
		"\u01e3\u0003N\'\u0000\u01e2\u01dc\u0001\u0000\u0000\u0000\u01e2\u01de"+
		"\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u022a"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\n\n\u0000\u0000\u01e5\u01e6\u0007"+
		"\u0003\u0000\u0000\u01e6\u0229\u00032\u0019\u000b\u01e7\u01e8\n\t\u0000"+
		"\u0000\u01e8\u01e9\u0007\u0004\u0000\u0000\u01e9\u0229\u00032\u0019\n"+
		"\u01ea\u01eb\n\b\u0000\u0000\u01eb\u01ec\u0007\u0005\u0000\u0000\u01ec"+
		"\u0229\u00032\u0019\t\u01ed\u01ee\n\u0007\u0000\u0000\u01ee\u01ef\u0005"+
		",\u0000\u0000\u01ef\u0229\u00032\u0019\b\u01f0\u01f1\n\u0006\u0000\u0000"+
		"\u01f1\u01f2\u0005E\u0000\u0000\u01f2\u0229\u00032\u0019\u0007\u01f3\u01f4"+
		"\n\u0005\u0000\u0000\u01f4\u01f5\u0007\u0006\u0000\u0000\u01f5\u0229\u0003"+
		"2\u0019\u0006\u01f6\u01f7\n\u0004\u0000\u0000\u01f7\u01f8\u0005E\u0000"+
		"\u0000\u01f8\u01f9\u0005R\u0000\u0000\u01f9\u01fa\u0005?\u0000\u0000\u01fa"+
		"\u01fb\u0005@\u0000\u0000\u01fb\u01fc\u0005,\u0000\u0000\u01fc\u0229\u0003"+
		"2\u0019\u0005\u01fd\u01fe\n\r\u0000\u0000\u01fe\u0202\u0005G\u0000\u0000"+
		"\u01ff\u0201\u0005K\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0201"+
		"\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0205\u0209\u0005R\u0000\u0000\u0206\u0208"+
		"\u0005K\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001"+
		"\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020f\u0001\u0000\u0000\u0000\u020b\u0209\u0001"+
		"\u0000\u0000\u0000\u020c\u020e\u0005e\u0000\u0000\u020d\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0229\u0001\u0000"+
		"\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213\n\f\u0000"+
		"\u0000\u0213\u0214\u0005?\u0000\u0000\u0214\u0215\u00032\u0019\u0000\u0215"+
		"\u0216\u0005@\u0000\u0000\u0216\u0229\u0001\u0000\u0000\u0000\u0217\u0219"+
		"\n\u000b\u0000\u0000\u0218\u021a\u0003B!\u0000\u0219\u0218\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021b\u021d\u0005=\u0000\u0000\u021c\u021e\u0003b1\u0000"+
		"\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0229\u0005>\u0000\u0000\u0220"+
		"\u0221\n\u0003\u0000\u0000\u0221\u0222\u0005=\u0000\u0000\u0222\u0223"+
		"\u00032\u0019\u0000\u0223\u0224\u0005>\u0000\u0000\u0224\u0225\u0005A"+
		"\u0000\u0000\u0225\u0226\u00032\u0019\u0000\u0226\u0227\u0005B\u0000\u0000"+
		"\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u01e4\u0001\u0000\u0000\u0000"+
		"\u0228\u01e7\u0001\u0000\u0000\u0000\u0228\u01ea\u0001\u0000\u0000\u0000"+
		"\u0228\u01ed\u0001\u0000\u0000\u0000\u0228\u01f0\u0001\u0000\u0000\u0000"+
		"\u0228\u01f3\u0001\u0000\u0000\u0000\u0228\u01f6\u0001\u0000\u0000\u0000"+
		"\u0228\u01fd\u0001\u0000\u0000\u0000\u0228\u0212\u0001\u0000\u0000\u0000"+
		"\u0228\u0217\u0001\u0000\u0000\u0000\u0228\u0220\u0001\u0000\u0000\u0000"+
		"\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b3\u0001\u0000\u0000\u0000\u022c"+
		"\u022a\u0001\u0000\u0000\u0000\u022d\u022e\u0005j\u0000\u0000\u022e\u022f"+
		"\u0005=\u0000\u0000\u022f\u0230\u0005R\u0000\u0000\u0230\u0231\u0005H"+
		"\u0000\u0000\u0231\u0232\u00036\u001b\u0000\u0232\u0233\u0005>\u0000\u0000"+
		"\u02335\u0001\u0000\u0000\u0000\u0234\u0236\u0005=\u0000\u0000\u0235\u0237"+
		"\u00038\u001c\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0005"+
		">\u0000\u0000\u0239\u023a\u0005J\u0000\u0000\u023a\u023b\u0003@ \u0000"+
		"\u023b7\u0001\u0000\u0000\u0000\u023c\u0241\u0003:\u001d\u0000\u023d\u023e"+
		"\u0005H\u0000\u0000\u023e\u0240\u0003:\u001d\u0000\u023f\u023d\u0001\u0000"+
		"\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u02429\u0001\u0000\u0000"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0247\u0005R\u0000\u0000"+
		"\u0245\u0246\u0005E\u0000\u0000\u0246\u0248\u0003F#\u0000\u0247\u0245"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024b"+
		"\u0001\u0000\u0000\u0000\u0249\u024b\u0003<\u001e\u0000\u024a\u0244\u0001"+
		"\u0000\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b;\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0005A\u0000\u0000\u024d\u0252\u0003>\u001f\u0000"+
		"\u024e\u024f\u0005H\u0000\u0000\u024f\u0251\u0003>\u001f\u0000\u0250\u024e"+
		"\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255"+
		"\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005B\u0000\u0000\u0256=\u0001\u0000\u0000\u0000\u0257\u025a\u0005R"+
		"\u0000\u0000\u0258\u0259\u0005E\u0000\u0000\u0259\u025b\u0003F#\u0000"+
		"\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000"+
		"\u025b?\u0001\u0000\u0000\u0000\u025c\u0263\u0003L&\u0000\u025d\u025e"+
		"\u0005=\u0000\u0000\u025e\u025f\u0003L&\u0000\u025f\u0260\u0005>\u0000"+
		"\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u0263\u00032\u0019\u0000"+
		"\u0262\u025c\u0001\u0000\u0000\u0000\u0262\u025d\u0001\u0000\u0000\u0000"+
		"\u0262\u0261\u0001\u0000\u0000\u0000\u0263A\u0001\u0000\u0000\u0000\u0264"+
		"\u0265\u0005C\u0000\u0000\u0265\u026a\u0003F#\u0000\u0266\u0267\u0005"+
		"H\u0000\u0000\u0267\u0269\u0003F#\u0000\u0268\u0266\u0001\u0000\u0000"+
		"\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000"+
		"\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026e\u0005D\u0000\u0000"+
		"\u026eC\u0001\u0000\u0000\u0000\u026f\u0271\u0005K\u0000\u0000\u0270\u026f"+
		"\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0275"+
		"\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u02c0"+
		"\u0005R\u0000\u0000\u0276\u02c0\u0003H$\u0000\u0277\u02c0\u0003J%\u0000"+
		"\u0278\u02c0\u0003L&\u0000\u0279\u02c0\u0003,\u0016\u0000\u027a\u02c0"+
		"\u0005e\u0000\u0000\u027b\u027c\u0005=\u0000\u0000\u027c\u027e\u00032"+
		"\u0019\u0000\u027d\u027f\u0005J\u0000\u0000\u027e\u027d\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0286\u0001\u0000\u0000"+
		"\u0000\u0280\u0282\u00032\u0019\u0000\u0281\u0283\u0005F\u0000\u0000\u0282"+
		"\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283"+
		"\u0285\u0001\u0000\u0000\u0000\u0284\u0280\u0001\u0000\u0000\u0000\u0285"+
		"\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0289\u028b\u0005F\u0000\u0000\u028a\u0289"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d"+
		"\u0001\u0000\u0000\u0000\u028c\u028e\u0005>\u0000\u0000\u028d\u028c\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001"+
		"\u0000\u0000\u0000\u028f\u0291\u0005F\u0000\u0000\u0290\u028f\u0001\u0000"+
		"\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u02c0\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0005A\u0000\u0000\u0293\u0295\u00032\u0019\u0000"+
		"\u0294\u0296\u0005J\u0000\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u029d\u0001\u0000\u0000\u0000\u0297"+
		"\u0299\u00032\u0019\u0000\u0298\u029a\u0005F\u0000\u0000\u0299\u0298\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029c\u0001"+
		"\u0000\u0000\u0000\u029b\u0297\u0001\u0000\u0000\u0000\u029c\u029f\u0001"+
		"\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001"+
		"\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a2\u0005F\u0000\u0000\u02a1\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a5\u0005B\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a8\u0005F\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02c0\u0001\u0000\u0000\u0000"+
		"\u02a9\u02ab\u0005K\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ac\u0001\u0000\u0000\u0000\u02af\u02c0\u0005S\u0000\u0000\u02b0\u02c0"+
		"\u0005\u0012\u0000\u0000\u02b1\u02b2\u00051\u0000\u0000\u02b2\u02c0\u0005"+
		"R\u0000\u0000\u02b3\u02b4\u0005R\u0000\u0000\u02b4\u02b5\u0005-\u0000"+
		"\u0000\u02b5\u02c0\u0005\u0012\u0000\u0000\u02b6\u02b7\u0005R\u0000\u0000"+
		"\u02b7\u02bb\u0005L\u0000\u0000\u02b8\u02b9\u0005H\u0000\u0000\u02b9\u02ba"+
		"\u0005S\u0000\u0000\u02ba\u02bc\u0005D\u0000\u0000\u02bb\u02b8\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02c0\u0001\u0000"+
		"\u0000\u0000\u02bd\u02be\u0005\b\u0000\u0000\u02be\u02c0\u00032\u0019"+
		"\u0000\u02bf\u0272\u0001\u0000\u0000\u0000\u02bf\u0276\u0001\u0000\u0000"+
		"\u0000\u02bf\u0277\u0001\u0000\u0000\u0000\u02bf\u0278\u0001\u0000\u0000"+
		"\u0000\u02bf\u0279\u0001\u0000\u0000\u0000\u02bf\u027a\u0001\u0000\u0000"+
		"\u0000\u02bf\u027b\u0001\u0000\u0000\u0000\u02bf\u0292\u0001\u0000\u0000"+
		"\u0000\u02bf\u02ac\u0001\u0000\u0000\u0000\u02bf\u02b0\u0001\u0000\u0000"+
		"\u0000\u02bf\u02b1\u0001\u0000\u0000\u0000\u02bf\u02b3\u0001\u0000\u0000"+
		"\u0000\u02bf\u02b6\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000"+
		"\u0000\u02c0E\u0001\u0000\u0000\u0000\u02c1\u02ca\u0005R\u0000\u0000\u02c2"+
		"\u02c3\u0005R\u0000\u0000\u02c3\u02c4\u0005?\u0000\u0000\u02c4\u02ca\u0005"+
		"@\u0000\u0000\u02c5\u02ca\u0003d2\u0000\u02c6\u02c7\u0005R\u0000\u0000"+
		"\u02c7\u02c8\u0005-\u0000\u0000\u02c8\u02ca\u0005\u0012\u0000\u0000\u02c9"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c9\u02c2\u0001\u0000\u0000\u0000\u02c9"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c9\u02c6\u0001\u0000\u0000\u0000\u02ca"+
		"G\u0001\u0000\u0000\u0000\u02cb\u02d2\u0005S\u0000\u0000\u02cc\u02d2\u0005"+
		"T\u0000\u0000\u02cd\u02d2\u0005U\u0000\u0000\u02ce\u02d2\u0005V\u0000"+
		"\u0000\u02cf\u02d0\u0005+\u0000\u0000\u02d0\u02d2\u0003H$\u0000\u02d1"+
		"\u02cb\u0001\u0000\u0000\u0000\u02d1\u02cc\u0001\u0000\u0000\u0000\u02d1"+
		"\u02cd\u0001\u0000\u0000\u0000\u02d1\u02ce\u0001\u0000\u0000\u0000\u02d1"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d2I\u0001\u0000\u0000\u0000\u02d3\u02d5"+
		"\u0005?\u0000\u0000\u02d4\u02d6\u0003b1\u0000\u02d5\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d8\u0005@\u0000\u0000\u02d8K\u0001\u0000\u0000\u0000"+
		"\u02d9\u02e2\u0005A\u0000\u0000\u02da\u02df\u0003N\'\u0000\u02db\u02dc"+
		"\u0005H\u0000\u0000\u02dc\u02de\u0003N\'\u0000\u02dd\u02db\u0001\u0000"+
		"\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02da\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e8\u0005B\u0000\u0000\u02e5\u02e7\u0005H\u0000\u0000"+
		"\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000"+
		"\u02e9M\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0005R\u0000\u0000\u02ec\u02ed\u0005E\u0000\u0000\u02ed\u02f2\u0003"+
		"2\u0019\u0000\u02ee\u02f2\u0005R\u0000\u0000\u02ef\u02f0\u0005.\u0000"+
		"\u0000\u02f0\u02f2\u0005R\u0000\u0000\u02f1\u02eb\u0001\u0000\u0000\u0000"+
		"\u02f1\u02ee\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f2O\u0001\u0000\u0000\u0000\u02f3\u02f7\u00032\u0019\u0000\u02f4\u02f6"+
		"\u0005F\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f8Q\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0005\"\u0000\u0000\u02fb\u02fc\u0005=\u0000"+
		"\u0000\u02fc\u02fd\u00032\u0019\u0000\u02fd\u02ff\u0005>\u0000\u0000\u02fe"+
		"\u0300\u0005A\u0000\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300"+
		"\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0303"+
		"\u0003\u0004\u0002\u0000\u0302\u0304\u0005B\u0000\u0000\u0303\u0302\u0001"+
		"\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u030d\u0001"+
		"\u0000\u0000\u0000\u0305\u0307\u0005#\u0000\u0000\u0306\u0308\u0005A\u0000"+
		"\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0003\u0004\u0002"+
		"\u0000\u030a\u030c\u0005B\u0000\u0000\u030b\u030a\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000"+
		"\u030d\u0305\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000"+
		"\u030eS\u0001\u0000\u0000\u0000\u030f\u0310\u0005!\u0000\u0000\u0310\u0312"+
		"\u0005=\u0000\u0000\u0311\u0313\u0003V+\u0000\u0312\u0311\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000"+
		"\u0000\u0000\u0314\u0316\u0005F\u0000\u0000\u0315\u0317\u00032\u0019\u0000"+
		"\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031a\u0005F\u0000\u0000\u0319"+
		"\u031b\u00032\u0019\u0000\u031a\u0319\u0001\u0000\u0000\u0000\u031a\u031b"+
		"\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u0327"+
		"\u0005>\u0000\u0000\u031d\u031f\u0005A\u0000\u0000\u031e\u031d\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0321\u0001\u0000"+
		"\u0000\u0000\u0320\u0322\u0003\u0002\u0001\u0000\u0321\u0320\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0324\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0005B\u0000\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0328\u0001\u0000\u0000"+
		"\u0000\u0326\u0328\u0003\u0004\u0002\u0000\u0327\u031e\u0001\u0000\u0000"+
		"\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0328U\u0001\u0000\u0000\u0000"+
		"\u0329\u0332\u0003\\.\u0000\u032a\u032b\u0007\u0007\u0000\u0000\u032b"+
		"\u032e\u0005R\u0000\u0000\u032c\u032d\u0005,\u0000\u0000\u032d\u032f\u0003"+
		"2\u0019\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000"+
		"\u0000\u0000\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u0332\u00032\u0019"+
		"\u0000\u0331\u0329\u0001\u0000\u0000\u0000\u0331\u032a\u0001\u0000\u0000"+
		"\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332W\u0001\u0000\u0000\u0000"+
		"\u0333\u0335\u0005\u0004\u0000\u0000\u0334\u0336\u00032\u0019\u0000\u0335"+
		"\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336"+
		"\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0005F\u0000\u0000\u0338Y\u0001"+
		"\u0000\u0000\u0000\u0339\u033a\u0007\u0007\u0000\u0000\u033a\u033d\u0005"+
		"R\u0000\u0000\u033b\u033c\u0005E\u0000\u0000\u033c\u033e\u0003F#\u0000"+
		"\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0340\u0005,\u0000\u0000\u0340"+
		"\u0345\u00032\u0019\u0000\u0341\u0342\u0005H\u0000\u0000\u0342\u0344\u0003"+
		"2\u0019\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000"+
		"\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000"+
		"\u0000\u0000\u0346\u0348\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0005F\u0000\u0000\u0349[\u0001\u0000\u0000\u0000"+
		"\u034a\u034d\u0005R\u0000\u0000\u034b\u034c\u0005E\u0000\u0000\u034c\u034e"+
		"\u0003F#\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000"+
		"\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f\u0350\u0007\b\u0000"+
		"\u0000\u0350\u0352\u00032\u0019\u0000\u0351\u034f\u0001\u0000\u0000\u0000"+
		"\u0351\u0352\u0001\u0000\u0000\u0000\u0352]\u0001\u0000\u0000\u0000\u0353"+
		"\u0356\u0003`0\u0000\u0354\u0355\u0005H\u0000\u0000\u0355\u0357\u0003"+
		"`0\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000"+
		"\u0000\u0357_\u0001\u0000\u0000\u0000\u0358\u035b\u0005R\u0000\u0000\u0359"+
		"\u035a\u0005E\u0000\u0000\u035a\u035c\u0003F#\u0000\u035b\u0359\u0001"+
		"\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035ca\u0001\u0000"+
		"\u0000\u0000\u035d\u0362\u00032\u0019\u0000\u035e\u035f\u0005H\u0000\u0000"+
		"\u035f\u0361\u00032\u0019\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361"+
		"\u0364\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362"+
		"\u0363\u0001\u0000\u0000\u0000\u0363c\u0001\u0000\u0000\u0000\u0364\u0362"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u0005A\u0000\u0000\u0366\u036b\u0003"+
		"f3\u0000\u0367\u0368\u0005H\u0000\u0000\u0368\u036a\u0003f3\u0000\u0369"+
		"\u0367\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b"+
		"\u0369\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c"+
		"\u036e\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e"+
		"\u036f\u0005B\u0000\u0000\u036fe\u0001\u0000\u0000\u0000\u0370\u0371\u0005"+
		"R\u0000\u0000\u0371\u0372\u0005E\u0000\u0000\u0372\u0373\u0003F#\u0000"+
		"\u0373g\u0001\u0000\u0000\u0000\u0374\u037b\u0003j5\u0000\u0375\u037b"+
		"\u0003l6\u0000\u0376\u037b\u0003r9\u0000\u0377\u037b\u0003n7\u0000\u0378"+
		"\u037b\u0003p8\u0000\u0379\u037b\u0003t:\u0000\u037a\u0374\u0001\u0000"+
		"\u0000\u0000\u037a\u0375\u0001\u0000\u0000\u0000\u037a\u0376\u0001\u0000"+
		"\u0000\u0000\u037a\u0377\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000"+
		"\u0000\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037bi\u0001\u0000\u0000"+
		"\u0000\u037c\u037d\u00053\u0000\u0000\u037d\u037e\u0005,\u0000\u0000\u037e"+
		"\u037f\u0005\r\u0000\u0000\u037f\u0380\u0005R\u0000\u0000\u0380\u0381"+
		"\u0005\u000e\u0000\u0000\u0381\u0386\u00032\u0019\u0000\u0382\u0383\u0005"+
		"3\u0000\u0000\u0383\u0384\u0005,\u0000\u0000\u0384\u0386\u0005S\u0000"+
		"\u0000\u0385\u037c\u0001\u0000\u0000\u0000\u0385\u0382\u0001\u0000\u0000"+
		"\u0000\u0386k\u0001\u0000\u0000\u0000\u0387\u0388\u00054\u0000\u0000\u0388"+
		"\u0389\u0005,\u0000\u0000\u0389\u038a\u00032\u0019\u0000\u038am\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u00055\u0000\u0000\u038c\u038d\u0005,\u0000"+
		"\u0000\u038d\u038e\u00032\u0019\u0000\u038eo\u0001\u0000\u0000\u0000\u038f"+
		"\u0390\u0007\t\u0000\u0000\u0390\u0391\u0005,\u0000\u0000\u0391\u0392"+
		"\u00032\u0019\u0000\u0392q\u0001\u0000\u0000\u0000\u0393\u0394\u0007\n"+
		"\u0000\u0000\u0394\u0395\u0005,\u0000\u0000\u0395\u0396\u00032\u0019\u0000"+
		"\u0396s\u0001\u0000\u0000\u0000\u0397\u0398\u0005<\u0000\u0000\u0398\u0399"+
		"\u0005,\u0000\u0000\u0399\u039a\u00032\u0019\u0000\u039au\u0001\u0000"+
		"\u0000\u0000\u039b\u039d\u0003x<\u0000\u039c\u039b\u0001\u0000\u0000\u0000"+
		"\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039fw\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a4\u0003z=\u0000\u03a1\u03a4\u00030\u0018\u0000\u03a2\u03a4\u0003"+
		"h4\u0000\u03a3\u03a0\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a2\u0001\u0000\u0000\u0000\u03a4y\u0001\u0000\u0000\u0000"+
		"\u03a5\u03ab\u0007\u000b\u0000\u0000\u03a6\u03aa\u0003x<\u0000\u03a7\u03aa"+
		"\u0003|>\u0000\u03a8\u03aa\u0003h4\u0000\u03a9\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9\u03a8\u0001\u0000\u0000"+
		"\u0000\u03aa\u03ad\u0001\u0000\u0000\u0000\u03ab\u03a9\u0001\u0000\u0000"+
		"\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03b1\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ae\u03b0\u0005D\u0000\u0000"+
		"\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b1\u03af\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b2\u03cc\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b6\u0007\f\u0000\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000\u03b6"+
		"\u03b9\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b8\u03bd\u0001\u0000\u0000\u0000\u03b9"+
		"\u03b7\u0001\u0000\u0000\u0000\u03ba\u03bc\u0003x<\u0000\u03bb\u03ba\u0001"+
		"\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c3\u0001"+
		"\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c2\u0005"+
		"P\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c4\u03cd\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c8\u0005P\u0000\u0000\u03c7\u03c6\u0001\u0000\u0000"+
		"\u0000\u03c8\u03cb\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cd\u0001\u0000\u0000"+
		"\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cc\u03b7\u0001\u0000\u0000"+
		"\u0000\u03cc\u03c9\u0001\u0000\u0000\u0000\u03cd{\u0001\u0000\u0000\u0000"+
		"\u03ce\u03d0\u0005?\u0000\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d4\u0001\u0000\u0000\u0000\u03d3"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d4\u03d8\u0007\r\u0000\u0000\u03d5\u03d7"+
		"\u0005@\u0000\u0000\u03d6\u03d5\u0001\u0000\u0000\u0000\u03d7\u03da\u0001"+
		"\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001"+
		"\u0000\u0000\u0000\u03d9\u03dd\u0001\u0000\u0000\u0000\u03da\u03d8\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0005,\u0000\u0000\u03dc\u03de\u0003~?"+
		"\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000"+
		"\u0000\u03de\u0404\u0001\u0000\u0000\u0000\u03df\u03e1\u0005A\u0000\u0000"+
		"\u03e0\u03df\u0001\u0000\u0000\u0000\u03e1\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e8\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e7\u0005A\u0000\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e7"+
		"\u03ea\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e8"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e9\u03eb\u0001\u0000\u0000\u0000\u03ea"+
		"\u03e8\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005R\u0000\u0000\u03ec\u03ed"+
		"\u0005G\u0000\u0000\u03ed\u03f1\u0005R\u0000\u0000\u03ee\u03f0\u0005B"+
		"\u0000\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000\u03f0\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f7\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f6\u0005B\u0000\u0000\u03f5\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f9\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u0404\u0001\u0000\u0000"+
		"\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03fa\u03fb\u0005=\u0000\u0000"+
		"\u03fb\u03fc\u0005R\u0000\u0000\u03fc\u03fd\u0005>\u0000\u0000\u03fd\u03fe"+
		"\u0005,\u0000\u0000\u03fe\u0404\u0005S\u0000\u0000\u03ff\u0400\u0005R"+
		"\u0000\u0000\u0400\u0401\u0005,\u0000\u0000\u0401\u0404\u0005S\u0000\u0000"+
		"\u0402\u0404\u0003~?\u0000\u0403\u03d1\u0001\u0000\u0000\u0000\u0403\u03e2"+
		"\u0001\u0000\u0000\u0000\u0403\u03fa\u0001\u0000\u0000\u0000\u0403\u03ff"+
		"\u0001\u0000\u0000\u0000\u0403\u0402\u0001\u0000\u0000\u0000\u0404}\u0001"+
		"\u0000\u0000\u0000\u0405\u0408\u0005S\u0000\u0000\u0406\u0408\u00032\u0019"+
		"\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0406\u0001\u0000\u0000"+
		"\u0000\u0408\u007f\u0001\u0000\u0000\u0000\u008a\u0081\u0088\u0094\u009d"+
		"\u00aa\u00b0\u00b6\u00c3\u00ca\u00ce\u00d4\u00da\u00e0\u00e7\u00ee\u00f2"+
		"\u00f5\u00fb\u0100\u0106\u010b\u0110\u0115\u011c\u0121\u0123\u012a\u012d"+
		"\u012f\u0133\u0140\u0149\u015b\u0166\u016b\u0174\u017b\u0181\u0186\u018a"+
		"\u018d\u0190\u0195\u019a\u01a0\u01aa\u01ae\u01b3\u01ba\u01c4\u01c8\u01cd"+
		"\u01d4\u01d8\u01e2\u0202\u0209\u020f\u0219\u021d\u0228\u022a\u0236\u0241"+
		"\u0247\u024a\u0252\u025a\u0262\u026a\u0272\u027e\u0282\u0286\u028a\u028d"+
		"\u0290\u0295\u0299\u029d\u02a1\u02a4\u02a7\u02ac\u02bb\u02bf\u02c9\u02d1"+
		"\u02d5\u02df\u02e2\u02e8\u02f1\u02f7\u02ff\u0303\u0307\u030b\u030d\u0312"+
		"\u0316\u031a\u031e\u0321\u0324\u0327\u032e\u0331\u0335\u033d\u0345\u034d"+
		"\u0351\u0356\u035b\u0362\u036b\u037a\u0385\u039e\u03a3\u03a9\u03ab\u03b1"+
		"\u03b7\u03bd\u03c3\u03c9\u03cc\u03d1\u03d8\u03dd\u03e2\u03e8\u03f1\u03f7"+
		"\u0403\u0407";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}