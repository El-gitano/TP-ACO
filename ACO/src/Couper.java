

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Couper implements Commande
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
	public Couper(MoteurEdition m, iHM ihm){
		
		if(m == null){
			
			throw new IllegalArgumentException("Passages de mauvais arguments à la fonction couper");
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
		
		moteur.couper();
	}
	
}

