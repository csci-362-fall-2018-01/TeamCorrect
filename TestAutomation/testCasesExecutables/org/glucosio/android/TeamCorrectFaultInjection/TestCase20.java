package org.glucosio.android.TeamCorrectFaultInjection;



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
        
        System.out.println("ReadingTools.parseReading --- Fault: Set all returns to null (ReadingTools.parseReading). ---");
        parseTest("6");
 
			
		}
    	
    	
    	
    
}
