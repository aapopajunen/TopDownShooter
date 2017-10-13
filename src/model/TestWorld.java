package model;

import entities.Player;
import entities.Wall;

public class TestWorld extends World{




    public TestWorld(GameState gs) {
        super(gs);
        this.addStaticEntity(new Wall(0.1, 0.1, 0.2, 0.2, this));
        this.p = new Player(-0.5, -0.5,this);
        this.addMobileEntity(p);
    }




}
