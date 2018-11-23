package org.glucosio.android.TeamCorrectTestExecutables;

public class TestCase14 {

    private static PressureReading pressureReadingTester;


    public static void setup(){
        pressureReadingTester = new PressureReading();
    }

    public static void SetsMaxReading_WhenProvided() {
        double maxReading = 180.0;

        pressureReadingTester.setMaxReading(maxReading);

        System.out.println("Max Reading returned = " + pressureReadingTester.getMaxReading());
    }

    public static void main(String[] args) {
        setup();
        SetsMaxReading_WhenProvided();
    }
}
