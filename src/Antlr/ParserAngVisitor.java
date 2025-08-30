// Generated from D:/java/CompilerProject/src/Antlr/ParserAng.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserAng}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserAngVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programDef}
	 * labeled alternative in {@link ParserAng#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDef(ParserAng.ProgramDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sourceElementDef}
	 * labeled alternative in {@link ParserAng#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElementDef(ParserAng.SourceElementDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmImport}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmImport(ParserAng.StmImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtInterface}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtInterface(ParserAng.StmtInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtClass}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtClass(ParserAng.StmtClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtComponent}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtComponent(ParserAng.StmtComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExport}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExport(ParserAng.StmtExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExpression}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpression(ParserAng.StmtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(ParserAng.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFor(ParserAng.StmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtVariable}
	 * labeled alternative in {@link ParserAng#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVariable(ParserAng.StmtVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultImportStatement}
	 * labeled alternative in {@link ParserAng#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImportStatement(ParserAng.DefaultImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportDeclaration}
	 * labeled alternative in {@link ParserAng#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(ParserAng.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceDefinition}
	 * labeled alternative in {@link ParserAng#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(ParserAng.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfacePropertyDefinition}
	 * labeled alternative in {@link ParserAng#interfaceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacePropertyDefinition(ParserAng.InterfacePropertyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDefinition}
	 * labeled alternative in {@link ParserAng#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(ParserAng.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classProperty}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassProperty(ParserAng.ClassPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classConstructor}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(ParserAng.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classMethod}
	 * labeled alternative in {@link ParserAng#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethod(ParserAng.ClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDefinition}
	 * labeled alternative in {@link ParserAng#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(ParserAng.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowFunctionDefinition}
	 * labeled alternative in {@link ParserAng#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDefinition(ParserAng.ArrowFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decoratorDefinition2}
	 * labeled alternative in {@link ParserAng#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorDefinition2(ParserAng.DecoratorDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code decoratorDefinition1}
	 * labeled alternative in {@link ParserAng#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorDefinition1(ParserAng.DecoratorDefinition1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code decoratorObjectArgument}
	 * labeled alternative in {@link ParserAng#decoratorArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorObjectArgument(ParserAng.DecoratorObjectArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decoratorExpressionArgument}
	 * labeled alternative in {@link ParserAng#decoratorArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorExpressionArgument(ParserAng.DecoratorExpressionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentDefinition}
	 * labeled alternative in {@link ParserAng#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(ParserAng.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentMetadataContent}
	 * labeled alternative in {@link ParserAng#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadataContent(ParserAng.ComponentMetadataContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentSelector}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentSelector(ParserAng.ComponentSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentTemplate}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentTemplate(ParserAng.ComponentTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentStyle}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStyle(ParserAng.ComponentStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ex}
	 * labeled alternative in {@link ParserAng#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx(ParserAng.ExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorDefinition}
	 * labeled alternative in {@link ParserAng#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDefinition(ParserAng.SelectorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateDefinition}
	 * labeled alternative in {@link ParserAng#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDefinition(ParserAng.TemplateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleUrlsDefinition}
	 * labeled alternative in {@link ParserAng#styleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsDefinition(ParserAng.StyleUrlsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleUrlsDefinition2}
	 * labeled alternative in {@link ParserAng#styleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsDefinition2(ParserAng.StyleUrlsDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code styleContentDefinition}
	 * labeled alternative in {@link ParserAng#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContentDefinition(ParserAng.StyleContentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyDefinition}
	 * labeled alternative in {@link ParserAng#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDefinition(ParserAng.PropertyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDefinition}
	 * labeled alternative in {@link ParserAng#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(ParserAng.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDefinition2}
	 * labeled alternative in {@link ParserAng#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition2(ParserAng.MethodDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorDefinition}
	 * labeled alternative in {@link ParserAng#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition(ParserAng.ConstructorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorDefinition2}
	 * labeled alternative in {@link ParserAng#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition2(ParserAng.ConstructorDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code templateStringDefinition}
	 * labeled alternative in {@link ParserAng#templateString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringDefinition(ParserAng.TemplateStringDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateContentPartDefinition}
	 * labeled alternative in {@link ParserAng#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContentPartDefinition(ParserAng.TemplateContentPartDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idePart}
	 * labeled alternative in {@link ParserAng#templatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdePart(ParserAng.IdePartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(ParserAng.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(ParserAng.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExpr(ParserAng.PropExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colonExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonExpr(ParserAng.ColonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(ParserAng.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(ParserAng.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(ParserAng.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowExpr(ParserAng.ArrowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnExpr(ParserAng.OnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(ParserAng.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(ParserAng.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArrayExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayExpr(ParserAng.AssignArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(ParserAng.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(ParserAng.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(ParserAng.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtReturn}
	 * labeled alternative in {@link ParserAng#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturn(ParserAng.StmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onCall}
	 * labeled alternative in {@link ParserAng#onExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCall(ParserAng.OnCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowFunctionDefinition2}
	 * labeled alternative in {@link ParserAng#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDefinition2(ParserAng.ArrowFunctionDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowParamList}
	 * labeled alternative in {@link ParserAng#arrowParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowParamList(ParserAng.ArrowParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowIdentifierParam}
	 * labeled alternative in {@link ParserAng#arrowParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowIdentifierParam(ParserAng.ArrowIdentifierParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowDestructuredParam}
	 * labeled alternative in {@link ParserAng#arrowParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowDestructuredParam(ParserAng.ArrowDestructuredParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code destructuredObjectDefinition}
	 * labeled alternative in {@link ParserAng#destructuredObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuredObjectDefinition(ParserAng.DestructuredObjectDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code destructuredPropertyDefinition}
	 * labeled alternative in {@link ParserAng#destructuredProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuredPropertyDefinition(ParserAng.DestructuredPropertyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowObjectBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowObjectBody(ParserAng.ArrowObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowParenObjectBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowParenObjectBody(ParserAng.ArrowParenObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowExpressionBody}
	 * labeled alternative in {@link ParserAng#arrowBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowExpressionBody(ParserAng.ArrowExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAng#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ParserAng.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(ParserAng.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(ParserAng.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(ParserAng.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(ParserAng.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExpr(ParserAng.TemplateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allparenExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllparenExpr(ParserAng.AllparenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ParserAng.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pareceExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPareceExpr(ParserAng.PareceExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiterial1}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterial1(ParserAng.StringLiterial1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(ParserAng.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code no}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo(ParserAng.NoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roundType2}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundType2(ParserAng.RoundType2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr2}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr2(ParserAng.IdentifierExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link ParserAng#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(ParserAng.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(ParserAng.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ParserAng.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexType(ParserAng.ComplexTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roundType}
	 * labeled alternative in {@link ParserAng#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundType(ParserAng.RoundTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ParserAng.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(ParserAng.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(ParserAng.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(ParserAng.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code navegateLiteral}
	 * labeled alternative in {@link ParserAng#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavegateLiteral(ParserAng.NavegateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralDefinition}
	 * labeled alternative in {@link ParserAng#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralDefinition(ParserAng.ArrayLiteralDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectLiteralDefinition}
	 * labeled alternative in {@link ParserAng#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralDefinition(ParserAng.ObjectLiteralDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyAssignmentDefinition}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignmentDefinition(ParserAng.PropertyAssignmentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shorthandPropertyAssignment}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandPropertyAssignment(ParserAng.ShorthandPropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spreadProperty}
	 * labeled alternative in {@link ParserAng#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadProperty(ParserAng.SpreadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatementDefinition}
	 * labeled alternative in {@link ParserAng#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatementDefinition(ParserAng.ExpressionStatementDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementDefinition}
	 * labeled alternative in {@link ParserAng#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementDefinition(ParserAng.IfStatementDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementDefinition}
	 * labeled alternative in {@link ParserAng#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementDefinition(ParserAng.ForStatementDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forVariableInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVariableInitializer(ParserAng.ForVariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forAssignInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAssignInitializer(ParserAng.ForAssignInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forExpressionInitializer}
	 * labeled alternative in {@link ParserAng#forInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpressionInitializer(ParserAng.ForExpressionInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementDefinition}
	 * labeled alternative in {@link ParserAng#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementDefinition(ParserAng.ReturnStatementDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableStatementDefinition2}
	 * labeled alternative in {@link ParserAng#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatementDefinition2(ParserAng.VariableStatementDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationDefinition}
	 * labeled alternative in {@link ParserAng#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationDefinition(ParserAng.VariableDeclarationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterListDefinition}
	 * labeled alternative in {@link ParserAng#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListDefinition(ParserAng.ParameterListDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterDefinition}
	 * labeled alternative in {@link ParserAng#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDefinition(ParserAng.ParameterDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentListDefinition}
	 * labeled alternative in {@link ParserAng#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListDefinition(ParserAng.ArgumentListDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectTypeDefinition}
	 * labeled alternative in {@link ParserAng#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeDefinition(ParserAng.ObjectTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectTypeMemberDefinition}
	 * labeled alternative in {@link ParserAng#objectTypeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeMemberDefinition(ParserAng.ObjectTypeMemberDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveNgFor}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveNgFor(ParserAng.DirectiveNgForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveNgIf}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveNgIf(ParserAng.DirectiveNgIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveNgStyle}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveNgStyle(ParserAng.DirectiveNgStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveNgSwitch}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveNgSwitch(ParserAng.DirectiveNgSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveNgClass}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveNgClass(ParserAng.DirectiveNgClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveNgModel}
	 * labeled alternative in {@link ParserAng#ngDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveNgModel(ParserAng.DirectiveNgModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngForDirectiveDefinition1}
	 * labeled alternative in {@link ParserAng#ngForDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirectiveDefinition1(ParserAng.NgForDirectiveDefinition1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ngForDirectiveDefinition2}
	 * labeled alternative in {@link ParserAng#ngForDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirectiveDefinition2(ParserAng.NgForDirectiveDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ngIfDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngIfDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfDirectiveDefinition(ParserAng.NgIfDirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngSwitchDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngSwitchDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgSwitchDirectiveDefinition(ParserAng.NgSwitchDirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngClassDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngClassDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgClassDirectiveDefinition(ParserAng.NgClassDirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngStyleDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngStyleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgStyleDirectiveDefinition(ParserAng.NgStyleDirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngModelDirectiveDefinition}
	 * labeled alternative in {@link ParserAng#ngModelDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgModelDirectiveDefinition(ParserAng.NgModelDirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlTemplateContent}
	 * labeled alternative in {@link ParserAng#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplateContent(ParserAng.HtmlTemplateContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlTagElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagElement(ParserAng.HtmlTagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlTemplateElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplateElement(ParserAng.HtmlTemplateElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlNgDirectiveElement}
	 * labeled alternative in {@link ParserAng#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNgDirectiveElement(ParserAng.HtmlNgDirectiveElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlTagDefinition}
	 * labeled alternative in {@link ParserAng#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagDefinition(ParserAng.HtmlTagDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttributeDefinition1}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeDefinition1(ParserAng.HtmlAttributeDefinition1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttributeDefinition2}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeDefinition2(ParserAng.HtmlAttributeDefinition2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttributeDefinition3}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeDefinition3(ParserAng.HtmlAttributeDefinition3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttributeDefinition4}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeDefinition4(ParserAng.HtmlAttributeDefinition4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttributeDefinition5}
	 * labeled alternative in {@link ParserAng#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeDefinition5(ParserAng.HtmlAttributeDefinition5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAttributeValue}
	 * labeled alternative in {@link ParserAng#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAttributeValue(ParserAng.StringAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAttributeValue}
	 * labeled alternative in {@link ParserAng#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAttributeValue(ParserAng.ExpressionAttributeValueContext ctx);
}