// $ANTLR 3.5 ./src/VSLTreeParser.g 2014-12-04 11:28:04

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
	// ./src/VSLTreeParser.g:35:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW t= type i= IDENT param_list[symTab] ^( BODY corps= statement[symTab] ) ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		Type t =null;
		Code3a corps =null;

		try {
			// ./src/VSLTreeParser.g:36:4: ( ^( FUNC_KW t= type i= IDENT param_list[symTab] ^( BODY corps= statement[symTab] ) ) )
			// ./src/VSLTreeParser.g:37:2: ^( FUNC_KW t= type i= IDENT param_list[symTab] ^( BODY corps= statement[symTab] ) )
			{

					symTab.enterScope();
				
			match(input,FUNC_KW,FOLLOW_FUNC_KW_in_function165); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_function169);
			t=type();
			state._fsp--;

			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_function173); 
			pushFollow(FOLLOW_param_list_in_function175);
			param_list(symTab);
			state._fsp--;

			match(input,BODY,FOLLOW_BODY_in_function179); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_function183);
			corps=statement(symTab);
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 


					FunctionType fType = new FunctionType(t, false);
					FunctionSymbol fs= TypeCheck.checkFuncDecl(i, i.getText(), fType,  symTab);
					
					code = Code3aGenerator.genBeginFunc(fs) ;
					
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
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto204); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto208);
			t=type();
			state._fsp--;

			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto212); 
			pushFollow(FOLLOW_param_list_in_proto214);
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
					match(input,INT_KW,FOLLOW_INT_KW_in_type236); 
					 t = Type.INT; 
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:64:7: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type247); 
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
				
			match(input,PARAM,FOLLOW_PARAM_in_param_list278); 
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
						pushFollow(FOLLOW_param_in_param_list283);
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
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param326); 

			    	VarSymbol vs = TypeCheck.checkAndDeclParmIdent(i,i.getText(),symTab);
			    	code = Code3aGenerator.genArg(vs) ;
			    
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
	// ./src/VSLTreeParser.g:88:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e= expression[symTab] i= IDENT ) | ^( RETURN_KW e= expression[symTab] ) | ^( PRINT_KW c= print_list[symTab] ) | ^( READ_KW c= read_list[symTab] ) | ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? ) | ^( WHILE_KW e= expression[symTab] c= statement[symTab] ) | ^( FCALL_S i= IDENT (c= argument_list[symTab] )? ) |c= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		ExpAttribute e =null;
		Code3a c =null;
		Code3a cIf =null;
		Code3a cElse =null;

		try {
			// ./src/VSLTreeParser.g:89:5: ( ^( ASSIGN_KW e= expression[symTab] i= IDENT ) | ^( RETURN_KW e= expression[symTab] ) | ^( PRINT_KW c= print_list[symTab] ) | ^( READ_KW c= read_list[symTab] ) | ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? ) | ^( WHILE_KW e= expression[symTab] c= statement[symTab] ) | ^( FCALL_S i= IDENT (c= argument_list[symTab] )? ) |c= block[symTab] )
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
					// ./src/VSLTreeParser.g:89:7: ^( ASSIGN_KW e= expression[symTab] i= IDENT )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement356); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement360);
					e=expression(symTab);
					state._fsp--;

					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement365); 
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
					// ./src/VSLTreeParser.g:108:7: ^( RETURN_KW e= expression[symTab] )
					{
					match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement387); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement391);
					e=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code= Code3aGenerator.genReturn(e);
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:112:7: ^( PRINT_KW c= print_list[symTab] )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement408); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_print_list_in_statement412);
					c=print_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code=c;
					    
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:116:7: ^( READ_KW c= read_list[symTab] )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement429); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_read_list_in_statement433);
					c=read_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code=c;
					    
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:120:7: ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement450); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement454);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement459);
					cIf=statement(symTab);
					state._fsp--;

					// ./src/VSLTreeParser.g:120:58: (cElse= statement[symTab] )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN_KW||LA5_0==IF_KW||LA5_0==PRINT_KW||(LA5_0 >= READ_KW && LA5_0 <= RETURN_KW)||LA5_0==WHILE_KW||LA5_0==BLOCK||LA5_0==FCALL_S) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ./src/VSLTreeParser.g:120:59: cElse= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement465);
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
					// ./src/VSLTreeParser.g:127:7: ^( WHILE_KW e= expression[symTab] c= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement485); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement489);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement495);
					c=statement(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = Code3aGenerator.genWhile(e, c, symTab); 
					    
					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:131:7: ^( FCALL_S i= IDENT (c= argument_list[symTab] )? )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement513); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement517); 
					// ./src/VSLTreeParser.g:131:26: (c= argument_list[symTab] )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==DIV||LA6_0==IDENT||LA6_0==INTEGER||(LA6_0 >= MINUS && LA6_0 <= MUL)||LA6_0==PLUS) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/VSLTreeParser.g:131:26: c= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_statement521);
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
					// ./src/VSLTreeParser.g:135:7: c= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement540);
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
	// ./src/VSLTreeParser.g:141:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] ) | ^( BLOCK c= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a cDecl =null;
		Code3a cInst =null;
		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:142:5: ( ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] ) | ^( BLOCK c= inst_list[symTab] ) )
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
					// ./src/VSLTreeParser.g:143:5: ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] )
					{

					    	symTab.enterScope();
					    
					match(input,BLOCK,FOLLOW_BLOCK_in_block583); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block587);
					cDecl=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block592);
					cInst=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	
					    	code=cDecl;
					    	code.append(cInst);
					    	symTab.leaveScope();
							
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:154:7: ^( BLOCK c= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block609); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block613);
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
	// ./src/VSLTreeParser.g:162:1: array_elem[SymbolTable symTab] returns [Code3a code] : ^( ARELEM i= IDENT e= expression[symTab] ) ;
	public final Code3a array_elem(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:163:5: ( ^( ARELEM i= IDENT e= expression[symTab] ) )
			// ./src/VSLTreeParser.g:163:7: ^( ARELEM i= IDENT e= expression[symTab] )
			{
			match(input,ARELEM,FOLLOW_ARELEM_in_array_elem647); 
			match(input, Token.DOWN, null); 
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_array_elem652); 
			pushFollow(FOLLOW_expression_in_array_elem656);
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
	// ./src/VSLTreeParser.g:171:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (c= statement[symTab] )+ ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:172:5: ( ^( INST (c= statement[symTab] )+ ) )
			// ./src/VSLTreeParser.g:173:2: ^( INST (c= statement[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,INST,FOLLOW_INST_in_inst_list692); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:176:9: (c= statement[symTab] )+
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
					// ./src/VSLTreeParser.g:176:10: c= statement[symTab]
					{
					pushFollow(FOLLOW_statement_in_inst_list697);
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
	// ./src/VSLTreeParser.g:184:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:185:3: ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary[symTab] )
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
					// ./src/VSLTreeParser.g:185:5: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression737); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression741);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression746);
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
					// ./src/VSLTreeParser.g:192:4: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression761); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression765);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression770);
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
					// ./src/VSLTreeParser.g:199:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression785); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression789);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression794);
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
					// ./src/VSLTreeParser.g:206:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression809); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression813);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression818);
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
					// ./src/VSLTreeParser.g:213:5: pe= primary[symTab]
					{
					pushFollow(FOLLOW_primary_in_expression835);
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
	// ./src/VSLTreeParser.g:221:1: primary[SymbolTable symTab] returns [ExpAttribute expAtt] : ( INTEGER | IDENT );
	public final ExpAttribute primary(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree INTEGER1=null;
		CommonTree IDENT2=null;

		try {
			// ./src/VSLTreeParser.g:222:3: ( INTEGER | IDENT )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INTEGER) ) {
				alt11=1;
			}
			else if ( (LA11_0==IDENT) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// ./src/VSLTreeParser.g:222:5: INTEGER
					{
					INTEGER1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary861); 

					      ConstSymbol cs = new ConstSymbol(Integer.parseInt((INTEGER1!=null?INTEGER1.getText():null)));
					      expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:227:5: IDENT
					{
					IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary873); 

					      Operand3a id = symTab.lookup((IDENT2!=null?IDENT2.getText():null));
					      expAtt = new ExpAttribute(id.type, new Code3a(), symTab.lookup((IDENT2!=null?IDENT2.getText():null)));
					    
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
	// ./src/VSLTreeParser.g:234:1: argument_list[SymbolTable symTab] returns [Code3a code] : (e= expression[symTab] )+ ;
	public final Code3a argument_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:235:5: ( (e= expression[symTab] )+ )
			// ./src/VSLTreeParser.g:236:5: (e= expression[symTab] )+
			{

					code = new Code3a();
					System.err.println("ERREUR: array_elem a faire");
					System.exit(1);	
				
			// ./src/VSLTreeParser.g:241:2: (e= expression[symTab] )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIV||LA12_0==IDENT||LA12_0==INTEGER||(LA12_0 >= MINUS && LA12_0 <= MUL)||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./src/VSLTreeParser.g:241:3: e= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list912);
					e=expression(symTab);
					state._fsp--;


							
						
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
	// ./src/VSLTreeParser.g:248:1: print_list[SymbolTable symTab] returns [Code3a code] : (c= print_item[symTab] )+ ;
	public final Code3a print_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:249:5: ( (c= print_item[symTab] )+ )
			// ./src/VSLTreeParser.g:250:2: (c= print_item[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:253:2: (c= print_item[symTab] )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIV||LA13_0==IDENT||LA13_0==INTEGER||(LA13_0 >= MINUS && LA13_0 <= MUL)||LA13_0==PLUS||LA13_0==TEXT) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./src/VSLTreeParser.g:253:3: c= print_item[symTab]
					{
					pushFollow(FOLLOW_print_item_in_print_list950);
					c=print_item(symTab);
					state._fsp--;


					    	code.append(c);
					    
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
	// $ANTLR end "print_list"



	// $ANTLR start "print_item"
	// ./src/VSLTreeParser.g:261:1: print_item[SymbolTable symTab] returns [Code3a code] : (s= TEXT |e= expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree s=null;
		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:262:5: (s= TEXT |e= expression[symTab] )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TEXT) ) {
				alt14=1;
			}
			else if ( (LA14_0==DIV||LA14_0==IDENT||LA14_0==INTEGER||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// ./src/VSLTreeParser.g:262:7: s= TEXT
					{
					s=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item991); 
							
					    	code = Code3aGenerator.genPrintS(new Data3a(s.getText()));
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:266:7: e= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item1007);
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
	// ./src/VSLTreeParser.g:273:1: read_list[SymbolTable symTab] returns [Code3a code] : (c= read_item[symTab] )+ ;
	public final Code3a read_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:274:5: ( (c= read_item[symTab] )+ )
			// ./src/VSLTreeParser.g:275:5: (c= read_item[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:278:2: (c= read_item[symTab] )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==IDENT) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:278:3: c= read_item[symTab]
					{
					pushFollow(FOLLOW_read_item_in_read_list1052);
					c=read_item(symTab);
					state._fsp--;


					    	code.append(c);
					    
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
	// ./src/VSLTreeParser.g:285:1: read_item[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:286:5: (i= IDENT )
			// ./src/VSLTreeParser.g:287:5: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item1096); 

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
	// ./src/VSLTreeParser.g:304:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (c= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:305:5: ( ^( DECL (c= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:306:5: ^( DECL (c= decl_item[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,DECL,FOLLOW_DECL_in_declaration1146); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:309:12: (c= decl_item[symTab] )+
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
					// ./src/VSLTreeParser.g:309:13: c= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration1151);
					c=decl_item(symTab);
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
	// ./src/VSLTreeParser.g:320:1: decl_item[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:321:5: (i= IDENT )
			// ./src/VSLTreeParser.g:321:8: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item1194); 

			    	
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
	public static final BitSet FOLLOW_param_list_in_function175 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_BODY_in_function179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_function183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROTO_KW_in_proto204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_proto208 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_proto212 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_param_list_in_proto214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_KW_in_type236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list283 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_param326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement360 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_statement365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement391 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_list_in_statement412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_KW_in_statement429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_list_in_statement433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement454 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement459 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement465 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement489 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement495 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement517 = new BitSet(new long[]{0x0000000002C14208L});
	public static final BitSet FOLLOW_argument_list_in_statement521 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block587 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block609 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARELEM_in_array_elem647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_array_elem652 = new BitSet(new long[]{0x0000000002C14200L});
	public static final BitSet FOLLOW_expression_in_array_elem656 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list697 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_PLUS_in_expression737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression741 = new BitSet(new long[]{0x0000000002C14200L});
	public static final BitSet FOLLOW_expression_in_expression746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression765 = new BitSet(new long[]{0x0000000002C14200L});
	public static final BitSet FOLLOW_expression_in_expression770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression789 = new BitSet(new long[]{0x0000000002C14200L});
	public static final BitSet FOLLOW_expression_in_expression794 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression813 = new BitSet(new long[]{0x0000000002C14200L});
	public static final BitSet FOLLOW_expression_in_expression818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_in_expression835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_argument_list912 = new BitSet(new long[]{0x0000000002C14202L});
	public static final BitSet FOLLOW_print_item_in_print_list950 = new BitSet(new long[]{0x0000000202C14202L});
	public static final BitSet FOLLOW_TEXT_in_print_item991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_item_in_read_list1052 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_IDENT_in_read_item1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECL_in_declaration1146 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration1151 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item1194 = new BitSet(new long[]{0x0000000000000002L});
}
