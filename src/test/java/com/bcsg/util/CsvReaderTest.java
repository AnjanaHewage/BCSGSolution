/**
 * 
 */
package com.bcsg.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bcsg.vo.CsvRow;
import com.bcsg.vo.bank.BankFactory;

/**
 * @author User
 *
 */
public class CsvReaderTest {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-yyyy");
	
	private ArrayList<CsvRow> fromFile;
	private ArrayList<CsvRow> mockObj;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//Read the file
		CsvReader reader = new CsvReader("mid-test.csv");
		fromFile = reader.getCsvFileRows();
		
		//Create the ArrayList with the CsvRow objects
		mockObj = new ArrayList<CsvRow>();
		
		mockObj.add(new CsvRow(BankFactory.getInstance("HSBC Canada"), "5601-2345-3446-5678", dateFormat.parse("Nov-2017")));
		mockObj.add(new CsvRow(BankFactory.getInstance("Royal Bank of  Canada"), "4519-4532-4524-2456", dateFormat.parse("Oct-2017")));
		mockObj.add(new CsvRow(BankFactory.getInstance("American Express"), "3786-7334-8965-345", dateFormat.parse("Dec-2018")));
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {		
	}

	/**
	 * Test method for {@link com.bcsg.util.CsvReader#getCsvFileRows()}.
	 */
	@Test
	public void testGetCsvFileRows() {
		
		assertEquals(((CsvRow)fromFile.get(0)).getCardNumber(), ((CsvRow)mockObj.get(0)).getCardNumber());
		
	}

}
