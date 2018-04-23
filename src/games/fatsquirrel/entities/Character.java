package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class Character extends Entity{

    protected XY position;

    public Character(int id, int startEnergy, XY startPos) {
        super(id, startEnergy, startPos);
    }

    @Override
    public String getSymbol() {
        return null;
    }
}
