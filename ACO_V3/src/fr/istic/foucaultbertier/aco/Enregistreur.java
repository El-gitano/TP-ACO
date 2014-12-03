package fr.istic.foucaultbertier.aco;

import java.util.ArrayList;
import java.util.List;

import fr.istic.foucaultbertier.aco.commandes.enregistrables.CollerEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.CommandeEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.CopierEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.CouperEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.InsTexteEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.SelectionnerEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.SupTexteEnregistrable;
import fr.istic.foucaultbertier.aco.mementos.Memento;
import fr.istic.foucaultbertier.aco.mementos.MementoColler;
import fr.istic.foucaultbertier.aco.mementos.MementoCopier;
import fr.istic.foucaultbertier.aco.mementos.MementoCouper;
import fr.istic.foucaultbertier.aco.mementos.MementoInsTexte;
import fr.istic.foucaultbertier.aco.mementos.MementoSelectionner;
import fr.istic.foucaultbertier.aco.mementos.MementoSupprTexte;

/**
 * Cette classe est chargée d'enregsitrer les mementos des commandes enregsitrables de façon à pouvoir rejouer les commandes à la demande de l'utilisateur
 * @see CommandeEnregistrable
 * @see Memento
 */
public final class Enregistreur {

	List<Memento> listeMementos;
	
	public Enregistreur(){
		
		listeMementos = new ArrayList<Memento>();
	}
	
	/**
	 * Vide la liste des mementos enregistrés par l'objet
	 */
	public final void nettoyer(){
		
		listeMementos.clear();
	}
	
	/**
	 * Enregsitre le memento d'une commande
	 * @param commande La commande enregistrable dont on souhaite sauvegarder l'état (non null)
	 */
	public final void enregistrer(CommandeEnregistrable commande){
		
		if(commande == null){
			
			throw new IllegalArgumentException("commande est à null");
		}
		
		listeMementos.add(commande.getMemento());
	}
	
	public final void rejouerCommandes(){
		
		for(Memento m : listeMementos){
			
			if(m instanceof MementoColler){
				
				new CollerEnregistrable((MementoColler)m);
			}
			else if(m instanceof MementoCopier){
				
				new CopierEnregistrable((MementoCopier)m);
			}
			else if(m instanceof MementoCouper){
				
				new CouperEnregistrable((MementoCouper)m);
			}
			else if(m instanceof MementoSelectionner){
				
				new SelectionnerEnregistrable((MementoSelectionner)m);
			}
			else if(m instanceof MementoInsTexte){
				
				new InsTexteEnregistrable((MementoInsTexte)m);
			}
			else if(m instanceof MementoSupprTexte){
				
				new SupTexteEnregistrable((MementoSupprTexte)m);
			}
		}
	}
}
