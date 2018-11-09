package org.glucosio.android.db;

import org.glucosio.android.db.CholesterolReading;


public class CholesterolReadingTest {

    private static CholesterolReading cholesterolReadingTester = new CholesterolReading();


    public void setup(){
        cholesterolReadingTester = new CholesterolReading();
    }


    public static void SetsId_WhenProvided() {
        int id = 1234;

        cholesterolReadingTester.setId(id);

        System.out.println("Id returned = " + cholesterolReadingTester.getId());
    }

    public static void SetsId_WhenProvided2() {
        int id = 146789;

        cholesterolReadingTester.setId(id);

        System.out.println("Id returned = " + cholesterolReadingTester.getId());
    }

    public static void SetsTotalReading_WhenProvided() {
        int totalReading = 190.0;

        cholesterolReadingTester.setTotalReading(totalReading);

        System.out.println("Total Reading returned = " + cholesterolReadingTester.getTotalReading());
    }

    public static void SetsLDLReading_WhenProvided() {
        int LDLReading = 90.0;

        cholesterolReadingTester.setLDLReading(LDLReading);

        System.out.println("LDL Reading returned = " + cholesterolReadingTester.getLDLReading());
    }

    public static void SetsHDLReading_WhenProvided() {
        int HDLReading = 70.0;

        cholesterolReadingTester.setHDLReading(HDLReading);

        System.out.println("HDL Reading returned = " + cholesterolReadingTester.getHDLReading());
    }

    public static void main(String[] args) {
        SetsId_WhenProvided();
        SetsId_WhenProvided2();
        SetsTotalReading_WhenProvided();
        SetsLDLReading_WhenProvided();
        SetsHDLReading_WhenProvided();
    }
}