package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class MiniSquirrel extends PlayerEntity {
    private static int START_ENERGY;

    public MiniSquirrel(XY startPos, MasterSquirrel master, int startEnergy, int id) {
        super(id, startEnergy, startPos);
        energy = START_ENERGY;
        startEnergy = START_ENERGY;
    }

    @Override
    public int getStartEnergy() {
        return START_ENERGY;
    }
}
