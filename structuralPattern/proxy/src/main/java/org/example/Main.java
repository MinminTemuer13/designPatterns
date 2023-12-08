package org.example;

public class Main {
    public static void main(String[] args) {
        MassImage massImage = new MassImage("hello/image/nano1.jpg");
        MassImageProxy massImageProxy = new MassImageProxy("hello/image/dwg2.jpg");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        massImage.display();
        massImageProxy.display();
    }
}