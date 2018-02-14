/* The following code was generated by JFlex 1.6.1 */

package Analizador.CHTML;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import EstructurasDatos.NodoError;
//Scanner para CHTML

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/Analizador/CHTML/lexicoCHTML.flex</tt>
 */
public class scannerCHTML implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\44\1\46\1\45\1\45\22\0\1\45\1\0\1\36"+
    "\12\0\1\11\1\0\1\43\12\37\1\0\1\34\1\32\1\35\1\33"+
    "\2\0\1\13\1\14\1\1\1\16\1\12\1\6\1\25\1\2\1\40"+
    "\1\20\1\42\1\5\1\4\1\10\1\17\1\24\1\37\1\23\1\41"+
    "\1\3\1\22\1\30\1\37\1\26\1\37\1\15\4\0\1\27\1\0"+
    "\1\13\1\14\1\1\1\16\1\12\1\6\1\25\1\2\1\40\1\20"+
    "\1\42\1\5\1\4\1\10\1\17\1\24\1\37\1\23\1\41\1\3"+
    "\1\22\1\30\1\37\1\26\1\37\1\15\12\0\1\46\252\0\2\7"+
    "\115\0\1\21\u1ea8\0\1\46\1\46\u0100\0\1\31\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udee5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\4\2\1\1\4\2\1\1\4\2\1\3"+
    "\1\4\1\5\1\6\1\1\2\2\1\7\1\10\2\2"+
    "\1\11\2\2\1\12\6\2\1\0\1\13\5\2\2\0"+
    "\4\2\2\0\1\2\1\13\6\2\1\14\6\2\1\0"+
    "\7\2\2\0\4\2\1\15\1\16\3\2\1\17\2\2"+
    "\1\20\6\2\1\0\2\2\1\21\4\2\2\0\1\22"+
    "\3\2\2\15\3\2\1\23\1\24\3\2\1\25\1\26"+
    "\1\27\11\2\1\0\3\2\1\30\1\31\1\2\2\0"+
    "\1\32\1\33\1\34\1\0\4\2\1\35\1\36\3\2"+
    "\1\37\1\2\1\40\14\2\1\41\1\2\1\42\1\2"+
    "\1\43\3\0\1\41\3\2\1\44\3\2\1\45\16\2"+
    "\1\0\1\46\1\0\1\2\1\46\1\2\1\47\1\2"+
    "\1\50\15\2\1\51\2\0\2\2\1\52\3\2\1\53"+
    "\1\54\1\55\3\2\1\56\2\2\1\57\1\2\1\60"+
    "\1\15\1\60\1\61\1\2\1\62\1\63\1\2\1\64"+
    "\1\2\1\65\1\66\1\2\1\67\1\2\1\70\1\2"+
    "\1\71\4\2\1\72\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[266];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\u0270\0\47\0\47\0\47\0\u0297\0\u02be\0\u02e5\0\47"+
    "\0\47\0\u030c\0\u0333\0\165\0\u035a\0\u0381\0\165\0\u03a8"+
    "\0\u03cf\0\u03f6\0\u041d\0\u0444\0\u046b\0\u0492\0\47\0\u04b9"+
    "\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u05f1"+
    "\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4\0\165\0\u06db\0\u0702"+
    "\0\u0729\0\u0750\0\u0777\0\u079e\0\165\0\u07c5\0\u07ec\0\u0813"+
    "\0\u083a\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd\0\u0924\0\u094b"+
    "\0\u0972\0\u0999\0\u09c0\0\u09e7\0\u0a0e\0\u0a35\0\u0a5c\0\u0a83"+
    "\0\u0aaa\0\u0ad1\0\47\0\u0af8\0\u0b1f\0\u0b46\0\165\0\u0b6d"+
    "\0\u0b94\0\u0bbb\0\u0be2\0\u0c09\0\u0c30\0\u0c57\0\u0c7e\0\u0ca5"+
    "\0\u0ccc\0\u0cf3\0\u0d1a\0\165\0\u0d41\0\u0d68\0\u0d8f\0\u0db6"+
    "\0\u0ddd\0\u0e04\0\165\0\u0e2b\0\u0e52\0\u0e79\0\u0ea0\0\u0ec7"+
    "\0\u0eee\0\u0f15\0\u0f3c\0\165\0\165\0\u0f63\0\u0f8a\0\u0fb1"+
    "\0\u0fd8\0\165\0\165\0\u0fff\0\u1026\0\u104d\0\u1074\0\u109b"+
    "\0\u10c2\0\u10e9\0\u1110\0\u1137\0\u115e\0\u1185\0\u11ac\0\u11d3"+
    "\0\165\0\165\0\u11fa\0\u1221\0\u1248\0\165\0\165\0\165"+
    "\0\u126f\0\u1296\0\u12bd\0\u12e4\0\u130b\0\165\0\165\0\u1332"+
    "\0\u1359\0\u1380\0\165\0\u13a7\0\165\0\u13ce\0\u13f5\0\u141c"+
    "\0\u1443\0\u146a\0\u1491\0\u14b8\0\u14df\0\u1506\0\u152d\0\u1554"+
    "\0\u157b\0\47\0\u15a2\0\165\0\u15c9\0\165\0\u15f0\0\u1617"+
    "\0\u163e\0\165\0\u1665\0\u168c\0\u16b3\0\165\0\u16da\0\u1701"+
    "\0\u1728\0\165\0\u174f\0\u1776\0\u179d\0\u17c4\0\u17eb\0\u1812"+
    "\0\u1839\0\u1860\0\u1887\0\u18ae\0\u18d5\0\u18fc\0\u1923\0\u194a"+
    "\0\u1971\0\47\0\u1998\0\u19bf\0\165\0\u19e6\0\165\0\u1a0d"+
    "\0\u1a34\0\u1a5b\0\u1a82\0\u1aa9\0\u1ad0\0\u1af7\0\u1b1e\0\u1b45"+
    "\0\u1b6c\0\u1b93\0\u1bba\0\u1be1\0\u1c08\0\u1c2f\0\165\0\u1c56"+
    "\0\u1c7d\0\u1ca4\0\u1ccb\0\165\0\u1cf2\0\u1d19\0\u1d40\0\u1d67"+
    "\0\165\0\165\0\u1d8e\0\u1db5\0\u1ddc\0\165\0\u1e03\0\u1e2a"+
    "\0\165\0\u1e51\0\47\0\47\0\165\0\165\0\u1e78\0\165"+
    "\0\165\0\u1e9f\0\165\0\u1ec6\0\165\0\165\0\u1eed\0\165"+
    "\0\u1f14\0\165\0\u1f3b\0\165\0\u1f62\0\u1f89\0\u1fb0\0\u1fd7"+
    "\0\165\0\165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[266];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\4\1\6\1\7\1\4"+
    "\1\2\1\10\1\11\1\12\2\4\1\13\1\4\1\14"+
    "\1\4\1\15\1\16\1\17\1\4\1\2\1\20\1\2"+
    "\1\21\1\22\1\23\1\24\1\25\1\4\1\26\1\27"+
    "\1\4\1\2\1\30\1\31\50\0\1\4\1\32\1\33"+
    "\1\34\1\4\1\35\5\4\1\36\1\37\3\4\1\40"+
    "\1\4\1\41\7\4\1\0\10\4\1\0\35\4\1\0"+
    "\10\4\1\0\12\4\1\42\2\4\1\43\1\44\16\4"+
    "\1\0\5\4\1\42\2\4\1\0\12\4\1\45\22\4"+
    "\1\0\5\4\1\45\2\4\1\0\3\4\4\0\1\46"+
    "\11\0\1\47\30\0\10\4\1\50\21\4\1\0\10\4"+
    "\1\0\10\4\1\51\2\4\1\52\21\4\1\0\10\4"+
    "\1\0\22\4\1\53\12\4\1\0\10\4\1\0\27\4"+
    "\1\54\5\4\1\0\10\4\1\0\3\4\13\0\1\55"+
    "\10\0\1\56\22\0\22\4\1\57\7\4\1\0\10\4"+
    "\1\0\16\4\1\60\16\4\1\0\10\4\1\0\26\4"+
    "\1\61\6\4\1\0\10\4\1\0\16\4\1\62\16\4"+
    "\1\0\10\4\1\0\3\4\43\0\1\63\3\0\36\64"+
    "\1\0\10\64\4\4\1\65\11\4\1\66\13\4\1\0"+
    "\10\4\1\0\16\4\1\67\10\4\1\70\5\4\1\0"+
    "\10\4\1\0\24\4\1\71\10\4\1\0\6\4\1\71"+
    "\1\4\1\0\6\4\1\72\26\4\1\0\10\4\1\0"+
    "\12\4\1\73\22\4\1\0\5\4\1\73\2\4\1\0"+
    "\23\4\1\74\11\4\1\0\10\4\1\0\24\4\1\75"+
    "\10\4\1\0\6\4\1\75\1\4\1\0\15\4\1\76"+
    "\17\4\1\0\10\4\1\0\6\4\1\77\26\4\1\0"+
    "\10\4\1\0\31\4\1\100\3\4\1\0\10\4\1\0"+
    "\17\4\1\101\15\4\1\0\10\4\1\0\10\4\1\102"+
    "\2\4\1\103\21\4\1\0\10\4\1\0\3\4\13\0"+
    "\1\104\33\0\1\4\1\105\3\4\1\106\24\4\1\0"+
    "\10\4\1\0\6\4\1\107\3\4\1\110\22\4\1\0"+
    "\5\4\1\110\2\4\1\0\4\4\1\111\30\4\1\0"+
    "\10\4\1\0\6\4\1\112\26\4\1\0\10\4\1\0"+
    "\4\4\1\113\30\4\1\0\10\4\1\0\3\4\5\0"+
    "\1\114\50\0\1\115\30\0\1\115\6\0\3\4\1\116"+
    "\26\4\1\0\10\4\1\0\13\4\1\117\21\4\1\0"+
    "\10\4\1\0\25\4\1\120\7\4\1\0\10\4\1\0"+
    "\10\4\1\121\24\4\1\0\10\4\1\0\3\4\43\0"+
    "\1\122\3\0\36\64\1\123\10\64\13\4\1\124\16\4"+
    "\1\0\10\4\1\0\10\4\1\125\24\4\1\0\10\4"+
    "\1\0\12\4\1\126\22\4\1\0\5\4\1\126\2\4"+
    "\1\0\24\4\1\127\10\4\1\0\6\4\1\127\1\4"+
    "\1\0\7\4\1\130\25\4\1\0\10\4\1\0\4\4"+
    "\1\131\30\4\1\0\10\4\1\0\16\4\1\132\16\4"+
    "\1\0\10\4\1\0\26\4\1\133\6\4\1\0\10\4"+
    "\1\0\25\4\1\134\7\4\1\0\10\4\1\0\6\4"+
    "\1\135\26\4\1\0\10\4\1\0\10\4\1\136\24\4"+
    "\1\0\10\4\1\0\32\4\1\137\2\4\1\0\10\4"+
    "\1\0\14\4\1\140\20\4\1\0\10\4\1\0\3\4"+
    "\25\0\1\141\21\0\13\4\1\142\16\4\1\0\10\4"+
    "\1\0\16\4\1\143\16\4\1\0\10\4\1\0\22\4"+
    "\1\144\12\4\1\0\10\4\1\0\13\4\1\145\21\4"+
    "\1\0\10\4\1\0\5\4\1\146\27\4\1\0\10\4"+
    "\1\0\22\4\1\147\12\4\1\0\10\4\1\0\12\4"+
    "\1\150\22\4\1\0\5\4\1\150\2\4\1\0\3\4"+
    "\3\0\1\151\53\0\1\152\36\0\13\4\1\153\16\4"+
    "\1\0\10\4\1\0\15\4\1\154\17\4\1\0\10\4"+
    "\1\0\27\4\1\155\5\4\1\0\10\4\1\0\22\4"+
    "\1\156\12\4\1\0\10\4\1\0\3\4\11\157\1\160"+
    "\32\157\1\0\2\157\25\4\1\161\4\4\1\0\10\4"+
    "\1\0\6\4\1\162\26\4\1\0\10\4\1\0\13\4"+
    "\1\163\21\4\1\0\10\4\1\0\10\4\1\164\24\4"+
    "\1\0\10\4\1\0\34\4\1\165\1\0\7\4\1\165"+
    "\1\0\32\4\1\166\2\4\1\0\10\4\1\0\27\4"+
    "\1\167\5\4\1\0\10\4\1\0\10\4\1\170\24\4"+
    "\1\0\10\4\1\0\22\4\1\171\12\4\1\0\10\4"+
    "\1\0\16\4\1\172\16\4\1\0\10\4\1\0\6\4"+
    "\1\173\26\4\1\0\10\4\1\0\4\4\1\174\1\4"+
    "\1\175\2\4\1\176\1\177\2\4\1\200\1\4\1\201"+
    "\2\4\1\202\1\4\1\203\2\4\1\204\5\4\1\0"+
    "\5\4\1\177\1\203\1\4\1\0\3\4\12\0\1\205"+
    "\34\0\14\4\1\206\15\4\1\0\10\4\1\0\4\4"+
    "\1\207\30\4\1\0\10\4\1\0\15\4\1\210\17\4"+
    "\1\0\10\4\1\0\22\4\1\211\12\4\1\0\10\4"+
    "\1\0\13\4\1\212\21\4\1\0\10\4\1\0\22\4"+
    "\1\213\12\4\1\0\10\4\1\0\3\4\17\0\1\214"+
    "\37\0\1\215\36\0\5\4\1\216\24\4\1\0\10\4"+
    "\1\0\22\4\1\217\12\4\1\0\10\4\1\0\26\4"+
    "\1\220\6\4\1\0\10\4\1\0\3\4\44\157\1\0"+
    "\2\157\43\160\1\157\1\221\2\160\12\4\1\222\17\4"+
    "\1\0\10\4\1\0\22\4\1\223\12\4\1\0\10\4"+
    "\1\0\13\4\1\224\21\4\1\0\10\4\1\0\6\4"+
    "\1\225\26\4\1\0\10\4\1\0\22\4\1\226\12\4"+
    "\1\0\10\4\1\0\22\4\1\227\12\4\1\0\10\4"+
    "\1\0\32\4\1\230\2\4\1\0\10\4\1\0\4\4"+
    "\1\231\1\232\1\233\7\4\1\234\1\235\3\4\1\236"+
    "\1\4\1\237\7\4\1\0\10\4\1\0\12\4\1\240"+
    "\2\4\1\241\1\242\16\4\1\0\5\4\1\240\2\4"+
    "\1\0\12\4\1\243\22\4\1\0\5\4\1\243\2\4"+
    "\1\0\7\4\1\244\25\4\1\0\10\4\1\0\13\4"+
    "\1\245\21\4\1\0\10\4\1\0\22\4\1\246\12\4"+
    "\1\0\10\4\1\0\27\4\1\247\5\4\1\0\10\4"+
    "\1\0\27\4\1\250\5\4\1\0\10\4\1\0\16\4"+
    "\1\251\16\4\1\0\10\4\1\0\3\4\10\0\1\252"+
    "\36\0\12\4\1\253\17\4\1\0\10\4\1\0\15\4"+
    "\1\254\17\4\1\0\10\4\1\0\16\4\1\255\16\4"+
    "\1\0\10\4\1\0\13\4\1\256\21\4\1\0\10\4"+
    "\1\0\3\4\11\0\1\257\47\0\1\260\34\0\11\221"+
    "\1\261\31\221\1\0\3\221\10\4\1\262\21\4\1\0"+
    "\10\4\1\0\14\4\1\263\20\4\1\0\10\4\1\0"+
    "\15\4\1\264\17\4\1\0\10\4\1\0\15\4\1\265"+
    "\17\4\1\0\10\4\1\0\16\4\1\266\16\4\1\0"+
    "\10\4\1\0\24\4\1\267\10\4\1\0\6\4\1\267"+
    "\1\4\1\0\6\4\1\270\26\4\1\0\10\4\1\0"+
    "\23\4\1\271\11\4\1\0\10\4\1\0\24\4\1\272"+
    "\10\4\1\0\6\4\1\272\1\4\1\0\15\4\1\273"+
    "\17\4\1\0\10\4\1\0\6\4\1\274\26\4\1\0"+
    "\10\4\1\0\31\4\1\275\3\4\1\0\10\4\1\0"+
    "\17\4\1\276\15\4\1\0\10\4\1\0\10\4\1\277"+
    "\24\4\1\0\10\4\1\0\16\4\1\300\16\4\1\0"+
    "\10\4\1\0\4\4\1\301\3\4\1\302\24\4\1\0"+
    "\10\4\1\0\6\4\1\303\26\4\1\0\10\4\1\0"+
    "\4\4\1\304\30\4\1\0\10\4\1\0\12\4\1\305"+
    "\22\4\1\0\5\4\1\305\2\4\1\0\13\4\1\306"+
    "\21\4\1\0\10\4\1\0\20\4\1\307\14\4\1\0"+
    "\10\4\1\0\21\4\1\310\13\4\1\0\10\4\1\0"+
    "\3\4\6\0\1\311\63\0\1\312\23\0\11\221\1\261"+
    "\31\221\1\313\3\221\6\4\1\314\23\4\1\0\10\4"+
    "\1\0\26\4\1\315\6\4\1\0\10\4\1\0\31\4"+
    "\1\316\3\4\1\0\10\4\1\0\24\4\1\317\10\4"+
    "\1\0\6\4\1\317\1\4\1\0\7\4\1\320\25\4"+
    "\1\0\10\4\1\0\16\4\1\321\16\4\1\0\10\4"+
    "\1\0\26\4\1\322\6\4\1\0\10\4\1\0\25\4"+
    "\1\323\7\4\1\0\10\4\1\0\6\4\1\324\26\4"+
    "\1\0\10\4\1\0\10\4\1\325\24\4\1\0\10\4"+
    "\1\0\32\4\1\326\2\4\1\0\10\4\1\0\30\4"+
    "\1\327\4\4\1\0\10\4\1\0\16\4\1\330\16\4"+
    "\1\0\10\4\1\0\16\4\1\331\16\4\1\0\10\4"+
    "\1\0\22\4\1\332\12\4\1\0\10\4\1\0\12\4"+
    "\1\333\22\4\1\0\5\4\1\333\2\4\1\0\13\4"+
    "\1\334\21\4\1\0\10\4\1\0\15\4\1\335\17\4"+
    "\1\0\10\4\1\0\16\4\1\336\16\4\1\0\10\4"+
    "\1\0\22\4\1\337\12\4\1\0\10\4\1\0\3\4"+
    "\7\0\1\340\30\0\1\340\51\0\1\341\3\0\7\4"+
    "\1\342\22\4\1\0\5\4\1\342\2\4\1\0\6\4"+
    "\1\343\26\4\1\0\10\4\1\0\10\4\1\344\24\4"+
    "\1\0\10\4\1\0\32\4\1\345\2\4\1\0\10\4"+
    "\1\0\27\4\1\346\5\4\1\0\10\4\1\0\10\4"+
    "\1\347\24\4\1\0\10\4\1\0\22\4\1\350\12\4"+
    "\1\0\10\4\1\0\16\4\1\351\16\4\1\0\10\4"+
    "\1\0\6\4\1\352\26\4\1\0\10\4\1\0\15\4"+
    "\1\353\17\4\1\0\10\4\1\0\17\4\1\354\15\4"+
    "\1\0\10\4\1\0\4\4\1\355\30\4\1\0\10\4"+
    "\1\0\13\4\1\356\21\4\1\0\10\4\1\0\22\4"+
    "\1\357\12\4\1\0\10\4\1\0\13\4\1\360\21\4"+
    "\1\0\10\4\1\0\10\4\1\361\24\4\1\0\10\4"+
    "\1\0\21\4\1\362\13\4\1\0\10\4\1\0\3\4"+
    "\10\0\1\363\71\0\1\364\13\0\10\4\1\365\21\4"+
    "\1\0\10\4\1\0\22\4\1\366\12\4\1\0\10\4"+
    "\1\0\6\4\1\367\26\4\1\0\10\4\1\0\22\4"+
    "\1\370\12\4\1\0\10\4\1\0\22\4\1\371\12\4"+
    "\1\0\10\4\1\0\32\4\1\372\2\4\1\0\10\4"+
    "\1\0\13\4\1\373\21\4\1\0\10\4\1\0\15\4"+
    "\1\374\17\4\1\0\10\4\1\0\15\4\1\375\17\4"+
    "\1\0\10\4\1\0\13\4\1\376\21\4\1\0\10\4"+
    "\1\0\15\4\1\377\17\4\1\0\10\4\1\0\22\4"+
    "\1\u0100\12\4\1\0\10\4\1\0\15\4\1\u0101\17\4"+
    "\1\0\10\4\1\0\16\4\1\u0102\16\4\1\0\10\4"+
    "\1\0\20\4\1\u0103\14\4\1\0\10\4\1\0\26\4"+
    "\1\u0104\6\4\1\0\10\4\1\0\31\4\1\u0105\3\4"+
    "\1\0\10\4\1\0\16\4\1\u0106\16\4\1\0\10\4"+
    "\1\0\6\4\1\u0107\26\4\1\0\10\4\1\0\21\4"+
    "\1\u0108\13\4\1\0\10\4\1\0\22\4\1\u0109\12\4"+
    "\1\0\10\4\1\0\22\4\1\u010a\12\4\1\0\10\4"+
    "\1\0\3\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8190];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\17\1\3\11\3\1\2\11\14\1\1\0"+
    "\1\11\5\1\2\0\4\1\2\0\17\1\1\0\7\1"+
    "\2\0\5\1\1\11\15\1\1\0\7\1\2\0\32\1"+
    "\1\0\6\1\2\0\3\1\1\0\30\1\1\11\4\1"+
    "\3\0\27\1\1\0\1\11\1\0\24\1\2\0\21\1"+
    "\2\11\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[266];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    //Código de usuario
    public String archivo="null";
    public  ArrayList<NodoError> lexico= new ArrayList<NodoError>();
    public void agregarerror(int linea,int columna,String tipo,String men)
    {
       NodoError er= new NodoError(linea, columna, tipo, men,archivo);
       lexico.add(er);
    }
     public  ArrayList<NodoError> lex()
    {
        return lexico;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scannerCHTML(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 208) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { agregarerror(yyline+1,yycolumn,"lexico","caracter irreconocible: "+yytext());
            }
          case 60: break;
          case 2: 
            { return new Symbol(sym.ETEXTO, yyline, yycolumn, yytext());
            }
          case 61: break;
          case 3: 
            { return new Symbol(sym.ABRIR, yyline, yycolumn, yytext());
            }
          case 62: break;
          case 4: 
            { return new Symbol(sym.CERRAR, yyline, yycolumn, yytext());
            }
          case 63: break;
          case 5: 
            { return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext());
            }
          case 64: break;
          case 6: 
            { return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
            }
          case 65: break;
          case 7: 
            { /*Saltos de linea, ignorados*/
            }
          case 66: break;
          case 8: 
            { /*Espacios en blanco, ignorados*/
            }
          case 67: break;
          case 9: 
            { return new Symbol(sym.CT, yyline, yycolumn, yytext());
            }
          case 68: break;
          case 10: 
            { return new Symbol(sym.CB, yyline, yycolumn, yytext());
            }
          case 69: break;
          case 11: 
            { return new Symbol(sym.ID, yyline, yycolumn, yytext());
            }
          case 70: break;
          case 12: 
            { return new Symbol(sym.CJS, yyline, yycolumn, yytext());
            }
          case 71: break;
          case 13: 
            { /* */
            }
          case 72: break;
          case 14: 
            { return new Symbol(sym.ECADENA, yyline, yycolumn, yytext());
            }
          case 73: break;
          case 15: 
            { return new Symbol(sym.CCSS, yyline, yycolumn, yytext());
            }
          case 74: break;
          case 16: 
            { return new Symbol(sym.CAJA, yyline, yycolumn, yytext());
            }
          case 75: break;
          case 17: 
            { return new Symbol(sym.ALTO, yyline, yycolumn, yytext());
            }
          case 76: break;
          case 18: 
            { return new Symbol(sym.RUTA, yyline, yycolumn, yytext());
            }
          case 77: break;
          case 19: 
            { return new Symbol(sym.CHTML, yyline, yycolumn, yytext());
            }
          case 78: break;
          case 20: 
            { return new Symbol(sym.CLICK, yyline, yycolumn, yytext());
            }
          case 79: break;
          case 21: 
            { return new Symbol(sym.TEXTO, yyline, yycolumn, yytext());
            }
          case 80: break;
          case 22: 
            { return new Symbol(sym.TABLA, yyline, yycolumn, yytext());
            }
          case 81: break;
          case 23: 
            { return new Symbol(sym.FILT, yyline, yycolumn, yytext());
            }
          case 82: break;
          case 24: 
            { return new Symbol(sym.ANCHO, yyline, yycolumn, yytext());
            }
          case 83: break;
          case 25: 
            { return new Symbol(sym.BOTON, yyline, yycolumn, yytext());
            }
          case 84: break;
          case 26: 
            { return new Symbol(sym.PANEL, yyline, yycolumn, yytext());
            }
          case 85: break;
          case 27: 
            { return new Symbol(sym.GRUPO, yyline, yycolumn, yytext());
            }
          case 86: break;
          case 28: 
            { return new Symbol(sym.VALOR, yyline, yycolumn, yytext());
            }
          case 87: break;
          case 29: 
            { return new Symbol(sym.CUERPO, yyline, yycolumn, yytext());
            }
          case 88: break;
          case 30: 
            { return new Symbol(sym.TITULO, yyline, yycolumn, yytext());
            }
          case 89: break;
          case 31: 
            { return new Symbol(sym.FINCT, yyline, yycolumn, yytext());
            }
          case 90: break;
          case 32: 
            { return new Symbol(sym.FINCB, yyline, yycolumn, yytext());
            }
          case 91: break;
          case 33: 
            { return new Symbol(sym.IMAGEN, yyline, yycolumn, yytext());
            }
          case 92: break;
          case 34: 
            { return new Symbol(sym.ENLACE, yyline, yycolumn, yytext());
            }
          case 93: break;
          case 35: 
            { return new Symbol(sym.OPCION, yyline, yycolumn, yytext());
            }
          case 94: break;
          case 36: 
            { return new Symbol(sym.TEXTOA, yyline, yycolumn, yytext());
            }
          case 95: break;
          case 37: 
            { return new Symbol(sym.FINCJS, yyline, yycolumn, yytext());
            }
          case 96: break;
          case 38: 
            { return new Symbol(sym.SPINNER, yyline, yycolumn, yytext());
            }
          case 97: break;
          case 39: 
            { return new Symbol(sym.FINCCSS, yyline, yycolumn, yytext());
            }
          case 98: break;
          case 40: 
            { return new Symbol(sym.FINCAJA, yyline, yycolumn, yytext());
            }
          case 99: break;
          case 41: 
            { return new Symbol(sym.ALINEADO, yyline, yycolumn, yytext());
            }
          case 100: break;
          case 42: 
            { return new Symbol(sym.FINCHTML, yyline, yycolumn, yytext());
            }
          case 101: break;
          case 43: 
            { return new Symbol(sym.FINTEXTO, yyline, yycolumn, yytext());
            }
          case 102: break;
          case 44: 
            { return new Symbol(sym.FINTABLA, yyline, yycolumn, yytext());
            }
          case 103: break;
          case 45: 
            { return new Symbol(sym.FINFILT, yyline, yycolumn, yytext());
            }
          case 104: break;
          case 46: 
            { return new Symbol(sym.FINBOTON, yyline, yycolumn, yytext());
            }
          case 105: break;
          case 47: 
            { return new Symbol(sym.FINPANEL, yyline, yycolumn, yytext());
            }
          case 106: break;
          case 48: 
            { return new Symbol(sym.SALTOFIN, yyline, yycolumn, yytext());
            }
          case 107: break;
          case 49: 
            { return new Symbol(sym.CAJATEXTO, yyline, yycolumn, yytext());
            }
          case 108: break;
          case 50: 
            { return new Symbol(sym.FINCUERPO, yyline, yycolumn, yytext());
            }
          case 109: break;
          case 51: 
            { return new Symbol(sym.FINTITULO, yyline, yycolumn, yytext());
            }
          case 110: break;
          case 52: 
            { return new Symbol(sym.FINIMAGEN, yyline, yycolumn, yytext());
            }
          case 111: break;
          case 53: 
            { return new Symbol(sym.FINENLACE, yyline, yycolumn, yytext());
            }
          case 112: break;
          case 54: 
            { return new Symbol(sym.FINOPCION, yyline, yycolumn, yytext());
            }
          case 113: break;
          case 55: 
            { return new Symbol(sym.ENCABEZADO, yyline, yycolumn, yytext());
            }
          case 114: break;
          case 56: 
            { return new Symbol(sym.FINTEXTOA, yyline, yycolumn, yytext());
            }
          case 115: break;
          case 57: 
            { return new Symbol(sym.FINSPINNER, yyline, yycolumn, yytext());
            }
          case 116: break;
          case 58: 
            { return new Symbol(sym.FINCAJATEXTO, yyline, yycolumn, yytext());
            }
          case 117: break;
          case 59: 
            { return new Symbol(sym.FINENCABEZADO, yyline, yycolumn, yytext());
            }
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}