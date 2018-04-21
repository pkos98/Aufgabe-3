package games.fatsquirrel;

import games.fatsquirrel.core.Board;
import games.fatsquirrel.core.FlattenedBoard;

public class State {

    private final Board board;

    State(Board board) {
        this.board = board;
    }

    public void update() {
        // TODO: Implement
    }

    public FlattenedBoard flattenedBoard() {
        return board.flatten();
    }
}
