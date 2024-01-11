package org.example.sofas;

import org.example.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sit on this modern sofa");
    }
}
