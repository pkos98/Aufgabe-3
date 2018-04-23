package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class BadBeast extends Entity {

    private static final int START_ENERGY = -150;

    public BadBeast(int id, XY startPos) {
        super(id, START_ENERGY, startPos);
    }

    @Override
    public int getStartEnergy() {
        return START_ENERGY;
    }
}
