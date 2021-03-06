package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.commandes.enregistrables.CouperEnregistrable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande CouperEnregistrable
 * @see CouperEnregistrable
 * @see MementoCommande
 */
public final class MementoCouper extends MementoCommande{

	private static final Logger LOGGER = LogManager.getLogger(MementoCouper.class.getName());	
	
	public MementoCouper(MoteurEdition moteur, Enregistreur enregistreur){
		
		super(moteur, enregistreur);
		LOGGER.trace("Création d'un MementoCouper");
	}
}