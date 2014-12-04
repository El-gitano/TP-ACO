package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande CouperEnregistrable
 * @see CouperEnregistrable
 * @see MementoCommande
 */
public final class MementoCouper extends MementoCommande{

	public MementoCouper(MoteurEdition moteur, Enregistreur enregistreur){
		
		super(moteur, enregistreur);
	}
}