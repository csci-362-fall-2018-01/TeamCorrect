
package org.glucosio.android.TeamCorrectTestExecutables;
import java.text.NumberFormat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TestCase20 {

    private static ReadingTools readingToolsTest;
    public static void setup(){
        readingToolsTest = new ReadingTools();
    }

    public static void parseTest(String reading) {
        
        Number numReturn = readingToolsTest.parseReading(reading);

        System.out.println("str to number " + reading + " = " + numReturn);
    }



    public static void main(String[] args) {
        setup();
   String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			String inputValue;
			
			
			while(line!=null) {
				if(line.equals("#TestCase20")){
					line = reader.readLine();
					while((line.equals("#TestCase21"))==false){
						inputValue = line.toString();
						parseTest(inputValue);
						line = reader.readLine();
					}

				}
				
				line = reader.readLine();	
			}
			reader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			
		}
    	
    	
    	
    
}
