
package org.glucosio.android.TeamCorrectTestExecutables;


public class TestCase17 {

    private static GlucoseReading glucoseReading;
    public static void setup(){
        glucoseReading = new GlucoseReading();
    }

    public static void SetsId_WhenProvided() {
        int id = 1234;
        glucoseReading.setId(id);
        System.out.println("---- Id returned = " + glucoseReading.getId());
    }


    public static void SetsId_WhenProvided2() {
        int id = 146789;
        glucoseReading.setId(id);
        System.out.println(" ---- Id returned = " + glucoseReading.getId());

    }

    public static void SetReading_WhenProvided() {
        double reading = 2.0;
        glucoseReading.setReading(reading);
        System.out.println(" ---- Reading returned = " + glucoseReading.getReading());

    }

    public static void SetReading_WhenProvided2() {
        double reading = 10.0;
        glucoseReading.setReading(reading);
        System.out.println(" ---- Reading returned = " + glucoseReading.getReading() + " ----");


    }

    public static void main(String[] args) {
        setup();
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
        SetReading_WhenProvided();
        SetReading_WhenProvided2();

    }
}
