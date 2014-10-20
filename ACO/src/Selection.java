

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Selection
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int longueur;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Position debut;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Selection(Position p){
		
		if(p == null){
			
			throw new IllegalArgumentException("Passages de mauvais arguments au constructeur Selection");
		}
		
		debut = p;
		longueur = 0;
	}
	
	public Selection(Position p, int l){
		
		if(p == null || l < 0){
			
			throw new IllegalArgumentException("Passages de mauvais arguments au constructeur Selection");
		}
		
		debut = p;
		longueur = l;
	}

	public Boolean estVide(){
		
		return(longueur == 0);
	}
	
	public void setSelection(int newDebut, int newLongueur){
		
		longueur = newLongueur;
		debut.setPos(newDebut);
	}
	
	public int getDebut(){
		
		return debut.getPos();
	}
	
	public int getLongueur(){
		
		return longueur;
	}
	
	public int getFin(){
		
		return getDebut()+getLongueur();
	}
}

