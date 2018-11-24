package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase02 {
	
	
	public static void CalculatesGlucoseToA1C(double input) {
		
		double glucA1Cvalue1 = GlucosioConverter.glucoseToA1C(input);
		
		System.out.println("---- " + input +" glucose level converted to A1C value " + glucA1Cvalue1);
		
	}
	
	public static void main(String[] args) {

		String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			double inputValue;
			
			
			while(line!=null) {
				if(line.equals("#TestCase02")){
					line = reader.readLine();
					while((line.equals("#TestCase03"))==false){
						inputValue = Double.parseDouble(line);
						CalculatesGlucoseToA1C(inputValue);
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
