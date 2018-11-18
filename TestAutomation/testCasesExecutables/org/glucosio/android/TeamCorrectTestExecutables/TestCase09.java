package org.glucosio.android.TeamCorrectTestExecutables;

import org.glucosio.android.TeamCorrectTestExecutables.GlucoseData;


public class TestCase09 {

    private static GlucoseData gdTester = new GlucoseData();
    


    public void setup(){
        gdTester = new GlucoseData();
    }


    public static void FormatGlucoseData_WhenProvided(int mgdl, boolean mmol) {
        

        String gdReturn = gdTester.glucose(mgdl, mmol);

        System.out.println("mgdl:  " + mgdl + ", mmol: " + mmol + ", Glucose: " + gdReturn + " ---- ");
    }
    
    


    public static void main(String[] args) {
        System.out.println("---- ");
        FormatGlucoseData_WhenProvided(10, true);
        FormatGlucoseData_WhenProvided(50, true);
        FormatGlucoseData_WhenProvided(100, true);
        FormatGlucoseData_WhenProvided(0, true);
        
        
    }
}
