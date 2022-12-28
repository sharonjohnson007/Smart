package main.java;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Utilities for Date Manipulation.
 */

public class DateUtil {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));
        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));
        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));
        System.out.println(printDate(2012, 2, 14));
    }

    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static Boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year > 0 && year < 9999) {
            if (month < 1 || month > 12)
                return false;
            if (day < 1 || day > 31)
                return false;
            if (month == 2) {
                if (isLeapYear(year))
                    return (day <= 29);
                else
                    return (day <= 28);
            }
            if (month == 4 || month == 6 || month == 9 || month == 11)
                return (day <= 30);
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        return dayNumber - 1;
    }

    public static String printDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
}
