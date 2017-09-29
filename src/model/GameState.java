package model;

import java.util.List;

public class GameState extends State{

    public List<World> worlds;
    private World currentWorld;

    public GameState() {
        currentWorld = new World(this);
    }

    @Override
    public void keyInput(int key, int action) { }

    @Override
    public void update(double dt) {
        currentWorld.update(dt);
    }

    @Override
    public void render() {
        currentWorld.render();
    }
}
