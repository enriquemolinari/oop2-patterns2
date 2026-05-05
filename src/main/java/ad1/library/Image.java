package ad1.library;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Image {

    public static final int IMAGE_WIDTH = 200;
    public static final int IMAGE_HEIGHT = 210;
    private final java.awt.Image i;
    private final int x;
    private final int y;

    public Image(int x, int y, String fileName) {
        this.x = x;
        this.y = y;
        var url = this.getClass().getClassLoader().getResource(fileName);
        assertImagenFound(fileName, url);
        try {
            // Carga sincrona para evitar repaints forzados mientras llega la imagen
            var loaded = ImageIO.read(url);
            if (loaded == null) {
                throw new IllegalArgumentException("Formato de imagen no soportado: " + fileName);
            }
            this.i = loaded;
        } catch (IOException e) {
            throw new IllegalArgumentException("No se pudo cargar la imagen: " + fileName, e);
        }
    }

    public void show(Graphics g) {
        g.drawImage(i, this.x, this.y, IMAGE_WIDTH, IMAGE_HEIGHT, null);
    }

    private void assertImagenFound(String fileName, URL url) {
        if (url == null) {
            throw new IllegalArgumentException("No se encontro el recurso: " + fileName);
        }
    }
}
