package fr.istic.foucaultbertier.aco.ihm;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.commandes.Selectionner;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.SelectionnerEnregistrable;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;
import fr.istic.foucaultbertier.aco.moteur.Selection;

/**
 * Cette classe est chargée de surveiller les changements de sélection intervenant dans notre JTextArea, afin de s'assurer que notre l'objet Selection de notre Moteur d'édition est synchronisé avec la sélection de la JTextArea
 */
public final class ListenerSelection implements CaretListener
{
	private static final Logger LOGGER = LogManager.getLogger(ListenerSelection.class.getName());
	
	/**
	 * Le moteur d'édition à renseigner pour les commandes
	 */
	private final MoteurEdition moteur;
	
	/**
	 * L'enregistreur pour les commandes enregistrables
	 */
	private final Enregistreur enregistreur;
	private boolean enregistrer;
	
	/**
	 * Le constructeur a besoin de savoir quel moteur d'édition spécifier à la commande Selectionner
	 * @param moteur	Le Moteur d'édition à renseigner pour la commande (non null)
	 */
	public ListenerSelection(MoteurEdition moteur, Enregistreur enregistreur){
		
		if(moteur == null){
			
			throw new IllegalArgumentException("moteur est à null");
		}
		if(enregistreur == null){
			
			throw new IllegalArgumentException("enregistreur est à null");
		}

		this.moteur = moteur;
		this.enregistreur = enregistreur;
		enregistrer = false;
	}

	/**
	 * A chaque modification de la sélection dans notre JTextArea, cette méthode est invoquée
	 */
	@Override
	public final void caretUpdate(CaretEvent e) {
		
		LOGGER.trace("Détection d'une nouvelle sélection");
		
		final int min = Math.min(e.getDot(), e.getMark());
		final int max = Math.max(e.getDot(), e.getMark()); 
		
		LOGGER.debug("Nouvelle sélection : [" + min + ", " + max + "]");
		if(!enregistrer){
			
			new Selectionner(moteur, new Selection(min, max)).executer();
		}
		else{
			
			new SelectionnerEnregistrable(moteur, enregistreur, new Selection(min, max)).executer();
		}
	}

	/**
	 * Change le booleen décrivant si on doit executer des commandes enregistrables ou non
	 * @param b
	 */
	public void setEnregistrer(boolean b){
		
		enregistrer = b;
	}
}