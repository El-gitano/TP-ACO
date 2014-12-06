tree grammar VSLTreeParser;

options {
  language     = Java;
  tokenVocab   = VSLParser;
  ASTLabelType = CommonTree;
}


program[SymbolTable symTab] returns [Code3a code]
    :  
	{
		code = new Code3a();
	}
    ^(PROG (u=unit[symTab]
    {
	  	code.append(u);
  	}
  	)+ )
  	;

unit[SymbolTable symTab] returns [Code3a code]
    :
	c = function[symTab]
    {
		code=c;    
    
    }
    | proto[symTab]
    {
		code = new Code3a();
	}
    ;

function [SymbolTable symTab] returns [Code3a code]
   :
	{
		symTab.enterScope();
	}
	^(FUNC_KW t=type i=IDENT cParm=param_list[symTab] ^(BODY corps=statement[symTab]))
	{
		FunctionType fType = new FunctionType(t, false);
		FunctionSymbol fs= TypeCheck.checkFuncDecl(i, i.getText(), fType,  symTab);
		
		code = Code3aGenerator.genBeginFunc(fs) ;
		code.append(cParm);
		code.append(corps);
		
		code.append (Code3aGenerator.genEndFunc());
		symTab.leaveScope();
	}
	;
proto [SymbolTable symTab] 
	:
	^(PROTO_KW t=type i=IDENT param_list[symTab])
	{
		FunctionType fType = new FunctionType(t, false);
		FunctionSymbol ps= TypeCheck.checkProtoDecl(i, i.getText(), fType,symTab);
		symTab.insert(i.getText(), ps);
	}
	;
type returns [Type t]
    : INT_KW  { t = Type.INT; }
    | VOID_KW { t = Type.VOID; }
    ;

param_list [SymbolTable symTab] returns [Code3a code]
    : 
	{
		code = new Code3a();
	}
	^(PARAM (c=param[symTab]
	{
    	code.append(c);
    }
    )* )
    
    ;

param [SymbolTable symTab] returns [Code3a code]
    : i=IDENT
    {
    	VarSymbol vs = TypeCheck.checkAndDeclParmIdent(i,i.getText(),symTab);
    	symTab.insert(i.getText(),vs);
    	code = Code3aGenerator.genVar(vs) ;
    }
    ;

statement [SymbolTable symTab] returns [Code3a code]
    : ^(ASSIGN_KW e=expression[symTab] i=IDENT)
    {	
    	// test si deja presente dans la table des symboles	
		Operand3a test  = symTab.lookup(i.getText());
		
		if (  test  ==null){
			System.err.println("ERREUR: Affectation :Variable " + i.getText() +" non presente dans la table des symboles");
			symTab.print();
			System.exit(1);
		}
		code = Code3aGenerator.genAffect( test,e);
        		
    }
    /*| ^(ASSIGN_KW e=expression[symTab] c=array_elem[symTab])
    {
    	code=new Code3a();
    	System.err.println("ERREUR: ASSIGN_KW array_elem a faire");
    	System.exit(1);	
    }non deterministe*/
    | ^(RETURN_KW e=expression[symTab])
    {
    	code= Code3aGenerator.genReturn(e);
    }
    | ^(PRINT_KW c=print_list[symTab])
    {
    	code=c;
    }
    | ^(READ_KW c=read_list[symTab])
    {
    	code=c;
    }
    | ^(IF_KW e=expression[symTab] cIf=statement[symTab] (cElse=statement[symTab])? )
    {
    	if (cElse==null)
    		code = 	Code3aGenerator.genIfThenElse(e, cIf, new Code3a(),symTab);
    	else
    		code = 	Code3aGenerator.genIfThenElse(e, cIf, cElse ,symTab);
    }
    | ^(WHILE_KW e=expression[symTab]  c=statement[symTab] )
    {
    	code = Code3aGenerator.genWhile(e, c, symTab); 
    }
    | ^(FCALL_S i=IDENT c=argument_list[symTab]?)
    {
    	code = Code3aGenerator.genFuncCall(c, i.getText(), null, symTab);
    }
    | c=block [symTab]
    {
    	code=c;
    }
    ;

block [SymbolTable symTab] returns [Code3a code]
    : 
    {
    	symTab.enterScope();
    }
    ^(BLOCK cDecl=declaration[symTab] cInst=inst_list[symTab])
    {
    	
    	code=cDecl;
    	code.append(cInst);
    	symTab.leaveScope();
		
    }
    | ^(BLOCK c=inst_list[symTab])
    {
    	
    	code=c;
    	symTab.leaveScope();
    }
    ; 
 
array_elem [SymbolTable symTab] returns [Code3a code]
    : ^(ARELEM  i=IDENT e=expression[symTab])
    {
    	code=new Code3a();
    	System.err.println("ERREUR: array_elem a faire");
    	System.exit(1);	
    }
    ;

