package org.glucosio.android.TeamCorrectTestExecutables;
//Test NumberFormatUtils

import java.text.NumberFormat;
public class TestCase24 {
    private static NumberFormat nfuTester;
    public static void setup(){
        nfuTester = NumberFormatUtils.createDefaultNumberFormat();
    }


    public static void main(String[] args) {
        setup();
        System.out.println(nfuTester.getMinimumFractionDigits());
        System.out.println(nfuTester.getMaximumFractionDigits());
        return;
    }
}
