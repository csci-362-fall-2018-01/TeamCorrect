package org.glucosio.android.TeamCorrectTestExecutables;
//Test of SplitDateTime

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCase23 {
    //TODO: Format output
    private static SplitDateTime sdtTester;
    public static void setup(){
        sdtTester = new SplitDateTime(new Date(),DateFormat.getDateInstance());
    }


    public static void main(String[] args) {
        setup();
        System.out.println(sdtTester.getMinute());
        System.out.println(sdtTester.getHour());
        System.out.println(sdtTester.getDay());
        System.out.println(sdtTester.getMonth());
        System.out.println(sdtTester.getYear());
        return;
    }
}
