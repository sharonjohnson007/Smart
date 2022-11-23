package main.java;

public class FirstNonRepeatedCharacter {

    private static final String TEXT = "Java Guides Popular blog Website";

    public static void main(String[] args) {


        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("Loop and break solution:");
        char firstcharV1 = firstNonRepeatedCharacterV1(TEXT);

        System.out.println("Found character: " + firstcharV1);



    }
    public static char firstNonRepeatedCharacterV1(String str) {


        if (str == null) {
            // or throw IllegalArgumentException
            return Character.MIN_VALUE;
        }
        System.out.println(Character.MIN_VALUE);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }



}

