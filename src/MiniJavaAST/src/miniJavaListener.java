// Generated from miniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(miniJavaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(miniJavaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void enterMainclass(miniJavaParser.MainclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void exitMainclass(miniJavaParser.MainclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(miniJavaParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(miniJavaParser.ClassdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(miniJavaParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(miniJavaParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(miniJavaParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(miniJavaParser.MethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#formallist}.
	 * @param ctx the parse tree
	 */
	void enterFormallist(miniJavaParser.FormallistContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#formallist}.
	 * @param ctx the parse tree
	 */
	void exitFormallist(miniJavaParser.FormallistContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#formalrest}.
	 * @param ctx the parse tree
	 */
	void enterFormalrest(miniJavaParser.FormalrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#formalrest}.
	 * @param ctx the parse tree
	 */
	void exitFormalrest(miniJavaParser.FormalrestContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(miniJavaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(miniJavaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(miniJavaParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(miniJavaParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#exprest}.
	 * @param ctx the parse tree
	 */
	void enterExprest(miniJavaParser.ExprestContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#exprest}.
	 * @param ctx the parse tree
	 */
	void exitExprest(miniJavaParser.ExprestContext ctx);
}