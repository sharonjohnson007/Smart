package main.java;

public class Product1ToN {
    public static void main(String[] args) {
        long product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 11;
        for (int number=LOWERBOUND;number<=UPPERBOUND;number++){
            product=product*number;
        }
        System.out.println("Product of given numbers: "+product);
    }
}
