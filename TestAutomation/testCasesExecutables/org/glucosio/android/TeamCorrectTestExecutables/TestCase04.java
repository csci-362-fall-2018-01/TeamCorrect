package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase04 {

    private static WeightReading weightReadingTester;


    public static void setup(){
        weightReadingTester = new WeightReading();
    }

    public static void SetsReading_WhenProvided(double reading) {
       

        weightReadingTester.setReading(reading);

        System.out.println("Reading returned = " + weightReadingTester.getReading() + " ---- ");
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
				if(line.equals("#TestCase04")){
					line = reader.readLine();
					while((line.equals("#TestCase05"))==false){
						inputValue = Double.parseDouble(line);
						SetsReading_WhenProvided(inputValue);
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
