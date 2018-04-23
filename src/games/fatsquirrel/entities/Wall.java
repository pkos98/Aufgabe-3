package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class Wall extends Entity {

    private static final int START_ENERGY = -10;

    @Override
    public XY nextStep() {
        return position;
    }

    public Wall(int id, XY startPos) {
        super(id, START_ENERGY, startPos);
    }

    @Override
    public int getStartEnergy() {
        return START_ENERGY;
    }



}
