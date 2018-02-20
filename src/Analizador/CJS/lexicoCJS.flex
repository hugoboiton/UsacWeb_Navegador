package Analizador.CJS;

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
%class scannerCJS
%public
%line
%char
%column
%full
%ignorecase

DOSPUNTOS   = ":"
PUNTOCOMA   = ";"
COMA        = ","
PARIZQ      = "("
PARDER      = ")"
LLAVEIZQ    = "{"
LLAVEDER    = "}"
PUNTO       = "."

MAS         = "+"
MENOS       = "-"
DIVI        = "/"
POR         = "*"
MOD         = "%"
POT         = "^"
AUMENTO     = "++"
DECREMENTO  = "--"

IGUALIGUAL  = "=="
DIFERENTE   = "!="
MENOR       = "<"
MAYOR       = ">"
MENORIGUAL  = "<="
MAYOTIGUAL  = ">="

AND         = "&&"
OR          = "||"
NOT         = "!"

EVERDARERO   = 'true'
EFALSO       = 'false'

DIMV        = Dimv
ATEXTO      = aTexto
CONTEO      = conteo
SI          = Si 
SINO        = Sino
SELECCIONA  = Selecciona
CASO        = Caso
DEFECTO     = Defecto
PARA        = Para
MIENTRAS    = Mientras
DETENER     = Detener
IMPRIMIR    = Imprimir
FUNCION     = Funcion
RETORNAR    = Retornar
MENSAJE     = Mensaje
DOCUMETO    = Documento
OBSERVADOR  = Observador
OBTENER     = Obtener
SETELEMENTO = SetElemento


