package fr.istic.foucaultbertier.aco.mementos;

/**
 * Cette classe est chargée de stocker et restituer l'état d'un objet Buffer
 * @see Buffer
 */
public class MementoBuffer {

	private StringBuffer contenu;
	private int offsetModif;
	
	/**
	 * Crée le memento
	 * @param contenu Le contenu du buffer (non-null)
	 * @param offsetModif L'offset décrivant la position du curseur suit à la dernière modification (positif ou nul)
	 */
	public MementoBuffer(StringBuffer contenu, int offsetModif){
		
		if(contenu == null){
			
			throw new IllegalArgumentException("contenu est à null");
		}

		if(offsetModif<0){
			
			throw new IllegalArgumentException("offsetModif est négatif");
		}

		this.contenu = contenu;
		this.offsetModif = offsetModif;
	}
	
	/**
	 * Restitue le contenu du memento
	 * @return Le contenu du buffer qui a été précédemment sauvegardé
	 */
	public StringBuffer getContenu(){
		
		return new StringBuffer(contenu);
	}
	
	/**
	 * Stocke le contenu d'un buffer
	 * @param contenu Le contenu d'un buffer (non null)
	 */
	public void setContenu(StringBuffer contenu){
		
		if(contenu == null){
			
			throw new IllegalArgumentException("contenu est à null");
		}
		
		this.contenu = contenu;
	}
	
	public int getOffModif(){
		
		return offsetModif;
	}
	
	public void setOffModif(int offsetModif){
		
		if(offsetModif<0){
			
			throw new IllegalArgumentException("offsetModif est négatif");
		}

		this.offsetModif = offsetModif;
	}
}
