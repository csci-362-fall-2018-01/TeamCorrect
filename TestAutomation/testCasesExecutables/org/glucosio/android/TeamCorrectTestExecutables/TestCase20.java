
package org.glucosio.android.TeamCorrectTestExecutables;
import java.text.NumberFormat;


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
        parseTest("6");
        parseTest("1");
        parseTest("2.3");
        parseTest("8.1");






    }
}
