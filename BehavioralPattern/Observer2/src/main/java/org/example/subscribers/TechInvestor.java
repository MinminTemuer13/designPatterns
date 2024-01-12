package org.example.subscribers;

public class TechInvestor implements Economy, Technology{
    @Override
    public void update() {
        System.out.println("investing by high-tech");
    }
}
