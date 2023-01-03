package main.java;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet example program.
 */

public class LinkedHashSetExample {
    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Java");
        lhs.add("T");
        lhs.add("Point");
        lhs.add("Good");
        lhs.add("Website");
        System.out.println("The hash set is: " + lhs);
        // since the element "Good" is present, therefore, the method remove()
        // returns true
        System.out.println(lhs.remove("Good"));
        System.out.println("After removing the element, the hash set is: " + lhs);
        System.out.println(lhs.remove("For"));
    }
}
