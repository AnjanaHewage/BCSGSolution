/**
 * 
 */
package com.bcsg.main;

import java.util.ArrayList;

import com.bcsg.util.CsvReader;
import com.bcsg.util.CsvWriter;
import com.bcsg.vo.CsvRow;

/**
 * Main class to read and then write the file with the sorted records
 * 
 * @author User
 *
 */
public class BcsgMain {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		//Read the file
		CsvReader csvReader = new CsvReader("mid-test.csv");
		
		ArrayList<CsvRow> rows = csvReader.getCsvFileRows();
		
		//Write the output
		CsvWriter writer = new CsvWriter();
		
		writer.writeCsvFile(rows, "out.csv");
		
		
		
	}

}
