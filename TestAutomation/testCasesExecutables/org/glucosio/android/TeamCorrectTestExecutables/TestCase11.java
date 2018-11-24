package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase11 {

    private static InputFilterMinMax minMaxTester;
    private static void setup(){
        minMaxTester = new InputFilterMinMax(4.0,8.0);
    }

    public static void isInRangeTester(double a,double b, double c) {

        boolean minMaxReturn = minMaxTester.isInRange(a, b, c);

        System.out.println("Range Tester [" + a + "," + b + "," + c + "] = " + minMaxReturn);
    }

    public static void main(String[] args) {
        setup();
        String filePath = new File("").getAbsolutePath();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
			String line = reader.readLine();
			
			
			
			while(line!=null) {
				if(line.equals("#TestCase11")){
					line = reader.readLine();
					while((line.equals("#TestCase12"))==false){
						String[] inputList = line.split("[,]");
						isInRangeTester(Double.parseDouble(inputList[0]),Double.parseDouble(inputList[1]),Double.parseDouble(inputList[2]));
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
