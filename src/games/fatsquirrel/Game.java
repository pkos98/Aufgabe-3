package games.fatsquirrel;

import games.fatsquirrel.core.BoardView;

public abstract class Game {

    UI ui;
    BoardView boardView;

    public Game(State state) {
    }

    public void run() {
    }

    protected void processInput() {

    }

    protected void render() {
        ui.render(boardView);
    }

    protected void update() {
    }


}
