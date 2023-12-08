package org.example;

public class CharacterState {
    private final Character character;
    private int x;
    private int y;
    private String font;
    private int size;

    CharacterState(Character character, int x, int y, String font, int size) {
        this.character = character;
        this.x = x;
        this.y = y;
        this.font = font;
        this.size = size;
    }

    public Character getCharacter() {
        return character;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "CharacterState{" +
                "character=" + character.getValue() +
                ", x=" + x +
                ", y=" + y +
                ", font='" + font + '\'' +
                ", size=" + size +
                '}';
    }
}
