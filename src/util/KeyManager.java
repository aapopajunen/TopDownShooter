package util;

import static org.lwjgl.glfw.GLFW.*;

public class KeyManager {

    private long window;

    public KeyManager() {
        this.window = glfwGetCurrentContext();
    }

    public boolean keyPressed(int key) {return glfwGetKey(window, key) == GLFW_PRESS;}
}
