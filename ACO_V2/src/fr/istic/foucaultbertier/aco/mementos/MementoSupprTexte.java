package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande SupTexteEnregistrable
 * @see SupTexteEnregistrable
 * @see Memento
 */
public final class MementoSupprTexte extends Memento{

	public MementoSupprTexte(MoteurEdition moteur, Enregistreur enregistreur){
		
		super(moteur, enregistreur);
	}
}