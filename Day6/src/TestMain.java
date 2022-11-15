import java.sql.SQLOutput;

public class TestMain {
    public static void main(String[] args) {


       /* Customer customer = new Customer(101, "johnson", 'm');
        System.out.println(customer);

        Account account=new Account(102,customer,0);
        System.out.println(account);
        Account account1=new Account(103,customer);
        System.out.println(account1);*/

        MyPoint p1=new MyPoint();

        System.out.println(p1);
        p1.setX(5);
        p1.setY(4);
        System.out.println("x is:"+p1.getX());
        System.out.println("y is:"+p1.getY());
        p1.setXY(3,0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2=new MyPoint(0,4);

    }
}
