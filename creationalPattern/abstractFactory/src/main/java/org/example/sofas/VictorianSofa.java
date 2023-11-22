package org.example.sofas;

import org.example.interfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sit on this victorian sofa");
    }
}
