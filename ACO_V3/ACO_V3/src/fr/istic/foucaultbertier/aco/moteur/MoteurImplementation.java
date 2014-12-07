package fr.istic.foucaultbertier.aco.moteur;

import fr.istic.foucaultbertier.aco.mementos.MementoSysteme;


/**
 * La classe MoteurImplementation représente une implémentation d'un moteur d'édition
 * @see MoteurEdition
 */
public final class MoteurImplementation implements MoteurEdition
{
	
	private final Selection selection;
	private final Buffer buffer;
	private final PressePapier pressePapier;
	private final GestionnaireHisto historique;
	
	/**
	 * Instancie l'ensemble des objets nécessaires à la mise en oeuvre d'un moteur d'édition
	 */
	public MoteurImplementation(){
		
		selection = new Selection(0, 0);
		buffer = new Buffer();
		pressePapier = new PressePapier();
		
		historique = new GestionnaireHisto();
		sauvegarderEtat();
	}

	/**
	 * Copie dans le presse-papier le contenu du buffer spécifié par la sélection passée en paramètre
	 */
	@Override
	public final void copier() {
		
		if(!selection.estVide()){
			
			pressePapier.setContenu(buffer.getContenu(selection));
		}
	}
	
	/**
	 * Colle le contenu du presse-papier dans le buffer à la suite de la sélection (ou en remplaçant celle-ci si elle n'est pas vide)
	 */
	@Override
	public final void coller() {
		
		if(!pressePapier.vide()){
			
			buffer.ajouterTexte(pressePapier.getContenu(), selection);
			sauvegarderEtat();
		}
	}
	
	/**
	 * Copie le contenu du buffer spécifié par la sélection dans le presse-papier et supprime celui-ci du buffer
	 */
	@Override
	public final void couper() {
		
		if(!selection.estVide()){
			
			pressePapier.setContenu(buffer.getContenu(selection));
			buffer.supprimerTexte(selection);
			sauvegarderEtat();
		}
	}
	
	/**
	 * Insère la chaîne passée en paramètre dans le buffer (et supprime la sélection si elle n'est pas vide)
	 * @param chaine La chaîne à insérer (non null)
	 */
	@Override
	public final void insererTexte(final String chaine) {
		
		if(chaine == null){
			
			throw new IllegalArgumentException("chaine est à null");
		}
		
		buffer.ajouterTexte(chaine, selection);
		sauvegarderEtat();
	}
	
	/**
	 * Met à jour la sélection du moteur à partir d'une autre sélection
	 * @param selection La nouvelle sélection (non null)
	 */
	@Override
	public final void selectionner(final Selection selection) {
		
		if(selection == null){
			
			throw new IllegalArgumentException("selection est à null");
		}
		
		int chgDebut = selection.getDebut();
		int chgFin = selection.getFin();
		
		//Rajout pour les commandes enregistrables
		if(chgFin > buffer.getSelMax()){
			
			chgFin = buffer.getSelMax();
		}
		if(chgDebut > buffer.getSelMax()){
			
			chgDebut = buffer.getSelMax();
		}
		
		this.selection.setSelection(new Selection(chgDebut, chgFin));
	}
	
	/**
	 * Supprime le texte du buffer spécifié par la sélection si elle n'est pas vide, sinon supprime le dernier caractère du buffer
	 */
	@Override
	public final void supprimerTexte() {
		
		buffer.supprimerTexte(selection);
		sauvegarderEtat();
	}
	
	/**
	 * Retourne le buffer du moteur afin de mettre en place le pattern Observer
	 * @return Le buffer du moteur
	 */
	public final Buffer getBuffer(){
		
		return buffer;
	}
	
	/**
	 * Remet le Buffer et la Selection à leurs état au temps N-1
	 */
	public final void defaire(){
		
		MementoSysteme memSysteme = historique.defaire();
		buffer.restaurer(memSysteme.getMemBuffer());
		selection.restaurer(memSysteme.getMemSelection());
	}
	
	/**
	 * Rétablit un changement précédemment annulé à l'aide de defaire()
	 */
	public final void refaire(){
		
		if(historique.peutRefaire()){
			
			MementoSysteme memSysteme = historique.refaire();
			buffer.restaurer(memSysteme.getMemBuffer());
			selection.restaurer(memSysteme.getMemSelection());
		}
	}
	
	/**
	 * Sauvegarde l'état du Buffer et de la Selection dans le gestionnaire d'historique
	 */
	private final void sauvegarderEtat(){
		
		historique.ajouterElement(new MementoSysteme(buffer.getMemento(), selection.getMemento()));
	}
}

