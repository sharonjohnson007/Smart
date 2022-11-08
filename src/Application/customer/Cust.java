package Application.customer;

import Application.relation.Relate;

import java.util.Scanner;

public class Cust {

    int choice;

    public void greet() {
        System.out.println("Welcome to toyoto!");
    }

    public void bud() {

        System.out.println("Please enter your budget\n 1.30lakhs\n 2.25lakhs\n 3.15lakhs\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice:\n");
        int choice = sc.nextInt();
        Relate rel = new Relate();
        rel.selec(choice);
        System.out.println();
        sc.close();
    }

}
