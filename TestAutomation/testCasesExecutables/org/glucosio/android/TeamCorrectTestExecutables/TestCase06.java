package org.glucosio.android.TeamCorrectTestExecutables;

import org.glucosio.android.TeamCorrectTestExecutables.CholesterolReading;


public class TestCase06 {

    private static CholesterolReading cholTester = new CholesterolReading();


    public void setup(){
        cholTester = new CholesterolReading();
    }


    public static void SetsTotalReading_WhenProvided(double totReading) {
        

        cholTester.setTotalReading(totReading);

        System.out.println("---- Total reading set to " + cholTester.getTotalReading() + " ----");
    }
    public static void SetsLDLReading_WhenProvided(double ldlReading) {
        
        
        cholTester.setLDLReading(ldlReading);
        
        System.out.println("LDL reading set to " + cholTester.getLDLReading() + " ----");
    }
    public static void SetsHDLReading_WhenProvided(double hdlReading) {
        
        
        cholTester.setHDLReading(hdlReading);
        
        System.out.println("HDL reading set to " + cholTester.getHDLReading() + " ----");
    }
    public static void SetsID_WhenProvided(long id) {
        
        
        cholTester.setId(id);
        
        System.out.println("ID set to " + cholTester.getId() + " ----");
    }
    
   


    public static void main(String[] args) {
        SetsTotalReading_WhenProvided(190.0);
        SetsLDLReading_WhenProvided(90.0);
        SetsHDLReading_WhenProvided(70.0);
        SetsID_WhenProvided(1234);
        SetsID_WhenProvided(146789);
        
        
    }
}
