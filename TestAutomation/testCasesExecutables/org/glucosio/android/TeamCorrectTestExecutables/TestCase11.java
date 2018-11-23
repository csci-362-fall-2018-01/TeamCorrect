package org.glucosio.android.TeamCorrectTestExecutables;



public class TestCase11 {

    private static InputFilterMinMax minMaxTester;
    private static void setup(){
        minMaxTester = new InputFilterMinMax(4.0,8.0);
    }

    public static void isInRangeTester(double a,double b, double c) {

        boolean minMaxReturn = minMaxTester.isInRange(a, b, c);

        System.out.println("Range Tester [" + a + "," + b + "," + c + "] = " + minMaxReturn);
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        isInRangeTester(5.0,8.0,10.0);
        isInRangeTester(1.0,0.0,100.0);
        isInRangeTester(4.0,5.0,6.0);
        

    }
}
