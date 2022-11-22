package Main.java;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsAlphanumeric {

    public static void main(String[] args) {
        CharSequence cs="johnson@0007";
        System.out.println("forAlphaNumeric:"+""+isAlphanumeric(cs) +" "+"forEmpty:"+isEmpty(cs));
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isAlphanumeric(final CharSequence cs) {
        if (isEmpty(cs)) {
            return false;
        }
        final int sz = cs.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isLetterOrDigit(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testIsAlphanumeric() {
        assertFalse(isAlphanumeric(null));
        assertFalse(isAlphanumeric(""));
        assertFalse(isAlphanumeric(" "));
        assertTrue(isAlphanumeric("a"));
        assertTrue(isAlphanumeric("A"));
        assertTrue(isAlphanumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        assertFalse(isAlphanumeric("ham kso"));
        assertTrue(isAlphanumeric("1"));
        assertTrue(isAlphanumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        assertFalse(isAlphanumeric("_"));
        assertFalse(isAlphanumeric("hkHKHik*khbkuh"));
    }
}
