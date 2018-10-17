package engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {
    private int width;
    private int height;
    private String title;
    private long window;

    public Window(int width, int height, String title){
        this.width = width;
        this.height = height;
        this.title = title;
        Create();
    }

    public void Create(){
        if(!GLFW.glfwInit()){
            System.err.println("Error: Could not initialize GLFW");
            System.exit(-1);
        }

        window = GLFW.glfwCreateWindow(width, height, title, 0, 0);

        if(window == 0){
            System.err.print("Error: Window could not be created");
            System.exit(-1);
        }

        GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
        GLFW.glfwSetWindowPos(window, (videoMode.width() - width) / 2, (videoMode.height() - height) / 2);

        GLFW.glfwShowWindow(window);
    }

    public boolean Closed() {
        return GLFW.glfwWindowShouldClose(window);
    }
}
