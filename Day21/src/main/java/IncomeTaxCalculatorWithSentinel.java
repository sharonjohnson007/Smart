package main.java;

import java.util.Scanner;

/**
 * To calculate Income tax and shall repeat the calculation until user enter SENTINEL value -1.
 */
public class IncomeTaxCalculatorWithSentinel {
    final int SENTINEL = -1;
    final double TAX_RATE_ABOVE_20K = 0.1;
    final double TAX_RATE_ABOVE_40K = 0.2;
    final double TAX_RATE_ABOVE_60K = 0.3;

    public static void main(String[] args) {
        IncomeTaxCalculatorWithSentinel withSentinel = new IncomeTaxCalculatorWithSentinel();
        int taxableIncome;
        double taxPayable = 0;
        double amount;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income (or -1 to end): $");
        taxableIncome = in.nextInt();
        while (taxableIncome != withSentinel.SENTINEL) {    //SENTINEL values for terminating the loop
            if (taxableIncome <= 20000) {                   //For below 20000 taxPayable=0.00
                taxPayable = 0;
            } else if (taxableIncome <= 40000) {            //For below 40000 taxPayable=0.1%
                amount = taxableIncome - 20000;
                taxPayable = amount * withSentinel.TAX_RATE_ABOVE_20K;
            } else if (taxableIncome <= 60000) {            //For below 60000 taxPayable=0.2%
                amount = taxableIncome - 20000;
                if (amount > 20000) {
                    amount = amount - 20000;
                    taxPayable = 20000 * withSentinel.TAX_RATE_ABOVE_20K + amount * withSentinel.TAX_RATE_ABOVE_40K;
                } else {
                    taxPayable = amount * withSentinel.TAX_RATE_ABOVE_20K;
                }
            } else {                                        //For above 60000 taxPayable=0.3%
                amount = taxableIncome - 20000;
                if (amount > 40000) {
                    amount = amount - 20000;
                    amount = amount - 20000;
                    taxPayable = 20000 * 0.0 + 20000 * withSentinel.TAX_RATE_ABOVE_20K + 20000 * withSentinel.TAX_RATE_ABOVE_40K + amount * withSentinel.TAX_RATE_ABOVE_60K;
                } else {
                    taxPayable = 20000 * withSentinel.TAX_RATE_ABOVE_20K + amount * withSentinel.TAX_RATE_ABOVE_40K;
                }
            }
            System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
            System.out.print("Enter the taxable income (or -1 to end): $");
            taxableIncome = in.nextInt();
        }
        System.out.println("bye!");
    }
}
