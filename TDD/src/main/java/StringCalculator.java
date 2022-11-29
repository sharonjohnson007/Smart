package main.java;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringCalculator {
    public static void main(String[] args) {
    }

    public int calculator(String number) {

        int sum = 0;
        if (number == null || number == "") {
            return 0;

        }
        else {
            //Pattern pattern = Pattern.compile("([^;]*?('.*?')?)*?;\\s*", Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);
           // Matcher matcher= pattern.matcher(number);
            String[] num = number.split("[//;,\\n]");
            System.out.println(Arrays.toString(num));

           for (int i = 0; i < num.length; i++) {
               sum = sum + Integer.valueOf(num[i]);

            }
           return sum;



        }
    }
}




