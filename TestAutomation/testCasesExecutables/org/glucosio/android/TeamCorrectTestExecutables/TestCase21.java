package org.glucosio.android.TeamCorrectTestExecutables;

import org.joda.time.DateTime;

public class TestCase21 {

    private static DoubleGraphObject doubleGraphObjectTester;


    public static void setup(){
        
        DateTime dateTime = new DateTime();
        doubleGraphObjectTester = new DoubleGraphObject(dateTime, 10.0);
    }

    //

    public static void main(String[] args) {
        setup();
        System.out.println(doubleGraphObjectTester.getCreated().toString());
        System.out.println(doubleGraphObjectTester.getReading());


    }
}
