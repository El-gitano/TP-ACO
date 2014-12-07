package fr.istic.foucaultbertier.aco.mementos;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Cette classe est chargée de stocker l'état d'une commande InsTexteEnregistrable
 * @see InsTexteEnregistrable
 * @see MementoCommande
 */
public final class MementoInsTexte extends MementoCommande{

	private String texte;
	
	/**
	 * Crée le memento à partir des attributs de la commande enregsitrable
	 * @param texte L'attribut texte de la commande InsTexteEnregistrable (non null)
	 * @see MementoCommande
	 * @see InsTexteEnregistrable
	 */
	public MementoInsTexte(MoteurEdition moteur, Enregistreur enregistreur, String texte){
		
		super(moteur, enregistreur);
		
		if(texte == null){
			
			throw new IllegalArgumentException("texte est à null");
		}
		
		this.texte = texte;
	}
	
	/**
	 * Retourne l'attribut texte du memento
	 * @return L'attribut texte du memento
	 */
	public final String getTexte(){
		
		//Pour éviter que l'objet ne soit modifié
		return new String(texte);
	}
	
	/**
	 * Setter de l'attribut texte de cette classe
	 * @param texte Le nouvel attribut texte (non-null)
	 */
	public final void setTexte(String texte){
		
		if(texte == null){
			
			throw new IllegalArgumentException("texte est à null");
		}
		
		this.texte = texte;
	}
}