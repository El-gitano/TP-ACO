import java.lang.IllegalArgumentException;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Coller implements Commande
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
	public Coller(MoteurEdition m, iHM ihm){
		
		if(m == null){
			
			throw new IllegalArgumentException("Passages de mauvais arguments à la fonction coller");
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
		
		moteur.coller();
	}
}

