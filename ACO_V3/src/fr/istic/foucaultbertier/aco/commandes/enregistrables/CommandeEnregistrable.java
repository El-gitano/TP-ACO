package fr.istic.foucaultbertier.aco.commandes.enregistrables;

import fr.istic.foucaultbertier.aco.commandes.Commande;
import fr.istic.foucaultbertier.aco.mementos.Memento;

/**
 * Cette interface est implémenté par les commandes enregistrables. De façon à sauvegarder et restaurer leurs état, le pattern Memento est utilisé.
 * @author Antoine
 * @see Enregistreur
 * @see Memento
 */
public interface CommandeEnregistrable extends Commande {

		/**
		 * Founit un memento enregistrant l'état de l'objet
		 * @return L'état de l'objet stocké sous forme de Memento
		 * @see Memento
		 */
		public Memento getMemento();
		
		/**
		 * Restaure l'état à partir du memento passé en paramètre
		 * @param memento L'état de l'objet stocké sous forme de mémento
		 */
		public void restaurer(Memento memento);
}
