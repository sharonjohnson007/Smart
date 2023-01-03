package main.java;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList example for adding books to the list and printing all the books.
 */

public class BookLinkedList {
    int id;
    String name, author, publisher;
    int quantity;

    public BookLinkedList(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        List<BookLinkedList> list = new LinkedList<BookLinkedList>();
        BookLinkedList b1 = new BookLinkedList(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookLinkedList b2 = new BookLinkedList(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookLinkedList b3 = new BookLinkedList(103, "Operating System", "Galvin", "Wiley", 6);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for (BookLinkedList b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}


