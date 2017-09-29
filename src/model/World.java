package model;

import entities.MobileEntity;
import entities.Player;
import entities.StaticEntity;

import java.util.ArrayList;
import java.util.List;

public class World {

    public List<MobileEntity> MobileEntities;
    public List<StaticEntity> StaticEntities;
    public Player p;

    public World(State s) {
        MobileEntities = new ArrayList<>();
        StaticEntities = new ArrayList<>();
        p = new Player(0,0,50,50);
        MobileEntities.add(p);
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
    }

}
