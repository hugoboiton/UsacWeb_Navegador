package Analizador.CHTML;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import EstucturasDatos.nodoerror;
//Scanner para CHTML
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
%class scannerCHTML
%public
%line
%char
%column
%full
%ignorecase

CHTML           = chtml
FINCHTML        = fin-chtml
ENCABEZADO      = encabezado
FINENCABEZADO   = fin-encabezado
CJS             = cjs
FINCJS          = fin-cjs
CCSS            = ccss
FINCCSS         = fin-CCSS
TITULO          = titulo
FINTITULO       = fin-titulo
CUERPO          = cuerpo
FINCUERPO       = fin-cuerpo
PANEL           = panel
FINPANEL        = fin-panel
IMAGEN          = imagen
FINIMAGEN       = fin-imagen
BOTON           = boton
FINBOTON        = fin-boton
ENLACE          = enlace
FINENLACE       = fin-enlace

TEXTO           = texto
FINTEXTO        = fin-texto
CAJATEXTO       = caja_texto
FINCAJATEXTO    = fin-caja_texto
TEXTOA          = texto_a
FINTEXTOA       = fin-texto_a

TABLA           = tabla
FINTABLA        = fin-tabla
FILT            = fil_t
FINFILT         = fin-fil_t
CB              = cb
FINCB           = fin-cb
CT              = ct
FINCT           = fin-ct

CAJA            = caja
FINCAJA         = fin-caja
OPCION          = opcion
FINOPCION       = fin-opcion
VALOR           = valor

SPINNER         = spinner
FINSPINER       = fin-spinner

SALTOFIN        = salto-fin

CLICK           = click
RUTA            = ruta

ID              = id
GRUPO           = grupo
ALTO            = alto
ANCHO           = ancho
ALINEADO        = alineado

ABRIR           = "<"
CERRAR          = ">"
PUNTOCOMA       = ";"
IGUAL           = "="
PARIZQ          = "("
PARDER          = ")"

