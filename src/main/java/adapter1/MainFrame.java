package adapter1;

import adapter1.library.Image;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Dibujar Figuras");

        Canvas canvas = new Canvas();
        canvas.agregarFigura(new Linea(new Coordenada(50, 50), 200));
        canvas.agregarFigura(new Circulo(new Coordenada(200, 200), 50));
        canvas.agregarFigura(new Texto(new Coordenada(100, 300), "Hola Mundo"));
        // Instancio el adapter y le inyecto el adaptado
        canvas.agregarFigura(new ImageAdapter(new Image(200, 250, "g.png")));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        getContentPane().add(canvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
