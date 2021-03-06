package fr.istic.foucaultbertier.aco.commandes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.istic.foucaultbertier.aco.Enregistreur;

/**
 * Cette commande est chargée d'ordonner à l'enregsitreur de commande de rejouer les commandes qu'il a précédemment enregistré
 * @see Enregistreur
 */
public class Rejouer implements Commande {

	private static final Logger LOGGER = LogManager.getLogger(Rejouer.class.getName());	
	
	private Enregistreur enregistreur;
	
	/**
	 * Crée la commande
	 * @param enregistreur L'enregistreur à qui adresser la commande (non null)
	 */
	public Rejouer(Enregistreur enregistreur){
		
		if(enregistreur == null){
			
			throw new IllegalArgumentException("enregistreur est à null");
		}
		
		this.enregistreur = enregistreur;
	}

	/**
	 * Ordonne à l'enregistreur de rejouer les commandes qu'il a enregistré
	 */
	@Override
	public void executer() {
		
		LOGGER.trace("Exécution d'une commande Rejouer");
		enregistreur.rejouerCommandes();
	}
}