package games.fatsquirrel.core;

import games.fatsquirrel.entities.Entity;

public class Board {

    private Entity[][] entities;
    private BoardConfig boardConfig;

    public Board(BoardConfig config) {
        this.boardConfig = config;
    }

    public XY getSize() {
        return boardConfig.getSize();
    }

    public FlattenedBoard flatten() {
        return new FlattenedBoard(this);
    }

    public Entity[][] getEntities() {
        return entities;
    }
}
