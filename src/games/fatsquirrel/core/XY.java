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

    @Override
    public String toString() {
        return "X: " + x + " | Y:" + y;
    }

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
