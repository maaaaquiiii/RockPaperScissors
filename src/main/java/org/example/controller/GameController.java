package org.example.controller;

import org.example.model.*;
import org.example.view.GameView;

public class GameController {
    private GameView view;
    private Player player1;
    private Player player2;

    public GameController(GameView view, Player player1, Player player2) {
        this.view = view;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        view.showWelcomeMessage();
        Figure player1Move = player1.makeMove();
        Figure player2Move = player2.makeMove();
        this.determineWinner(player1Move, player2Move);
    }
    private void determineWinner(Figure player1Move, Figure player2Move) {
        if (player1Move.equals(player2Move)) {
            System.out.println("Draw");
        } else if (player1Move.beats(player2Move)) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}
