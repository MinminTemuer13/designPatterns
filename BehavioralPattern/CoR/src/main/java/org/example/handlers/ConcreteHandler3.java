package org.example.handlers;

public class ConcreteHandler3 extends BaseHandler {
    @Override
    public boolean handle(String request) {
        if (request.equals("concrete3")) {
            System.out.println("Done in No3");
            return true;
        }
        else {
            return next != null && next.handle(request);
        }
    }
}
