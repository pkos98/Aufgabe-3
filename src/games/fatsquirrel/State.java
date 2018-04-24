package games.fatsquirrel;

import games.fatsquirrel.core.Board;
import games.fatsquirrel.core.FlattenedBoard;
import games.fatsquirrel.core.MoveCommand;
import games.fatsquirrel.entities.Entity;
import games.fatsquirrel.entities.MasterSquirrel;

public class State {

    private Board board;
    private MoveCommand input;

    State(Board board) {
        this.board = board;
    }

    public void update() {
        for (int x = 0; x < board.getSize().getX(); x++) {
            for (int y = 0; y < board.getSize().getY(); y++) {
                Entity iterField = board.getEntities()[x][y];
                if (iterField == null)
                    continue;
                // If NOT NULL
                if (iterField instanceof MasterSquirrel)
                    ((MasterSquirrel)iterField).setInput(input);

                iterField.nextStep();
            }
        }
    }

    public FlattenedBoard flattenedBoard() {
        return board.flatten();
    }

    public void setInput(MoveCommand command) {
        input = command;
    }
}
