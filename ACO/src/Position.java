

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public final class Position
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int val;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Position(){
		
		val = -1;
	}
	
	public Position(int p){
		
		if(p < 0){
			
			throw new IllegalArgumentException("Passages de mauvais arguments au constructeur Position");
		}
		
		val = p;
	}
	
	public void setPos(int val){
		
		this.val = val;
	}
	
	public int getPos(){
		
		return val;
	}
}

