package fr.istic.foucaultbertier.aco.commandes;

import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;
import fr.istic.foucaultbertier.aco.moteur.Selection;

/**
 * La commande selectionner ordonne au moteur d'édition d'effectuer une nouvelle sélection
 */
public final class Selectionner implements Commande
{
	
	/**
	 * Moteur d'édition qui exécutera la commande
	 */
	private final MoteurEdition moteur;
	
	/**
	 * Nouvelle sélection
	 */
	private final Selection selection;
	
	/**
	 * Le constructeur a besoin de savoir à quel moteur d'édition envoyer la commande et quelle sélection effectuer
	 * @param moteur	Le Moteur d'édition auquel envoyer la commande (non null)
	 * @param selection La nouvelle selection (non null)
	 */
	public Selectionner(MoteurEdition moteur, Selection selection){
		
		/* Préconditions */
		
		if(moteur == null){
			
			throw new IllegalArgumentException("Moteur est à null");
		}
		
		if(selection == null){
			
			throw new IllegalArgumentException("Selection est à null");
		}
		
		/* Traitement */
		
		this.moteur = moteur;
		this.selection = selection;
	}

	/**
	 * Execute la commande
	 */
	@Override
	public final void executer() {
		
		moteur.selectionner(selection);
	}
}

