package games.fatsquirrel;

import games.fatsquirrel.console.ConsoleUI;
import games.fatsquirrel.console.GameImpl;
import games.fatsquirrel.core.Board;
import games.fatsquirrel.core.BoardConfig;
import games.fatsquirrel.core.XY;

public class Launcher {

    public static void main(String[] args) {

        Game game = new GameImpl(new State(new Board(new BoardConfig(new XY(10,10), 12))), new ConsoleUI());
        game.run();

    }

}
