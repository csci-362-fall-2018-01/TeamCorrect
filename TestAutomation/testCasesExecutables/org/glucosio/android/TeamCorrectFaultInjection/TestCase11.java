
package org.glucosio.android.TeamCorrectFaultInjection;

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
        System.out.println("InputFilterMinMax.isInRange --- Fault: Changed operation signs in expression ---");
        
        isInRangeTester(12.0, 1.5, 8.2);
        
			
		}

}
