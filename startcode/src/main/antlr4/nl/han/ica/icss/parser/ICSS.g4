grammar ICSS;

//--- LEXER: ---

// IF support:
IF: 'if';
ELSE: 'else';
BOX_BRACKET_OPEN: '[';
BOX_BRACKET_CLOSE: ']';


//Literals
TRUE: 'TRUE';
FALSE: 'FALSE';
PIXELSIZE: [0-9]+ 'px';
PERCENTAGE: [0-9]+ '%';
SCALAR: [0-9]+;


//Color value takes precedence over id idents
COLOR: '#' [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f];

//Specific identifiers for id's and css classes
ID_IDENT: '#' [a-z0-9\-]+;
CLASS_IDENT: '.' [a-z0-9\-]+;

//General identifiers
LOWER_IDENT: [a-z] [a-z0-9\-]*;
CAPITAL_IDENT: [A-Z] [A-Za-z0-9_]*;

//All whitespace is skipped
WS: [ \t\r\n]+ -> skip;

//
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
SEMICOLON: ';';
COLON: ':';
PLUS: '+';
MIN: '-';
MUL: '*';
ASSIGNMENT_OPERATOR: ':=';


//--- PARSER: ---
//Basic
stylesheet: (variableassignment|stylerule)* EOF;
selector: ID_IDENT #idSelector |CLASS_IDENT #classSelector|LOWER_IDENT #tagSelector|CAPITAL_IDENT #tagSelector;
literal: COLOR #colorliteral|PIXELSIZE #pixelliteral|bool #boolliteral|PERCENTAGE #percentageliteral|SCALAR #scalarliteral;

//Level 0 Stylerule
stylerule: selector body;
body: OPEN_BRACE (decleration|ifstatement)* CLOSE_BRACE;
decleration: propertyname COLON expression SEMICOLON;
propertyname: LOWER_IDENT;

//Level 1 Variable assignment
variableassignment: variablereference ASSIGNMENT_OPERATOR expression SEMICOLON;
variablereference: CAPITAL_IDENT;

//Level 2 Expression
expression: literal #literalexpression|variablereference #variableexpression|expression MUL expression #multiplication|expression PLUS expression #addition|expression MIN expression #subtraction;

//Level 3 If-statement
ifstatement: IF BOX_BRACKET_OPEN condition BOX_BRACKET_CLOSE body elsestatement*;
elsestatement: ELSE body;
condition: bool|variablereference;
bool: TRUE|FALSE;