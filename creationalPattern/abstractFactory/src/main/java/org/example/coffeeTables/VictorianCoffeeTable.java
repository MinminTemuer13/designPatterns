package org.example.coffeeTables;

import org.example.interfaces.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void drinkCoffee() {
        System.out.println("Victorian coffee");
    }
}
