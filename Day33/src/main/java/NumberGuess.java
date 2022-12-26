package main.java;

import java.util.Scanner;

/**
 * Program called NumberGuess to play the number guessing game.
 */

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (100 * Math.random());
        // Given limit k
        int k = 5;
        int i, guess;
        System.out.println("A number is chosen between 1 to 100 Guess the number within 5 trials.");
        System.out.println("Key in your guess:");
        for (i = 0; i < k; i++) {
            guess = sc.nextInt();
            // If the SECRET_NUMBER is guessed
            if (SECRET_NUMBER == guess) {
                System.out.println("You got it in " + k + " trials!");
                break;
            } else if (SECRET_NUMBER > guess && i != k - 1) {
                System.out.println("Try higher " + guess);
            } else if (SECRET_NUMBER < guess && i != k - 1) {
                System.out.println("Try lower" + guess);
            }
        }
        if (i == k) {
            System.out.println("You have exhausted K trials.");

            System.out.println("The SECRET_NUMBER was " + SECRET_NUMBER);
        }
    }
}

