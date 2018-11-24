package org.glucosio.android.TeamCorrectTestExecutables;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase09 {

    private static GlucoseData gdTester;
    


    public static void setup(){
        gdTester = new GlucoseData();
    }


    public static void FormatGlucoseData_WhenProvided(int mgdl, boolean mmol) {
        

        String gdReturn = gdTester.glucose(mgdl, mmol);

        System.out.println("mgdl:  " + mgdl + ", mmol: " + mmol + ", Glucose: " + gdReturn + " ---- ");
    }
    
    


    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        	String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			int inputValue;
			
			
			while(line!=null) {
				if(line.equals("#TestCase09")){
					line = reader.readLine();
					while((line.equals("#TestCase10"))==false){
						inputValue = Integer.parseInt(line);
						FormatGlucoseData_WhenProvided(inputValue,true);
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
