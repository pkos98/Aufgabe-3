package games.fatsquirrel.core;

import games.fatsquirrel.entities.*;

public class FlattenedBoard implements EntityContext, BoardView {

    @Override
    public EntityType getEntityType(int x, int y) {
        return null;
    }

    @Override
    public XY getSize() {
        return null;
    }

    @Override
    public void tryMove(MiniSquirrel miniSquirrel, XY moveDirection) {
    }

    @Override
    public void tryMove(GoodBeast goodBeast, XY moveDirection) {

    }

    @Override
    public void tryMove(BadBeast badBeast, XY moveDirection) {
    }

    @Override
    public void tryMove(MasterSquirrel masterSquirrel, XY moveDirection) {

    }

    @Override
    public PlayerEntity nearestPlayerEntity(XY pos) {
        return null;
    }

    @Override
    public void kill(Entity entity) {

    }

    @Override
    public void killAndReplace(Entity entity) {
    }

    @Override
    public EntityType getEntityType(XY xy) {
        return null;
    }

}
