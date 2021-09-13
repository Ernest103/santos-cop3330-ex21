package org.example;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int user_input;
        String month = new String("");

        System.out.print("Please enter the number of the month(1-12) ");
        user_input = sc.nextInt();

        switch (user_input)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
            default:
                System.out.println("The input was invalid!");
        }

        System.out.println("The name of the month is " + month);

    }
}
