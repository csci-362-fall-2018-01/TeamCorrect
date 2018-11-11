package org.glucosio.android.db;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import org.glucosio.android.db.Reminder;

public class HB1ACReadingTest {
    private static Reading readingTester = new HB1ACReading();
    public void setup(){
        readingTester = new HB1ACReading();
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
