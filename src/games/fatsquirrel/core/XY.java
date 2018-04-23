package games.fatsquirrel.core;

import java.util.Random;

public final class XY {

    private static Random random = new Random();
    private int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static XY getRandomMoveVector() {
        int deltaX = random.nextInt(1 - (-1)) + (-1);
        int deltaY = random.nextInt(1 - (-1)) + (-1);
        return new XY(deltaX, deltaY);
    }

    public static XY getRandomPosition(int xSize, int ySize) {
        Random random = new Random();
        int x = random.nextInt(xSize);
        int y = random.nextInt(ySize);
        return new XY(x, y);
    }

    @Override
    public String toString() {
        return "X: " + x + " | Y:" + y;
    }

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
