package Analizador.CCSS;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import EstructurasDatos.NodoError;
//Scanner para CHTML
%%
%{
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

%}

%cup
%class scannerCCSS
%public
%line
%char
%column
%full
%ignorecase

ALINEADO    = Alineado
IZQUIERDA   = Izquierda
DERECHA     = Derecha
CENTRADO    = Centrado
JUSTIFICADO = Justificado
TEXTO       = Texto
FORMATO     = Formato
NEGRILLA    = Negrilla
CURSIVA     = Cursiva
MAYUSC      = (Mayuscula|Mayúculas)
MININ       = (Minisculas|Miniscúlas)
CAPITALT    = Capital-T
LETRA       = Letra
TAMTEX      = Tamtex
FONDOELEMTO = Fonodoelemento
AUTOREDIMEN = AutoRedimension
VERTICAL    = Vertical    
HORIZONTAL  = Horizontal
VISIBLE     = Visible
BORDE       = Borde
OPAQUE     = Opaque
COLORTEXT   = Colortext
GRUPO       = Grupo
ID          = ID

CORCHEIZQ   = "["
CORCHEDER   = "]"
PARIZQ      = "("
PARDER      = ")"
PUNTOCOMA   = ";"
DOSPUNTOS   = ":"
IGUAL       = "="
MAS         = "+"
MENOS       = "-"
POR         = "*"
DIVI        = "/"
COMA        = ","


EVERDADERO = (true|verdadero)
EFALSO     = (false|falso) 
EID        = [A-Za-z][_0-9A-Za-z]*
ENUMERO    = [0-9]+("."[0-9]+)?
ECADENA    = [\"][^\"]+[\"]



COMENTARIO1     = [/][/][^\n]+
COMENTARIO2     = [/][*][^*]+[*][/]

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%
{ALINEADO}      { return new Symbol(sym.ALINEADO, yyline, yycolumn, yytext()); } 
{IZQUIERDA}     { return new Symbol(sym.IZQUIERDA, yyline, yycolumn, yytext()); }  
{DERECHA}       { return new Symbol(sym.DERECHA, yyline, yycolumn, yytext()); }  
{CENTRADO}      { return new Symbol(sym.CENTRADO, yyline, yycolumn, yytext()); }  
{JUSTIFICADO}   { return new Symbol(sym.JUSTIFICADO, yyline, yycolumn, yytext()); }   
{TEXTO}         { return new Symbol(sym.TEXTO, yyline, yycolumn, yytext()); }   
{FORMATO}       { return new Symbol(sym.FORMATO, yyline, yycolumn, yytext()); }  
{NEGRILLA}      { return new Symbol(sym.NEGRILLA, yyline, yycolumn, yytext()); }  
{CURSIVA}       { return new Symbol(sym.CURSIVA, yyline, yycolumn, yytext()); }  
{MAYUSC}        { return new Symbol(sym.MAYUSC, yyline, yycolumn, yytext()); }  
{MININ}         { return new Symbol(sym.MININ, yyline, yycolumn, yytext()); }  
{CAPITALT}      { return new Symbol(sym.CAPITALT, yyline, yycolumn, yytext()); }  
{LETRA}         { return new Symbol(sym.LETRA, yyline, yycolumn, yytext()); }  
{TAMTEX}        { return new Symbol(sym.TAMTEX, yyline, yycolumn, yytext()); }  
{FONDOELEMTO}   { return new Symbol(sym.FONDOELEMTO, yyline, yycolumn, yytext()); }  
{AUTOREDIMEN}   { return new Symbol(sym.AUTOREDIMEN, yyline, yycolumn, yytext()); }  
{VERTICAL}      { return new Symbol(sym.VERTICAL, yyline, yycolumn, yytext()); }  
{HORIZONTAL}    { return new Symbol(sym.HORIZONTAL, yyline, yycolumn, yytext()); }  
{VISIBLE}       { return new Symbol(sym.VISIBLE, yyline, yycolumn, yytext()); }  
{BORDE}         { return new Symbol(sym.BORDE, yyline, yycolumn, yytext()); }  
{OPAQUE}        { return new Symbol(sym.OPAQUE, yyline, yycolumn, yytext()); }  
{COLORTEXT}     { return new Symbol(sym.COLORTEXT, yyline, yycolumn, yytext()); }  
{GRUPO}         { return new Symbol(sym.GRUPO, yyline, yycolumn, yytext()); }  
{ID}            { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }  

{CORCHEIZQ}     { return new Symbol(sym.CORCHEIZQ, yyline, yycolumn, yytext()); }  
{CORCHEDER}     { return new Symbol(sym.CORCHEDER, yyline, yycolumn, yytext()); }  
{PARIZQ}        { return new Symbol(sym.PARIZQ, yyline, yycolumn, yytext()); }  
{PARDER}        { return new Symbol(sym.PARDER, yyline, yycolumn, yytext()); }  
{PUNTOCOMA}     { return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext()); }  
{DOSPUNTOS}     { return new Symbol(sym.DOSPUNTOS, yyline, yycolumn, yytext()); }  
{IGUAL}         { return new Symbol(sym.IGUAL, yyline, yycolumn, yytext()); }  
{MAS}           { return new Symbol(sym.MAS, yyline, yycolumn, yytext()); }  
{MENOS}         { return new Symbol(sym.MENOS, yyline, yycolumn, yytext()); }  
{POR}           { return new Symbol(sym.POR, yyline, yycolumn, yytext()); }  
{DIVI}          { return new Symbol(sym.DIVI, yyline, yycolumn, yytext()); }  
{COMA}          { return new Symbol(sym.COMA, yyline, yycolumn, yytext()); }  

{EVERDADERO}    { return new Symbol(sym.EVERDADERO, yyline, yycolumn, yytext()); }  
{EFALSO}        { return new Symbol(sym.EFALSO, yyline, yycolumn, yytext()); }  
{EID}           { return new Symbol(sym.EID, yyline, yycolumn, yytext()); }  
{ENUMERO}       { return new Symbol(sym.ENUMERO, yyline, yycolumn, yytext()); }  
{ECADENA}       { return new Symbol(sym.ECADENA, yyline, yycolumn, yytext()); }  
            
{COMENTARIO1}   {/* */}
{COMENTARIO2}   {/* */}
{SPACE}         { /*Espacios en blanco, ignorados*/ }
{ENTER}         { /*Saltos de linea, ignorados*/}

. { agregarerror(yyline+1,yycolumn,"lexico","caracter irreconocible: "+yytext());}