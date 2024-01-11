package org.example;

public class MassImageProxy implements Image{
    private MassImage massImage;
    private final String imagePath;

    public MassImageProxy(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        if (massImage == null) {
            massImage = new MassImage(imagePath);
        }
        massImage.display();
    }
}
