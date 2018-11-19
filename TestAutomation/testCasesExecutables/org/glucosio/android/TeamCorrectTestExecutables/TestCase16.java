
package org.glucosio.android.TeamCorrectTestExecutables;


public class TestCase16 {

    private static HB1ACReading test;
    public static void setup(){
        test = new HB1ACReading();
    }

    public static void SetsId_WhenProvided() {
        int id = 1234;
        test.setId(id);
        System.out.println("---- Id returned = " + test.getId());
    }


    public static void SetsId_WhenProvided2() {
        int id = 146789;
        test.setId(id);
        System.out.println(" ---- Id returned = " + test.getId());

    }

    public static void SetReading_WhenProvided() {
        double reading = 2.0;
        test.setReading(reading);
        System.out.println(" ---- Reading returned = " + test.getReading());

    }

    public static void SetReading_WhenProvided2() {
        double reading = 10.0;
        test.setReading(reading);
        System.out.println(" ---- Reading returned = " + test.getReading() + " ----");


    }

    public static void main(String[] args) {
        setup();
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
        SetReading_WhenProvided();
        SetReading_WhenProvided2();

    }
}
