import java.io.IOException;
import org.antlr.runtime.*;

public final class MiniCompilateur {

	public static void main(String[] args) {

		try {
			
			//On met en place le Lexer et le Parser ainsi que l'entrée
			ANTLRFileStream input = new ANTLRFileStream(args[0]);
			Gram1Lexer lexer = new Gram1Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Gram1Parser parser = new Gram1Parser(tokens);
			
			//On évalue le contenu du fichier
			System.out.println("Début de la reconnaissance !");
			parser.document();
			System.out.println("Fin de la reconnaissance !");
			
		}
		catch (IOException e) {

			System.err.println("Erreur I/O");
		}
		catch (RecognitionException e){
			
			System.err.println("Erreur dans la reconnaissance du contenu de l'entrée");
		}
	}
}
