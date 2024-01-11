package org.example;

import org.example.dataStructure.Data;
import org.example.dataStructure.Result;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(2);

        Service service = new Service();
        Adapter adapter = new Adapter(service);

        Result result = adapter.method(data);

        System.out.println(result);
    }
}