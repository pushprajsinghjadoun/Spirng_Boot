package org.example.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
   // MarioGame game;
    private GamingConsole game;
    public  GameRunner(GamingConsole work) {
        this.game = work;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
