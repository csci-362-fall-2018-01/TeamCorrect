package org.glucosio.android.TeamCorrectTestExecutables;
import java.text.NumberFormat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TestCase20 {

    private static ReadingTools readingToolsTest;
    public static void setup(){
        readingToolsTest = new ReadingTools();
    }

    public static void parseTest(String reading) {
        
        Number numReturn = readingToolsTest.parseReading(reading);

        System.out.println("str to number " + reading + " = " + numReturn);
    }



    public static void main(String[] args) {
        setup();
        parseTest(6);
 
			
		}
    	
    	
    	
    
}
