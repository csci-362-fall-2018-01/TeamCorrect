package org.glucosio.android.TeamCorrectTestExecutables;


public class TestCase08 {

    private static ActionTip actionTester;


    public static void setup(){
        actionTester = new ActionTip();
    }


    public static void SetsTipTitle_WhenProvided(String tipTitle) {
        

        actionTester.setTipTitle(tipTitle);

        System.out.println("---- Tip title:  " + actionTester.getTipTitle());
    }
    public static void SetsTipDescription_WhenProvided(String tipDes) {
        
        
        actionTester.setTipDescription(tipDes);
        
        System.out.println(" ----" + actionTester.getTipDescription());
    }
    


    public static void main(String[] args) {
        setup();
        SetsTipTitle_WhenProvided("Diabetes Tip #1");
        SetsTipDescription_WhenProvided("Use whole foods in cooking like brown rice and whole wheat pasta.");
        SetsTipTitle_WhenProvided("Diabetes Tip #2");
        SetsTipDescription_WhenProvided("Try to eat at least 8 grams of fiber per meal.");
        
        
    }
}
