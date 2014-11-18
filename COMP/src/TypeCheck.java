/**
 * Type checking operations (NOTE: this class must be implemented by the
 * student; the methods indicated here can be seen as suggestions; note that
 * some minor checks can still be performed directly in VSLTreeParser.g).
 * 
 */
public class TypeCheck {

	// an Example
	/**
	 * Type checking for a binary operation - in VSL+: integer operations only!
	 */
	public static Type checkBinOp(Type t1, Type t2) {
		if (t1 == Type.INT && t2 == Type.INT)
			return Type.INT;
		else {
			// optional: emit error message using class Errors
			return Type.ERROR;
		}
	}
	public static VarSymbol checkAndDeclArray(org.antlr.runtime.tree.CommonTree token, java.lang.String name, int size, SymbolTable symTab){
		System.err.println("ERREUR: checkAndDeclArray a faire" );
		System.exit(1);	
		return null;
	}
	public static VarSymbol checkAndDeclIdent(org.antlr.runtime.tree.CommonTree token, java.lang.String name, Type type, SymbolTable symTab){
		int s = symTab.getScope();
    	Operand3a test= symTab.lookup(name);
    	if(test != null ){
    		if (s == test.getScope()){
        		System.err.println("ERREUR : Declaration: Variable " + name + " deja presente dans la table des symboles");
        		symTab.print();
        		System.exit(1);
        	}
        }
        VarSymbol  vs = new VarSymbol(type, name, s);
        symTab.insert(name,vs);
    	
		return vs;
	}
	public static VarSymbol checkAndDeclParmIdent(org.antlr.runtime.tree.CommonTree token, java.lang.String name, SymbolTable symTab){
		int s = symTab.getScope();
		Operand3a test= symTab.lookup(name);
		if(test != null ) {
			// test du rang
			if(s == test.getScope()){
     			System.err.println("ERREUR : Parametre " + name +"  deja present");
     			symTab.print();
       	 		System.exit(1);
       	 	}
        }    
    	VarSymbol vs = new VarSymbol(Type.INT, name, s);
    	vs.setParam();
		return vs;
	}
	public static VarSymbol checkAndDeclParmPointer(org.antlr.runtime.tree.CommonTree token, java.lang.String name, SymbolTable symTab){
		System.err.println("ERREUR: checkAndDeclParmPointer a faire" );
		System.exit(1);	
		return null;
	}
	public static Type checkArrayElem(org.antlr.runtime.tree.CommonTree token, java.lang.String name, Type indice, SymbolTable symTab){
		System.err.println("ERREUR: checkArrayElem a faire" );
		System.exit(1);	
		return null;
	}
	public static void checkAssign(org.antlr.runtime.tree.CommonTree lToken, Type lType, org.antlr.runtime.tree.CommonTree rToken, Type rType){
		if (  lType !=rType){
			System.err.println("ERREUR: Affectation de type different");
			System.exit(1);
		}
	}
	public static Type checkFuncCall(org.antlr.runtime.tree.CommonTree token, java.lang.String name, FunctionType callType, SymbolTable symTab){
		//Verifies the call is correct (valid function name and compatible argument types).

		FunctionSymbol fs= new FunctionSymbol(new LabelSymbol(name),callType );
		
		// test si deja presente dans la table des symboles
		FunctionSymbol test = (FunctionSymbol) symTab.lookup(name);
		if (test != null) {
			// fonction ou prototype presente dans la table des symboles
			
			// test si il s agit du meme type que dans la table des symboles
			// par exemple la creation de la meme fonction , deux fois
			if ( test.equals(callType.getReturnType() ) ){
					System.err.println("ERREUR : Fonction " + name + " deja presente ");
					symTab.print();
       				System.exit(1);			
			}
		}
		symTab.insert(name, fs);
		return test.type;
	}
	public static FunctionSymbol checkFuncDecl(org.antlr.runtime.tree.CommonTree token, java.lang.String name, FunctionType ft, SymbolTable symTab){
		
		FunctionSymbol fs= new FunctionSymbol(new LabelSymbol(name),ft );
		
		// test si deja presente dans la table des symboles
		FunctionSymbol test = (FunctionSymbol) symTab.lookup(name);
		if (test != null) {
			// fonction ou prototype presente dans la table des symboles
			
			// test si il s agit du meme type que dans la table des symboles
			// par exemple la creation de la meme fonction , deux fois
			if ( test.equals(ft.getReturnType() ) ){
					System.err.println("ERREUR : Fonction " + name + " deja presente ");
					symTab.print();
       				System.exit(1);			
			}
		}
		symTab.insert(name, fs);
		return fs;
	}
	private static FunctionSymbol checkFuncOrProtoDecl(org.antlr.runtime.tree.CommonTree token, java.lang.String name, FunctionType ft, SymbolTable symTab){
		System.err.println("ERREUR: checkFuncOrProtoDecl a faire" );
		System.exit(1);	
		return null;
	}
	public static Type 	checkIdent(org.antlr.runtime.tree.CommonTree token, java.lang.String name, SymbolTable symTab){
		Operand3a test = symTab.lookup(name);
		if (test != null) {
			if ( test.equals(token.getType() ) ){
					System.err.println("ERREUR : Fonction " + name + " deja presente ");
					symTab.print();
       				System.exit(1);			
			}
		}
		return test.type;
	}
	public static FunctionSymbol checkProtoDecl(org.antlr.runtime.tree.CommonTree token, java.lang.String name, FunctionType ft, SymbolTable symTab){
		FunctionSymbol ps= new FunctionSymbol(new LabelSymbol(name),ft );
		
		// test si deja presente dans la table des symboles
		Operand3a test =  symTab.lookup(name);
		if (test != null) {
			// fonction ou prototype present dans la table des symboles
			
			// test si il s agit du meme type que dans la table des symboles
			// par exemple la creation de la meme fonction , deux fois
			if ( test.equals(ft.getReturnType() ) ){
					System.err.println("ERREUR : Prototype " + name + " deja present ");
					symTab.print();
       				System.exit(1);			
			}
		}
		return ps;
	}
	private static void printErrorDecl(org.antlr.runtime.tree.CommonTree token, Operand3a var, java.lang.String name, SymbolTable symTab){
		//Auxiliary function to print an (already identified) error related to undeclared variables.
		System.err.println("ERREUR: printErrorDecl a faire" );
		System.exit(1);	
	}
	public static void reserveFunctionName(org.antlr.runtime.tree.CommonTree token, java.lang.String name, FunctionType ft, SymbolTable symTab){
		System.err.println("ERREUR: reserveFunctionName a faire" );
		System.exit(1);	
	}

}
