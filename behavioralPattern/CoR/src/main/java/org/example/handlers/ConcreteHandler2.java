package org.example.handlers;

public class ConcreteHandler2 extends BaseHandler {
    @Override
    public boolean handle(String request) {
        if (request.equals("concrete2")) {
            System.out.println("Done in No2");
            return true;
        }
        else {
            return next != null && next.handle(request);
        }
    }
}
