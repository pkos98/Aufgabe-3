package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class Entity {

    protected XY Position;
    protected int ID;
    protected int Energy;

    public int getID() {
        return ID;
    }

    public XY getPosition() {
        return Position;
    }

    public XY nextStep() {
        return Position;
    }
}
