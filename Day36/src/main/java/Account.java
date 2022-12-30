package main.java;

/**
 * The Account class models a bank account with a balance.
 */

public class Account {
    public static void main(String[] args) {
        Account a1 = new Account(5566);
        System.out.println(a1);
        Account a2 = new Account(1234, 99.9);
        System.out.println(a2);
        System.out.println("The account Number is: " + a2.getNumber());
        System.out.println("The balance is: " + a2.getBalance());
        a1.credit(11.1);
        System.out.println(a1);
        a1.debit(5.5);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
        a2.transferTo(1.0, a1);
        System.out.println(a1);
        System.out.println(a2);
    }

    private int number;
    private double balance;

    public Account(int number) {
        this.number = number;
        this.balance = 0.0;
    }

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        return String.format("Account[number=%d,balance=$%.2f]", number, balance);
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount exceeded");
        }
    }

    public void transferTo(double amount, Account another) {
        if (balance >= amount) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("amount exceeded");
        }
    }
}
