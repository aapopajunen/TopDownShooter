package model;

public abstract class State {

    public StateManager sm;

    public abstract  void keyInput(int key, int action);

    public abstract void update(double dt);

    public abstract void render();


}
