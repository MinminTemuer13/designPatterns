package org.example.builders;

import org.example.Builder;
import org.example.plainObjects.Computer;
import org.example.plainObjects.Engine;
import org.example.plainObjects.Manual;

public class CarManualBuilder implements Builder {

    Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(Integer num) {
        manual.appendDescription(String.format("this car has %s seats, " ,num));
    }

    @Override
    public void setEngine(Engine engine) {
        manual.appendDescription(engine.getClass().toString());
    }

    @Override
    public void setComputer(Computer computer) {
        manual.appendDescription(computer.getClass().toString());
    }

    @Override
    public void setGPS(String gps) {
        manual.appendDescription(String.format(" and %s." ,gps));
    }

    public Manual getResult() {
        return manual;
    }
}
