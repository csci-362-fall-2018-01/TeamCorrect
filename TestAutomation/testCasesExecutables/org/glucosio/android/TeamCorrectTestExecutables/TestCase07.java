package org.glucosio.android.TeamCorrectTestExecutables;

import org.glucosio.android.TeamCorrectTestExecutables.User;


public class TestCase07 {

    private static User userTester = new User();


    public void setup(){
        userTester = new User();
    }


    public static void SetsName_WhenProvided() {
        String userName = "Bob";

        userTester.setName(userName);

        System.out.println("User's name set to " + userTester.getName());
    }


    public static void main(String[] args) {
        SetsName_WhenProvided();
        
    }
}
