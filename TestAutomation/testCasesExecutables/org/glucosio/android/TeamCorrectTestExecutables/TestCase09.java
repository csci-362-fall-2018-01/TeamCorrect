package org.glucosio.android.TeamCorrectTestExecutables;


public class TestCase09 {

    private static GlucoseData gdTester;
    


    public static void setup(){
        gdTester = new GlucoseData();
    }


    public static void FormatGlucoseData_WhenProvided(int mgdl, boolean mmol) {
        

        String gdReturn = gdTester.glucose(mgdl, mmol);

        System.out.println("mgdl:  " + mgdl + ", mmol: " + mmol + ", Glucose: " + gdReturn + " ---- ");
    }
    
    


    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        FormatGlucoseData_WhenProvided(10, true);
        FormatGlucoseData_WhenProvided(50, true);
        FormatGlucoseData_WhenProvided(100, true);
        FormatGlucoseData_WhenProvided(0, true);
        
        
    }
}
