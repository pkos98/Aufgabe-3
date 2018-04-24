package games.fatsquirrel.entities;

import games.fatsquirrel.core.XY;

public abstract class Entity {

    protected XY position;
    protected int id;
    protected int energy;

    public int getId() {
        return id;
    }

    public void setPosition(XY pos) {
        position = pos;
    }
    public XY getPosition() {
        return position;
    }
    public int getEnergy() {return energy;}
    public abstract int getStartEnergy(); // TODO: Implement in subclasses!!1

    public XY nextStep() {
        return position;
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
