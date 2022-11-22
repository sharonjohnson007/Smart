package Main.java;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsNumeric {

    public static void main(String[] args) {

        CharSequence cs="autg";
        System.out.println(isEmpty(cs));

        System.out.println(isNumeric(cs));

    }

    private static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    private static boolean isNumeric(final CharSequence cs) {
        if (isEmpty(cs)) {
            return false;
        }
        final int sz = cs.length();
        //System.out.print(cs);
        System.out.println("CharSeq : "+cs+" Length : "+sz);
        for (int i = 0; i < sz; i++) {
            if (!Character.isDigit(cs.charAt(i))) {
                return false;

            }
        }
        return true;
    }
    @Test
    public void testIsNumeric() {
        assertFalse(isNumeric(null));
        assertFalse(isNumeric(""));
        assertFalse(isNumeric(" "));
        assertFalse(isNumeric("a"));
        assertFalse(isNumeric("A"));
        assertFalse(isNumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        assertFalse(isNumeric("ham kso"));
        assertTrue(isNumeric("1"));
        assertTrue(isNumeric("1000"));
        assertTrue(isNumeric("\u0967\u0968\u0969"));
        assertFalse(isNumeric("\u0967\u0968 \u0969"));
        assertFalse(isNumeric("2.3"));
        assertFalse(isNumeric("10 00"));
        assertFalse(isNumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        assertFalse(isNumeric("_"));
        assertFalse(isNumeric("hkHKHik*khbkuh"));
        assertFalse(isNumeric("+123"));
        assertFalse(isNumeric("-123"));
    }
}


