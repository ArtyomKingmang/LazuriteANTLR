grammar SimpleLanguage;

program : statement+ ;

statement : funcDeclaration
          | assignment
          | printStatement
          | whileStatement
          ;

funcDeclaration : 'func' IDENTIFIER '(' paramList? ')' block ;

paramList : IDENTIFIER (',' IDENTIFIER)* ;

assignment : IDENTIFIER '=' expression ';' ;

printStatement : 'print' '(' expression ')' ';' ;

whileStatement : 'while' '(' expression ')' block ;

block : '{' statement* '}' ;

expression : literal
           | IDENTIFIER
           | expression op=('*' | '/' | '-' | '+') expression
           | '(' expression ')'
           ;

literal : NUMBER
        | STRING
        ;


NUMBER : DIGIT+ ;
STRING : '"' ~["]* '"' ;
IDENTIFIER : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
fragment DIGIT : [0-9] ;
