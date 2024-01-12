package org.example.subscribers;

public class Investor implements Economy{

    @Override
    public void update() {
        System.out.println("investing");
    }
}
