package main.java;

/**
 * Program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
 */
public class CozaLozaWoza {
    public static void main(String[] args) {
        int LOWERBOUND = 1, UPPERBOUND = 110;
        int number;
        for (number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // Print "Coza" if number is divisible by 3
            if (number % 3 == 0) {
                System.out.print("Coza");
            }
            // Print "Loza" if number is divisible by 5
            if (number % 5 == 0) {
                System.out.print("Loza");
            }
            // Print "Woza" if number is divisible by 7
            if (number % 7 == 0) {
                System.out.print("Woza");
            }
            // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                System.out.print(number);
            }
            // After processing the number, print a newline if number is divisible by 11;
            if (number % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");

            }
        }
        System.out.println("--------------------------------------------------------");

        //Using boolean flag to keep track of whether the number has been processed.
        boolean printed;
        for (number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            printed = false;
            if (number % 3 == 0) {
                System.out.print("Coza");
                printed = true;
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
                printed = true;
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
                printed = true;
            }
            if (!printed) {
                System.out.print(number);
            }
            if (number % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}






