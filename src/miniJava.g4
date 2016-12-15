grammar miniJava;

prog:	mainclass classdecl* EOF ;

mainclass:	'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '['']' ID ')' '{' statement '}' '}' ;

classdecl:	'class' ID '{' vardecl* methoddecl* '}'
         |	'class' ID 'extends' ID '{' vardecl* methoddecl* '}'
         ;

vardecl:	type ID ';' ;

methoddecl:	'public' type ID '(' formallist? ')' '{' vardecl* statement*  'return' exp ';' '}' ;

formallist:	type ID formalrest* ;

formalrest:	',' type ID ;

type:	'int' '[' ']'
    |	'boolean'
    |	'int'
    |	ID
    ;

statement:	'{' statement* '}'
         |	'if' '(' exp ')' statement 'else' statement
         |	'while' '(' exp ')' statement
         |	'System.out.println' '(' exp ')' ';'
         |	ID '=' exp ';'
         |	ID '[' exp ']' '=' exp ';'
         ;

exp:  exp ('*'|'/') exp
   |  exp ('+'|'-') exp
   |  exp ('&'|'|') exp
   |  exp ('&&'|'||') exp
   |  exp ('<'|'>'|'==') exp
   |  exp '[' exp ']'
   |  exp '.' 'length'
   |  exp '.' ID explist
   |  INT
   |  BOOLEAN
   |  ID
   |  'this'
   |  'new' 'int' '[' exp ']'
   |  'new' ID '(' ')'
   |  '!' exp
   |  '(' exp ')'
   ;

explist:  exp exprest* ;

exprest:  ',' exp ;

INT: [0-9]+ ;

BOOLEAN:   'true'
       |   'false'
       ;

ID: [a-zA-Z_][0-9a-zA-Z_]* ;

WS: [ \t\r\n]+ -> skip ;
