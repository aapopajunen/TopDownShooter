package entities;

import java.awt.geom.Rectangle2D;

public abstract class Entity {

    protected double x, y;
    protected double width, height;

    protected Rectangle2D bounds;

    public Entity(double x,double y,double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        bounds = new Rectangle2D.Double(x, y, width, height);
    }

    public abstract void update(double dt);
    public abstract void render();

}
