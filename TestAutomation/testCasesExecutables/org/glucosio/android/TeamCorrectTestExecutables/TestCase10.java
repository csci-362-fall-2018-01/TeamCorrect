package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TestCase10 {

    private static ReadingTools rtTester;
    private static void setup(){ rtTester = new ReadingTools(); }

    public static void testHourToSpinnerType(int hour) {
        

        int rtReturn = rtTester.hourToSpinnerType(hour);
        String timeOfDay = "";
        if (rtReturn == 8){
            timeOfDay = "night";
        }
        else if(rtReturn== 5){
            timeOfDay="after dinner";
        }
        else if(rtReturn== 4){
            timeOfDay="before dinner";
        }
        else if(rtReturn== 3){
            timeOfDay="after lunch";
        }
        else if(rtReturn== 2){
            timeOfDay="before lunch";
        }
        else if(rtReturn== 1){
            timeOfDay="after breakfast";
        }
        else{
            timeOfDay="before breakfast";
        }

        System.out.println("Hour: " + hour + ", SpinnerType: " + rtReturn + ", Time of day: " +timeOfDay+ " ---- ");
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
				if(line.equals("#TestCase10")){
					line = reader.readLine();
					while((line.equals("#TestCase11"))==false){
						inputValue = Integer.parseInt(line);
						testHourToSpinnerType(inputValue);
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
