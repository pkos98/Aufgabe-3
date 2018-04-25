package games.fatsquirrel.console;

import games.fatsquirrel.UI;
import games.fatsquirrel.core.BoardView;
import games.fatsquirrel.core.MoveCommand;
import games.fatsquirrel.entities.EntityType;

public class ConsoleUI implements UI {

    private String FIELD_SEPERATOR = "|";
    // getCommand implementieren & Board/FlattenedBoard iplementieren

    @Override
    public MoveCommand getCommand() {
        return null;
    }

    @Override
    public void render(BoardView view) {
        String result = "";
        for (int y = 0; y < view.getSize().getY(); y++) {
            for (int x = 0; x < view.getSize().getX(); x++) {
                EntityType iterField = view.getEntityType(x, y);
                if (iterField == null)
                    result += "__";
                else
                    result += toString(iterField) + FIELD_SEPERATOR;
            }
            result += System.lineSeparator();
        }
        System.out.print(result);
    }

    private String toString(EntityType entity) {
        switch (entity) {
            case GoodBeast:
                return "GB";
            case BadBeast:
                return "BB";
            case GoodPlant:
                return "GP";
            case BadPlant:
                return "BP";
            case Wall:
                return "WA";
            case MasterSquirrel:
                return "MS";
            case MiniSquirrel:
                return "mS";
            default:
                return null;
        }
    }

}
