package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class PlayerEntity extends Character{

    private static final int START_ENERGY = 0;

    protected boolean isParalyzed;
    protected XY position;
    protected MasterSquirrel patron;


    public MasterSquirrel getPatron() {
        return patron;
    }

    public PlayerEntity(int id, int startEnergy, XY startPos) {
        super(id, startEnergy, startPos);
    }

    public void paralyze() {
        isParalyzed = true;
    }

}
