package org.glucosio.android.db;

import org.glucosio.android.db.PressureReading;


public class PressureReadingTest {

    private static PressureReading pressureReadingTester = new PressureReading();


    public void setup(){
        pressureReadingTester = new PressureReading();
    }


    public static void SetsId_WhenProvided() {
        int id = 1234;

        pressureReadingTester.setId(id);

        System.out.println("Id returned = " + pressureReadingTester.getId());
    }

    public static void SetsId_WhenProvided2() {
        int id = 146789;

        weightReadingTester.setId(id);

        System.out.println("Id returned = " + pressureReadingTester.getId());
    }

    public static void SetsMinReading_WhenProvided() {
        int minReading = 110.0;

        pressureReadingTester.setMinReading(minReading);

        System.out.println("Min Reading returned = " + pressureReadingTester.getMinReading());
    }

    public static void SetsMaxReading_WhenProvided() {
        int maxReading = 180.0;

        pressureReadingTester.setMaxReading(maxReading);

        System.out.println("Max Reading returned = " + pressureReadingTester.getMaxReading());
    }

    public static void main(String[] args) {
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
        SetsMinReading_WhenProvided();
        SetsMaxReading_WhenProvided();
    }
}