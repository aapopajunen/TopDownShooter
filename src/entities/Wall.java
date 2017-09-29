package entities;


import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glRectd;


//Wall class represent all unpassable walls in game
public class Wall extends StaticEntity {

    //Construct Wall and pass parameters to superclass (Entity)
    public Wall(double x, double y, double w, double h) {
        super(x,y,w,h);
    }

    //Update Wall, for now it doesn't do anything
    public void update(double dt) {

    }

    //Draw wall
    public void render() {
        glColor3f(200,200,200);
        glRectd(
                this.x,
                this.y,
                this.x + this.width,
                this.y + this.height);

    }

}
