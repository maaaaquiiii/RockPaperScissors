package org.example.view;

import org.example.model.Figure;

public class GameView extends View {
    public void showResult(Figure playerFigure, Figure opponentFigure, String result) {
        System.out.print("Your chose: " + playerFigure);
        System.out.print("Opponent chose " + opponentFigure);
        System.out.print(result);
    }
    public void showWelcomeMessage() {
        System.out.println("Welcome to the game!");
    }
    public void shorGameModel() {
        System.out.println("Choose game mode: 0 for exit, 1 for vs player, 2 for vs computer: ");
    }
    public void showGoodbyeMessage() {
        System.out.println("Goodbye!");
    }
}
