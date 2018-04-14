package games.fatsquirrel.core;
public class BoardConfig {

    private XY size;
    private int wallCount;

    public XY getSize() {
        return size;
    }

    public int getWallCount() {
        return wallCount;
    }

    public BoardConfig(XY size, int wallCount) {
        this.size = size;
        this.wallCount = wallCount;
    }

}
