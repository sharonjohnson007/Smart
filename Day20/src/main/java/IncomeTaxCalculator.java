package main.java;

import java.util.Scanner;

/**
 * To calculate taxPayable for taxableIncome.
 */

public class IncomeTaxCalculator {
    final double TAX_RATE_ABOVE_20K = 0.1;
    final double TAX_RATE_ABOVE_40K = 0.2;
    final double TAX_RATE_ABOVE_60K = 0.3;
    
    public static void main(String[] args) {
        IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator();
        int taxableIncome;
        double taxPayable = 0;
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the taxable income: ");
        taxableIncome = scanner.nextInt();
        if (taxableIncome <= 20000) {          //For below 20000 taxPayable=0.00
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {   //For below 40000 taxPayable=0.1%
            amount = taxableIncome - 20000;
            taxPayable = amount * incomeTaxCalculator.TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= 60000) {   //For below 60000 taxPayable=0.2%
            amount = taxableIncome - 20000;
            if (amount > 20000) {
                amount = amount - 20000;
                taxPayable = 20000 * incomeTaxCalculator.TAX_RATE_ABOVE_20K + amount * incomeTaxCalculator.TAX_RATE_ABOVE_40K;
            } else {
                taxPayable = amount * incomeTaxCalculator.TAX_RATE_ABOVE_20K;
            }
        } else {                               //For above 60000 taxPayable=0.3%
            amount = taxableIncome - 20000;
            if (amount > 40000) {
                amount = amount - 20000;
                amount = amount - 20000;
                taxPayable = 20000 * 0.0 + 20000 * incomeTaxCalculator.TAX_RATE_ABOVE_20K + 20000 * incomeTaxCalculator.TAX_RATE_ABOVE_40K + amount * incomeTaxCalculator.TAX_RATE_ABOVE_60K;
            } else {
                taxPayable = 20000 * incomeTaxCalculator.TAX_RATE_ABOVE_20K + amount * incomeTaxCalculator.TAX_RATE_ABOVE_40K;
            }
        }
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
        //For 10% tax rebate is announced for the income tax payable, capped at $1,000
        if (taxPayable <= 1000) {
            double rebate = taxPayable * 0.1;
            taxPayable = taxPayable - rebate;
        } else {
            taxPayable = taxPayable - 1000;
        }
        System.out.println("TaxPayable after rebate: " + taxPayable);
    }
}
