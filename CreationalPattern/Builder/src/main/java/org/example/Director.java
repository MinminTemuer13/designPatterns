package org.example;

import org.example.plainObjects.AdvencedComputer;
import org.example.plainObjects.PlainComputer;
import org.example.plainObjects.PlainEngine;
import org.example.plainObjects.SportEngine;

public class Director {

    public void makeSUV(Builder builder) {
        builder.setSeats(6);
        builder.setEngine(new PlainEngine());
        builder.setComputer(new AdvencedComputer());
        builder.setGPS("Gaga");
    }

    public void makeSportCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setComputer(new PlainComputer());
        builder.setGPS("Yigasi");
    }
}
