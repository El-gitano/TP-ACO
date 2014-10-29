import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        VSLLexer lex = new VSLLexer(new ANTLRFileStream("/private/student/5/35/15008135/M1/Comp/TP/TP2/src/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        VSLParser g = new VSLParser(tokens, 49100, null);
        try {
            g.s();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}