package fr.istic.foucaultbertier.aco;

/**
 * L'interface Observable décrit un objet qui notifie des objets Observateur lorsque la structure interne de ses données change
 * @see Observateur
 */
public  interface Observable 
{
	/**
	 * Ajoute un observateur à la structure de donnée répertoriant les observateurs de l'objet. Celui-ci sera donc notifié des changements dans la structure interne de l'objet observable.
	 * @param o	L'observateur à ajouter
	 */
	public void ajouterObservateur(Observateur o) ;
	
	/**
	 * Notifie l'ensemble des observateurs de l'objet qu'il y a eu un changement dans les données de celui-ci.
	 */
	public void notifierObservateurs() ;
	
	/**
	 * Retire un observateur àla structure de donnée répertoriant les observateurs de l'objet. Celui-ci ne sera donc plus notifié des changements dans la structure interne de l'objet observable.
	 * @param o	L'observateur à retirer
	 */
	public void retirerObservateur(Observateur o) ;
	
	
}

