package org.glucosio.android.TeamCorrectTestExecutables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase25 {

    private static User userTester;
    
    public static void setup(){
        userTester = new User();
    }

    public static void SetsA1cUnit_WhenProvided(String a1cUnit) {
        
        
        userTester.setPreferred_unit_a1c(a1cUnit);
        
        System.out.println("User's A1c unit set to " + userTester.getPreferred_unit_a1c() + " ----");
    }

    public static void main(String[] args) {
        setup();
        
        String filePath = new File("").getAbsolutePath();
        
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath + "/TestCasesInput.txt"));
            String line = reader.readLine();
            String inputValue;
            
            
            while(line!=null) {
                if(line.equals("#TestCase25")){
                    line = reader.readLine();
                    while((line.equals("#End"))==false){
                        inputValue = line.toString();
                        SetsA1cUnit_WhenProvided(inputValue);
                        line = reader.readLine();
                    }
                    
                }
                
                line = reader.readLine();
            }
            reader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    
}
