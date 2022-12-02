package main.java;

/**
 * To find the product of 1 to N numbers using upperbond and lowerbond
 */
public class Product1ToN {
    public static void main(String[] args) {
        Product1ToN product1ToN = new Product1ToN();
        product1ToN.findFactorial(1, 11);
        product1ToN.findFactorial(1, 12);
        product1ToN.findFactorial(1, 13);
        product1ToN.findFactorial(1, 14);
        product1ToN.findFactorialLong(1, 13);
        product1ToN.findFactorialLong(1, 14);
    }
    public void findFactorial(int lowerBound, int upperBound) {
        int product = 1;
        for (int number = lowerBound; number <= upperBound; number++) {
            product = product * number;
        }
        System.out.println("Product of given numbers stored in int: " + product);
    }
    //Storing using long
    public void findFactorialLong(long lowerBond, long upperBond) {
        long product = 1;
        for (long number = lowerBond; number <= upperBond; number++) {
            product = product * number;
        }
        System.out.println("Product of given numbers stored in  long: " + product);
    }
}
