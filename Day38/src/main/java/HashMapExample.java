package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap Example program-1.
 */

public class HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(1, "Grapes"); //trying duplicate key
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
