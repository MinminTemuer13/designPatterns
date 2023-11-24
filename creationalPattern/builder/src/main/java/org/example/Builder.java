package org.example;

import org.example.plainObjects.Computer;
import org.example.plainObjects.Engine;

public interface Builder {

    void reset();

    void setSeats(Integer num);

    void setEngine(Engine engine);

    void setComputer(Computer computer);

    void setGPS(String gps);
}
