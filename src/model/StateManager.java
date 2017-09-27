package model;

import java.util.ArrayList;
import java.util.List;

public class StateManager {

    public List<State> states;
    public State testState;
    public State activeState;


    public StateManager() {
        testState = new TestState(this);
        states = new ArrayList<State>();
        states.add(testState);
        activeState = testState;
    }
    public void keyInput(int key, int action){
        activeState.keyInput(key, action);
    }

    public void update(double dt) {
        activeState.update(dt);
    }

    public void render() {
        activeState.render();
    }

}
