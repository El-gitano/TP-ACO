

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Supprtexte implements Commande
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private MoteurEdition moteur;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Supprtexte(MoteurEdition m){
		
		if(m == null){
			
			throw new IllegalArgumentException("Passages de mauvais arguments à la fonction supprtexte");
		}
		
		this.moteur = m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void execute() {
		
		moteur.supprtexte();
	}
	
}

