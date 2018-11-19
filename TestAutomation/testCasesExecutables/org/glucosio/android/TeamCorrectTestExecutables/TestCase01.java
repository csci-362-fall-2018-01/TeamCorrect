package org.glucosio.android.TeamCorrectTestExecutables;



public class TestCase01 {

    private static Reminder reminderTester;

   
    public static void setup(){
        reminderTester = new Reminder();
    }

   
    public static void SetsId_WhenProvided() {
        int id = 100;
        

        reminderTester.setId(id);
      
        System.out.println("---- Id returned = " + reminderTester.getId());
        
    }

    
    public static void SetsId_WhenProvided2() {
        int id = 123456789;

        reminderTester.setId(id);

        System.out.println(" ---- Id returned = " + reminderTester.getId());
    }
    
    public static void SetsMetric_WhenProvided() {
        String metric = "0mL";

        reminderTester.setMetric(metric);

        System.out.println(" ---- Metric returned = " + reminderTester.getMetric());
        
    }
    
    public static void SetsMetric_WhenProvided2() {
        String metric = "9L";

        reminderTester.setMetric(metric);

        System.out.println(" ---- Metric returned = " + reminderTester.getMetric());
    }
    
    public static void SetsActive_WhenProvided() {
        boolean active = true;

        reminderTester.setActive(active);

        System.out.println(" ---- Is Active returned = " + reminderTester.isActive() + " ----");
        
    }
    public static void main(String[] args) {
        setup();
    	SetsId_WhenProvided();
    	SetsId_WhenProvided2();
    	SetsMetric_WhenProvided();
    	SetsMetric_WhenProvided2();
    	SetsActive_WhenProvided();
    	
    	
    }
}
