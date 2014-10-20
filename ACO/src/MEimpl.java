


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MEimpl implements MoteurEdition
{
	private Buffer buffer;
	private Selection selection;
	private PressePapier pPapier;
	
	public MEimpl(){
		
		buffer = new Buffer();
		selection = new Selection(new Position());
		pPapier = new PressePapier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void selectionner(Selection select) {
		if(select==null){
			throw new IllegalArgumentException("Passages de mauvais arguments MEimpl");
			
		}
		selection.setSelection(select.getDebut(), select.getFin());
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void copier() {
		if (!selection.estVide()){
			pPapier.setContenu(buffer.getContenu(selection));
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void insertxt(String chaine) {
		if (!selection.estVide()){
			buffer.supprimerContenu(selection);
		}
		buffer.setContenu(chaine, selection);
		selection.setSelection(selection.getDebut()+chaine.length(), 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void coller() {
		if (!selection.estVide()){
			buffer.supprimerContenu(selection);
		}
		buffer.setContenu(pPapier.getContenu(), selection);
		selection.setSelection(selection.getDebut()+pPapier.getContenu().length(), 0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void couper() {
		if (!selection.estVide()){
			
			pPapier.setContenu(buffer.getContenu(selection));
			buffer.supprimerContenu(selection);
			selection.setSelection(selection.getDebut(), 0);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	public void supprtexte() {
		if (!selection.estVide()){
			
			buffer.supprimerContenu(selection);
			selection.setSelection(selection.getDebut(), 0);
		}
		else{
			
			selection.setSelection(selection.getDebut()-1, 1);
			buffer.supprimerContenu(selection);
			selection.setSelection(selection.getDebut(), 0);
		}
	}
}

