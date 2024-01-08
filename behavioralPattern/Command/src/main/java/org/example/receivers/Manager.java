package org.example.receivers;

public class Manager {
    private Copilot copilot;

    public Manager() {
    }

    public void setCopilot(Copilot copilot) {
        System.out.println("set a new copilot");
        this.copilot = copilot;
    }

    public Copilot getCopilot() {
        return copilot;
    }

    public void shutDown() {
        System.out.println("shut down copilot now");
        this.copilot = null;
    }
}
