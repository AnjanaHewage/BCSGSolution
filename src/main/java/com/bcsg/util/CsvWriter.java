/**
 * 
 */
package com.bcsg.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.log4j.Logger;

import com.bcsg.vo.CsvRow;

/**
 * Class used in writing the CSV file
 * 
 * @author User
 *
 */
public class CsvWriter {

    //Delimiter used in CSV file
    private static final String NEW_LINE_SEPARATOR = "\n";
    
	/** Logging context. */
	static Logger log = Logger.getLogger(CsvWriter.class);
	
	/**
	 * 
	 */
	public CsvWriter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Sorts the list and then writes it to the specified file
	 * 
	 * @param csvRowList
	 * @param outFile
	 */
	public void writeCsvFile(ArrayList<CsvRow> csvRowList, String outFile){
		
		//Sort the csvRowList
		Collections.sort(csvRowList);
		
        FileWriter fileWriter = null;       

        CSVPrinter csvFilePrinter = null;
        //Create the CSVFormat object with "\n" as a record delimiter

        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
        try {
            //initialize FileWriter object
            fileWriter = new FileWriter(outFile);

            //initialize CSVPrinter object
            csvFilePrinter = new CSVPrinter(fileWriter, csvFileFormat);

             //Create CSV file header
            //csvFilePrinter.printRecord(FILE_HEADER);


            //Write a new csvRow object list to the CSV file
            for (CsvRow csvRow : csvRowList) {
                ArrayList<String> studentDataRecord = new ArrayList<String>();
            	
                studentDataRecord.add(csvRow.getBank().getName());
                studentDataRecord.add(csvRow.getCardNumber());
                studentDataRecord.add(csvRow.getBank().getMask());
            	
                csvFilePrinter.printRecord(studentDataRecord);
            }

            log.debug("CSV file created");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
                csvFilePrinter.close();
            } catch (IOException e) {
            	log.error(e.getMessage(), e);
            }
        }
    }
	
	
}
