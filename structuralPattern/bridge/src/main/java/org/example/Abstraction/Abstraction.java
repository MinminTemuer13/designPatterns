package org.example.Abstraction;

import lombok.AllArgsConstructor;
import org.example.Implementation.Implementation;

@AllArgsConstructor
public class Abstraction {
    Implementation implementation;

    public void feature1() {
        implementation.method1();
    }

    public void feature2(Integer n, String s) {
        implementation.method2(n);
        implementation.method3(s);
    }
}
