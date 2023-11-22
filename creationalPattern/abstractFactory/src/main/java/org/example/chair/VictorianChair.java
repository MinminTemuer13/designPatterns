package org.example.chair;

import org.example.interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian chair has 4 legs.");
    }

    @Override
    public void sitOn(String name) {
        System.out.println(name + "sit on this victorian chair.");
    }
}
