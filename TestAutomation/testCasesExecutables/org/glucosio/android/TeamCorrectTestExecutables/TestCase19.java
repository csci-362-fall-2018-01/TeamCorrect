
package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase19 {

    private static GlucosioConverter glucosioConverterTest;
    public static void setup(){
        glucosioConverterTest = new GlucosioConverter();
    }

    public static void glucoseToMmolLTest(double value) {
        
        System.out.println("glucoseToMmolL: " + glucosioConverterTest.glucoseToMmolL(value));
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
				if(line.equals("#TestCase19")){
					line = reader.readLine();
					while((line.equals("#TestCase20"))==false){
						inputValue = Double.parseDouble(line);
						glucoseToMmolLTest(inputValue);
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
