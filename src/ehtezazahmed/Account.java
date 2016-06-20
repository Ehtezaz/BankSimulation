package ehtezazahmed;
/**
 * 
 * @author Ehtezaz Ahmed
 * @version 1.0
 */
/**
 * 
 * <font color="blue"><b>This is Account Class </b></font>
 *
 */
public abstract class Account {

	protected int number;
	protected double bal;
	Person person;
	
	/**
	 * 
	 * @return integer value number.
	 */
	/**
	 * 
	 * <font color="green"><i>This is getNumber method </i></font>
	 */
	public int getNumber(){
		return number;
	}
	
	/**
	 * 
	 * @return floating value bal.
	 */
	/**
	 * <font color="green"><i>This is getBal method </i></font>
	 * 
	 */
	public double getBal(){
		return bal;
	}
	
	/**
	 * 
	 * @return Person reference.
	 */
	/**
	 * 
	 * <font color="green"><i>This is getOwner method </i></font>
	 */
	public Person getOwner(){
		return person;
	}
	
	/**
	 * <font color="green"><i>This is deposit method </i></font>
	 */
	public void deposit(){
		
	}
	
	public abstract boolean withdraw(double d); 
}
