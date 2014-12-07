package fr.istic.foucaultbertier.aco.mementos;

/**
 * Ce memento est chargé de sauvegarder/restaurer l'état d'un objet Selection
 * @see Selection
 */
public class MementoSelection {

	private int debut;
	private int fin;
	
	/**
	 * Crée le memento à partir de l'état de la selection
	 * Le début doit être inférieur ou égal à la fin
	 * @param debut Le début de la sélection (positif)
	 * @param fin La fin de la sélection (positif)
	 */
	public MementoSelection(int debut, int fin){
		
		if(debut < 0){
			
			throw new IllegalArgumentException("debut est négatif");
		}
		if(fin < 0){
			
			throw new IllegalArgumentException("fin est négatif");
		}
		if(debut > fin){
			
			throw new IllegalArgumentException("debut est supérieur à fin");
		}
		
		this.debut = debut;
		this.fin = fin;
	}
	
	/**
	 * @return Le début de la sélection précédemment sauvegardé
	 */
	public int getDebut(){
		
		return debut;
	}

	/**
	 * @return La fin de la sélection précédemment sauvegardée
	 */
	public int getFin(){
		
		return fin;
	}
	
	/**
	 * Change l'attribut debut de l'objet recevant le message.
	 * Le nouveau debut doit être inférieur ou égal à l'attribut fin actuel
	 * @param debut Le debut qui sera sauvegardé dans le memento (positif)
	 */
	public void setDebut(int debut){
		
		if(debut < 0){
			
			throw new IllegalArgumentException("debut est négatif");
		}

		if(debut > fin){
			
			throw new IllegalArgumentException("debut est supérieur à fin");
		}
		
		this.debut = debut;
	}

	/**
	 * Change l'attribut fin de l'objet recevant le message.
	 * La nouvelle fin doit être supérieur ou égale à l'attribut début actuel
	*/
	public void setFin(int fin){
		
		if(fin < 0){
			
			throw new IllegalArgumentException("debut est négatif");
		}
		
		if(debut > fin){
			
			throw new IllegalArgumentException("debut est supérieur à fin");
		}
		
		this.fin = fin;
	}
}
