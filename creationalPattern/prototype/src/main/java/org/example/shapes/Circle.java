package org.example.shapes;

import lombok.ToString;
import org.example.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "x:" + getX() + ", y:" + getY() + ", color:" + getColor() + ", radius:" + radius;
    }
}
