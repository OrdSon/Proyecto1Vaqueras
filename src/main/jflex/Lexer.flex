package gt.edu.usac.compiler;

%%
%{
    StringBuilder string = new StringBuilder();
%}

%public
%class IdLexer
%type Token
%state STRING
%state COMMENT
%state LINECOMMENT

finDeLinea = \r|\n|\r\n
cualquierCaracter = [^\r\n]
whitespace = {finDeLinea}|[ \t\f]
comentarioTradicional  = "/*" [^*] ~"*/" | "/*" "*"+ "*/"
comentarioDeLinea     = "//" {cualquierCaracter}* {finDeLinea}?
comentario = {comentarioTradicional} | {comentarioDeLinea}
letter = [a-zA-Z]
digit = [0-9]
identifier = {letter}+({letter}|{digit}|"-"|"_")*

INT = "int"
LONG = "long" 
FLOAT = "float"
DOUBLE = "double"
DECIMAL = "decimal"
STRING = "string"
CHAR = "char"
BOOL = "bool"
PLUS = "+"
MINUS = "-"
TIMES = "*" 
DIV = "/"
ASIGN = "="
EQUAL = "=="
NOTEQUAL = "!=" 
LT = "<"
GT = ">"
LET = "<="
LGT = ">="
AND = "&&"
OR = "||"
WHILE = "while"
DO = "Do"
FOR = "for"
FOREACH = "foreach"
CONTINUE = "continue"
BREAK = "Break"
IN = "In"
OBJECT = "object"
CLASS = "class"
SWITCH = "switch"
CASE = "case"
DEFAULT = "default"
TRY = "try"
CATCH = "catch"
FINALLY = "Finally"
PRIVATE = "private"
NAMESPACE = "namespace"
PUBLIC = "public"
PROTECTED = "Protected"
RETURN = "return"
NULL = "null"
IF = "if"
ELSE = "else"
TRUE = "true"
FALSE = "false"
GET = "get"
VOID = "void"
TYPEOF = "typeof"
INTERFACE = "interface"
OVERRIDE = "override"
STRUCT = "struct"
THROW = "throw" 
REF = "ref"
ENUM = "enum"
CONST = "const"
STATIC = "static"
THIS = "this"
IS = "is"
NEW = "new"
USING = "using"

%eofval{
    return new Token (TokenConstants.EOF,null);
%eofval}
%%

<YYINITIAL>{

\"              {string.setLength(0);yybegin(STRING);}
"/*"            {yybegin(COMMENT);}
"//"            {yybegin(LINECOMMENT);}
}

<STRING> {
      \"                             { yybegin(YYINITIAL);
                                       return new Token(TokenConstants.stringValue, yytext());}
      [^\n\r\"\\]+                   { string.append(yytext()); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }
      \\f                            { string.append('\f'); }
      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
      \\0                            {yybegin(YYINITIAL);
                                        return new Token(TokenConstants.ERROR,"Contiene caracter nulo");}//ERROR de caracter nulo
      
      {finDeLinea}                           {yybegin(YYINITIAL);
                                       return new Token(TokenConstants.ERROR,"UNTERMINATED STRING CONSTANT");}
}

<COMMENT>{
    [^*] ~"*/"  {/*NADA DE NADA*/}
    "*"+ "*/"   {/*NADA DE NADA*/}
}

<LINECOMMENT>{
{cualquierCaracter}* {finDeLinea}?  {/*Absolutamente nada*/}
}

