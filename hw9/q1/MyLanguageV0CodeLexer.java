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
public class MyLanguageV0CodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, PLUS=5, EQUAL=6, ASSIGN=7, NOTEQUAL=8, 
		SEMICOLON=9, LPAREN=10, RPAREN=11, INTEGER=12, NAME=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"IF", "ENDIF", "PRINT", "INT", "PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", 
		"SEMICOLON", "LPAREN", "RPAREN", "INTEGER", "NAME", "WS"
	};


	public MyLanguageV0CodeLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20U\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\rE\n\r\f\r\16\rH"+
		"\13\r\3\16\6\16K\n\16\r\16\16\16L\3\17\6\17P\n\17\r\17\16\17Q\3\17\3\17"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17\"\"W\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\3\37\3\2\2\2\5\"\3\2\2\2\7(\3\2\2\2\t.\3\2\2\2\13\62\3"+
		"\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2"+
		"\27@\3\2\2\2\31B\3\2\2\2\33J\3\2\2\2\35O\3\2\2\2\37 \7k\2\2 !\7h\2\2!"+
		"\4\3\2\2\2\"#\7g\2\2#$\7p\2\2$%\7f\2\2%&\7k\2\2&\'\7h\2\2\'\6\3\2\2\2"+
		"()\7r\2\2)*\7t\2\2*+\7k\2\2+,\7p\2\2,-\7v\2\2-\b\3\2\2\2./\7k\2\2/\60"+
		"\7p\2\2\60\61\7v\2\2\61\n\3\2\2\2\62\63\7-\2\2\63\f\3\2\2\2\64\65\7?\2"+
		"\2\65\66\7?\2\2\66\16\3\2\2\2\678\7?\2\28\20\3\2\2\29:\7#\2\2:;\7?\2\2"+
		";\22\3\2\2\2<=\7=\2\2=\24\3\2\2\2>?\7*\2\2?\26\3\2\2\2@A\7+\2\2A\30\3"+
		"\2\2\2BF\t\2\2\2CE\t\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\32"+
		"\3\2\2\2HF\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M"+
		"\34\3\2\2\2NP\t\4\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2"+
		"\2ST\b\17\2\2T\36\3\2\2\2\6\2FLQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}