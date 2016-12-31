import org.antlr.v4.runtime.*;

/**
 * Created by BodeNg on 2016/12/31.
 */
public class MyListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg,
                            RecognitionException e) {
        if (msg.startsWith("Lexical Error") || msg.startsWith("Semantic Error")) {
            System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            printErrorLine(recognizer, line);
        } else {
            msg = "Syntactic Error:" + msg;
            System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            underlineError(recognizer, (Token)offendingSymbol, line, charPositionInLine);
        }

    }
    protected void underlineError(Recognizer recognizer, Token offendingToken, int line,
                                  int charPositionInLine) {
        printErrorLine(recognizer, line);
        for (int i = 0; i < charPositionInLine; i++)
            System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start >= 0 && stop >= 0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
        System.err.println();
    }

    protected void printErrorLine(Recognizer recognizer, int line) {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
    }
}
