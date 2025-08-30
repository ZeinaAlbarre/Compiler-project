parser grammar ParserAng;

options { tokenVocab=LexerAng; }

program
               : sourceElement? EOF                     #programDef
               ;

sourceElement
               : statement* #sourceElementDef
               ;
statement
               :importStatement                                              # stmImport
               |interfaceDeclaration                                         # stmtInterface
               |classDeclaration                                             # stmtClass
               |componentDeclaration                                         # stmtComponent
               |exportStatement                                              # stmtExport
               |expressionStatement                                          # stmtExpression
               |ifStatement                                                  # stmtIf
               |forStatement                                                 # stmtFor
               |variableStatement                                            # stmtVariable
               ;

importStatement
    : IMPORT LBRACE IDENTIFIER (COMMA IDENTIFIER)*  RBRACE FROM STRING_LITERAL SEMICOLON #defaultImportStatement
    ;

exportStatement
    : EXPORT (classDeclaration | interfaceDeclaration | functionDeclaration | methodDeclaration) # exportDeclaration
    ;

interfaceDeclaration
    : INTERFACE IDENTIFIER (EXTENDS IDENTIFIER)? LBRACE interfaceProperty* RBRACE # interfaceDefinition
    ;

interfaceProperty
    : IDENTIFIER COLON typeAnnotation SEMICOLON # interfacePropertyDefinition
    ;

classDeclaration
    : decorator* CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (IMPLEMENTS IDENTIFIER)? LBRACE classMember* RBRACE* # classDefinition
    ;

classMember
    : decorator* propertyDeclaration # classProperty
    | decorator* constructorDeclaration # classConstructor
    | decorator* methodDeclaration # classMethod
    ;

functionDeclaration
    : (PUBLIC | PRIVATE | PROTECTED)? FUNCTION IDENTIFIER LPAREN parameterList? RPAREN (COLON typeAnnotation)? LBRACE statement* RBRACE # functionDefinition
    | (PUBLIC | PRIVATE | PROTECTED)? IDENTIFIER LPAREN parameterList? RPAREN (COLON typeAnnotation)? ARROW (LBRACE statement* RBRACE | expression) # arrowFunctionDefinition
    ;

decorator
    : (COMPONENT | INJECTABLE | INPUT | OUTPUT | HOST_LISTENER | HOST_BINDING | VIEW_CHILD | CONTENT_CHILD | PIPE | DIRECTIVE | NG_MODULE) #decoratorDefinition2
    | AT IDENTIFIER (LPAREN decoratorArguments? RPAREN)? #decoratorDefinition1
    ;

decoratorArguments
    : objectLiteral                                             # decoratorObjectArgument
    | expression                                                # decoratorExpressionArgument
    ;

componentDeclaration
    : COMPONENT LPAREN componentMetadata RPAREN # componentDefinition
    ;

componentMetadata
    : LBRACE componentProperty (COMMA componentProperty)* RBRACE # componentMetadataContent
    ;

componentProperty
    : selectorProperty # componentSelector
    | templateProperty # componentTemplate
    | styleProperty # componentStyle
    | expression #ex
    ;

selectorProperty
     : SELECTOR COLON STRING_LITERAL # selectorDefinition
     ;

templateProperty
     : TEMPLATE COLON templateString # templateDefinition
     ;

styleProperty
     : STYLE_URLS COLON LBRACKET STRING_LITERAL (COMMA STRING_LITERAL)* RBRACKET # styleUrlsDefinition
     | STYLES COLON LBRACKET BACKTICK (styleContent)* BACKTICK RBRACKET # styleUrlsDefinition2
     ;

styleContent
     : DOT IDENTIFIER MINUS IDENTIFIER IDENTIFIER* LBRACE expressionStatement* RBRACE #styleContentDefinition
     ;

propertyDeclaration
    : (PUBLIC | PRIVATE | PROTECTED)? IDENTIFIER (COLON typeAnnotation)? (ASSIGN expression)? (SEMICOLON | COMMA)? # propertyDefinition
    ;

methodDeclaration
    : (PUBLIC | PRIVATE | PROTECTED)? IDENTIFIER LPAREN parameterList? RPAREN (COLON typeAnnotation)? LBRACE statement* RBRACE # methodDefinition
    | IDENTIFIER ALLPAREN LBRACE statement* RBRACE # methodDefinition2
    ;

constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN LBRACE statement* RBRACE # constructorDefinition
    | CONSTRUCTOR ALLPAREN LBRACE statement* RBRACE  # constructorDefinition2
    ;

