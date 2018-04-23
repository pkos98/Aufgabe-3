package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class GoodPlant extends Character {

    public static final int START_ENERGY = 100;

    @Override
    public XY nextStep() {
        return position;
    }

    public GoodPlant(int id, XY startPos) {
        super(id, START_ENERGY, startPos);
    }

}
