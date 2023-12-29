package org.example.handlers;

import java.util.Objects;

public class ConcreteHandler1 extends BaseHandler {
    @Override
    public boolean handle(String request) {
        if (request.equals("concrete1")) {
            System.out.println("Done in No1");
            return true;
        }
        else {
            return next != null && next.handle(request);
        }
    }
}
