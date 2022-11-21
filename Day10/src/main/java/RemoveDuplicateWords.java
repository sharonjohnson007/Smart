package main.java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String string = "i like java java coding java and you do you interested in java coding coding.";

        System.out.println("Original String: ");
        System.out.println(string);


        final String[] strWords = string.split("\\s+");



        final Set<String> setOfWords = new LinkedHashSet<String>(Arrays.asList(strWords));
        System.out.println("duplictes removed:"+setOfWords);


        final StringBuilder builder = new StringBuilder();
        int index = 0;
        System.out.println(builder);

        for (String s : setOfWords) {

            if (index > 0)
                builder.append(" ");
            System.out.println("before append:"+builder);

            builder.append(s);
            index++;
            System.out.println("After append:"+s);
        }

        string = builder.toString();


        System.out.println("String after removing duplicate words: ");
        System.out.println(string);
    }
}

