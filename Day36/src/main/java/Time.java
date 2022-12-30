package main.java;

/**
 * The Time class models a time instance with second, minute and hour.
 */

public class Time {
    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 25);
        System.out.println(t1);
        Time t2 = new Time();
        System.out.println(t2);
        t1.setHour(4);
        t1.setMinute(60);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour is: " + t1.getHour());
        System.out.println("Minute is: " + t1.getMinute());
        System.out.println("Second is: " + t1.getSecond());
        t1.setTime(58, 59, 23);
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }

    private int second;
    private int minute;
    private int hour;

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("error: invalid second");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("error: invalid minute");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("error: invalid hour");
        }
    }

    public void setTime(int second, int minute, int hour) {
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }

    public Time(int second, int minute, int hour) {
        this.setTime(second, minute, hour);
    }

    public Time() {  // The default constructor
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

    public Time nextSecond() {
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
