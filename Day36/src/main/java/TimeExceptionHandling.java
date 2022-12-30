package main.java;

/**
 * The Time class models a time instance with second, minute and hour.
 * This class performs input validations using exception handling.
 */

public class TimeExceptionHandling {
    public static void main(String[] args) {
        int hour = 23, minute = 58, second = 58;
        TimeExceptionHandling t12;
        try {
            t12 = new TimeExceptionHandling(second, minute, hour);
            System.out.println("valid input");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Error in input. Set to default value");
            t12 = new TimeExceptionHandling();
        }
        System.out.println("Time is " + t12);
        System.out.println("Life goes on...");
    }

    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("invalid second");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("invalid minute");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("invalid hour");
        }
    }

    public void setTime(int second, int minute, int hour) {
        // Invoke setters to do input validation
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    public TimeExceptionHandling(int second, int minute, int hour) {
        // Invoke setters to do input validation
        this.setTime(second, minute, hour);
    }

    public TimeExceptionHandling() {  // The default constructor
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public TimeExceptionHandling nextSecond() {
        ++second;
        if (second == 60) {
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
}
