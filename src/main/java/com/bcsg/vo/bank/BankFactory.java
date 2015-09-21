/**
 * 
 */
package com.bcsg.vo.bank;

/**
 * Returns the and instance of the bank object by using the
 * bank name passed in
 * 
 * @author User
 *
 */
public class BankFactory {

	/**
	 * 
	 */
	public BankFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Returns the instance of a bank depending on the name
	 * 
	 * @param bankName name of the bank
	 * @return an instance of a certain bank type
	 */
	public static Bank getInstance(String bankName) {
		Bank bank = null;
		
		if (bankName.equals("HSBC Canada")){
			bank = new HSBCCanada();
		} else if (bankName.equals("Royal Bank of  Canada")){
			bank = new RoyalBankCanada();
		} else if (bankName.equals("American Express")){
			bank = new AmericanExpress();
		} else {
			
		}
		
		return bank;
	}
}
