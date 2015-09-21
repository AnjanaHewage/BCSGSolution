/**
 * 
 */
package com.bcsg.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.log4j.Logger;

import com.bcsg.vo.CsvRow;
import com.bcsg.vo.bank.Bank;
import com.bcsg.vo.bank.BankFactory;

/**
 * This class reads the CSV file passed in to the constructor
 * 
 * @author User
 *
 */
public class CsvReader {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-yyyy");
	
	private String filePath;
	
	/** Logging context. */
	static Logger log = Logger.getLogger(CsvReader.class);
	
	/**
	 * 
	 * @param filePath
	 */
	public CsvReader(String filePath) {
		this.filePath = filePath;
	}
	
	/**
	 * Returns an ArrayList comprising of the CsvRow objects from the file
	 * 
	 * @return
	 */
	public ArrayList<CsvRow> getCsvFileRows(){
		ArrayList<CsvRow> rows = new ArrayList<CsvRow>();
		
		Reader in;
		try {
			in = new FileReader(this.filePath);
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
			
			//Go through the records of the CSV file
			for (CSVRecord record : records) {			    	
				Bank bank = BankFactory.getInstance(record.get(0));
			    String cardNumber = record.get(1);
			    String expDate = record.get(2);
			    
			    Date date = dateFormat.parse(expDate);		    
			    
			    //Create CscRow object
			    CsvRow row = new CsvRow(bank, cardNumber, date);
			    
			    //Add the row to the list
			    rows.add(row);			    
			}
		} catch (FileNotFoundException e) {
			log.error(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		} catch (ParseException e) {
			log.error(e.getMessage(), e);
		}
				
		return rows;
	}
	

}
