
package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase18 {

    private static A1cEstimate a1CEstimateTest;
    public static void setup(){
        a1CEstimateTest = new A1cEstimate();
    }


    public static void SetMonth_WhenProvided(String month) {
        
        a1CEstimateTest.setMonth(month);
        System.out.println(" ---- Month returned = " + a1CEstimateTest.getMonth());

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
				if(line.equals("#TestCase18")){
					line = reader.readLine();
					while((line.equals("#TestCase19"))==false){
						inputValue = line.toString();
						SetMonth_WhenProvided(inputValue);
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
