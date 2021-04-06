// Generated from ru\nsu\fit\ojp\u005Cushaev\ojp_4\Zarf.g4 by ANTLR 4.9.2
package ru.nsu.fit.ojp.ushaev.ojp_4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZarfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, VARIABLE=15, PRINT=16, 
		EQUALS=17, NUMBER=18, STRING=19, ID=20, WS=21, PLUS_MINUS=22, MULT_DIV=23, 
		PLUS=24, MINUS=25, MULT=26, DIV=27, MOD=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "VARIABLE", "PRINT", "EQUALS", 
			"NUMBER", "STRING", "ID", "WS", "PLUS_MINUS", "MULT_DIV", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'goto'", "'('", "')'", "'>'", "'<'", "'=='", "'!='", "'>='", 
			"'<='", "'if'", "'else'", "'{'", "'}'", "'let'", "'say'", "'='", null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", 
			"ID", "WS", "PLUS_MINUS", "MULT_DIV", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD"
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


	public ZarfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Zarf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\5\23n\n\23\3\23"+
		"\6\23q\n\23\r\23\16\23r\3\24\3\24\7\24w\n\24\f\24\16\24z\13\24\3\24\3"+
		"\24\3\25\6\25\177\n\25\r\25\16\25\u0080\3\26\6\26\u0084\n\26\r\26\16\26"+
		"\u0085\3\26\3\26\3\27\3\27\5\27\u008c\n\27\3\30\3\30\3\30\5\30\u0091\n"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3x\2\36\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\5\4\2\60"+
		"\60\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00a3\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7B\3"+
		"\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21M\3\2\2\2\23P\3"+
		"\2\2\2\25S\3\2\2\2\27V\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37"+
		"b\3\2\2\2!f\3\2\2\2#j\3\2\2\2%m\3\2\2\2\'t\3\2\2\2)~\3\2\2\2+\u0083\3"+
		"\2\2\2-\u008b\3\2\2\2/\u0090\3\2\2\2\61\u0092\3\2\2\2\63\u0094\3\2\2\2"+
		"\65\u0096\3\2\2\2\67\u0098\3\2\2\29\u009a\3\2\2\2;<\7#\2\2<\4\3\2\2\2"+
		"=>\7i\2\2>?\7q\2\2?@\7v\2\2@A\7q\2\2A\6\3\2\2\2BC\7*\2\2C\b\3\2\2\2DE"+
		"\7+\2\2E\n\3\2\2\2FG\7@\2\2G\f\3\2\2\2HI\7>\2\2I\16\3\2\2\2JK\7?\2\2K"+
		"L\7?\2\2L\20\3\2\2\2MN\7#\2\2NO\7?\2\2O\22\3\2\2\2PQ\7@\2\2QR\7?\2\2R"+
		"\24\3\2\2\2ST\7>\2\2TU\7?\2\2U\26\3\2\2\2VW\7k\2\2WX\7h\2\2X\30\3\2\2"+
		"\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\32\3\2\2\2^_\7}\2\2_\34\3\2"+
		"\2\2`a\7\177\2\2a\36\3\2\2\2bc\7n\2\2cd\7g\2\2de\7v\2\2e \3\2\2\2fg\7"+
		"u\2\2gh\7c\2\2hi\7{\2\2i\"\3\2\2\2jk\7?\2\2k$\3\2\2\2ln\7/\2\2ml\3\2\2"+
		"\2mn\3\2\2\2np\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2s&\3\2\2\2tx\7$\2\2uw\13\2\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2"+
		"\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|(\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081*\3\2\2\2\u0082\u0084"+
		"\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\26\2\2\u0088,\3\2\2\2"+
		"\u0089\u008c\5\61\31\2\u008a\u008c\5\63\32\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c.\3\2\2\2\u008d\u0091\5\65\33\2\u008e\u0091\5\67\34"+
		"\2\u008f\u0091\59\35\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\60\3\2\2\2\u0092\u0093\7-\2\2\u0093\62\3\2\2\2\u0094\u0095"+
		"\7/\2\2\u0095\64\3\2\2\2\u0096\u0097\7,\2\2\u0097\66\3\2\2\2\u0098\u0099"+
		"\7\61\2\2\u00998\3\2\2\2\u009a\u009b\7\'\2\2\u009b:\3\2\2\2\n\2mrx\u0080"+
		"\u0085\u008b\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}