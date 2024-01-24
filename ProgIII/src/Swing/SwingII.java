package Swing;

import javax.swing.*;
import java.awt.*;

public class SwingII {

    public static void main(String[] args) {
        VentanaConImagen v = new VentanaConImagen();
        v.setVisible(true);
    }
}

class VentanaConImagen extends JFrame {

    public VentanaConImagen() {
        setTitle("Ventana con Imagen");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cargar la imagen
        ImageIcon icono = new ImageIcon("/Users/ikerariasmartinez/git/repository/ProgIII/src/Swing/Icono.jpeg");
        Image imagen = icono.getImage();

        // Crear un panel para mostrar la imagen
        JPanel pnlImagen = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Set the panel as the content pane of the JFrame
        setContentPane(pnlImagen);
    }
}

	


