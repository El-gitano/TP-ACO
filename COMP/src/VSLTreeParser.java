// $ANTLR 3.5 ./src/VSLTreeParser.g 2014-12-06 19:11:37

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VSLTreeParser extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASCII", "ASSIGN_KW", "COM", "COMMENT", 
		"DIGIT", "DIV", "DO_KW", "ELSE_KW", "FI_KW", "FUNC_KW", "IDENT", "IF_KW", 
		"INTEGER", "INT_KW", "LB", "LC", "LETTER", "LP", "MINUS", "MUL", "OD_KW", 
		"PLUS", "PRINT_KW", "PROTO_KW", "RB", "RC", "READ_KW", "RETURN_KW", "RP", 
		"TEXT", "THEN_KW", "VOID_KW", "WHILE_KW", "WS", "ARDECL", "ARELEM", "ARRAY", 
		"BLOCK", "BODY", "DECL", "FCALL", "FCALL_S", "INST", "PARAM", "PROG"
	};
	public static final int EOF=-1;
	public static final int ASCII=4;
	public static final int ASSIGN_KW=5;
	public static final int COM=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int DIV=9;
	public static final int DO_KW=10;
	public static final int ELSE_KW=11;
	public static final int FI_KW=12;
	public static final int FUNC_KW=13;
	public static final int IDENT=14;
	public static final int IF_KW=15;
	public static final int INTEGER=16;
	public static final int INT_KW=17;
	public static final int LB=18;
	public static final int LC=19;
	public static final int LETTER=20;
	public static final int LP=21;
	public static final int MINUS=22;
	public static final int MUL=23;
	public static final int OD_KW=24;
	public static final int PLUS=25;
	public static final int PRINT_KW=26;
	public static final int PROTO_KW=27;
	public static final int RB=28;
	public static final int RC=29;
	public static final int READ_KW=30;
	public static final int RETURN_KW=31;
	public static final int RP=32;
	public static final int TEXT=33;
	public static final int THEN_KW=34;
	public static final int VOID_KW=35;
	public static final int WHILE_KW=36;
	public static final int WS=37;
	public static final int ARDECL=38;
	public static final int ARELEM=39;
	public static final int ARRAY=40;
	public static final int BLOCK=41;
	public static final int BODY=42;
	public static final int DECL=43;
	public static final int FCALL=44;
	public static final int FCALL_S=45;
	public static final int INST=46;
	public static final int PARAM=47;
	public static final int PROG=48;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public VSLTreeParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public VSLTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return VSLTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./src/VSLTreeParser.g"; }



	// $ANTLR start "program"
	// ./src/VSLTreeParser.g:10:1: program[SymbolTable symTab] returns [Code3a code] : ^( PROG (u= unit[symTab] )+ ) ;
	public final Code3a program(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a u =null;

		try {
			// ./src/VSLTreeParser.g:11:5: ( ^( PROG (u= unit[symTab] )+ ) )
			// ./src/VSLTreeParser.g:12:2: ^( PROG (u= unit[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,PROG,FOLLOW_PROG_in_program70); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:15:12: (u= unit[symTab] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC_KW||LA1_0==PROTO_KW) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./src/VSLTreeParser.g:15:13: u= unit[symTab]
					{
					pushFollow(FOLLOW_unit_in_program75);
					u=unit(symTab);
					state._fsp--;


						  	code.append(u);
					  	
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "program"



	// $ANTLR start "unit"
	// ./src/VSLTreeParser.g:22:1: unit[SymbolTable symTab] returns [Code3a code] : (c= function[symTab] | proto[symTab] );
	public final Code3a unit(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:23:5: (c= function[symTab] | proto[symTab] )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FUNC_KW) ) {
				alt2=1;
			}
			else if ( (LA2_0==PROTO_KW) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ./src/VSLTreeParser.g:24:2: c= function[symTab]
					{
					pushFollow(FOLLOW_function_in_unit116);
					c=function(symTab);
					state._fsp--;


							code=c;    
					    
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:29:7: proto[symTab]
					{
					pushFollow(FOLLOW_proto_in_unit131);
					proto(symTab);
					state._fsp--;


							code = new Code3a();
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "unit"



	// $ANTLR start "function"
	// ./src/VSLTreeParser.g:35:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW t= type i= IDENT cParm= param_list[symTab] ^( BODY corps= statement[symTab] ) ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		Type t =null;
		Code3a cParm =null;
		Code3a corps =null;

		try {
			// ./src/VSLTreeParser.g:36:4: ( ^( FUNC_KW t= type i= IDENT cParm= param_list[symTab] ^( BODY corps= statement[symTab] ) ) )
			// ./src/VSLTreeParser.g:37:2: ^( FUNC_KW t= type i= IDENT cParm= param_list[symTab] ^( BODY corps= statement[symTab] ) )
			{

					symTab.enterScope();
				
			match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function165); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_function169);
			t=type();
			state._fsp--;

			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function173); 
			pushFollow(FOLLOW_param_list_in_function177);
			cParm=param_list(symTab);
			state._fsp--;

			match(input,BODY,FOLLOW_BODY_in_function181); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_function185);
			corps=statement(symTab);
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 


					FunctionType fType = new FunctionType(t, false);
					FunctionSymbol fs= TypeCheck.checkFuncDecl(i, i.getText(), fType,  symTab);
					
					code = Code3aGenerator.genBeginFunc(fs) ;
					code.append(cParm);
					code.append(corps);
					
					code.append (Code3aGenerator.genEndFunc());
					symTab.leaveScope();
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "function"



	// $ANTLR start "proto"
	// ./src/VSLTreeParser.g:53:1: proto[SymbolTable symTab] : ^( PROTO_KW t= type i= IDENT param_list[symTab] ) ;
	public final void proto(SymbolTable symTab) throws RecognitionException {
		CommonTree i=null;
		Type t =null;

		try {
			// ./src/VSLTreeParser.g:54:2: ( ^( PROTO_KW t= type i= IDENT param_list[symTab] ) )
			// ./src/VSLTreeParser.g:55:2: ^( PROTO_KW t= type i= IDENT param_list[symTab] )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto206); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto210);
			t=type();
			state._fsp--;

			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto214); 
			pushFollow(FOLLOW_param_list_in_proto216);
			param_list(symTab);
			state._fsp--;

			match(input, Token.UP, null); 


					FunctionType fType = new FunctionType(t, false);
					FunctionSymbol ps= TypeCheck.checkProtoDecl(i, i.getText(), fType,symTab);
					symTab.insert(i.getText(), ps);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proto"



	// $ANTLR start "type"
	// ./src/VSLTreeParser.g:62:1: type returns [Type t] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type t = null;


		try {
			// ./src/VSLTreeParser.g:63:5: ( INT_KW | VOID_KW )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INT_KW) ) {
				alt3=1;
			}
			else if ( (LA3_0==VOID_KW) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ./src/VSLTreeParser.g:63:7: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type238); 
					 t = Type.INT; 
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:64:7: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type249); 
					 t = Type.VOID; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "type"



	// $ANTLR start "param_list"
	// ./src/VSLTreeParser.g:67:1: param_list[SymbolTable symTab] returns [Code3a code] : ^( PARAM (c= param[symTab] )* ) ;
	public final Code3a param_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:68:5: ( ^( PARAM (c= param[symTab] )* ) )
			// ./src/VSLTreeParser.g:69:2: ^( PARAM (c= param[symTab] )* )
			{

					code = new Code3a();
				
			match(input,PARAM,FOLLOW_PARAM_in_param_list280); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:72:10: (c= param[symTab] )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IDENT) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// ./src/VSLTreeParser.g:72:11: c= param[symTab]
						{
						pushFollow(FOLLOW_param_in_param_list285);
						c=param(symTab);
						state._fsp--;


						    	code.append(c);
						    
						}
						break;

					default :
						break loop4;
					}
				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "param_list"



	// $ANTLR start "param"
	// ./src/VSLTreeParser.g:80:1: param[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a param(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:81:5: (i= IDENT )
			// ./src/VSLTreeParser.g:81:7: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param328); 

			    	VarSymbol vs = TypeCheck.checkAndDeclParmIdent(i,i.getText(),symTab);
			    	symTab.insert(i.getText(),vs);
			    	code = Code3aGenerator.genVar(vs) ;
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "param"



	// $ANTLR start "statement"
	// ./src/VSLTreeParser.g:89:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e= expression[symTab] i= IDENT ) | ^( RETURN_KW e= expression[symTab] ) | ^( PRINT_KW c= print_list[symTab] ) | ^( READ_KW c= read_list[symTab] ) | ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? ) | ^( WHILE_KW e= expression[symTab] c= statement[symTab] ) | ^( FCALL_S i= IDENT (c= argument_list[symTab] )? ) |c= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		ExpAttribute e =null;
		Code3a c =null;
		Code3a cIf =null;
		Code3a cElse =null;

		try {
			// ./src/VSLTreeParser.g:90:5: ( ^( ASSIGN_KW e= expression[symTab] i= IDENT ) | ^( RETURN_KW e= expression[symTab] ) | ^( PRINT_KW c= print_list[symTab] ) | ^( READ_KW c= read_list[symTab] ) | ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? ) | ^( WHILE_KW e= expression[symTab] c= statement[symTab] ) | ^( FCALL_S i= IDENT (c= argument_list[symTab] )? ) |c= block[symTab] )
			int alt7=8;
			switch ( input.LA(1) ) {
			case ASSIGN_KW:
				{
				alt7=1;
				}
				break;
			case RETURN_KW:
				{
				alt7=2;
				}
				break;
			case PRINT_KW:
				{
				alt7=3;
				}
				break;
			case READ_KW:
				{
				alt7=4;
				}
				break;
			case IF_KW:
				{
				alt7=5;
				}
				break;
			case WHILE_KW:
				{
				alt7=6;
				}
				break;
			case FCALL_S:
				{
				alt7=7;
				}
				break;
			case BLOCK:
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ./src/VSLTreeParser.g:90:7: ^( ASSIGN_KW e= expression[symTab] i= IDENT )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement358); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement362);
					e=expression(symTab);
					state._fsp--;

					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement367); 
					match(input, Token.UP, null); 

						
					    	// test si deja presente dans la table des symboles	
							Operand3a test  = symTab.lookup(i.getText());
							
							if (  test  ==null){
								System.err.println("ERREUR: Affectation :Variable " + i.getText() +" non presente dans la table des symboles");
								symTab.print();
								System.exit(1);
							}
							code = Code3aGenerator.genAffect( test,e);
					        		
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:109:7: ^( RETURN_KW e= expression[symTab] )
					{
					match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement389); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement393);
					e=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code= Code3aGenerator.genReturn(e);
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:113:7: ^( PRINT_KW c= print_list[symTab] )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement410); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_print_list_in_statement414);
					c=print_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code=c;
					    
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:117:7: ^( READ_KW c= read_list[symTab] )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement431); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_read_list_in_statement435);
					c=read_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code=c;
					    
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:121:7: ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement452); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement456);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement461);
					cIf=statement(symTab);
					state._fsp--;

					// ./src/VSLTreeParser.g:121:58: (cElse= statement[symTab] )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN_KW||LA5_0==IF_KW||LA5_0==PRINT_KW||(LA5_0 >= READ_KW && LA5_0 <= RETURN_KW)||LA5_0==WHILE_KW||LA5_0==BLOCK||LA5_0==FCALL_S) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ./src/VSLTreeParser.g:121:59: cElse= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement467);
							cElse=statement(symTab);
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					    	if (cElse==null)
					    		code = 	Code3aGenerator.genIfThenElse(e, cIf, new Code3a(),symTab);
					    	else
					    		code = 	Code3aGenerator.genIfThenElse(e, cIf, cElse ,symTab);
					    
					}
					break;
				case 6 :
					// ./src/VSLTreeParser.g:128:7: ^( WHILE_KW e= expression[symTab] c= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement487); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement491);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement497);
					c=statement(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = Code3aGenerator.genWhile(e, c, symTab); 
					    
					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:132:7: ^( FCALL_S i= IDENT (c= argument_list[symTab] )? )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement515); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement519); 
					// ./src/VSLTreeParser.g:132:26: (c= argument_list[symTab] )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==DIV||LA6_0==IDENT||LA6_0==INTEGER||(LA6_0 >= MINUS && LA6_0 <= MUL)||LA6_0==PLUS||LA6_0==FCALL) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/VSLTreeParser.g:132:26: c= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_statement523);
							c=argument_list(symTab);
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					    	code = Code3aGenerator.genFuncCall(c, i.getText(), null, symTab);
					    
					}
					break;
				case 8 :
					// ./src/VSLTreeParser.g:136:7: c= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement542);
					c=block(symTab);
					state._fsp--;


					    	code=c;
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "statement"



	// $ANTLR start "block"
	// ./src/VSLTreeParser.g:142:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] ) | ^( BLOCK c= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a cDecl =null;
		Code3a cInst =null;
		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:143:5: ( ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] ) | ^( BLOCK c= inst_list[symTab] ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BLOCK) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==DOWN) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==DECL) ) {
						alt8=1;
					}
					else if ( (LA8_2==INST) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ./src/VSLTreeParser.g:144:5: ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] )
					{

					    	symTab.enterScope();
					    
					match(input,BLOCK,FOLLOW_BLOCK_in_block585); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block589);
					cDecl=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block594);
					cInst=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	
					    	code=cDecl;
					    	code.append(cInst);
					    	symTab.leaveScope();
							
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:155:7: ^( BLOCK c= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block611); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block615);
					c=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	
					    	code=c;
					    	symTab.leaveScope();
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "block"



	// $ANTLR start "array_elem"
	// ./src/VSLTreeParser.g:163:1: array_elem[SymbolTable symTab] returns [Code3a code] : ^( ARELEM i= IDENT e= expression[symTab] ) ;
	public final Code3a array_elem(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:164:5: ( ^( ARELEM i= IDENT e= expression[symTab] ) )
			// ./src/VSLTreeParser.g:164:7: ^( ARELEM i= IDENT e= expression[symTab] )
			{
			match(input,ARELEM,FOLLOW_ARELEM_in_array_elem649); 
			match(input, Token.DOWN, null); 
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_array_elem654); 
			pushFollow(FOLLOW_expression_in_array_elem658);
			e=expression(symTab);
			state._fsp--;

			match(input, Token.UP, null); 


			    	code=new Code3a();
			    	System.err.println("ERREUR: array_elem a faire");
			    	System.exit(1);	
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "array_elem"



	// $ANTLR start "inst_list"
	// ./src/VSLTreeParser.g:172:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (c= statement[symTab] )+ ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:173:5: ( ^( INST (c= statement[symTab] )+ ) )
			// ./src/VSLTreeParser.g:174:2: ^( INST (c= statement[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,INST,FOLLOW_INST_in_inst_list694); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:177:9: (c= statement[symTab] )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ASSIGN_KW||LA9_0==IF_KW||LA9_0==PRINT_KW||(LA9_0 >= READ_KW && LA9_0 <= RETURN_KW)||LA9_0==WHILE_KW||LA9_0==BLOCK||LA9_0==FCALL_S) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./src/VSLTreeParser.g:177:10: c= statement[symTab]
					{
					pushFollow(FOLLOW_statement_in_inst_list699);
					c=statement(symTab);
					state._fsp--;


					    	code.append(c);
					    
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "inst_list"



	// $ANTLR start "expression"
	// ./src/VSLTreeParser.g:185:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:186:3: ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary[symTab] )
			int alt10=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt10=1;
				}
				break;
			case MUL:
				{
				alt10=2;
				}
				break;
			case DIV:
				{
				alt10=3;
				}
				break;
			case MINUS:
				{
				alt10=4;
				}
				break;
			case IDENT:
			case INTEGER:
			case FCALL:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// ./src/VSLTreeParser.g:186:5: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression739); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression743);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression748);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.ADD, e1, e2, temp);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:193:4: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression763); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression767);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression772);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.MUL, e1, e2, temp);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:200:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression787); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression791);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression796);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.DIV, e1, e2, temp);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:207:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression811); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression815);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression820);
					e2=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 

					 
					      Type ty = TypeCheck.checkBinOp(e1.type, e2.type);
					      VarSymbol temp = SymbDistrib.newTemp();
					      Code3a cod = Code3aGenerator.genBinOp(Inst3a.TAC.SUB, e1, e2, temp);
					      expAtt = new ExpAttribute(ty, cod, temp);
					    
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:214:5: pe= primary[symTab]
					{
					pushFollow(FOLLOW_primary_in_expression837);
					pe=primary(symTab);
					state._fsp--;


					    	expAtt = pe; 
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "expression"



	// $ANTLR start "primary"
	// ./src/VSLTreeParser.g:222:1: primary[SymbolTable symTab] returns [ExpAttribute expAtt] : (i= INTEGER |i= IDENT | ^( FCALL i= IDENT (ctmp= argument_list[symTab] )? ) );
	public final ExpAttribute primary(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree i=null;
		Code3a ctmp =null;

		try {
			// ./src/VSLTreeParser.g:223:2: (i= INTEGER |i= IDENT | ^( FCALL i= IDENT (ctmp= argument_list[symTab] )? ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt12=1;
				}
				break;
			case IDENT:
				{
				alt12=2;
				}
				break;
			case FCALL:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// ./src/VSLTreeParser.g:223:4: i= INTEGER
					{
					i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary864); 

							ConstSymbol cs = new ConstSymbol(Integer.parseInt(i.getText()));
							expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:228:4: i= IDENT
					{
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary877); 

					      Operand3a id = symTab.lookup(i.getText());
					      if (id ==null){
					      	System.err.println("ERREUR: Variable " + i.getText() +" non presente dans la table de symbole");
					      	symTab.print();
					      	System.exit(1);
					      }
					      expAtt = new ExpAttribute(id.type, new Code3a(), symTab.lookup(i.getText()));
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:239:2: ^( FCALL i= IDENT (ctmp= argument_list[symTab] )? )
					{

							Code3a c = new Code3a();
							Code3a cArg = new Code3a();
						
					match(input,FCALL,FOLLOW_FCALL_in_primary894); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary898); 
					// ./src/VSLTreeParser.g:243:18: (ctmp= argument_list[symTab] )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==DIV||LA11_0==IDENT||LA11_0==INTEGER||(LA11_0 >= MINUS && LA11_0 <= MUL)||LA11_0==PLUS||LA11_0==FCALL) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// ./src/VSLTreeParser.g:243:19: ctmp= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_primary903);
							ctmp=argument_list(symTab);
							state._fsp--;


									cArg.append(ctmp);
								
							}
							break;

					}

					match(input, Token.UP, null); 

					 	
							
							VarSymbol varRetour = SymbDistrib.newTemp();
					        c.append(Code3aGenerator.genFuncCall(cArg,i.getText(),varRetour,symTab) );
					        expAtt = new ExpAttribute(Type.INT, c, varRetour);
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expAtt;
	}
	// $ANTLR end "primary"



	// $ANTLR start "argument_list"
	// ./src/VSLTreeParser.g:256:1: argument_list[SymbolTable symTab] returns [Code3a code] : (e= expression[symTab] )+ ;
	public final Code3a argument_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:257:5: ( (e= expression[symTab] )+ )
			// ./src/VSLTreeParser.g:258:5: (e= expression[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:261:2: (e= expression[symTab] )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIV||LA13_0==IDENT||LA13_0==INTEGER||(LA13_0 >= MINUS && LA13_0 <= MUL)||LA13_0==PLUS||LA13_0==FCALL) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./src/VSLTreeParser.g:261:3: e= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list953);
					e=expression(symTab);
					state._fsp--;


							code.append(Code3aGenerator.genArg(e.place));
						
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "argument_list"



	// $ANTLR start "print_list"
	// ./src/VSLTreeParser.g:268:1: print_list[SymbolTable symTab] returns [Code3a code] : (c= print_item[symTab] )+ ;
	public final Code3a print_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:269:5: ( (c= print_item[symTab] )+ )
			// ./src/VSLTreeParser.g:270:2: (c= print_item[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:273:2: (c= print_item[symTab] )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIV||LA14_0==IDENT||LA14_0==INTEGER||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS||LA14_0==TEXT||LA14_0==FCALL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ./src/VSLTreeParser.g:273:3: c= print_item[symTab]
					{
					pushFollow(FOLLOW_print_item_in_print_list991);
					c=print_item(symTab);
					state._fsp--;


					    	code.append(c);
					    
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "print_list"



	// $ANTLR start "print_item"
	// ./src/VSLTreeParser.g:281:1: print_item[SymbolTable symTab] returns [Code3a code] : (s= TEXT |e= expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree s=null;
		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:282:5: (s= TEXT |e= expression[symTab] )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==TEXT) ) {
				alt15=1;
			}
			else if ( (LA15_0==DIV||LA15_0==IDENT||LA15_0==INTEGER||(LA15_0 >= MINUS && LA15_0 <= MUL)||LA15_0==PLUS||LA15_0==FCALL) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:282:7: s= TEXT
					{
					s=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item1032); 
							
					    	code = Code3aGenerator.genPrintS(new Data3a(s.getText()));
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:286:7: e= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item1048);
					e=expression(symTab);
					state._fsp--;


					    	code=e.code;
					    	code.append( Code3aGenerator.genPrintInt(e.place));    	
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "print_item"



	// $ANTLR start "read_list"
	// ./src/VSLTreeParser.g:293:1: read_list[SymbolTable symTab] returns [Code3a code] : (c= read_item[symTab] )+ ;
	public final Code3a read_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:294:5: ( (c= read_item[symTab] )+ )
			// ./src/VSLTreeParser.g:295:5: (c= read_item[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:298:2: (c= read_item[symTab] )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==IDENT) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ./src/VSLTreeParser.g:298:3: c= read_item[symTab]
					{
					pushFollow(FOLLOW_read_item_in_read_list1093);
					c=read_item(symTab);
					state._fsp--;


					    	code.append(c);
					    
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "read_list"



	// $ANTLR start "read_item"
	// ./src/VSLTreeParser.g:305:1: read_item[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:306:5: (i= IDENT )
			// ./src/VSLTreeParser.g:307:5: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item1137); 

			    VarSymbol var = (VarSymbol) symTab.lookup(i.getText());
			    if (var== null){
			       System.err.println("ERREUR : Variable " + i.getText() + " non présente dans la table des symboles");
			       System.exit(1);
			    }
			    code= Code3aGenerator.genRead(var);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "read_item"



	// $ANTLR start "declaration"
	// ./src/VSLTreeParser.g:324:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (c= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:325:5: ( ^( DECL (c= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:326:5: ^( DECL (c= decl_item[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,DECL,FOLLOW_DECL_in_declaration1187); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:329:12: (c= decl_item[symTab] )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==IDENT) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ./src/VSLTreeParser.g:329:13: c= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration1192);
					c=decl_item(symTab);
					state._fsp--;


					    	
					   		code.append(c);
					   		
					   		
					    
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "decl_item"
	// ./src/VSLTreeParser.g:340:1: decl_item[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:341:5: (i= IDENT )
			// ./src/VSLTreeParser.g:341:8: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item1235); 

			    	
			        VarSymbol  vs = TypeCheck.checkAndDeclIdent(i,i.getText(),Type.INT,symTab);
			    	
			    	code = Code3aGenerator.genVar(vs);
			    	
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "decl_item"

	// Delegated rules



	public static final BitSet FOLLOW_PROG_in_program70 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unit_in_program75 = new BitSet(new long[]{0x0000000008002008L});
	public static final BitSet FOLLOW_function_in_unit116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proto_in_unit131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_KW_in_function165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_function169 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_function173 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_function177 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_BODY_in_function181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_function185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto206 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto210 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto214 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_proto216 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list285 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_param328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement362 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_statement367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement389 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_list_in_statement414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_KW_in_statement431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_list_in_statement435 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement456 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement461 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement467 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement491 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement519 = new BitSet(new long[]{0x0000100002C14208L});
	public static final BitSet FOLLOW_argument_list_in_statement523 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block589 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARELEM_in_array_elem649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_array_elem654 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_array_elem658 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list699 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_PLUS_in_expression739 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression743 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression748 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression763 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression772 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression787 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression791 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression811 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression815 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_in_expression837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FCALL_in_primary894 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_primary898 = new BitSet(new long[]{0x0000100002C14208L});
	public static final BitSet FOLLOW_argument_list_in_primary903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_argument_list953 = new BitSet(new long[]{0x0000100002C14202L});
	public static final BitSet FOLLOW_print_item_in_print_list991 = new BitSet(new long[]{0x0000100202C14202L});
	public static final BitSet FOLLOW_TEXT_in_print_item1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_item_in_read_list1093 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_IDENT_in_read_item1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECL_in_declaration1187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration1192 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item1235 = new BitSet(new long[]{0x0000000000000002L});
}
