package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class Entity {

    private XY position;
    private int id;
    private int energy;

    public int getId() {
        return id;
    }
    public XY getPosition() {
        return position;
    }
    public int getEnergy() {return energy;}
    public abstract int getStartEnergy();

    public void setPosition(XY pos) {
        position = pos;
    }

    public void updateEnergy(int delta) {
        energy += delta;
    }

    @Override
    public String toString() {
        String result = "";
        result += "ID: " + id + System.lineSeparator();
        result += "Position: " + position.toString() + System.lineSeparator();
        result += "Energy: " + energy + System.lineSeparator();
        return result;
    }

    public Entity(int id, int startEnergy, XY startPos) {
        this.id = id;
        this.energy = startEnergy;
        this.position = startPos;
    }

}
