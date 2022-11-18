package main.java;

import java.util.LinkedList;
import java.util.List;

public class StaticBlockDemo {

    public static List<String> ranks = new LinkedList<>();

    static {
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Major");
    }

    static {
        ranks.add("Colonel");
        ranks.add("General");
    }

    public static void main(String[] args) {
        System.out.println(ranks);
    }
}
