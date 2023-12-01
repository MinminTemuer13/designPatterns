package org.example;

import java.util.ArrayList;

public class Bag implements Purchasable{
    // final 表示不允许再更换引用
    private final ArrayList<Purchasable> purchasableList = new ArrayList<>();

    public void add(Purchasable purchasable) {
        purchasableList.add(purchasable);
    }

    @Override
    public Double getAccount() {
        double total = 0;
        for (Purchasable p :
                purchasableList) {
            total += p.getAccount();
        }
        return total + 0.2;
    }
}
