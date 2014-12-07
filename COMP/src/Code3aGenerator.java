/**
 * This class implements all the methods for 3a code generation (NOTE: this
 * class must be coded by the student; the methods indicated here can be seen as
 * a suggestion, but are not actually necessary).
 * 
 * @author MLB
 * 
 */
public class Code3aGenerator {

	// Constructor not needed
	private Code3aGenerator() {
	}

	/**
	 * Generates the 3a statement: VAR t
	 **/
	public static Code3a genVar(Operand3a t) {
		Inst3a i = new Inst3a(Inst3a.TAC.VAR, t, null, null);
		return new Code3a(i);
	}

	/**
	 * Generate code for a binary operation
	 * 
	 * @param op
	 *            must be a code op: Inst3a.TAC.XXX
	 */
	public static Code3a genBinOp(Inst3a.TAC op, ExpAttribute exp1,
			ExpAttribute exp2, Operand3a temp) {
		
		Code3a cod = exp1.code;
		cod.append(exp2.code);
		cod.append(genVar(temp));
		cod.append(new Inst3a(op, temp, exp1.place, exp2.place));
		return cod;
	}
	
	public static Code3a genArg(Operand3a t){
		Inst3a i = null;
		i = new Inst3a(Inst3a.TAC.ARG, t, null, null);
		return new Code3a(i);
	}
	
	public static Code3a genBeginFunc (FunctionSymbol f){
		
		//Génération du label
		Code3a cod = new Code3a(iLabel(f.label));
		//Génération de beginfunc
		cod.append(new Inst3a(Inst3a.TAC.BEGINFUNC, null, null, null));	
		return cod;
	}
	
	
	public static Code3a genEndFunc (){
		
		
		return new Code3a(new Inst3a(Inst3a.TAC.ENDFUNC,null, null, null));
		
	}

	public static Inst3a iLabel(Operand3a t){
		
		return new Inst3a(Inst3a.TAC.LABEL, t, null, null);
	}

	public static Code3a genPrintS(Data3a text) {
		Code3a code = new Code3a();
		// le texte sera toujours le label 4
		LabelSymbol la = SymbDistrib.builtinPrintS; 
		code.appendData(text);
		code.append(new Inst3a(Inst3a.TAC.ARG, text.getLabel(), null, null));
		code.append(new Inst3a(Inst3a.TAC.CALL, null, la, null));
		return code;
	}

	public static Code3a genPrintInt(Operand3a place) {
		Code3a code = new Code3a();
		// le texte sera toujours le label 4
		LabelSymbol la = SymbDistrib.builtinPrintN; 
		code.append(new Inst3a(Inst3a.TAC.ARG, place, null, null));
		code.append(new Inst3a(Inst3a.TAC.CALL, null, la, null));
		return code;
	}

	public static Code3a genFuncCall(Code3a arg, String name, Operand3a retour, SymbolTable symTab) {
		Code3a code = new Code3a();
		code.append(arg);
		Operand3a f = symTab.lookup(name);
		if (f==null){
			System.err.println("ERREUR: fonction non presente dans la table des symboles");
			symTab.print();
			System.exit(1);
		}
		if (retour!=null){
			retour.setOffset(f.getOffset());
			code.append(new Inst3a(Inst3a.TAC.CALL, retour, f, null));
		}
		else{
			code.append(new Inst3a(Inst3a.TAC.CALL, null, f, null));
		}
		return code;
	}

	public static Code3a genAffect(Operand3a res, ExpAttribute e) {
		Code3a code = e.code;
		res.setOffset(e.place.getOffset());
		code.append(new Inst3a(Inst3a.TAC.COPY,res, e.place,null ));
		return code;
	}

	public static Code3a genRead(VarSymbol var) {
		Code3a code = new Code3a();
		LabelSymbol la = SymbDistrib.builtinRead;
		code.append(new Inst3a(Inst3a.TAC.CALL, var, la, null));
		return code;
	}

	public static Code3a genReturn(ExpAttribute e) {
		Code3a code = e.code;
		code.append(new Inst3a(Inst3a.TAC.RETURN,e.place,null ,null ));
		return code;
	}

	public static Code3a genIfThenElse(ExpAttribute e, Code3a cIf,Code3a cElse, SymbolTable symTab) {
		Code3a code= e.code;
		LabelSymbol labFin = SymbDistrib.newLabel();
		
		if (!cElse.isEmpty()){
			LabelSymbol labElse = SymbDistrib.newLabel();
			code.append(new Inst3a(Inst3a.TAC.IFZ,e.place ,labElse ,null));
			code.append(cIf);	
			code.append(new Inst3a(Inst3a.TAC.GOTO,labFin ,null, null));
			code.append(new Inst3a(Inst3a.TAC.LABEL,labElse ,null, null));
			code.append(cElse);
			code.append(new Inst3a(Inst3a.TAC.LABEL,labFin ,null, null));
		}
		else{
			
			code.append(new Inst3a(Inst3a.TAC.IFZ,e.place ,labFin ,null));
			code.append(cIf);
			code.append(new Inst3a(Inst3a.TAC.LABEL,labFin ,null, null));
		}
		return code;
	}

	public static Code3a genWhile(ExpAttribute e, Code3a c, SymbolTable symTab) {
		Code3a code= new Code3a();
		LabelSymbol labDeb = SymbDistrib.newLabel();
		LabelSymbol labFin = SymbDistrib.newLabel();

		code.append(new Inst3a(Inst3a.TAC.LABEL,labDeb ,null ,null));
		code.append(e.code);																					      // exp.code ==> condition d'arret  est ce necessaire ?
		code.append(new Inst3a(Inst3a.TAC.IFZ,e.place ,labFin ,null));
		code.append(c);						
		code.append(new Inst3a(Inst3a.TAC.GOTO,labDeb ,null, null));
		code.append(new Inst3a(Inst3a.TAC.LABEL,labFin ,null, null));
		
		return code;
	}
	
} // Code3aGenerator ***
