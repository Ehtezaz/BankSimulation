package ehtezazahmed;
/**
 * 
 * @author Ehtezaz Ahmed
 * @version 1.0
 *
 */
/**
 * 
 * <font color="blue"><b>This is CheckingAccount Class </b></font> 
 * 
 */
public class CheckingAccount extends Account{

	private double chargeRate;
	/**
	 * this function is used to save accounts.
	 * @param no used as an integer.
	 * @param cR used as floating number.
	 * @param o is the Person reference.
	 */
	/**
	 * 
	 * <font color="green"><i>This is CheckingAccount method </i></font>
	 */
	public CheckingAccount(int no, double cR, Person o) {
		chargeRate = cR;
	}
	
	/**
	 * @param d used as a floating value.
	 * @return a boolean value.
	 */
	/**
	 * <font color="green"><i>This is withdraw method </i></font>
	
	 */
	public boolean withdraw(double d){
		return true;
	}
	
	/**
	 * <font color="green"><i>This is payCharge method </i></font>
	 */
	public void payCharge(){
		
	}
}
