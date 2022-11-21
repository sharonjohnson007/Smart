package main.java;

public class CountOccuranceOfSubString {
    public static void main(String[] args) {
        int count = countOccurrencesOf("johnson and johnson", "johnson");
        System.out.println("Count number of occurrences of substring 'johnson' " +
                " in string 'johnson and johnson' : " + count);
        int count1 = countOccurrencesOf("johnsonjava", "java");
        System.out.println("Count number of occurrences of substring 'java'" +
                "  in string 'johnsonjavaguides' : " + count1);
    }
    public static boolean hasLength(String str) {
        return (str != null && !str.isEmpty());
    }


    public static int countOccurrencesOf(String str, String sub) {
        if (!hasLength(str) || !hasLength(sub)) {
            return 0;
        }

        int count = 0;
        int pos = 0;
        int idx;
        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + sub.length();
        }
        return count;
    }


}
