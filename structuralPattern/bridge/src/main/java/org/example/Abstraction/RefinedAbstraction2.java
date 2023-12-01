package org.example.Abstraction;

import org.example.Implementation.Implementation;

public class RefinedAbstraction2 extends Abstraction{
    public RefinedAbstraction2(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void feature1() {
        System.out.println("Do that actually in Refined Version 2.0");
        super.feature1();
    }

    @Override
    public void feature2(Integer n, String s) {
        super.feature2(n, s);
    }
}
