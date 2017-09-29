package model;

import entities.MobileEntity;
import entities.Player;
import entities.StaticEntity;

import java.util.List;

public class World {

    public List<MobileEntity> MobileEntities;
    public List<StaticEntity> StaticEntities;

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
