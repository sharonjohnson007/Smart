import main.java.MyDate;
import main.java.MyTime;

public class  TestMain {
    public static void main(String[] args) {

       /* MyTime t1 = new MyTime(4,6,25);
        System.out.println(t1);

        t1.setHour(11);
        t1.setMinute(24);
        t1.setSecond(56);
        System.out.println(t1);
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        System.out.println(t1.nextSecond());*/

        MyDate d1=new MyDate(2022,5,22);
        System.out.println(d1.isValidDate(2012,2,30));
        System.out.println(d1.getDayOfWeek(2022,12,31));
        System.out.println(d1.toString());


    }
}
