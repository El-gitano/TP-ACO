package fr.istic.foucaultbertier.aco.commandes;

import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

public class Refaire implements Commande {

	private final MoteurEdition moteur;
	
	public Refaire(MoteurEdition moteur){
		
		if(moteur == null){
			
			throw new IllegalArgumentException("moteur est à null");
		}
		
		this.moteur = moteur;
	}
	
	@Override
	public void executer() {
		
		moteur.refaire();
	}
}