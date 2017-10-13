package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameState extends State{

    public List<World> worlds = new ArrayList<World>();
    public World activeWorld;

    public GameState(StateManager sm) {
        super(sm);
        worlds.add(new TestWorld(this));
        activeWorld = worlds.get(0);
    }


    @Override
    public void update(double dt) {
        activeWorld.update(dt);
    }

    @Override
    public void render() {
        activeWorld.render();
    }
}
