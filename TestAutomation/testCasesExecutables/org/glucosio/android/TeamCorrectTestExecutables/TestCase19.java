
package org.glucosio.android.TeamCorrectTestExecutables;


public class TestCase19 {

    private static GlucosioConverter glucosioConverterTest;
    public static void setup(){
        glucosioConverterTest = new GlucosioConverter();
    }

    public static void glucoseToMmolLTest() {
        double value = 60;
        System.out.println("glucoseToMmolL: " + glucosioConverterTest.glucoseToMmolL(value));
    }

    public static void glucoseToA1CTest() {
        double value = 60;
        System.out.println("glucoseToA1C: " + glucosioConverterTest.glucoseToA1C(value));
    }

    public static void a1cToGlucoseTest() {
        double value = 6.0;
        System.out.println("a1cToGlucose: " + glucosioConverterTest.a1cToGlucose(value));
    }

    public static void a1cNgspToIfccTest() {
        double value = 6.0;
        System.out.println("a1cNgspToIfcc: " + glucosioConverterTest.a1cNgspToIfcc(value));
    }

    public static void a1cIfccToNgspTest() {
        double value = 64;
        System.out.println("a1cIfccToNgsp: " + glucosioConverterTest.a1cIfccToNgsp(value));
    }


    public static void main(String[] args) {
        setup();
        glucoseToMmolLTest();
        glucoseToA1CTest();
        a1cToGlucoseTest();
        a1cNgspToIfccTest();
        a1cIfccToNgspTest();
    }
}
