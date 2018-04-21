package games.fatsquirrel.core;


public class Board {

    private BoardConfig config;

    public XY getSize() {
        return config.getSize();
    }

    public Board(BoardConfig config) {
        this.config = config;
    }

    public FlattenedBoard flatten() {
        // TODO: Implement....
        return null;
    }
}
