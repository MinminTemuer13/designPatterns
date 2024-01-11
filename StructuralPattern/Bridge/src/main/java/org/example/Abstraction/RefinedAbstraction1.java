package org.example.Abstraction;

import org.example.Implementation.Implementation;

public class RefinedAbstraction1 extends Abstraction{
    public RefinedAbstraction1(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void feature1() {
        System.out.println("Do that actually in Refined Version 1.0");
        super.feature1();
    }

    @Override
    public void feature2(Integer n, String s) {
        super.feature2(n, s);
    }

    public void feature3(Integer n) {
        System.out.println("feature3: " + n);
    }
}
