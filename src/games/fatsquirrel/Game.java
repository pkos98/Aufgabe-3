package games.fatsquirrel;

import games.fatsquirrel.core.BoardView;

public abstract class Game {

    protected UI ui;
    protected BoardView boardView;
    protected State state;

    public Game(State state) {
    }

    public void run() {
    }

    protected abstract void render();

    protected abstract void processInput();

    protected void update() {
        state.update();
    }



}
