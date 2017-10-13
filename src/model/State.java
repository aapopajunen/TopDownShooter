package model;

public abstract class State {

    public StateManager sm;

    public State(StateManager sm) {
        this.sm = sm;
    }

    public abstract void update(double dt);

    public abstract void render();


}
