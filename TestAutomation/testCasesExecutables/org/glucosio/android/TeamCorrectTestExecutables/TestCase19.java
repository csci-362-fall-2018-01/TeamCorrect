
package org.glucosio.android.TeamCorrectTestExecutables;
import org.glucosio.android.TeamCorrectTestExecutables.GlucosioConverter;


public class TestCase19 {

    private static GlucosioConverter test = new GlucosioConverter();
    public void setup(){
        test = new GlucosioConverter();
    }

    public static void glucoseToMmolLTest() {
        double value = 60;
        System.out.println("glucoseToMmolL: " + test.glucoseToMmolL(value));
    }

    public static void glucoseToA1CTest() {
        double value = 60;
        System.out.println("glucoseToA1C: " + test.glucoseToA1C(value));
    }

    public static void a1cToGlucoseTest() {
        double value = 6.0;
        System.out.println("a1cToGlucose: " + test.a1cToGlucose(value));
    }

    public static void a1cNgspToIfccTest() {
        double value = 6.0;
        System.out.println("a1cNgspToIfcc: " + test.a1cNgspToIfcc(value));
    }

    public static void a1cIfccToNgspTest() {
        double value = 64;
        System.out.println("a1cIfccToNgsp: " + test.a1cIfccToNgsp(value));
    }


    public static void main(String[] args) {
        glucoseToMmolLTest();
        glucoseToA1CTest();
        a1cToGlucoseTest();
        a1cNgspToIfccTest();
        a1cIfccToNgspTest();
    }
}
