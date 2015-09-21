/**
 * 
 */
package com.bcsg.vo.bank;

/**
 * @author User
 *
 */
public class HSBCCanada implements Bank {

	/** The mask for a HSBC Canada card number*/
	private final String mask = "56xx-xxxx-xxxx-xxxx";
	
	/** Name of the bank*/
	private static String name = "HSBC Canada";
	/**
	 * 
	 */
	public HSBCCanada() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bcsg.vo.bank.Bank#getMask()
	 */
	public String getMask() {
		// TODO Auto-generated method stub
		return mask;
	}

	public String getName() {
		return name;
	}




	
	

}
