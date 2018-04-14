package games.fatsquirrel.core;

import games.fatsquirrel.entities.EntityType;

public interface BoardView {

    EntityType getEntityTyp(int x, int y);

    XY getsize();
}
