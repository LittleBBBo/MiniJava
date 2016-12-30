import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

/**
 * Created by BodeNg on 2016/12/30.
 */
public class Main {
    public static String location = "samples/factorial.java";
    public static String locationOut = "AST.txt";

    public static void main(String[] args) {
        ANTLRInputStream antlrInputStream;

//        if( args.length < 2) {
//            System.out.println("Usage : Parser.jar input.mjava output.txt");
//            return;
//        }
//        location = args[0];
//        locationOut = args[1];

        try {
            InputStream in = new FileInputStream(location);

            antlrInputStream = new ANTLRInputStream(in);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }

        miniJavaLexer lexer = new miniJavaLexer(antlrInputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniJavaParser parser = new miniJavaParser(tokens);
//        parser.removeErrorListeners();
//        parser.addErrorListener(new IListener());


//
//        ParseTree tree = parser.prog();
//        String outstr = tree.toStringTree(parser);
//        System.out.println(outstr);
        new AstPrinter().print(parser.prog().getRuleContext());
//
//        try {
//            File file = new File(locationOut);
//            FileWriter fw = new FileWriter(file.getAbsoluteFile());
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(outstr);
//            bw.close();
//            fw.close();
//        }catch (IOException e)
//        {
//        }
    }
}
