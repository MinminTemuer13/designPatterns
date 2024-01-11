package org.example;

import org.example.interfaces.Chair;
import org.example.interfaces.CoffeeTable;
import org.example.interfaces.FurnitureFactory;
import org.example.interfaces.Sofa;

public class Application {

    private final FurnitureFactory furnitureFactory;

    private Chair chair;

    private CoffeeTable coffeeTable;

    private Sofa sofa;

    public Application(FurnitureFactory furnitureFactory1) {
        furnitureFactory = furnitureFactory1;
    }

    public void whatAFurniture() {
        createFurniture();
        chair.hasLegs();
        chair.sitOn("Minmin Temuer");
        coffeeTable.drinkCoffee();
        sofa.sitOn();
    }

    private void createFurniture() {
        chair = furnitureFactory.createChair();
        coffeeTable = furnitureFactory.createCoffeeTable();
        sofa = furnitureFactory.createSofa();
    }
}
