


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Insertxt implements Commande
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
	public Insertxt(MoteurEdition m, iHM ihm){
		
		if(m == null || ihm == null){
			
			throw new IllegalArgumentException("Passages de mauvais arguments à la fonction insertxt");
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
		
		String chaine = iHM.getText();
		moteur.insertxt(chaine);
	}
	
}

