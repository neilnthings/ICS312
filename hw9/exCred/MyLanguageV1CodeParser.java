// Generated from MyLanguageV1Code.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageV1CodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, DO=5, WHILE=6, COMMA=7, PLUS=8, SUBTRACT=9, 
		EQUAL=10, ASSIGN=11, NOTEQUAL=12, SEMICOLON=13, LPAREN=14, RPAREN=15, 
		INTEGER=16, NAME=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'endif'", "'print'", "'int'", "'do'", "'while'", 
		"','", "'+'", "'-'", "'=='", "'='", "'!='", "';'", "'('", "')'", "INTEGER", 
		"NAME", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_ifstmt = 3, 
		RULE_dostmt = 4, RULE_printstmt = 5, RULE_assignstmt = 6, RULE_expression = 7, 
		RULE_term = 8, RULE_numterm = 9, RULE_comma = 10, RULE_printterm = 11, 
		RULE_identifier = 12, RULE_integer = 13;
	public static final String[] ruleNames = {
		"program", "declaration", "statement", "ifstmt", "dostmt", "printstmt", 
		"assignstmt", "expression", "term", "numterm", "comma", "printterm", "identifier", 
		"integer"
	};

	@Override
	public String getGrammarFileName() { return "MyLanguageV1Code.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageV1CodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("%include \"asm_io.inc\"");
			            System.out.println("segment .data"); 
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(29); declaration();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("segment .text"); 
			            System.out.println("\tglobal asm_main"); 
			            System.out.println("asm_main:"); 
			            System.out.println("\tenter 0,0"); 
			            System.out.println("\tpusha"); 
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(36); statement();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("\tpopa"); 
			            System.out.println("\tmov eax,0"); 
			            System.out.println("\tleave"); 
			            System.out.println("\tret"); 
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public TerminalNode ASSIGN() { return getToken(MyLanguageV1CodeParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode INTEGER() { return getToken(MyLanguageV1CodeParser.INTEGER, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public TerminalNode INT() { return getToken(MyLanguageV1CodeParser.INT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(45); match(INT);
			setState(46); ((DeclarationContext)_localctx).a = match(NAME);
			setState(47); match(ASSIGN);
			setState(48); ((DeclarationContext)_localctx).b = match(INTEGER);
			setState(49); match(SEMICOLON);
			System.out.println("\t" + (((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null) + "  dd " + (((DeclarationContext)_localctx).b!=null?((DeclarationContext)_localctx).b.getText():null));
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

	public static class StatementContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DostmtContext dostmt() {
			return getRuleContext(DostmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); ifstmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); printstmt();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); assignstmt();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(55); dostmt();
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

	public static class IfstmtContext extends ParserRuleContext {
		public Token IF;
		public IdentifierContext a;
		public IntegerContext b;
		public TerminalNode EQUAL() { return getToken(MyLanguageV1CodeParser.EQUAL, 0); }
		public TerminalNode IF() { return getToken(MyLanguageV1CodeParser.IF, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode ENDIF() { return getToken(MyLanguageV1CodeParser.ENDIF, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a,b;
			String label;
			setState(60); ((IfstmtContext)_localctx).IF = match(IF);
			setState(61); match(LPAREN);
			setState(62); ((IfstmtContext)_localctx).a = identifier();
			setState(63); match(EQUAL);
			setState(64); ((IfstmtContext)_localctx).b = integer();
			setState(65); match(RPAREN);
			System.out.println("cmp dword "+((IfstmtContext)_localctx).a.toString+","+((IfstmtContext)_localctx).b.toString);
			            label = "label_"+Integer.toString((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getTokenIndex():0));
			            System.out.println("jnz "+label); 
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(67); statement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 System.out.println(label+":"); 
			setState(74); match(ENDIF);
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

	public static class DostmtContext extends ParserRuleContext {
		public Token DO;
		public IdentifierContext a;
		public IntegerContext b;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode DO() { return getToken(MyLanguageV1CodeParser.DO, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(MyLanguageV1CodeParser.NOTEQUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode WHILE() { return getToken(MyLanguageV1CodeParser.WHILE, 0); }
		public DostmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dostmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterDostmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitDostmt(this);
		}
	}

	public final DostmtContext dostmt() throws RecognitionException {
		DostmtContext _localctx = new DostmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dostmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a,b;
			setState(77); ((DostmtContext)_localctx).DO = match(DO);
			System.out.println("do_loop_"+(((DostmtContext)_localctx).DO!=null?((DostmtContext)_localctx).DO.getTokenIndex():0)+":"); 
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(79); statement();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(WHILE);
			setState(86); match(LPAREN);
			setState(87); ((DostmtContext)_localctx).a = identifier();
			setState(88); match(NOTEQUAL);
			setState(89); ((DostmtContext)_localctx).b = integer();
			setState(90); match(RPAREN);
			System.out.println("cmp dword ["+(((DostmtContext)_localctx).a!=null?_input.getText(((DostmtContext)_localctx).a.start,((DostmtContext)_localctx).a.stop):null)+"], "+(((DostmtContext)_localctx).b!=null?_input.getText(((DostmtContext)_localctx).b.start,((DostmtContext)_localctx).b.stop):null)); 
			System.out.println("jnz do_loop_"+(((DostmtContext)_localctx).DO!=null?((DostmtContext)_localctx).DO.getTokenIndex():0)); 
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TermContext term;
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(MyLanguageV1CodeParser.PRINT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NumtermContext numterm() {
			return getRuleContext(NumtermContext.class,0);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printstmt);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); match(PRINT);
				setState(95); ((PrintstmtContext)_localctx).term = term();
				setState(96); match(SEMICOLON);
				System.out.println("\tmov eax, "+((PrintstmtContext)_localctx).term.toString);
				            System.out.println("\tcall print_int");
				            System.out.println("\tcall print_nl");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(PRINT);
				setState(100); numterm();
				System.out.println("\tcall print_nl");
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

	public static class AssignstmtContext extends ParserRuleContext {
		public Token a;
		public TerminalNode ASSIGN() { return getToken(MyLanguageV1CodeParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitAssignstmt(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(106); ((AssignstmtContext)_localctx).a = match(NAME);
			setState(107); match(ASSIGN);
			setState(108); expression();
			setState(109); match(SEMICOLON);
			System.out.println("\tmov ["+(((AssignstmtContext)_localctx).a!=null?((AssignstmtContext)_localctx).a.getText():null)+"], eax");
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

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext a;
		public TermContext b;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SUBTRACT() { return getToken(MyLanguageV1CodeParser.SUBTRACT, 0); }
		public TerminalNode PLUS() { return getToken(MyLanguageV1CodeParser.PLUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				int a,b; 
				setState(113); ((ExpressionContext)_localctx).a = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); ((ExpressionContext)_localctx).a = term();
				setState(117); match(PLUS);
				setState(118); ((ExpressionContext)_localctx).b = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				System.out.println("\tadd eax,"+((ExpressionContext)_localctx).b.toString);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); ((ExpressionContext)_localctx).a = term();
				setState(123); match(SUBTRACT);
				setState(124); ((ExpressionContext)_localctx).b = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				System.out.println("\tsub eax,"+((ExpressionContext)_localctx).b.toString);
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

	public static class TermContext extends ParserRuleContext {
		public String toString;
		public IdentifierContext identifier;
		public IntegerContext integer;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); ((TermContext)_localctx).identifier = identifier();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).identifier.toString;
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); ((TermContext)_localctx).integer = integer();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).integer.toString;
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

	public static class NumtermContext extends ParserRuleContext {
		public PrinttermContext printterm(int i) {
			return getRuleContext(PrinttermContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public List<PrinttermContext> printterm() {
			return getRuleContexts(PrinttermContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public NumtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterNumterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitNumterm(this);
		}
	}

	public final NumtermContext numterm() throws RecognitionException {
		NumtermContext _localctx = new NumtermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); printterm();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139); comma();
				setState(140); printterm();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(SEMICOLON);
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLanguageV1CodeParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(COMMA);
			System.out.println("\tmov al, 02Ch");
			System.out.println("\tcall print_char");
			System.out.println("\tmov al, 020h");
			System.out.println("\tcall print_char");
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

	public static class PrinttermContext extends ParserRuleContext {
		public Token NAME;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(MyLanguageV1CodeParser.INTEGER, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public PrinttermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterPrintterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitPrintterm(this);
		}
	}

	public final PrinttermContext printterm() throws RecognitionException {
		PrinttermContext _localctx = new PrinttermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printterm);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); ((PrinttermContext)_localctx).NAME = match(NAME);
				System.out.println("\tmov eax, ["+(((PrinttermContext)_localctx).NAME!=null?((PrinttermContext)_localctx).NAME.getText():null)+"]");
				           System.out.println("\tcall print_int"); 
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); ((PrinttermContext)_localctx).INTEGER = match(INTEGER);
				System.out.println("\tmov eax, "+(((PrinttermContext)_localctx).INTEGER!=null?((PrinttermContext)_localctx).INTEGER.getText():null));
				           System.out.println("\tcall print_int"); 
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

	public static class IdentifierContext extends ParserRuleContext {
		public String toString;
		public Token NAME;
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); ((IdentifierContext)_localctx).NAME = match(NAME);
			((IdentifierContext)_localctx).toString =  "["+(((IdentifierContext)_localctx).NAME!=null?((IdentifierContext)_localctx).NAME.getText():null)+"]";
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

	public static class IntegerContext extends ParserRuleContext {
		public String toString;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(MyLanguageV1CodeParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); ((IntegerContext)_localctx).INTEGER = match(INTEGER);
			((IntegerContext)_localctx).toString =  (((IntegerContext)_localctx).INTEGER!=null?((IntegerContext)_localctx).INTEGER.getText():null);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16\6"+
		"V\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\7\13\u0091\n\13\f\13\16\13"+
		"\u0094\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a2"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\2\u00a8\2\36\3\2\2\2\4.\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\n"+
		"N\3\2\2\2\fi\3\2\2\2\16k\3\2\2\2\20\u0082\3\2\2\2\22\u008a\3\2\2\2\24"+
		"\u008c\3\2\2\2\26\u0097\3\2\2\2\30\u00a1\3\2\2\2\32\u00a3\3\2\2\2\34\u00a6"+
		"\3\2\2\2\36\"\b\2\1\2\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#"+
		"\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%)\b\2\1\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\b\2\1\2-\3\3\2\2\2./\b\3\1"+
		"\2/\60\7\6\2\2\60\61\7\23\2\2\61\62\7\r\2\2\62\63\7\22\2\2\63\64\7\17"+
		"\2\2\64\65\b\3\1\2\65\5\3\2\2\2\66;\5\b\5\2\67;\5\f\7\28;\5\16\b\29;\5"+
		"\n\6\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<=\b\5\1"+
		"\2=>\b\5\1\2>?\7\3\2\2?@\7\20\2\2@A\5\32\16\2AB\7\f\2\2BC\5\34\17\2CD"+
		"\7\21\2\2DH\b\5\1\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"IK\3\2\2\2JH\3\2\2\2KL\b\5\1\2LM\7\4\2\2M\t\3\2\2\2NO\b\6\1\2OP\7\7\2"+
		"\2PT\b\6\1\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2"+
		"\2VT\3\2\2\2WX\7\b\2\2XY\7\20\2\2YZ\5\32\16\2Z[\7\16\2\2[\\\5\34\17\2"+
		"\\]\7\21\2\2]^\b\6\1\2^_\b\6\1\2_\13\3\2\2\2`a\7\5\2\2ab\5\22\n\2bc\7"+
		"\17\2\2cd\b\7\1\2dj\3\2\2\2ef\7\5\2\2fg\5\24\13\2gh\b\7\1\2hj\3\2\2\2"+
		"i`\3\2\2\2ie\3\2\2\2j\r\3\2\2\2kl\b\b\1\2lm\7\23\2\2mn\7\r\2\2no\5\20"+
		"\t\2op\7\17\2\2pq\b\b\1\2q\17\3\2\2\2rs\b\t\1\2st\5\22\n\2tu\b\t\1\2u"+
		"\u0083\3\2\2\2vw\5\22\n\2wx\7\n\2\2xy\5\22\n\2yz\b\t\1\2z{\b\t\1\2{\u0083"+
		"\3\2\2\2|}\5\22\n\2}~\7\13\2\2~\177\5\22\n\2\177\u0080\b\t\1\2\u0080\u0081"+
		"\b\t\1\2\u0081\u0083\3\2\2\2\u0082r\3\2\2\2\u0082v\3\2\2\2\u0082|\3\2"+
		"\2\2\u0083\21\3\2\2\2\u0084\u0085\5\32\16\2\u0085\u0086\b\n\1\2\u0086"+
		"\u008b\3\2\2\2\u0087\u0088\5\34\17\2\u0088\u0089\b\n\1\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\23\3\2\2\2\u008c"+
		"\u0092\5\30\r\2\u008d\u008e\5\26\f\2\u008e\u008f\5\30\r\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\17"+
		"\2\2\u0096\25\3\2\2\2\u0097\u0098\7\t\2\2\u0098\u0099\b\f\1\2\u0099\u009a"+
		"\b\f\1\2\u009a\u009b\b\f\1\2\u009b\u009c\b\f\1\2\u009c\27\3\2\2\2\u009d"+
		"\u009e\7\23\2\2\u009e\u00a2\b\r\1\2\u009f\u00a0\7\22\2\2\u00a0\u00a2\b"+
		"\r\1\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\31\3\2\2\2\u00a3"+
		"\u00a4\7\23\2\2\u00a4\u00a5\b\16\1\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\22"+
		"\2\2\u00a7\u00a8\b\17\1\2\u00a8\35\3\2\2\2\f\"):HTi\u0082\u008a\u0092"+
		"\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}