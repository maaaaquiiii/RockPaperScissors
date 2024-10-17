package org.example.model;

import java.util.Random;

public class ComputerPlayer implements Player {
    private Random random;
    public ComputerPlayer() {
        this.random = new Random();
    }

    @Override
    public Figure makeMove() {
        Figure[] figures = Figure.values();
        return figures[random.nextInt(figures.length)];
    }
}
