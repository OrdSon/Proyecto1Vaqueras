package gt.edu.usac.compiler;

%%

%{
    static int MAX_STR_CONST = 1025;
    StringBuffer stringBuffer = new StringBuffer();
    StringBuffer string = new StringBuffer();
    private int currLine = 1;
    
    int getCurrLine(){
        return currLine;
    }


%}

%init{

%init}

finDeLinea = \r|\n|\r\n
cualquierCaracter = [^\r\n]
whitespace = {finDeLinea}|[ \t\f]
comentarioTradicional  = "/*" [^*] ~"*/" | "/*" "*"+ "*/"
comentarioDeLinea     = "//" {cualquierCaracter}* {finDeLinea}?
comentario = {comentarioTradicional} | {comentarioDeLinea}
letter = [a-zA-Z]
digit = [0-9]
identifier = {letter}+({letter}|{d}|"-"|"_")*

int = "int"
long = "long" 
float = "float"
double = "double"
decimal = "decimal"
string = "string"
char = "char"
bool = "bool"
plus = "+"
minus = "-"
times = "*" 
div = "/"
asign = "="
equal = "=="
notEqual = "!=" 
lt = "<"
gt = ">"
let = "<="
lgt = ">="
and = "&&"
or = "||"
while = "while"
Do = "Do"
for = "for"
foreach = "foreach"
continue = "continue"
Break = "Break"
In = "In"
object = "object"
class = "class"
switch = "switch"
case = "case"
default = "default"
try = "try"
catch = "catch"
Finally = "Finally"
private = "private"
namespace = "namespace"
public = "public"
Protected = "Protected"
return = "return"
null = "null"
if = "if"
else = "else"
true = "true"
false = "false"
get = "get"
void = "void"
typeof = "typeof"
interface = "interface"
override = "override"
struct = "struct"
throw = "throw" 
ref = "ref"
enum = "enum"
const = "const"
static = "static"
this = "this"
is = "is"
new = "new"

%state STRING
%state COMMENT
%state LINECOMMENT
%class Lexer
//%cup
%public
%line
%column
%standalone

%%

<YYINITIAL>{

\"              {string.setLength(0);yybegin(STRING);}
"(*"            {yybegin(COMMENT);}
"--"            {yybegin(LINECOMMENT);}
}

<STRING> {
      \"                             { yybegin(YYINITIAL);
                                       return 1;}
      [^\n\r\"\\]+                   { string.append(yytext()); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }
      \\f                            { string.append('\f'); }
      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
      \\0                            {yybegin(YYINITIAL);
                                        System.out.println("caracter nulo");}//ERROR de caracter nulo
      /*<<EOF>>                        {yybegin(YYINITIAL);
                                        return new Symbol(2,"EOF in String constant");}*/
      {finDeLinea}                           {yybegin(YYINITIAL);
                                        System.out.println("fin cadena");;}
}

<COMMENT>{
    [^*] ~"*)"  {/*NADA DE NADA*/}
    "*"+ "*)"   {/*NADA DE NADA*/}
    /*<<EOF>>    {yybegin(YYINITIAL);return new Symbol(0,"EOF in comment");}*/
}

<LINECOMMENT>{
{cualquierCaracter}* {finDeLinea}?  {/*Absolutamente nada*/}
/*<<EOF>>    {yybegin(YYINITIAL);return new Symbol(0,"EOF in comment");}*/
}

{int} = {System.out.println("int");}
{long} = {System.out.println("long");} 
{float} = {System.out.println("float");}
{double} = {System.out.println("double");}
{decimal} = {System.out.println("decimal");}
{string} = {System.out.println("string");}
{char} = {System.out.println("char");}
{bool} = {System.out.println("bool");}
{plus} = {System.out.println("+");}
{minus} = {System.out.println("-");}
{times} = {System.out.println("*");}
{div}= {System.out.println("/");}
{asign} = {System.out.println("=");}
{equal} = {System.out.println("==");}
{notEqual} = {System.out.println("!=");}
{lt} = {System.out.println("<");}
{gt} = {System.out.println(">");}
{let} = {System.out.println("<=");}
{lgt} = {System.out.println(">=");}
{and} = {System.out.println("&&");}
{or} = {System.out.println("||");}
{while} = {System.out.println("while");}
{Do} = {System.out.println("Do");}
{for} = {System.out.println("for");}
{foreach} = {System.out.println("foreach");}
{continue} = {System.out.println("continue");}
{Break} = {System.out.println("Break");}
{In} = {System.out.println("In");}
{object} = {System.out.println("object");}
{class} = {System.out.println("class");}
{switch} = {System.out.println("switch");}
{case} = {System.out.println("case");}
{default} = {System.out.println("default");}
{try} = {System.out.println("try");}
{catch} = {System.out.println("catch");}
{Finally} = {System.out.println("Finally");}
{private} = {System.out.println("private");}
{namespace} = {System.out.println("namespace");}
{public} = {System.out.println("public");}
{Protected} = {System.out.println("Protected");}
{return} = {System.out.println("return");}
{null} = {System.out.println("null");}
{if} = {System.out.println("if");}
{else} = {System.out.println("else");}
{true} = {System.out.println("true");}
{false}= {System.out.println("false");}
{get} = {System.out.println("get");}
{void} = {System.out.println("void");}
{typeof} = {System.out.println("typeof");}
{interface} = {System.out.println("interface");}
{override} = {System.out.println("override");}
{struct} = {System.out.println("struct");}
{throw} = {System.out.println("throw");}
{ref}= {System.out.println("ref");}
{enum} = {System.out.println("enum");}
{const} = {System.out.println("const");}
{static} = {System.out.println("static");}
{this} = {System.out.println("this");}
{is} = {System.out.println("is");}
{new} = {System.out.println("new");}
{comentario}    {/*Inacción*/}
{whitespace}    {/*Inacción*/}
[^]             {System.out.println("error");}