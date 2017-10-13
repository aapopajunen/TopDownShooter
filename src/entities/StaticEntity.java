package entities;

import model.World;

public abstract class StaticEntity extends Entity{

    public StaticEntity(double x, double y, double width, double height, World w) {
        super(x, y, width, height, w);
    }


}
