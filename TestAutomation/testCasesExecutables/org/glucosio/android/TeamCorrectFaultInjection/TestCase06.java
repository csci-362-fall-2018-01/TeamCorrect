package org.glucosio.android.TeamCorrectFaultInjection;




public class TestCase06 {

    private static CholesterolReading cholTester;


    public static void setup(){
        cholTester = new CholesterolReading();
    }


    
    public static void SetsLDLReading_WhenProvided(double ldlReading) {
        
        
        cholTester.setLDLReading(ldlReading);
        
        System.out.println("LDL reading set to " + cholTester.getLDLReading() + " ----");
    }
    
    
   


    public static void main(String[] args) {
        setup();
        SetsLDLReading_WhenProvided(6.4);
    	
			
		}

}
