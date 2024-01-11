package org.example;

public class Main {
    public static void main(String[] args) {
        MDBC mdbc = MDBC.getInstance();

        for (int i = 0; i < 10; i++) {
            mdbc.countPlus();
        }

        System.out.println(mdbc);

        MDBC mdbc2 = MDBC.getInstance();

        for (int i = 0; i < 5; i++) {
            mdbc2.countPlus();
        }

        System.out.println(mdbc2);
    }
}