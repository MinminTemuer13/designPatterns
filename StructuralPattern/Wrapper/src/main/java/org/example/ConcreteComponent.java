package org.example;

public class ConcreteComponent implements Component{
    @Override
    public void function() {
        System.out.println("Execute in Concrete Component");
    }
}
