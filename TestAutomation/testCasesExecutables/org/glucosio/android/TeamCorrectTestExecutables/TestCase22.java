package org.glucosio.android.TeamCorrectTestExecutables;

import org.joda.time.DateTime;

public class TestCase22 {
    //TODO: Fix output
    //Write text test case
    private static IntGraphObject intGraphObjectTester;


    public static void setup(){

        DateTime dateTime = new DateTime();
        intGraphObjectTester = new IntGraphObject(dateTime, 10);
    }


    public static void main(String[] args) {
        setup();
        System.out.println(intGraphObjectTester.getCreated().toString());
        System.out.println(intGraphObjectTester.getReading());


    }
}
