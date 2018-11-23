package org.glucosio.android.TeamCorrectTestExecutables;

public class TestCase13 {

    private static GlucosioNotificationManager managerTester;
    private static void setup(){
        managerTester = new GlucosioNotificationManager();
    }


    public static void generateRandomNumberTester(int min, int max) {
        int managerReturn = managerTester.generateRandomNumber(min, max);

        System.out.println("Random Number: " + managerReturn);
    }

    public static void main(String[] args) {
        setup();
        System.out.println("---- ");
        generateRandomNumberTester(10, 100);
        generateRandomNumberTester(50, 500);
        generateRandomNumberTester(1, 11);
        generateRandomNumberTester(0, 90);
    }
}
