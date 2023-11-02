grammar SimpleLanguage;

program : statement+;

statement : funcDeclaration
          | assigment
          | printStatement
          | whileStatement
          ;
funcDeclaration : 'func' INDENTIFIER '('paramList? ')' block;
paramList : INDENTIFIER (',' INDENTIFIER)*;

assigment : INDENTIFIER '=' expression ';' ;
printStatement : 'print' '(' expression ')' ';';
whileStatement : 'while' '(' expression ')' block;

block : '{' statement '}';

expression : literal
           | INDENTIFIER
           | expression op = ('*' | '/' | '-' | '+')
expression
           | '(' expression ')'
           ;

literal : NUMBER
        | STRING
        ;

NUMBER : DIGIT +;
STRING : '"' ~["]* '"';
INDENTIFIER : [a-zA-Z] + ;
WS : [\t\r\n] + -> skip;
fragment DIGIT : [0-9];
