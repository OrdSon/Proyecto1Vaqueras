package gt.edu.usac.compiler;
import java_cup.runtime.*;

%%
%public
%class MyLexer
%cup
%line
%column
%state STRING
%state COMMENT
%state LINECOMMENT

digit = [0-9]
letter = [a-zA-Z]
cualquierCaracter = [^\r\n]
finDeLinea = \r|\n|\r\n
whitespace = {finDeLinea}|[ \t\f]
identifier = {letter}+({letter}|{digit}|"-"|"_")*
INTEGER = "int"
LONG = "long" 
FLOAT = "float"
DOUBLE = "double"
DECIMAL = "decimal"
STRING = "string"
CHAR = "char"
BOOL = "bool"
VOID = "void"
ASIGN = "="
FOR = "for"

%{
    StringBuffer string = new StringBuffer();
    
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);    
    }
    private Symbol symbol(int type, Object value){
        return new Symbol (type,value);    
    }
%}

%eofval{
    return symbol(MyParserSym.EOF);
%eofval}

%%
<YYINITIAL>{

\"              {string.setLength(0);yybegin(STRING);}
"/*"            {yybegin(COMMENT);}
"//"            {yybegin(LINECOMMENT);}
}

<STRING> {
      \"                             { yybegin(YYINITIAL);
                                       return new Symbol(MyParserSym.stringValue,string.toString());}
      [^\n\r\"\\]+                   { string.append(yytext()); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }
      \\f                            { string.append('\f'); }
      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
      \\0                            {yybegin(YYINITIAL);
                                        return new Symbol(MyParserSym.ERROR,"Contiene caracter nulo");}//ERROR de caracter nulo
      
      {finDeLinea}                           {yybegin(YYINITIAL);
                                       return new Symbol(MyParserSym.ERROR,"UNTERMINATED STRING CONSTANT");}
}

<COMMENT>{
    [^*] ~"*/"  {/*NADA DE NADA*/}
    "*"+ "*/"   {/*NADA DE NADA*/}
}

<LINECOMMENT>{
{cualquierCaracter}* {finDeLinea}?  {/*Absolutamente nada*/}
}

{digit}+"."{digit}+  {return symbol(MyParserSym.doubleValue, Double.valueOf(yytext()));}
{digit}+  {return symbol(MyParserSym.intValue, Double.valueOf(yytext()));}
"."   {return  symbol(MyParserSym.DOT,yytext());}
"{"   {return  symbol(MyParserSym.LBRACE,yytext());}
"}"   {return symbol(MyParserSym.RBRACE,yytext());}
","   {return symbol(MyParserSym.COMMA,yytext());}
"("         {return symbol(MyParserSym.LPAREN,yytext());}
")"         {return symbol(MyParserSym.RPAREN,yytext());}
"+"         {return symbol(MyParserSym.PLUS,yytext());}
"*"         {return symbol(MyParserSym.TIMES,yytext());}
"%"         {return symbol(MyParserSym.MOD,yytext());}
"/"         {return symbol(MyParserSym.DIV,yytext());}
":"     {return symbol(MyParserSym.COLON,yytext());}
"-"         {return symbol(MyParserSym.MINUS,yytext());}
";"   {return symbol(MyParserSym.SEMI,yytext());}
"<" {return symbol(MyParserSym.LT,yytext());}
">" {return symbol(MyParserSym.GT,yytext());}
"<=" {return symbol(MyParserSym.LET,yytext());}
">=" {return symbol(MyParserSym.LGT,yytext());}
"&" {return symbol(MyParserSym.AND,yytext());}
"|" {return symbol(MyParserSym.OR,yytext());}
"!" {return symbol(MyParserSym.NOT,yytext());}
"int"         {return symbol(MyParserSym.INT,yytext());}
"while"     {return symbol(MyParserSym.WHILE,yytext());}
"true"      {return symbol(MyParserSym.TRUE,yytext());}
"false"     {return symbol(MyParserSym.FALSE,yytext());}
"do"     {return symbol(MyParserSym.DO,yytext());}
"if"     {return symbol(MyParserSym.IF,yytext());}
"else"     {return symbol(MyParserSym.ELSE,yytext());}
"continue"     {return symbol(MyParserSym.CONTINUE,yytext());}
"break"     {return symbol(MyParserSym.BREAK,yytext());}
"return"     {return symbol(MyParserSym.RETURN,yytext());}
"main"  {return symbol(MyParserSym.MAIN,yytext());}
"switch" {return symbol(MyParserSym.SWITCH,yytext());}
"default" {return symbol(MyParserSym.DEFAULT,yytext());}
"case" {return symbol(MyParserSym.CASE,yytext());}
"Console" {return symbol(MyParserSym.CONSOLE,yytext());}
"Write" {return symbol(MyParserSym.WRITE,yytext());}

{FOR} {return symbol(MyParserSym.FOR,yytext());}
{ASIGN} {return symbol(MyParserSym.ASIGN,yytext());}
{INTEGER} {return  symbol(MyParserSym.INT,yytext());}
{LONG} {return symbol (MyParserSym.LONG,yytext());}
{FLOAT} {return symbol (MyParserSym.FLOAT,yytext());}
{DOUBLE} {return symbol (MyParserSym.DOUBLE,yytext());}
{DECIMAL} {return symbol (MyParserSym.DECIMAL,yytext());}
{STRING} {return symbol (MyParserSym.STRING,yytext());}
{CHAR} {return symbol (MyParserSym.CHAR,yytext());}
{BOOL} {return symbol (MyParserSym.BOOL,yytext());}
{VOID} {return  symbol(MyParserSym.VOID,yytext());}

"\'"{letter}"\'" {return symbol(MyParserSym.charValue,yytext());}
{identifier} {return symbol (MyParserSym.identifier,yytext());}

{whitespace}+ {/*nadita*/}
[^]         {throw new Error("cadena ilegal::= "+yytext());}