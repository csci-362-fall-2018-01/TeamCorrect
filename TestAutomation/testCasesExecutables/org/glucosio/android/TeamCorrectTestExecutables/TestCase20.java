package org.glucosio.android.tools;
import android.support.annotation.Nullable;
import java.text.NumberFormat;
import java.text.ParseException;

package org.glucosio.android.TeamCorrectTestExecutables;
import org.glucosio.android.TeamCorrectTestExecutables.KetoneReading;


public class TestCase20 {

    private static ReadingTools test = new ReadingTools();
    public void setup(){
        test = new ReadingTools();
    }

    public static void hourToSpinnerTypeTest(int hours) {
        System.out.println();
        int tempHours = hourToSpinnerType(hours);

        System.out.println("hourToSpinnerTypeTest: " = tempHours);
        if( tempHours = 0){
            System.out.println("Spinner: 0");
            System.out.println("Before Breakfast");
        }
        else if(tempHours = 1){
            System.out.println("Spinner: 1");
            System.out.println("After Breakfast");

        }
        else if(tempHours = 2){
            System.out.println("Spinner: 2");
            System.out.println("Before Lunch");

        }
        else if(tempHours = 3){
            System.out.println("Spinner: 3");
            System.out.println("After Lunch");

        }
        else if(tempHours = 4){
            System.out.println("Spinner: 4");
            System.out.println("Before Dinner");

        }
        else if(tempHours = 5){
            System.out.println("Spinner: 5");
            System.out.println("After Dinner");
        }
        else{
            //8 case
            System.out.println("Spinner: 8");
            System.out.println("Night Time");
        }
    }



    public static void main(String[] args) {
        hourToSpinnerTypeTest(2);
        hourToSpinnerTypeTest(6);
        hourToSpinnerTypeTest(8);
        hourToSpinnerTypeTest(12);
        hourToSpinnerTypeTest(16);
        hourToSpinnerTypeTest(18);
        hourToSpinnerTypeTest(24);




    }
}