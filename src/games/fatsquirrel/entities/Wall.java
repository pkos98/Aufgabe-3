package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public class Wall extends Entity {

    @Override
    public String getSymbol() {
        return "WL";
    }

    @Override
    public XY nextStep() {
        return position;
    }

    public Wall(XY startPos) {
        super(startPos);
        energy = -10;
    }



}
