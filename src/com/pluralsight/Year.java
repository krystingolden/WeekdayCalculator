package com.pluralsight;

public class Year {

    public boolean isLeapYear (int year) {
        /* Comments as per assignment instructions
        -years which are evenly divisible by 400 are leap years,
        -years which are evenly divisible by 4 are leap years
        -but years divisible by 100 are not leap years*/

        boolean result;

        if (year % 400 == 0)
            result = true;
        else if (year % 4 == 0)
            result = true;
        else if (year % 100 == 0)
            result = false;
        else
            result = false;

        return result;
    }
}
