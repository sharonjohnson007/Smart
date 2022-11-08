package Application;

import Application.customer.Cust;
import Application.management.Manage;

public class Main {
    public static void main(String[] args) {

        Cust  a = new Cust();
        a.greet();
        Manage m = new Manage();
        m.book();

    }
}