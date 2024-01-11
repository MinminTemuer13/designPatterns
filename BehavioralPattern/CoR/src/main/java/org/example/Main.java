package org.example;

import org.example.handlers.Handler;

public class Main {
    public static void main(String[] args) {
        ChainBuilder builder = new ChainBuilder();
        Handler handler = builder.getChain();

        if (!handler.handle("concrete1")) {
            System.out.println("无法处理");
        }
    }
}