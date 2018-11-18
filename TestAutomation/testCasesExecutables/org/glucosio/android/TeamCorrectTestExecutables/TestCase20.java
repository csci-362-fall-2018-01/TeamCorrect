
package org.glucosio.android.TeamCorrectTestExecutables;
import org.glucosio.android.TeamCorrectTestExecutables.ReadingTools;
import java.text.NumberFormat;


public class TestCase20 {

    private static ReadingTools test = new ReadingTools();
    public void setup(){
        test = new ReadingTools();
    }

    public static void parseTest(String reading) {
        
        Number numReturn = test.parseReading(reading);

        System.out.println("str to number " + reading + " = " + numReturn);
    }



    public static void main(String[] args) {
        parseTest("6");
        parseTest("1");
        parseTest("2.3");
        parseTest("8.1");






    }
}
