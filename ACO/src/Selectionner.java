
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Selectionner implements Commande
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
	 * @ordered
	 */
	
	private iHM iHM;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Selectionner(MoteurEdition m, iHM ihm){
		
		if(m == null || ihm == null){
			
			throw new IllegalArgumentException("Passages de mauvais arguments à la fonction selectionner");
		}
		
		this.moteur = m;
		this.iHM = ihm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void execute() {
		
		Selection s = iHM.getSelection();
		moteur.selectionner(s);
	}
	
}

