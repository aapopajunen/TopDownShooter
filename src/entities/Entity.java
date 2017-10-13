package entities;

import math.Vector2;
import model.World;
import java.awt.geom.Rectangle2D;
import static org.lwjgl.opengl.GL11.*;

public abstract class Entity {

    public double x,y,height,width;
    public World w;

    public Rectangle2D getHitBox() {return new Rectangle2D.Double(x,y,width,height);}

    public Entity(double x,double y,double width, double height, World w) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.w = w;
    }

    public Vector2 centerPositionVector2() {
        double x = this.getHitBox().getCenterX();
        double y = this.getHitBox().getCenterY();
        return new Vector2(x,y);
    }

    public abstract void update(double dt);

    public void render() {
        glColor3f(1.0f,1.0f,1.0f);
        glRectd(
                this.x,
                this.y,
                this.x + width,
                this.y + height
        );
    }

}
