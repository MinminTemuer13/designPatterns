package org.example;

public class MassImage implements Image{
    private final String imagePath;

    public MassImage(String imagePath) {
        this.imagePath = imagePath;
        loadImage();
    }

    private void loadImage() {
        System.out.println("loading image " + imagePath);
    }

    @Override
    public void display() {
        System.out.println("Display image " + imagePath);
    }
}
