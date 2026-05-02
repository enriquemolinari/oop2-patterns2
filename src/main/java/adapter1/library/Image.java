package adapter1.library;

import java.awt.*;

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
        i = Toolkit.getDefaultToolkit().getImage(url);
    }

    public void show(Graphics g) {
        g.drawImage(i, this.x, this.y, IMAGE_WIDTH, IMAGE_HEIGHT, null);
    }
}
