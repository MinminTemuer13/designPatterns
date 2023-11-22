package org.example.coffeeTables;

import org.example.interfaces.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void drinkCoffee() {
        System.out.println("drink a cup of modern coffee");
    }
}
