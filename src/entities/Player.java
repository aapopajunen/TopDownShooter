package entities;

import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glRectd;

public class Player extends MobileEntity {

    public Player(double x,double y, double width, double height) {
        super(x,y,width,height);
    }

    public void render(){
        glColor3f(200,100,100);
        glRectd(this.x, this.y, this.width, this.height);
    }

    public void update(double dt) {}
}
