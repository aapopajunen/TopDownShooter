package entities;

import java.awt.geom.Rectangle2D;

public abstract class Entity {

    protected Rectangle2D hitbox;

    public Entity(double x,double y,double width, double height) {
        hitbox = new Rectangle2D.Double(x, y, width, height);
    }

    public double getX() {
        return this.hitbox.getX();
    }
    public double getY() {
        return this.hitbox.getY();
    }
    public double getWidth() {
        return this.hitbox.getWidth();
    }
    public double getHeight() {
        return this.hitbox.getHeight();
    }

    public abstract void update(double dt);
    public abstract void render();

}
