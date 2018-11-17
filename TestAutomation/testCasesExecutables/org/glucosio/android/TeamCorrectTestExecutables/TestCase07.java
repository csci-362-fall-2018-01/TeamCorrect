package org.glucosio.android.TeamCorrectTestExecutables;

import org.glucosio.android.TeamCorrectTestExecutables.User;


public class TestCase07 {

    private static User userTester = new User();


    public void setup(){
        userTester = new User();
    }


    public static void SetsName_WhenProvided(String userName) {
        

        userTester.setName(userName);

        System.out.println("---- " + userName + "'s name set to " + userTester.getName() + " ----");
    }
    
    public static void SetsDType_WhenProvided(String userName,int userDType) {
        
        
        userTester.setD_type(userDType);
        
        System.out.println(userName + "'s diabetes type set to Type " + userTester.getD_type() + " ----");
    }
    public static void SetsCountry_WhenProvided(String userName,String country) {
        
        
        userTester.setCountry(country);
        
        System.out.println(userName +"'s country set to " + userTester.getCountry() + " ----");
    }
    public static void SetsA1cUnit_WhenProvided(String userName,String unit) {
        
        
        userTester.setPreferred_unit_a1c(unit);
        
        System.out.println(userName +"'s a1c unit set to " + userTester.getPreferred_unit_a1c() + " ----");
    }
    public static void SetsCustomRangeMin_WhenProvided(String userName,double rangeMin) {
        
        
        userTester.setCustom_range_min(rangeMin);
        
        System.out.println(userName +"'s range minimum set to " + userTester.getCustom_range_min() + " mmol/L ----");
    }
    public static void SetsCustomRangeMax_WhenProvided(String userName,double rangeMax) {
        
        
        userTester.setCustom_range_max(rangeMax);
        
        System.out.println(userName +"'s range maximum set to " + userTester.getCustom_range_max() + " mmol/L ----");
    }


    public static void main(String[] args) {
        String name = "Bob";
        SetsName_WhenProvided(name);
        SetsDType_WhenProvided(name, 1);
        SetsCountry_WhenProvided(name,"United States");
        SetsA1cUnit_WhenProvided(name, "mg/dL");
        SetsCustomRangeMin_WhenProvided(name, 4.0);
        SetsCustomRangeMax_WhenProvided(name, 9.0);
        
        
    }
}
