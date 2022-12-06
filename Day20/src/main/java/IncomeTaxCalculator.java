package main.java;

import java.util.Scanner;

/**
 * To calculate taxPayable for taxableIncome.
 */

public class IncomeTaxCalculator {
    final double TAX_RATE_ABOVE_20K = 0.1;
    final double TAX_RATE_ABOVE_40K = 0.2;
    final double TAX_RATE_ABOVE_60K = 0.3;
    final double TAX_REBATE_ABOVE_1K = 1000;

    public static void main(String[] args) {
        IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator();
        int taxableIncome;
        double taxPayable = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the taxable income: ");
        taxableIncome = scanner.nextInt();
        if (taxableIncome <= 20000) {          //For below 20000 taxPayable=0.00
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {   //For below 40000 taxPayable=0.1%
            taxPayable = taxableIncome * incomeTaxCalculator.TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= 60000) {   //For below 60000 taxPayable=0.2%
            taxPayable = taxableIncome * incomeTaxCalculator.TAX_RATE_ABOVE_40K;
        } else {                               //For above 60000 taxPayable=0.3%
            taxPayable = taxableIncome * incomeTaxCalculator.TAX_RATE_ABOVE_60K;
        }
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

        //For 10% tax rebate is announced for the income tax payable, capped at $1,000
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the taxable income: ");
        taxableIncome = scanner1.nextInt();
        if (taxableIncome <= 20000) {           //For below 20000 taxPayable=0.00
            taxPayable = 0.00;
        } else {                               // If taxPayable exceeds 1000 by rebate taxPayable=1000
            taxPayable = incomeTaxCalculator.TAX_REBATE_ABOVE_1K;
            System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
        }
    }
}
