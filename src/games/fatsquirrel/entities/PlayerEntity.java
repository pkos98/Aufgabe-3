package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class PlayerEntity extends Entity{

    public PlayerEntity(XY startPos) {
        super(startPos);
    }

    public void UpdateEnergie(int delta){
    }
}
