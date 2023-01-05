package com.sampleProject.learnspringframework;

import com.sampleProject.learnspringframework.game.GameRunner;
import com.sampleProject.learnspringframework.game.MarioGame;
import com.sampleProject.learnspringframework.game.PacmanGame;
import com.sampleProject.learnspringframework.game.SuperContraGame;

/**
 * Example program for loose coupling.
 */
public class AppGamingBasicJava {
    public static void main(String[] args) {
      // var game=new MarioGame();
      //  var game= new SuperContraGame();
        var game=new PacmanGame();
        var gameRunner=new GameRunner(game);
        gameRunner.run();
    }
}
