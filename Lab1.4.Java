package com.metanit;

import java.lang.String;
import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {

        int month;

        Scanner inputnumber= new Scanner(System.in);
        System.out.print("Please input number of the month (from 1 to 12): ");
        month=inputnumber.nextInt();

        String seasonstr;

        switch (month)
        {case 1: seasonstr = "st month is January which is winter";
            break;
            case 2: seasonstr = "nd month  is February which is winter";
                break;
            case 3: seasonstr = "rd month  is March which is Spring";
                break;
            case 4: seasonstr = "th month is April which is Spring";
                break;
            case 5: seasonstr = "th month is May which is spring";
                break;
            case 6: seasonstr = "th month is June which is summer";
                break;
            case 7: seasonstr = "th month is July which is summer";
                break;
            case 8: seasonstr = "th month is August which is summer";
                break;
            case 9: seasonstr = "th month is September which is autumn";
                break;
            case 10: seasonstr = "th month is October which is autumn";
                break;
            case 11: seasonstr = "th month is November which is autumn";
                break;
            case 12: seasonstr = "th month is December which is winter";
                break;
            default: seasonstr = " month doesn't exist";
                break;

        }





        System.out.print("The "+month+seasonstr);

    }
}
