package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int month;

        Scanner inputnumber= new Scanner(System.in);
        System.out.print("Please input number of the month: ");
        month=inputnumber.nextInt();

        String seasonstr;

        switch (month)
        {case 1:
            case 12:
            case 2:
                seasonstr = "th month is January which is winter";
                break;
            case 3:
            case 4:
            case 5:
                seasonstr = "th month is May which is spring";
                break;
            case 6:
            case 7:
            case 8:
                seasonstr = "th month is August which is summer";
                break;
            case 9:
            case 10:
            case 11:
                seasonstr = "th month is November which is autumn";
                break;
            default:
                seasonstr = " month doesn't exist";
                break;
        }
        System.out.print("The " + month + seasonstr);
    }

}
