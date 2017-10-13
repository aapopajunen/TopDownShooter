package entities;

import math.Vector2;
import model.World;

public abstract class MobileEntity extends Entity{

    public double hp = 1.0;

    public Vector2 vel = new Vector2(0,0);

    public MobileEntity(double x, double y, double width, double height, World w) {
        super(x, y, width, height, w);
    }
}
