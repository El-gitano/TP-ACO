package fr.istic.foucaultbertier.aco.moteur;

import java.util.Stack;

import fr.istic.foucaultbertier.aco.mementos.MementoSysteme;

/**
 * Cette classe est chargée de gérer les actions défaire/refaire lorsque l'utilisateur les demandent au travers des commandes portant le même nom
 * @see Defaire
 * @see Refaire
 */
public class GestionnaireHisto {

	private Stack<MementoSysteme> defaire;
	private Stack<MementoSysteme> refaire;
	
	public GestionnaireHisto(){
		
		defaire = new Stack<MementoSysteme>();
		refaire = new Stack<MementoSysteme>();
	}
	
	public MementoSysteme defaire(){
		
		if(defaire.size() != 1){
			
			MementoSysteme memSysteme = defaire.pop();
			refaire.push(memSysteme);
		}

		return defaire.peek();
	}
	
	public MementoSysteme refaire(){
		
		MementoSysteme memSysteme = refaire.pop();
		defaire.push(memSysteme);
		return memSysteme;
	}
	
	public boolean peutRefaire(){
		
		return !refaire.empty();
	}
	
	public void ajouterElement(MementoSysteme memSysteme){
		
		//Faire un redo n'aurait pas de sens
		if(!refaire.empty()){
			
			refaire.clear();
		}
		
		defaire.push(memSysteme);
	}
}
