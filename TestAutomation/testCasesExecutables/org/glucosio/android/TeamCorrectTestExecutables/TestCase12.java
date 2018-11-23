package org.glucosio.android.TeamCorrectTestExecutables;



public class TestCase12 {

    private static GlucoseRanges grTester;
    private static void setup(){
        grTester = new GlucoseRanges(4.0,8.0);
    }

    public static void colorFromReadingTest(double reading) {

        String grReturn = grTester.colorFromReading(reading);

        System.out.println("color from reading " + reading + " = " + grReturn);
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        colorFromReadingTest(69.0);
        colorFromReadingTest(201.0);
        colorFromReadingTest(75.0);
        colorFromReadingTest(195.0);
        colorFromReadingTest(100.0);
    }
}
