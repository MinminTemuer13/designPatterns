package org.example;

public abstract class Shape {
    private int x;
    private int y;
    Color color;

    public Shape() {
    }

    public Shape(Shape shape) {
        x = shape.x;
        y = shape.y;
        color = shape.color;
    }

    public abstract Shape cloneShape();

    public abstract String toString();

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
