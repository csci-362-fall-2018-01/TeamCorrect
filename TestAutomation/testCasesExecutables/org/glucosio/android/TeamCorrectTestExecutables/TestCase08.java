package org.glucosio.android.TeamCorrectTestExecutables;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase08 {

    private static ActionTip actionTester;


    public static void setup(){
        actionTester = new ActionTip();
    }

    public static void SetsTipDescription_WhenProvided(String tipDes) {
        
        
        actionTester.setTipDescription(tipDes);
        
        System.out.println(" ---- Tip: " + actionTester.getTipDescription());
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
				if(line.equals("#TestCase08")){
					line = reader.readLine();
					while((line.equals("#TestCase09"))==false){
						inputValue = line.toString();
						SetsTipDescription_WhenProvided(inputValue);
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
