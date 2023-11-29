package org.example;

public class SubClass1 extends SuperClass{
    private final String featureString;

    SubClass1(int n, String s) {
        super(n);
        featureString = s;
    }

    @Override
    public void readSomething() {
        System.out.println(this.featureString);
        System.out.println(featureString);
        System.out.println(this.getFeatureNum());
        System.out.println(super.getFeatureNum());
    }
}
