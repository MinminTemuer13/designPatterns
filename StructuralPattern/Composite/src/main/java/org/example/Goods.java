package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Goods implements Purchasable{
    private double price;
    @Override
    public Double getAccount() {
        return price;
    }
}
