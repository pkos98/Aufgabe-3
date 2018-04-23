package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class BadBeast extends Entity {

    private static final int START_ENERGY = -150;

    @Override
    public String getSymbol() {
        return "BB";
    }

    public BadBeast(int id, XY startPos) {
        super(id, START_ENERGY, startPos);
    }

}
