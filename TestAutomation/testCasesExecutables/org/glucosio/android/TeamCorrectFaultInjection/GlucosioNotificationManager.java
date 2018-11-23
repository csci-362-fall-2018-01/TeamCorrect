package org.glucosio.android.TeamCorrectTestExecutables;



import java.util.Random;

public class GlucosioNotificationManager {
    //private static final String REMOTE_INPUT_KEY = "glucosio_remote_key";
    private static final int NOTIFICATION_ID = 11;
    
    public GlucosioNotificationManager(){
        
    }
    
    public int generateRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
