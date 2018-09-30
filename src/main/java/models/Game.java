package models;

public class Game {
    private State state;

    private Turn turn;

    private Board board;

    private static final int NUM_ATTEMPTS = 10;

    private static final int SECRETCODE_LENGTH = 4;

    public Game() {
        state = State.INITIAL;
        turn = new Turn();
        board = new Board(Game.SECRETCODE_LENGTH);
    }

    public State getState() {
        return state;
    }

    public void setState(State state){
        this.state = state;
    }

    public void change() {
        turn.change();
    }

    public int getNumAttempts() {
        return NUM_ATTEMPTS;
    }

    public void clear() {
        board.clear();
    }

    public boolean existMastermind() {
        return board.existMastermind(turn.take(), NUM_ATTEMPTS);
    }
}
