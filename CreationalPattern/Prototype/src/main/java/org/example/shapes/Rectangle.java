package org.example.shapes;

import lombok.ToString;
import org.example.Shape;

public class Rectangle extends Shape {

    private double length;

    public Rectangle() {
    }

    Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.length = rectangle.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "x:" + getX() + ", y:" + getY() + ", color:" + getColor() + ", length:" + length;
    }
}
