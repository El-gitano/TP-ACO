package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande CollerEnregistrable
 * @see CollerEnregistrable
 * @see MementoCommande
 */
public final class MementoColler extends MementoCommande{

	public MementoColler(MoteurEdition moteur, Enregistreur enregsitreur){
		
		super(moteur, enregsitreur);
	}
}