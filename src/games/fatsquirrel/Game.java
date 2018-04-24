package games.fatsquirrel;

import games.fatsquirrel.core.BoardView;
import games.fatsquirrel.core.MoveCommand;

public abstract class Game {

    protected UI ui;
    protected BoardView boardView;
    protected State state;
    MoveCommand lastCommand;

    public Game(State state) {
    }

    public void run() {
    }

    protected void render() {
        ui.render(boardView);
    }

    protected void processInput() {
        ui.getCommand();
    }

    protected void update() {
        state.update();
    }



}
