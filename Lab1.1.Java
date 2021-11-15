package com.metanit;

import java.lang.String;
import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {


            int num_1,num_2,num_3, num_4, least, least1, least2;

            Scanner inputnumber= new Scanner(System.in);
            System.out.print("Please input first integer number: ");
            num_1=inputnumber.nextInt();
            System.out.print("Please input second integer number: ");
            num_2=inputnumber.nextInt();
            System.out.print("Please input third  integer number: ");
            num_3=inputnumber.nextInt();
            System.out.print("Please input fourth integer number: ");
            num_4=inputnumber.nextInt();

            //compare first 2 numbers
            if (num_1 <= num_2)
            {least1=num_1;}

            else {least1=num_2;}

            //compare 3d and 4th numbers
            if (num_3 <= num_4)
            {least2=num_3;}

            else {least2=num_4;}

            //look for the smallest number

            if (least1 <= least2)
            {least=least1;}

            else {least=least2;}


            System.out.println("The smallest number is: "+least);
        }

    }
