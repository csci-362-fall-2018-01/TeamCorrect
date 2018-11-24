package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase03 {

    private static KetoneReading readingTester;
    public static void setup(){
        readingTester = new KetoneReading();
    }

    

    public static void SetReading_WhenProvided(double reading) {
        
        readingTester.setReading(reading);
        System.out.println(" ---- Reading returned = " + readingTester.getReading());

    }

    

    public static void main(String[] args) {
        setup();
        
    	String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			double inputValue;
			
			
			while(line!=null) {
				if(line.equals("#TestCase03")){
					line = reader.readLine();
					while((line.equals("#TestCase04"))==false){
						inputValue = Double.parseDouble(line);
						SetReading_WhenProvided(inputValue);
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
