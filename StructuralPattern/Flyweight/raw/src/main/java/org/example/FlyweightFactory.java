package org.example;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> flyweightMap;

    FlyweightFactory() {
        flyweightMap = new HashMap<>();
    }

    public Flyweight getFlyweight(String str) {
        Flyweight flyweight = flyweightMap.get(str);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(str);
            flyweightMap.put(str, flyweight);
            System.out.println("Create one more Flyweight: " + str);
        }

        return flyweight;
    }
}
