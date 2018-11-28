package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase12 {

    private static GlucoseRanges grTester;
    private static void setup(){
        grTester = new GlucoseRanges(4.0,8.0);
    }

    public static void colorFromReadingTest(double reading) {

        String grReturn = grTester.colorFromReading(reading);

        System.out.println("color from reading " + reading + " = " + grReturn + " ---- ");
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
      String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			double inputValue;
			
			
			while(line!=null) {
				if(line.equals("#TestCase12")){
					line = reader.readLine();
					while((line.equals("#TestCase13"))==false){
						inputValue = Double.parseDouble(line);
						colorFromReadingTest(inputValue);
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
