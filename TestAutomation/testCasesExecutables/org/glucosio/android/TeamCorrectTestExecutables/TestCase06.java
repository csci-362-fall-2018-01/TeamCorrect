package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase06 {

    private static CholesterolReading cholTester;


    public static void setup(){
        cholTester = new CholesterolReading();
    }


    
    public static void SetsLDLReading_WhenProvided(double ldlReading) {
        
        
        cholTester.setLDLReading(ldlReading);
        
        System.out.println("LDL reading set to " + cholTester.getLDLReading() + " ----");
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
				if(line.equals("#TestCase06")){
					line = reader.readLine();
					while((line.equals("#TestCase07"))==false){
						inputValue = Double.parseDouble(line);
						SetsLDLReading_WhenProvided(inputValue);
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
