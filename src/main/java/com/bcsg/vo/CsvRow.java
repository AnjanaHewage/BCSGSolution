/**
 * 
 */
package com.bcsg.vo;

import java.util.Date;

import com.bcsg.vo.bank.Bank;

/**
 * This class represents data in a row of the CSV file
 * 
 * @author User
 *
 */
public class CsvRow implements Comparable<CsvRow>{

	private Bank bank;
	private String cardNumber;
	private Date expDate;
	
		
	public CsvRow(Bank bank, String cardNumber, Date expDate) {
		super();
		this.bank = bank;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	public int compareTo(CsvRow arg0) {
		// TODO Auto-generated method stub
		//return getExpDate().compareTo(arg0.getExpDate());
		//Reverse sort
		return arg0.getExpDate().compareTo(getExpDate());
	}
	
	
	
	
}
