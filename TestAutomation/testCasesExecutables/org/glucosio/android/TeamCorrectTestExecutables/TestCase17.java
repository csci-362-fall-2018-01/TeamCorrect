
package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase17 {

    private static GlucoseReading glucoseReading;
    public static void setup(){
        glucoseReading = new GlucoseReading();
    }


    public static void SetReading_WhenProvided(double reading) {
        
        glucoseReading.setReading(reading);
        System.out.println(" ---- Reading returned = " + glucoseReading.getReading());

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
				if(line.equals("#TestCase17")){
					line = reader.readLine();
					while((line.equals("#TestCase18"))==false){
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
