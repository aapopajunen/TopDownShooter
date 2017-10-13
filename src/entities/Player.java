package entities;

import math.Vector2;
import model.World;
import util.KeyManager;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class Player extends MobileEntity {

    public KeyManager km = new KeyManager();

    public Player(double x, double y, World w) {
        super(x,y,0.1,0.1,w);
    }

    public void update(double dt) {
        this.vel = new Vector2(0,0);
        if(km.keyPressed(GLFW_KEY_W))
            vel.add(new Vector2(0,1));
        if(km.keyPressed(GLFW_KEY_S))
            vel.add(new Vector2(0,-1));
        if(km.keyPressed(GLFW_KEY_A))
            vel.add(new Vector2(-1,0));
        if(km.keyPressed(GLFW_KEY_D))
            vel.add(new Vector2(1,0));

        vel.normalize();

        double x0 = this.x;
        double y0 = this.y;

        for(int i = 0; i < 10; i++) {
            this.x += vel.x * dt/10;
            if (this.collides()) this.x = x0;

            this.y += vel.y * dt/10;
            if (this.collides()) this.y = y0;
        }

    }

    public boolean collides() {
        int i = 0;

        while(i < w.StaticEntities.size() && !w.StaticEntities.get(i).getHitBox().intersects(this.getHitBox())){
            i++;
        }
        if(i == w.StaticEntities.size())
            return false;
            else
                return true;
    }

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
