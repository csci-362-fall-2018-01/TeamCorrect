package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase15 {

    private static PressureReading pressureReadingTester;


    public static void setup(){
        pressureReadingTester = new PressureReading();
    }


    public static void SetsId_WhenProvided(int id) {
        

        pressureReadingTester.setId(id);

        System.out.println("Id returned = " + pressureReadingTester.getId() + " ---- ");
    }

    

    public static void main(String[] args) {
        setup();
 String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			int inputValue;
			
			
			while(line!=null) {
				if(line.equals("#TestCase15")){
					line = reader.readLine();
					while((line.equals("#TestCase16"))==false){
						inputValue = Integer.parseInt(line);
						SetsId_WhenProvided(inputValue);
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
