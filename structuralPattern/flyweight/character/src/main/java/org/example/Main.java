package org.example;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String str = "Hello world! My name is windy and l like to blow trees, by the way welcome to Chi city!";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            CharacterState characterState = new CharacterState(factory.getCharacter(c), 1, 2, "Black", 14);
            System.out.println(characterState);
        }
    }
}