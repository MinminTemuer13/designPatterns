package org.example;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Shape> prototypeRegistry = new HashMap<>();

        Circle c = new Circle();
        c.setRadius(1.5);
        c.setX(1);
        c.setY(1);
        c.setColor(Color.Red);
        prototypeRegistry.put("Circle", c);

        Rectangle r = new Rectangle();
        r.setLength(2.5);
        r.setX(2);
        r.setY(2);
        r.setColor(Color.Green);
        prototypeRegistry.put("Rectangle", r);

        Circle c2 = new Circle();
        c2.setRadius(4);
        c2.setX(3);
        c2.setY(5);
        c2.setColor(Color.Blue);
        prototypeRegistry.put("Circle2", c2);

        // 想用哪个取那个
        Shape shape1 = prototypeRegistry.get("Rectangle").cloneShape();
        System.out.println(shape1);

        // 也可以使用Array一次获取多个
    }
}