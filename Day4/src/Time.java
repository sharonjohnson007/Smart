public class Time {

    public int hour;
    public int minute;
    public int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour,int minute,int second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);

    }

    @Override
    public String toString() {
        return hour+":"+minute+":"+second;
    }
    public Time nextSecond(){
      Time time = new Time(hour, minute, second+1);
       return time;
    }
    }

