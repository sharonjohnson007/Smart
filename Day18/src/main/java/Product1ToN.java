package main.java;

/**
 * To find the product of 1 to N numbers using upperbond and lowerbond
 */
public class Product1ToN {
    public static void main(String[] args) {
        Product1ToN product1ToN = new Product1ToN();
        product1ToN.findFactorial(1, 13);
    }

    public void findFactorial(int lowerBond, int upperBond) {
        long product = 1;
        int LOWERBOUND = lowerBond;
        int UPPERBOUND = upperBond;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            product = product * number;
        }
        System.out.println("Product of given numbers: " + product);
    }

}
