package org.example;

import org.example.game.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App01GamingBasicJava {
    public static void main(String[] args) {


         //var game = new MarioGame();
       // var game = new SuperMarioGame();
        var game = new PangGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
//        GameRunner.run(SuperMarioGame);
//        GameRunner.run(MarioGame);
//        GameRunner.run(new ChessGame());
//        GameRunner.run(new SnakeGame());
//        GameRunner.run(new TicTacToeGame());
//        GameRunner.run(new Connect4Game());
//        GameRunner.run(new PongGame());
//        GameRunner.run(new TetrisGame());
//        GameRunner.run(new SpaceInvadersGame());
//        GameRunner.run(new TicTacToeGame());
//        GameRunner.run(new Connect4Game());
//        GameRunner.run(new PongGame());
//        GameRunner.run(new TetrisGame());
//        GameRunner.run(new SpaceInvadersGame());
//        GameRunner.run(new TicTacToeGame());
//        GameRunner.run(new Connect4Game());
//        GameRunner.run(new PongGame());
    }
}