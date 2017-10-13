package model;

import java.util.ArrayList;
import java.util.List;

public class StateManager {

    public List<State> states;
    public State activeState;

    public StateManager() {
        states = new ArrayList<State>();
        State gs = new GameState(this);
        this.addState(gs);
        activeState = gs;
    }

    public void addState(State s) {
        states.add(s);
    }

    public void update(double dt) {
        activeState.update(dt);
    }

    public void render() {
        activeState.render();
    }

}
