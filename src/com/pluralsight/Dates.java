package com.pluralsight;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Dates {

    private Scanner keyboard = new Scanner(System.in);

    public String getDate (){
        String birthDate = "";
            //Prompt the user for their birth date
            System.out.print("Birth date (mm dd yyyy): ");
            int mm = readIntegerBetween(1, 12, "month");
            //If the first portion of the date (the month) comes back correctly, evaluate the next portion (the day)
            if (!(mm == 0)) {
                int dd = readIntegerBetween(1, 31, "day");
                //If the day comes back correctly, evaluate the next portion (the year)
                if (!(dd == 0)) {
                    //Retrieve the current year
                    Date year = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
                    Integer currentYear = Integer.valueOf(dateFormat.format(year));

                    //Evaluate the year portion of the entered date
                    int yyyy = readIntegerBetween(1901, currentYear, "year");

                    //If the year comes back correctly, pass back the full date based on the return from the weekday method
                    if(!(yyyy == 0)) {
                        Day day = new Day();
                        birthDate = day.weekday(mm, dd, yyyy);
                        return birthDate;
                    }
                }
            }
        //otherwise return the default value of null for the birth date which will trigger a loop back through this method
        return birthDate;
    }

    private int readIntegerBetween(int start, int end, String type){
        int a = 0;
        try {
            //evaluate the first value
            a = keyboard.nextInt();
            //If the value is an integer, determine if it falls within the correct range for its type (day, month or year)
            //as passed through the parameters
            if (a >= start && a <= end) {
                return a;
            }
            //If the value is an integer but the range is incorrect prompt the user accordingly
            else {
                System.out.println("Invalid " + type + ". Must be between " + start + " and " + end + ".");
                return a;
            }
        //If the value is not an integer, prompt the user accordingly and bypass the remaining portions of the entered date
        } catch (InputMismatchException e) {
            System.out.println("Invalid format");
            switch (type){
                case "month":
                    keyboard.next();
                    keyboard.next();
                    keyboard.next();
                    break;
                case "day":
                    keyboard.next();
                    keyboard.next();
                    break;
                default:
                    keyboard.next();
                    break;
                }
            }
            return a;
        }

}