package main.java;

public class CountVowelsAndConsonants {

    private static int vowels = 0;
    private static int consonants = 0;
    private static final String TEXT = "Java is Popular Programming Language";

    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("String.charAt() solution:");

        countVowelsAndConsonants(TEXT);

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }

    public static void countVowelsAndConsonants(String str) {

        if (str == null) {
            // or throw IllegalArgumentException
            throw new IllegalArgumentException("Input String can't be null");
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }
    }
}



