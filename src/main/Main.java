package main;

import engine.io.Window;

public class Main {

    public static void main(String[] args){
        Window window = new Window(200, 200, "My Window");
        window.Create();

        while(!window.Closed()){
            System.out.println("GAME LOOP");
        }
    }

}
