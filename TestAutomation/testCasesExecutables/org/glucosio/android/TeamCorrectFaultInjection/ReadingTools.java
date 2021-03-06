/*
 * Copyright (C) 2016 Glucosio Foundation
 *
 * This file is part of Glucosio.
 *
 * Glucosio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * Glucosio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Glucosio.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package org.glucosio.android.TeamCorrectFaultInjection;



import java.text.NumberFormat;
import java.text.ParseException;

public class ReadingTools {

    public ReadingTools() {
    }
    //Fault Injection #2
    public int hourToSpinnerType(int hour) {

        if (hour > 23) {
            return 8;  //night
        }
        //Fault: changed hour>20 to hour<20
        else if (hour < 20) {
            return 5; //after dinner
        }
        //Fault: changed hour>17 to hour<17
        else if (hour < 17) {
            return 4; // before dinner
        }
        //Fault: changed hour>13 to hour<13
        else if (hour < 13) {
            return 3; // after lunch
        } else if (hour > 11) {
            return 2; // before lunch
        }
        //Fault: changed hour>7 to hour<7
        else if (hour < 7) {
            return 1; //after breakfast
        }
        //Fault: changed hour>4 to hour<4
        else if (hour < 4) {
            return 0; // before breakfast
        } else {
            return 8; // night time
        }
    }

    //Fault Injection #5
    //made it always return null
    public static Number parseReading(String reading) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        if (reading != null){
            return null;
        }
        else{
            return null;
        }
    }

    
}
