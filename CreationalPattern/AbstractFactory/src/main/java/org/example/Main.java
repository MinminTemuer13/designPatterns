package org.example;

import org.example.furnitureFactories.modernFurnitureFactory;
import org.example.furnitureFactories.victorianFurnitureFactory;
import org.example.interfaces.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new victorianFurnitureFactory();

        Application application = new Application(furnitureFactory);

        application.whatAFurniture();
    }
}