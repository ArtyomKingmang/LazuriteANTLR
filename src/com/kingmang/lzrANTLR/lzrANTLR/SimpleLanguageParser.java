/*
@author Artyom Kingmang
 */
package com.kingmang.lzrANTLR.lzrANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUMBER=25, STRING=26, IDENTIFIER=27, WS=28;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_funcDeclaration = 2, RULE_paramList = 3, 
		RULE_assignment = 4, RULE_printStatement = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_forStatement = 8, RULE_switchStatement = 9, 
		RULE_caseStatement = 10, RULE_defaultStatement = 11, RULE_inputStatement = 12, 
		RULE_conversionStatement = 13, RULE_block = 14, RULE_expression = 15, 
		RULE_literal = 16, RULE_type = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "funcDeclaration", "paramList", "assignment", 
			"printStatement", "whileStatement", "ifStatement", "forStatement", "switchStatement", 
			"caseStatement", "defaultStatement", "inputStatement", "conversionStatement", 
			"block", "expression", "literal", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'('", "')'", "','", "'='", "'print'", "'while'", "'if'", 
			"'else'", "'for'", "'switch'", "'{'", "'}'", "'case'", "':'", "'default'", 
			"'input'", "'*'", "'/'", "'-'", "'+'", "'int'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUMBER", "STRING", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "SimpleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 163712450L) != 0) );
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
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public ConversionStatementContext conversionStatement() {
			return getRuleContext(ConversionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				funcDeclaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				assignment();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				printStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				whileStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				ifStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				forStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				switchStatement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				inputStatement();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				conversionStatement();
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
	public static class FuncDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitFuncDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(T__1);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(55);
				paramList();
				}
			}

			setState(58);
			match(T__2);
			setState(59);
			block();
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
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SimpleLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SimpleLanguageParser.IDENTIFIER, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(62);
				match(T__3);
				setState(63);
				match(IDENTIFIER);
				}
				}
				setState(68);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(T__4);
			setState(71);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(74);
			match(T__1);
			setState(75);
			expression(0);
			setState(76);
			match(T__2);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(79);
			match(T__1);
			setState(80);
			expression(0);
			setState(81);
			match(T__2);
			setState(82);
			block();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__7);
			setState(85);
			match(T__1);
			setState(86);
			expression(0);
			setState(87);
			match(T__2);
			setState(88);
			block();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(89);
				match(T__8);
				setState(90);
				block();
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
	public static class ForStatementContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__9);
			setState(94);
			match(T__1);
			setState(95);
			assignment();
			setState(96);
			match(T__3);
			setState(97);
			expression(0);
			setState(98);
			match(T__3);
			setState(99);
			assignment();
			setState(100);
			match(T__2);
			setState(101);
			block();
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__10);
			setState(104);
			match(T__1);
			setState(105);
			expression(0);
			setState(106);
			match(T__2);
			setState(107);
			match(T__11);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(108);
				caseStatement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(114);
				defaultStatement();
				}
			}

			setState(117);
			match(T__12);
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
	public static class CaseStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__13);
			setState(120);
			expression(0);
			setState(121);
			match(T__14);
			setState(122);
			block();
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
	public static class DefaultStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__15);
			setState(125);
			match(T__14);
			setState(126);
			block();
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
	public static class InputStatementContext extends ParserRuleContext {
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__16);
			setState(129);
			match(T__1);
			setState(130);
			match(T__2);
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
	public static class ConversionStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterConversionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitConversionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitConversionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionStatementContext conversionStatement() throws RecognitionException {
		ConversionStatementContext _localctx = new ConversionStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conversionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			type();
			setState(133);
			match(T__1);
			setState(134);
			expression(0);
			setState(135);
			match(T__2);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__11);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 163712450L) != 0)) {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__12);
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
		public Token op;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SimpleLanguageParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
				{
				setState(147);
				literal();
				}
				break;
			case IDENTIFIER:
				{
				setState(148);
				match(IDENTIFIER);
				}
				break;
			case T__1:
				{
				setState(149);
				match(T__1);
				setState(150);
				expression(0);
				setState(151);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(156);
					((ExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
						((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					expression(3);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SimpleLanguageParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SimpleLanguageParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLanguageListener ) ((SimpleLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLanguageVisitor ) return ((SimpleLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004"+
		"\u0000&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003A\b\u0003\n\u0003\f\u0003D\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tn\b"+
		"\t\n\t\f\tq\t\t\u0001\t\u0003\tt\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u008c\b\u000e\n\u000e\f\u000e\u008f\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009a\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u009f\b\u000f\n\u000f\f\u000f\u00a2"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000"+
		"\u0001\u001e\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"\u0000\u0003\u0001\u0000\u0012\u0015"+
		"\u0001\u0000\u0019\u001a\u0001\u0000\u0016\u0018\u00a7\u0000%\u0001\u0000"+
		"\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000"+
		"\u0006=\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nI\u0001\u0000"+
		"\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000"+
		"\u0010]\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014w"+
		"\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000\u0000\u0018\u0080\u0001"+
		"\u0000\u0000\u0000\u001a\u0084\u0001\u0000\u0000\u0000\u001c\u0089\u0001"+
		"\u0000\u0000\u0000\u001e\u0099\u0001\u0000\u0000\u0000 \u00a3\u0001\u0000"+
		"\u0000\u0000\"\u00a5\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000"+
		"%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)3\u0003"+
		"\u0004\u0002\u0000*3\u0003\b\u0004\u0000+3\u0003\n\u0005\u0000,3\u0003"+
		"\f\u0006\u0000-3\u0003\u000e\u0007\u0000.3\u0003\u0010\b\u0000/3\u0003"+
		"\u0012\t\u000003\u0003\u0018\f\u000013\u0003\u001a\r\u00002)\u0001\u0000"+
		"\u0000\u00002*\u0001\u0000\u0000\u00002+\u0001\u0000\u0000\u00002,\u0001"+
		"\u0000\u0000\u00002-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u0000"+
		"2/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u000056\u0005"+
		"\u001b\u0000\u000068\u0005\u0002\u0000\u000079\u0003\u0006\u0003\u0000"+
		"87\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0003\u0000\u0000;<\u0003\u001c\u000e\u0000<\u0005\u0001"+
		"\u0000\u0000\u0000=B\u0005\u001b\u0000\u0000>?\u0005\u0004\u0000\u0000"+
		"?A\u0005\u001b\u0000\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0007\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u001b\u0000\u0000"+
		"FG\u0005\u0005\u0000\u0000GH\u0003\u001e\u000f\u0000H\t\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0006\u0000\u0000JK\u0005\u0002\u0000\u0000KL\u0003\u001e"+
		"\u000f\u0000LM\u0005\u0003\u0000\u0000M\u000b\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0007\u0000\u0000OP\u0005\u0002\u0000\u0000PQ\u0003\u001e\u000f"+
		"\u0000QR\u0005\u0003\u0000\u0000RS\u0003\u001c\u000e\u0000S\r\u0001\u0000"+
		"\u0000\u0000TU\u0005\b\u0000\u0000UV\u0005\u0002\u0000\u0000VW\u0003\u001e"+
		"\u000f\u0000WX\u0005\u0003\u0000\u0000X[\u0003\u001c\u000e\u0000YZ\u0005"+
		"\t\u0000\u0000Z\\\u0003\u001c\u000e\u0000[Y\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005\n\u0000"+
		"\u0000^_\u0005\u0002\u0000\u0000_`\u0003\b\u0004\u0000`a\u0005\u0004\u0000"+
		"\u0000ab\u0003\u001e\u000f\u0000bc\u0005\u0004\u0000\u0000cd\u0003\b\u0004"+
		"\u0000de\u0005\u0003\u0000\u0000ef\u0003\u001c\u000e\u0000f\u0011\u0001"+
		"\u0000\u0000\u0000gh\u0005\u000b\u0000\u0000hi\u0005\u0002\u0000\u0000"+
		"ij\u0003\u001e\u000f\u0000jk\u0005\u0003\u0000\u0000ko\u0005\f\u0000\u0000"+
		"ln\u0003\u0014\n\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rt\u0003\u0016\u000b\u0000sr\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005"+
		"\r\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005\u000e\u0000\u0000"+
		"xy\u0003\u001e\u000f\u0000yz\u0005\u000f\u0000\u0000z{\u0003\u001c\u000e"+
		"\u0000{\u0015\u0001\u0000\u0000\u0000|}\u0005\u0010\u0000\u0000}~\u0005"+
		"\u000f\u0000\u0000~\u007f\u0003\u001c\u000e\u0000\u007f\u0017\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081\u0082\u0005\u0002"+
		"\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0019\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0003\"\u0011\u0000\u0085\u0086\u0005\u0002\u0000"+
		"\u0000\u0086\u0087\u0003\u001e\u000f\u0000\u0087\u0088\u0005\u0003\u0000"+
		"\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008d\u0005\f\u0000\u0000"+
		"\u008a\u008c\u0003\u0002\u0001\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\r\u0000\u0000\u0091"+
		"\u001d\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u000f\uffff\uffff\u0000"+
		"\u0093\u009a\u0003 \u0010\u0000\u0094\u009a\u0005\u001b\u0000\u0000\u0095"+
		"\u0096\u0005\u0002\u0000\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097"+
		"\u0098\u0005\u0003\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099"+
		"\u0092\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099"+
		"\u0095\u0001\u0000\u0000\u0000\u009a\u00a0\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\n\u0002\u0000\u0000\u009c\u009d\u0007\u0000\u0000\u0000\u009d\u009f"+
		"\u0003\u001e\u000f\u0003\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u001f\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4!\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6#\u0001\u0000"+
		"\u0000\u0000\n\'28B[os\u008d\u0099\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}