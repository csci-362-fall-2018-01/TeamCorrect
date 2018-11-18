package org.glucosio.android.TeamCorrectTestExecutables;

import org.glucosio.android.TeamCorrectTestExecutables.ReadingTools;


public class TestCase10 {

    private static ReadingTools rtTester = new ReadingTools();
    

    public static void testHourToSpinnerType(int hour) {
        

        int rtReturn = rtTester.hourToSpinnerType(hour);
        String timeOfDay = "";
        if (rtReturn == 8){
            timeOfDay = "night";
        }
        else if(rtReturn== 5){
            timeOfDay="after dinner";
        }
        else if(rtReturn== 4){
            timeOfDay="before dinner";
        }
        else if(rtReturn== 3){
            timeOfDay="after lunch";
        }
        else if(rtReturn== 2){
            timeOfDay="before lunch";
        }
        else if(rtReturn== 1){
            timeOfDay="after breakfast";
        }
        else{
            timeOfDay="before breakfast";
        }

        System.out.println("Hour: " + hour + ", SpinnerType: " + rtReturn + ", Time of day: " +timeOfDay+ " ---- ");
    }
    
    


    public static void main(String[] args) {
        System.out.println("---- ");
        testHourToSpinnerType(24);
        testHourToSpinnerType(8);
        testHourToSpinnerType(4);
        testHourToSpinnerType(19);
        
        
        
    }
}
