package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<java.lang.Character, Character> characterMap = new HashMap<>();

    public Character getCharacter(char ch) {
        Character character = characterMap.get(ch);

        if (character == null) {
            character = new ConcreteCharacter(ch);
            System.out.println("Create one more concrete character: " + ch);
            characterMap.put(ch, character);
        }

        return character;
    }
}
