package games.fatsquirrel.console;
import games.fatsquirrel.Game;
import games.fatsquirrel.State;

public class GameImpl extends Game {

    public GameImpl(State state) {
        super(state);
    }

    public void run() {
        while (true) {
            render();
            processInput();
            update();
        }
    }

    @Override
    protected void render() {
        ui.render(state.flattenedBoard());
    }

    @Override
    protected void processInput(){
        state.setInput(ui.getCommand());
    }
}
