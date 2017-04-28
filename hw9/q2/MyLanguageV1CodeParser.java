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
		IF=1, ENDIF=2, PRINT=3, INT=4, PLUS=5, SUBTRACT=6, EQUAL=7, ASSIGN=8, 
		NOTEQUAL=9, SEMICOLON=10, LPAREN=11, RPAREN=12, INTEGER=13, NAME=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'endif'", "'print'", "'int'", "'+'", "'-'", "'=='", 
		"'='", "'!='", "';'", "'('", "')'", "INTEGER", "NAME", "WS"
	};
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_ifstmt = 3, 
		RULE_printstmt = 4, RULE_assignstmt = 5, RULE_expression = 6, RULE_term = 7, 
		RULE_identifier = 8, RULE_integer = 9;
	public static final String[] ruleNames = {
		"program", "declaration", "statement", "ifstmt", "printstmt", "assignstmt", 
		"expression", "term", "identifier", "integer"
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
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(21); declaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("segment .text"); 
			               System.out.println("\tglobal asm_main"); 
			               System.out.println("asm_main:"); 
			               System.out.println("\tenter 0,0"); 
			               System.out.println("\tpusha"); 
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << NAME))) != 0)) {
				{
				{
				setState(28); statement();
				}
				}
				setState(33);
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
			setState(37); match(INT);
			setState(38); ((DeclarationContext)_localctx).a = match(NAME);
			setState(39); match(ASSIGN);
			setState(40); ((DeclarationContext)_localctx).b = match(INTEGER);
			setState(41); match(SEMICOLON);
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
			setState(47);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); ifstmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); printstmt();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(46); assignstmt();
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
			setState(51); ((IfstmtContext)_localctx).IF = match(IF);
			setState(52); match(LPAREN);
			setState(53); ((IfstmtContext)_localctx).a = identifier();
			setState(54); match(EQUAL);
			setState(55); ((IfstmtContext)_localctx).b = integer();
			setState(56); match(RPAREN);
			System.out.println("tcmp dword "+((IfstmtContext)_localctx).a.toString+","+((IfstmtContext)_localctx).b.toString);
			             label = "label_"+Integer.toString((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getTokenIndex():0));
			             System.out.println("tjnz "+label); 
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << NAME))) != 0)) {
				{
				{
				setState(58); statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 System.out.println(label+":"); 
			setState(65); match(ENDIF);
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
		enterRule(_localctx, 8, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(PRINT);
			setState(68); ((PrintstmtContext)_localctx).term = term();
			setState(69); match(SEMICOLON);
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
		enterRule(_localctx, 10, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(73); ((AssignstmtContext)_localctx).a = match(NAME);
			setState(74); match(ASSIGN);
			setState(75); expression();
			setState(76); match(SEMICOLON);
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				int a,b; 
				setState(80); ((ExpressionContext)_localctx).a = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); ((ExpressionContext)_localctx).a = term();
				setState(84); match(PLUS);
				setState(85); ((ExpressionContext)_localctx).b = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				System.out.println("\tadd eax,"+((ExpressionContext)_localctx).b.toString);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); ((ExpressionContext)_localctx).a = term();
				setState(90); match(SUBTRACT);
				setState(91); ((ExpressionContext)_localctx).b = term();
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
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); ((TermContext)_localctx).identifier = identifier();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).identifier.toString;
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); ((TermContext)_localctx).integer = integer();
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
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); ((IdentifierContext)_localctx).NAME = match(NAME);
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
		enterRule(_localctx, 18, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); ((IntegerContext)_localctx).INTEGER = match(INTEGER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tj\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\2o\2\26\3\2\2\2\4&\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\nE\3\2\2\2"+
		"\fJ\3\2\2\2\16a\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24n\3\2\2\2\26\32\b\2"+
		"\1\2\27\31\5\4\3\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35!\b\2\1\2\36 \5\6\4\2\37\36\3\2\2\2"+
		" #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\b\2\1\2%\3\3"+
		"\2\2\2&\'\b\3\1\2\'(\7\6\2\2()\7\20\2\2)*\7\n\2\2*+\7\17\2\2+,\7\f\2\2"+
		",-\b\3\1\2-\5\3\2\2\2.\62\5\b\5\2/\62\5\n\6\2\60\62\5\f\7\2\61.\3\2\2"+
		"\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\b\5\1\2\64\65\b\5\1\2"+
		"\65\66\7\3\2\2\66\67\7\r\2\2\678\5\22\n\289\7\t\2\29:\5\24\13\2:;\7\16"+
		"\2\2;?\b\5\1\2<>\5\6\4\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2"+
		"\2\2A?\3\2\2\2BC\b\5\1\2CD\7\4\2\2D\t\3\2\2\2EF\7\5\2\2FG\5\20\t\2GH\7"+
		"\f\2\2HI\b\6\1\2I\13\3\2\2\2JK\b\7\1\2KL\7\20\2\2LM\7\n\2\2MN\5\16\b\2"+
		"NO\7\f\2\2OP\b\7\1\2P\r\3\2\2\2QR\b\b\1\2RS\5\20\t\2ST\b\b\1\2Tb\3\2\2"+
		"\2UV\5\20\t\2VW\7\7\2\2WX\5\20\t\2XY\b\b\1\2YZ\b\b\1\2Zb\3\2\2\2[\\\5"+
		"\20\t\2\\]\7\b\2\2]^\5\20\t\2^_\b\b\1\2_`\b\b\1\2`b\3\2\2\2aQ\3\2\2\2"+
		"aU\3\2\2\2a[\3\2\2\2b\17\3\2\2\2cd\5\22\n\2de\b\t\1\2ej\3\2\2\2fg\5\24"+
		"\13\2gh\b\t\1\2hj\3\2\2\2ic\3\2\2\2if\3\2\2\2j\21\3\2\2\2kl\7\20\2\2l"+
		"m\b\n\1\2m\23\3\2\2\2no\7\17\2\2op\b\13\1\2p\25\3\2\2\2\b\32!\61?ai";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}