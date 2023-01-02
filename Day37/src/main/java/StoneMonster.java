package main.java;

/**
 * The StoneMonster class,subclass of monster.
 */

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
