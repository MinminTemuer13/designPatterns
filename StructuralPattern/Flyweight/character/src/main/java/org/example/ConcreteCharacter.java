package org.example;

public class ConcreteCharacter implements Character {
    private final char internState;

    public ConcreteCharacter(char internState) {
        this.internState = internState;
    }

    @Override
    public char getValue() {
        return internState;
    }
}
