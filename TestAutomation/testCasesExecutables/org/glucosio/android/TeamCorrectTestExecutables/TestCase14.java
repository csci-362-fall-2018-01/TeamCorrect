package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase14 {

    private static PressureReading pressureReadingTester;


    public static void setup(){
        pressureReadingTester = new PressureReading();
    }

    public static void SetsMaxReading_WhenProvided(double maxReading) {

        pressureReadingTester.setMaxReading(maxReading);

        System.out.println("Max Reading returned = " + pressureReadingTester.getMaxReading() + " ---- ");
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
				if(line.equals("#TestCase14")){
					line = reader.readLine();
					while((line.equals("#TestCase15"))==false){
						inputValue = Double.parseDouble(line);
						SetsMaxReading_WhenProvided(inputValue);
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
