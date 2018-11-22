package org.glucosio.android.TeamCorrectTestExecutables;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;

public class TestCase13 {

    private static GlucoseNotificationManager managerTester;
    public static void setup(){
        managerTesterTester = new GlucoseNotificationManager();
    }


    public static void generateRandomNumberTester(int min, int max) {
        String managerReturn = managerTester.generateRandomNumber(min, max);

        System.out.println("Random Number: " + managerReturn);
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        generateRandomNumberTester(10, 100);
        generateRandomNumberTester(50, 500);
        generateRandomNumberTester(1, 11);
        generateRandomNumberTester(0, 90);
    }
}
