package org.example.builders;

import org.example.Builder;
import org.example.plainObjects.Car;
import org.example.plainObjects.Computer;
import org.example.plainObjects.Engine;

public class CarBuilder implements Builder {

    Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(Integer num) {
        car.setSeats(num);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setComputer(Computer computer) {
        car.setComputer(computer);
    }

    @Override
    public void setGPS(String gps) {
        car.setGPS(gps);
    }

    public Car getResult() {
        return car;
    }
}
