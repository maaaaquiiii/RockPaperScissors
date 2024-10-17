package org.example.model;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Figure makeMove() {
        System.out.print("Enter your move (rock, paper, scissors): ");
        String move = scanner.nextLine().toUpperCase();
        return Figure.valueOf(move);
    }
}
