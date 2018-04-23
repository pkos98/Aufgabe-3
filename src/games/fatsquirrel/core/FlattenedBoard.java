package games.fatsquirrel.core;

import games.fatsquirrel.entities.*;
import org.omg.CORBA.PERSIST_STORE;

public class FlattenedBoard implements EntityContext, BoardView {

    private Board board;
    private Entity[][] cells;

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
        Entity nextPosition = cells[miniSquirrel.getPosition().getX() + moveDirection.getX()]
                [miniSquirrel.getPosition().getY() + moveDirection.getY()];
        if (nextPosition instanceof Wall) {
            miniSquirrel.updateEnergy(nextPosition.getEnergy());
            miniSquirrel.paralyze();
            return;
        } else if (nextPosition instanceof MiniSquirrel &&
                miniSquirrel.getPatron() != ((MiniSquirrel) nextPosition).getPatron()) {
            kill(miniSquirrel);
        } else if (nextPosition instanceof MasterSquirrel &&
                miniSquirrel.getPatron() != nextPosition) {
            kill(miniSquirrel);
        } else if (nextPosition instanceof GoodPlant ||
                nextPosition instanceof BadPlant) {
            miniSquirrel.updateEnergy(nextPosition.getEnergy());
            killAndReplace(nextPosition); // Nicht nur instanz gelöscht und null gesetzt, sondern auch neu erstellen
        } else if (nextPosition instanceof GoodBeast ||
                nextPosition instanceof BadBeast) {
            miniSquirrel.updateEnergy(nextPosition.getEnergy());
            killAndReplace(nextPosition);
        }

        cells[miniSquirrel.getPosition().getX()][miniSquirrel.getPosition().getY()] = null;
        nextPosition = miniSquirrel;
    }

    @Override
    public void tryMove(GoodBeast goodBeast, XY moveDirection) {
        Entity nextPosition = cells[goodBeast.getPosition().getX() + moveDirection.getX()]
                [goodBeast.getPosition().getY() + moveDirection.getY()];
        CHECK:
        if (nextPosition == null)
            break CHECK;
        else if (nextPosition instanceof Wall)
            return;
        else if (nextPosition instanceof MiniSquirrel ||
                  nextPosition instanceof MasterSquirrel) {
            nextPosition.updateEnergy(goodBeast.getEnergy());
            killAndReplace(goodBeast);
        }
        cells[goodBeast.getPosition().getX()][goodBeast.getPosition().getY()] = null;
        nextPosition = goodBeast;
    }

    @Override
    public void tryMove(BadBeast badBeast, XY moveDirection) {
        Entity nextPosition = cells[badBeast.getPosition().getX() + moveDirection.getX()]
                [badBeast.getPosition().getY() + moveDirection.getY()];
        CHECK:
        if (nextPosition == null)
            break CHECK;
        else if (nextPosition instanceof Wall)
            return;
        else if (nextPosition instanceof MiniSquirrel ||
                nextPosition instanceof MasterSquirrel) {
            nextPosition.updateEnergy(badBeast.getEnergy());
            killAndReplace(badBeast);
        }
        cells[badBeast.getPosition().getX()][badBeast.getPosition().getY()] = null;
        nextPosition = badBeast;
    }

    @Override
    public void tryMove(MasterSquirrel masterSquirrel, XY moveDirection) {
        Entity nextPosition = cells[masterSquirrel.getPosition().getX() + moveDirection.getX()]
                [masterSquirrel.getPosition().getY() + moveDirection.getY()];
        CHECK:
        if (nextPosition == null)
            break CHECK;
        else if (nextPosition instanceof Wall)
        {
            masterSquirrel.updateEnergy(nextPosition.getEnergy());
            masterSquirrel.paralyze();
            return;
        }
        else if (nextPosition instanceof MasterSquirrel) {
            // TODO:....
        }
        else {
            masterSquirrel.updateEnergy(nextPosition.getEnergy());
            killAndReplace(nextPosition);
        }
        cells[masterSquirrel.getPosition().getX()][masterSquirrel.getPosition().getY()] = null;
        nextPosition = masterSquirrel;
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

    public FlattenedBoard(Board board) {
        this.board = board;
        cells = board.getEntities();
    }

    protected void collide(Entity active, Entity passive) {
        if (passive instanceof MasterSquirrel && !(active instanceof MasterSquirrel)) {
            Entity temp = active;
            active = passive;
            passive = temp;
        }

        active.updateEnergy(passive.getEnergy());
        if (active instanceof PlayerEntity && passive instanceof PlayerEntity) {
            PlayerEntity passivePlayer = (PlayerEntity) passive;
            PlayerEntity activePlayer = (PlayerEntity) active;
            if (passivePlayer.getPatron() == activePlayer.getPatron())
                return;

        } else if (passive instanceof Wall) {

        }
    }

}
