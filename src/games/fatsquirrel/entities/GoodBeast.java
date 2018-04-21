package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class GoodBeast extends Entity {

    public GoodBeast(XY startPos) {
        super(startPos);
        energy = 200;
    }

    @Override
    public String getSymbol() {
        return "GB";
    }
}
