package Analizador.CCSSS;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import EstucturasDatos.nodoerror;
//Scanner para graphik
%%
%{
    //Código de usuario
    public String archivo="null";
    public  ArrayList<nodoerror> lexico= new ArrayList<nodoerror>();
    public void agregarerror(int linea,int columna,String tipo,String men)
    {
       nodoerror er= new nodoerror(linea, columna, tipo, men,archivo);
       lexico.add(er);
    }
     public  ArrayList<nodoerror> lex()
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




ID              = [A-Za-z][_0-9A-Za-z]*
TNUMERO        = [0-9]+("."[0-9]+)?
TCADENA         = [\"][^\"]+[\"]



COMENTARIO1     = [/][/][^\n]+
COMENTARIO2     = [#][/][^/]+[/][#]

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%

            
{COMENTARIO1}   {/* */}
{COMENTARIO2}   {/**/}
{SPACE}         { /*Espacios en blanco, ignorados*/ }
{ENTER}         { /*Saltos de linea, ignorados*/}

. { agregarerror(yyline+1,yycolumn,"lexico","caracter irreconocible: "+yytext());}