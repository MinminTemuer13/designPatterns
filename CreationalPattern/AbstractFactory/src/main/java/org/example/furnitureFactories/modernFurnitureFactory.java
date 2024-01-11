package org.example.furnitureFactories;

import org.example.chair.ModernChair;
import org.example.coffeeTables.ModernCoffeeTable;
import org.example.interfaces.Chair;
import org.example.interfaces.CoffeeTable;
import org.example.interfaces.FurnitureFactory;
import org.example.interfaces.Sofa;
import org.example.sofas.ModernSofa;

public class modernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
