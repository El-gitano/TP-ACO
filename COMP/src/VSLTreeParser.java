// $ANTLR 3.5 ./src/VSLTreeParser.g 2014-12-07 19:22:35

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
					// ./src/VSLTreeParser.g:28:7: proto[symTab]
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
	// ./src/VSLTreeParser.g:34:1: function[SymbolTable symTab] returns [Code3a code] : ^( FUNC_KW t= type i= IDENT cParm= param_list[symTab] ^( BODY corps= statement[symTab] ) ) ;
	public final Code3a function(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		Type t =null;
		Code3a cParm =null;
		Code3a corps =null;

		try {
			// ./src/VSLTreeParser.g:35:4: ( ^( FUNC_KW t= type i= IDENT cParm= param_list[symTab] ^( BODY corps= statement[symTab] ) ) )
			// ./src/VSLTreeParser.g:36:2: ^( FUNC_KW t= type i= IDENT cParm= param_list[symTab] ^( BODY corps= statement[symTab] ) )
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
	// ./src/VSLTreeParser.g:53:1: proto[SymbolTable symTab] : ^( PROTO_KW t= type i= IDENT ^( PARAM ( IDENT )* ) ) ;
	public final void proto(SymbolTable symTab) throws RecognitionException {
		CommonTree i=null;
		Type t =null;

		try {
			// ./src/VSLTreeParser.g:54:2: ( ^( PROTO_KW t= type i= IDENT ^( PARAM ( IDENT )* ) ) )
			// ./src/VSLTreeParser.g:55:2: ^( PROTO_KW t= type i= IDENT ^( PARAM ( IDENT )* ) )
			{
			match(input,PROTO_KW,FOLLOW_PROTO_KW_in_proto206); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_proto210);
			t=type();
			state._fsp--;

			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_proto214); 
			match(input,PARAM,FOLLOW_PARAM_in_proto217); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:55:36: ( IDENT )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==IDENT) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// ./src/VSLTreeParser.g:55:36: IDENT
						{
						match(input,IDENT,FOLLOW_IDENT_in_proto219); 
						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 


					// les parametres des prototypes ne doivent pas etre utilisé
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
	// ./src/VSLTreeParser.g:63:1: type returns [Type t] : ( INT_KW | VOID_KW );
	public final Type type() throws RecognitionException {
		Type t = null;


		try {
			// ./src/VSLTreeParser.g:64:5: ( INT_KW | VOID_KW )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT_KW) ) {
				alt4=1;
			}
			else if ( (LA4_0==VOID_KW) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// ./src/VSLTreeParser.g:64:7: INT_KW
					{
					match(input,INT_KW,FOLLOW_INT_KW_in_type243); 
					 t = Type.INT; 
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:65:7: VOID_KW
					{
					match(input,VOID_KW,FOLLOW_VOID_KW_in_type254); 
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
	// ./src/VSLTreeParser.g:68:1: param_list[SymbolTable symTab] returns [Code3a code] : ^( PARAM (c= param[symTab] )* ) ;
	public final Code3a param_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:69:5: ( ^( PARAM (c= param[symTab] )* ) )
			// ./src/VSLTreeParser.g:70:2: ^( PARAM (c= param[symTab] )* )
			{

					code = new Code3a();
				
			match(input,PARAM,FOLLOW_PARAM_in_param_list285); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ./src/VSLTreeParser.g:73:10: (c= param[symTab] )*
				loop5:
				while (true) {
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDENT) ) {
						alt5=1;
					}

					switch (alt5) {
					case 1 :
						// ./src/VSLTreeParser.g:73:11: c= param[symTab]
						{
						pushFollow(FOLLOW_param_in_param_list290);
						c=param(symTab);
						state._fsp--;


						    	code.append(c);
						    
						}
						break;

					default :
						break loop5;
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
	// ./src/VSLTreeParser.g:81:1: param[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a param(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:82:5: (i= IDENT )
			// ./src/VSLTreeParser.g:82:7: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_param333); 

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
	// ./src/VSLTreeParser.g:90:1: statement[SymbolTable symTab] returns [Code3a code] : ( ^( ASSIGN_KW e= expression[symTab] i= IDENT ) | ^( RETURN_KW e= expression[symTab] ) | ^( PRINT_KW c= print_list[symTab] ) | ^( READ_KW c= read_list[symTab] ) | ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? ) | ^( WHILE_KW e= expression[symTab] c= statement[symTab] ) | ^( FCALL_S i= IDENT (c= argument_list[symTab] )? ) |c= block[symTab] );
	public final Code3a statement(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		ExpAttribute e =null;
		Code3a c =null;
		Code3a cIf =null;
		Code3a cElse =null;

		try {
			// ./src/VSLTreeParser.g:91:5: ( ^( ASSIGN_KW e= expression[symTab] i= IDENT ) | ^( RETURN_KW e= expression[symTab] ) | ^( PRINT_KW c= print_list[symTab] ) | ^( READ_KW c= read_list[symTab] ) | ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? ) | ^( WHILE_KW e= expression[symTab] c= statement[symTab] ) | ^( FCALL_S i= IDENT (c= argument_list[symTab] )? ) |c= block[symTab] )
			int alt8=8;
			switch ( input.LA(1) ) {
			case ASSIGN_KW:
				{
				alt8=1;
				}
				break;
			case RETURN_KW:
				{
				alt8=2;
				}
				break;
			case PRINT_KW:
				{
				alt8=3;
				}
				break;
			case READ_KW:
				{
				alt8=4;
				}
				break;
			case IF_KW:
				{
				alt8=5;
				}
				break;
			case WHILE_KW:
				{
				alt8=6;
				}
				break;
			case FCALL_S:
				{
				alt8=7;
				}
				break;
			case BLOCK:
				{
				alt8=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ./src/VSLTreeParser.g:91:7: ^( ASSIGN_KW e= expression[symTab] i= IDENT )
					{
					match(input,ASSIGN_KW,FOLLOW_ASSIGN_KW_in_statement363); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement367);
					e=expression(symTab);
					state._fsp--;

					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement372); 
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
					// ./src/VSLTreeParser.g:110:7: ^( RETURN_KW e= expression[symTab] )
					{
					match(input,RETURN_KW,FOLLOW_RETURN_KW_in_statement394); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement398);
					e=expression(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code= Code3aGenerator.genReturn(e);
					    
					}
					break;
				case 3 :
					// ./src/VSLTreeParser.g:114:7: ^( PRINT_KW c= print_list[symTab] )
					{
					match(input,PRINT_KW,FOLLOW_PRINT_KW_in_statement415); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_print_list_in_statement419);
					c=print_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code=c;
					    
					}
					break;
				case 4 :
					// ./src/VSLTreeParser.g:118:7: ^( READ_KW c= read_list[symTab] )
					{
					match(input,READ_KW,FOLLOW_READ_KW_in_statement436); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_read_list_in_statement440);
					c=read_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code=c;
					    
					}
					break;
				case 5 :
					// ./src/VSLTreeParser.g:122:7: ^( IF_KW e= expression[symTab] cIf= statement[symTab] (cElse= statement[symTab] )? )
					{
					match(input,IF_KW,FOLLOW_IF_KW_in_statement457); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement461);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement466);
					cIf=statement(symTab);
					state._fsp--;

					// ./src/VSLTreeParser.g:122:58: (cElse= statement[symTab] )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ASSIGN_KW||LA6_0==IF_KW||LA6_0==PRINT_KW||(LA6_0 >= READ_KW && LA6_0 <= RETURN_KW)||LA6_0==WHILE_KW||LA6_0==BLOCK||LA6_0==FCALL_S) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/VSLTreeParser.g:122:59: cElse= statement[symTab]
							{
							pushFollow(FOLLOW_statement_in_statement472);
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
					// ./src/VSLTreeParser.g:129:7: ^( WHILE_KW e= expression[symTab] c= statement[symTab] )
					{
					match(input,WHILE_KW,FOLLOW_WHILE_KW_in_statement492); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_statement496);
					e=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_statement_in_statement502);
					c=statement(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	code = Code3aGenerator.genWhile(e, c, symTab);
					    
					}
					break;
				case 7 :
					// ./src/VSLTreeParser.g:133:7: ^( FCALL_S i= IDENT (c= argument_list[symTab] )? )
					{
					match(input,FCALL_S,FOLLOW_FCALL_S_in_statement520); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement524); 
					// ./src/VSLTreeParser.g:133:26: (c= argument_list[symTab] )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==DIV||LA7_0==IDENT||LA7_0==INTEGER||(LA7_0 >= MINUS && LA7_0 <= MUL)||LA7_0==PLUS||LA7_0==FCALL) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// ./src/VSLTreeParser.g:133:26: c= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_statement528);
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
					// ./src/VSLTreeParser.g:137:7: c= block[symTab]
					{
					pushFollow(FOLLOW_block_in_statement547);
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
	// ./src/VSLTreeParser.g:143:1: block[SymbolTable symTab] returns [Code3a code] : ( ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] ) | ^( BLOCK c= inst_list[symTab] ) );
	public final Code3a block(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a cDecl =null;
		Code3a cInst =null;
		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:144:5: ( ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] ) | ^( BLOCK c= inst_list[symTab] ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BLOCK) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==DECL) ) {
						alt9=1;
					}
					else if ( (LA9_2==INST) ) {
						alt9=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// ./src/VSLTreeParser.g:145:5: ^( BLOCK cDecl= declaration[symTab] cInst= inst_list[symTab] )
					{

					    	symTab.enterScope();
					    
					match(input,BLOCK,FOLLOW_BLOCK_in_block589); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_declaration_in_block593);
					cDecl=declaration(symTab);
					state._fsp--;

					pushFollow(FOLLOW_inst_list_in_block598);
					cInst=inst_list(symTab);
					state._fsp--;

					match(input, Token.UP, null); 


					    	
					    	code=cDecl;
					    	code.append(cInst);
					    	symTab.leaveScope(); 
							
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:156:7: ^( BLOCK c= inst_list[symTab] )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block615); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_inst_list_in_block619);
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
	// ./src/VSLTreeParser.g:164:1: array_elem[SymbolTable symTab] returns [Code3a code] : ^( ARELEM i= IDENT e= expression[symTab] ) ;
	public final Code3a array_elem(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:165:5: ( ^( ARELEM i= IDENT e= expression[symTab] ) )
			// ./src/VSLTreeParser.g:165:7: ^( ARELEM i= IDENT e= expression[symTab] )
			{
			match(input,ARELEM,FOLLOW_ARELEM_in_array_elem653); 
			match(input, Token.DOWN, null); 
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_array_elem658); 
			pushFollow(FOLLOW_expression_in_array_elem662);
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
	// ./src/VSLTreeParser.g:173:1: inst_list[SymbolTable symTab] returns [Code3a code] : ^( INST (c= statement[symTab] )+ ) ;
	public final Code3a inst_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:174:5: ( ^( INST (c= statement[symTab] )+ ) )
			// ./src/VSLTreeParser.g:175:2: ^( INST (c= statement[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,INST,FOLLOW_INST_in_inst_list698); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:178:9: (c= statement[symTab] )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ASSIGN_KW||LA10_0==IF_KW||LA10_0==PRINT_KW||(LA10_0 >= READ_KW && LA10_0 <= RETURN_KW)||LA10_0==WHILE_KW||LA10_0==BLOCK||LA10_0==FCALL_S) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ./src/VSLTreeParser.g:178:10: c= statement[symTab]
					{
					pushFollow(FOLLOW_statement_in_inst_list703);
					c=statement(symTab);
					state._fsp--;


					    	code.append(c);
					    
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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
	// ./src/VSLTreeParser.g:186:1: expression[SymbolTable symTab] returns [ExpAttribute expAtt] : ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary[symTab] );
	public final ExpAttribute expression(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		ExpAttribute e1 =null;
		ExpAttribute e2 =null;
		ExpAttribute pe =null;

		try {
			// ./src/VSLTreeParser.g:187:3: ( ^( PLUS e1= expression[symTab] e2= expression[symTab] ) | ^( MUL e1= expression[symTab] e2= expression[symTab] ) | ^( DIV e1= expression[symTab] e2= expression[symTab] ) | ^( MINUS e1= expression[symTab] e2= expression[symTab] ) |pe= primary[symTab] )
			int alt11=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt11=1;
				}
				break;
			case MUL:
				{
				alt11=2;
				}
				break;
			case DIV:
				{
				alt11=3;
				}
				break;
			case MINUS:
				{
				alt11=4;
				}
				break;
			case IDENT:
			case INTEGER:
			case FCALL:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// ./src/VSLTreeParser.g:187:5: ^( PLUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression743); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression747);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression752);
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
					// ./src/VSLTreeParser.g:194:4: ^( MUL e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MUL,FOLLOW_MUL_in_expression767); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression771);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression776);
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
					// ./src/VSLTreeParser.g:201:4: ^( DIV e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,DIV,FOLLOW_DIV_in_expression791); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression795);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression800);
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
					// ./src/VSLTreeParser.g:208:4: ^( MINUS e1= expression[symTab] e2= expression[symTab] )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression815); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression819);
					e1=expression(symTab);
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression824);
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
					// ./src/VSLTreeParser.g:215:5: pe= primary[symTab]
					{
					pushFollow(FOLLOW_primary_in_expression841);
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
	// ./src/VSLTreeParser.g:223:1: primary[SymbolTable symTab] returns [ExpAttribute expAtt] : (i= INTEGER |i= IDENT | ^( FCALL i= IDENT (ctmp= argument_list[symTab] )? ) );
	public final ExpAttribute primary(SymbolTable symTab) throws RecognitionException {
		ExpAttribute expAtt = null;


		CommonTree i=null;
		Code3a ctmp =null;

		try {
			// ./src/VSLTreeParser.g:224:2: (i= INTEGER |i= IDENT | ^( FCALL i= IDENT (ctmp= argument_list[symTab] )? ) )
			int alt13=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt13=1;
				}
				break;
			case IDENT:
				{
				alt13=2;
				}
				break;
			case FCALL:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// ./src/VSLTreeParser.g:224:4: i= INTEGER
					{
					i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_primary868); 

							ConstSymbol cs = new ConstSymbol(Integer.parseInt(i.getText()));
							expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
						
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:229:4: i= IDENT
					{
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary881); 

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
					// ./src/VSLTreeParser.g:240:2: ^( FCALL i= IDENT (ctmp= argument_list[symTab] )? )
					{

							Code3a c = new Code3a();
							Code3a cArg = new Code3a();
						
					match(input,FCALL,FOLLOW_FCALL_in_primary898); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primary902); 
					// ./src/VSLTreeParser.g:244:18: (ctmp= argument_list[symTab] )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==DIV||LA12_0==IDENT||LA12_0==INTEGER||(LA12_0 >= MINUS && LA12_0 <= MUL)||LA12_0==PLUS||LA12_0==FCALL) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// ./src/VSLTreeParser.g:244:19: ctmp= argument_list[symTab]
							{
							pushFollow(FOLLOW_argument_list_in_primary907);
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
	// ./src/VSLTreeParser.g:257:1: argument_list[SymbolTable symTab] returns [Code3a code] : (e= expression[symTab] )+ ;
	public final Code3a argument_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:258:5: ( (e= expression[symTab] )+ )
			// ./src/VSLTreeParser.g:259:5: (e= expression[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:262:2: (e= expression[symTab] )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIV||LA14_0==IDENT||LA14_0==INTEGER||(LA14_0 >= MINUS && LA14_0 <= MUL)||LA14_0==PLUS||LA14_0==FCALL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ./src/VSLTreeParser.g:262:3: e= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_argument_list957);
					e=expression(symTab);
					state._fsp--;


							code.append(Code3aGenerator.genArg(e.place));
						
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
	// $ANTLR end "argument_list"



	// $ANTLR start "print_list"
	// ./src/VSLTreeParser.g:269:1: print_list[SymbolTable symTab] returns [Code3a code] : (c= print_item[symTab] )+ ;
	public final Code3a print_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:270:5: ( (c= print_item[symTab] )+ )
			// ./src/VSLTreeParser.g:271:2: (c= print_item[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:274:2: (c= print_item[symTab] )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||LA15_0==IDENT||LA15_0==INTEGER||(LA15_0 >= MINUS && LA15_0 <= MUL)||LA15_0==PLUS||LA15_0==TEXT||LA15_0==FCALL) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ./src/VSLTreeParser.g:274:3: c= print_item[symTab]
					{
					pushFollow(FOLLOW_print_item_in_print_list995);
					c=print_item(symTab);
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
	// $ANTLR end "print_list"



	// $ANTLR start "print_item"
	// ./src/VSLTreeParser.g:282:1: print_item[SymbolTable symTab] returns [Code3a code] : (s= TEXT |e= expression[symTab] );
	public final Code3a print_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree s=null;
		ExpAttribute e =null;

		try {
			// ./src/VSLTreeParser.g:283:5: (s= TEXT |e= expression[symTab] )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==TEXT) ) {
				alt16=1;
			}
			else if ( (LA16_0==DIV||LA16_0==IDENT||LA16_0==INTEGER||(LA16_0 >= MINUS && LA16_0 <= MUL)||LA16_0==PLUS||LA16_0==FCALL) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// ./src/VSLTreeParser.g:283:7: s= TEXT
					{
					s=(CommonTree)match(input,TEXT,FOLLOW_TEXT_in_print_item1036); 
							
					    	code = Code3aGenerator.genPrintS(new Data3a(s.getText()));
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:287:7: e= expression[symTab]
					{
					pushFollow(FOLLOW_expression_in_print_item1052);
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
	// ./src/VSLTreeParser.g:294:1: read_list[SymbolTable symTab] returns [Code3a code] : (c= read_item[symTab] )+ ;
	public final Code3a read_list(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:295:5: ( (c= read_item[symTab] )+ )
			// ./src/VSLTreeParser.g:296:5: (c= read_item[symTab] )+
			{

					code = new Code3a();
				
			// ./src/VSLTreeParser.g:299:2: (c= read_item[symTab] )+
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
					// ./src/VSLTreeParser.g:299:3: c= read_item[symTab]
					{
					pushFollow(FOLLOW_read_item_in_read_list1097);
					c=read_item(symTab);
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
	// ./src/VSLTreeParser.g:306:1: read_item[SymbolTable symTab] returns [Code3a code] : i= IDENT ;
	public final Code3a read_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;

		try {
			// ./src/VSLTreeParser.g:307:5: (i= IDENT )
			// ./src/VSLTreeParser.g:308:5: i= IDENT
			{
			i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_read_item1141); 

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
	// ./src/VSLTreeParser.g:325:1: declaration[SymbolTable symTab] returns [Code3a code] : ^( DECL (c= decl_item[symTab] )+ ) ;
	public final Code3a declaration(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		Code3a c =null;

		try {
			// ./src/VSLTreeParser.g:326:5: ( ^( DECL (c= decl_item[symTab] )+ ) )
			// ./src/VSLTreeParser.g:327:5: ^( DECL (c= decl_item[symTab] )+ )
			{

					code = new Code3a();
				
			match(input,DECL,FOLLOW_DECL_in_declaration1191); 
			match(input, Token.DOWN, null); 
			// ./src/VSLTreeParser.g:330:12: (c= decl_item[symTab] )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==IDENT) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ./src/VSLTreeParser.g:330:13: c= decl_item[symTab]
					{
					pushFollow(FOLLOW_decl_item_in_declaration1196);
					c=decl_item(symTab);
					state._fsp--;


					    	
					   		code.append(c);
					   		
					   		
					    
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
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
	// ./src/VSLTreeParser.g:341:1: decl_item[SymbolTable symTab] returns [Code3a code] : (i= IDENT |i= IDENT cons= INTEGER );
	public final Code3a decl_item(SymbolTable symTab) throws RecognitionException {
		Code3a code = null;


		CommonTree i=null;
		CommonTree cons=null;

		try {
			// ./src/VSLTreeParser.g:342:5: (i= IDENT |i= IDENT cons= INTEGER )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IDENT) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==INTEGER) ) {
					alt19=2;
				}
				else if ( (LA19_1==UP||LA19_1==IDENT) ) {
					alt19=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// ./src/VSLTreeParser.g:342:8: i= IDENT
					{
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item1239); 

					        VarSymbol  vs = TypeCheck.checkAndDeclIdent(i,i.getText(),Type.INT,symTab);
					    	code = Code3aGenerator.genVar(vs);
					    
					}
					break;
				case 2 :
					// ./src/VSLTreeParser.g:347:6: i= IDENT cons= INTEGER
					{
					i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_decl_item1254); 
					cons=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_decl_item1258); 

					    	VarSymbol  vs = TypeCheck.checkAndDeclIdent(i,i.getText(),Type.INT,symTab);
					    	
					    	code = Code3aGenerator.genVar(vs);
					    	
					    	Operand3a test  = symTab.lookup(i.getText());
					    	ConstSymbol cs = new ConstSymbol(Integer.parseInt(i.getText()));
							ExpAttribute expAtt = new ExpAttribute(Type.INT, new Code3a(), cs);
							code = Code3aGenerator.genAffect( test,expAtt);
					    
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
	public static final BitSet FOLLOW_PARAM_in_proto217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_proto219 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_INT_KW_in_type243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_KW_in_type254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_in_param_list285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_param_in_param_list290 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_param333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_KW_in_statement363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement367 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_statement372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_KW_in_statement394 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_KW_in_statement415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_print_list_in_statement419 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_KW_in_statement436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_read_list_in_statement440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_KW_in_statement457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement461 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement466 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_statement_in_statement472 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_KW_in_statement492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement496 = new BitSet(new long[]{0x00002210C4008020L});
	public static final BitSet FOLLOW_statement_in_statement502 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FCALL_S_in_statement520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement524 = new BitSet(new long[]{0x0000100002C14208L});
	public static final BitSet FOLLOW_argument_list_in_statement528 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_block593 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_inst_list_in_block598 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inst_list_in_block619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARELEM_in_array_elem653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_array_elem658 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_array_elem662 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INST_in_inst_list698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_inst_list703 = new BitSet(new long[]{0x00002210C4008028L});
	public static final BitSet FOLLOW_PLUS_in_expression743 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression747 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression752 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_in_expression767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression771 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression795 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression800 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression819 = new BitSet(new long[]{0x0000100002C14200L});
	public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_in_expression841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_primary868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primary881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FCALL_in_primary898 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_primary902 = new BitSet(new long[]{0x0000100002C14208L});
	public static final BitSet FOLLOW_argument_list_in_primary907 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_argument_list957 = new BitSet(new long[]{0x0000100002C14202L});
	public static final BitSet FOLLOW_print_item_in_print_list995 = new BitSet(new long[]{0x0000100202C14202L});
	public static final BitSet FOLLOW_TEXT_in_print_item1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_print_item1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_item_in_read_list1097 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_IDENT_in_read_item1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECL_in_declaration1191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_item_in_declaration1196 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_IDENT_in_decl_item1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_decl_item1254 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_INTEGER_in_decl_item1258 = new BitSet(new long[]{0x0000000000000002L});
}
