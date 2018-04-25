package games.fatsquirrel.entities;

import games.fatsquirrel.core.MoveCommand;
import games.fatsquirrel.core.XY;

import java.util.LinkedList;
import java.util.List;

public abstract class MasterSquirrel extends PlayerEntity {

    private MoveCommand input;
    private List<MiniSquirrel> miniSquirrels = new LinkedList<>();

    public MasterSquirrel(int id, int startEnergy, XY startPos) {
        super(id, startEnergy, startPos);
    }

    public boolean checkEntity(Entity entity) { return false; }

    public void setInput(MoveCommand input) {
        this.input = input;
    }

    @Override
    public XY nextStep() {
        getPosition().add(input.toXY());
        return getPosition();
    }

}