inst_list[SymbolTable symTab] returns [Code3a code]
    : 
	{
		code = new Code3a();
	}
	^(INST (c=statement[symTab]
	{
    	code.append(c);
    }
    )+ )
    
    ;

expression [SymbolTable symTab] returns [ExpAttribute expAtt]
  : ^(PLUS e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.ADD, e1, e2, temp);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |^(MUL e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.MUL, e1, e2, temp);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |^(DIV e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.DIV, e1, e2, temp);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  |^(MINUS e1=expression[symTab] e2=expression[symTab]) 
    { 
      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
      VarSymbol temp = SymbDistrib.newTemp();
      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.SUB, e1, e2, temp);
      expAtt = new ExpAttribute(ty, cod, temp);
    }
  | pe=primary[symTab] 
	{
    	expAtt = pe; 
    }
  ;



primary [SymbolTable symTab] returns [ExpAttribute expAtt]
	: i=INTEGER
    {
		ConstSymbol cs = new ConstSymbol(Integer.parseInt(i.getText()));
		expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
	}
	| i=IDENT
    {
      Operand3a id = symTab.lookup(i.getText());
      if (id ==null){
      	System.err.println("ERREUR: Variable " + i.getText() +" non presente dans la table de symbole");
      	symTab.print();
      	System.exit(1);
      }
      expAtt = new ExpAttribute(id.type, new Code3a(), symTab.lookup(i.getText()));
    }
	| 
	{
		Code3a c = new Code3a();
		Code3a cArg = new Code3a();
	}
	^(FCALL i=IDENT (ctmp=argument_list[symTab]
	{
		cArg.append(ctmp);
	}  
  	)? )
	{ 	
		
		VarSymbol varRetour = SymbDistrib.newTemp();
        c.append(Code3aGenerator.genFuncCall(cArg,i.getText(),varRetour,symTab) );
        expAtt = new ExpAttribute(Type.INT, c, varRetour);
	}
  ;
  
argument_list[SymbolTable symTab] returns [Code3a code]
    : 
    {
		code = new Code3a();
	}
	(e=expression[symTab]
	{
		code.append(Code3aGenerator.genArg(e.place));
	}
	)+
	;
  
print_list [SymbolTable symTab] returns [Code3a code]
    : 
	{
		code = new Code3a();
	}
	(c=print_item[symTab]
	{
    	code.append(c);
    }
    )+
    
    ;

print_item [SymbolTable symTab] returns [Code3a code]
    : s=TEXT
    {		
    	code = Code3aGenerator.genPrintS(new Data3a(s.getText()));
    }
    | e=expression[symTab]
    {
    	code=e.code;
    	code.append( Code3aGenerator.genPrintInt(e.place));    	
    }
    ;
    
read_list [SymbolTable symTab] returns [Code3a code]
    : 
    {
		code = new Code3a();
	}
	(c=read_item[symTab]
	{
    	code.append(c);
    }
    )+
    ;
    
read_item [SymbolTable symTab] returns [Code3a code]
    :
    i=IDENT
    {
    VarSymbol var = (VarSymbol) symTab.lookup(i.getText());
    if (var== null){
       System.err.println("ERREUR : Variable " + i.getText() + " non présente dans la table des symboles");
       System.exit(1);
    }
    code= Code3aGenerator.genRead(var);
	}
	

    /*| c=array_elem[symTab]
    {
    	code=c;
    }*/
    ;

declaration [SymbolTable symTab] returns [Code3a code]
    :
    {
		code = new Code3a();
	} 
    ^(DECL (c=decl_item[symTab]
    {
    	
   		code.append(c);
   		
   		
    }
    )+ )
    ;


decl_item [SymbolTable symTab] returns [Code3a code]
    :  i=IDENT
    {
    	
        VarSymbol  vs = TypeCheck.checkAndDeclIdent(i,i.getText(),Type.INT,symTab);
    	
    	code = Code3aGenerator.genVar(vs);
    	
    }
   /* | i=IDENT cons=INTEGER
    {
    	int s = symTab.getScope();
    	Operand3a test= symTab.lookup(i.getText());
    	 
    	// test si deja presente dans la table des symboles	
    	if(test != null ){
    		// test du rang
    		if (s == test.getScope()){
        		System.err.println("ERREUR : Decalartion et affectation : Variable " + i.getText() + " deja presente dans la table des symboles");
        		symTab.print();
        		System.exit(1);
        	}
        }
        VarSymbol  vs = new VarSymbol(Type.INT, i.getText(), s);
        symTab.insert(i.getText(),vs);
    	code = Code3aGenerator.genVar(vs);
    	
    	code.append(Code3aGenerator.genAffect( test,cons));
    }*/
    ;




