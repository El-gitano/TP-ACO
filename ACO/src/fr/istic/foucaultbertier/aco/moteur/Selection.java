package fr.istic.foucaultbertier.aco.moteur;

/**
 * La classe Selection représente la sélection de l'utilisateur.
 */
public final class Selection
{
	/**
	 * Indique l'indice de début de la sélection
	 */
	private int debut;
	
	/**
	 * Indique l'indice de fin de la sélection
	 */
	private int fin;
	
	/**
	 * Crée une sélection à partir du début et de la fin de celle-ci
	 * @param debut 	Le début de la sélection (positif ou nul)
	 * @param fin 		La fin de la sélection (supérieur ou égal à début)
	 */
	public Selection(final int debut, final int fin){
		
		/* Préconditions */
		
		if(debut<0){
			
			throw new IllegalArgumentException("Début est négatif");
		}
		if(fin < 0){
		
			throw new IllegalArgumentException("Fin est négatif");
		}
		if(fin < debut){
			
			throw new IllegalArgumentException("Fin est inférieur à début");
		}
		
		/* Traitement */
		this.debut = debut;
		this.fin = fin;
	}

	/**
	 * Retourne le début de la sélection
	 * @return Le début de la sélection
	 */
	public final int getDebut() {
		
		return debut;
	}
	
	/**
	 * Retourn la fin de la sélection
	 * @return La fin de la sélection
	 */
	public final int getFin() {
		
		return fin;	
	}
	
	/**
	 * Retourne la longueur de la sélection
	 * @return La longueur de la sélection
	 */
	public final int getLongueur() {
		
		return fin-debut;
	}
	
	/**
	 * Rend la sélection vide en plaçant l'indice de fin au niveau de l'indice de début
	 */
	public final void rendreVide(){
		
		fin = debut;
	}
	
	/**
	 * Retourne vrai si l'indice du début de la sélection est égal à la celui de la fin
	 * @return Vrai si la sélection est vide, faux sinon
	 */
	public final boolean estVide() {
		
		return (debut==fin);
	}
	
	/**
	 * Permet de spécifier une nouvelle sélection à l'aide des indices de début et de fin
	 * @param debut 	Le début de la sélection (positif ou nul)
	 * @param fin 		La fin de la sélection (supérieur ou égal à début)
	 */
	public final void setSelection(final int debut, final int fin) {
		
		/* Préconditions */
		
		if(debut<0){
			
			throw new IllegalArgumentException("Début est négatif");
		}
		if(fin < 0){
		
			throw new IllegalArgumentException("Fin est négatif");
		}
		if(fin < debut){
			
			throw new IllegalArgumentException("Fin est inférieur à début");
		}
		
		/* Traitement */
		this.debut = debut;
		this.fin = fin;
	}
	
	/**
	 * Permet de spécifier une nouvelle sélection à partir d'une autre sélection
	 * @param selection	La nouvelle selection
	 */
	public final void setSelection(final Selection selection) {
		
		/* Préconditions */
		
		if(selection == null){
			
			throw new IllegalArgumentException("selection est négatif");
		}
	
		/* Traitement */
		this.debut = selection.getDebut();
		this.fin = selection.getFin();
	}
}