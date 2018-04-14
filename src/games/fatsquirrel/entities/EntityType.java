package games.fatsquirrel.entities;

public class EntityType {
    GoodPlant goodPlant;
    GoodBeast goodBeast;
    BadBeast badBeast;
    BadPlant badPlant;
    Wall wall;
    MasterSquirrel masterSquirrel;
    MiniSquirrel miniSquirrel;

    public GoodPlant getEntityType(GoodPlant goodPlant) {
        return goodPlant;
    }

    public GoodBeast getEntityType(GoodBeast goodBeast) {
        return goodBeast;
    }

    public BadBeast getEntityType(BadBeast badBeast) {
        return badBeast;
    }

    public BadPlant getEntityType(BadPlant badPlant) {
        return badPlant;
    }

    public Wall getEntityType(Wall wall) {
        return wall;
    }

    public MasterSquirrel getEntityType(MasterSquirrel masterSquirrel) {
        return masterSquirrel;
    }

    public MiniSquirrel getEntityType(MiniSquirrel miniSquirrel) {
        return miniSquirrel;
    }
}
