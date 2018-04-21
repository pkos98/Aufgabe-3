package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class MiniSquirrel extends Entity {

    MasterSquirrel patron;

    public MiniSquirrel(XY startPos, MasterSquirrel master, int startEnergy) {
        super(startPos);
        patron = master;
        energy = startEnergy;
    }

    public MasterSquirrel getPatron() {
        return patron;
    }

    @Override
    public String getSymbol() {
        return "ms";
    }
}
