/**
 * 
 */
package com.bcsg.vo.bank;

/**
 * @author User
 *
 */
public class AmericanExpress implements Bank{

	/** The mask for an American Express card number*/
	private final String mask = "xxxx-xxxx-xxxx-345";
		
	/** Name of the bank*/
	private static String name = "American Express";
	
	/**
	 * 
	 */
	public AmericanExpress() {
		
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
