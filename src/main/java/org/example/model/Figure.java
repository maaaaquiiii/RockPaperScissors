package org.example.model;

public enum Figure {
    ROCK,
    PAPER,
    SCISSORS;

    public boolean beats(Figure move) {
        switch (this) {
            case ROCK:
                return move == SCISSORS;
            case PAPER:
                return move == ROCK;
            case SCISSORS:
                return move == PAPER;
            default:
                return false;
        }
    }
}
