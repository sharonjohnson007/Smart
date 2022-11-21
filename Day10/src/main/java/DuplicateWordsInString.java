package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

    private static void duplicateWords(String inputString) {
        final String[] words = inputString.split(" ");

        final Map< String, Integer > wordCount = new HashMap< String, Integer >();

        for (String word: words) {

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        final Set< String > wordsInString = wordCount.keySet();

        for (String word: wordsInString) {
            // if word count is greater than 1

            if (wordCount.get(word) > 1) {
                // Printing that word and it's count
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {

        duplicateWords("He is he is also he");

        duplicateWords("Java is Java again Java");

        duplicateWords("Super Man Bat Man Spider Man");
    }
}