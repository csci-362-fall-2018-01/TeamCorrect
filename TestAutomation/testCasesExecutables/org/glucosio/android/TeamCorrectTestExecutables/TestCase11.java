package org.glucosio.android.TeamCorrectTestExecutables;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.ContextCompat;
import org.glucosio.android.R;
import org.glucosio.android.db.DatabaseHandler;

public class TestCase11 {

    private static GlucoseRanges grTester;
    public static void setup(){
        grTester = new GlucoseRanges();
    }

    public String colorFromReading(double reading) {

        String grReturn = grTester.stringToColor(reading);

        System.out.println("str to color " + reading + " = " + grReturn);
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        colorFromReading("green");
        colorFromReading("red");
        colorFromReading("blue");
        colorFromReading("orange");

    }
}
