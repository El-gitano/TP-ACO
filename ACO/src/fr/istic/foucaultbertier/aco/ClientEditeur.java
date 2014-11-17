package fr.istic.foucaultbertier.aco;

import fr.istic.foucaultbertier.aco.ihm.IHM;
import fr.istic.foucaultbertier.aco.moteur.MoteurImplementation;

/**
 * Cette classe est chargée d'instancier les classes nécessaires à l'éditeur, les lier si nécessaire et de lancer l'interface graphique
 */
public final class ClientEditeur
{
	public static void main(String[] args) {
		
		final MoteurImplementation moteur = new MoteurImplementation();
		final IHM ihm = new IHM(moteur);
		moteur.getBuffer().ajouterObservateur(ihm);
	}
}

