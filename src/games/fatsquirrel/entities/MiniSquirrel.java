package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class MiniSquirrel extends Character {

    MasterSquirrel patron;

    public MiniSquirrel(XY startPos, MasterSquirrel master, int startEnergy, int id) {
        super(id, startEnergy, startPos);
        energy = startEnergy;
        patron = master;
    }

    public MasterSquirrel getPatron() {
        return patron;
    }
}
