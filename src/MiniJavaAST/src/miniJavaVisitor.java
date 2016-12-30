// Generated from miniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(miniJavaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#mainclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainclass(miniJavaParser.MainclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdecl(miniJavaParser.ClassdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(miniJavaParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddecl(miniJavaParser.MethoddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#formallist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormallist(miniJavaParser.FormallistContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#formalrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalrest(miniJavaParser.FormalrestContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(miniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(miniJavaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(miniJavaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#exprest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprest(miniJavaParser.ExprestContext ctx);
}