package main.java;

/**
 * The Date class models a calendar date with day, month and year.
 */

public class Date {
    public static void main(String[] args) {
        Date d1 = new Date(2020, 2, 8);
        System.out.println(d1);
        d1.setYear(2012);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1);
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());
        d1.setDate(2022, 1, 2);
        System.out.println(d1);
    }

    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
        // Specifier "0" to print leading zeros
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
