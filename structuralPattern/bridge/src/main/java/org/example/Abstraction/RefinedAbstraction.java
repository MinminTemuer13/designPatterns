package org.example.Abstraction;

import org.example.Implementation.Implementation;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void feature1() {
        System.out.println("Need no nothing in this refined version.");
    }

    @Override
    public void feature2(Integer n, String s) {
        super.feature1();
        super.feature2(n, s);
    }
}