//ENUMERO        = [0-9]+("."[0-9]+)?
ECADENA        = [\"][^\"]+[\"]
ETEXTO         = ([A-Z]|[a-z]|[0-9])([^/<])*   

COMENTARIO1     = [<][/][/][^\n]*
COMENTARIO2     = [<][/][/][-][^/]*[-][/][/][>]

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%
{CHTML}             { return new Symbol(sym.CHTML, yyline, yycolumn, yytext()); } 
{FINCHTML}          { return new Symbol(sym.FINCHTML, yyline, yycolumn, yytext()); }   
{ENCABEZADO}        { return new Symbol(sym.ENCABEZADO, yyline, yycolumn, yytext()); }  
{FINENCABEZADO}     { return new Symbol(sym.FINENCABEZADO, yyline, yycolumn, yytext()); }
{CJS}               { return new Symbol(sym.CJS, yyline, yycolumn, yytext()); }
{FINCJS}            { return new Symbol(sym.FINCJS, yyline, yycolumn, yytext()); }
{CCSS}              { return new Symbol(sym.CCSS, yyline, yycolumn, yytext()); }
{FINCCSS}           { return new Symbol(sym.FINCCSS, yyline, yycolumn, yytext()); }
{TITULO}            { return new Symbol(sym.TITULO, yyline, yycolumn, yytext()); }
{FINTITULO}         { return new Symbol(sym.FINTITULO, yyline, yycolumn, yytext()); }
{CUERPO}            { return new Symbol(sym.CUERPO, yyline, yycolumn, yytext()); }
{FINCUERPO}         { return new Symbol(sym.FINCUERPO, yyline, yycolumn, yytext()); }
{PANEL}             { return new Symbol(sym.PANEL, yyline, yycolumn, yytext()); }
{FINPANEL}          { return new Symbol(sym.FINPANEL, yyline, yycolumn, yytext()); }
{IMAGEN}            { return new Symbol(sym.IMAGEN, yyline, yycolumn, yytext()); }
{FINIMAGEN}         { return new Symbol(sym.FINIMAGEN, yyline, yycolumn, yytext()); }
{BOTON}             { return new Symbol(sym.BOTON, yyline, yycolumn, yytext()); }
{FINBOTON}          { return new Symbol(sym.FINBOTON, yyline, yycolumn, yytext()); }
{ENLACE}            { return new Symbol(sym.ENLACE, yyline, yycolumn, yytext()); }
{FINENLACE}         { return new Symbol(sym.FINENLACE, yyline, yycolumn, yytext()); }
    
{TEXTO}             { return new Symbol(sym.TEXTO, yyline, yycolumn, yytext()); }           
{FINTEXTO}          { return new Symbol(sym.FINTEXTO, yyline, yycolumn, yytext()); }
{CAJATEXTO}         { return new Symbol(sym.CAJATEXTO, yyline, yycolumn, yytext()); }
{FINCAJATEXTO}      { return new Symbol(sym.FINCAJATEXTO, yyline, yycolumn, yytext()); }
{TEXTOA}            { return new Symbol(sym.TEXTOA, yyline, yycolumn, yytext()); }
{FINTEXTOA}         { return new Symbol(sym.FINTEXTOA, yyline, yycolumn, yytext()); }

{TABLA}             { return new Symbol(sym.TABLA, yyline, yycolumn, yytext()); }
{FINTABLA}          { return new Symbol(sym.FINTABLA, yyline, yycolumn, yytext()); }
{FILT}              { return new Symbol(sym.FILT, yyline, yycolumn, yytext()); }
{FINFILT}           { return new Symbol(sym.FINFILT, yyline, yycolumn, yytext()); }
{CB}                { return new Symbol(sym.CB, yyline, yycolumn, yytext()); }
{FINCB}             { return new Symbol(sym.FINCB, yyline, yycolumn, yytext()); }
{CT}                { return new Symbol(sym.CT, yyline, yycolumn, yytext()); }
{FINCT}             { return new Symbol(sym.FINCT, yyline, yycolumn, yytext()); }

{CAJA}              { return new Symbol(sym.CAJA, yyline, yycolumn, yytext()); }
{FINCAJA}           { return new Symbol(sym.FINCAJA, yyline, yycolumn, yytext()); }
{OPCION}            { return new Symbol(sym.OPCION, yyline, yycolumn, yytext()); }
{FINOPCION}         { return new Symbol(sym.FINOPCION, yyline, yycolumn, yytext()); }
{VALOR}             { return new Symbol(sym.VALOR, yyline, yycolumn, yytext()); }

{SPINNER}           { return new Symbol(sym.SPINNER, yyline, yycolumn, yytext()); }
{FINSPINER}         { return new Symbol(sym.FINSPINNER, yyline, yycolumn, yytext()); }

{SALTOFIN}          { return new Symbol(sym.SALTOFIN, yyline, yycolumn, yytext()); }

{CLICK}             { return new Symbol(sym.CLICK, yyline, yycolumn, yytext()); }
{RUTA}              { return new Symbol(sym.RUTA, yyline, yycolumn, yytext()); }

{ID}                { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }
{GRUPO}             { return new Symbol(sym.GRUPO, yyline, yycolumn, yytext()); }
{ALTO}              { return new Symbol(sym.ALTO, yyline, yycolumn, yytext()); } 
{ANCHO}             { return new Symbol(sym.ANCHO, yyline, yycolumn, yytext()); }
{ALINEADO}          { return new Symbol(sym.ALINEADO, yyline, yycolumn, yytext()); }

{ABRIR}             { return new Symbol(sym.ABRIR, yyline, yycolumn, yytext()); }           
{CERRAR}            { return new Symbol(sym.CERRAR, yyline, yycolumn, yytext()); }
{PUNTOCOMA}         { return new Symbol(sym.PUNTOCOMA, yyline, yycolumn, yytext()); }
{IGUAL}             { return new Symbol(sym.IGUAL, yyline, yycolumn, yytext()); }
{PARIZQ}            { return new Symbol(sym.PARIZQ, yyline, yycolumn, yytext()); }
{PARDER}            { return new Symbol(sym.PARDER, yyline, yycolumn, yytext()); }

//{ENUMERO}           { return new Symbol(sym.ENUMERO, yyline, yycolumn, yytext()); }
{ECADENA}           { return new Symbol(sym.ECADENA, yyline, yycolumn, yytext()); }
{ETEXTO}            { return new Symbol(sym.ETEXTO, yyline, yycolumn, yytext()); }
            
{COMENTARIO1}   {/* */}
{COMENTARIO2}   {/* */}
{SPACE}         { /*Espacios en blanco, ignorados*/ }
{ENTER}         { /*Saltos de linea, ignorados*/}

. { agregarerror(yyline+1,yycolumn,"lexico","caracter irreconocible: "+yytext());}
