package model;

import com.sun.javafx.geom.Vec2d;
import com.sun.javafx.geom.Vec2f;
import com.sun.javafx.geom.Vec3f;
import math.Vector2;
import org.lwjgl.assimp.AIMatrix4x4;
import org.lwjgl.glfw.GLFW;

import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class TestState extends State{

    float bg = 0.2f;

    float col = 1.0f;



    Vector2 pos = new Vector2(0,0);
    Vector2 vel = new Vector2(0,0);
    double speed = 1.0;
    double size = 0.1;

    public TestState(StateManager s) {
        sm = s;
    }

    boolean wPressed = false;
    boolean sPressed = false;
    boolean aPressed = false;
    boolean dPressed = false;

    @Override
    public void keyInput(int key, int action) {



        if(key == GLFW_KEY_W){
            if(action == GLFW_PRESS) wPressed = true;
            if(action == GLFW_RELEASE) wPressed = false;
        }

        if(key == GLFW_KEY_S){
            if(action == GLFW_PRESS) sPressed = true;
            if(action == GLFW_RELEASE) sPressed = false;
        }

        if(key == GLFW_KEY_A){
            if(action == GLFW_PRESS) aPressed = true;
            if(action == GLFW_RELEASE) aPressed = false;
        }

        if(key == GLFW_KEY_D){
            if(action == GLFW_PRESS) dPressed = true;
            if(action == GLFW_RELEASE) dPressed = false;
        }
    }

    @Override
    public void update(double dt) {



        vel = new Vector2(0,0);

        if(wPressed) vel.add(new Vector2(0, 1));
        if(sPressed) vel.add(new Vector2(0, -1));
        if(aPressed) vel.add(new Vector2(-1, 0));
        if(dPressed) vel.add(new Vector2(1,0));


        if(!wPressed && !sPressed && !aPressed && !dPressed)
            vel.scale(0.85);
        else
            vel.normalize().scale(2);

        pos.add(vel.clone().scale(dt));
    }

    @Override
    public void render() {

        glColor3f(col, col, col);
        glRectd(
                pos.x - size/2,
                pos.y - size/2,
                pos.x + size/2,
                pos.y + size/2
        );
    }

}