templateString
    : BACKTICK (templateContent|htmlTemplate) BACKTICK # templateStringDefinition
    ;

templateContent
    : templatePart*  # templateContentPartDefinition
    ;

templatePart
    : HASH? IDENTIFIER  # idePart
    ;

expression
    : onExpression                                                    # onExpr
    | arrowFunction                                                   # arrowExpr
    | primaryExpression                                               # primaryExpr
    | expression DOT OPTIONAL_CHAIN* IDENTIFIER OPTIONAL_CHAIN* ALLPAREN*                                      # dotExpr
    | expression LBRACKET expression RBRACKET                         # indexExpr
    | expression typeArguments? LPAREN argumentList? RPAREN           # callExpr
    | expression (MULTIPLY | DIVIDE) expression                       # multiplicativeExpr
    | expression (PLUS | MINUS) expression                            # additiveExpr
    | expression (EQUALS | NOT_EQUALS | STRICT_EQUALS | STRICT_NOT_EQUALS | LESS_THAN | GREATER_THAN) expression # comparisonExpr
    | expression ASSIGN expression                                    # assignmentExpr
    | expression COLON expression                                     # colonExpr
    | expression (AND | OR) expression                                # logicalExpr
    | expression COLON IDENTIFIER LBRACKET RBRACKET ASSIGN expression # assignArrayExpr
    | expression LPAREN expression RPAREN LBRACE expression RBRACE    # functionExpr
    | returnStatement                                              # stmtReturn
    | propertyAssignment #propExpr
    ;

onExpression
    : ON LPAREN IDENTIFIER COMMA arrowFunction RPAREN                 # onCall
    ;

    arrowFunction
        : LPAREN arrowParams? RPAREN ARROW arrowBody                      # arrowFunctionDefinition2
        ;

    arrowParams
        : arrowParam (COMMA arrowParam)*                                  # arrowParamList
        ;

    arrowParam
        : IDENTIFIER (COLON typeAnnotation)?                              # arrowIdentifierParam
        | destructuredObject                                              # arrowDestructuredParam
        ;

    destructuredObject
        : LBRACE destructuredProperty (COMMA destructuredProperty)* RBRACE # destructuredObjectDefinition
        ;

    destructuredProperty
        : IDENTIFIER (COLON typeAnnotation)?                              # destructuredPropertyDefinition
        ;

   arrowBody
       : objectLiteral                              # arrowObjectBody
       | LPAREN objectLiteral RPAREN                # arrowParenObjectBody
       | expression                                 # arrowExpressionBody
       ;

typeArguments
    : LESS_THAN typeAnnotation (COMMA typeAnnotation)* GREATER_THAN
    ;


primaryExpression
    : OPTIONAL_CHAIN* IDENTIFIER                                                      # identifierExpr
    | literal                                                         # literalExpr
    | arrayLiteral                                                    # arrayExpr
    | objectLiteral                                                   # objectExpr
    | templateString                                                  # templateExpr
    | ALLPAREN                                                         #allparenExpr
    | LPAREN expression ARROW? (expression SEMICOLON?)* SEMICOLON? RPAREN? SEMICOLON?                             # parenExpr
    | LBRACE expression ARROW? (expression SEMICOLON?)* SEMICOLON? RBRACE? SEMICOLON?                             # pareceExpr
    | OPTIONAL_CHAIN* STRING_LITERAL                                                    # stringLiterial1
    | NULL                                                              #null
    | NO IDENTIFIER #no
    | IDENTIFIER ROUNDABOUT NULL                                     # roundType2
    | IDENTIFIER HTML_TAG_OPEN (COMMA STRING_LITERAL GREATER_THAN)?   # identifierExpr2
    | CONST expression                                               #constExpr
    ;


typeAnnotation
    : IDENTIFIER                                                     # simpleType
    | IDENTIFIER LBRACKET RBRACKET                                  # arrayType
    | objectType                                                     # complexType
    | IDENTIFIER ROUNDABOUT NULL                                     # roundType
    ;

literal
    : STRING_LITERAL                                                # stringLiteral
    | DECIMAL_LITERAL                                               # numberLiteral
    | BOOLEAN_LITERAL                                               # booleanLiteral
    | NULL_LITERAL                                                  # nullLiteral
    | MINUS literal                                                  # navegateLiteral
    ;

arrayLiteral
    : LBRACKET argumentList? RBRACKET                           # arrayLiteralDefinition
    ;

objectLiteral
    : LBRACE (propertyAssignment ((COMMA propertyAssignment)*))? RBRACE COMMA* # objectLiteralDefinition
    ;


