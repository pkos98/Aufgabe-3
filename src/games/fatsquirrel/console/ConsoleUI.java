package games.fatsquirrel.console;

import games.fatsquirrel.UI;
import games.fatsquirrel.core.BoardView;
import games.fatsquirrel.core.MoveCommand;

public class ConsoleUI implements UI{

    @Override
    public MoveCommand getCommand() {
        return null;
    }

    @Override
    public void render(BoardView view) {

    }
}
