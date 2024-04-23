package adapter1;

import adapter1.library.Image;

import java.awt.*;

public class ImageAdapter implements Figura {
    private Image image;

    public ImageAdapter(Image image) {
        this.image = image;
    }

    @Override
    public void dibujar(Graphics2D g2d) {
        image.show(g2d);
    }
}
