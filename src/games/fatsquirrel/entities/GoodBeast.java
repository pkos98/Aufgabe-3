package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class GoodBeast extends Character {

    private static final int START_ENERGY = 200;

    public GoodBeast(int id, XY startPos) {
        super(id, START_ENERGY, startPos);
    }

    @Override
    public String getSymbol() {
        return "GB";
    }
}
