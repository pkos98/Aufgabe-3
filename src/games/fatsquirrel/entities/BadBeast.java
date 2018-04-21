package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class BadBeast extends Entity {

    @Override
    public String getSymbol() {
        return "BB";
    }

    public BadBeast(XY startPos) {
        super(startPos);
        energy = -150;
    }

}
