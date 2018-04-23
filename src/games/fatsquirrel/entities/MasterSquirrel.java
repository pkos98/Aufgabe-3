package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

import java.util.LinkedList;
import java.util.List;

public abstract class MasterSquirrel extends PlayerEntity {

    List<MiniSquirrel> miniSquirrels = new LinkedList<>();

    public MasterSquirrel(int id, int startEnergy, XY startPos) {
        super(id, startEnergy, startPos);
    }

    public boolean checkEntity(Entity entity) { return false; }

}
