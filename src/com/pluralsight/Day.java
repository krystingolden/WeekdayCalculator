package com.pluralsight;

public class Day {


    public String weekday(int mm, int dd, int yyyy) {

        int yy, total;
        Month month = new Month();
        Year year = new Year();

        //Comments as per assignment instructions
        //Find the number of years since 1900, and put it into a variable called yy. Simply subtract 1900 from the year to get this.
        yy = yyyy - 1900;

        //Divide the number of years since 1900 by 4. Put the quotient in a variable called total.
        //For example, if the person was born in 1983, divide 83 by 4 and store 20 in total.
        total = yyyy / 4;

        //Also add the number of years since 1900 to total.
        total += yy;

        //Add the day of the month to total.
        total += dd;

        //Using the function monthOffset() you wrote, find the "month offset" and add it to total.
        total += month.monthOffset(mm);

        //If the year is a leap year and if the month you are working with is either January or February,
        // then subtract 1 from the total. You can use the function is_leap() provided to determine if the year is a leap year.
        if (year.isLeapYear(yyyy) && mm == 1 || mm == 2){
            total -= 1;
        }

        //Find the remainder when total is divided by 7. Pass this remainder to the function weekdayName()
        // you wrote to determine the day of the week the person was born.
        total = total % 7;

        //Finally, build up a single String value containing the whole date (day of week, month, day, year).
        // You'll need to use the function monthName() you wrote to show the month name rather than its number.
        String date = weekdayName(total) + ", " + month.monthName(mm) + " " + dd + ", " + yyyy;

        //Return that String value.
        return date;
    }


    // Determine the name of the day of the week
    private static String weekdayName( int total ) {
        String result;
        switch (total) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "error";
        }
        return result;
    }
}
