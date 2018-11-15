package org.glucosio.android.practice;

import org.glucosio.android.practice.WeightReading;


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
        double reading = 100.0;

        weightReadingTester.setReading(reading);

        System.out.println("Reading returned = " + weightReadingTester.getReading());
    }

    public static void SetsReading_WhenProvided2() {
        double reading = 50.0;

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
