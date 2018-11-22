package org.glucosio.android.TeamCorrectTestExecutables;

public class TestCase05 {

    private static PressureReading pressureReadingTester;


    public static void setup(){
        pressureReadingTester = new PressureReading();
    }


    public static void SetsId_WhenProvided() {
        int id = 1234;

        pressureReadingTester.setId(id);

        System.out.println("Id returned = " + pressureReadingTester.getId());
    }

    public static void SetsId_WhenProvided2() {
        int id = 146789;

        pressureReadingTester.setId(id);

        System.out.println("Id returned = " + pressureReadingTester.getId());
    }

    public static void main(String[] args) {
        setup();
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
    }
}
