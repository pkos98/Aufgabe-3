package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class Character extends Entity {

    public abstract XY nextStep();

    public Character(int id, int startEnergy, XY startPos) {
        super(id, startEnergy, startPos);
    }
}
