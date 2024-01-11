package org.example.handlers;

public class BaseHandler implements Handler {
    protected BaseHandler next;

    public void setNext(BaseHandler next) {
        this.next = next;
    }

    @Override
    public boolean handle(String request) {
        return false;
    }
}
