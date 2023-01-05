package com.sampleProject.learnspringframework.game;

/**
 *
 */

public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("Go into the hole");
    }
    public void right(){
        System.out.println("Accelerate");
    }
    public void left(){
        System.out.println("Go Back");
    }
}
