lexer grammar LexerAng;

IMPORT: 'import';
FROM: 'from';
FUNCTION: 'function';
RETURN: 'return';
EXPORT: 'export';
DEFAULT: 'default';
INTERFACE: 'interface';
CONST: 'const';
CLASS: 'class';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
VAR: 'var';
LET: 'let';
OF: 'of';
ASYNC: 'async';
AT: '@';
AS: 'as';
NULL: 'null';
// Angular Keywords
SELECTOR: 'selector';
TEMPLATE: 'template';
STYLE_URLS: 'styleUrls';
STYLES: 'styles';
VIEW_PROVIDERS: 'viewProviders';
ANIMATIONS: 'animations';
ENCAPSULATION: 'encapsulation';
CHANGE_DETECTION: 'changeDetection';
PRESERVE_WHITESPACES: 'preserveWhitespaces';
INTERPOLATION: 'interpolation';

PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
CONSTRUCTOR: 'constructor';
FOR: 'for';
IF: 'if';
ELSE: 'else';

AND: '&&';
OR: '||';
EQUALS: '==';
NOT_EQUALS: '!=';
MULTIPLY: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';
ASSIGN: '=';
ROUNDABOUT: '|';
SPREAD: '...';
STRICT_EQUALS       : '===' ;
STRICT_NOT_EQUALS   : '!==' ;
NO : '!';
HASH : '#';
// Angular Directives
NG_FOR: '*ngFor';
NG_IF: '*ngIf';
NG_SWITCH: '*ngSwitch';
NG_SWITCH_CASE: '*ngSwitchCase';
NG_SWITCH_DEFAULT: '*ngSwitchDefault';
NG_CLASS: '*ngClass';
NG_STYLE: '*ngStyle';
NG_CLASS_BINDING: 'ngClass';
NG_STYLE_BINDING: '[ngStyle]';
NG_MODEL_BINDING: 'ngModel)]';


LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
LESS_THAN: '<';
GREATER_THAN: '>';
COLON: ':';
SEMICOLON: ';';
DOT: '.';
COMMA: ',';
BACKTICK: '`';
ARROW: '=>';
OPTIONAL_CHAIN : '?';
// HTML Related
HTML_TAG_OPEN: '<' [a-zA-Z][a-zA-Z0-9]* '>'*;
HTML_TAG_CLOSE: '</' [a-zA-Z][a-zA-Z0-9]* '>';
HTML_TAG_OPEN_Q: '<' [a-zA-Z][a-zA-Z0-9_-]* '>'*;
HTML_TAG_CLOSE_Q: '</' [a-zA-Z][a-zA-Z0-9_-]* '>';
HTML_TAG_CLOSE_RIGHT: '/>';
DIV:'div';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
STRING_LITERAL: '\'' (~['\r\n])* '\'' | '"' ~["]* '"' | '`' (~['\r\n])* '`';
DECIMAL_LITERAL: [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
NULL_LITERAL: 'null';

WS: [ \t\r\n]+ -> skip;
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;

COMPONENT: '@Component';
INJECTABLE: '@Injectable';
INPUT: '@Input';
OUTPUT: '@Output';
HOST_LISTENER: '@HostListener';
HOST_BINDING: '@HostBinding';
VIEW_CHILD: '@ViewChild';
CONTENT_CHILD: '@ContentChild';
PIPE: '@Pipe';
DIRECTIVE: '@Directive';
NG_MODULE: '@NgModule';

ALLPAREN: '()';
CSS_UNIT: 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw';

DOUBLE_QUOTE : '"';
SINGLE_QUOTE : '\'';
ESC : '\\' .;

