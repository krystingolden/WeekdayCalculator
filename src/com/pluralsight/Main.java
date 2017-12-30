package com.pluralsight;

public class Main {

    /*
    https://programmingbydoing.com/

    Weekday calculator - Assignment 103
     */

    public static void main(String[] args) {

        System.out.println("Welcome to the fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();


        boolean error = true;

        //Continue to prompt user for new date until valid format received
        //then evaluate and print full date
        do {
            Dates date = new Dates();
            String birthDate = date.getDate();
            if (!birthDate.equals("")) {
                System.out.println("You were born on " + birthDate);
                error = false;
            }
        } while (error);

    }
}






