package org.glucosio.android.db;

import org.glucosio.android.Constants;


public class ReminderTestVersion2 {

    private Reminder reminderTester;

   
    public void setup(){
        reminderTester = new Reminder();
    }

   
    public void SetsId_WhenProvided() {
        int id = 100;
        

        reminderTester.setId(id);
      
        System.out.println("Id returned = " + reminderTester.getId());
        
    }

    
    public void SetsId_WhenProvided2() {
        int id = 123456789;

        reminderTester.setId(id);

        System.out.println("Id returned = " + reminderTester.getId());
    }
    
    public void SetsMetric_WhenProvided() {
        String metric = "0mL";

        reminderTester.setMetric(metric);

        System.out.println("Metric returned = " + reminderTester.getMetric());
        
    }
    
    public void SetsMetric_WhenProvided2() {
        String metric = "9L";

        reminderTester.setMetric(metric);

        System.out.println("Metric returned = " + reminderTester.getMetric());
    }
    
    public void SetsActive_WhenProvided() {
        boolean active = true;

        reminderTester.setActive(active);

        System.out.println("Is Active returned = " + reminderTester.isActive());
        
    }
}
