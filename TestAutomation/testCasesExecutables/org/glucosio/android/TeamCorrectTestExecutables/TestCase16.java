
package org.glucosio.android.TeamCorrectTestExecutables;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase16 {

    private static HB1ACReading test;
    public static void setup(){
        test = new HB1ACReading();
    }


    public static void SetReading_WhenProvided(double reading) {
        
        test.setReading(reading);
        System.out.println(" ---- Reading returned = " + test.getReading());

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
				if(line.equals("#TestCase16")){
					line = reader.readLine();
					while((line.equals("#TestCase17"))==false){
						inputValue = Double.parseDouble(line);
						SetReading_WhenProvided(inputValue);
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
