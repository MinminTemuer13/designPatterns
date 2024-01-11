package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.CarManualBuilder;
import org.example.plainObjects.Car;
import org.example.plainObjects.Manual;

public class Main {
    public static void main(String[] args) {
//        CarBuilder carBuilder = new CarBuilder();
//        carBuilder.reset();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        carManualBuilder.reset();

        Director director = new Director();

        director.makeSUV(carManualBuilder);

        Manual result = carManualBuilder.getResult();
        System.out.println(result.toString());
    }
}