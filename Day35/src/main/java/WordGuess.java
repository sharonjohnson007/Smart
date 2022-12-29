package main.java;

import java.util.Scanner;

/**
 * To guess a word by trying to guess the individual characters provided using the command-line argument.
 */
public class WordGuess {
    public static void main(String[] args) {
        String word = args[0];
        boolean[] correct = new boolean[word.length()];
        Scanner scanner = new Scanner(System.in);
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String guess = scanner.nextLine();
            System.out.print("Trial " + (trials + 1) + ": ");
            //To whether it is a single character or a full word
            if (guess.length() == 1) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(0)) {
                        correct[i] = true;
                    }
                }
            } else {
                if (guess.equals(word)) {
                    for (int i = 0; i < word.length(); i++) {
                        correct[i] = true;
                    }
                }
            }
            trials++;
            //To print guessed word if correct.
            for (int i = 0; i < word.length(); i++) {
                if (correct[i]) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
            // To check  all positions have been guessed correctly
            boolean allCorrect = true;
            for (boolean b : correct) {
                if (!b) {
                    allCorrect = false;
                    break;
                }
            }
            if (allCorrect) {
                System.out.println("Congratulations!");
                System.out.println("You got it in " + trials + " trials");
                break;
            }
        }
    }
}


