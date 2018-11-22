package org.glucosio.android.TeamCorrectTestExecutables;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.ContextCompat;
import org.glucosio.android.R;
import org.glucosio.android.db.DatabaseHandler;

public class TestCase12 {

    private static GlucoseRanges grTester;
    public static void setup(){
        grTester = new GlucoseRanges();
    }

    public String colorFromReading(double reading) {

        String grReturn = grTester.colorFromReading(reading);

        System.out.println("color from reading " + reading + " = " + grReturn);
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        colorFromReading(69);
        colorFromReading(201);
        colorFromReading(75);
        colorFromReading(195);
        colorFromReading(100);
    }
}