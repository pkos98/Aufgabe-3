package games.fatsquirrel.entities;

public class MasterSquirrel extends PlayerEntity {

    MiniSquirrel[] miniSquirrel = new MiniSquirrel[10];


    public boolean checkEntity(Entity entity) {
        for (int i = 0; i < miniSquirrel.length; i++) {
            if(true)
                return true;
        }
        return false;
    }

    public MiniSquirrel[] creat() {
        return miniSquirrel;
    }

    public MiniSquirrel[] getMiniSquireel() {
        return miniSquirrel;
    }
}
