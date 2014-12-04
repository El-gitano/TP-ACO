package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande CopierEnregistrable
 * @see CopierEnregistrable
 * @see Memento
 */
public final class MementoCopier extends Memento{

	public MementoCopier(MoteurEdition moteur, Enregistreur enregistreur){
		
		super(moteur, enregistreur);
	}
}