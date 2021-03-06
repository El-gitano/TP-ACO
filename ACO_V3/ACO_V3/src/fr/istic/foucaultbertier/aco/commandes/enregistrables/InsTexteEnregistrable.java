package fr.istic.foucaultbertier.aco.commandes.enregistrables;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.commandes.InsererTexte;
import fr.istic.foucaultbertier.aco.mementos.MementoCommande;
import fr.istic.foucaultbertier.aco.mementos.MementoInsTexte;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * La classe InsTexteEnregistrable execute une commande InsererTexte et enregistre son MementoCommande dans un Enregistreur
 * @see Enregistreur
 * @see InsererTexte
 * @see CommandeEnregistrable
 */
public final class InsTexteEnregistrable implements CommandeEnregistrable {


	/**
	 * Logger pour suivre le déroulement de l'application
	 */
	private static final Logger LOGGER = LogManager.getLogger(InsTexteEnregistrable.class.getName());
	
	private Enregistreur enregistreur;
	private MoteurEdition moteur;
	private String chaine;
	
	/**
	 * Créé une commande InsTexteEnregistrable
	 * L'ensemble des paramètres doit être renseigné
	 * @param moteur Le MoteurEdition auquel adresser la commande
	 * @param enregistreur L'enregsitreur de commande
	 * @param chaine La chaîne associer à la commande
	 */
	public InsTexteEnregistrable(MoteurEdition moteur, Enregistreur enregistreur, String chaine){
		
		/* Préconditions */
		if(enregistreur == null){
			
			throw new IllegalArgumentException("enregistreur est à null");
		}
		if(moteur == null){
			
			throw new IllegalArgumentException("moteur est à null");
		}
		if(chaine == null){
			
			throw new IllegalArgumentException("chaine est à null");
		}
		
		/*Traitement*/
		
		this.enregistreur = enregistreur;
		this.moteur = moteur;
		this.chaine = chaine;
	}
	
	/**
	 * Créé une Commande InsTexteEnregistrable à partir d'un MementoInsTexte et execute une commande InsererTexte
	 * @param memento Le memento duquel on restaure l'état de la commande enregistrable
	 */
	public InsTexteEnregistrable(MementoCommande memento){
		
		restaurer(memento);	
		new InsererTexte(moteur, chaine).executer();
	}
	
	/**
	 * Effectue l'enregistrement de la commande auprès de l'enregistreur et execute la commande auprès du moteur
	 */
	@Override
	public final void executer() {
		
		enregistreur.enregistrer(this);
		LOGGER.trace("Exécution d'une commande InsererTexte");
		new InsererTexte(moteur, chaine).executer();
	}

	/**
	 * Retour l'état de l'objet sous forme d'un objet MementoInTexte
	 * @see MementoInsTexte
	 */
	@Override
	public final MementoCommande getMemento() {
		
		return new MementoInsTexte(moteur, enregistreur, chaine);
	}

	/**
	 * Restaure l'état d'une commande à partir d'un memento
	 * @param memento L'objet memento de la classe MementoInsTexte (non null)
	 * @see MementoInsTexte
	 */
	@Override
	public final void restaurer(MementoCommande memento) {
		
		/* Préconditions */
		if(memento == null){
			
			throw new IllegalArgumentException("memento est à null");
		}
		
		if(!(memento instanceof MementoInsTexte)){
			
			throw new IllegalArgumentException("Le memento n'est pas de la classe MementoInsTexte");
		}
		
		LOGGER.trace("Restauration d'une commande InsTexteEnregistrable à partir d'un memento");
		
		/*Traitement*/
		this.moteur = memento.getMoteur();
		this.enregistreur = memento.getEnregistreur();
		this.chaine = ((MementoInsTexte)memento).getTexte();
	}
}
