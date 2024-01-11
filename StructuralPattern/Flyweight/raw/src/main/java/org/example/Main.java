package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        List<String> strings = new ArrayList<>(Arrays.asList("Kanye", "Kendrick", "Higher", "Kanye", "Kendrick"));

        for (String str : strings) {
            Flyweight flyweight = factory.getFlyweight(str);
            Context context = new Context(1, flyweight);

            System.out.println(context);
        }

    }
}