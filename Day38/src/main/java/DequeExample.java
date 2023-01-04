package main.java;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque example program for adding and removing.
 */

public class DequeExample{
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
