package org.example.furnitureFactories;

import org.example.chair.VictorianChair;
import org.example.coffeeTables.VictorianCoffeeTable;
import org.example.interfaces.Chair;
import org.example.interfaces.CoffeeTable;
import org.example.interfaces.FurnitureFactory;
import org.example.interfaces.Sofa;
import org.example.sofas.VictorianSofa;

public class victorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