{INT} {return new Token(TokenConstants.INT,yytext());}
{LONG} {return new Token(TokenConstants.LONG,yytext());}
{FLOAT} {return new Token(TokenConstants.FLOAT,yytext());}
{DOUBLE} {return new Token(TokenConstants.DOUBLE,yytext());}
{DECIMAL} {return new Token(TokenConstants.DECIMAL,yytext());}
{STRING} {return new Token(TokenConstants.STRING,yytext());}
{CHAR} {return new Token(TokenConstants.CHAR,yytext());}
{BOOL} {return new Token(TokenConstants.BOOL,yytext());}
{PLUS} {return new Token(TokenConstants.PLUS,yytext());}
{MINUS} {return new Token(TokenConstants.MINUS,yytext());}
{TIMES} {return new Token(TokenConstants.TIMES,yytext());}
{DIV} {return new Token(TokenConstants.DIV,yytext());}
{ASIGN} {return new Token(TokenConstants.ASIGN,yytext());}
{EQUAL} {return new Token(TokenConstants.EQUAL,yytext());}
{NOTEQUAL} {return new Token(TokenConstants.NOTEQUAL,yytext());}
{LT} {return new Token(TokenConstants.LT,yytext());}
{GT} {return new Token(TokenConstants.GT,yytext());}
{LET} {return new Token(TokenConstants.LET,yytext());}
{LGT} {return new Token(TokenConstants.LGT,yytext());}
{AND} {return new Token(TokenConstants.AND,yytext());}
{OR} {return new Token(TokenConstants.OR,yytext());}
{WHILE} {return new Token(TokenConstants.WHILE,yytext());}
{DO} {return new Token(TokenConstants.DO,yytext());}
{FOR} {return new Token(TokenConstants.FOR,yytext());}
{FOREACH} {return new Token(TokenConstants.FOREACH,yytext());}
{CONTINUE} {return new Token(TokenConstants.CONTINUE,yytext());}
{BREAK} {return new Token(TokenConstants.BREAK,yytext());}
{IN} {return new Token(TokenConstants.IN,yytext());}
{OBJECT} {return new Token(TokenConstants.OBJECT,yytext());}
{CLASS} {return new Token(TokenConstants.CLASS,yytext());}
{SWITCH} {return new Token(TokenConstants.SWITCH,yytext());}
{CASE} {return new Token(TokenConstants.CASE,yytext());}
{DEFAULT} {return new Token(TokenConstants.DEFAULT,yytext());}
{TRY} {return new Token(TokenConstants.TRY,yytext());}
{CATCH} {return new Token(TokenConstants.CATCH,yytext());}
{FINALLY} {return new Token(TokenConstants.FINALLY,yytext());}
{PRIVATE} {return new Token(TokenConstants.PRIVATE,yytext());}
{NAMESPACE} {return new Token(TokenConstants.NAMESPACE,yytext());}
{PUBLIC} {return new Token(TokenConstants.PUBLIC,yytext());}
{PROTECTED} {return new Token(TokenConstants.PROTECTED,yytext());}
{RETURN} {return new Token(TokenConstants.RETURN,yytext());}
{NULL} {return new Token(TokenConstants.NULL,yytext());}
{IF} {return new Token(TokenConstants.IF,yytext());}
{ELSE} {return new Token(TokenConstants.ELSE,yytext());}
{TRUE} {return new Token(TokenConstants.TRUE,yytext());}
{FALSE} {return new Token(TokenConstants.FALSE,yytext());}
{GET} {return new Token(TokenConstants.GET,yytext());}
{VOID} {return new Token(TokenConstants.VOID,yytext());}
{TYPEOF} {return new Token(TokenConstants.TYPEOF,yytext());}
{INTERFACE} {return new Token(TokenConstants.INTERFACE,yytext());}
{OVERRIDE} {return new Token(TokenConstants.OVERRIDE,yytext());}
{STRUCT} {return new Token(TokenConstants.STRUCT,yytext());}
{THROW} {return new Token(TokenConstants.THROW,yytext());}
{REF} {return new Token(TokenConstants.REF,yytext());}
{ENUM} {return new Token(TokenConstants.ENUM,yytext());}
{CONST} {return new Token(TokenConstants.CONST,yytext());}
{STATIC} {return new Token(TokenConstants.STATIC,yytext());}
{THIS} {return new Token(TokenConstants.THIS,yytext());}
{IS} {return new Token(TokenConstants.IS,yytext());}
{NEW} {return new Token(TokenConstants.NEW,yytext());}
{USING} {return new Token(TokenConstants.USING,yytext());}
{digit}+"."{digit}+ {return new Token(TokenConstants.doubleValue,yytext());}
{digit}+ {return new Token(TokenConstants.intValue,yytext());}
{identifier} {return new Token(TokenConstants.identifier,yytext());}
"\'"{letter}"\'" {return new Token(TokenConstants.charValue,yytext());}
{whitespace} {/*Nothing at all*/}
{comentario} {/*Nothing at all*/}
[^]         {return new Token(TokenConstants.ERROR, yytext());}