EID         = [A-Za-z][_0-9A-Za-z]*
ENUMERO     = [0-9]+("."[0-9]+)?
ECADENA     = [\"][^\"]+[\"]
EDATE       = ['][0-3][0-9][/][0-1][0-9][/][0-9][0-9][0-9][0-9][']
EDATETIME   = ['][0-3][0-9][/][0-1][0-9][/][0-9][0-9][0-9][0-9][ ][0-2][0-9][:][0-5][0-9][:][0-5][0-9][']

/*COMENTARIO1     = ['][^\n]+
COMENTARIO2     = ['][/][^/]+[/][']*/

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%state ComentarioUnaLinea
%state ComentarioMultiLinea

%%
<YYINITIAL>{

    {DOSPUNTOS}     { return new Symbol(sym.DOSPUNTOS, yyline, yycolumn, yytext()); }   
    {PUNTOCOMA}     { return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext()); } 
    {COMA}          { return new Symbol(sym.COMA, yyline, yycolumn, yytext()); } 
    {PARIZQ}        { return new Symbol(sym.PARIZQ, yyline, yycolumn, yytext()); } 
    {PARDER}        { return new Symbol(sym.PARDER, yyline, yycolumn, yytext()); } 
    {LLAVEIZQ}      { return new Symbol(sym.LLAVEIZQ, yyline, yycolumn, yytext()); } 
    {LLAVEDER}      { return new Symbol(sym.LLAVEDER, yyline, yycolumn, yytext()); }  
    {PUNTO}         { return new Symbol(sym.PUNTO, yyline, yycolumn, yytext()); } 
    

    {MAS}           { return new Symbol(sym.MAS, yyline, yycolumn, yytext()); } 
    {MENOS}         { return new Symbol(sym.MENOS, yyline, yycolumn, yytext()); } 
    {DIVI}          { return new Symbol(sym.DIVI, yyline, yycolumn, yytext()); } 
    {POR}           { return new Symbol(sym.POR, yyline, yycolumn, yytext()); } 
    {MOD}           { return new Symbol(sym.MOD, yyline, yycolumn, yytext()); } 
    {POT}           { return new Symbol(sym.POT, yyline, yycolumn, yytext()); }
    {AUMENTO}       { return new Symbol(sym.AUMENTO, yyline, yycolumn, yytext()); }  
    {DECREMENTO}    { return new Symbol(sym.DECREMENTO, yyline, yycolumn, yytext()); } 

    {IGUALIGUAL}    { return new Symbol(sym.IGUALIGUAL, yyline, yycolumn, yytext()); }  
    {DIFERENTE}     { return new Symbol(sym.DIFERENTE, yyline, yycolumn, yytext()); } 
    {MENOR}         { return new Symbol(sym.MENOR, yyline, yycolumn, yytext()); } 
    {MAYOR}         { return new Symbol(sym.MAYOR, yyline, yycolumn, yytext()); } 
    {MENORIGUAL}    { return new Symbol(sym.MENORIGUAL, yyline, yycolumn, yytext()); }  
    {MAYOTIGUAL}    { return new Symbol(sym.MAYOTIGUAL, yyline, yycolumn, yytext()); } 

    {AND}           { return new Symbol(sym.AND, yyline, yycolumn, yytext()); } 
    {OR}            { return new Symbol(sym.OR, yyline, yycolumn, yytext()); } 
    {NOT}           { return new Symbol(sym.NOT, yyline, yycolumn, yytext()); } 
    
    {DIMV}          { return new Symbol(sym.DIMV, yyline, yycolumn, yytext()); } 
    {ATEXTO}        { return new Symbol(sym.ATEXTO, yyline, yycolumn, yytext()); } 
    {CONTEO}        { return new Symbol(sym.CONTEO, yyline, yycolumn, yytext()); } 
    {SI}            { return new Symbol(sym.SI, yyline, yycolumn, yytext()); } 
    {SINO}          { return new Symbol(sym.SINO, yyline, yycolumn, yytext()); } 
    {SELECCIONA}    { return new Symbol(sym.SELECCIONA, yyline, yycolumn, yytext()); } 
    {CASO}          { return new Symbol(sym.CASO, yyline, yycolumn, yytext()); } 
    {DEFECTO}       { return new Symbol(sym.DEFECTO, yyline, yycolumn, yytext()); } 
    {PARA}          { return new Symbol(sym.PARA, yyline, yycolumn, yytext()); }    
    {MIENTRAS}      { return new Symbol(sym.MIENTRAS, yyline, yycolumn, yytext()); } 
    {DETENER}       { return new Symbol(sym.DETENER, yyline, yycolumn, yytext()); } 
    {IMPRIMIR}      { return new Symbol(sym.IMPRIMIR, yyline, yycolumn, yytext()); } 
    {FUNCION}       { return new Symbol(sym.FUNCION, yyline, yycolumn, yytext()); } 
    {RETORNAR}      { return new Symbol(sym.RETORNAR, yyline, yycolumn, yytext()); } 
    {MENSAJE}       { return new Symbol(sym.MENSAJE, yyline, yycolumn, yytext()); } 
    {DOCUMETO}      { return new Symbol(sym.DOCUMETO, yyline, yycolumn, yytext()); } 
    {OBSERVADOR}    { return new Symbol(sym.OBSERVADOR, yyline, yycolumn, yytext()); } 
    {OBTENER}       { return new Symbol(sym.OBTENER, yyline, yycolumn, yytext()); } 
    {SETELEMENTO}   { return new Symbol(sym.SETELEMENTO, yyline, yycolumn, yytext()); } 
    {EVERDARERO}    { return new Symbol(sym.EVERDARERO, yyline, yycolumn, yytext()); } 
    {EFALSO}        { return new Symbol(sym.EFALSO, yyline, yycolumn, yytext()); } 
    {EID}           { return new Symbol(sym.EID, yyline, yycolumn, yytext()); }          
    
    {ENUMERO}       { return new Symbol(sym.ENUMERO, yyline, yycolumn, yytext()); } 
    {ECADENA}       { return new Symbol(sym.ECADENA, yyline, yycolumn, yytext()); } 
    {EDATE}         { return new Symbol(sym.EDATE, yyline, yycolumn, yytext()); } 
    {EDATETIME}     { return new Symbol(sym.EDATETIME, yyline, yycolumn, yytext()); } 
     
    "'"             {yybegin(ComentarioUnaLinea);}   
    "'/"            {yybegin(ComentarioMultiLinea);}
}
<ComentarioUnaLinea>
{
    ([^\n]+) {System.out.println("comentario 1"+yytext());}
    "\n"     {yybegin(YYINITIAL);}   

}
<ComentarioMultiLinea>
{
 
   ([^/]+)   {/**/System.out.println("comentario 2"+yytext());}
   "/'"      {yybegin(YYINITIAL);}    
}           

{SPACE}         { /*Espacios en blanco, ignorados*/ }
{ENTER}         { /*Saltos de linea, ignorados*/}

. { agregarerror(yyline+1,yycolumn,"lexico","caracter irreconocible: "+yytext());}
