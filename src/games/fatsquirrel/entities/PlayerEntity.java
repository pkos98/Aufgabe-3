package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class PlayerEntity extends Character{

    protected XY position;

    private static final int START_ENERGY = 0;

    public PlayerEntity(int id, int startEnergy, XY startPos) {
        super(id, startEnergy, startPos);
    }
}
