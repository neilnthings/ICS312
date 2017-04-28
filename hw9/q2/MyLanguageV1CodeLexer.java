// Generated from MyLanguageV1Code.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageV1CodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, PLUS=5, SUBTRACT=6, EQUAL=7, ASSIGN=8, 
		NOTEQUAL=9, SEMICOLON=10, LPAREN=11, RPAREN=12, INTEGER=13, NAME=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"IF", "ENDIF", "PRINT", "INT", "PLUS", "SUBTRACT", "EQUAL", "ASSIGN", 
		"NOTEQUAL", "SEMICOLON", "LPAREN", "RPAREN", "INTEGER", "NAME", "WS"
	};


	public MyLanguageV1CodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguageV1Code.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\7\16I\n\16\f\16\16\16L\13\16\3\17\6\17O\n\17\r\17\16\17P\3\20\6\20T\n"+
		"\20\r\20\16\20U\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3\2\62;\3\2c|\5\2\13\f\17"+
		"\17\"\"[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2"+
		"\2\5$\3\2\2\2\7*\3\2\2\2\t\60\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3"+
		"\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31D\3\2\2\2\33"+
		"F\3\2\2\2\35N\3\2\2\2\37S\3\2\2\2!\"\7k\2\2\"#\7h\2\2#\4\3\2\2\2$%\7g"+
		"\2\2%&\7p\2\2&\'\7f\2\2\'(\7k\2\2()\7h\2\2)\6\3\2\2\2*+\7r\2\2+,\7t\2"+
		"\2,-\7k\2\2-.\7p\2\2./\7v\2\2/\b\3\2\2\2\60\61\7k\2\2\61\62\7p\2\2\62"+
		"\63\7v\2\2\63\n\3\2\2\2\64\65\7-\2\2\65\f\3\2\2\2\66\67\7/\2\2\67\16\3"+
		"\2\2\289\7?\2\29:\7?\2\2:\20\3\2\2\2;<\7?\2\2<\22\3\2\2\2=>\7#\2\2>?\7"+
		"?\2\2?\24\3\2\2\2@A\7=\2\2A\26\3\2\2\2BC\7*\2\2C\30\3\2\2\2DE\7+\2\2E"+
		"\32\3\2\2\2FJ\t\2\2\2GI\t\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2"+
		"\2K\34\3\2\2\2LJ\3\2\2\2MO\t\3\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2Q\36\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3"+
		"\2\2\2WX\b\20\2\2X \3\2\2\2\6\2JPU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}