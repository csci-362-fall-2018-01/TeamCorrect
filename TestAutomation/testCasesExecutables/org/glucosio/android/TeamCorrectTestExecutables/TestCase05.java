package org.glucosio.android.TeamCorrectTestExecutables;

public class TestCase05 {

    private static PressureReading pressureReadingTester;


    public static void setup(){
        pressureReadingTester = new PressureReading();
    }

    public static void SetsMinReading_WhenProvided() {
        double minReading = 110.0;

        pressureReadingTester.setMinReading(minReading);

        System.out.println("Min Reading returned = " + pressureReadingTester.getMinReading());
    }


    public static void main(String[] args) {
        setup();
        SetsMinReading_WhenProvided();
    }
}
