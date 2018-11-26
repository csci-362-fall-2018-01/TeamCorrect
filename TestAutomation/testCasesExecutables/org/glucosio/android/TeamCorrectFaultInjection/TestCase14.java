package org.glucosio.android.TeamCorrectFaultInjection;


public class TestCase14 {

    private static PressureReading pressureReadingTester;


    public static void setup(){
        pressureReadingTester = new PressureReading();
    }

    public static void SetsMaxReading_WhenProvided(double maxReading) {

        pressureReadingTester.setMaxReading(maxReading);

        System.out.println("Max Reading returned = " + pressureReadingTester.getMaxReading());
    }

    public static void main(String[] args) {
        setup();
 	      SetsMaxReading_WhenProvided(12.2);
        SetsMaxReading_WhenProvided(5.2);

  
			
		}

}
