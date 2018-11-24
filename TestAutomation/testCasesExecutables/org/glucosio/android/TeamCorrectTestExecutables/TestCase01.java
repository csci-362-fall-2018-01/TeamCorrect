package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase01 {

    private static Reminder reminderTester;

   
    public static void setup(){
        reminderTester = new Reminder();
    }

   
    
    
    public static void SetsMetric_WhenProvided(String metric) {
       

        reminderTester.setMetric(metric);

        System.out.println(" ---- Metric returned = " + reminderTester.getMetric());
        
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
				if(line.equals("#TestCase01")){
					line = reader.readLine();
					while((line.equals("#TestCase02"))==false){
						inputValue = line.toString();
						SetsMetric_WhenProvided(inputValue);
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
