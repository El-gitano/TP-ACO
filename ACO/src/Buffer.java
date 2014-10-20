

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Buffer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private StringBuffer zonetexte;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Buffer(){
		
		zonetexte = new StringBuffer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getContenu(Selection s) {
		
		return zonetexte.substring(s.getDebut(), s.getFin());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setContenu(String chaine, Selection select) {
		
		zonetexte.insert(select.getDebut(), chaine);
	}
	
	public void supprimerContenu(Selection select){
		
		zonetexte.delete(select.getDebut(), select.getFin());
	}
}

