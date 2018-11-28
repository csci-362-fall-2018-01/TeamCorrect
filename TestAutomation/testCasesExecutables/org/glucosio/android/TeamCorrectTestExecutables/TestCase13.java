package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase13 {

    private static GlucosioNotificationManager managerTester;
    private static void setup(){
        managerTester = new GlucosioNotificationManager();
    }


    public static void generateRandomNumberTester(int min, int max) {
        int managerReturn = managerTester.generateRandomNumber(min, max);

        System.out.println("Random Number: " + managerReturn + " ---- ");
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			
			
			
			while(line!=null) {
				if(line.equals("#TestCase13")){
					line = reader.readLine();
					while((line.equals("#TestCase14"))==false){
						String[] inputList = line.split("[,]");
							generateRandomNumberTester(Integer.parseInt(inputList[0]),Integer.parseInt(inputList[1]));
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
