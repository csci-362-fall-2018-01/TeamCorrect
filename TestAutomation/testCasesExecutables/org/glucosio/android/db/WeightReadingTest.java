package org.glucosio.android.db;

import org.glucosio.android.db.WeightReading;


public class WeightReadingTest {

    private static WeightReading weightReadingTester = new WeightReading();


    public void setup(){
        weightReadingTester = new WeightReading();
    }


    public static void SetsId_WhenProvided() {
        int id = 1234;

        weightReadingTester.setId(id);

        System.out.println("Id returned = " + weightReadingTester.getId());
    }

    public static void SetsId_WhenProvided2() {
        int id = 146789;

        weightReadingTester.setId(id);

        System.out.println("Id returned = " + weightReadingTester.getId());
    }

    public static void SetsReading_WhenProvided() {
        int reading = 100.0;

        weightReadingTester.setReading(reading);

        System.out.println("Reading returned = " + weightReadingTester.getReading());
    }

    public static void SetsReading_WhenProvided2() {
        int reading = 50.0;

        weightReadingTester.setReading(reading);

        System.out.println("Reading returned = " + weightReadingTester.getReading());
    }

    public static void main(String[] args) {
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
        SetsReading_WhenProvided();
        SetsReading_WhenProvided2();
    }
}