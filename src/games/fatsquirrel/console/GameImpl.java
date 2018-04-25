package games.fatsquirrel.console;
import games.fatsquirrel.Game;
import games.fatsquirrel.State;
import games.fatsquirrel.UI;

public class GameImpl extends Game {

    public GameImpl(State state, UI ui) {
        super(state, ui);
    }

    // MasterSquirrel referenz & input setten


    @Override
    protected void render() {
        ui.render(state.flattenedBoard());
    }

    @Override
    protected void processInput(){
        state.setInput(ui.getCommand());
    }
}
