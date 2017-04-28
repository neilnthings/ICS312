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
		IF=1, ENDIF=2, PRINT=3, INT=4, DO=5, WHILE=6, PLUS=7, SUBTRACT=8, EQUAL=9, 
		ASSIGN=10, NOTEQUAL=11, SEMICOLON=12, LPAREN=13, RPAREN=14, INTEGER=15, 
		NAME=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'endif'", "'print'", "'int'", "'do'", "'while'", 
		"'+'", "'-'", "'=='", "'='", "'!='", "';'", "'('", "')'", "INTEGER", "NAME", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_ifstmt = 3, 
		RULE_dostmt = 4, RULE_printstmt = 5, RULE_assignstmt = 6, RULE_expression = 7, 
		RULE_term = 8, RULE_identifier = 9, RULE_integer = 10;
	public static final String[] ruleNames = {
		"program", "declaration", "statement", "ifstmt", "dostmt", "printstmt", 
		"assignstmt", "expression", "term", "identifier", "integer"
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(23); declaration();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("segment .text"); 
			               System.out.println("\tglobal asm_main"); 
			               System.out.println("asm_main:"); 
			               System.out.println("\tenter 0,0"); 
			               System.out.println("\tpusha"); 
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(30); statement();
				}
				}
				setState(35);
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
			setState(39); match(INT);
			setState(40); ((DeclarationContext)_localctx).a = match(NAME);
			setState(41); match(ASSIGN);
			setState(42); ((DeclarationContext)_localctx).b = match(INTEGER);
			setState(43); match(SEMICOLON);
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
			setState(50);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); ifstmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); printstmt();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(48); assignstmt();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(49); dostmt();
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
			setState(54); ((IfstmtContext)_localctx).IF = match(IF);
			setState(55); match(LPAREN);
			setState(56); ((IfstmtContext)_localctx).a = identifier();
			setState(57); match(EQUAL);
			setState(58); ((IfstmtContext)_localctx).b = integer();
			setState(59); match(RPAREN);
			System.out.println("cmp dword "+((IfstmtContext)_localctx).a.toString+","+((IfstmtContext)_localctx).b.toString);
			             label = "label_"+Integer.toString((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getTokenIndex():0));
			             System.out.println("jnz "+label); 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(61); statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 System.out.println(label+":"); 
			setState(68); match(ENDIF);
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
			setState(71); ((DostmtContext)_localctx).DO = match(DO);
			System.out.println("do_loop_"+(((DostmtContext)_localctx).DO!=null?((DostmtContext)_localctx).DO.getTokenIndex():0)+":"); 
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(73); statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(WHILE);
			setState(80); match(LPAREN);
			setState(81); ((DostmtContext)_localctx).a = identifier();
			setState(82); match(NOTEQUAL);
			setState(83); ((DostmtContext)_localctx).b = integer();
			setState(84); match(RPAREN);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(PRINT);
			setState(89); ((PrintstmtContext)_localctx).term = term();
			setState(90); match(SEMICOLON);
			System.out.println("\tmov eax, "+((PrintstmtContext)_localctx).term.toString);
			                System.out.println("\tcall print_int");
			                System.out.println("\tcall print_nl");
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
			setState(94); ((AssignstmtContext)_localctx).a = match(NAME);
			setState(95); match(ASSIGN);
			setState(96); expression();
			setState(97); match(SEMICOLON);
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
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				int a,b; 
				setState(101); ((ExpressionContext)_localctx).a = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); ((ExpressionContext)_localctx).a = term();
				setState(105); match(PLUS);
				setState(106); ((ExpressionContext)_localctx).b = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				System.out.println("\tadd eax,"+((ExpressionContext)_localctx).b.toString);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); ((ExpressionContext)_localctx).a = term();
				setState(111); match(SUBTRACT);
				setState(112); ((ExpressionContext)_localctx).b = term();
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
			setState(124);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); ((TermContext)_localctx).identifier = identifier();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).identifier.toString;
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); ((TermContext)_localctx).integer = integer();
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
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); ((IdentifierContext)_localctx).NAME = match(NAME);
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
		enterRule(_localctx, 20, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((IntegerContext)_localctx).INTEGER = match(INTEGER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5"+
		"D\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"w\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u0085\2\30\3\2\2\2\4(\3\2\2\2"+
		"\6\64\3\2\2\2\b\66\3\2\2\2\nH\3\2\2\2\fZ\3\2\2\2\16_\3\2\2\2\20v\3\2\2"+
		"\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u0083\3\2\2\2\30\34\b\2\1\2\31\33\5"+
		"\4\3\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3"+
		"\2\2\2\36\34\3\2\2\2\37#\b\2\1\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\b\2\1\2\'\3\3\2\2\2()\b\3\1\2)*"+
		"\7\6\2\2*+\7\22\2\2+,\7\f\2\2,-\7\21\2\2-.\7\16\2\2./\b\3\1\2/\5\3\2\2"+
		"\2\60\65\5\b\5\2\61\65\5\f\7\2\62\65\5\16\b\2\63\65\5\n\6\2\64\60\3\2"+
		"\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\b\5"+
		"\1\2\678\b\5\1\289\7\3\2\29:\7\17\2\2:;\5\24\13\2;<\7\13\2\2<=\5\26\f"+
		"\2=>\7\20\2\2>B\b\5\1\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2CE\3\2\2\2DB\3\2\2\2EF\b\5\1\2FG\7\4\2\2G\t\3\2\2\2HI\b\6\1\2IJ\7"+
		"\7\2\2JN\b\6\1\2KM\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3"+
		"\2\2\2PN\3\2\2\2QR\7\b\2\2RS\7\17\2\2ST\5\24\13\2TU\7\r\2\2UV\5\26\f\2"+
		"VW\7\20\2\2WX\b\6\1\2XY\b\6\1\2Y\13\3\2\2\2Z[\7\5\2\2[\\\5\22\n\2\\]\7"+
		"\16\2\2]^\b\7\1\2^\r\3\2\2\2_`\b\b\1\2`a\7\22\2\2ab\7\f\2\2bc\5\20\t\2"+
		"cd\7\16\2\2de\b\b\1\2e\17\3\2\2\2fg\b\t\1\2gh\5\22\n\2hi\b\t\1\2iw\3\2"+
		"\2\2jk\5\22\n\2kl\7\t\2\2lm\5\22\n\2mn\b\t\1\2no\b\t\1\2ow\3\2\2\2pq\5"+
		"\22\n\2qr\7\n\2\2rs\5\22\n\2st\b\t\1\2tu\b\t\1\2uw\3\2\2\2vf\3\2\2\2v"+
		"j\3\2\2\2vp\3\2\2\2w\21\3\2\2\2xy\5\24\13\2yz\b\n\1\2z\177\3\2\2\2{|\5"+
		"\26\f\2|}\b\n\1\2}\177\3\2\2\2~x\3\2\2\2~{\3\2\2\2\177\23\3\2\2\2\u0080"+
		"\u0081\7\22\2\2\u0081\u0082\b\13\1\2\u0082\25\3\2\2\2\u0083\u0084\7\21"+
		"\2\2\u0084\u0085\b\f\1\2\u0085\27\3\2\2\2\t\34#\64BNv~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}