package main.java;

import java.util.Scanner;

/**
 * To calculate tax-inclusive price using loop which prompts user's input.
 */
public class SalesTaxCalculator {
    final double SALES_TAX_RATE = 0.07;
    final int SENTINEL = -1;

    public static void main(String[] args) {
        SalesTaxCalculator salesTaxCalculator = new SalesTaxCalculator();
        double price, actualPrice, salesTax = 0;
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price = in.nextDouble();
        while (price != salesTaxCalculator.SENTINEL) {
            actualPrice = price - (price / (1 + 0.07) * 0.07);               //To calculate actualPrice
            salesTax = salesTaxCalculator.SALES_TAX_RATE * actualPrice;     // To calculate salesTax
            totalPrice += price;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;
            System.out.printf("The Actual price is: $%.2f", actualPrice);
            System.out.printf(", Sales Tax is: $%.2f%n", salesTax);
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price = in.nextDouble();
        }
        System.out.printf("The Total price is: $%.2f%n", totalPrice);
        System.out.printf("The TotalActual price is: $%.2f%n", totalActualPrice);
        System.out.printf("The Total sales tax is: $%.2f%n", totalSalesTax);
    }
}
