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
		IF=1, ENDIF=2, PRINT=3, INT=4, DO=5, WHILE=6, PLUS=7, SUBTRACT=8, EQUAL=9, 
		ASSIGN=10, NOTEQUAL=11, SEMICOLON=12, LPAREN=13, RPAREN=14, INTEGER=15, 
		NAME=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"IF", "ENDIF", "PRINT", "INT", "DO", "WHILE", "PLUS", "SUBTRACT", "EQUAL", 
		"ASSIGN", "NOTEQUAL", "SEMICOLON", "LPAREN", "RPAREN", "INTEGER", "NAME", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20V\n\20"+
		"\f\20\16\20Y\13\20\3\21\6\21\\\n\21\r\21\16\21]\3\22\6\22a\n\22\r\22\16"+
		"\22b\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17"+
		"\"\"h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7.\3\2\2\2\t\64\3\2\2\2\138\3\2\2\2\r"+
		";\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2"+
		"\31M\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37S\3\2\2\2![\3\2\2\2#`\3\2\2\2%"+
		"&\7k\2\2&\'\7h\2\2\'\4\3\2\2\2()\7g\2\2)*\7p\2\2*+\7f\2\2+,\7k\2\2,-\7"+
		"h\2\2-\6\3\2\2\2./\7r\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7"+
		"v\2\2\63\b\3\2\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7v\2\2\67\n\3\2\2\2"+
		"89\7f\2\29:\7q\2\2:\f\3\2\2\2;<\7y\2\2<=\7j\2\2=>\7k\2\2>?\7n\2\2?@\7"+
		"g\2\2@\16\3\2\2\2AB\7-\2\2B\20\3\2\2\2CD\7/\2\2D\22\3\2\2\2EF\7?\2\2F"+
		"G\7?\2\2G\24\3\2\2\2HI\7?\2\2I\26\3\2\2\2JK\7#\2\2KL\7?\2\2L\30\3\2\2"+
		"\2MN\7=\2\2N\32\3\2\2\2OP\7*\2\2P\34\3\2\2\2QR\7+\2\2R\36\3\2\2\2SW\t"+
		"\2\2\2TV\t\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X \3\2\2\2YW\3"+
		"\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\"\3\2\2\2"+
		"_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\22\2"+
		"\2e$\3\2\2\2\6\2W]b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}