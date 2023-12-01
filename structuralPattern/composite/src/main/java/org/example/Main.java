package org.example;

public class Main {
    public static void main(String[] args) {
        Goods goodsA = new Goods(15);
        Goods goodsB = new Goods(5);
        Bag bagA = new Bag();
        bagA.add(goodsA);
        bagA.add(goodsB);

        Goods goodsC = new Goods(237);
        Bag bagB = new Bag();
        bagB.add(goodsC);

        Goods goodsD = new Goods(21);
        Bag bagC = new Bag();
        bagC.add(goodsD);
        bagC.add(bagA);

        Bag bagD = new Bag();
        bagD.add(bagB);
        bagD.add(bagC);

        System.out.println(bagD.getAccount());
    }
}