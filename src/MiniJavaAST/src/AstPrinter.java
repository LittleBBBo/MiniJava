import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;


/**
 * Created by BodeNg on 2016/12/30.
 */
public class AstPrinter {
    private StringBuffer buffer;
    public String print(RuleContext ctx) {
        buffer = new StringBuffer();
        explore(ctx, 0);
        return buffer.toString();
    }

    private void explore(RuleContext ctx, int indentation) {
        String ruleName = miniJavaParser.ruleNames[ctx.getRuleIndex()];
        print_Indentation(indentation);
        System.out.println(ruleName);
        buffer.append(ruleName).append('\n');
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext)element, indentation + 1);

            } else if (element instanceof TerminalNode) {
                explore_Terminal((TerminalNode) element, indentation + 1);
            }
        }
    }

    private void explore_Terminal(TerminalNode element, int indentation) {
        int type = element.getSymbol().getType();
        switch (type) {
            case miniJavaParser.ID:
                print_Indentation(indentation);
                buffer.append("id " + element.getText()).append('\n');
                System.out.println("id " + element.getText()); break;
            case miniJavaParser.BOOLEAN:
                print_Indentation(indentation);
                buffer.append("bool " + element.getText()).append('\n');
                System.out.println("bool " + element.getText()); break;
            case miniJavaParser.INT:
                print_Indentation(indentation);
                buffer.append("int " + element.getText()).append('\n');
                System.out.println("int " + element.getText()); break;
        }
    }

    private void print_Indentation(int indentation) {
        if (indentation > 0) {
            for (int i = 0; i < indentation - 1; i++) {
                buffer.append("| ");
                System.out.print("| ");
            }
            buffer.append("|-");
            System.out.print("|-");
        }

    }
}
