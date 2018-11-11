package org.glucosio.android.db;



import org.glucosio.android.db.KetoneReading;


public class KetoneReadingTest {

    private static KetoneReading readingTester = new KetoneReading();
    public void setup(){
        readingTester = new KetoneReading();
    }

    public static void SetsId_WhenProvided() {
        int id = 1234;
        readingTester.setId(id);
        System.out.println("Id returned = " + readingTester.getId());
    }


    public static void SetsId_WhenProvided2() {
        int id = 146789;
        readingTester.setId(id);
        System.out.println("Id returned = " + readingTester.getId());

    }

    public static void SetReading_WhenProvided() {
        double reading = 2.0;
        readingTester.setReading(reading);
        System.out.println("Reading returned = " + readingTester.getReading());

    }

    public static void SetReading_WhenProvided2() {
        double reading = 10.0;
        readingTester.setReading(reading);
        System.out.println("Reading returned = " + readingTester.getReading());


    }

    public static void main(String[] args) {
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
        SetReading_WhenProvided();
        SetReading_WhenProvided2();

    }
}
