/**
 * 
 */
package com.bcsg.vo.bank;

/**
 * @author User
 *
 */
public class RoyalBankCanada implements Bank {
	/** The mask for a Royal Bank of Canada card number*/
	private final String mask = "4519-xxxx-xxxx-xxxx";
	
	/** Name of the bank*/
	private static final String name = "Royal Bank of  Canada";
	
	/**
	 * 
	 */
	public RoyalBankCanada() {
		
	}

	/**
	 * 
	 */
	public String getMask() {
		
		return mask;
	}

	/**
	 * 
	 */
	public String getName() {
		return name;
	}




	
	

}
