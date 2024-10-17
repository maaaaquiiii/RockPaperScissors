package org.example;

import org.example.controller.GameController;
import org.example.model.ComputerPlayer;
import org.example.model.HumanPlayer;
import org.example.model.Player;
import org.example.view.GameView;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameView view = new GameView();

        view.shorGameModel();
        int choice = Integer.parseInt(sc.nextLine());
        Player player1 = new HumanPlayer(sc);
        Player player2;

        if(choice == 1) {
            player2 = new HumanPlayer(sc);
        } else {
            player2 = new ComputerPlayer();
        }

        GameController gameController = new GameController(view, player1, player2);
        gameController.startGame();


    }
}