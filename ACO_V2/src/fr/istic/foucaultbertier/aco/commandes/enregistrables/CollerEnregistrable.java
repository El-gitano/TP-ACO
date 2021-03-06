package fr.istic.foucaultbertier.aco.commandes.enregistrables;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.commandes.Coller;
import fr.istic.foucaultbertier.aco.mementos.MementoCommande;
import fr.istic.foucaultbertier.aco.mementos.MementoColler;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * La classe CollerEnregistrable execute une commande Coller et enregistre son MementoCommande dans un Enregistreur
 * @see Enregistreur
 * @see Coller
 * @see CommandeEnregistrable
 */
public final class CollerEnregistrable implements CommandeEnregistrable {


	/**
	 * Logger pour suivre le déroulement de l'application
	 */
	private static final Logger LOGGER = LogManager.getLogger(CollerEnregistrable.class.getName());
	
	private Enregistreur enregistreur;
	private MoteurEdition moteur;
	
	/**
	 * Créé une commande CollerEnregistrable
	 * L'ensemble des paramètres doit être renseigné
	 * @param moteur Le MoteurEdition auquel adresser la commande
	 * @param enregistreur L'enregsitreur de commande
	 */
	public CollerEnregistrable(MoteurEdition moteur, Enregistreur enregistreur){
		
		/* Préconditions */
		if(enregistreur == null){
			
			throw new IllegalArgumentException("enregistreur est à null");
		}
		if(moteur == null){
			
			throw new IllegalArgumentException("moteur est à null");
		}
		
		/*Traitement*/
		
		this.enregistreur = enregistreur;
		this.moteur = moteur;
	}
	
	/**
	 * Créé une Commande CollerEnregistrable à partir d'un MementoColler et execute une commande Coller
	 * @param memento Le memento duquel on restaure l'état de la commande enregistrable
	 */
	public CollerEnregistrable(MementoCommande memento){
		
		restaurer(memento);
		LOGGER.trace("Rejeu d'une commande CollerEnregistrable");
		new Coller(moteur).executer();
	}
	
	/**
	 * Effectue l'enregistrement de la commande auprès de l'enregistreur et execute la commande auprès du moteur
	 */
	@Override
	public final void executer() {
		
		enregistreur.enregistrer(this);
		LOGGER.trace("Exécution d'une commande CollerEnregistrable");
		new Coller(moteur).executer();
	}

	/**
	 * Retour l'état de l'objet sous forme d'un objet MementoColler
	 * @see MementoColler
	 */
	@Override
	public final MementoCommande getMemento() {
		
		return new MementoColler(moteur, enregistreur);
	}

	/**
	 * Restaure l'état d'une commande à partir d'un memento
	 * @param memento L'objet memento de la classe MementoColler (non null)
	 * @see MementoColler
	 */
	@Override
	public final void restaurer(MementoCommande memento) {
		
		/* Préconditions */
		if(memento == null){
			
			throw new IllegalArgumentException("memento est à null");
		}
		
		if(!(memento instanceof MementoColler)){
			
			throw new IllegalArgumentException("Le memento n'est pas de la classe MementoColler");
		}
		
		LOGGER.trace("Restauration d'une commande CollerEnregistrable à partir d'un memento");
		
		/*Traitement*/
		this.moteur = memento.getMoteur();
		this.enregistreur = memento.getEnregistreur();
	}
}
