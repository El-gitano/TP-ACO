package fr.istic.foucaultbertier.aco.commandes;

import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * La commande Coller ordonne à l'implémentation du moteur d'édition d'effectuer une opération de collage
 */
public final class Coller implements Commande
{
	/**
	 * Moteur d'édition qui exécutera la commande
	 */
	private final MoteurEdition moteur;
	
	/**
	 * Le constructeur a besoin de savoir à quel moteur d'édition envoyer la commande
	 * @param moteur	Le Moteur d'édition auquel envoyer la commande (non null)
	 */
	public Coller(MoteurEdition moteur){

		/* Préconditions */
		
		if(moteur == null){
			
			throw new IllegalArgumentException("Moteur est à null");
		}
		
		
		this.moteur = moteur;
	}

	/**
	 * Execute la commande
	 */
	@Override
	public final void executer() {
		
		moteur.coller();
	}	
}

