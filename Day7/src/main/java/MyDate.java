package main.java;
import java.nio.channels.CancelledKeyException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;
   /* private String Day;*/
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            return true;

        } else {
            return false;
        }


    }

    public static boolean isValidDate(int year, int month, int day) {
        if ((year >= 1 && year <= 9999) && (month > 0 && month <= 12)) {
            if (isLeapYear(year)) {
                //feb month
                if ((month == 2) && (day <= 29 && day >= 1)) {
                    return true;
                } else {
                    if ((month == 2) && (day > 0 && day <= 28)) {
                        return true;
                    }
                }
            } else {
                return false;
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

                if (day > 0 && day <= 31) {

                    return true;
                } else {

                    if (month == 4 || month == 6 || month == 9 || month == 11) {
                        return true;
                    }
                }


            } else {
                return false;
            }


        }


        return false;
    }


    public static int getDayOfWeek(int year, int month, int day){
        Calendar cal=new GregorianCalendar(year,month-1,day);
        int dayNumber=cal.get(Calendar.DAY_OF_WEEK);

       return dayNumber;

    }


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        /*this.Day = DAYS[getDayOfWeek(year, month, day)-1].toString();*/
    }
    public void setDate(int year,int month,int day){

        if(isValidDate(year,month,day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }
        else{
            throw new IllegalArgumentException("Invalid year,month or day !");
        }
}
    public void setYear(int year) {

        if(year>=1 && year<=9999){
            this.year = year;

        }
        else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public void setMonth(int month) {

        if(month>=1 && month<=12){
            this.month=month;
        }
        else {
            throw new IllegalArgumentException("Invalid month");
        }

    }

    public void setDay(int day) {
        int dayMax=31;

        if(isLeapYear(year)) {
            if (month == 2) {
                dayMax = 29;
            }
        }
        else{
            if(month==2) {
                dayMax=28;  }

        }
        if(month==4||month==6||month==9||month==11){
            dayMax=30;
        }
        this.day = day;
        throw new IllegalArgumentException("Invalid Month");
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return DAYS[MyDate.getDayOfWeek(year,month,day)-1]+" "+day+":"+month+":"+year;
    }
    public MyDate nextDay(){

        MyDate myDate=new MyDate(year,month,day+1);
        return myDate;


    }
    public MyDate nextMonth(){
        MyDate myDate=new MyDate(year,month+1,day);
        return myDate;
    }
    public MyDate nextYear(){
        MyDate myDate=new MyDate(year+1,month,day);
        return myDate;
    }
    public MyDate previousDay(){

        MyDate myDate=new MyDate(year,month,day-1);
        return myDate;
    }
    public MyDate previousMonth(){

        MyDate myDate=new MyDate(year,month-1,day);
        return myDate;
    }
    public MyDate previousYear(){

        MyDate myDate=new MyDate(year-1,month,day);
        return myDate;
    }


}





