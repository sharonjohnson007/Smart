package main.java;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Example to use NumberFormat class.
 */

public class TestNumberCurrencyFormat {
    public static void main(String[] args) {
        Locale[] locales = {Locale.US, Locale.FRANCE, Locale.JAPAN};

        for (Locale loc : locales) {
            NumberFormat formatter = NumberFormat.getInstance(loc);
            String formattedNumber = formatter.format(123456789.12345);
            System.out.format("%15s: %s\n", loc.getDisplayCountry(), formattedNumber);
        }

        for (Locale loc : locales) {
            NumberFormat formatter = NumberFormat.getCurrencyInstance(loc);
            String formattedNumber = formatter.format(123456789.12345);
            System.out.format("%15s: %s\n", loc.getDisplayCountry(), formattedNumber);
        }

    }
}
