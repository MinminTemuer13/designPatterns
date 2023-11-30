package org.example;

import lombok.AllArgsConstructor;
import org.example.dataStructure.Data;
import org.example.dataStructure.Result;
import org.example.dataStructure.SpecialData;

@AllArgsConstructor
public class Adapter implements ClientInterface{

    private Service service;

    @Override
    public Result method(Data data) {
        SpecialData specialData = convert2ServiceFormat(data);
        return service.serviceMethod(specialData);
    }

    private SpecialData convert2ServiceFormat(Data data) {
        return new SpecialData(data.getNumber());
    }
}
