package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase07 {

    private static User userTester;


    public static void setup(){
        userTester = new User();
    }
    
    public static void SetsDType_WhenProvided(int userDType) {
        
        
        userTester.setD_type(userDType);
        
        System.out.println("User's diabetes type set to Type " + userTester.getD_type() + " ----");
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
				if(line.equals("#TestCase07")){
					line = reader.readLine();
					while((line.equals("#TestCase08"))==false){
						inputValue = Integer.parseInt(line);
						SetsDType_WhenProvided(inputValue);
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
