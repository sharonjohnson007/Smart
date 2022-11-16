package main.java;

public class MyTime {

    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {

        if (hour <= 23 && hour >= 0 || minute > 0 && minute <= 59 || second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;

        }
        else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }



    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
        public String toString(){
            return hour+":"+minute+":"+second;
        }
        public MyTime nextSecond(){
            MyTime myTime=new MyTime(hour,minute,second+1);
            return myTime;
        }
        public MyTime nextMinute(){
            MyTime myTime=new MyTime(hour,minute+1,second);
            return myTime;
        }
        public MyTime nextHour(){

            MyTime myTime= new MyTime(hour+1,minute,second);
            return myTime;
        }
        public MyTime previousSecond(){
            MyTime myTime=new MyTime(hour,minute,second-1);
            return myTime;
        }
        public MyTime previousMinute(){
            MyTime myTime=new MyTime(hour,minute-1,second);
            return myTime;
        }
        public MyTime previousHour(){

            MyTime myTime= new MyTime(hour-1,minute,second);
            return myTime;
        }








    }

