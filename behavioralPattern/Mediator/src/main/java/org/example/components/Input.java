package org.example.components;

import java.util.Random;

public class Input{
    private String value;
    private final Random random;

    public Input() {
        random = new Random();
        onChange();
    }

    public void onChange() {
        value = String.valueOf((char) ('a' + random.nextInt(26)));
    }

    @Override
    public String toString() {
        return "Input{" +
                "value='" + value + '\'' +
                '}';
    }
}
