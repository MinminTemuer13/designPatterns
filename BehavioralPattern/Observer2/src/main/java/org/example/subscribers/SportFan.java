package org.example.subscribers;

public class SportFan implements Sport{

    @Override
    public void update() {
        System.out.println("view game");
    }
}
