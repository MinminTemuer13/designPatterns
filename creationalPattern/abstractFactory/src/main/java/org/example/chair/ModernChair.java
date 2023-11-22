package org.example.chair;

import org.example.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair has 4 legs.");
    }

    @Override
    public void sitOn(String name) {
        System.out.println(name + "sit on this modern chair.");
    }
}
