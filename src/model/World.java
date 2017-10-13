package model;

import entities.MobileEntity;
import entities.Player;
import entities.StaticEntity;
import math.Vector2;

import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

public class World {

    public List<MobileEntity> MobileEntities = new ArrayList();
    public List<StaticEntity> StaticEntities = new ArrayList();


    public Vector2 gameCamera = new Vector2(0,0);
    public double gameCameraSmoothing = 10.0;
    public double gameCameraScale = 0.5;

    public GameState gs;
    public Player p;

    public World(GameState gs) {
        this.gs = gs;
    }

    public void addMobileEntity(MobileEntity e) {
        MobileEntities.add(e);
    }

    public void addStaticEntity(StaticEntity e) {
        StaticEntities.add(e);
    }

    public void render() {
        MobileEntities.forEach(e -> e.render());
        StaticEntities.forEach(e -> e.render());
    }

    public void update(double dt) {
        MobileEntities.forEach(e -> e.update(dt));
        updateGameCamera(dt);
    }

    public void updateGameCamera(double dt) {
        Vector2 deltaVector = p.centerPositionVector2().clone().sub(this.gameCamera).scale(1/gameCameraSmoothing);
        this.gameCamera.add(deltaVector);
        glTranslated( - deltaVector.x, - deltaVector.y, 0);

    }

}
