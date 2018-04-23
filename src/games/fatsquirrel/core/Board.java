package games.fatsquirrel.core;

import games.fatsquirrel.entities.Entity;

public class Board {

    private final Entity entities;
    private BoardConfig boardConfig;

    public Board(Entity entities, BoardConfig boardConfig, BoardConfig config) {
        this.entities = entities;
        this.boardConfig = boardConfig;
        this.boardConfig = config;
    }

    public XY getSize() {
        return boardConfig.getSize();
    }

    public FlattenedBoard flatten() {
        // TODO: Implement....
        return null;
    }
}
