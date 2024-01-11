package org.example;

import org.example.dataStructure.Result;
import org.example.dataStructure.SpecialData;

public class Service {
    public Result serviceMethod(SpecialData specialData) {
        return new Result(specialData.getNumber());
    }
}
