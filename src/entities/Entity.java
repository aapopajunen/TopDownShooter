package entities;

import javafx.scene.shape.Polygon;

import java.awt.geom.Rectangle2D;

public abstract class Entity {

    protected Rectangle2D hitbox;

    public Entity(double x,double y,double width, double height) {
        hitbox.setRect(x, y, width, height);
    }

    public abstract void update(double dt);
    public abstract void render();

}
