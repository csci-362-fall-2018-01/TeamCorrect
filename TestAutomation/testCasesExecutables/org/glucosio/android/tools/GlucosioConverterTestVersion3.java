package org.glucosio.android.tools;

import org.glucosio.android.tools.GlucosioConverter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GlucosioConverterTestVersion3 {
	
	//private static GlucosioConverter gluConverterTester = new GlucosioConverter();
	public static void CalculatesGlucoseToA1C(double input) {
		/*double value1 = 10.0;
		double value2 = 25.0;
		double value3 = 50.0;
		double value4 = 0.0;*/
		double glucA1Cvalue1 = GlucosioConverter.glucoseToA1C(input);
		/*double glucA1Cvalue2 = GlucosioConverter.glucoseToA1C(value2);
		double glucA1Cvalue3 = GlucosioConverter.glucoseToA1C(value3);
		double glucA1Cvalue4 = GlucosioConverter.glucoseToA1C(value4);*/
		System.out.println(input +" glucose level converted to " + glucA1Cvalue1);
		/*System.out.println(value2 +" glucose level converted to " + glucA1Cvalue2);
		System.out.println(value3 +" glucose level converted to " + glucA1Cvalue3);
		System.out.println(value4 +" glucose level converted to " + glucA1Cvalue4);*/
	}
	
	public static void main(String[] args) {
		String filePath = new File("").getAbsolutePath();
		
        BufferedReader reader;
        try {
        	reader = new BufferedReader(new FileReader(filePath + "/TestInputFileTest1.txt"));
        	String line = reader.readLine();
        	double inputValue;
        	
        	
        	while(line!=null) {
        		inputValue = Double.parseDouble(line);
        		CalculatesGlucoseToA1C(inputValue);
        		line = reader.readLine();
        		
        	}
        	reader.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
		
	}

}
