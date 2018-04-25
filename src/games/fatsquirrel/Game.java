package games.fatsquirrel;

import games.fatsquirrel.core.BoardView;

public abstract class Game {

    protected UI ui;
    protected State state;

    public Game(State state, UI ui) {
        this.state = state;
        this.ui = ui;
    }

    public void run() {
        while (true) {
            render();
            processInput();
            update();
        }
    }

    protected abstract void render();

    protected abstract void processInput();

    protected void update() {
        state.update();
    }



}
