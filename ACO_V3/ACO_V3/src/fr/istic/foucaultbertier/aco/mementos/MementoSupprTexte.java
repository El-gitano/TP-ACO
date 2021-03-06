package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.commandes.enregistrables.SupTexteEnregistrable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande SupTexteEnregistrable
 * @see SupTexteEnregistrable
 * @see MementoCommande
 */
public final class MementoSupprTexte extends MementoCommande{

	private static final Logger LOGGER = LogManager.getLogger(MementoSupprTexte.class.getName());	
	
	public MementoSupprTexte(MoteurEdition moteur, Enregistreur enregistreur){
		
		super(moteur, enregistreur);
		LOGGER.trace("Création d'un MementoSupprTexte");
	}
}