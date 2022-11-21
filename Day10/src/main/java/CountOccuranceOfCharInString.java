package main.java;

public class CountOccuranceOfCharInString {
    private static int countMatches(final String str, final char ch) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int count = countMatches("johnsonsharon", 'n');
        System.out.println("using for loop : " + count);


    }
}

