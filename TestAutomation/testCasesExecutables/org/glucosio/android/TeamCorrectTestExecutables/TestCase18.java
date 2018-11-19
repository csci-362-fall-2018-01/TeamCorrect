
package org.glucosio.android.TeamCorrectTestExecutables;


public class TestCase18 {

    private static A1cEstimate a1CEstimateTest;
    public static void setup(){
        a1CEstimateTest = new A1cEstimate();
    }

    public static void SetsValue_WhenProvided() {
        double value = 8.5;
        a1CEstimateTest.setValue(value);
        System.out.println("---- Value returned = " + a1CEstimateTest.getValue());
    }


    public static void SetMonth_WhenProvided() {
        String month = "June";
        a1CEstimateTest.setMonth(month);
        System.out.println(" ---- Month returned = " + a1CEstimateTest.getMonth());

    }

    public static void average(){

        System.out.println(" Average: " + a1CEstimateTest.getGlucoseAverage());

    }


    public static void main(String[] args) {
        setup();
        SetsValue_WhenProvided();
        SetMonth_WhenProvided();
        average();
    }
}
