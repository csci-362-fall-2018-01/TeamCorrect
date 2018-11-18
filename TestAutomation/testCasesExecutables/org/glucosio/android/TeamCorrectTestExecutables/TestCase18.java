package org.glucosio.android.object;
import org.glucosio.android.tools.GlucosioConverter;
import java.text.NumberFormat;

package org.glucosio.android.TeamCorrectTestExecutables;
import org.glucosio.android.TeamCorrectTestExecutables.A1cEstimate;


public class TestCase18 {

    private static A1cEstimate test = new A1cEstimate();
    public void setup(){
        test = new A1cEstimate();
    }

    public static void SetsValue_WhenProvided() {
        double value = 8.5;
        test.setValue(value);
        System.out.println("---- Value returned = " + test.getValue());
    }


    public static void SetMonth_WhenProvided() {
        String month = "June";
        test.setMonth(month);
        System.out.println(" ---- Month returned = " + test.getMonth());

    }

    public static void average(){

        System.out.println(" Average: " + test.getGlucoseAverage());

    }


    public static void main(String[] args) {
        SetsValue_WhenProvided();
        SetMonth_WhenProvided();
        average();
    }
}