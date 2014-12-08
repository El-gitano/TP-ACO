package fr.istic.foucaultbertier.aco.ihm;

import javax.swing.JTextArea;

import fr.istic.foucaultbertier.aco.commandes.Coller;
import fr.istic.foucaultbertier.aco.commandes.Copier;
import fr.istic.foucaultbertier.aco.commandes.Couper;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe hérite de JTextArea afin de traiter les actions de copie, coupe, collage
 */
public class ZoneTexte extends JTextArea {

	static final long serialVersionUID = 8166387793964966707L;

	private MoteurEdition moteur;
	
	/**
	 * Crée la zone de texte
	 * @param moteur Le moteur d'edition auquel adresser les commandes
	 * @param enregistreur L'enregistreur auquel adresser les commandes enregsitrables
	 */
	public ZoneTexte(int hauteur, int largeur, MoteurEdition moteur){
		
		super(hauteur, largeur);
		
		if(moteur == null){
			
			throw new IllegalAccessError("moteur est à null");
		}

		this.moteur = moteur;
	}
	
	/**
	 * Lance une commande CopierEnregsitrable
	 * @see CopierEnregistrable
	 */
	@Override
	public void copy(){
		
		new Copier(moteur).executer();
	}
	
	/**
	 * Lance une commande CouperEnregsitrable
	 * @see CouperEnregistrable
	 */
	@Override
	public void cut(){
		
		new Couper(moteur).executer();
	}
	
	/**
	 * Lance une commande CollerEnregsitrable
	 * @see CollerEnregistrable
	 */
	@Override
	public void paste(){
		
		new Coller(moteur).executer();
	}
}