propertyAssignment
    : IDENTIFIER COLON expression                                     # propertyAssignmentDefinition
    | IDENTIFIER                                                      # shorthandPropertyAssignment
    | SPREAD IDENTIFIER                                               # spreadProperty
    ;
expressionStatement
    : expression SEMICOLON?                                         # expressionStatementDefinition
    ;

ifStatement
    : IF LPAREN expression RPAREN (LBRACE)? statement (RBRACE)? (ELSE (LBRACE)? statement (RBRACE)? )?      # ifStatementDefinition
    ;

forStatement
    : FOR LPAREN forInitializer? SEMICOLON expression? SEMICOLON expression? RPAREN ((LBRACE)? sourceElement? (RBRACE)? | statement) # forStatementDefinition
    ;


forInitializer
    : variableDeclaration                                          # forVariableInitializer
    | ('let' | 'var' | 'const') IDENTIFIER ('=' expression)? # forAssignInitializer
    | expression                                                    # forExpressionInitializer
    ;

returnStatement
    : RETURN expression? SEMICOLON                                 # returnStatementDefinition
    ;


variableStatement
    : (VAR | LET | CONST) IDENTIFIER (COLON typeAnnotation)? ASSIGN expression (COMMA expression)* SEMICOLON # variableStatementDefinition2
    ;

variableDeclaration
    : IDENTIFIER (COLON typeAnnotation)? ((ASSIGN|LESS_THAN|GREATER_THAN) expression)?      # variableDeclarationDefinition
    ;

parameterList
    : parameter (COMMA parameter)?                                 # parameterListDefinition
    ;

parameter
    : IDENTIFIER (COLON typeAnnotation)?                          # parameterDefinition
    ;

argumentList
    : expression (COMMA expression)* # argumentListDefinition
    ;

objectType
    : LBRACE objectTypeMember (COMMA objectTypeMember)* RBRACE   # objectTypeDefinition
    ;

objectTypeMember
    : IDENTIFIER COLON typeAnnotation                            # objectTypeMemberDefinition
    ;

ngDirective
    : ngForDirective        # directiveNgFor
    | ngIfDirective         # directiveNgIf
    | ngStyleDirective      # directiveNgStyle
    | ngSwitchDirective     # directiveNgSwitch
    | ngClassDirective      # directiveNgClass
    | ngModelDirective      # directiveNgModel
    ;

ngForDirective
    : NG_FOR ASSIGN LET IDENTIFIER OF expression # ngForDirectiveDefinition1
    | NG_FOR ASSIGN STRING_LITERAL #ngForDirectiveDefinition2
    ;

ngIfDirective
    : NG_IF ASSIGN expression # ngIfDirectiveDefinition
    ;

ngSwitchDirective
    : NG_SWITCH ASSIGN expression # ngSwitchDirectiveDefinition
    ;

ngClassDirective
    : (NG_CLASS | NG_CLASS_BINDING) ASSIGN expression # ngClassDirectiveDefinition
    ;

ngStyleDirective
    : (NG_STYLE | NG_STYLE_BINDING) ASSIGN expression # ngStyleDirectiveDefinition
    ;

ngModelDirective
    : NG_MODEL_BINDING ASSIGN expression # ngModelDirectiveDefinition
    ;

// HTML Template
htmlTemplate
    : htmlElement+ # htmlTemplateContent
    ;

htmlElement
    : htmlTag # htmlTagElement
    | templatePart # htmlTemplateElement
    | ngDirective # htmlNgDirectiveElement
    ;

htmlTag
    : (HTML_TAG_OPEN|HTML_TAG_OPEN_Q) (htmlElement|htmlAttribute|ngDirective)* GREATER_THAN* (HTML_TAG_CLOSE|HTML_TAG_CLOSE_Q)* htmlElement*  (HTML_TAG_CLOSE_RIGHT | HTML_TAG_CLOSE_RIGHT)* # htmlTagDefinition
    ;

htmlAttribute
    : LBRACKET* (IDENTIFIER|CLASS) RBRACKET* (ASSIGN attributeValue)? # htmlAttributeDefinition1
    | LBRACE* LBRACE* IDENTIFIER DOT IDENTIFIER RBRACE* RBRACE* # htmlAttributeDefinition2
    | LPAREN IDENTIFIER RPAREN ASSIGN STRING_LITERAL # htmlAttributeDefinition3
    | IDENTIFIER ASSIGN STRING_LITERAL # htmlAttributeDefinition4
    | attributeValue                                          # htmlAttributeDefinition5
    ;

attributeValue
    : STRING_LITERAL # stringAttributeValue
    | expression # expressionAttributeValue
    ;




