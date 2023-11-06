grammar SimpleLanguage;

program : statement+ ;

statement : funcDeclaration
          | assignment
          | printStatement
          | whileStatement
          | ifStatement
          | forStatement
          | switchStatement
          | inputStatement
          | conversionStatement
          ;

funcDeclaration : 'func' IDENTIFIER '(' paramList? ')' block ;

paramList : IDENTIFIER (',' IDENTIFIER)* ;

assignment : IDENTIFIER '=' expression ;

printStatement : 'print' '(' expression ')' ;

whileStatement : 'while' '(' expression ')' block ;

ifStatement : 'if' '(' expression ')' block ( 'else' block )?;

forStatement: 'for' '(' assignment ';' expression ';' assignment ')' block ;

switchStatement : 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}' ;

caseStatement : 'case' expression ':' block ;

defaultStatement : 'default' ':' block ;

inputStatement : 'input' '(' ')' ;

conversionStatement : type '(' expression ')' ;

block : '{' statement* '}' ;

expression : literal
           | expression op=('*' | '/') expression
           | expression op=('+' | '-') expression
           | '(' expression ')'
           | IDENTIFIER
           ;

literal : NUMBER
        | STRING
        ;

type : 'int' | 'float' | 'string' ;

NUMBER : DIGIT+ ;
STRING : '"' ~["]* '"' ;
IDENTIFIER : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
fragment DIGIT : [0-9] ;