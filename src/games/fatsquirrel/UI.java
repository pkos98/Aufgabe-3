package games.fatsquirrel;

import games.fatsquirrel.core.BoardView;
import games.fatsquirrel.core.MoveCommand;

public interface UI {

        public MoveCommand getCommand();

        public void render(BoardView view);

}
